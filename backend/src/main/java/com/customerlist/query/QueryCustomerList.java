package com.customerlist.query;

import org.apache.log4j.Logger;
import delicacy.common.KeyValuePair;
import delicacy.common.AbstractQuery;
import delicacy.common.GenericBase;
import delicacy.common.BaseCollection;
import delicacy.connection.ThreadConnection;
import com.customerlist.bean.BaseCustomerList;
import com.customerlist.bean.ConditionCustomerList;

public class QueryCustomerList extends AbstractQuery<BaseCustomerList, ConditionCustomerList>
{

	private static final Logger __logger = Logger.getLogger(QueryCustomerList.class);

	public QueryCustomerList() throws java.sql.SQLException 
	{
		setParameterNumber(1);
		setConnection(ThreadConnection.getConnection());
		setOrderByFields("cc.customer_id");
	}

	@Override
	public BaseCollection<BaseCustomerList> executeQuery( KeyValuePair[] replacements, ConditionCustomerList condition ) throws java.sql.SQLException {
		if(__queryConditions != null && __queryConditions.length > 0) return execute(replacements, condition);
		return executeQuery(replacements, 
				condition.getCustomerName()
			);
	}

	public BaseCollection<BaseCustomerList> runQuery( KeyValuePair[] replacements, ConditionCustomerList condition ) throws java.sql.SQLException {
		return runQuery(replacements, 
				condition.getCustomerName()
			);
	}

	public BaseCollection<BaseCustomerList> execute( KeyValuePair[] replacements, ConditionCustomerList condition ) throws java.sql.SQLException {
		if(__queryConditions == null || __queryConditions.length == 0) return executeQuery(replacements, condition);
		return execute(condition, replacements, 
				condition.getCustomerName()
			);
	}

	@Override
	public BaseCustomerList generateBase(Object[] __data) throws java.sql.SQLException {
		BaseCustomerList __base = new BaseCustomerList();
		int count = 0;
		Object val;
		if((val = __data[count++]) != null) __base.setCustomerId(GenericBase.__getInt(val));
		if((val = __data[count++]) != null) __base.setCustomerCode(GenericBase.__getString(val));
		if((val = __data[count++]) != null) __base.setLeadId(GenericBase.__getInt(val));
		if((val = __data[count++]) != null) __base.setEntityType(GenericBase.__getInt(val));
		if((val = __data[count++]) != null) __base.setEmployeeIdMaintainer(GenericBase.__getInt(val));
		if((val = __data[count++]) != null) __base.setCustomerName(GenericBase.__getString(val));
		if((val = __data[count++]) != null) __base.setLevel(GenericBase.__getInt(val));
		if((val = __data[count++]) != null) __base.setParentCustomerId(GenericBase.__getInt(val));
		if((val = __data[count++]) != null) __base.setIndustryId(GenericBase.__getInt(val));
		if((val = __data[count++]) != null) __base.setAreaProvince(GenericBase.__getInt(val));
		if((val = __data[count++]) != null) __base.setAreaCity(GenericBase.__getInt(val));
		if((val = __data[count++]) != null) __base.setAreaDistrict(GenericBase.__getInt(val));
		if((val = __data[count++]) != null) __base.setDateLatestActivity(GenericBase.__getDateFromSQL(val));
		if((val = __data[count++]) != null) __base.setEmployeeIdLatestFollowup(GenericBase.__getInt(val));
		if((val = __data[count++]) != null) __base.setDateCreated(GenericBase.__getDateFromSQL(val));
		if((val = __data[count++]) != null) __base.setEmployeeIdCreated(GenericBase.__getInt(val));
		if((val = __data[count++]) != null) __base.setDateUpdated(GenericBase.__getDateFromSQL(val));
		if((val = __data[count++]) != null) __base.setEmployeeIdUpdated(GenericBase.__getInt(val));
		if((val = __data[count++]) != null) __base.setDepartmentId(GenericBase.__getInt(val));
		if((val = __data[count++]) != null) __base.setFlagLocked(GenericBase.__getBoolean(val));
		if((val = __data[count++]) != null) __base.setFlagIndustrialCommercialRegistered(GenericBase.__getBoolean(val));
		if((val = __data[count++]) != null) __base.setFlagNoDisturb(GenericBase.__getBoolean(val));
		if((val = __data[count++]) != null) __base.setDateLatestVisit(GenericBase.__getDateFromSQL(val));
		if((val = __data[count++]) != null) __base.setDaycountNotVisited(GenericBase.__getInt(val));
		if((val = __data[count++]) != null) __base.setDetailedAddress(GenericBase.__getString(val));
		if((val = __data[count++]) != null) __base.setPostcode(GenericBase.__getString(val));
		if((val = __data[count++]) != null) __base.setTelephone(GenericBase.__getString(val));
		if((val = __data[count++]) != null) __base.setFax(GenericBase.__getString(val));
		if((val = __data[count++]) != null) __base.setCompanyWebsiteLink(GenericBase.__getString(val));
		if((val = __data[count++]) != null) __base.setWeibo(GenericBase.__getString(val));
		if((val = __data[count++]) != null) __base.setNumberEmployees(GenericBase.__getInt(val));
		if((val = __data[count++]) != null) __base.setAnnualRevenue(GenericBase.__getInt(val));
		if((val = __data[count++]) != null) __base.setMemo(GenericBase.__getString(val));
		return __base;
	}

