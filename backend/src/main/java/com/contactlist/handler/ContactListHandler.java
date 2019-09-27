package com.contactlist.handler;

import org.apache.log4j.Logger;
import com.contactlist.bean.BaseContactList;
import com.contactlist.bean.ConditionContactList;
import com.contactlist.query.QueryContactList;
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

public class ContactListHandler implements GenericQuery,  GenericDownloadProcessor {

	private static final Logger __logger = Logger.getLogger(ContactListHandler.class);

	public static BaseCollection<BaseContactList> executeQueryContactList(ConditionContactList c, KeyValuePair[] replacements ) throws Exception {
		QueryContactList dao = new QueryContactList();
		dao.setCurrentPage(c.getCurrentPage());
		dao.setPageLines(c.getPageLines());
		BaseCollection<BaseContactList> result = dao.execute( c.getKeyValues(), c) ;
		if(c.isIncludeDetail() && result.getRecordNumber() > 0){
			CrmContactsCustomer daoCrmContactsCustomer = new CrmContactsCustomer();
			for(BaseContactList bean : result.getCollections()){
				daoCrmContactsCustomer.setConditionContactsId("=", bean.getContactId());
				bean.setDetailCrmContactsCustomer(daoCrmContactsCustomer.conditionalLoad(null));
			}
		}
		return result;
	}

	@Override
	public String find(String creteria) throws Exception {
		ConditionContactList c = new ConditionContactList();
		c.setDataFromJSON(creteria);
		BaseCollection<BaseContactList> result = executeQueryContactList(c, c.getKeyValues());
		return result.toJSON(null);
	}

	@Override
	public void execute(String creteria, File downFile, HttpServletRequest request, HttpServletResponse response) throws Exception {
		BaseCollection<BaseContactList> result;
		ConditionContactList c = new ConditionContactList();
		c.setDataFromJSON(creteria);
		QueryContactList dao = new QueryContactList();
		dao.setCurrentPage(1);
		dao.setPageLines(1);
		result = dao.execute( c.getKeyValues(), c) ;
		if(result.getTotalLines() > GenericBase.MAX_EXPORT_LINES){
			throw new SQLException(String.format("Too many data to export : %1$d", result.getTotalLines()));
		}
		dao.setCurrentPage(0);
		result = dao.execute( c.getKeyValues(), c) ;
		try(PrintStream ps = new PrintStream(downFile, "GBK")){
			ps.println(BaseContactList.ALL_CAPTIONS);
			for(BaseContactList b : result.getCollections()){
				ps.println(b.toCSVString());
			}
		}
	}

	@Override
	public String getDownloadFileExtension() {
		return "csv";
	}

}


