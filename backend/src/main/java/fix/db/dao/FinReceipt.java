package fix.db.dao;

import delicacy.common.AbstractTable;
import delicacy.common.GenericBase;
import fix.db.bean.BaseFinReceipt;


public class FinReceipt extends AbstractTable<BaseFinReceipt>
{

	public FinReceipt() throws java.sql.SQLException 
	{

		initColumnNames();
	}

	protected final void initColumnNames()  throws java.sql.SQLException {

		__columnCount          = 15;

		initTables();

		__tableName            = "fin_receipts";

		__key_columns          = new int[1];
		__key_columns[0] = 0;

		__column_names[0] = BaseFinReceipt.CS_RECEIPT_ID;
		__column_names[1] = BaseFinReceipt.CS_RECEIPT_CODE;
		__column_names[2] = BaseFinReceipt.CS_CUSTOMER_ID;
		__column_names[3] = BaseFinReceipt.CS_EMPLOYEE_ID_MAINTAINER;
		__column_names[4] = BaseFinReceipt.CS_STATUS_RECEIPT;
		__column_names[5] = BaseFinReceipt.CS_DEPARTMENT_ID;
		__column_names[6] = BaseFinReceipt.CS_DATE_RECEIPTED;
		__column_names[7] = BaseFinReceipt.CS_DATE_VALIDATION;
		__column_names[8] = BaseFinReceipt.CS_DATE_INVALIDATION;
		__column_names[9] = BaseFinReceipt.CS_REASON_INVALIDATION;
		__column_names[10] = BaseFinReceipt.CS_EMPLOYEE_ID_CREATED;
		__column_names[11] = BaseFinReceipt.CS_PAYMENT_METHOD_ACCEPTED;
		__column_names[12] = BaseFinReceipt.CS_DATE_CREATED;
		__column_names[13] = BaseFinReceipt.CS_EMPLOYEE_ID_UPDATED;
		__column_names[14] = BaseFinReceipt.CS_DATE_UPDATED;

		resetSelectFlags() ;
		resetInsertFlags() ;
	}

	public void resetInsertFlags(){
		for(int i = 0; i < __columnCount; i ++ ) __insert_flags[i] = true;
		__insert_flags[0] = false;
		__serial_column = 0;
	}

	public void setPrimaryKeyFromBase(BaseFinReceipt b) {
		clear();
		setReceiptIdClear(b.getReceiptId());
	}

	public boolean isPrimaryKeyNull() {
		return getReceiptId() == null;
	}

	@Override
	public BaseFinReceipt generateBase(){
		BaseFinReceipt b = new BaseFinReceipt();
		setDataToBase(b);
		return b;
	}

	@Override
	public void setDataToBase(BaseFinReceipt b){
		int count = 0; Object val;
		if((val = __current_data[count++]) != null) b.setReceiptId(GenericBase.__getInt(val));
		if((val = __current_data[count++]) != null) b.setReceiptCode(GenericBase.__getString(val));
		if((val = __current_data[count++]) != null) b.setCustomerId(GenericBase.__getInt(val));
		if((val = __current_data[count++]) != null) b.setEmployeeIdMaintainer(GenericBase.__getInt(val));
		if((val = __current_data[count++]) != null) b.setStatusReceipt(GenericBase.__getInt(val));
		if((val = __current_data[count++]) != null) b.setDepartmentId(GenericBase.__getInt(val));
		if((val = __current_data[count++]) != null) b.setDateReceipted(GenericBase.__getDateFromSQL(val));
		if((val = __current_data[count++]) != null) b.setDateValidation(GenericBase.__getDateFromSQL(val));
		if((val = __current_data[count++]) != null) b.setDateInvalidation(GenericBase.__getDateFromSQL(val));
		if((val = __current_data[count++]) != null) b.setReasonInvalidation(GenericBase.__getInt(val));
		if((val = __current_data[count++]) != null) b.setEmployeeIdCreated(GenericBase.__getInt(val));
		if((val = __current_data[count++]) != null) b.setPaymentMethodAccepted(GenericBase.__getInt(val));
		if((val = __current_data[count++]) != null) b.setDateCreated(GenericBase.__getDateFromSQL(val));
		if((val = __current_data[count++]) != null) b.setEmployeeIdUpdated(GenericBase.__getInt(val));
		if((val = __current_data[count++]) != null) b.setDateUpdated(GenericBase.__getDateFromSQL(val));
	}

