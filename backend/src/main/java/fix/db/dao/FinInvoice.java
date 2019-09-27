package fix.db.dao;

import delicacy.common.AbstractTable;
import delicacy.common.GenericBase;
import fix.db.bean.BaseFinInvoice;


public class FinInvoice extends AbstractTable<BaseFinInvoice>
{

	public FinInvoice() throws java.sql.SQLException 
	{

		initColumnNames();
	}

	protected final void initColumnNames()  throws java.sql.SQLException {

		__columnCount          = 19;

		initTables();

		__tableName            = "fin_invoices";

		__key_columns          = new int[1];
		__key_columns[0] = 0;

		__column_names[0] = BaseFinInvoice.CS_INVOICE_ID;
		__column_names[1] = BaseFinInvoice.CS_INVOICE_CODE;
		__column_names[2] = BaseFinInvoice.CS_CUSTOMER_ID;
		__column_names[3] = BaseFinInvoice.CS_EMPLOYEE_ID_MAINTAINER;
		__column_names[4] = BaseFinInvoice.CS_CONTACT_NAME;
		__column_names[5] = BaseFinInvoice.CS_DEPARTMENT_ID;
		__column_names[6] = BaseFinInvoice.CS_CONTACT_MOBILE;
		__column_names[7] = BaseFinInvoice.CS_CUSTOMER_NAME;
		__column_names[8] = BaseFinInvoice.CS_ADDRESS_DELIVERY;
		__column_names[9] = BaseFinInvoice.CS_POSTCODE;
		__column_names[10] = BaseFinInvoice.CS_STATUS_INVOICE;
		__column_names[11] = BaseFinInvoice.CS_EMPLOYEE_ID_CREATED;
		__column_names[12] = BaseFinInvoice.CS_INVOICE_TYPE;
		__column_names[13] = BaseFinInvoice.CS_DATE_CREATED;
		__column_names[14] = BaseFinInvoice.CS_EMPLOYEE_ID_UPDATED;
		__column_names[15] = BaseFinInvoice.CS_DATE_ISSUED;
		__column_names[16] = BaseFinInvoice.CS_DATE_VALIDATION;
		__column_names[17] = BaseFinInvoice.CS_DATE_UPDATED;
		__column_names[18] = BaseFinInvoice.CS_DESCRIPTION_INVOICE;

		resetSelectFlags() ;
		resetInsertFlags() ;
	}

	public void resetInsertFlags(){
		for(int i = 0; i < __columnCount; i ++ ) __insert_flags[i] = true;
		__insert_flags[0] = false;
		__serial_column = 0;
	}

	public void setPrimaryKeyFromBase(BaseFinInvoice b) {
		clear();
		setInvoiceIdClear(b.getInvoiceId());
	}

	public boolean isPrimaryKeyNull() {
		return getInvoiceId() == null;
	}

	@Override
	public BaseFinInvoice generateBase(){
		BaseFinInvoice b = new BaseFinInvoice();
		setDataToBase(b);
		return b;
	}

	@Override
	public void setDataToBase(BaseFinInvoice b){
		int count = 0; Object val;
		if((val = __current_data[count++]) != null) b.setInvoiceId(GenericBase.__getInt(val));
		if((val = __current_data[count++]) != null) b.setInvoiceCode(GenericBase.__getString(val));
		if((val = __current_data[count++]) != null) b.setCustomerId(GenericBase.__getInt(val));
		if((val = __current_data[count++]) != null) b.setEmployeeIdMaintainer(GenericBase.__getInt(val));
		if((val = __current_data[count++]) != null) b.setContactName(GenericBase.__getString(val));
		if((val = __current_data[count++]) != null) b.setDepartmentId(GenericBase.__getInt(val));
		if((val = __current_data[count++]) != null) b.setContactMobile(GenericBase.__getString(val));
		if((val = __current_data[count++]) != null) b.setCustomerName(GenericBase.__getString(val));
		if((val = __current_data[count++]) != null) b.setAddressDelivery(GenericBase.__getString(val));
		if((val = __current_data[count++]) != null) b.setPostcode(GenericBase.__getString(val));
		if((val = __current_data[count++]) != null) b.setStatusInvoice(GenericBase.__getInt(val));
		if((val = __current_data[count++]) != null) b.setEmployeeIdCreated(GenericBase.__getInt(val));
		if((val = __current_data[count++]) != null) b.setInvoiceType(GenericBase.__getInt(val));
		if((val = __current_data[count++]) != null) b.setDateCreated(GenericBase.__getDateFromSQL(val));
		if((val = __current_data[count++]) != null) b.setEmployeeIdUpdated(GenericBase.__getInt(val));
		if((val = __current_data[count++]) != null) b.setDateIssued(GenericBase.__getDateFromSQL(val));
		if((val = __current_data[count++]) != null) b.setDateValidation(GenericBase.__getDateFromSQL(val));
		if((val = __current_data[count++]) != null) b.setDateUpdated(GenericBase.__getDateFromSQL(val));
		if((val = __current_data[count++]) != null) b.setDescriptionInvoice(GenericBase.__getString(val));
	}

