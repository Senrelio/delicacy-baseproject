package fix.db.dao;

import delicacy.common.AbstractTable;
import delicacy.common.GenericBase;
import fix.db.bean.BaseFinReceivableChange;


public class FinReceivableChange extends AbstractTable<BaseFinReceivableChange>
{

	public FinReceivableChange() throws java.sql.SQLException 
	{

		initColumnNames();
	}

	protected final void initColumnNames()  throws java.sql.SQLException {

		__columnCount          = 19;

		initTables();

		__tableName            = "fin_receivable_changes";

		__key_columns          = new int[1];
		__key_columns[0] = 0;

		__column_names[0] = BaseFinReceivableChange.CS_RECEIVABLE_CHANGE_ID;
		__column_names[1] = BaseFinReceivableChange.CS_RECEIVABLE_CHANGE_CODE;
		__column_names[2] = BaseFinReceivableChange.CS_CUSTOMER_ID;
		__column_names[3] = BaseFinReceivableChange.CS_STATUS_RECEIVABLE_CHANGE;
		__column_names[4] = BaseFinReceivableChange.CS_EMPLOYEE_ID_MAINTAINER;
		__column_names[5] = BaseFinReceivableChange.CS_DATE_CHANGED;
		__column_names[6] = BaseFinReceivableChange.CS_DEPARTMENT_ID;
		__column_names[7] = BaseFinReceivableChange.CS_ADDRESS_DELIVERY;
		__column_names[8] = BaseFinReceivableChange.CS_POSTCODE;
		__column_names[9] = BaseFinReceivableChange.CS_CONTACT_NAME;
		__column_names[10] = BaseFinReceivableChange.CS_CONTACT_MOBILE;
		__column_names[11] = BaseFinReceivableChange.CS_EMPLOYEE_ID_CREATED;
		__column_names[12] = BaseFinReceivableChange.CS_DATE_CREATED;
		__column_names[13] = BaseFinReceivableChange.CS_DESCRIPTION;
		__column_names[14] = BaseFinReceivableChange.CS_DATE_VALIDATION;
		__column_names[15] = BaseFinReceivableChange.CS_EMPLOYEE_ID_UPDATED;
		__column_names[16] = BaseFinReceivableChange.CS_DATE_INVALIDATION;
		__column_names[17] = BaseFinReceivableChange.CS_DATE_UPDATED;
		__column_names[18] = BaseFinReceivableChange.CS_REASON_INVALIDATION;

		resetSelectFlags() ;
		resetInsertFlags() ;
	}

	public void resetInsertFlags(){
		for(int i = 0; i < __columnCount; i ++ ) __insert_flags[i] = true;
		__insert_flags[0] = false;
		__serial_column = 0;
	}

	public void setPrimaryKeyFromBase(BaseFinReceivableChange b) {
		clear();
		setReceivableChangeIdClear(b.getReceivableChangeId());
	}

	public boolean isPrimaryKeyNull() {
		return getReceivableChangeId() == null;
	}

	@Override
	public BaseFinReceivableChange generateBase(){
		BaseFinReceivableChange b = new BaseFinReceivableChange();
		setDataToBase(b);
		return b;
	}

	@Override
	public void setDataToBase(BaseFinReceivableChange b){
		int count = 0; Object val;
		if((val = __current_data[count++]) != null) b.setReceivableChangeId(GenericBase.__getInt(val));
		if((val = __current_data[count++]) != null) b.setReceivableChangeCode(GenericBase.__getString(val));
		if((val = __current_data[count++]) != null) b.setCustomerId(GenericBase.__getInt(val));
		if((val = __current_data[count++]) != null) b.setStatusReceivableChange(GenericBase.__getInt(val));
		if((val = __current_data[count++]) != null) b.setEmployeeIdMaintainer(GenericBase.__getInt(val));
		if((val = __current_data[count++]) != null) b.setDateChanged(GenericBase.__getDateFromSQL(val));
		if((val = __current_data[count++]) != null) b.setDepartmentId(GenericBase.__getInt(val));
		if((val = __current_data[count++]) != null) b.setAddressDelivery(GenericBase.__getString(val));
		if((val = __current_data[count++]) != null) b.setPostcode(GenericBase.__getString(val));
		if((val = __current_data[count++]) != null) b.setContactName(GenericBase.__getString(val));
		if((val = __current_data[count++]) != null) b.setContactMobile(GenericBase.__getString(val));
		if((val = __current_data[count++]) != null) b.setEmployeeIdCreated(GenericBase.__getInt(val));
		if((val = __current_data[count++]) != null) b.setDateCreated(GenericBase.__getDateFromSQL(val));
		if((val = __current_data[count++]) != null) b.setDescription(GenericBase.__getString(val));
		if((val = __current_data[count++]) != null) b.setDateValidation(GenericBase.__getDateFromSQL(val));
		if((val = __current_data[count++]) != null) b.setEmployeeIdUpdated(GenericBase.__getInt(val));
		if((val = __current_data[count++]) != null) b.setDateInvalidation(GenericBase.__getDateFromSQL(val));
		if((val = __current_data[count++]) != null) b.setDateUpdated(GenericBase.__getDateFromSQL(val));
		if((val = __current_data[count++]) != null) b.setReasonInvalidation(GenericBase.__getInt(val));
	}

