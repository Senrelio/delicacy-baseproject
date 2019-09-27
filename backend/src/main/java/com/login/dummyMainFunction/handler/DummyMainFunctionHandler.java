package com.login.dummyMainFunction.handler;

import com.login.dummyMainFunction.bean.ConditionDummyMainFunction;
import com.login.dummyMainFunction.query.QueryDummyMainFunction;
import delicacy.common.*;
import fix.db.bean.BaseMainFunction;
import org.apache.log4j.Logger;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.io.PrintStream;
import java.sql.SQLException;

public class DummyMainFunctionHandler implements GenericQuery, GenericDownloadProcessor {

	private static final Logger __logger = Logger.getLogger(DummyMainFunctionHandler.class);

	public static BaseCollection<BaseMainFunction> executeQueryDummyMainFunction(ConditionDummyMainFunction c, KeyValuePair[] replacements ) throws Exception {
		QueryDummyMainFunction dao = new QueryDummyMainFunction();
		dao.setCurrentPage(c.getCurrentPage());
		dao.setPageLines(c.getPageLines());
		BaseCollection<BaseMainFunction> result = dao.execute( c.getKeyValues(), c) ;
		return result;
	}

	@Override
	public String find(String creteria) throws Exception {
		ConditionDummyMainFunction c = new ConditionDummyMainFunction();
		c.setDataFromJSON(creteria);
		BaseCollection<BaseMainFunction> result = executeQueryDummyMainFunction(c, c.getKeyValues());
		return result.toJSON(null);
	}

	@Override
	public void execute(String creteria, File downFile, HttpServletRequest request, HttpServletResponse response) throws Exception {
		BaseCollection<BaseMainFunction> result;
		ConditionDummyMainFunction c = new ConditionDummyMainFunction();
		c.setDataFromJSON(creteria);
		QueryDummyMainFunction dao = new QueryDummyMainFunction();
		dao.setCurrentPage(1);
		dao.setPageLines(1);
		result = dao.execute( c.getKeyValues(), c) ;
		if(result.getTotalLines() > GenericBase.MAX_EXPORT_LINES){
			throw new SQLException(String.format("Too many data to export : %1$d", result.getTotalLines()));
		}
		dao.setCurrentPage(0);
		result = dao.execute( c.getKeyValues(), c) ;
		try(PrintStream ps = new PrintStream(downFile, "GBK")){
			ps.println(BaseMainFunction.ALL_CAPTIONS);
			for(BaseMainFunction b : result.getCollections()){
				ps.println(b.toCSVString());
			}
		}
	}

	@Override
	public String getDownloadFileExtension() {
		return "csv";
	}

}