	@Override
	public void setBaseToBuffer(BaseFinInvoice b, Object[] buff){
		int count = 0;
		buff[count++] = b.getInvoiceId();
		buff[count++] = b.getInvoiceCode();
		buff[count++] = b.getCustomerId();
		buff[count++] = b.getEmployeeIdMaintainer();
		buff[count++] = b.getContactName();
		buff[count++] = b.getDepartmentId();
		buff[count++] = b.getContactMobile();
		buff[count++] = b.getCustomerName();
		buff[count++] = b.getAddressDelivery();
		buff[count++] = b.getPostcode();
		buff[count++] = b.getStatusInvoice();
		buff[count++] = b.getEmployeeIdCreated();
		buff[count++] = b.getInvoiceType();
		buff[count++] = generateTimestampFromDate(b.getDateCreated());
		buff[count++] = b.getEmployeeIdUpdated();
		buff[count++] = generateTimestampFromDate(b.getDateIssued());
		buff[count++] = generateTimestampFromDate(b.getDateValidation());
		buff[count++] = generateTimestampFromDate(b.getDateUpdated());
		buff[count++] = b.getDescriptionInvoice();
	}

	@Override
	public void setDataFromBase(BaseFinInvoice b){
		if(b.getInvoiceId() != null) setInvoiceIdClear(b.getInvoiceId());
		if(b.getInvoiceCode() != null) setInvoiceCode(b.getInvoiceCode());
		if(b.getCustomerId() != null) setCustomerId(b.getCustomerId());
		if(b.getEmployeeIdMaintainer() != null) setEmployeeIdMaintainer(b.getEmployeeIdMaintainer());
		if(b.getContactName() != null) setContactName(b.getContactName());
		if(b.getDepartmentId() != null) setDepartmentId(b.getDepartmentId());
		if(b.getContactMobile() != null) setContactMobile(b.getContactMobile());
		if(b.getCustomerName() != null) setCustomerName(b.getCustomerName());
		if(b.getAddressDelivery() != null) setAddressDelivery(b.getAddressDelivery());
		if(b.getPostcode() != null) setPostcode(b.getPostcode());
		if(b.getStatusInvoice() != null) setStatusInvoice(b.getStatusInvoice());
		if(b.getEmployeeIdCreated() != null) setEmployeeIdCreated(b.getEmployeeIdCreated());
		if(b.getInvoiceType() != null) setInvoiceType(b.getInvoiceType());
		if(b.getDateCreated() != null) setDateCreated(b.getDateCreated());
		if(b.getEmployeeIdUpdated() != null) setEmployeeIdUpdated(b.getEmployeeIdUpdated());
		if(b.getDateIssued() != null) setDateIssued(b.getDateIssued());
		if(b.getDateValidation() != null) setDateValidation(b.getDateValidation());
		if(b.getDateUpdated() != null) setDateUpdated(b.getDateUpdated());
		if(b.getDescriptionInvoice() != null) setDescriptionInvoice(b.getDescriptionInvoice());
	}

	@Override
	public BaseFinInvoice generateBaseFromResultSet(java.sql.ResultSet sdr)  throws java.sql.SQLException {

		BaseFinInvoice b = new BaseFinInvoice();
		setQueryResultToBase(b, sdr);
		return b;
	}

