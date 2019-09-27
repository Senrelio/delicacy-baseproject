package fix.db.dao;

import delicacy.common.AbstractTable;
import delicacy.common.GenericBase;
import fix.db.bean.BaseCrmContact;


public class CrmContact extends AbstractTable<BaseCrmContact>
{

	public CrmContact() throws java.sql.SQLException 
	{

		initColumnNames();
	}

	protected final void initColumnNames()  throws java.sql.SQLException {

		__columnCount          = 27;

		initTables();

		__tableName            = "crm_contacts";

		__key_columns          = new int[1];
		__key_columns[0] = 0;

		__column_names[0] = BaseCrmContact.CS_CONTACT_ID;
		__column_names[1] = BaseCrmContact.CS_EMPLOYEE_ID_MAINTAINER;
		__column_names[2] = BaseCrmContact.CS_ENTITY_TYPE;
		__column_names[3] = BaseCrmContact.CS_CONTACT_NAME;
		__column_names[4] = BaseCrmContact.CS_TELEPHONE;
		__column_names[5] = BaseCrmContact.CS_MOBILE;
		__column_names[6] = BaseCrmContact.CS_EMAIL;
		__column_names[7] = BaseCrmContact.CS_BIRTHDAY;
		__column_names[8] = BaseCrmContact.CS_DATE_LATEST_ACTIVITY;
		__column_names[9] = BaseCrmContact.CS_DATE_CREATED;
		__column_names[10] = BaseCrmContact.CS_EMPLOYEE_ID_CREATED;
		__column_names[11] = BaseCrmContact.CS_DATE_UPDATED;
		__column_names[12] = BaseCrmContact.CS_EMPLOYEE_ID_UPDATED;
		__column_names[13] = BaseCrmContact.CS_FLAG_LOCKED;
		__column_names[14] = BaseCrmContact.CS_FLAG_NO_DISTURB;
		__column_names[15] = BaseCrmContact.CS_CONTACT_ROLE;
		__column_names[16] = BaseCrmContact.CS_DEPARTMENT_ID;
		__column_names[17] = BaseCrmContact.CS_POSITION;
		__column_names[18] = BaseCrmContact.CS_WECHAT;
		__column_names[19] = BaseCrmContact.CS_WEIBO;
		__column_names[20] = BaseCrmContact.CS_AREA_PROVINCE;
		__column_names[21] = BaseCrmContact.CS_AREA_CITY;
		__column_names[22] = BaseCrmContact.CS_AREA_DISTRICT;
		__column_names[23] = BaseCrmContact.CS_DETAILED_ADDRESS;
		__column_names[24] = BaseCrmContact.CS_POSTCODE;
		__column_names[25] = BaseCrmContact.CS_GENDER;
		__column_names[26] = BaseCrmContact.CS_MEMO;

		resetSelectFlags() ;
		resetInsertFlags() ;
	}

	public void resetInsertFlags(){
		for(int i = 0; i < __columnCount; i ++ ) __insert_flags[i] = true;
		__insert_flags[0] = false;
		__serial_column = 0;
	}

	public void setPrimaryKeyFromBase(BaseCrmContact b) {
		clear();
		setContactIdClear(b.getContactId());
	}

	public boolean isPrimaryKeyNull() {
		return getContactId() == null;
	}

	@Override
	public BaseCrmContact generateBase(){
		BaseCrmContact b = new BaseCrmContact();
		setDataToBase(b);
		return b;
	}