	@Override
	public void setBaseToBuffer(BaseFinReceivableChange b, Object[] buff){
		int count = 0;
		buff[count++] = b.getReceivableChangeId();
		buff[count++] = b.getReceivableChangeCode();
		buff[count++] = b.getCustomerId();
		buff[count++] = b.getStatusReceivableChange();
		buff[count++] = b.getEmployeeIdMaintainer();
		buff[count++] = generateTimestampFromDate(b.getDateChanged());
		buff[count++] = b.getDepartmentId();
		buff[count++] = b.getAddressDelivery();
		buff[count++] = b.getPostcode();
		buff[count++] = b.getContactName();
		buff[count++] = b.getContactMobile();
		buff[count++] = b.getEmployeeIdCreated();
		buff[count++] = generateTimestampFromDate(b.getDateCreated());
		buff[count++] = b.getDescription();
		buff[count++] = generateTimestampFromDate(b.getDateValidation());
		buff[count++] = b.getEmployeeIdUpdated();
		buff[count++] = generateTimestampFromDate(b.getDateInvalidation());
		buff[count++] = generateTimestampFromDate(b.getDateUpdated());
		buff[count++] = b.getReasonInvalidation();
	}

	@Override
	public void setDataFromBase(BaseFinReceivableChange b){
		if(b.getReceivableChangeId() != null) setReceivableChangeIdClear(b.getReceivableChangeId());
		if(b.getReceivableChangeCode() != null) setReceivableChangeCode(b.getReceivableChangeCode());
		if(b.getCustomerId() != null) setCustomerId(b.getCustomerId());
		if(b.getStatusReceivableChange() != null) setStatusReceivableChange(b.getStatusReceivableChange());
		if(b.getEmployeeIdMaintainer() != null) setEmployeeIdMaintainer(b.getEmployeeIdMaintainer());
		if(b.getDateChanged() != null) setDateChanged(b.getDateChanged());
		if(b.getDepartmentId() != null) setDepartmentId(b.getDepartmentId());
		if(b.getAddressDelivery() != null) setAddressDelivery(b.getAddressDelivery());
		if(b.getPostcode() != null) setPostcode(b.getPostcode());
		if(b.getContactName() != null) setContactName(b.getContactName());
		if(b.getContactMobile() != null) setContactMobile(b.getContactMobile());
		if(b.getEmployeeIdCreated() != null) setEmployeeIdCreated(b.getEmployeeIdCreated());
		if(b.getDateCreated() != null) setDateCreated(b.getDateCreated());
		if(b.getDescription() != null) setDescription(b.getDescription());
		if(b.getDateValidation() != null) setDateValidation(b.getDateValidation());
		if(b.getEmployeeIdUpdated() != null) setEmployeeIdUpdated(b.getEmployeeIdUpdated());
		if(b.getDateInvalidation() != null) setDateInvalidation(b.getDateInvalidation());
		if(b.getDateUpdated() != null) setDateUpdated(b.getDateUpdated());
		if(b.getReasonInvalidation() != null) setReasonInvalidation(b.getReasonInvalidation());
	}