	@Override
	public void setBaseToBuffer(BaseFinReceipt b, Object[] buff){
		int count = 0;
		buff[count++] = b.getReceiptId();
		buff[count++] = b.getReceiptCode();
		buff[count++] = b.getCustomerId();
		buff[count++] = b.getEmployeeIdMaintainer();
		buff[count++] = b.getStatusReceipt();
		buff[count++] = b.getDepartmentId();
		buff[count++] = generateTimestampFromDate(b.getDateReceipted());
		buff[count++] = generateTimestampFromDate(b.getDateValidation());
		buff[count++] = generateTimestampFromDate(b.getDateInvalidation());
		buff[count++] = b.getReasonInvalidation();
		buff[count++] = b.getEmployeeIdCreated();
		buff[count++] = b.getPaymentMethodAccepted();
		buff[count++] = generateTimestampFromDate(b.getDateCreated());
		buff[count++] = b.getEmployeeIdUpdated();
		buff[count++] = generateTimestampFromDate(b.getDateUpdated());
	}

	@Override
	public void setDataFromBase(BaseFinReceipt b){
		if(b.getReceiptId() != null) setReceiptIdClear(b.getReceiptId());
		if(b.getReceiptCode() != null) setReceiptCode(b.getReceiptCode());
		if(b.getCustomerId() != null) setCustomerId(b.getCustomerId());
		if(b.getEmployeeIdMaintainer() != null) setEmployeeIdMaintainer(b.getEmployeeIdMaintainer());
		if(b.getStatusReceipt() != null) setStatusReceipt(b.getStatusReceipt());
		if(b.getDepartmentId() != null) setDepartmentId(b.getDepartmentId());
		if(b.getDateReceipted() != null) setDateReceipted(b.getDateReceipted());
		if(b.getDateValidation() != null) setDateValidation(b.getDateValidation());
		if(b.getDateInvalidation() != null) setDateInvalidation(b.getDateInvalidation());
		if(b.getReasonInvalidation() != null) setReasonInvalidation(b.getReasonInvalidation());
		if(b.getEmployeeIdCreated() != null) setEmployeeIdCreated(b.getEmployeeIdCreated());
		if(b.getPaymentMethodAccepted() != null) setPaymentMethodAccepted(b.getPaymentMethodAccepted());
		if(b.getDateCreated() != null) setDateCreated(b.getDateCreated());
		if(b.getEmployeeIdUpdated() != null) setEmployeeIdUpdated(b.getEmployeeIdUpdated());
		if(b.getDateUpdated() != null) setDateUpdated(b.getDateUpdated());
	}

	@Override
	public BaseFinReceipt generateBaseFromResultSet(java.sql.ResultSet sdr)  throws java.sql.SQLException {

		BaseFinReceipt b = new BaseFinReceipt();
		setQueryResultToBase(b, sdr);
		return b;
	}