	@Override
	public void setDataToBase(BaseCrmContact b){
		int count = 0; Object val;
		if((val = __current_data[count++]) != null) b.setContactId(GenericBase.__getInt(val));
		if((val = __current_data[count++]) != null) b.setEmployeeIdMaintainer(GenericBase.__getInt(val));
		if((val = __current_data[count++]) != null) b.setEntityType(GenericBase.__getInt(val));
		if((val = __current_data[count++]) != null) b.setContactName(GenericBase.__getString(val));
		if((val = __current_data[count++]) != null) b.setTelephone(GenericBase.__getString(val));
		if((val = __current_data[count++]) != null) b.setMobile(GenericBase.__getString(val));
		if((val = __current_data[count++]) != null) b.setEmail(GenericBase.__getString(val));
		if((val = __current_data[count++]) != null) b.setBirthday(GenericBase.__getDateFromSQL(val));
		if((val = __current_data[count++]) != null) b.setDateLatestActivity(GenericBase.__getDateFromSQL(val));
		if((val = __current_data[count++]) != null) b.setDateCreated(GenericBase.__getDateFromSQL(val));
		if((val = __current_data[count++]) != null) b.setEmployeeIdCreated(GenericBase.__getInt(val));
		if((val = __current_data[count++]) != null) b.setDateUpdated(GenericBase.__getDateFromSQL(val));
		if((val = __current_data[count++]) != null) b.setEmployeeIdUpdated(GenericBase.__getInt(val));
		if((val = __current_data[count++]) != null) b.setFlagLocked(GenericBase.__getBoolean(val));
		if((val = __current_data[count++]) != null) b.setFlagNoDisturb(GenericBase.__getBoolean(val));
		if((val = __current_data[count++]) != null) b.setContactRole(GenericBase.__getInt(val));
		if((val = __current_data[count++]) != null) b.setDepartmentId(GenericBase.__getInt(val));
		if((val = __current_data[count++]) != null) b.setPosition(GenericBase.__getString(val));
		if((val = __current_data[count++]) != null) b.setWechat(GenericBase.__getString(val));
		if((val = __current_data[count++]) != null) b.setWeibo(GenericBase.__getString(val));
		if((val = __current_data[count++]) != null) b.setAreaProvince(GenericBase.__getInt(val));
		if((val = __current_data[count++]) != null) b.setAreaCity(GenericBase.__getInt(val));
		if((val = __current_data[count++]) != null) b.setAreaDistrict(GenericBase.__getInt(val));
		if((val = __current_data[count++]) != null) b.setDetailedAddress(GenericBase.__getString(val));
		if((val = __current_data[count++]) != null) b.setPostcode(GenericBase.__getString(val));
		if((val = __current_data[count++]) != null) b.setGender(GenericBase.__getInt(val));
		if((val = __current_data[count++]) != null) b.setMemo(GenericBase.__getString(val));
	}

	@Override
	public void setBaseToBuffer(BaseCrmContact b, Object[] buff){
		int count = 0;
		buff[count++] = b.getContactId();
		buff[count++] = b.getEmployeeIdMaintainer();
		buff[count++] = b.getEntityType();
		buff[count++] = b.getContactName();
		buff[count++] = b.getTelephone();
		buff[count++] = b.getMobile();
		buff[count++] = b.getEmail();
		buff[count++] = generateTimestampFromDate(b.getBirthday());
		buff[count++] = generateTimestampFromDate(b.getDateLatestActivity());
		buff[count++] = generateTimestampFromDate(b.getDateCreated());
		buff[count++] = b.getEmployeeIdCreated();
		buff[count++] = generateTimestampFromDate(b.getDateUpdated());
		buff[count++] = b.getEmployeeIdUpdated();
		buff[count++] = b.getFlagLocked();
		buff[count++] = b.getFlagNoDisturb();
		buff[count++] = b.getContactRole();
		buff[count++] = b.getDepartmentId();
		buff[count++] = b.getPosition();
		buff[count++] = b.getWechat();
		buff[count++] = b.getWeibo();
		buff[count++] = b.getAreaProvince();
		buff[count++] = b.getAreaCity();
		buff[count++] = b.getAreaDistrict();
		buff[count++] = b.getDetailedAddress();
		buff[count++] = b.getPostcode();
		buff[count++] = b.getGender();
		buff[count++] = b.getMemo();
	}

