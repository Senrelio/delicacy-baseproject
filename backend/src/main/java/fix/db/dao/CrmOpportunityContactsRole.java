package fix.db.dao;

import delicacy.common.AbstractTable;
import delicacy.common.GenericBase;
import fix.db.bean.BaseCrmOpportunityContactsRole;


public class CrmOpportunityContactsRole extends AbstractTable<BaseCrmOpportunityContactsRole>
{

	public CrmOpportunityContactsRole() throws java.sql.SQLException 
	{

		initColumnNames();
	}

	protected final void initColumnNames()  throws java.sql.SQLException {

		__columnCount          = 21;

		initTables();

		__tableName            = "crm_opportunity_contacts_role";

		__key_columns          = new int[1];
		__key_columns[0] = 0;

		__column_names[0] = BaseCrmOpportunityContactsRole.CS_OPPORTUNITY_CONTACT_ROLE_ID;
		__column_names[1] = BaseCrmOpportunityContactsRole.CS_ENTITY_TYPE;
		__column_names[2] = BaseCrmOpportunityContactsRole.CS_OPPORTUNITY_ID;
		__column_names[3] = BaseCrmOpportunityContactsRole.CS_CONTACT_ID;
		__column_names[4] = BaseCrmOpportunityContactsRole.CS_FLAG_MAIN_CONTACT;
		__column_names[5] = BaseCrmOpportunityContactsRole.CS_CUSTOMER_ID;
		__column_names[6] = BaseCrmOpportunityContactsRole.CS_POSITION;
		__column_names[7] = BaseCrmOpportunityContactsRole.CS_TELEPHONE;
		__column_names[8] = BaseCrmOpportunityContactsRole.CS_MOBILE;
		__column_names[9] = BaseCrmOpportunityContactsRole.CS_EMAIL;
		__column_names[10] = BaseCrmOpportunityContactsRole.CS_CONTACT_ROLE_IN_OPPORTUNITY;
		__column_names[11] = BaseCrmOpportunityContactsRole.CS_CONTACT_STANDPOINT_IN_OPPORTUNITY;
		__column_names[12] = BaseCrmOpportunityContactsRole.CS_CONTACT_FAMILIARITY;
		__column_names[13] = BaseCrmOpportunityContactsRole.CS_CONTACT_ROLE_IN_CUSTOMER;
		__column_names[14] = BaseCrmOpportunityContactsRole.CS_IDENTIFIABLE_CHARACTERISTIC;
		__column_names[15] = BaseCrmOpportunityContactsRole.CS_EMPLOYEE_ID_MAINTAINER_AT_THAT_TIME;
		__column_names[16] = BaseCrmOpportunityContactsRole.CS_DEPARTMENT_ID;
		__column_names[17] = BaseCrmOpportunityContactsRole.CS_EMPLOYEE_ID_CREATED;
		__column_names[18] = BaseCrmOpportunityContactsRole.CS_DATE_CREATED;
		__column_names[19] = BaseCrmOpportunityContactsRole.CS_EMPLOYEE_ID_UPDATED;
		__column_names[20] = BaseCrmOpportunityContactsRole.CS_DATE_UPDATED;

		resetSelectFlags() ;
		resetInsertFlags() ;
	}

	public void resetInsertFlags(){
		for(int i = 0; i < __columnCount; i ++ ) __insert_flags[i] = true;
		__insert_flags[0] = false;
		__serial_column = 0;
	}

	public void setPrimaryKeyFromBase(BaseCrmOpportunityContactsRole b) {
		clear();
		setOpportunityContactRoleIdClear(b.getOpportunityContactRoleId());
	}

	public boolean isPrimaryKeyNull() {
		return getOpportunityContactRoleId() == null;
	}

	@Override
	public BaseCrmOpportunityContactsRole generateBase(){
		BaseCrmOpportunityContactsRole b = new BaseCrmOpportunityContactsRole();
		setDataToBase(b);
		return b;
	}

