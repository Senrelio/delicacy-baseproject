package fix.db.dao;

import delicacy.common.AbstractTable;
import delicacy.common.GenericBase;
import fix.db.bean.BaseFinReceivable;


public class FinReceivable extends AbstractTable<BaseFinReceivable>
{

	public FinReceivable() throws java.sql.SQLException 
	{

		initColumnNames();
	}

	protected final void initColumnNames()  throws java.sql.SQLException {

		__columnCount          = 22;

		initTables();

		__tableName            = "fin_receivables";

		__key_columns          = new int[0];

		__column_names[0] = BaseFinReceivable.CS_RECEIVABLE_ID;
		__column_names[1] = BaseFinReceivable.CS_ENTITY_TYPE;
		__column_names[2] = BaseFinReceivable.CS_DESCRIPTION;
		__column_names[3] = BaseFinReceivable.CS_EMPLOYEE_ID_MAINTAINER;
		__column_names[4] = BaseFinReceivable.CS_INVOICE_TYPE;
		__column_names[5] = BaseFinReceivable.CS_DEPARTMENT_ID;
		__column_names[6] = BaseFinReceivable.CS_DATE_VALIDATION;
		__column_names[7] = BaseFinReceivable.CS_CUSTOMER_ID;
		__column_names[8] = BaseFinReceivable.CS_DATE_INVALIDATION;
		__column_names[9] = BaseFinReceivable.CS_EMPLOYEE_ID_CREATED;
		__column_names[10] = BaseFinReceivable.CS_REASON_INVALIDATION;
		__column_names[11] = BaseFinReceivable.CS_DATE_CREATED;
		__column_names[12] = BaseFinReceivable.CS_DATE_DUE;
		__column_names[13] = BaseFinReceivable.CS_EMPLOYEE_ID_UPDATED;
		__column_names[14] = BaseFinReceivable.CS_STATUS_RECEIVABLE;
		__column_names[15] = BaseFinReceivable.CS_CONTACT_ID;
		__column_names[16] = BaseFinReceivable.CS_FLAG_OVERTIME;
		__column_names[17] = BaseFinReceivable.CS_DATE_UPDATED;
		__column_names[18] = BaseFinReceivable.CS_MOBILE;
		__column_names[19] = BaseFinReceivable.CS_COMPANY_NAME_INVOICE;
		__column_names[20] = BaseFinReceivable.CS_ADDRESS_DELIVERY;
		__column_names[21] = BaseFinReceivable.CS_POSTCODE;

		resetSelectFlags() ;
		resetInsertFlags() ;
	}

	public void resetInsertFlags(){
		for(int i = 0; i < __columnCount; i ++ ) __insert_flags[i] = true;
	}

	public void setPrimaryKeyFromBase(BaseFinReceivable b) {
		clear();
	}

	public boolean isPrimaryKeyNull() {
		return true;
	}

	@Override
	public BaseFinReceivable generateBase(){
		BaseFinReceivable b = new BaseFinReceivable();
		setDataToBase(b);
		return b;
	}