	@Override
	public void setDataFromBase(BaseCrmContact b){
		if(b.getContactId() != null) setContactIdClear(b.getContactId());
		if(b.getEmployeeIdMaintainer() != null) setEmployeeIdMaintainer(b.getEmployeeIdMaintainer());
		if(b.getEntityType() != null) setEntityType(b.getEntityType());
		if(b.getContactName() != null) setContactName(b.getContactName());
		if(b.getTelephone() != null) setTelephone(b.getTelephone());
		if(b.getMobile() != null) setMobile(b.getMobile());
		if(b.getEmail() != null) setEmail(b.getEmail());
		if(b.getBirthday() != null) setBirthday(b.getBirthday());
		if(b.getDateLatestActivity() != null) setDateLatestActivity(b.getDateLatestActivity());
		if(b.getDateCreated() != null) setDateCreated(b.getDateCreated());
		if(b.getEmployeeIdCreated() != null) setEmployeeIdCreated(b.getEmployeeIdCreated());
		if(b.getDateUpdated() != null) setDateUpdated(b.getDateUpdated());
		if(b.getEmployeeIdUpdated() != null) setEmployeeIdUpdated(b.getEmployeeIdUpdated());
		if(b.getFlagLocked() != null) setFlagLocked(b.getFlagLocked());
		if(b.getFlagNoDisturb() != null) setFlagNoDisturb(b.getFlagNoDisturb());
		if(b.getContactRole() != null) setContactRole(b.getContactRole());
		if(b.getDepartmentId() != null) setDepartmentId(b.getDepartmentId());
		if(b.getPosition() != null) setPosition(b.getPosition());
		if(b.getWechat() != null) setWechat(b.getWechat());
		if(b.getWeibo() != null) setWeibo(b.getWeibo());
		if(b.getAreaProvince() != null) setAreaProvince(b.getAreaProvince());
		if(b.getAreaCity() != null) setAreaCity(b.getAreaCity());
		if(b.getAreaDistrict() != null) setAreaDistrict(b.getAreaDistrict());
		if(b.getDetailedAddress() != null) setDetailedAddress(b.getDetailedAddress());
		if(b.getPostcode() != null) setPostcode(b.getPostcode());
		if(b.getGender() != null) setGender(b.getGender());
		if(b.getMemo() != null) setMemo(b.getMemo());
	}

	@Override
	public BaseCrmContact generateBaseFromResultSet(java.sql.ResultSet sdr)  throws java.sql.SQLException {

		BaseCrmContact b = new BaseCrmContact();
		setQueryResultToBase(b, sdr);
		return b;
	}