	@Override
	public void setDataToBase(BaseCrmOpportunityContactsRole b){
		int count = 0; Object val;
		if((val = __current_data[count++]) != null) b.setOpportunityContactRoleId(GenericBase.__getInt(val));
		if((val = __current_data[count++]) != null) b.setEntityType(GenericBase.__getInt(val));
		if((val = __current_data[count++]) != null) b.setOpportunityId(GenericBase.__getInt(val));
		if((val = __current_data[count++]) != null) b.setContactId(GenericBase.__getInt(val));
		if((val = __current_data[count++]) != null) b.setFlagMainContact(GenericBase.__getBoolean(val));
		if((val = __current_data[count++]) != null) b.setCustomerId(GenericBase.__getInt(val));
		if((val = __current_data[count++]) != null) b.setPosition(GenericBase.__getString(val));
		if((val = __current_data[count++]) != null) b.setTelephone(GenericBase.__getString(val));
		if((val = __current_data[count++]) != null) b.setMobile(GenericBase.__getString(val));
		if((val = __current_data[count++]) != null) b.setEmail(GenericBase.__getString(val));
		if((val = __current_data[count++]) != null) b.setContactRoleInOpportunity(GenericBase.__getInt(val));
		if((val = __current_data[count++]) != null) b.setContactStandpointInOpportunity(GenericBase.__getInt(val));
		if((val = __current_data[count++]) != null) b.setContactFamiliarity(GenericBase.__getInt(val));
		if((val = __current_data[count++]) != null) b.setContactRoleInCustomer(GenericBase.__getInt(val));
		if((val = __current_data[count++]) != null) b.setIdentifiableCharacteristic(GenericBase.__getInt(val));
		if((val = __current_data[count++]) != null) b.setEmployeeIdMaintainerAtThatTime(GenericBase.__getInt(val));
		if((val = __current_data[count++]) != null) b.setDepartmentId(GenericBase.__getInt(val));
		if((val = __current_data[count++]) != null) b.setEmployeeIdCreated(GenericBase.__getInt(val));
		if((val = __current_data[count++]) != null) b.setDateCreated(GenericBase.__getDateFromSQL(val));
		if((val = __current_data[count++]) != null) b.setEmployeeIdUpdated(GenericBase.__getInt(val));
		if((val = __current_data[count++]) != null) b.setDateUpdated(GenericBase.__getDateFromSQL(val));
	}

	@Override
	public void setBaseToBuffer(BaseCrmOpportunityContactsRole b, Object[] buff){
		int count = 0;
		buff[count++] = b.getOpportunityContactRoleId();
		buff[count++] = b.getEntityType();
		buff[count++] = b.getOpportunityId();
		buff[count++] = b.getContactId();
		buff[count++] = b.getFlagMainContact();
		buff[count++] = b.getCustomerId();
		buff[count++] = b.getPosition();
		buff[count++] = b.getTelephone();
		buff[count++] = b.getMobile();
		buff[count++] = b.getEmail();
		buff[count++] = b.getContactRoleInOpportunity();
		buff[count++] = b.getContactStandpointInOpportunity();
		buff[count++] = b.getContactFamiliarity();
		buff[count++] = b.getContactRoleInCustomer();
		buff[count++] = b.getIdentifiableCharacteristic();
		buff[count++] = b.getEmployeeIdMaintainerAtThatTime();
		buff[count++] = b.getDepartmentId();
		buff[count++] = b.getEmployeeIdCreated();
		buff[count++] = generateTimestampFromDate(b.getDateCreated());
		buff[count++] = b.getEmployeeIdUpdated();
		buff[count++] = generateTimestampFromDate(b.getDateUpdated());
	}