	@Override
	public void setQueryResultToBase(BaseFinReceipt __base, java.sql.ResultSet sdr ) throws java.sql.SQLException {
		int count = 1, index = 0;
		java.sql.ResultSetMetaData rsmd = sdr.getMetaData();
		int columnCount = rsmd.getColumnCount();
		Object val;
		if(__select_flags[index++] && count <= columnCount && (val = sdr.getObject(count++)) != null) __base.setReceiptId(GenericBase.__getInt(val));
		if(__select_flags[index++] && count <= columnCount && (val = sdr.getObject(count++)) != null) __base.setReceiptCode(GenericBase.__getString(val));
		if(__select_flags[index++] && count <= columnCount && (val = sdr.getObject(count++)) != null) __base.setCustomerId(GenericBase.__getInt(val));
		if(__select_flags[index++] && count <= columnCount && (val = sdr.getObject(count++)) != null) __base.setEmployeeIdMaintainer(GenericBase.__getInt(val));
		if(__select_flags[index++] && count <= columnCount && (val = sdr.getObject(count++)) != null) __base.setStatusReceipt(GenericBase.__getInt(val));
		if(__select_flags[index++] && count <= columnCount && (val = sdr.getObject(count++)) != null) __base.setDepartmentId(GenericBase.__getInt(val));
		if(__select_flags[index++] && count <= columnCount && (val = sdr.getObject(count++)) != null) __base.setDateReceipted(GenericBase.__getDateFromSQL(val));
		if(__select_flags[index++] && count <= columnCount && (val = sdr.getObject(count++)) != null) __base.setDateValidation(GenericBase.__getDateFromSQL(val));
		if(__select_flags[index++] && count <= columnCount && (val = sdr.getObject(count++)) != null) __base.setDateInvalidation(GenericBase.__getDateFromSQL(val));
		if(__select_flags[index++] && count <= columnCount && (val = sdr.getObject(count++)) != null) __base.setReasonInvalidation(GenericBase.__getInt(val));
		if(__select_flags[index++] && count <= columnCount && (val = sdr.getObject(count++)) != null) __base.setEmployeeIdCreated(GenericBase.__getInt(val));
		if(__select_flags[index++] && count <= columnCount && (val = sdr.getObject(count++)) != null) __base.setPaymentMethodAccepted(GenericBase.__getInt(val));
		if(__select_flags[index++] && count <= columnCount && (val = sdr.getObject(count++)) != null) __base.setDateCreated(GenericBase.__getDateFromSQL(val));
		if(__select_flags[index++] && count <= columnCount && (val = sdr.getObject(count++)) != null) __base.setEmployeeIdUpdated(GenericBase.__getInt(val));
		if(__select_flags[index++] && count <= columnCount && (val = sdr.getObject(count++)) != null) __base.setDateUpdated(GenericBase.__getDateFromSQL(val));
	}

	public void setReceiptId(java.lang.Integer val) {
		setCurrentData(0, val);
	}

	public java.lang.Integer getReceiptId() {
		return GenericBase.__getInt(__current_data[0]);
	}

	public void setReceiptIdClear(java.lang.Integer val) {
		__backup_data[0] = __current_data[0] =  val;
		__modified_flags[0] = false;
	}

	public void setReceiptCode(java.lang.String val) {
		setCurrentData(1, val);
	}

	public java.lang.String getReceiptCode() {
		return GenericBase.__getString(__current_data[1]);
	}

	public void setCustomerId(java.lang.Integer val) {
		setCurrentData(2, val);
	}

	public java.lang.Integer getCustomerId() {
		return GenericBase.__getInt(__current_data[2]);
	}

	public void setEmployeeIdMaintainer(java.lang.Integer val) {
		setCurrentData(3, val);
	}

	public java.lang.Integer getEmployeeIdMaintainer() {
		return GenericBase.__getInt(__current_data[3]);
	}

	public void setStatusReceipt(java.lang.Integer val) {
		setCurrentData(4, val);
	}

	public java.lang.Integer getStatusReceipt() {
		return GenericBase.__getInt(__current_data[4]);
	}

	public void setDepartmentId(java.lang.Integer val) {
		setCurrentData(5, val);
	}

	public java.lang.Integer getDepartmentId() {
		return GenericBase.__getInt(__current_data[5]);
	}

	public void setDateReceipted(java.util.Date val) {
		setCurrentData(6, generateTimestampFromDate(val));
	}