	@Override
	public void setQueryResultToBase(BaseCrmContact __base, java.sql.ResultSet sdr ) throws java.sql.SQLException {
		int count = 1, index = 0;
		java.sql.ResultSetMetaData rsmd = sdr.getMetaData();
		int columnCount = rsmd.getColumnCount();
		Object val;
		if(__select_flags[index++] && count <= columnCount && (val = sdr.getObject(count++)) != null) __base.setContactId(GenericBase.__getInt(val));
		if(__select_flags[index++] && count <= columnCount && (val = sdr.getObject(count++)) != null) __base.setEmployeeIdMaintainer(GenericBase.__getInt(val));
		if(__select_flags[index++] && count <= columnCount && (val = sdr.getObject(count++)) != null) __base.setEntityType(GenericBase.__getInt(val));
		if(__select_flags[index++] && count <= columnCount && (val = sdr.getObject(count++)) != null) __base.setContactName(GenericBase.__getString(val));
		if(__select_flags[index++] && count <= columnCount && (val = sdr.getObject(count++)) != null) __base.setTelephone(GenericBase.__getString(val));
		if(__select_flags[index++] && count <= columnCount && (val = sdr.getObject(count++)) != null) __base.setMobile(GenericBase.__getString(val));
		if(__select_flags[index++] && count <= columnCount && (val = sdr.getObject(count++)) != null) __base.setEmail(GenericBase.__getString(val));
		if(__select_flags[index++] && count <= columnCount && (val = sdr.getObject(count++)) != null) __base.setBirthday(GenericBase.__getDateFromSQL(val));
		if(__select_flags[index++] && count <= columnCount && (val = sdr.getObject(count++)) != null) __base.setDateLatestActivity(GenericBase.__getDateFromSQL(val));
		if(__select_flags[index++] && count <= columnCount && (val = sdr.getObject(count++)) != null) __base.setDateCreated(GenericBase.__getDateFromSQL(val));
		if(__select_flags[index++] && count <= columnCount && (val = sdr.getObject(count++)) != null) __base.setEmployeeIdCreated(GenericBase.__getInt(val));
		if(__select_flags[index++] && count <= columnCount && (val = sdr.getObject(count++)) != null) __base.setDateUpdated(GenericBase.__getDateFromSQL(val));
		if(__select_flags[index++] && count <= columnCount && (val = sdr.getObject(count++)) != null) __base.setEmployeeIdUpdated(GenericBase.__getInt(val));
		if(__select_flags[index++] && count <= columnCount && (val = sdr.getObject(count++)) != null) __base.setFlagLocked(GenericBase.__getBoolean(val));
		if(__select_flags[index++] && count <= columnCount && (val = sdr.getObject(count++)) != null) __base.setFlagNoDisturb(GenericBase.__getBoolean(val));
		if(__select_flags[index++] && count <= columnCount && (val = sdr.getObject(count++)) != null) __base.setContactRole(GenericBase.__getInt(val));
		if(__select_flags[index++] && count <= columnCount && (val = sdr.getObject(count++)) != null) __base.setDepartmentId(GenericBase.__getInt(val));
		if(__select_flags[index++] && count <= columnCount && (val = sdr.getObject(count++)) != null) __base.setPosition(GenericBase.__getString(val));
		if(__select_flags[index++] && count <= columnCount && (val = sdr.getObject(count++)) != null) __base.setWechat(GenericBase.__getString(val));
		if(__select_flags[index++] && count <= columnCount && (val = sdr.getObject(count++)) != null) __base.setWeibo(GenericBase.__getString(val));
		if(__select_flags[index++] && count <= columnCount && (val = sdr.getObject(count++)) != null) __base.setAreaProvince(GenericBase.__getInt(val));
		if(__select_flags[index++] && count <= columnCount && (val = sdr.getObject(count++)) != null) __base.setAreaCity(GenericBase.__getInt(val));
		if(__select_flags[index++] && count <= columnCount && (val = sdr.getObject(count++)) != null) __base.setAreaDistrict(GenericBase.__getInt(val));
		if(__select_flags[index++] && count <= columnCount && (val = sdr.getObject(count++)) != null) __base.setDetailedAddress(GenericBase.__getString(val));
		if(__select_flags[index++] && count <= columnCount && (val = sdr.getObject(count++)) != null) __base.setPostcode(GenericBase.__getString(val));
		if(__select_flags[index++] && count <= columnCount && (val = sdr.getObject(count++)) != null) __base.setGender(GenericBase.__getInt(val));
		if(__select_flags[index++] && count <= columnCount && (val = sdr.getObject(count++)) != null) __base.setMemo(GenericBase.__getString(val));
	}

	public void setContactId(java.lang.Integer val) {
		setCurrentData(0, val);
	}

	public java.lang.Integer getContactId() {
		return GenericBase.__getInt(__current_data[0]);
	}

	public void setContactIdClear(java.lang.Integer val) {
		__backup_data[0] = __current_data[0] =  val;
		__modified_flags[0] = false;
	}

	public void setEmployeeIdMaintainer(java.lang.Integer val) {
		setCurrentData(1, val);
	}

	public java.lang.Integer getEmployeeIdMaintainer() {
		return GenericBase.__getInt(__current_data[1]);
	}

	public void setEntityType(java.lang.Integer val) {
		setCurrentData(2, val);
	}

	public java.lang.Integer getEntityType() {
		return GenericBase.__getInt(__current_data[2]);
	}

	public void setContactName(java.lang.String val) {
		setCurrentData(3, val);
	}

	public java.lang.String getContactName() {
		return GenericBase.__getString(__current_data[3]);
	}

	public void setTelephone(java.lang.String val) {
		setCurrentData(4, val);
	}

	public java.lang.String getTelephone() {
		return GenericBase.__getString(__current_data[4]);
	}

	public void setMobile(java.lang.String val) {
		setCurrentData(5, val);
	}

	public java.lang.String getMobile() {
		return GenericBase.__getString(__current_data[5]);
	}

	public void setEmail(java.lang.String val) {
		setCurrentData(6, val);
	}

	public java.lang.String getEmail() {
		return GenericBase.__getString(__current_data[6]);
	}