	@Override
	public void setDataToBase(BaseFinReceivable b){
		int count = 0; Object val;
		if((val = __current_data[count++]) != null) b.setReceivableId(GenericBase.__getInt(val));
		if((val = __current_data[count++]) != null) b.setEntityType(GenericBase.__getInt(val));
		if((val = __current_data[count++]) != null) b.setDescription(GenericBase.__getString(val));
		if((val = __current_data[count++]) != null) b.setEmployeeIdMaintainer(GenericBase.__getInt(val));
		if((val = __current_data[count++]) != null) b.setInvoiceType(GenericBase.__getInt(val));
		if((val = __current_data[count++]) != null) b.setDepartmentId(GenericBase.__getInt(val));
		if((val = __current_data[count++]) != null) b.setDateValidation(GenericBase.__getDateFromSQL(val));
		if((val = __current_data[count++]) != null) b.setCustomerId(GenericBase.__getInt(val));
		if((val = __current_data[count++]) != null) b.setDateInvalidation(GenericBase.__getDateFromSQL(val));
		if((val = __current_data[count++]) != null) b.setEmployeeIdCreated(GenericBase.__getInt(val));
		if((val = __current_data[count++]) != null) b.setReasonInvalidation(GenericBase.__getInt(val));
		if((val = __current_data[count++]) != null) b.setDateCreated(GenericBase.__getDateFromSQL(val));
		if((val = __current_data[count++]) != null) b.setDateDue(GenericBase.__getDateFromSQL(val));
		if((val = __current_data[count++]) != null) b.setEmployeeIdUpdated(GenericBase.__getInt(val));
		if((val = __current_data[count++]) != null) b.setStatusReceivable(GenericBase.__getInt(val));
		if((val = __current_data[count++]) != null) b.setContactId(GenericBase.__getInt(val));
		if((val = __current_data[count++]) != null) b.setFlagOvertime(GenericBase.__getBoolean(val));
		if((val = __current_data[count++]) != null) b.setDateUpdated(GenericBase.__getDateFromSQL(val));
		if((val = __current_data[count++]) != null) b.setMobile(GenericBase.__getString(val));
		if((val = __current_data[count++]) != null) b.setCompanyNameInvoice(GenericBase.__getString(val));
		if((val = __current_data[count++]) != null) b.setAddressDelivery(GenericBase.__getString(val));
		if((val = __current_data[count++]) != null) b.setPostcode(GenericBase.__getString(val));
	}

	@Override
	public void setBaseToBuffer(BaseFinReceivable b, Object[] buff){
		int count = 0;
		buff[count++] = b.getReceivableId();
		buff[count++] = b.getEntityType();
		buff[count++] = b.getDescription();
		buff[count++] = b.getEmployeeIdMaintainer();
		buff[count++] = b.getInvoiceType();
		buff[count++] = b.getDepartmentId();
		buff[count++] = generateTimestampFromDate(b.getDateValidation());
		buff[count++] = b.getCustomerId();
		buff[count++] = generateTimestampFromDate(b.getDateInvalidation());
		buff[count++] = b.getEmployeeIdCreated();
		buff[count++] = b.getReasonInvalidation();
		buff[count++] = generateTimestampFromDate(b.getDateCreated());
		buff[count++] = generateTimestampFromDate(b.getDateDue());
		buff[count++] = b.getEmployeeIdUpdated();
		buff[count++] = b.getStatusReceivable();
		buff[count++] = b.getContactId();
		buff[count++] = b.getFlagOvertime();
		buff[count++] = generateTimestampFromDate(b.getDateUpdated());
		buff[count++] = b.getMobile();
		buff[count++] = b.getCompanyNameInvoice();
		buff[count++] = b.getAddressDelivery();
		buff[count++] = b.getPostcode();
	}

	@Override
	public void setDataFromBase(BaseFinReceivable b){
		if(b.getReceivableId() != null) setReceivableId(b.getReceivableId());
		if(b.getEntityType() != null) setEntityType(b.getEntityType());
		if(b.getDescription() != null) setDescription(b.getDescription());
		if(b.getEmployeeIdMaintainer() != null) setEmployeeIdMaintainer(b.getEmployeeIdMaintainer());
		if(b.getInvoiceType() != null) setInvoiceType(b.getInvoiceType());
		if(b.getDepartmentId() != null) setDepartmentId(b.getDepartmentId());
		if(b.getDateValidation() != null) setDateValidation(b.getDateValidation());
		if(b.getCustomerId() != null) setCustomerId(b.getCustomerId());
		if(b.getDateInvalidation() != null) setDateInvalidation(b.getDateInvalidation());
		if(b.getEmployeeIdCreated() != null) setEmployeeIdCreated(b.getEmployeeIdCreated());
		if(b.getReasonInvalidation() != null) setReasonInvalidation(b.getReasonInvalidation());
		if(b.getDateCreated() != null) setDateCreated(b.getDateCreated());
		if(b.getDateDue() != null) setDateDue(b.getDateDue());
		if(b.getEmployeeIdUpdated() != null) setEmployeeIdUpdated(b.getEmployeeIdUpdated());
		if(b.getStatusReceivable() != null) setStatusReceivable(b.getStatusReceivable());
		if(b.getContactId() != null) setContactId(b.getContactId());
		if(b.getFlagOvertime() != null) setFlagOvertime(b.getFlagOvertime());
		if(b.getDateUpdated() != null) setDateUpdated(b.getDateUpdated());
		if(b.getMobile() != null) setMobile(b.getMobile());
		if(b.getCompanyNameInvoice() != null) setCompanyNameInvoice(b.getCompanyNameInvoice());
		if(b.getAddressDelivery() != null) setAddressDelivery(b.getAddressDelivery());
		if(b.getPostcode() != null) setPostcode(b.getPostcode());
	}