	public java.util.Date getDateReceipted() {
		return GenericBase.__getDateFromSQL(__current_data[6]);
	}

	public void setDateValidation(java.util.Date val) {
		setCurrentData(7, generateTimestampFromDate(val));
	}

	public java.util.Date getDateValidation() {
		return GenericBase.__getDateFromSQL(__current_data[7]);
	}

	public void setDateInvalidation(java.util.Date val) {
		setCurrentData(8, generateTimestampFromDate(val));
	}

	public java.util.Date getDateInvalidation() {
		return GenericBase.__getDateFromSQL(__current_data[8]);
	}

	public void setReasonInvalidation(java.lang.Integer val) {
		setCurrentData(9, val);
	}

	public java.lang.Integer getReasonInvalidation() {
		return GenericBase.__getInt(__current_data[9]);
	}

	public void setEmployeeIdCreated(java.lang.Integer val) {
		setCurrentData(10, val);
	}

	public java.lang.Integer getEmployeeIdCreated() {
		return GenericBase.__getInt(__current_data[10]);
	}

	public void setPaymentMethodAccepted(java.lang.Integer val) {
		setCurrentData(11, val);
	}

	public java.lang.Integer getPaymentMethodAccepted() {
		return GenericBase.__getInt(__current_data[11]);
	}

	public void setDateCreated(java.util.Date val) {
		setCurrentData(12, generateTimestampFromDate(val));
	}

	public java.util.Date getDateCreated() {
		return GenericBase.__getDateFromSQL(__current_data[12]);
	}

	public void setEmployeeIdUpdated(java.lang.Integer val) {
		setCurrentData(13, val);
	}

	public java.lang.Integer getEmployeeIdUpdated() {
		return GenericBase.__getInt(__current_data[13]);
	}

	public void setDateUpdated(java.util.Date val) {
		setCurrentData(14, generateTimestampFromDate(val));
	}

	public java.util.Date getDateUpdated() {
		return GenericBase.__getDateFromSQL(__current_data[14]);
	}

	public void setConditionReceiptId(String op, java.lang.Integer val) {
		setConditionReceiptId(op, val, CONDITION_AND);
	}

	public void setConditionReceiptId(String op, java.lang.Integer val, String relation) {
		addCondition(0, op, relation, val);
	}

	public void setSelectReceiptId(boolean val) {
		__select_flags[0] = val;
	}

	public void setReceiptIdExpression(String val) {
		__dataExpressions[0] = val;
	}

	public void setConditionReceiptCode(String op, java.lang.String val) {
		setConditionReceiptCode(op, val, CONDITION_AND);
	}

	public void setConditionReceiptCode(String op, java.lang.String val, String relation) {
		addCondition(1, op, relation, val);
	}

	public void setSelectReceiptCode(boolean val) {
		__select_flags[1] = val;
	}