	@Override
	public void setQueryResultToBase(BaseFinInvoice __base, java.sql.ResultSet sdr ) throws java.sql.SQLException {
		int count = 1, index = 0;
		java.sql.ResultSetMetaData rsmd = sdr.getMetaData();
		int columnCount = rsmd.getColumnCount();
		Object val;
		if(__select_flags[index++] && count <= columnCount && (val = sdr.getObject(count++)) != null) __base.setInvoiceId(GenericBase.__getInt(val));
		if(__select_flags[index++] && count <= columnCount && (val = sdr.getObject(count++)) != null) __base.setInvoiceCode(GenericBase.__getString(val));
		if(__select_flags[index++] && count <= columnCount && (val = sdr.getObject(count++)) != null) __base.setCustomerId(GenericBase.__getInt(val));
		if(__select_flags[index++] && count <= columnCount && (val = sdr.getObject(count++)) != null) __base.setEmployeeIdMaintainer(GenericBase.__getInt(val));
		if(__select_flags[index++] && count <= columnCount && (val = sdr.getObject(count++)) != null) __base.setContactName(GenericBase.__getString(val));
		if(__select_flags[index++] && count <= columnCount && (val = sdr.getObject(count++)) != null) __base.setDepartmentId(GenericBase.__getInt(val));
		if(__select_flags[index++] && count <= columnCount && (val = sdr.getObject(count++)) != null) __base.setContactMobile(GenericBase.__getString(val));
		if(__select_flags[index++] && count <= columnCount && (val = sdr.getObject(count++)) != null) __base.setCustomerName(GenericBase.__getString(val));
		if(__select_flags[index++] && count <= columnCount && (val = sdr.getObject(count++)) != null) __base.setAddressDelivery(GenericBase.__getString(val));
		if(__select_flags[index++] && count <= columnCount && (val = sdr.getObject(count++)) != null) __base.setPostcode(GenericBase.__getString(val));
		if(__select_flags[index++] && count <= columnCount && (val = sdr.getObject(count++)) != null) __base.setStatusInvoice(GenericBase.__getInt(val));
		if(__select_flags[index++] && count <= columnCount && (val = sdr.getObject(count++)) != null) __base.setEmployeeIdCreated(GenericBase.__getInt(val));
		if(__select_flags[index++] && count <= columnCount && (val = sdr.getObject(count++)) != null) __base.setInvoiceType(GenericBase.__getInt(val));
		if(__select_flags[index++] && count <= columnCount && (val = sdr.getObject(count++)) != null) __base.setDateCreated(GenericBase.__getDateFromSQL(val));
		if(__select_flags[index++] && count <= columnCount && (val = sdr.getObject(count++)) != null) __base.setEmployeeIdUpdated(GenericBase.__getInt(val));
		if(__select_flags[index++] && count <= columnCount && (val = sdr.getObject(count++)) != null) __base.setDateIssued(GenericBase.__getDateFromSQL(val));
		if(__select_flags[index++] && count <= columnCount && (val = sdr.getObject(count++)) != null) __base.setDateValidation(GenericBase.__getDateFromSQL(val));
		if(__select_flags[index++] && count <= columnCount && (val = sdr.getObject(count++)) != null) __base.setDateUpdated(GenericBase.__getDateFromSQL(val));
		if(__select_flags[index++] && count <= columnCount && (val = sdr.getObject(count++)) != null) __base.setDescriptionInvoice(GenericBase.__getString(val));
	}

	public void setInvoiceId(java.lang.Integer val) {
		setCurrentData(0, val);
	}

	public java.lang.Integer getInvoiceId() {
		return GenericBase.__getInt(__current_data[0]);
	}

	public void setInvoiceIdClear(java.lang.Integer val) {
		__backup_data[0] = __current_data[0] =  val;
		__modified_flags[0] = false;
	}

	public void setInvoiceCode(java.lang.String val) {
		setCurrentData(1, val);
	}

