package delicacy.servlet;


public class Processors extends AbstractProcessores{


	public void initTables() {
		DAOS.put("CrmCustomerWithC", "com.customerlist.handler.CrmCustomerWithCHandler");
		QUERIES.put("CustomerList", "com.customerlist.handler.CustomerListHandler");
		DAOS.put("CrmContactWithC", "com.contactlist.handler.CrmContactWithCHandler");
		QUERIES.put("ContactList", "com.contactlist.handler.ContactListHandler");
		PROCESSORS.put("LoginCheck2", "com.login.logincheck.LoginCheck2");
		PROCESSORS.put("LoginCheck", "com.login.logincheck.LoginCheck");
		PROCESSORS.put("GenerateFunctionTree", "com.mainfunction.query.GenerateMainFunctionTree");
		PROCESSORS.put("GenerateMainFunctionTree", "com.mainfunction.query.GenerateMainFunctionTree");
		PROCESSORS.put("TableProcess", "common.TableProcess");
		PROCESSORS.put("DomainValueProcess", "common.DomainValueProcess");
	}

}