	public void setReceiptCodeExpression(String val) {
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

	public void setConditionEmployeeIdMaintainer(String op, java.lang.Integer val) {
		setConditionEmployeeIdMaintainer(op, val, CONDITION_AND);
	}

	public void setConditionEmployeeIdMaintainer(String op, java.lang.Integer val, String relation) {
		addCondition(3, op, relation, val);
	}

	public void setSelectEmployeeIdMaintainer(boolean val) {
		__select_flags[3] = val;
	}

	public void setEmployeeIdMaintainerExpression(String val) {
		__dataExpressions[3] = val;
	}

	public void setConditionStatusReceipt(String op, java.lang.Integer val) {
		setConditionStatusReceipt(op, val, CONDITION_AND);
	}

	public void setConditionStatusReceipt(String op, java.lang.Integer val, String relation) {
		addCondition(4, op, relation, val);
	}

	public void setSelectStatusReceipt(boolean val) {
		__select_flags[4] = val;
	}

	public void setStatusReceiptExpression(String val) {
		__dataExpressions[4] = val;
	}

	public void setConditionDepartmentId(String op, java.lang.Integer val) {
		setConditionDepartmentId(op, val, CONDITION_AND);
	}

	public void setConditionDepartmentId(String op, java.lang.Integer val, String relation) {
		addCondition(5, op, relation, val);
	}

	public void setSelectDepartmentId(boolean val) {
		__select_flags[5] = val;
	}

	public void setDepartmentIdExpression(String val) {
		__dataExpressions[5] = val;
	}

	public void setConditionDateReceipted(String op, java.util.Date val) {
		setConditionDateReceipted(op, val, CONDITION_AND);
	}

	public void setConditionDateReceipted(String op, java.util.Date val, String relation) {
		addCondition(6, op, relation, generateTimestampFromDate(val));
	}

	public void setSelectDateReceipted(boolean val) {
		__select_flags[6] = val;
	}

	public void setDateReceiptedExpression(String val) {
		__dataExpressions[6] = val;
	}

	public void setConditionDateValidation(String op, java.util.Date val) {
		setConditionDateValidation(op, val, CONDITION_AND);
	}

	public void setConditionDateValidation(String op, java.util.Date val, String relation) {
		addCondition(7, op, relation, generateTimestampFromDate(val));
	}

	public void setSelectDateValidation(boolean val) {
		__select_flags[7] = val;
	}

	public void setDateValidationExpression(String val) {
		__dataExpressions[7] = val;
	}

	public void setConditionDateInvalidation(String op, java.util.Date val) {
		setConditionDateInvalidation(op, val, CONDITION_AND);
	}

	public void setConditionDateInvalidation(String op, java.util.Date val, String relation) {
		addCondition(8, op, relation, generateTimestampFromDate(val));
	}

	public void setSelectDateInvalidation(boolean val) {
		__select_flags[8] = val;
	}

	public void setDateInvalidationExpression(String val) {
		__dataExpressions[8] = val;
	}

	public void setConditionReasonInvalidation(String op, java.lang.Integer val) {
		setConditionReasonInvalidation(op, val, CONDITION_AND);
	}

	public void setConditionReasonInvalidation(String op, java.lang.Integer val, String relation) {
		addCondition(9, op, relation, val);
	}

	public void setSelectReasonInvalidation(boolean val) {
		__select_flags[9] = val;
	}

	public void setReasonInvalidationExpression(String val) {
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

	public void setConditionPaymentMethodAccepted(String op, java.lang.Integer val) {
		setConditionPaymentMethodAccepted(op, val, CONDITION_AND);
	}

	public void setConditionPaymentMethodAccepted(String op, java.lang.Integer val, String relation) {
		addCondition(11, op, relation, val);
	}

	public void setSelectPaymentMethodAccepted(boolean val) {
		__select_flags[11] = val;
	}

	public void setPaymentMethodAcceptedExpression(String val) {
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

	public void setConditionEmployeeIdUpdated(String op, java.lang.Integer val) {
		setConditionEmployeeIdUpdated(op, val, CONDITION_AND);
	}

	public void setConditionEmployeeIdUpdated(String op, java.lang.Integer val, String relation) {
		addCondition(13, op, relation, val);
	}

	public void setSelectEmployeeIdUpdated(boolean val) {
		__select_flags[13] = val;
	}

	public void setEmployeeIdUpdatedExpression(String val) {
		__dataExpressions[13] = val;
	}

	public void setConditionDateUpdated(String op, java.util.Date val) {
		setConditionDateUpdated(op, val, CONDITION_AND);
	}

	public void setConditionDateUpdated(String op, java.util.Date val, String relation) {
		addCondition(14, op, relation, generateTimestampFromDate(val));
	}

	public void setSelectDateUpdated(boolean val) {
		__select_flags[14] = val;
	}

	public void setDateUpdatedExpression(String val) {
		__dataExpressions[14] = val;
	}


}