	@Override
	public BaseFinReceivableChange generateBaseFromResultSet(java.sql.ResultSet sdr)  throws java.sql.SQLException {

		BaseFinReceivableChange b = new BaseFinReceivableChange();
		setQueryResultToBase(b, sdr);
		return b;
	}

	@Override
	public void setQueryResultToBase(BaseFinReceivableChange __base, java.sql.ResultSet sdr ) throws java.sql.SQLException {
		int count = 1, index = 0;
		java.sql.ResultSetMetaData rsmd = sdr.getMetaData();
		int columnCount = rsmd.getColumnCount();
		Object val;
		if(__select_flags[index++] && count <= columnCount && (val = sdr.getObject(count++)) != null) __base.setReceivableChangeId(GenericBase.__getInt(val));
		if(__select_flags[index++] && count <= columnCount && (val = sdr.getObject(count++)) != null) __base.setReceivableChangeCode(GenericBase.__getString(val));
		if(__select_flags[index++] && count <= columnCount && (val = sdr.getObject(count++)) != null) __base.setCustomerId(GenericBase.__getInt(val));
		if(__select_flags[index++] && count <= columnCount && (val = sdr.getObject(count++)) != null) __base.setStatusReceivableChange(GenericBase.__getInt(val));
		if(__select_flags[index++] && count <= columnCount && (val = sdr.getObject(count++)) != null) __base.setEmployeeIdMaintainer(GenericBase.__getInt(val));
		if(__select_flags[index++] && count <= columnCount && (val = sdr.getObject(count++)) != null) __base.setDateChanged(GenericBase.__getDateFromSQL(val));
		if(__select_flags[index++] && count <= columnCount && (val = sdr.getObject(count++)) != null) __base.setDepartmentId(GenericBase.__getInt(val));
		if(__select_flags[index++] && count <= columnCount && (val = sdr.getObject(count++)) != null) __base.setAddressDelivery(GenericBase.__getString(val));
		if(__select_flags[index++] && count <= columnCount && (val = sdr.getObject(count++)) != null) __base.setPostcode(GenericBase.__getString(val));
		if(__select_flags[index++] && count <= columnCount && (val = sdr.getObject(count++)) != null) __base.setContactName(GenericBase.__getString(val));
		if(__select_flags[index++] && count <= columnCount && (val = sdr.getObject(count++)) != null) __base.setContactMobile(GenericBase.__getString(val));
		if(__select_flags[index++] && count <= columnCount && (val = sdr.getObject(count++)) != null) __base.setEmployeeIdCreated(GenericBase.__getInt(val));
		if(__select_flags[index++] && count <= columnCount && (val = sdr.getObject(count++)) != null) __base.setDateCreated(GenericBase.__getDateFromSQL(val));
		if(__select_flags[index++] && count <= columnCount && (val = sdr.getObject(count++)) != null) __base.setDescription(GenericBase.__getString(val));
		if(__select_flags[index++] && count <= columnCount && (val = sdr.getObject(count++)) != null) __base.setDateValidation(GenericBase.__getDateFromSQL(val));
		if(__select_flags[index++] && count <= columnCount && (val = sdr.getObject(count++)) != null) __base.setEmployeeIdUpdated(GenericBase.__getInt(val));
		if(__select_flags[index++] && count <= columnCount && (val = sdr.getObject(count++)) != null) __base.setDateInvalidation(GenericBase.__getDateFromSQL(val));
		if(__select_flags[index++] && count <= columnCount && (val = sdr.getObject(count++)) != null) __base.setDateUpdated(GenericBase.__getDateFromSQL(val));
		if(__select_flags[index++] && count <= columnCount && (val = sdr.getObject(count++)) != null) __base.setReasonInvalidation(GenericBase.__getInt(val));
	}

	public void setReceivableChangeId(java.lang.Integer val) {
		setCurrentData(0, val);
	}

	public java.lang.Integer getReceivableChangeId() {
		return GenericBase.__getInt(__current_data[0]);
	}

	public void setReceivableChangeIdClear(java.lang.Integer val) {
		__backup_data[0] = __current_data[0] =  val;
		__modified_flags[0] = false;
	}

	public void setReceivableChangeCode(java.lang.String val) {
		setCurrentData(1, val);
	}

	public java.lang.String getReceivableChangeCode() {
		return GenericBase.__getString(__current_data[1]);
	}