	public void setBirthday(java.util.Date val) {
		setCurrentData(7, generateTimestampFromDate(val));
	}

	public java.util.Date getBirthday() {
		return GenericBase.__getDateFromSQL(__current_data[7]);
	}

	public void setDateLatestActivity(java.util.Date val) {
		setCurrentData(8, generateTimestampFromDate(val));
	}

	public java.util.Date getDateLatestActivity() {
		return GenericBase.__getDateFromSQL(__current_data[8]);
	}

	public void setDateCreated(java.util.Date val) {
		setCurrentData(9, generateTimestampFromDate(val));
	}

	public java.util.Date getDateCreated() {
		return GenericBase.__getDateFromSQL(__current_data[9]);
	}

	public void setEmployeeIdCreated(java.lang.Integer val) {
		setCurrentData(10, val);
	}

	public java.lang.Integer getEmployeeIdCreated() {
		return GenericBase.__getInt(__current_data[10]);
	}

	public void setDateUpdated(java.util.Date val) {
		setCurrentData(11, generateTimestampFromDate(val));
	}

	public java.util.Date getDateUpdated() {
		return GenericBase.__getDateFromSQL(__current_data[11]);
	}

	public void setEmployeeIdUpdated(java.lang.Integer val) {
		setCurrentData(12, val);
	}

	public java.lang.Integer getEmployeeIdUpdated() {
		return GenericBase.__getInt(__current_data[12]);
	}

	public void setFlagLocked(java.lang.Boolean val) {
		setCurrentData(13, val);
	}

	public java.lang.Boolean getFlagLocked() {
		return GenericBase.__getBoolean(__current_data[13]);
	}

	public void setFlagNoDisturb(java.lang.Boolean val) {
		setCurrentData(14, val);
	}

	public java.lang.Boolean getFlagNoDisturb() {
		return GenericBase.__getBoolean(__current_data[14]);
	}

	public void setContactRole(java.lang.Integer val) {
		setCurrentData(15, val);
	}

	public java.lang.Integer getContactRole() {
		return GenericBase.__getInt(__current_data[15]);
	}

	public void setDepartmentId(java.lang.Integer val) {
		setCurrentData(16, val);
	}

	public java.lang.Integer getDepartmentId() {
		return GenericBase.__getInt(__current_data[16]);
	}

	public void setPosition(java.lang.String val) {
		setCurrentData(17, val);
	}

	public java.lang.String getPosition() {
		return GenericBase.__getString(__current_data[17]);
	}

	public void setWechat(java.lang.String val) {
		setCurrentData(18, val);
	}

	public java.lang.String getWechat() {
		return GenericBase.__getString(__current_data[18]);
	}

	public void setWeibo(java.lang.String val) {
		setCurrentData(19, val);
	}

	public java.lang.String getWeibo() {
		return GenericBase.__getString(__current_data[19]);
	}

	public void setAreaProvince(java.lang.Integer val) {
		setCurrentData(20, val);
	}

	public java.lang.Integer getAreaProvince() {
		return GenericBase.__getInt(__current_data[20]);
	}

	public void setAreaCity(java.lang.Integer val) {
		setCurrentData(21, val);
	}

	public java.lang.Integer getAreaCity() {
		return GenericBase.__getInt(__current_data[21]);
	}

	public void setAreaDistrict(java.lang.Integer val) {
		setCurrentData(22, val);
	}

	public java.lang.Integer getAreaDistrict() {
		return GenericBase.__getInt(__current_data[22]);
	}

	public void setDetailedAddress(java.lang.String val) {
		setCurrentData(23, val);
	}

	public java.lang.String getDetailedAddress() {
		return GenericBase.__getString(__current_data[23]);
	}

	public void setPostcode(java.lang.String val) {
		setCurrentData(24, val);
	}

	public java.lang.String getPostcode() {
		return GenericBase.__getString(__current_data[24]);
	}

	public void setGender(java.lang.Integer val) {
		setCurrentData(25, val);
	}

	public java.lang.Integer getGender() {
		return GenericBase.__getInt(__current_data[25]);
	}

	public void setMemo(java.lang.String val) {
		setCurrentData(26, val);
	}