	@Override
	public void setDataFromBase(BaseCrmOpportunityContactsRole b){
		if(b.getOpportunityContactRoleId() != null) setOpportunityContactRoleIdClear(b.getOpportunityContactRoleId());
		if(b.getEntityType() != null) setEntityType(b.getEntityType());
		if(b.getOpportunityId() != null) setOpportunityId(b.getOpportunityId());
		if(b.getContactId() != null) setContactId(b.getContactId());
		if(b.getFlagMainContact() != null) setFlagMainContact(b.getFlagMainContact());
		if(b.getCustomerId() != null) setCustomerId(b.getCustomerId());
		if(b.getPosition() != null) setPosition(b.getPosition());
		if(b.getTelephone() != null) setTelephone(b.getTelephone());
		if(b.getMobile() != null) setMobile(b.getMobile());
		if(b.getEmail() != null) setEmail(b.getEmail());
		if(b.getContactRoleInOpportunity() != null) setContactRoleInOpportunity(b.getContactRoleInOpportunity());
		if(b.getContactStandpointInOpportunity() != null) setContactStandpointInOpportunity(b.getContactStandpointInOpportunity());
		if(b.getContactFamiliarity() != null) setContactFamiliarity(b.getContactFamiliarity());
		if(b.getContactRoleInCustomer() != null) setContactRoleInCustomer(b.getContactRoleInCustomer());
		if(b.getIdentifiableCharacteristic() != null) setIdentifiableCharacteristic(b.getIdentifiableCharacteristic());
		if(b.getEmployeeIdMaintainerAtThatTime() != null) setEmployeeIdMaintainerAtThatTime(b.getEmployeeIdMaintainerAtThatTime());
		if(b.getDepartmentId() != null) setDepartmentId(b.getDepartmentId());
		if(b.getEmployeeIdCreated() != null) setEmployeeIdCreated(b.getEmployeeIdCreated());
		if(b.getDateCreated() != null) setDateCreated(b.getDateCreated());
		if(b.getEmployeeIdUpdated() != null) setEmployeeIdUpdated(b.getEmployeeIdUpdated());
		if(b.getDateUpdated() != null) setDateUpdated(b.getDateUpdated());
	}

	@Override
	public BaseCrmOpportunityContactsRole generateBaseFromResultSet(java.sql.ResultSet sdr)  throws java.sql.SQLException {

		BaseCrmOpportunityContactsRole b = new BaseCrmOpportunityContactsRole();
		setQueryResultToBase(b, sdr);
		return b;
	}

	@Override
	public void setQueryResultToBase(BaseCrmOpportunityContactsRole __base, java.sql.ResultSet sdr ) throws java.sql.SQLException {
		int count = 1, index = 0;
		java.sql.ResultSetMetaData rsmd = sdr.getMetaData();
		int columnCount = rsmd.getColumnCount();
		Object val;
		if(__select_flags[index++] && count <= columnCount && (val = sdr.getObject(count++)) != null) __base.setOpportunityContactRoleId(GenericBase.__getInt(val));
		if(__select_flags[index++] && count <= columnCount && (val = sdr.getObject(count++)) != null) __base.setEntityType(GenericBase.__getInt(val));
		if(__select_flags[index++] && count <= columnCount && (val = sdr.getObject(count++)) != null) __base.setOpportunityId(GenericBase.__getInt(val));
		if(__select_flags[index++] && count <= columnCount && (val = sdr.getObject(count++)) != null) __base.setContactId(GenericBase.__getInt(val));
		if(__select_flags[index++] && count <= columnCount && (val = sdr.getObject(count++)) != null) __base.setFlagMainContact(GenericBase.__getBoolean(val));
		if(__select_flags[index++] && count <= columnCount && (val = sdr.getObject(count++)) != null) __base.setCustomerId(GenericBase.__getInt(val));
		if(__select_flags[index++] && count <= columnCount && (val = sdr.getObject(count++)) != null) __base.setPosition(GenericBase.__getString(val));
		if(__select_flags[index++] && count <= columnCount && (val = sdr.getObject(count++)) != null) __base.setTelephone(GenericBase.__getString(val));
		if(__select_flags[index++] && count <= columnCount && (val = sdr.getObject(count++)) != null) __base.setMobile(GenericBase.__getString(val));
		if(__select_flags[index++] && count <= columnCount && (val = sdr.getObject(count++)) != null) __base.setEmail(GenericBase.__getString(val));
		if(__select_flags[index++] && count <= columnCount && (val = sdr.getObject(count++)) != null) __base.setContactRoleInOpportunity(GenericBase.__getInt(val));
		if(__select_flags[index++] && count <= columnCount && (val = sdr.getObject(count++)) != null) __base.setContactStandpointInOpportunity(GenericBase.__getInt(val));
		if(__select_flags[index++] && count <= columnCount && (val = sdr.getObject(count++)) != null) __base.setContactFamiliarity(GenericBase.__getInt(val));
		if(__select_flags[index++] && count <= columnCount && (val = sdr.getObject(count++)) != null) __base.setContactRoleInCustomer(GenericBase.__getInt(val));
		if(__select_flags[index++] && count <= columnCount && (val = sdr.getObject(count++)) != null) __base.setIdentifiableCharacteristic(GenericBase.__getInt(val));
		if(__select_flags[index++] && count <= columnCount && (val = sdr.getObject(count++)) != null) __base.setEmployeeIdMaintainerAtThatTime(GenericBase.__getInt(val));
		if(__select_flags[index++] && count <= columnCount && (val = sdr.getObject(count++)) != null) __base.setDepartmentId(GenericBase.__getInt(val));
		if(__select_flags[index++] && count <= columnCount && (val = sdr.getObject(count++)) != null) __base.setEmployeeIdCreated(GenericBase.__getInt(val));
		if(__select_flags[index++] && count <= columnCount && (val = sdr.getObject(count++)) != null) __base.setDateCreated(GenericBase.__getDateFromSQL(val));
		if(__select_flags[index++] && count <= columnCount && (val = sdr.getObject(count++)) != null) __base.setEmployeeIdUpdated(GenericBase.__getInt(val));
		if(__select_flags[index++] && count <= columnCount && (val = sdr.getObject(count++)) != null) __base.setDateUpdated(GenericBase.__getDateFromSQL(val));
	}

