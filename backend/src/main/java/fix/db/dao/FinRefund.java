package fix.db.dao;

import delicacy.common.AbstractTable;
import delicacy.common.GenericBase;
import fix.db.bean.BaseFinRefund;


public class FinRefund extends AbstractTable<BaseFinRefund>
{

	public FinRefund() throws java.sql.SQLException 
	{

		initColumnNames();
	}

	protected final void initColumnNames()  throws java.sql.SQLException {

		__columnCount          = 18;

		initTables();

		__tableName            = "fin_refunds";

		__key_columns          = new int[1];
		__key_columns[0] = 0;

		__column_names[0] = BaseFinRefund.CS_REFUND_ID;
		__column_names[1] = BaseFinRefund.CS_REFUND_CODE;
		__column_names[2] = BaseFinRefund.CS_DATE_REFUNDED;
		__column_names[3] = BaseFinRefund.CS_DATE_VALIDATION;
		__column_names[4] = BaseFinRefund.CS_EMPLOYEE_ID_MAINTAINER;
		__column_names[5] = BaseFinRefund.CS_CUSTOMER_ID;
		__column_names[6] = BaseFinRefund.CS_DEPARTMENT_ID;
		__column_names[7] = BaseFinRefund.CS_REASON_REFUND;
		__column_names[8] = BaseFinRefund.CS_STATUS_REFUND;
		__column_names[9] = BaseFinRefund.CS_CONTACT_NAME;
		__column_names[10] = BaseFinRefund.CS_CONTACT_MOBILE;
		__column_names[11] = BaseFinRefund.CS_REASON_INVALIDATION;
		__column_names[12] = BaseFinRefund.CS_EMPLOYEE_ID_CREATED;
		__column_names[13] = BaseFinRefund.CS_DATE_INVALIDATION;
		__column_names[14] = BaseFinRefund.CS_DATE_CREATED;
		__column_names[15] = BaseFinRefund.CS_EMPLOYEE_ID_UPDATED;
		__column_names[16] = BaseFinRefund.CS_DESCRIPTION_REFUND;
		__column_names[17] = BaseFinRefund.CS_DATE_UPDATED;

		resetSelectFlags() ;
		resetInsertFlags() ;
	}

	public void resetInsertFlags(){
		for(int i = 0; i < __columnCount; i ++ ) __insert_flags[i] = true;
		__insert_flags[0] = false;
		__serial_column = 0;
	}

	public void setPrimaryKeyFromBase(BaseFinRefund b) {
		clear();
		setRefundIdClear(b.getRefundId());
	}

	public boolean isPrimaryKeyNull() {
		return getRefundId() == null;
	}

	@Override
	public BaseFinRefund generateBase(){
		BaseFinRefund b = new BaseFinRefund();
		setDataToBase(b);
		return b;
	}

	@Override
	public void setDataToBase(BaseFinRefund b){
		int count = 0; Object val;
		if((val = __current_data[count++]) != null) b.setRefundId(GenericBase.__getInt(val));
		if((val = __current_data[count++]) != null) b.setRefundCode(GenericBase.__getString(val));
		if((val = __current_data[count++]) != null) b.setDateRefunded(GenericBase.__getDateFromSQL(val));
		if((val = __current_data[count++]) != null) b.setDateValidation(GenericBase.__getDateFromSQL(val));
		if((val = __current_data[count++]) != null) b.setEmployeeIdMaintainer(GenericBase.__getInt(val));
		if((val = __current_data[count++]) != null) b.setCustomerId(GenericBase.__getInt(val));
		if((val = __current_data[count++]) != null) b.setDepartmentId(GenericBase.__getInt(val));
		if((val = __current_data[count++]) != null) b.setReasonRefund(GenericBase.__getInt(val));
		if((val = __current_data[count++]) != null) b.setStatusRefund(GenericBase.__getInt(val));
		if((val = __current_data[count++]) != null) b.setContactName(GenericBase.__getString(val));
		if((val = __current_data[count++]) != null) b.setContactMobile(GenericBase.__getString(val));
		if((val = __current_data[count++]) != null) b.setReasonInvalidation(GenericBase.__getInt(val));
		if((val = __current_data[count++]) != null) b.setEmployeeIdCreated(GenericBase.__getInt(val));
		if((val = __current_data[count++]) != null) b.setDateInvalidation(GenericBase.__getDateFromSQL(val));
		if((val = __current_data[count++]) != null) b.setDateCreated(GenericBase.__getDateFromSQL(val));
		if((val = __current_data[count++]) != null) b.setEmployeeIdUpdated(GenericBase.__getInt(val));
		if((val = __current_data[count++]) != null) b.setDescriptionRefund(GenericBase.__getString(val));
		if((val = __current_data[count++]) != null) b.setDateUpdated(GenericBase.__getDateFromSQL(val));
	}