	@Override
	public BaseFinReceivable generateBaseFromResultSet(java.sql.ResultSet sdr)  throws java.sql.SQLException {

		BaseFinReceivable b = new BaseFinReceivable();
		setQueryResultToBase(b, sdr);
		return b;
	}

	@Override
	public void setQueryResultToBase(BaseFinReceivable __base, java.sql.ResultSet sdr ) throws java.sql.SQLException {
		int count = 1, index = 0;
		java.sql.ResultSetMetaData rsmd = sdr.getMetaData();
		int columnCount = rsmd.getColumnCount();
		Object val;
		if(__select_flags[index++] && count <= columnCount && (val = sdr.getObject(count++)) != null) __base.setReceivableId(GenericBase.__getInt(val));
		if(__select_flags[index++] && count <= columnCount && (val = sdr.getObject(count++)) != null) __base.setEntityType(GenericBase.__getInt(val));
		if(__select_flags[index++] && count <= columnCount && (val = sdr.getObject(count++)) != null) __base.setDescription(GenericBase.__getString(val));
		if(__select_flags[index++] && count <= columnCount && (val = sdr.getObject(count++)) != null) __base.setEmployeeIdMaintainer(GenericBase.__getInt(val));
		if(__select_flags[index++] && count <= columnCount && (val = sdr.getObject(count++)) != null) __base.setInvoiceType(GenericBase.__getInt(val));
		if(__select_flags[index++] && count <= columnCount && (val = sdr.getObject(count++)) != null) __base.setDepartmentId(GenericBase.__getInt(val));
		if(__select_flags[index++] && count <= columnCount && (val = sdr.getObject(count++)) != null) __base.setDateValidation(GenericBase.__getDateFromSQL(val));
		if(__select_flags[index++] && count <= columnCount && (val = sdr.getObject(count++)) != null) __base.setCustomerId(GenericBase.__getInt(val));
		if(__select_flags[index++] && count <= columnCount && (val = sdr.getObject(count++)) != null) __base.setDateInvalidation(GenericBase.__getDateFromSQL(val));
		if(__select_flags[index++] && count <= columnCount && (val = sdr.getObject(count++)) != null) __base.setEmployeeIdCreated(GenericBase.__getInt(val));
		if(__select_flags[index++] && count <= columnCount && (val = sdr.getObject(count++)) != null) __base.setReasonInvalidation(GenericBase.__getInt(val));
		if(__select_flags[index++] && count <= columnCount && (val = sdr.getObject(count++)) != null) __base.setDateCreated(GenericBase.__getDateFromSQL(val));
		if(__select_flags[index++] && count <= columnCount && (val = sdr.getObject(count++)) != null) __base.setDateDue(GenericBase.__getDateFromSQL(val));
		if(__select_flags[index++] && count <= columnCount && (val = sdr.getObject(count++)) != null) __base.setEmployeeIdUpdated(GenericBase.__getInt(val));
		if(__select_flags[index++] && count <= columnCount && (val = sdr.getObject(count++)) != null) __base.setStatusReceivable(GenericBase.__getInt(val));
		if(__select_flags[index++] && count <= columnCount && (val = sdr.getObject(count++)) != null) __base.setContactId(GenericBase.__getInt(val));
		if(__select_flags[index++] && count <= columnCount && (val = sdr.getObject(count++)) != null) __base.setFlagOvertime(GenericBase.__getBoolean(val));
		if(__select_flags[index++] && count <= columnCount && (val = sdr.getObject(count++)) != null) __base.setDateUpdated(GenericBase.__getDateFromSQL(val));
		if(__select_flags[index++] && count <= columnCount && (val = sdr.getObject(count++)) != null) __base.setMobile(GenericBase.__getString(val));
		if(__select_flags[index++] && count <= columnCount && (val = sdr.getObject(count++)) != null) __base.setCompanyNameInvoice(GenericBase.__getString(val));
		if(__select_flags[index++] && count <= columnCount && (val = sdr.getObject(count++)) != null) __base.setAddressDelivery(GenericBase.__getString(val));
		if(__select_flags[index++] && count <= columnCount && (val = sdr.getObject(count++)) != null) __base.setPostcode(GenericBase.__getString(val));
	}