	public void setOpportunityContactRoleId(java.lang.Integer val) {
		setCurrentData(0, val);
	}

	public java.lang.Integer getOpportunityContactRoleId() {
		return GenericBase.__getInt(__current_data[0]);
	}

	public void setOpportunityContactRoleIdClear(java.lang.Integer val) {
		__backup_data[0] = __current_data[0] =  val;
		__modified_flags[0] = false;
	}

	public void setEntityType(java.lang.Integer val) {
		setCurrentData(1, val);
	}

	public java.lang.Integer getEntityType() {
		return GenericBase.__getInt(__current_data[1]);
	}

	public void setOpportunityId(java.lang.Integer val) {
		setCurrentData(2, val);
	}

	public java.lang.Integer getOpportunityId() {
		return GenericBase.__getInt(__current_data[2]);
	}

	public void setContactId(java.lang.Integer val) {
		setCurrentData(3, val);
	}

	public java.lang.Integer getContactId() {
		return GenericBase.__getInt(__current_data[3]);
	}

	public void setFlagMainContact(java.lang.Boolean val) {
		setCurrentData(4, val);
	}

	public java.lang.Boolean getFlagMainContact() {
		return GenericBase.__getBoolean(__current_data[4]);
	}

	public void setCustomerId(java.lang.Integer val) {
		setCurrentData(5, val);
	}

	public java.lang.Integer getCustomerId() {
		return GenericBase.__getInt(__current_data[5]);
	}

	public void setPosition(java.lang.String val) {
		setCurrentData(6, val);
	}

	public java.lang.String getPosition() {
		return GenericBase.__getString(__current_data[6]);
	}

	public void setTelephone(java.lang.String val) {
		setCurrentData(7, val);
	}

	public java.lang.String getTelephone() {
		return GenericBase.__getString(__current_data[7]);
	}

	public void setMobile(java.lang.String val) {
		setCurrentData(8, val);
	}

	public java.lang.String getMobile() {
		return GenericBase.__getString(__current_data[8]);
	}

	public void setEmail(java.lang.String val) {
		setCurrentData(9, val);
	}

	public java.lang.String getEmail() {
		return GenericBase.__getString(__current_data[9]);
	}

	public void setContactRoleInOpportunity(java.lang.Integer val) {
		setCurrentData(10, val);
	}