	@Override
	public void setBaseToBuffer(BaseFinRefund b, Object[] buff){
		int count = 0;
		buff[count++] = b.getRefundId();
		buff[count++] = b.getRefundCode();
		buff[count++] = generateTimestampFromDate(b.getDateRefunded());
		buff[count++] = generateTimestampFromDate(b.getDateValidation());
		buff[count++] = b.getEmployeeIdMaintainer();
		buff[count++] = b.getCustomerId();
		buff[count++] = b.getDepartmentId();
		buff[count++] = b.getReasonRefund();
		buff[count++] = b.getStatusRefund();
		buff[count++] = b.getContactName();
		buff[count++] = b.getContactMobile();
		buff[count++] = b.getReasonInvalidation();
		buff[count++] = b.getEmployeeIdCreated();
		buff[count++] = generateTimestampFromDate(b.getDateInvalidation());
		buff[count++] = generateTimestampFromDate(b.getDateCreated());
		buff[count++] = b.getEmployeeIdUpdated();
		buff[count++] = b.getDescriptionRefund();
		buff[count++] = generateTimestampFromDate(b.getDateUpdated());
	}

	@Override
	public void setDataFromBase(BaseFinRefund b){
		if(b.getRefundId() != null) setRefundIdClear(b.getRefundId());
		if(b.getRefundCode() != null) setRefundCode(b.getRefundCode());
		if(b.getDateRefunded() != null) setDateRefunded(b.getDateRefunded());
		if(b.getDateValidation() != null) setDateValidation(b.getDateValidation());
		if(b.getEmployeeIdMaintainer() != null) setEmployeeIdMaintainer(b.getEmployeeIdMaintainer());
		if(b.getCustomerId() != null) setCustomerId(b.getCustomerId());
		if(b.getDepartmentId() != null) setDepartmentId(b.getDepartmentId());
		if(b.getReasonRefund() != null) setReasonRefund(b.getReasonRefund());
		if(b.getStatusRefund() != null) setStatusRefund(b.getStatusRefund());
		if(b.getContactName() != null) setContactName(b.getContactName());
		if(b.getContactMobile() != null) setContactMobile(b.getContactMobile());
		if(b.getReasonInvalidation() != null) setReasonInvalidation(b.getReasonInvalidation());
		if(b.getEmployeeIdCreated() != null) setEmployeeIdCreated(b.getEmployeeIdCreated());
		if(b.getDateInvalidation() != null) setDateInvalidation(b.getDateInvalidation());
		if(b.getDateCreated() != null) setDateCreated(b.getDateCreated());
		if(b.getEmployeeIdUpdated() != null) setEmployeeIdUpdated(b.getEmployeeIdUpdated());
		if(b.getDescriptionRefund() != null) setDescriptionRefund(b.getDescriptionRefund());
		if(b.getDateUpdated() != null) setDateUpdated(b.getDateUpdated());
	}

	@Override
	public BaseFinRefund generateBaseFromResultSet(java.sql.ResultSet sdr)  throws java.sql.SQLException {

		BaseFinRefund b = new BaseFinRefund();
		setQueryResultToBase(b, sdr);
		return b;
	}