	@Override
	public int setStatementParameters(int count, java.lang.Object ... args) throws java.sql.SQLException {

		int index = 0;
		for(int ii = 0; ii < args.length; ii++){
			if(args[ii] == null) continue;
			index++;
			__logger.info(String.format("%1$s = [%2$s]", fieldNames[ii], args[ii]));
		}
		if( index > 0 ) __logger.info("=================================================");
		if(args[0] != null) __statement.setString(count++, GenericBase.__getString(args[0]));
		return count;
	}

	@Override
	public String getSQLText() {
		return __SQLText;
	}

	@Override
	public String getOriginalSQLText() {
		return __originalSQL;
	}

	@Override
	public String[] getQueryStringArray()  {
		return __queryConditions;
	}

	@Override
	public String getFieldList(){
		return RESULTSETFIELDLIST;
	}

	@Override
	public String[] getConditionNames(){
		return fieldNames;
	}

	private final static String __SQLText = "select cc.customer_id, cc.customer_code, cc.lead_id, cc.entity_type, cc.employee_id_maintainer, cc.customer_name, cc.level, cc.parent_customer_id, cc.industry_id, cc.area_province, cc.area_city, cc.area_district, cc.date_latest_activity, cc.employee_id_latest_followup, cc.date_created, cc.employee_id_created, cc.date_updated, cc.employee_id_updated, cc.department_id, cc.flag_locked, cc.flag_industrial_commercial_registered, cc.flag_no_disturb, cc.date_latest_visit, cccc.contact_name like ?_address, cc.postcode, cc.telephone, cc.fax, cc.company_website_link, cc.weibo, cc.number_employees, cc.annual_revenue, cc.memo from crm_customers cc where cc.customer_name like @customer_name" ;
	private final static String __originalSQL = "select cc.customer_id, cc.customer_code, cc.lead_id, cc.entity_type, cc.employee_id_maintainer, cc.customer_name, cc.level, cc.parent_customer_id, cc.industry_id, cc.area_province, cc.area_city, cc.area_district, cc.date_latest_activity, cc.employee_id_latest_followup, cc.date_created, cc.employee_id_created, cc.date_updated, cc.employee_id_updated, cc.department_id, cc.flag_locked, cc.flag_industrial_commercial_registered, cc.flag_no_disturb, cc.date_latest_visit, cc.daycount_not_visited, cc.detailed_address, cc.postcode, cc.telephone, cc.fax, cc.company_website_link, cc.weibo, cc.number_employees, cc.annual_revenue, cc.memo from crm_customers cc where cc.customer_name like @customer_name";
	private final static String[] __queryConditions = {
		"[{\"fullCondition\": \"cc.contact_name like @contact_name\",\"startIndex\": 472,\"stopIndex\":505,\"variableNum\": 0,\"variableCount\": 0,\"isor\":false,\"hasVariable\":false,\"hasBracket\":false,\"isVariableFirst\":false,\"topLevel\":true,\"children\": [{\"fullCondition\": \"cc.contact_name like @contact_name\",\"fullFieldName\":\"cc.contact_name\",\"operationName\":\"like\",\"variableName\":\"contactName\",\"startIndex\": 472,\"stopIndex\":505,\"variableNum\": 0,\"variableCount\": 1,\"isor\":false,\"hasVariable\":true,\"hasBracket\":false,\"isVariableFirst\":false,\"topLevel\":false,\"children\": []}]}]"
	};
	private final static String RESULTSETFIELDLIST = "customer_id,customer_code,lead_id,entity_type,employee_id_maintainer,customer_name,level,parent_customer_id,industry_id,area_province,area_city,area_district,date_latest_activity,employee_id_latest_followup,date_created,employee_id_created,date_updated,employee_id_updated,department_id,flag_locked,flag_industrial_commercial_registered,flag_no_disturb,date_latest_visit,daycount_not_visited,detailed_address,postcode,telephone,fax,company_website_link,weibo,number_employees,annual_revenue,memo";
	private final static String[] fieldNames = { "customer_name"};
}