	public java.lang.String getMemo() {
		return GenericBase.__getString(__current_data[26]);
	}

	public void setConditionContactId(String op, java.lang.Integer val) {
		setConditionContactId(op, val, CONDITION_AND);
	}

	public void setConditionContactId(String op, java.lang.Integer val, String relation) {
		addCondition(0, op, relation, val);
	}

	public void setSelectContactId(boolean val) {
		__select_flags[0] = val;
	}

	public void setContactIdExpression(String val) {
		__dataExpressions[0] = val;
	}

	public void setConditionEmployeeIdMaintainer(String op, java.lang.Integer val) {
		setConditionEmployeeIdMaintainer(op, val, CONDITION_AND);
	}

	public void setConditionEmployeeIdMaintainer(String op, java.lang.Integer val, String relation) {
		addCondition(1, op, relation, val);
	}

	public void setSelectEmployeeIdMaintainer(boolean val) {
		__select_flags[1] = val;
	}

	public void setEmployeeIdMaintainerExpression(String val) {
		__dataExpressions[1] = val;
	}

	public void setConditionEntityType(String op, java.lang.Integer val) {
		setConditionEntityType(op, val, CONDITION_AND);
	}

	public void setConditionEntityType(String op, java.lang.Integer val, String relation) {
		addCondition(2, op, relation, val);
	}

	public void setSelectEntityType(boolean val) {
		__select_flags[2] = val;
	}

	public void setEntityTypeExpression(String val) {
		__dataExpressions[2] = val;
	}

	public void setConditionContactName(String op, java.lang.String val) {
		setConditionContactName(op, val, CONDITION_AND);
	}

	public void setConditionContactName(String op, java.lang.String val, String relation) {
		addCondition(3, op, relation, val);
	}

	public void setSelectContactName(boolean val) {
		__select_flags[3] = val;
	}

	public void setContactNameExpression(String val) {
		__dataExpressions[3] = val;
	}

	public void setConditionTelephone(String op, java.lang.String val) {
		setConditionTelephone(op, val, CONDITION_AND);
	}

	public void setConditionTelephone(String op, java.lang.String val, String relation) {
		addCondition(4, op, relation, val);
	}

	public void setSelectTelephone(boolean val) {
		__select_flags[4] = val;
	}

	public void setTelephoneExpression(String val) {
		__dataExpressions[4] = val;
	}

	public void setConditionMobile(String op, java.lang.String val) {
		setConditionMobile(op, val, CONDITION_AND);
	}

	public void setConditionMobile(String op, java.lang.String val, String relation) {
		addCondition(5, op, relation, val);
	}

	public void setSelectMobile(boolean val) {
		__select_flags[5] = val;
	}

	public void setMobileExpression(String val) {
		__dataExpressions[5] = val;
	}

	public void setConditionEmail(String op, java.lang.String val) {
		setConditionEmail(op, val, CONDITION_AND);
	}

	public void setConditionEmail(String op, java.lang.String val, String relation) {
		addCondition(6, op, relation, val);
	}

	public void setSelectEmail(boolean val) {
		__select_flags[6] = val;
	}

	public void setEmailExpression(String val) {
		__dataExpressions[6] = val;
	}

	public void setConditionBirthday(String op, java.util.Date val) {
		setConditionBirthday(op, val, CONDITION_AND);
	}

	public void setConditionBirthday(String op, java.util.Date val, String relation) {
		addCondition(7, op, relation, generateTimestampFromDate(val));
	}

	public void setSelectBirthday(boolean val) {
		__select_flags[7] = val;
	}

	public void setBirthdayExpression(String val) {
		__dataExpressions[7] = val;
	}

	public void setConditionDateLatestActivity(String op, java.util.Date val) {
		setConditionDateLatestActivity(op, val, CONDITION_AND);
	}

	public void setConditionDateLatestActivity(String op, java.util.Date val, String relation) {
		addCondition(8, op, relation, generateTimestampFromDate(val));
	}

	public void setSelectDateLatestActivity(boolean val) {
		__select_flags[8] = val;
	}

	public void setDateLatestActivityExpression(String val) {
		__dataExpressions[8] = val;
	}