	public void setReceivableId(java.lang.Integer val) {
		setCurrentData(0, val);
	}

	public java.lang.Integer getReceivableId() {
		return GenericBase.__getInt(__current_data[0]);
	}

	public void setEntityType(java.lang.Integer val) {
		setCurrentData(1, val);
	}

	public java.lang.Integer getEntityType() {
		return GenericBase.__getInt(__current_data[1]);
	}

	public void setDescription(java.lang.String val) {
		setCurrentData(2, val);
	}

	public java.lang.String getDescription() {
		return GenericBase.__getString(__current_data[2]);
	}

	public void setEmployeeIdMaintainer(java.lang.Integer val) {
		setCurrentData(3, val);
	}

	public java.lang.Integer getEmployeeIdMaintainer() {
		return GenericBase.__getInt(__current_data[3]);
	}

	public void setInvoiceType(java.lang.Integer val) {
		setCurrentData(4, val);
	}

	public java.lang.Integer getInvoiceType() {
		return GenericBase.__getInt(__current_data[4]);
	}

	public void setDepartmentId(java.lang.Integer val) {
		setCurrentData(5, val);
	}

	public java.lang.Integer getDepartmentId() {
		return GenericBase.__getInt(__current_data[5]);
	}

	public void setDateValidation(java.util.Date val) {
		setCurrentData(6, generateTimestampFromDate(val));
	}

	public java.util.Date getDateValidation() {
		return GenericBase.__getDateFromSQL(__current_data[6]);
	}

	public void setCustomerId(java.lang.Integer val) {
		setCurrentData(7, val);
	}

	public java.lang.Integer getCustomerId() {
		return GenericBase.__getInt(__current_data[7]);
	}

	public void setDateInvalidation(java.util.Date val) {
		setCurrentData(8, generateTimestampFromDate(val));
	}

	public java.util.Date getDateInvalidation() {
		return GenericBase.__getDateFromSQL(__current_data[8]);
	}

	public void setEmployeeIdCreated(java.lang.Integer val) {
		setCurrentData(9, val);
	}

	public java.lang.Integer getEmployeeIdCreated() {
		return GenericBase.__getInt(__current_data[9]);
	}

	public void setReasonInvalidation(java.lang.Integer val) {
		setCurrentData(10, val);
	}

	public java.lang.Integer getReasonInvalidation() {
		return GenericBase.__getInt(__current_data[10]);
	}

	public void setDateCreated(java.util.Date val) {
		setCurrentData(11, generateTimestampFromDate(val));
	}

	public java.util.Date getDateCreated() {
		return GenericBase.__getDateFromSQL(__current_data[11]);
	}

	public void setDateDue(java.util.Date val) {
		setCurrentData(12, generateTimestampFromDate(val));
	}

	public java.util.Date getDateDue() {
		return GenericBase.__getDateFromSQL(__current_data[12]);
	}

	public void setEmployeeIdUpdated(java.lang.Integer val) {
		setCurrentData(13, val);
	}

	public java.lang.Integer getEmployeeIdUpdated() {
		return GenericBase.__getInt(__current_data[13]);
	}

	public void setStatusReceivable(java.lang.Integer val) {
		setCurrentData(14, val);
	}

	public java.lang.Integer getStatusReceivable() {
		return GenericBase.__getInt(__current_data[14]);
	}

	public void setContactId(java.lang.Integer val) {
		setCurrentData(15, val);
	}

	public java.lang.Integer getContactId() {
		return GenericBase.__getInt(__current_data[15]);
	}

	public void setFlagOvertime(java.lang.Boolean val) {
		setCurrentData(16, val);
	}

