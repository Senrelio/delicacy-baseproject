package com.customerlist.handler;

import org.apache.log4j.Logger;
import com.customerlist.bean.BaseCustomerList;
import com.customerlist.bean.ConditionCustomerList;
import com.customerlist.query.QueryCustomerList;
import delicacy.common.KeyValuePair;
import delicacy.common.GenericQuery;
import delicacy.common.GenericDownloadProcessor;
import delicacy.common.GenericBase;
import java.io.File;
import java.io.PrintStream;
import java.sql.SQLException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import fix.db.bean.BaseCrmContactsCustomer;
import fix.db.dao.CrmContactsCustomer;
import delicacy.common.BaseCollection;

public class CustomerListHandler implements GenericQuery,  GenericDownloadProcessor {

	private static final Logger __logger = Logger.getLogger(CustomerListHandler.class);

	public static BaseCollection<BaseCustomerList> executeQueryCustomerList(ConditionCustomerList c, KeyValuePair[] replacements ) throws Exception {
		QueryCustomerList dao = new QueryCustomerList();
		dao.setCurrentPage(c.getCurrentPage());
		dao.setPageLines(c.getPageLines());
		BaseCollection<BaseCustomerList> result = dao.execute( c.getKeyValues(), c) ;
		if(c.isIncludeDetail() && result.getRecordNumber() > 0){
			CrmContactsCustomer daoCrmContactsCustomer = new CrmContactsCustomer();
			for(BaseCustomerList bean : result.getCollections()){
				daoCrmContactsCustomer.setConditionCustomersId("=", bean.getCustomerId());
				bean.setDetailCrmContactsCustomer(daoCrmContactsCustomer.conditionalLoad(null));
			}
		}
		return result;
	}

	@Override
	public String find(String creteria) throws Exception {
		ConditionCustomerList c = new ConditionCustomerList();
		c.setDataFromJSON(creteria);
		BaseCollection<BaseCustomerList> result = executeQueryCustomerList(c, c.getKeyValues());
		return result.toJSON(null);
	}

	@Override
	public void execute(String creteria, File downFile, HttpServletRequest request, HttpServletResponse response) throws Exception {
		BaseCollection<BaseCustomerList> result;
		ConditionCustomerList c = new ConditionCustomerList();
		c.setDataFromJSON(creteria);
		QueryCustomerList dao = new QueryCustomerList();
		dao.setCurrentPage(1);
		dao.setPageLines(1);
		result = dao.execute( c.getKeyValues(), c) ;
		if(result.getTotalLines() > GenericBase.MAX_EXPORT_LINES){
			throw new SQLException(String.format("Too many data to export : %1$d", result.getTotalLines()));
		}
		dao.setCurrentPage(0);
		result = dao.execute( c.getKeyValues(), c) ;
		try(PrintStream ps = new PrintStream(downFile, "GBK")){
			ps.println(BaseCustomerList.ALL_CAPTIONS);
			for(BaseCustomerList b : result.getCollections()){
				ps.println(b.toCSVString());
			}
		}
	}

	@Override
	public String getDownloadFileExtension() {
		return "csv";
	}

}