	public void setConditionDateCreated(String op, java.util.Date val) {
		setConditionDateCreated(op, val, CONDITION_AND);
	}

	public void setConditionDateCreated(String op, java.util.Date val, String relation) {
		addCondition(9, op, relation, generateTimestampFromDate(val));
	}

	public void setSelectDateCreated(boolean val) {
		__select_flags[9] = val;
	}

	public void setDateCreatedExpression(String val) {
		__dataExpressions[9] = val;
	}

	public void setConditionEmployeeIdCreated(String op, java.lang.Integer val) {
		setConditionEmployeeIdCreated(op, val, CONDITION_AND);
	}

	public void setConditionEmployeeIdCreated(String op, java.lang.Integer val, String relation) {
		addCondition(10, op, relation, val);
	}

	public void setSelectEmployeeIdCreated(boolean val) {
		__select_flags[10] = val;
	}

	public void setEmployeeIdCreatedExpression(String val) {
		__dataExpressions[10] = val;
	}

	public void setConditionDateUpdated(String op, java.util.Date val) {
		setConditionDateUpdated(op, val, CONDITION_AND);
	}

	public void setConditionDateUpdated(String op, java.util.Date val, String relation) {
		addCondition(11, op, relation, generateTimestampFromDate(val));
	}

	public void setSelectDateUpdated(boolean val) {
		__select_flags[11] = val;
	}

	public void setDateUpdatedExpression(String val) {
		__dataExpressions[11] = val;
	}

	public void setConditionEmployeeIdUpdated(String op, java.lang.Integer val) {
		setConditionEmployeeIdUpdated(op, val, CONDITION_AND);
	}

	public void setConditionEmployeeIdUpdated(String op, java.lang.Integer val, String relation) {
		addCondition(12, op, relation, val);
	}

	public void setSelectEmployeeIdUpdated(boolean val) {
		__select_flags[12] = val;
	}

	public void setEmployeeIdUpdatedExpression(String val) {
		__dataExpressions[12] = val;
	}

	public void setConditionFlagLocked(String op, java.lang.Boolean val) {
		setConditionFlagLocked(op, val, CONDITION_AND);
	}

	public void setConditionFlagLocked(String op, java.lang.Boolean val, String relation) {
		addCondition(13, op, relation, val);
	}

	public void setSelectFlagLocked(boolean val) {
		__select_flags[13] = val;
	}

	public void setFlagLockedExpression(String val) {
		__dataExpressions[13] = val;
	}

	public void setConditionFlagNoDisturb(String op, java.lang.Boolean val) {
		setConditionFlagNoDisturb(op, val, CONDITION_AND);
	}

	public void setConditionFlagNoDisturb(String op, java.lang.Boolean val, String relation) {
		addCondition(14, op, relation, val);
	}

	public void setSelectFlagNoDisturb(boolean val) {
		__select_flags[14] = val;
	}

	public void setFlagNoDisturbExpression(String val) {
		__dataExpressions[14] = val;
	}

	public void setConditionContactRole(String op, java.lang.Integer val) {
		setConditionContactRole(op, val, CONDITION_AND);
	}

	public void setConditionContactRole(String op, java.lang.Integer val, String relation) {
		addCondition(15, op, relation, val);
	}

	public void setSelectContactRole(boolean val) {
		__select_flags[15] = val;
	}

	public void setContactRoleExpression(String val) {
		__dataExpressions[15] = val;
	}

	public void setConditionDepartmentId(String op, java.lang.Integer val) {
		setConditionDepartmentId(op, val, CONDITION_AND);
	}

	public void setConditionDepartmentId(String op, java.lang.Integer val, String relation) {
		addCondition(16, op, relation, val);
	}

	public void setSelectDepartmentId(boolean val) {
		__select_flags[16] = val;
	}

	public void setDepartmentIdExpression(String val) {
		__dataExpressions[16] = val;
	}

	public void setConditionPosition(String op, java.lang.String val) {
		setConditionPosition(op, val, CONDITION_AND);
	}

	public void setConditionPosition(String op, java.lang.String val, String relation) {
		addCondition(17, op, relation, val);
	}