	public java.lang.Integer getContactRoleInOpportunity() {
		return GenericBase.__getInt(__current_data[10]);
	}

	public void setContactStandpointInOpportunity(java.lang.Integer val) {
		setCurrentData(11, val);
	}

	public java.lang.Integer getContactStandpointInOpportunity() {
		return GenericBase.__getInt(__current_data[11]);
	}

	public void setContactFamiliarity(java.lang.Integer val) {
		setCurrentData(12, val);
	}

	public java.lang.Integer getContactFamiliarity() {
		return GenericBase.__getInt(__current_data[12]);
	}

	public void setContactRoleInCustomer(java.lang.Integer val) {
		setCurrentData(13, val);
	}

	public java.lang.Integer getContactRoleInCustomer() {
		return GenericBase.__getInt(__current_data[13]);
	}

	public void setIdentifiableCharacteristic(java.lang.Integer val) {
		setCurrentData(14, val);
	}

	public java.lang.Integer getIdentifiableCharacteristic() {
		return GenericBase.__getInt(__current_data[14]);
	}

	public void setEmployeeIdMaintainerAtThatTime(java.lang.Integer val) {
		setCurrentData(15, val);
	}

	public java.lang.Integer getEmployeeIdMaintainerAtThatTime() {
		return GenericBase.__getInt(__current_data[15]);
	}

	public void setDepartmentId(java.lang.Integer val) {
		setCurrentData(16, val);
	}

	public java.lang.Integer getDepartmentId() {
		return GenericBase.__getInt(__current_data[16]);
	}

	public void setEmployeeIdCreated(java.lang.Integer val) {
		setCurrentData(17, val);
	}

	public java.lang.Integer getEmployeeIdCreated() {
		return GenericBase.__getInt(__current_data[17]);
	}

	public void setDateCreated(java.util.Date val) {
		setCurrentData(18, generateTimestampFromDate(val));
	}

	public java.util.Date getDateCreated() {
		return GenericBase.__getDateFromSQL(__current_data[18]);
	}

	public void setEmployeeIdUpdated(java.lang.Integer val) {
		setCurrentData(19, val);
	}

	public java.lang.Integer getEmployeeIdUpdated() {
		return GenericBase.__getInt(__current_data[19]);
	}

	public void setDateUpdated(java.util.Date val) {
		setCurrentData(20, generateTimestampFromDate(val));
	}

	public java.util.Date getDateUpdated() {
		return GenericBase.__getDateFromSQL(__current_data[20]);
	}

	public void setConditionOpportunityContactRoleId(String op, java.lang.Integer val) {
		setConditionOpportunityContactRoleId(op, val, CONDITION_AND);
	}

	public void setConditionOpportunityContactRoleId(String op, java.lang.Integer val, String relation) {
		addCondition(0, op, relation, val);
	}

	public void setSelectOpportunityContactRoleId(boolean val) {
		__select_flags[0] = val;
	}

	public void setOpportunityContactRoleIdExpression(String val) {
		__dataExpressions[0] = val;
	}

	public void setConditionEntityType(String op, java.lang.Integer val) {
		setConditionEntityType(op, val, CONDITION_AND);
	}

	public void setConditionEntityType(String op, java.lang.Integer val, String relation) {
		addCondition(1, op, relation, val);
	}

	public void setSelectEntityType(boolean val) {
		__select_flags[1] = val;
	}

	public void setEntityTypeExpression(String val) {
		__dataExpressions[1] = val;
	}

	public void setConditionOpportunityId(String op, java.lang.Integer val) {
		setConditionOpportunityId(op, val, CONDITION_AND);
	}

	public void setConditionOpportunityId(String op, java.lang.Integer val, String relation) {
		addCondition(2, op, relation, val);
	}

	public void setSelectOpportunityId(boolean val) {
		__select_flags[2] = val;
	}

	public void setOpportunityIdExpression(String val) {
		__dataExpressions[2] = val;
	}

	public void setConditionContactId(String op, java.lang.Integer val) {
		setConditionContactId(op, val, CONDITION_AND);
	}