	public void setCustomerId(java.lang.Integer val) {
		setCurrentData(2, val);
	}

	public java.lang.Integer getCustomerId() {
		return GenericBase.__getInt(__current_data[2]);
	}

	public void setStatusReceivableChange(java.lang.Integer val) {
		setCurrentData(3, val);
	}

	public java.lang.Integer getStatusReceivableChange() {
		return GenericBase.__getInt(__current_data[3]);
	}

	public void setEmployeeIdMaintainer(java.lang.Integer val) {
		setCurrentData(4, val);
	}

	public java.lang.Integer getEmployeeIdMaintainer() {
		return GenericBase.__getInt(__current_data[4]);
	}

	public void setDateChanged(java.util.Date val) {
		setCurrentData(5, generateTimestampFromDate(val));
	}

	public java.util.Date getDateChanged() {
		return GenericBase.__getDateFromSQL(__current_data[5]);
	}

	public void setDepartmentId(java.lang.Integer val) {
		setCurrentData(6, val);
	}

	public java.lang.Integer getDepartmentId() {
		return GenericBase.__getInt(__current_data[6]);
	}

	public void setAddressDelivery(java.lang.String val) {
		setCurrentData(7, val);
	}

	public java.lang.String getAddressDelivery() {
		return GenericBase.__getString(__current_data[7]);
	}

	public void setPostcode(java.lang.String val) {
		setCurrentData(8, val);
	}

	public java.lang.String getPostcode() {
		return GenericBase.__getString(__current_data[8]);
	}

	public void setContactName(java.lang.String val) {
		setCurrentData(9, val);
	}

	public java.lang.String getContactName() {
		return GenericBase.__getString(__current_data[9]);
	}

	public void setContactMobile(java.lang.String val) {
		setCurrentData(10, val);
	}

	public java.lang.String getContactMobile() {
		return GenericBase.__getString(__current_data[10]);
	}

	public void setEmployeeIdCreated(java.lang.Integer val) {
		setCurrentData(11, val);
	}

	public java.lang.Integer getEmployeeIdCreated() {
		return GenericBase.__getInt(__current_data[11]);
	}

	public void setDateCreated(java.util.Date val) {
		setCurrentData(12, generateTimestampFromDate(val));
	}

	public java.util.Date getDateCreated() {
		return GenericBase.__getDateFromSQL(__current_data[12]);
	}

	public void setDescription(java.lang.String val) {
		setCurrentData(13, val);
	}

	public java.lang.String getDescription() {
		return GenericBase.__getString(__current_data[13]);
	}

	public void setDateValidation(java.util.Date val) {
		setCurrentData(14, generateTimestampFromDate(val));
	}

	public java.util.Date getDateValidation() {
		return GenericBase.__getDateFromSQL(__current_data[14]);
	}

	public void setEmployeeIdUpdated(java.lang.Integer val) {
		setCurrentData(15, val);
	}

	public java.lang.Integer getEmployeeIdUpdated() {
		return GenericBase.__getInt(__current_data[15]);
	}

	public void setDateInvalidation(java.util.Date val) {
		setCurrentData(16, generateTimestampFromDate(val));
	}

	public java.util.Date getDateInvalidation() {
		return GenericBase.__getDateFromSQL(__current_data[16]);
	}

	public void setDateUpdated(java.util.Date val) {
		setCurrentData(17, generateTimestampFromDate(val));
	}

	public java.util.Date getDateUpdated() {
		return GenericBase.__getDateFromSQL(__current_data[17]);
	}

	public void setReasonInvalidation(java.lang.Integer val) {
		setCurrentData(18, val);
	}

	public java.lang.Integer getReasonInvalidation() {
		return GenericBase.__getInt(__current_data[18]);
	}

	public void setConditionReceivableChangeId(String op, java.lang.Integer val) {
		setConditionReceivableChangeId(op, val, CONDITION_AND);
	}

	public void setConditionReceivableChangeId(String op, java.lang.Integer val, String relation) {
		addCondition(0, op, relation, val);
	}

	public void setSelectReceivableChangeId(boolean val) {
		__select_flags[0] = val;
	}

	public void setReceivableChangeIdExpression(String val) {
		__dataExpressions[0] = val;
	}