	public void setSelectPosition(boolean val) {
		__select_flags[17] = val;
	}

	public void setPositionExpression(String val) {
		__dataExpressions[17] = val;
	}

	public void setConditionWechat(String op, java.lang.String val) {
		setConditionWechat(op, val, CONDITION_AND);
	}

	public void setConditionWechat(String op, java.lang.String val, String relation) {
		addCondition(18, op, relation, val);
	}

	public void setSelectWechat(boolean val) {
		__select_flags[18] = val;
	}

	public void setWechatExpression(String val) {
		__dataExpressions[18] = val;
	}

	public void setConditionWeibo(String op, java.lang.String val) {
		setConditionWeibo(op, val, CONDITION_AND);
	}

	public void setConditionWeibo(String op, java.lang.String val, String relation) {
		addCondition(19, op, relation, val);
	}

	public void setSelectWeibo(boolean val) {
		__select_flags[19] = val;
	}

	public void setWeiboExpression(String val) {
		__dataExpressions[19] = val;
	}

	public void setConditionAreaProvince(String op, java.lang.Integer val) {
		setConditionAreaProvince(op, val, CONDITION_AND);
	}

	public void setConditionAreaProvince(String op, java.lang.Integer val, String relation) {
		addCondition(20, op, relation, val);
	}

	public void setSelectAreaProvince(boolean val) {
		__select_flags[20] = val;
	}

	public void setAreaProvinceExpression(String val) {
		__dataExpressions[20] = val;
	}

	public void setConditionAreaCity(String op, java.lang.Integer val) {
		setConditionAreaCity(op, val, CONDITION_AND);
	}

	public void setConditionAreaCity(String op, java.lang.Integer val, String relation) {
		addCondition(21, op, relation, val);
	}

	public void setSelectAreaCity(boolean val) {
		__select_flags[21] = val;
	}

	public void setAreaCityExpression(String val) {
		__dataExpressions[21] = val;
	}

	public void setConditionAreaDistrict(String op, java.lang.Integer val) {
		setConditionAreaDistrict(op, val, CONDITION_AND);
	}

	public void setConditionAreaDistrict(String op, java.lang.Integer val, String relation) {
		addCondition(22, op, relation, val);
	}

	public void setSelectAreaDistrict(boolean val) {
		__select_flags[22] = val;
	}

	public void setAreaDistrictExpression(String val) {
		__dataExpressions[22] = val;
	}

	public void setConditionDetailedAddress(String op, java.lang.String val) {
		setConditionDetailedAddress(op, val, CONDITION_AND);
	}

	public void setConditionDetailedAddress(String op, java.lang.String val, String relation) {
		addCondition(23, op, relation, val);
	}

	public void setSelectDetailedAddress(boolean val) {
		__select_flags[23] = val;
	}

	public void setDetailedAddressExpression(String val) {
		__dataExpressions[23] = val;
	}

	public void setConditionPostcode(String op, java.lang.String val) {
		setConditionPostcode(op, val, CONDITION_AND);
	}

	public void setConditionPostcode(String op, java.lang.String val, String relation) {
		addCondition(24, op, relation, val);
	}

	public void setSelectPostcode(boolean val) {
		__select_flags[24] = val;
	}

	public void setPostcodeExpression(String val) {
		__dataExpressions[24] = val;
	}

	public void setConditionGender(String op, java.lang.Integer val) {
		setConditionGender(op, val, CONDITION_AND);
	}

	public void setConditionGender(String op, java.lang.Integer val, String relation) {
		addCondition(25, op, relation, val);
	}

	public void setSelectGender(boolean val) {
		__select_flags[25] = val;
	}

	public void setGenderExpression(String val) {
		__dataExpressions[25] = val;
	}

	public void setConditionMemo(String op, java.lang.String val) {
		setConditionMemo(op, val, CONDITION_AND);
	}

	public void setConditionMemo(String op, java.lang.String val, String relation) {
		addCondition(26, op, relation, val);
	}

	public void setSelectMemo(boolean val) {
		__select_flags[26] = val;
	}

	public void setMemoExpression(String val) {
		__dataExpressions[26] = val;
	}


}