	public void setConditionContactId(String op, java.lang.Integer val, String relation) {
		addCondition(3, op, relation, val);
	}

	public void setSelectContactId(boolean val) {
		__select_flags[3] = val;
	}

	public void setContactIdExpression(String val) {
		__dataExpressions[3] = val;
	}

	public void setConditionFlagMainContact(String op, java.lang.Boolean val) {
		setConditionFlagMainContact(op, val, CONDITION_AND);
	}

	public void setConditionFlagMainContact(String op, java.lang.Boolean val, String relation) {
		addCondition(4, op, relation, val);
	}

	public void setSelectFlagMainContact(boolean val) {
		__select_flags[4] = val;
	}

	public void setFlagMainContactExpression(String val) {
		__dataExpressions[4] = val;
	}

	public void setConditionCustomerId(String op, java.lang.Integer val) {
		setConditionCustomerId(op, val, CONDITION_AND);
	}

	public void setConditionCustomerId(String op, java.lang.Integer val, String relation) {
		addCondition(5, op, relation, val);
	}

	public void setSelectCustomerId(boolean val) {
		__select_flags[5] = val;
	}

	public void setCustomerIdExpression(String val) {
		__dataExpressions[5] = val;
	}

	public void setConditionPosition(String op, java.lang.String val) {
		setConditionPosition(op, val, CONDITION_AND);
	}

	public void setConditionPosition(String op, java.lang.String val, String relation) {
		addCondition(6, op, relation, val);
	}

	public void setSelectPosition(boolean val) {
		__select_flags[6] = val;
	}

	public void setPositionExpression(String val) {
		__dataExpressions[6] = val;
	}

	public void setConditionTelephone(String op, java.lang.String val) {
		setConditionTelephone(op, val, CONDITION_AND);
	}

	public void setConditionTelephone(String op, java.lang.String val, String relation) {
		addCondition(7, op, relation, val);
	}

	public void setSelectTelephone(boolean val) {
		__select_flags[7] = val;
	}

	public void setTelephoneExpression(String val) {
		__dataExpressions[7] = val;
	}

	public void setConditionMobile(String op, java.lang.String val) {
		setConditionMobile(op, val, CONDITION_AND);
	}

	public void setConditionMobile(String op, java.lang.String val, String relation) {
		addCondition(8, op, relation, val);
	}

	public void setSelectMobile(boolean val) {
		__select_flags[8] = val;
	}

	public void setMobileExpression(String val) {
		__dataExpressions[8] = val;
	}

	public void setConditionEmail(String op, java.lang.String val) {
		setConditionEmail(op, val, CONDITION_AND);
	}

	public void setConditionEmail(String op, java.lang.String val, String relation) {
		addCondition(9, op, relation, val);
	}

	public void setSelectEmail(boolean val) {
		__select_flags[9] = val;
	}

	public void setEmailExpression(String val) {
		__dataExpressions[9] = val;
	}

	public void setConditionContactRoleInOpportunity(String op, java.lang.Integer val) {
		setConditionContactRoleInOpportunity(op, val, CONDITION_AND);
	}

	public void setConditionContactRoleInOpportunity(String op, java.lang.Integer val, String relation) {
		addCondition(10, op, relation, val);
	}

	public void setSelectContactRoleInOpportunity(boolean val) {
		__select_flags[10] = val;
	}

	public void setContactRoleInOpportunityExpression(String val) {
		__dataExpressions[10] = val;
	}

	public void setConditionContactStandpointInOpportunity(String op, java.lang.Integer val) {
		setConditionContactStandpointInOpportunity(op, val, CONDITION_AND);
	}

	public void setConditionContactStandpointInOpportunity(String op, java.lang.Integer val, String relation) {
		addCondition(11, op, relation, val);
	}

	public void setSelectContactStandpointInOpportunity(boolean val) {
		__select_flags[11] = val;
	}

	public void setContactStandpointInOpportunityExpression(String val) {
		__dataExpressions[11] = val;
	}