	public java.lang.Boolean getFlagOvertime() {
		return GenericBase.__getBoolean(__current_data[16]);
	}

	public void setDateUpdated(java.util.Date val) {
		setCurrentData(17, generateTimestampFromDate(val));
	}

	public java.util.Date getDateUpdated() {
		return GenericBase.__getDateFromSQL(__current_data[17]);
	}

	public void setMobile(java.lang.String val) {
		setCurrentData(18, val);
	}

	public java.lang.String getMobile() {
		return GenericBase.__getString(__current_data[18]);
	}

	public void setCompanyNameInvoice(java.lang.String val) {
		setCurrentData(19, val);
	}

	public java.lang.String getCompanyNameInvoice() {
		return GenericBase.__getString(__current_data[19]);
	}

	public void setAddressDelivery(java.lang.String val) {
		setCurrentData(20, val);
	}

	public java.lang.String getAddressDelivery() {
		return GenericBase.__getString(__current_data[20]);
	}

	public void setPostcode(java.lang.String val) {
		setCurrentData(21, val);
	}

	public java.lang.String getPostcode() {
		return GenericBase.__getString(__current_data[21]);
	}

	public void setConditionReceivableId(String op, java.lang.Integer val) {
		setConditionReceivableId(op, val, CONDITION_AND);
	}

	public void setConditionReceivableId(String op, java.lang.Integer val, String relation) {
		addCondition(0, op, relation, val);
	}

	public void setSelectReceivableId(boolean val) {
		__select_flags[0] = val;
	}