	public void setConditionReceivableChangeCode(String op, java.lang.String val) {
		setConditionReceivableChangeCode(op, val, CONDITION_AND);
	}

	public void setConditionReceivableChangeCode(String op, java.lang.String val, String relation) {
		addCondition(1, op, relation, val);
	}

	public void setSelectReceivableChangeCode(boolean val) {
		__select_flags[1] = val;
	}

	public void setReceivableChangeCodeExpression(String val) {
		__dataExpressions[1] = val;
	}

	public void setConditionCustomerId(String op, java.lang.Integer val) {
		setConditionCustomerId(op, val, CONDITION_AND);
	}

	public void setConditionCustomerId(String op, java.lang.Integer val, String relation) {
		addCondition(2, op, relation, val);
	}

	public void setSelectCustomerId(boolean val) {
		__select_flags[2] = val;
	}

	public void setCustomerIdExpression(String val) {
		__dataExpressions[2] = val;
	}

	public void setConditionStatusReceivableChange(String op, java.lang.Integer val) {
		setConditionStatusReceivableChange(op, val, CONDITION_AND);
	}

	public void setConditionStatusReceivableChange(String op, java.lang.Integer val, String relation) {
		addCondition(3, op, relation, val);
	}

	public void setSelectStatusReceivableChange(boolean val) {
		__select_flags[3] = val;
	}

	public void setStatusReceivableChangeExpression(String val) {
		__dataExpressions[3] = val;
	}

	public void setConditionEmployeeIdMaintainer(String op, java.lang.Integer val) {
		setConditionEmployeeIdMaintainer(op, val, CONDITION_AND);
	}

	public void setConditionEmployeeIdMaintainer(String op, java.lang.Integer val, String relation) {
		addCondition(4, op, relation, val);
	}

	public void setSelectEmployeeIdMaintainer(boolean val) {
		__select_flags[4] = val;
	}

	public void setEmployeeIdMaintainerExpression(String val) {
		__dataExpressions[4] = val;
	}

	public void setConditionDateChanged(String op, java.util.Date val) {
		setConditionDateChanged(op, val, CONDITION_AND);
	}

	public void setConditionDateChanged(String op, java.util.Date val, String relation) {
		addCondition(5, op, relation, generateTimestampFromDate(val));
	}

	public void setSelectDateChanged(boolean val) {
		__select_flags[5] = val;
	}

	public void setDateChangedExpression(String val) {
		__dataExpressions[5] = val;
	}

	public void setConditionDepartmentId(String op, java.lang.Integer val) {
		setConditionDepartmentId(op, val, CONDITION_AND);
	}

	public void setConditionDepartmentId(String op, java.lang.Integer val, String relation) {
		addCondition(6, op, relation, val);
	}

	public void setSelectDepartmentId(boolean val) {
		__select_flags[6] = val;
	}

	public void setDepartmentIdExpression(String val) {
		__dataExpressions[6] = val;
	}

	public void setConditionAddressDelivery(String op, java.lang.String val) {
		setConditionAddressDelivery(op, val, CONDITION_AND);
	}

	public void setConditionAddressDelivery(String op, java.lang.String val, String relation) {
		addCondition(7, op, relation, val);
	}

	public void setSelectAddressDelivery(boolean val) {
		__select_flags[7] = val;
	}

	public void setAddressDeliveryExpression(String val) {
		__dataExpressions[7] = val;
	}

	public void setConditionPostcode(String op, java.lang.String val) {
		setConditionPostcode(op, val, CONDITION_AND);
	}

	public void setConditionPostcode(String op, java.lang.String val, String relation) {
		addCondition(8, op, relation, val);
	}

	public void setSelectPostcode(boolean val) {
		__select_flags[8] = val;
	}

	public void setPostcodeExpression(String val) {
		__dataExpressions[8] = val;
	}

	public void setConditionContactName(String op, java.lang.String val) {
		setConditionContactName(op, val, CONDITION_AND);
	}

	public void setConditionContactName(String op, java.lang.String val, String relation) {
		addCondition(9, op, relation, val);
	}

	public void setSelectContactName(boolean val) {
		__select_flags[9] = val;
	}

	public void setContactNameExpression(String val) {
		__dataExpressions[9] = val;
	}