	public void setConditionContactFamiliarity(String op, java.lang.Integer val) {
		setConditionContactFamiliarity(op, val, CONDITION_AND);
	}

	public void setConditionContactFamiliarity(String op, java.lang.Integer val, String relation) {
		addCondition(12, op, relation, val);
	}

	public void setSelectContactFamiliarity(boolean val) {
		__select_flags[12] = val;
	}

	public void setContactFamiliarityExpression(String val) {
		__dataExpressions[12] = val;
	}

	public void setConditionContactRoleInCustomer(String op, java.lang.Integer val) {
		setConditionContactRoleInCustomer(op, val, CONDITION_AND);
	}

	public void setConditionContactRoleInCustomer(String op, java.lang.Integer val, String relation) {
		addCondition(13, op, relation, val);
	}

	public void setSelectContactRoleInCustomer(boolean val) {
		__select_flags[13] = val;
	}

	public void setContactRoleInCustomerExpression(String val) {
		__dataExpressions[13] = val;
	}

	public void setConditionIdentifiableCharacteristic(String op, java.lang.Integer val) {
		setConditionIdentifiableCharacteristic(op, val, CONDITION_AND);
	}

	public void setConditionIdentifiableCharacteristic(String op, java.lang.Integer val, String relation) {
		addCondition(14, op, relation, val);
	}

	public void setSelectIdentifiableCharacteristic(boolean val) {
		__select_flags[14] = val;
	}

	public void setIdentifiableCharacteristicExpression(String val) {
		__dataExpressions[14] = val;
	}

	public void setConditionEmployeeIdMaintainerAtThatTime(String op, java.lang.Integer val) {
		setConditionEmployeeIdMaintainerAtThatTime(op, val, CONDITION_AND);
	}

	public void setConditionEmployeeIdMaintainerAtThatTime(String op, java.lang.Integer val, String relation) {
		addCondition(15, op, relation, val);
	}

	public void setSelectEmployeeIdMaintainerAtThatTime(boolean val) {
		__select_flags[15] = val;
	}

	public void setEmployeeIdMaintainerAtThatTimeExpression(String val) {
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

	public void setConditionEmployeeIdCreated(String op, java.lang.Integer val) {
		setConditionEmployeeIdCreated(op, val, CONDITION_AND);
	}

	public void setConditionEmployeeIdCreated(String op, java.lang.Integer val, String relation) {
		addCondition(17, op, relation, val);
	}

	public void setSelectEmployeeIdCreated(boolean val) {
		__select_flags[17] = val;
	}

	public void setEmployeeIdCreatedExpression(String val) {
		__dataExpressions[17] = val;
	}

	public void setConditionDateCreated(String op, java.util.Date val) {
		setConditionDateCreated(op, val, CONDITION_AND);
	}

	public void setConditionDateCreated(String op, java.util.Date val, String relation) {
		addCondition(18, op, relation, generateTimestampFromDate(val));
	}

	public void setSelectDateCreated(boolean val) {
		__select_flags[18] = val;
	}

	public void setDateCreatedExpression(String val) {
		__dataExpressions[18] = val;
	}

	public void setConditionEmployeeIdUpdated(String op, java.lang.Integer val) {
		setConditionEmployeeIdUpdated(op, val, CONDITION_AND);
	}

	public void setConditionEmployeeIdUpdated(String op, java.lang.Integer val, String relation) {
		addCondition(19, op, relation, val);
	}

	public void setSelectEmployeeIdUpdated(boolean val) {
		__select_flags[19] = val;
	}

	public void setEmployeeIdUpdatedExpression(String val) {
		__dataExpressions[19] = val;
	}

	public void setConditionDateUpdated(String op, java.util.Date val) {
		setConditionDateUpdated(op, val, CONDITION_AND);
	}

	public void setConditionDateUpdated(String op, java.util.Date val, String relation) {
		addCondition(20, op, relation, generateTimestampFromDate(val));
	}

	public void setSelectDateUpdated(boolean val) {
		__select_flags[20] = val;
	}

	public void setDateUpdatedExpression(String val) {
		__dataExpressions[20] = val;
	}


}