	public void setReceivableIdExpression(String val) {
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

	public void setConditionDescription(String op, java.lang.String val) {
		setConditionDescription(op, val, CONDITION_AND);
	}

	public void setConditionDescription(String op, java.lang.String val, String relation) {
		addCondition(2, op, relation, val);
	}

	public void setSelectDescription(boolean val) {
		__select_flags[2] = val;
	}

	public void setDescriptionExpression(String val) {
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

	public void setConditionInvoiceType(String op, java.lang.Integer val) {
		setConditionInvoiceType(op, val, CONDITION_AND);
	}

	public void setConditionInvoiceType(String op, java.lang.Integer val, String relation) {
		addCondition(4, op, relation, val);
	}

	public void setSelectInvoiceType(boolean val) {
		__select_flags[4] = val;
	}

	public void setInvoiceTypeExpression(String val) {
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

	public void setConditionDateValidation(String op, java.util.Date val) {
		setConditionDateValidation(op, val, CONDITION_AND);
	}

	public void setConditionDateValidation(String op, java.util.Date val, String relation) {
		addCondition(6, op, relation, generateTimestampFromDate(val));
	}

	public void setSelectDateValidation(boolean val) {
		__select_flags[6] = val;
	}

	public void setDateValidationExpression(String val) {
		__dataExpressions[6] = val;
	}

	public void setConditionCustomerId(String op, java.lang.Integer val) {
		setConditionCustomerId(op, val, CONDITION_AND);
	}

	public void setConditionCustomerId(String op, java.lang.Integer val, String relation) {
		addCondition(7, op, relation, val);
	}

	public void setSelectCustomerId(boolean val) {
		__select_flags[7] = val;
	}

	public void setCustomerIdExpression(String val) {
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

	public void setConditionEmployeeIdCreated(String op, java.lang.Integer val) {
		setConditionEmployeeIdCreated(op, val, CONDITION_AND);
	}

	public void setConditionEmployeeIdCreated(String op, java.lang.Integer val, String relation) {
		addCondition(9, op, relation, val);
	}

	public void setSelectEmployeeIdCreated(boolean val) {
		__select_flags[9] = val;
	}

	public void setEmployeeIdCreatedExpression(String val) {
		__dataExpressions[9] = val;
	}

	public void setConditionReasonInvalidation(String op, java.lang.Integer val) {
		setConditionReasonInvalidation(op, val, CONDITION_AND);
	}

	public void setConditionReasonInvalidation(String op, java.lang.Integer val, String relation) {
		addCondition(10, op, relation, val);
	}

	public void setSelectReasonInvalidation(boolean val) {
		__select_flags[10] = val;
	}

	public void setReasonInvalidationExpression(String val) {
		__dataExpressions[10] = val;
	}

	public void setConditionDateCreated(String op, java.util.Date val) {
		setConditionDateCreated(op, val, CONDITION_AND);
	}

	public void setConditionDateCreated(String op, java.util.Date val, String relation) {
		addCondition(11, op, relation, generateTimestampFromDate(val));
	}

	public void setSelectDateCreated(boolean val) {
		__select_flags[11] = val;
	}

	public void setDateCreatedExpression(String val) {
		__dataExpressions[11] = val;
	}

	public void setConditionDateDue(String op, java.util.Date val) {
		setConditionDateDue(op, val, CONDITION_AND);
	}

	public void setConditionDateDue(String op, java.util.Date val, String relation) {
		addCondition(12, op, relation, generateTimestampFromDate(val));
	}

	public void setSelectDateDue(boolean val) {
		__select_flags[12] = val;
	}

	public void setDateDueExpression(String val) {
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

	public void setConditionStatusReceivable(String op, java.lang.Integer val) {
		setConditionStatusReceivable(op, val, CONDITION_AND);
	}

	public void setConditionStatusReceivable(String op, java.lang.Integer val, String relation) {
		addCondition(14, op, relation, val);
	}

	public void setSelectStatusReceivable(boolean val) {
		__select_flags[14] = val;
	}

	public void setStatusReceivableExpression(String val) {
		__dataExpressions[14] = val;
	}

	public void setConditionContactId(String op, java.lang.Integer val) {
		setConditionContactId(op, val, CONDITION_AND);
	}

	public void setConditionContactId(String op, java.lang.Integer val, String relation) {
		addCondition(15, op, relation, val);
	}

	public void setSelectContactId(boolean val) {
		__select_flags[15] = val;
	}

	public void setContactIdExpression(String val) {
		__dataExpressions[15] = val;
	}

	public void setConditionFlagOvertime(String op, java.lang.Boolean val) {
		setConditionFlagOvertime(op, val, CONDITION_AND);
	}

	public void setConditionFlagOvertime(String op, java.lang.Boolean val, String relation) {
		addCondition(16, op, relation, val);
	}

	public void setSelectFlagOvertime(boolean val) {
		__select_flags[16] = val;
	}

	public void setFlagOvertimeExpression(String val) {
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

	public void setConditionMobile(String op, java.lang.String val) {
		setConditionMobile(op, val, CONDITION_AND);
	}

	public void setConditionMobile(String op, java.lang.String val, String relation) {
		addCondition(18, op, relation, val);
	}

	public void setSelectMobile(boolean val) {
		__select_flags[18] = val;
	}

	public void setMobileExpression(String val) {
		__dataExpressions[18] = val;
	}

	public void setConditionCompanyNameInvoice(String op, java.lang.String val) {
		setConditionCompanyNameInvoice(op, val, CONDITION_AND);
	}

	public void setConditionCompanyNameInvoice(String op, java.lang.String val, String relation) {
		addCondition(19, op, relation, val);
	}

	public void setSelectCompanyNameInvoice(boolean val) {
		__select_flags[19] = val;
	}

	public void setCompanyNameInvoiceExpression(String val) {
		__dataExpressions[19] = val;
	}

	public void setConditionAddressDelivery(String op, java.lang.String val) {
		setConditionAddressDelivery(op, val, CONDITION_AND);
	}

	public void setConditionAddressDelivery(String op, java.lang.String val, String relation) {
		addCondition(20, op, relation, val);
	}

	public void setSelectAddressDelivery(boolean val) {
		__select_flags[20] = val;
	}

	public void setAddressDeliveryExpression(String val) {
		__dataExpressions[20] = val;
	}

	public void setConditionPostcode(String op, java.lang.String val) {
		setConditionPostcode(op, val, CONDITION_AND);
	}

	public void setConditionPostcode(String op, java.lang.String val, String relation) {
		addCondition(21, op, relation, val);
	}

	public void setSelectPostcode(boolean val) {
		__select_flags[21] = val;
	}

	public void setPostcodeExpression(String val) {
		__dataExpressions[21] = val;
	}


}