	@Override
	public void setQueryResultToBase(BaseFinRefund __base, java.sql.ResultSet sdr ) throws java.sql.SQLException {
		int count = 1, index = 0;
		java.sql.ResultSetMetaData rsmd = sdr.getMetaData();
		int columnCount = rsmd.getColumnCount();
		Object val;
		if(__select_flags[index++] && count <= columnCount && (val = sdr.getObject(count++)) != null) __base.setRefundId(GenericBase.__getInt(val));
		if(__select_flags[index++] && count <= columnCount && (val = sdr.getObject(count++)) != null) __base.setRefundCode(GenericBase.__getString(val));
		if(__select_flags[index++] && count <= columnCount && (val = sdr.getObject(count++)) != null) __base.setDateRefunded(GenericBase.__getDateFromSQL(val));
		if(__select_flags[index++] && count <= columnCount && (val = sdr.getObject(count++)) != null) __base.setDateValidation(GenericBase.__getDateFromSQL(val));
		if(__select_flags[index++] && count <= columnCount && (val = sdr.getObject(count++)) != null) __base.setEmployeeIdMaintainer(GenericBase.__getInt(val));
		if(__select_flags[index++] && count <= columnCount && (val = sdr.getObject(count++)) != null) __base.setCustomerId(GenericBase.__getInt(val));
		if(__select_flags[index++] && count <= columnCount && (val = sdr.getObject(count++)) != null) __base.setDepartmentId(GenericBase.__getInt(val));
		if(__select_flags[index++] && count <= columnCount && (val = sdr.getObject(count++)) != null) __base.setReasonRefund(GenericBase.__getInt(val));
		if(__select_flags[index++] && count <= columnCount && (val = sdr.getObject(count++)) != null) __base.setStatusRefund(GenericBase.__getInt(val));
		if(__select_flags[index++] && count <= columnCount && (val = sdr.getObject(count++)) != null) __base.setContactName(GenericBase.__getString(val));
		if(__select_flags[index++] && count <= columnCount && (val = sdr.getObject(count++)) != null) __base.setContactMobile(GenericBase.__getString(val));
		if(__select_flags[index++] && count <= columnCount && (val = sdr.getObject(count++)) != null) __base.setReasonInvalidation(GenericBase.__getInt(val));
		if(__select_flags[index++] && count <= columnCount && (val = sdr.getObject(count++)) != null) __base.setEmployeeIdCreated(GenericBase.__getInt(val));
		if(__select_flags[index++] && count <= columnCount && (val = sdr.getObject(count++)) != null) __base.setDateInvalidation(GenericBase.__getDateFromSQL(val));
		if(__select_flags[index++] && count <= columnCount && (val = sdr.getObject(count++)) != null) __base.setDateCreated(GenericBase.__getDateFromSQL(val));
		if(__select_flags[index++] && count <= columnCount && (val = sdr.getObject(count++)) != null) __base.setEmployeeIdUpdated(GenericBase.__getInt(val));
		if(__select_flags[index++] && count <= columnCount && (val = sdr.getObject(count++)) != null) __base.setDescriptionRefund(GenericBase.__getString(val));
		if(__select_flags[index++] && count <= columnCount && (val = sdr.getObject(count++)) != null) __base.setDateUpdated(GenericBase.__getDateFromSQL(val));
	}

	public void setRefundId(java.lang.Integer val) {
		setCurrentData(0, val);
	}

	public java.lang.Integer getRefundId() {
		return GenericBase.__getInt(__current_data[0]);
	}

	public void setRefundIdClear(java.lang.Integer val) {
		__backup_data[0] = __current_data[0] =  val;
		__modified_flags[0] = false;
	}

	public void setRefundCode(java.lang.String val) {
		setCurrentData(1, val);
	}

	public java.lang.String getRefundCode() {
		return GenericBase.__getString(__current_data[1]);
	}

	public void setDateRefunded(java.util.Date val) {
		setCurrentData(2, generateTimestampFromDate(val));
	}

	public java.util.Date getDateRefunded() {
		return GenericBase.__getDateFromSQL(__current_data[2]);
	}

