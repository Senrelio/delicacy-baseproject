package com.contactlist.query;

import org.apache.log4j.Logger;
import delicacy.common.KeyValuePair;
import delicacy.common.AbstractQuery;
import delicacy.common.GenericBase;
import delicacy.common.BaseCollection;
import delicacy.connection.ThreadConnection;
import com.contactlist.bean.BaseContactList;
import com.contactlist.bean.ConditionContactList;

public class QueryContactList extends AbstractQuery<BaseContactList, ConditionContactList>
{

	private static final Logger __logger = Logger.getLogger(QueryContactList.class);

	public QueryContactList() throws java.sql.SQLException 
	{
		setParameterNumber(1);
		setConnection(ThreadConnection.getConnection());
		setOrderByFields("cc.contact_id");
	}

	@Override
	public BaseCollection<BaseContactList> executeQuery( KeyValuePair[] replacements, ConditionContactList condition ) throws java.sql.SQLException {
		if(__queryConditions != null && __queryConditions.length > 0) return execute(replacements, condition);
		return executeQuery(replacements, 
				condition.getContactName()
			);
	}

	public BaseCollection<BaseContactList> runQuery( KeyValuePair[] replacements, ConditionContactList condition ) throws java.sql.SQLException {
		return runQuery(replacements, 
				condition.getContactName()
			);
	}

	public BaseCollection<BaseContactList> execute( KeyValuePair[] replacements, ConditionContactList condition ) throws java.sql.SQLException {
		if(__queryConditions == null || __queryConditions.length == 0) return executeQuery(replacements, condition);
		return execute(condition, replacements, 
				condition.getContactName()
			);
	}

	@Override
	public BaseContactList generateBase(Object[] __data) throws java.sql.SQLException {
		BaseContactList __base = new BaseContactList();
		int count = 0;
		Object val;
		if((val = __data[count++]) != null) __base.setContactId(GenericBase.__getInt(val));
		if((val = __data[count++]) != null) __base.setEmployeeIdMaintainer(GenericBase.__getInt(val));
		if((val = __data[count++]) != null) __base.setEntityType(GenericBase.__getInt(val));
		if((val = __data[count++]) != null) __base.setContactName(GenericBase.__getString(val));
		if((val = __data[count++]) != null) __base.setTelephone(GenericBase.__getString(val));
		if((val = __data[count++]) != null) __base.setMobile(GenericBase.__getString(val));
		if((val = __data[count++]) != null) __base.setEmail(GenericBase.__getString(val));
		if((val = __data[count++]) != null) __base.setBirthday(GenericBase.__getDateFromSQL(val));
		if((val = __data[count++]) != null) __base.setDateLatestActivity(GenericBase.__getDateFromSQL(val));
		if((val = __data[count++]) != null) __base.setDateCreated(GenericBase.__getDateFromSQL(val));
		if((val = __data[count++]) != null) __base.setEmployeeIdCreated(GenericBase.__getInt(val));
		if((val = __data[count++]) != null) __base.setDateUpdated(GenericBase.__getDateFromSQL(val));
		if((val = __data[count++]) != null) __base.setEmployeeIdUpdated(GenericBase.__getInt(val));
		if((val = __data[count++]) != null) __base.setFlagLocked(GenericBase.__getBoolean(val));
		if((val = __data[count++]) != null) __base.setFlagNoDisturb(GenericBase.__getBoolean(val));
		if((val = __data[count++]) != null) __base.setContactRole(GenericBase.__getInt(val));
		if((val = __data[count++]) != null) __base.setDepartmentId(GenericBase.__getInt(val));
		if((val = __data[count++]) != null) __base.setPosition(GenericBase.__getString(val));
		if((val = __data[count++]) != null) __base.setWechat(GenericBase.__getString(val));
		if((val = __data[count++]) != null) __base.setWeibo(GenericBase.__getString(val));
		if((val = __data[count++]) != null) __base.setAreaProvince(GenericBase.__getInt(val));
		if((val = __data[count++]) != null) __base.setAreaCity(GenericBase.__getInt(val));
		if((val = __data[count++]) != null) __base.setAreaDistrict(GenericBase.__getInt(val));
		if((val = __data[count++]) != null) __base.setDetailedAddress(GenericBase.__getString(val));
		if((val = __data[count++]) != null) __base.setPostcode(GenericBase.__getString(val));
		if((val = __data[count++]) != null) __base.setGender(GenericBase.__getInt(val));
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

	private final static String __SQLText = "select cc.contact_id, cc.employee_id_maintainer, cc.entity_type, cc.contact_name, cc.telephone, cc.mobile, cc.email, cc.birthday, cc.date_latest_activity, cc.date_created, cc.employee_id_created, cc.date_updated, cc.employee_id_updated, cc.flag_locked, cc.flag_no_disturb, cc.contact_role, cc.department_id, cc.position, cc.wechat, cc.weibo, cc.area_province, cc.area_city, cc.area_district, cc.detailed_address, cc.postcode, cc.gender, cc.memo from crm_contacts cc where cc.contact_name like ?" ;
	private final static String __originalSQL = "select cc.contact_id, cc.employee_id_maintainer, cc.entity_type, cc.contact_name, cc.telephone, cc.mobile, cc.email, cc.birthday, cc.date_latest_activity, cc.date_created, cc.employee_id_created, cc.date_updated, cc.employee_id_updated, cc.flag_locked, cc.flag_no_disturb, cc.contact_role, cc.department_id, cc.position, cc.wechat, cc.weibo, cc.area_province, cc.area_city, cc.area_district, cc.detailed_address, cc.postcode, cc.gender, cc.memo from crm_contacts cc where cc.contact_name like @contact_name";
	private final static String[] __queryConditions = {
		"[{\"fullCondition\": \"cc.contact_name like @contact_name\",\"startIndex\": 472,\"stopIndex\":505,\"variableNum\": 0,\"variableCount\": 0,\"isor\":false,\"hasVariable\":false,\"hasBracket\":false,\"isVariableFirst\":false,\"topLevel\":true,\"children\": [{\"fullCondition\": \"cc.contact_name like @contact_name\",\"fullFieldName\":\"cc.contact_name\",\"operationName\":\"like\",\"variableName\":\"contactName\",\"startIndex\": 472,\"stopIndex\":505,\"variableNum\": 0,\"variableCount\": 1,\"isor\":false,\"hasVariable\":true,\"hasBracket\":false,\"isVariableFirst\":false,\"topLevel\":false,\"children\": []}]}]"
	};
	private final static String RESULTSETFIELDLIST = "contact_id,employee_id_maintainer,entity_type,contact_name,telephone,mobile,email,birthday,date_latest_activity,date_created,employee_id_created,date_updated,employee_id_updated,flag_locked,flag_no_disturb,contact_role,department_id,position,wechat,weibo,area_province,area_city,area_district,detailed_address,postcode,gender,memo";
	private final static String[] fieldNames = { "contact_name"};
}