	public void setConditionContactMobile(String op, java.lang.String val) {
		setConditionContactMobile(op, val, CONDITION_AND);
	}

	public void setConditionContactMobile(String op, java.lang.String val, String relation) {
		addCondition(10, op, relation, val);
	}

	public void setSelectContactMobile(boolean val) {
		__select_flags[10] = val;
	}

	public void setContactMobileExpression(String val) {
		__dataExpressions[10] = val;
	}

	public void setConditionEmployeeIdCreated(String op, java.lang.Integer val) {
		setConditionEmployeeIdCreated(op, val, CONDITION_AND);
	}

	public void setConditionEmployeeIdCreated(String op, java.lang.Integer val, String relation) {
		addCondition(11, op, relation, val);
	}

	public void setSelectEmployeeIdCreated(boolean val) {
		__select_flags[11] = val;
	}

	public void setEmployeeIdCreatedExpression(String val) {
		__dataExpressions[11] = val;
	}

	public void setConditionDateCreated(String op, java.util.Date val) {
		setConditionDateCreated(op, val, CONDITION_AND);
	}

	public void setConditionDateCreated(String op, java.util.Date val, String relation) {
		addCondition(12, op, relation, generateTimestampFromDate(val));
	}

	public void setSelectDateCreated(boolean val) {
		__select_flags[12] = val;
	}

	public void setDateCreatedExpression(String val) {
		__dataExpressions[12] = val;
	}

	public void setConditionDescription(String op, java.lang.String val) {
		setConditionDescription(op, val, CONDITION_AND);
	}

	public void setConditionDescription(String op, java.lang.String val, String relation) {
		addCondition(13, op, relation, val);
	}

	public void setSelectDescription(boolean val) {
		__select_flags[13] = val;
	}

	public void setDescriptionExpression(String val) {
		__dataExpressions[13] = val;
	}

	public void setConditionDateValidation(String op, java.util.Date val) {
		setConditionDateValidation(op, val, CONDITION_AND);
	}

	public void setConditionDateValidation(String op, java.util.Date val, String relation) {
		addCondition(14, op, relation, generateTimestampFromDate(val));
	}

	public void setSelectDateValidation(boolean val) {
		__select_flags[14] = val;
	}

	public void setDateValidationExpression(String val) {
		__dataExpressions[14] = val;
	}

	public void setConditionEmployeeIdUpdated(String op, java.lang.Integer val) {
		setConditionEmployeeIdUpdated(op, val, CONDITION_AND);
	}

	public void setConditionEmployeeIdUpdated(String op, java.lang.Integer val, String relation) {
		addCondition(15, op, relation, val);
	}

	public void setSelectEmployeeIdUpdated(boolean val) {
		__select_flags[15] = val;
	}

	public void setEmployeeIdUpdatedExpression(String val) {
		__dataExpressions[15] = val;
	}

	public void setConditionDateInvalidation(String op, java.util.Date val) {
		setConditionDateInvalidation(op, val, CONDITION_AND);
	}

	public void setConditionDateInvalidation(String op, java.util.Date val, String relation) {
		addCondition(16, op, relation, generateTimestampFromDate(val));
	}

	public void setSelectDateInvalidation(boolean val) {
		__select_flags[16] = val;
	}

	public void setDateInvalidationExpression(String val) {
		__dataExpressions[16] = val;
	}

	public void setConditionDateUpdated(String op, java.util.Date val) {
		setConditionDateUpdated(op, val, CONDITION_AND);
	}

	public void setConditionDateUpdated(String op, java.util.Date val, String relation) {
		addCondition(17, op, relation, generateTimestampFromDate(val));
	}

	public void setSelectDateUpdated(boolean val) {
		__select_flags[17] = val;
	}

	public void setDateUpdatedExpression(String val) {
		__dataExpressions[17] = val;
	}

	public void setConditionReasonInvalidation(String op, java.lang.Integer val) {
		setConditionReasonInvalidation(op, val, CONDITION_AND);
	}

	public void setConditionReasonInvalidation(String op, java.lang.Integer val, String relation) {
		addCondition(18, op, relation, val);
	}

	public void setSelectReasonInvalidation(boolean val) {
		__select_flags[18] = val;
	}

	public void setReasonInvalidationExpression(String val) {
		__dataExpressions[18] = val;
	}


}