	public java.lang.String getInvoiceCode() {
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

	public void setContactName(java.lang.String val) {
		setCurrentData(4, val);
	}

	public java.lang.String getContactName() {
		return GenericBase.__getString(__current_data[4]);
	}

	public void setDepartmentId(java.lang.Integer val) {
		setCurrentData(5, val);
	}

	public java.lang.Integer getDepartmentId() {
		return GenericBase.__getInt(__current_data[5]);
	}

	public void setContactMobile(java.lang.String val) {
		setCurrentData(6, val);
	}

	public java.lang.String getContactMobile() {
		return GenericBase.__getString(__current_data[6]);
	}

	public void setCustomerName(java.lang.String val) {
		setCurrentData(7, val);
	}

	public java.lang.String getCustomerName() {
		return GenericBase.__getString(__current_data[7]);
	}

	public void setAddressDelivery(java.lang.String val) {
		setCurrentData(8, val);
	}

	public java.lang.String getAddressDelivery() {
		return GenericBase.__getString(__current_data[8]);
	}

	public void setPostcode(java.lang.String val) {
		setCurrentData(9, val);
	}

	public java.lang.String getPostcode() {
		return GenericBase.__getString(__current_data[9]);
	}

	public void setStatusInvoice(java.lang.Integer val) {
		setCurrentData(10, val);
	}

	public java.lang.Integer getStatusInvoice() {
		return GenericBase.__getInt(__current_data[10]);
	}

	public void setEmployeeIdCreated(java.lang.Integer val) {
		setCurrentData(11, val);
	}

	public java.lang.Integer getEmployeeIdCreated() {
		return GenericBase.__getInt(__current_data[11]);
	}

	public void setInvoiceType(java.lang.Integer val) {
		setCurrentData(12, val);
	}

	public java.lang.Integer getInvoiceType() {
		return GenericBase.__getInt(__current_data[12]);
	}

	public void setDateCreated(java.util.Date val) {
		setCurrentData(13, generateTimestampFromDate(val));
	}

	public java.util.Date getDateCreated() {
		return GenericBase.__getDateFromSQL(__current_data[13]);
	}

	public void setEmployeeIdUpdated(java.lang.Integer val) {
		setCurrentData(14, val);
	}

	public java.lang.Integer getEmployeeIdUpdated() {
		return GenericBase.__getInt(__current_data[14]);
	}

	public void setDateIssued(java.util.Date val) {
		setCurrentData(15, generateTimestampFromDate(val));
	}

	public java.util.Date getDateIssued() {
		return GenericBase.__getDateFromSQL(__current_data[15]);
	}

	public void setDateValidation(java.util.Date val) {
		setCurrentData(16, generateTimestampFromDate(val));
	}

	public java.util.Date getDateValidation() {
		return GenericBase.__getDateFromSQL(__current_data[16]);
	}

	public void setDateUpdated(java.util.Date val) {
		setCurrentData(17, generateTimestampFromDate(val));
	}

	public java.util.Date getDateUpdated() {
		return GenericBase.__getDateFromSQL(__current_data[17]);
	}

	public void setDescriptionInvoice(java.lang.String val) {
		setCurrentData(18, val);
	}

	public java.lang.String getDescriptionInvoice() {
		return GenericBase.__getString(__current_data[18]);
	}

	public void setConditionInvoiceId(String op, java.lang.Integer val) {
		setConditionInvoiceId(op, val, CONDITION_AND);
	}

	public void setConditionInvoiceId(String op, java.lang.Integer val, String relation) {
		addCondition(0, op, relation, val);
	}

	public void setSelectInvoiceId(boolean val) {
		__select_flags[0] = val;
	}

	public void setInvoiceIdExpression(String val) {
		__dataExpressions[0] = val;
	}

	public void setConditionInvoiceCode(String op, java.lang.String val) {
		setConditionInvoiceCode(op, val, CONDITION_AND);
	}

	public void setConditionInvoiceCode(String op, java.lang.String val, String relation) {
		addCondition(1, op, relation, val);
	}

	public void setSelectInvoiceCode(boolean val) {
		__select_flags[1] = val;
	}

	public void setInvoiceCodeExpression(String val) {
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

	public void setConditionContactName(String op, java.lang.String val) {
		setConditionContactName(op, val, CONDITION_AND);
	}

	public void setConditionContactName(String op, java.lang.String val, String relation) {
		addCondition(4, op, relation, val);
	}

	public void setSelectContactName(boolean val) {
		__select_flags[4] = val;
	}

	public void setContactNameExpression(String val) {
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

	public void setConditionContactMobile(String op, java.lang.String val) {
		setConditionContactMobile(op, val, CONDITION_AND);
	}

	public void setConditionContactMobile(String op, java.lang.String val, String relation) {
		addCondition(6, op, relation, val);
	}

	public void setSelectContactMobile(boolean val) {
		__select_flags[6] = val;
	}

	public void setContactMobileExpression(String val) {
		__dataExpressions[6] = val;
	}

	public void setConditionCustomerName(String op, java.lang.String val) {
		setConditionCustomerName(op, val, CONDITION_AND);
	}

	public void setConditionCustomerName(String op, java.lang.String val, String relation) {
		addCondition(7, op, relation, val);
	}

	public void setSelectCustomerName(boolean val) {
		__select_flags[7] = val;
	}

	public void setCustomerNameExpression(String val) {
		__dataExpressions[7] = val;
	}

	public void setConditionAddressDelivery(String op, java.lang.String val) {
		setConditionAddressDelivery(op, val, CONDITION_AND);
	}

	public void setConditionAddressDelivery(String op, java.lang.String val, String relation) {
		addCondition(8, op, relation, val);
	}

	public void setSelectAddressDelivery(boolean val) {
		__select_flags[8] = val;
	}

	public void setAddressDeliveryExpression(String val) {
		__dataExpressions[8] = val;
	}

	public void setConditionPostcode(String op, java.lang.String val) {
		setConditionPostcode(op, val, CONDITION_AND);
	}

	public void setConditionPostcode(String op, java.lang.String val, String relation) {
		addCondition(9, op, relation, val);
	}

	public void setSelectPostcode(boolean val) {
		__select_flags[9] = val;
	}

	public void setPostcodeExpression(String val) {
		__dataExpressions[9] = val;
	}

	public void setConditionStatusInvoice(String op, java.lang.Integer val) {
		setConditionStatusInvoice(op, val, CONDITION_AND);
	}

	public void setConditionStatusInvoice(String op, java.lang.Integer val, String relation) {
		addCondition(10, op, relation, val);
	}

	public void setSelectStatusInvoice(boolean val) {
		__select_flags[10] = val;
	}

	public void setStatusInvoiceExpression(String val) {
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

	public void setConditionInvoiceType(String op, java.lang.Integer val) {
		setConditionInvoiceType(op, val, CONDITION_AND);
	}

	public void setConditionInvoiceType(String op, java.lang.Integer val, String relation) {
		addCondition(12, op, relation, val);
	}

	public void setSelectInvoiceType(boolean val) {
		__select_flags[12] = val;
	}

	public void setInvoiceTypeExpression(String val) {
		__dataExpressions[12] = val;
	}

	public void setConditionDateCreated(String op, java.util.Date val) {
		setConditionDateCreated(op, val, CONDITION_AND);
	}

	public void setConditionDateCreated(String op, java.util.Date val, String relation) {
		addCondition(13, op, relation, generateTimestampFromDate(val));
	}

	public void setSelectDateCreated(boolean val) {
		__select_flags[13] = val;
	}

	public void setDateCreatedExpression(String val) {
		__dataExpressions[13] = val;
	}

	public void setConditionEmployeeIdUpdated(String op, java.lang.Integer val) {
		setConditionEmployeeIdUpdated(op, val, CONDITION_AND);
	}

	public void setConditionEmployeeIdUpdated(String op, java.lang.Integer val, String relation) {
		addCondition(14, op, relation, val);
	}

	public void setSelectEmployeeIdUpdated(boolean val) {
		__select_flags[14] = val;
	}

	public void setEmployeeIdUpdatedExpression(String val) {
		__dataExpressions[14] = val;
	}

	public void setConditionDateIssued(String op, java.util.Date val) {
		setConditionDateIssued(op, val, CONDITION_AND);
	}

	public void setConditionDateIssued(String op, java.util.Date val, String relation) {
		addCondition(15, op, relation, generateTimestampFromDate(val));
	}

	public void setSelectDateIssued(boolean val) {
		__select_flags[15] = val;
	}

	public void setDateIssuedExpression(String val) {
		__dataExpressions[15] = val;
	}

	public void setConditionDateValidation(String op, java.util.Date val) {
		setConditionDateValidation(op, val, CONDITION_AND);
	}

	public void setConditionDateValidation(String op, java.util.Date val, String relation) {
		addCondition(16, op, relation, generateTimestampFromDate(val));
	}

	public void setSelectDateValidation(boolean val) {
		__select_flags[16] = val;
	}

	public void setDateValidationExpression(String val) {
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

	public void setConditionDescriptionInvoice(String op, java.lang.String val) {
		setConditionDescriptionInvoice(op, val, CONDITION_AND);
	}

	public void setConditionDescriptionInvoice(String op, java.lang.String val, String relation) {
		addCondition(18, op, relation, val);
	}

	public void setSelectDescriptionInvoice(boolean val) {
		__select_flags[18] = val;
	}

	public void setDescriptionInvoiceExpression(String val) {
		__dataExpressions[18] = val;
	}


}