	public void setDateValidation(java.util.Date val) {
		setCurrentData(3, generateTimestampFromDate(val));
	}

	public java.util.Date getDateValidation() {
		return GenericBase.__getDateFromSQL(__current_data[3]);
	}

	public void setEmployeeIdMaintainer(java.lang.Integer val) {
		setCurrentData(4, val);
	}

	public java.lang.Integer getEmployeeIdMaintainer() {
		return GenericBase.__getInt(__current_data[4]);
	}

	public void setCustomerId(java.lang.Integer val) {
		setCurrentData(5, val);
	}

	public java.lang.Integer getCustomerId() {
		return GenericBase.__getInt(__current_data[5]);
	}

	public void setDepartmentId(java.lang.Integer val) {
		setCurrentData(6, val);
	}

	public java.lang.Integer getDepartmentId() {
		return GenericBase.__getInt(__current_data[6]);
	}

	public void setReasonRefund(java.lang.Integer val) {
		setCurrentData(7, val);
	}

	public java.lang.Integer getReasonRefund() {
		return GenericBase.__getInt(__current_data[7]);
	}

	public void setStatusRefund(java.lang.Integer val) {
		setCurrentData(8, val);
	}

	public java.lang.Integer getStatusRefund() {
		return GenericBase.__getInt(__current_data[8]);
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

	public void setReasonInvalidation(java.lang.Integer val) {
		setCurrentData(11, val);
	}

	public java.lang.Integer getReasonInvalidation() {
		return GenericBase.__getInt(__current_data[11]);
	}

	public void setEmployeeIdCreated(java.lang.Integer val) {
		setCurrentData(12, val);
	}

	public java.lang.Integer getEmployeeIdCreated() {
		return GenericBase.__getInt(__current_data[12]);
	}

	public void setDateInvalidation(java.util.Date val) {
		setCurrentData(13, generateTimestampFromDate(val));
	}

	public java.util.Date getDateInvalidation() {
		return GenericBase.__getDateFromSQL(__current_data[13]);
	}

	public void setDateCreated(java.util.Date val) {
		setCurrentData(14, generateTimestampFromDate(val));
	}

	public java.util.Date getDateCreated() {
		return GenericBase.__getDateFromSQL(__current_data[14]);
	}

	public void setEmployeeIdUpdated(java.lang.Integer val) {
		setCurrentData(15, val);
	}

	public java.lang.Integer getEmployeeIdUpdated() {
		return GenericBase.__getInt(__current_data[15]);
	}

	public void setDescriptionRefund(java.lang.String val) {
		setCurrentData(16, val);
	}

	public java.lang.String getDescriptionRefund() {
		return GenericBase.__getString(__current_data[16]);
	}

	public void setDateUpdated(java.util.Date val) {
		setCurrentData(17, generateTimestampFromDate(val));
	}

	public java.util.Date getDateUpdated() {
		return GenericBase.__getDateFromSQL(__current_data[17]);
	}

	public void setConditionRefundId(String op, java.lang.Integer val) {
		setConditionRefundId(op, val, CONDITION_AND);
	}

	public void setConditionRefundId(String op, java.lang.Integer val, String relation) {
		addCondition(0, op, relation, val);
	}

	public void setSelectRefundId(boolean val) {
		__select_flags[0] = val;
	}

	public void setRefundIdExpression(String val) {
		__dataExpressions[0] = val;
	}

	public void setConditionRefundCode(String op, java.lang.String val) {
		setConditionRefundCode(op, val, CONDITION_AND);
	}

	public void setConditionRefundCode(String op, java.lang.String val, String relation) {
		addCondition(1, op, relation, val);
	}

	public void setSelectRefundCode(boolean val) {
		__select_flags[1] = val;
	}

	public void setRefundCodeExpression(String val) {
		__dataExpressions[1] = val;
	}

	public void setConditionDateRefunded(String op, java.util.Date val) {
		setConditionDateRefunded(op, val, CONDITION_AND);
	}

	public void setConditionDateRefunded(String op, java.util.Date val, String relation) {
		addCondition(2, op, relation, generateTimestampFromDate(val));
	}

	public void setSelectDateRefunded(boolean val) {
		__select_flags[2] = val;
	}

	public void setDateRefundedExpression(String val) {
		__dataExpressions[2] = val;
	}

	public void setConditionDateValidation(String op, java.util.Date val) {
		setConditionDateValidation(op, val, CONDITION_AND);
	}

	public void setConditionDateValidation(String op, java.util.Date val, String relation) {
		addCondition(3, op, relation, generateTimestampFromDate(val));
	}

	public void setSelectDateValidation(boolean val) {
		__select_flags[3] = val;
	}

	public void setDateValidationExpression(String val) {
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

	public void setConditionReasonRefund(String op, java.lang.Integer val) {
		setConditionReasonRefund(op, val, CONDITION_AND);
	}

	public void setConditionReasonRefund(String op, java.lang.Integer val, String relation) {
		addCondition(7, op, relation, val);
	}

	public void setSelectReasonRefund(boolean val) {
		__select_flags[7] = val;
	}

	public void setReasonRefundExpression(String val) {
		__dataExpressions[7] = val;
	}

	public void setConditionStatusRefund(String op, java.lang.Integer val) {
		setConditionStatusRefund(op, val, CONDITION_AND);
	}

	public void setConditionStatusRefund(String op, java.lang.Integer val, String relation) {
		addCondition(8, op, relation, val);
	}

	public void setSelectStatusRefund(boolean val) {
		__select_flags[8] = val;
	}

	public void setStatusRefundExpression(String val) {
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

	public void setConditionReasonInvalidation(String op, java.lang.Integer val) {
		setConditionReasonInvalidation(op, val, CONDITION_AND);
	}

	public void setConditionReasonInvalidation(String op, java.lang.Integer val, String relation) {
		addCondition(11, op, relation, val);
	}

	public void setSelectReasonInvalidation(boolean val) {
		__select_flags[11] = val;
	}

	public void setReasonInvalidationExpression(String val) {
		__dataExpressions[11] = val;
	}

	public void setConditionEmployeeIdCreated(String op, java.lang.Integer val) {
		setConditionEmployeeIdCreated(op, val, CONDITION_AND);
	}

	public void setConditionEmployeeIdCreated(String op, java.lang.Integer val, String relation) {
		addCondition(12, op, relation, val);
	}

	public void setSelectEmployeeIdCreated(boolean val) {
		__select_flags[12] = val;
	}

	public void setEmployeeIdCreatedExpression(String val) {
		__dataExpressions[12] = val;
	}

	public void setConditionDateInvalidation(String op, java.util.Date val) {
		setConditionDateInvalidation(op, val, CONDITION_AND);
	}

	public void setConditionDateInvalidation(String op, java.util.Date val, String relation) {
		addCondition(13, op, relation, generateTimestampFromDate(val));
	}

	public void setSelectDateInvalidation(boolean val) {
		__select_flags[13] = val;
	}

	public void setDateInvalidationExpression(String val) {
		__dataExpressions[13] = val;
	}

	public void setConditionDateCreated(String op, java.util.Date val) {
		setConditionDateCreated(op, val, CONDITION_AND);
	}

	public void setConditionDateCreated(String op, java.util.Date val, String relation) {
		addCondition(14, op, relation, generateTimestampFromDate(val));
	}

	public void setSelectDateCreated(boolean val) {
		__select_flags[14] = val;
	}

	public void setDateCreatedExpression(String val) {
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

	public void setConditionDescriptionRefund(String op, java.lang.String val) {
		setConditionDescriptionRefund(op, val, CONDITION_AND);
	}

	public void setConditionDescriptionRefund(String op, java.lang.String val, String relation) {
		addCondition(16, op, relation, val);
	}

	public void setSelectDescriptionRefund(boolean val) {
		__select_flags[16] = val;
	}

	public void setDescriptionRefundExpression(String val) {
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


}

