package fix.db.dao;

import delicacy.common.AbstractTable;
import delicacy.common.GenericBase;
import fix.db.bean.BaseCrmOrder;


public class CrmOrder extends AbstractTable<BaseCrmOrder>
{

	public CrmOrder() throws java.sql.SQLException 
	{

		initColumnNames();
	}

	protected final void initColumnNames()  throws java.sql.SQLException {

		__columnCount          = 35;

		initTables();

		__tableName            = "crm_orders";

		__key_columns          = new int[1];
		__key_columns[0] = 0;

		__column_names[0] = BaseCrmOrder.CS_ORDER_ID;
		__column_names[1] = BaseCrmOrder.CS_ORDER_CODE;
		__column_names[2] = BaseCrmOrder.CS_ORDER_RETURN_CODE;
		__column_names[3] = BaseCrmOrder.CS_ORDER_TYPE;
		__column_names[4] = BaseCrmOrder.CS_EMPLOYEE_ID_MAINTAINER;
		__column_names[5] = BaseCrmOrder.CS_CUSTOMER_NAME;
		__column_names[6] = BaseCrmOrder.CS_CONTRACT_ID;
		__column_names[7] = BaseCrmOrder.CS_OPPORTUNITY_ID;
		__column_names[8] = BaseCrmOrder.CS_STATUS_ORDER;
		__column_names[9] = BaseCrmOrder.CS_PRICE_LIST_ID;
		__column_names[10] = BaseCrmOrder.CS_CONTACT_ID;
		__column_names[11] = BaseCrmOrder.CS_STATUS_ORDER_RETURN;
		__column_names[12] = BaseCrmOrder.CS_SUM_ACTUAL;
		__column_names[13] = BaseCrmOrder.CS_SUM_INITIAL;
		__column_names[14] = BaseCrmOrder.CS_DATE_VALIDATION;
		__column_names[15] = BaseCrmOrder.CS_CONTACT_MOBILE;
		__column_names[16] = BaseCrmOrder.CS_ADDRESS_DELIVERY;
		__column_names[17] = BaseCrmOrder.CS_QUOTATION_ID;
		__column_names[18] = BaseCrmOrder.CS_REASON_INVALIDATION;
		__column_names[19] = BaseCrmOrder.CS_EMPLOYEE_ID_CREATED;
		__column_names[20] = BaseCrmOrder.CS_DATE_CREATED;
		__column_names[21] = BaseCrmOrder.CS_EMPLOYEE_ID_UPDATED;
		__column_names[22] = BaseCrmOrder.CS_DATE_UPDATED;
		__column_names[23] = BaseCrmOrder.CS_DEPARTMENT_ID;
		__column_names[24] = BaseCrmOrder.CS_FLAG_LOCKED;
		__column_names[25] = BaseCrmOrder.CS_DATE_ORDER_PLACED;
		__column_names[26] = BaseCrmOrder.CS_SUM_TOTAL_LISTED;
		__column_names[27] = BaseCrmOrder.CS_AMOUNT_TOTAL_DISCOUNT;
		__column_names[28] = BaseCrmOrder.CS_ORDER_VERSION;
		__column_names[29] = BaseCrmOrder.CS_DELIVERYDATE;
		__column_names[30] = BaseCrmOrder.CS_MEMO;
		__column_names[31] = BaseCrmOrder.CS_CUSTOMITEM175__C;
		__column_names[32] = BaseCrmOrder.CS_CUSTOMITEM176__C;
		__column_names[33] = BaseCrmOrder.CS_CUSTOMITEM177__C;
		__column_names[34] = BaseCrmOrder.CS_CUSTOMITEM178__C;

		resetSelectFlags() ;
		resetInsertFlags() ;
	}

	public void resetInsertFlags(){
		for(int i = 0; i < __columnCount; i ++ ) __insert_flags[i] = true;
		__insert_flags[0] = false;
		__serial_column = 0;
	}

	public void setPrimaryKeyFromBase(BaseCrmOrder b) {
		clear();
		setOrderIdClear(b.getOrderId());
	}

	public boolean isPrimaryKeyNull() {
		return getOrderId() == null;
	}

	@Override
	public BaseCrmOrder generateBase(){
		BaseCrmOrder b = new BaseCrmOrder();
		setDataToBase(b);
		return b;
	}

	@Override
	public void setDataToBase(BaseCrmOrder b){
		int count = 0; Object val;
		if((val = __current_data[count++]) != null) b.setOrderId(GenericBase.__getInt(val));
		if((val = __current_data[count++]) != null) b.setOrderCode(GenericBase.__getString(val));
		if((val = __current_data[count++]) != null) b.setOrderReturnCode(GenericBase.__getString(val));
		if((val = __current_data[count++]) != null) b.setOrderType(GenericBase.__getInt(val));
		if((val = __current_data[count++]) != null) b.setEmployeeIdMaintainer(GenericBase.__getInt(val));
		if((val = __current_data[count++]) != null) b.setCustomerName(GenericBase.__getInt(val));
		if((val = __current_data[count++]) != null) b.setContractId(GenericBase.__getInt(val));
		if((val = __current_data[count++]) != null) b.setOpportunityId(GenericBase.__getInt(val));
		if((val = __current_data[count++]) != null) b.setStatusOrder(GenericBase.__getInt(val));
		if((val = __current_data[count++]) != null) b.setPriceListId(GenericBase.__getInt(val));
		if((val = __current_data[count++]) != null) b.setContactId(GenericBase.__getInt(val));
		if((val = __current_data[count++]) != null) b.setStatusOrderReturn(GenericBase.__getInt(val));
		if((val = __current_data[count++]) != null) b.setSumActual(GenericBase.__getDecimal(val));
		if((val = __current_data[count++]) != null) b.setSumInitial(GenericBase.__getDecimal(val));
		if((val = __current_data[count++]) != null) b.setDateValidation(GenericBase.__getDateFromSQL(val));
		if((val = __current_data[count++]) != null) b.setContactMobile(GenericBase.__getString(val));
		if((val = __current_data[count++]) != null) b.setAddressDelivery(GenericBase.__getString(val));
		if((val = __current_data[count++]) != null) b.setQuotationId(GenericBase.__getInt(val));
		if((val = __current_data[count++]) != null) b.setReasonInvalidation(GenericBase.__getInt(val));
		if((val = __current_data[count++]) != null) b.setEmployeeIdCreated(GenericBase.__getInt(val));
		if((val = __current_data[count++]) != null) b.setDateCreated(GenericBase.__getDateFromSQL(val));
		if((val = __current_data[count++]) != null) b.setEmployeeIdUpdated(GenericBase.__getInt(val));
		if((val = __current_data[count++]) != null) b.setDateUpdated(GenericBase.__getDateFromSQL(val));
		if((val = __current_data[count++]) != null) b.setDepartmentId(GenericBase.__getInt(val));
		if((val = __current_data[count++]) != null) b.setFlagLocked(GenericBase.__getBoolean(val));
		if((val = __current_data[count++]) != null) b.setDateOrderPlaced(GenericBase.__getDateFromSQL(val));
		if((val = __current_data[count++]) != null) b.setSumTotalListed(GenericBase.__getDecimal(val));
		if((val = __current_data[count++]) != null) b.setAmountTotalDiscount(GenericBase.__getDecimal(val));
		if((val = __current_data[count++]) != null) b.setOrderVersion(GenericBase.__getInt(val));
		if((val = __current_data[count++]) != null) b.setDeliverydate(GenericBase.__getDateFromSQL(val));
		if((val = __current_data[count++]) != null) b.setMemo(GenericBase.__getString(val));
		if((val = __current_data[count++]) != null) b.setCustomitem175_c(GenericBase.__getInt(val));
		if((val = __current_data[count++]) != null) b.setCustomitem176_c(GenericBase.__getInt(val));
		if((val = __current_data[count++]) != null) b.setCustomitem177_c(GenericBase.__getInt(val));
		if((val = __current_data[count++]) != null) b.setCustomitem178_c(GenericBase.__getInt(val));
	}

	@Override
	public void setBaseToBuffer(BaseCrmOrder b, Object[] buff){
		int count = 0;
		buff[count++] = b.getOrderId();
		buff[count++] = b.getOrderCode();
		buff[count++] = b.getOrderReturnCode();
		buff[count++] = b.getOrderType();
		buff[count++] = b.getEmployeeIdMaintainer();
		buff[count++] = b.getCustomerName();
		buff[count++] = b.getContractId();
		buff[count++] = b.getOpportunityId();
		buff[count++] = b.getStatusOrder();
		buff[count++] = b.getPriceListId();
		buff[count++] = b.getContactId();
		buff[count++] = b.getStatusOrderReturn();
		buff[count++] = b.getSumActual();
		buff[count++] = b.getSumInitial();
		buff[count++] = generateTimestampFromDate(b.getDateValidation());
		buff[count++] = b.getContactMobile();
		buff[count++] = b.getAddressDelivery();
		buff[count++] = b.getQuotationId();
		buff[count++] = b.getReasonInvalidation();
		buff[count++] = b.getEmployeeIdCreated();
		buff[count++] = generateTimestampFromDate(b.getDateCreated());
		buff[count++] = b.getEmployeeIdUpdated();
		buff[count++] = generateTimestampFromDate(b.getDateUpdated());
		buff[count++] = b.getDepartmentId();
		buff[count++] = b.getFlagLocked();
		buff[count++] = generateTimestampFromDate(b.getDateOrderPlaced());
		buff[count++] = b.getSumTotalListed();
		buff[count++] = b.getAmountTotalDiscount();
		buff[count++] = b.getOrderVersion();
		buff[count++] = generateTimestampFromDate(b.getDeliverydate());
		buff[count++] = b.getMemo();
		buff[count++] = b.getCustomitem175_c();
		buff[count++] = b.getCustomitem176_c();
		buff[count++] = b.getCustomitem177_c();
		buff[count++] = b.getCustomitem178_c();
	}

	@Override
	public void setDataFromBase(BaseCrmOrder b){
		if(b.getOrderId() != null) setOrderIdClear(b.getOrderId());
		if(b.getOrderCode() != null) setOrderCode(b.getOrderCode());
		if(b.getOrderReturnCode() != null) setOrderReturnCode(b.getOrderReturnCode());
		if(b.getOrderType() != null) setOrderType(b.getOrderType());
		if(b.getEmployeeIdMaintainer() != null) setEmployeeIdMaintainer(b.getEmployeeIdMaintainer());
		if(b.getCustomerName() != null) setCustomerName(b.getCustomerName());
		if(b.getContractId() != null) setContractId(b.getContractId());
		if(b.getOpportunityId() != null) setOpportunityId(b.getOpportunityId());
		if(b.getStatusOrder() != null) setStatusOrder(b.getStatusOrder());
		if(b.getPriceListId() != null) setPriceListId(b.getPriceListId());
		if(b.getContactId() != null) setContactId(b.getContactId());
		if(b.getStatusOrderReturn() != null) setStatusOrderReturn(b.getStatusOrderReturn());
		if(b.getSumActual() != null) setSumActual(b.getSumActual());
		if(b.getSumInitial() != null) setSumInitial(b.getSumInitial());
		if(b.getDateValidation() != null) setDateValidation(b.getDateValidation());
		if(b.getContactMobile() != null) setContactMobile(b.getContactMobile());
		if(b.getAddressDelivery() != null) setAddressDelivery(b.getAddressDelivery());
		if(b.getQuotationId() != null) setQuotationId(b.getQuotationId());
		if(b.getReasonInvalidation() != null) setReasonInvalidation(b.getReasonInvalidation());
		if(b.getEmployeeIdCreated() != null) setEmployeeIdCreated(b.getEmployeeIdCreated());
		if(b.getDateCreated() != null) setDateCreated(b.getDateCreated());
		if(b.getEmployeeIdUpdated() != null) setEmployeeIdUpdated(b.getEmployeeIdUpdated());
		if(b.getDateUpdated() != null) setDateUpdated(b.getDateUpdated());
		if(b.getDepartmentId() != null) setDepartmentId(b.getDepartmentId());
		if(b.getFlagLocked() != null) setFlagLocked(b.getFlagLocked());
		if(b.getDateOrderPlaced() != null) setDateOrderPlaced(b.getDateOrderPlaced());
		if(b.getSumTotalListed() != null) setSumTotalListed(b.getSumTotalListed());
		if(b.getAmountTotalDiscount() != null) setAmountTotalDiscount(b.getAmountTotalDiscount());
		if(b.getOrderVersion() != null) setOrderVersion(b.getOrderVersion());
		if(b.getDeliverydate() != null) setDeliverydate(b.getDeliverydate());
		if(b.getMemo() != null) setMemo(b.getMemo());
		if(b.getCustomitem175_c() != null) setCustomitem175_c(b.getCustomitem175_c());
		if(b.getCustomitem176_c() != null) setCustomitem176_c(b.getCustomitem176_c());
		if(b.getCustomitem177_c() != null) setCustomitem177_c(b.getCustomitem177_c());
		if(b.getCustomitem178_c() != null) setCustomitem178_c(b.getCustomitem178_c());
	}

	@Override
	public BaseCrmOrder generateBaseFromResultSet(java.sql.ResultSet sdr)  throws java.sql.SQLException {

		BaseCrmOrder b = new BaseCrmOrder();
		setQueryResultToBase(b, sdr);
		return b;
	}

	@Override
	public void setQueryResultToBase(BaseCrmOrder __base, java.sql.ResultSet sdr ) throws java.sql.SQLException {
		int count = 1, index = 0;
		java.sql.ResultSetMetaData rsmd = sdr.getMetaData();
		int columnCount = rsmd.getColumnCount();
		Object val;
		if(__select_flags[index++] && count <= columnCount && (val = sdr.getObject(count++)) != null) __base.setOrderId(GenericBase.__getInt(val));
		if(__select_flags[index++] && count <= columnCount && (val = sdr.getObject(count++)) != null) __base.setOrderCode(GenericBase.__getString(val));
		if(__select_flags[index++] && count <= columnCount && (val = sdr.getObject(count++)) != null) __base.setOrderReturnCode(GenericBase.__getString(val));
		if(__select_flags[index++] && count <= columnCount && (val = sdr.getObject(count++)) != null) __base.setOrderType(GenericBase.__getInt(val));
		if(__select_flags[index++] && count <= columnCount && (val = sdr.getObject(count++)) != null) __base.setEmployeeIdMaintainer(GenericBase.__getInt(val));
		if(__select_flags[index++] && count <= columnCount && (val = sdr.getObject(count++)) != null) __base.setCustomerName(GenericBase.__getInt(val));
		if(__select_flags[index++] && count <= columnCount && (val = sdr.getObject(count++)) != null) __base.setContractId(GenericBase.__getInt(val));
		if(__select_flags[index++] && count <= columnCount && (val = sdr.getObject(count++)) != null) __base.setOpportunityId(GenericBase.__getInt(val));
		if(__select_flags[index++] && count <= columnCount && (val = sdr.getObject(count++)) != null) __base.setStatusOrder(GenericBase.__getInt(val));
		if(__select_flags[index++] && count <= columnCount && (val = sdr.getObject(count++)) != null) __base.setPriceListId(GenericBase.__getInt(val));
		if(__select_flags[index++] && count <= columnCount && (val = sdr.getObject(count++)) != null) __base.setContactId(GenericBase.__getInt(val));
		if(__select_flags[index++] && count <= columnCount && (val = sdr.getObject(count++)) != null) __base.setStatusOrderReturn(GenericBase.__getInt(val));
		if(__select_flags[index++] && count <= columnCount && (val = sdr.getObject(count++)) != null) __base.setSumActual(GenericBase.__getDecimal(val));
		if(__select_flags[index++] && count <= columnCount && (val = sdr.getObject(count++)) != null) __base.setSumInitial(GenericBase.__getDecimal(val));
		if(__select_flags[index++] && count <= columnCount && (val = sdr.getObject(count++)) != null) __base.setDateValidation(GenericBase.__getDateFromSQL(val));
		if(__select_flags[index++] && count <= columnCount && (val = sdr.getObject(count++)) != null) __base.setContactMobile(GenericBase.__getString(val));
		if(__select_flags[index++] && count <= columnCount && (val = sdr.getObject(count++)) != null) __base.setAddressDelivery(GenericBase.__getString(val));
		if(__select_flags[index++] && count <= columnCount && (val = sdr.getObject(count++)) != null) __base.setQuotationId(GenericBase.__getInt(val));
		if(__select_flags[index++] && count <= columnCount && (val = sdr.getObject(count++)) != null) __base.setReasonInvalidation(GenericBase.__getInt(val));
		if(__select_flags[index++] && count <= columnCount && (val = sdr.getObject(count++)) != null) __base.setEmployeeIdCreated(GenericBase.__getInt(val));
		if(__select_flags[index++] && count <= columnCount && (val = sdr.getObject(count++)) != null) __base.setDateCreated(GenericBase.__getDateFromSQL(val));
		if(__select_flags[index++] && count <= columnCount && (val = sdr.getObject(count++)) != null) __base.setEmployeeIdUpdated(GenericBase.__getInt(val));
		if(__select_flags[index++] && count <= columnCount && (val = sdr.getObject(count++)) != null) __base.setDateUpdated(GenericBase.__getDateFromSQL(val));
		if(__select_flags[index++] && count <= columnCount && (val = sdr.getObject(count++)) != null) __base.setDepartmentId(GenericBase.__getInt(val));
		if(__select_flags[index++] && count <= columnCount && (val = sdr.getObject(count++)) != null) __base.setFlagLocked(GenericBase.__getBoolean(val));
		if(__select_flags[index++] && count <= columnCount && (val = sdr.getObject(count++)) != null) __base.setDateOrderPlaced(GenericBase.__getDateFromSQL(val));
		if(__select_flags[index++] && count <= columnCount && (val = sdr.getObject(count++)) != null) __base.setSumTotalListed(GenericBase.__getDecimal(val));
		if(__select_flags[index++] && count <= columnCount && (val = sdr.getObject(count++)) != null) __base.setAmountTotalDiscount(GenericBase.__getDecimal(val));
		if(__select_flags[index++] && count <= columnCount && (val = sdr.getObject(count++)) != null) __base.setOrderVersion(GenericBase.__getInt(val));
		if(__select_flags[index++] && count <= columnCount && (val = sdr.getObject(count++)) != null) __base.setDeliverydate(GenericBase.__getDateFromSQL(val));
		if(__select_flags[index++] && count <= columnCount && (val = sdr.getObject(count++)) != null) __base.setMemo(GenericBase.__getString(val));
		if(__select_flags[index++] && count <= columnCount && (val = sdr.getObject(count++)) != null) __base.setCustomitem175_c(GenericBase.__getInt(val));
		if(__select_flags[index++] && count <= columnCount && (val = sdr.getObject(count++)) != null) __base.setCustomitem176_c(GenericBase.__getInt(val));
		if(__select_flags[index++] && count <= columnCount && (val = sdr.getObject(count++)) != null) __base.setCustomitem177_c(GenericBase.__getInt(val));
		if(__select_flags[index++] && count <= columnCount && (val = sdr.getObject(count++)) != null) __base.setCustomitem178_c(GenericBase.__getInt(val));
	}

	public void setOrderId(java.lang.Integer val) {
		setCurrentData(0, val);
	}

	public java.lang.Integer getOrderId() {
		return GenericBase.__getInt(__current_data[0]);
	}

	public void setOrderIdClear(java.lang.Integer val) {
		__backup_data[0] = __current_data[0] =  val;
		__modified_flags[0] = false;
	}

	public void setOrderCode(java.lang.String val) {
		setCurrentData(1, val);
	}

	public java.lang.String getOrderCode() {
		return GenericBase.__getString(__current_data[1]);
	}

	public void setOrderReturnCode(java.lang.String val) {
		setCurrentData(2, val);
	}

	public java.lang.String getOrderReturnCode() {
		return GenericBase.__getString(__current_data[2]);
	}

	public void setOrderType(java.lang.Integer val) {
		setCurrentData(3, val);
	}

	public java.lang.Integer getOrderType() {
		return GenericBase.__getInt(__current_data[3]);
	}

	public void setEmployeeIdMaintainer(java.lang.Integer val) {
		setCurrentData(4, val);
	}

	public java.lang.Integer getEmployeeIdMaintainer() {
		return GenericBase.__getInt(__current_data[4]);
	}

	public void setCustomerName(java.lang.Integer val) {
		setCurrentData(5, val);
	}

	public java.lang.Integer getCustomerName() {
		return GenericBase.__getInt(__current_data[5]);
	}

	public void setContractId(java.lang.Integer val) {
		setCurrentData(6, val);
	}

	public java.lang.Integer getContractId() {
		return GenericBase.__getInt(__current_data[6]);
	}

	public void setOpportunityId(java.lang.Integer val) {
		setCurrentData(7, val);
	}

	public java.lang.Integer getOpportunityId() {
		return GenericBase.__getInt(__current_data[7]);
	}

	public void setStatusOrder(java.lang.Integer val) {
		setCurrentData(8, val);
	}

	public java.lang.Integer getStatusOrder() {
		return GenericBase.__getInt(__current_data[8]);
	}

	public void setPriceListId(java.lang.Integer val) {
		setCurrentData(9, val);
	}

	public java.lang.Integer getPriceListId() {
		return GenericBase.__getInt(__current_data[9]);
	}

	public void setContactId(java.lang.Integer val) {
		setCurrentData(10, val);
	}

	public java.lang.Integer getContactId() {
		return GenericBase.__getInt(__current_data[10]);
	}

	public void setStatusOrderReturn(java.lang.Integer val) {
		setCurrentData(11, val);
	}

	public java.lang.Integer getStatusOrderReturn() {
		return GenericBase.__getInt(__current_data[11]);
	}

	public void setSumActual(java.math.BigDecimal val) {
		setCurrentData(12, val);
	}

	public java.math.BigDecimal getSumActual() {
		return GenericBase.__getDecimal(__current_data[12]);
	}

	public void setSumInitial(java.math.BigDecimal val) {
		setCurrentData(13, val);
	}

	public java.math.BigDecimal getSumInitial() {
		return GenericBase.__getDecimal(__current_data[13]);
	}

	public void setDateValidation(java.util.Date val) {
		setCurrentData(14, generateTimestampFromDate(val));
	}

	public java.util.Date getDateValidation() {
		return GenericBase.__getDateFromSQL(__current_data[14]);
	}

	public void setContactMobile(java.lang.String val) {
		setCurrentData(15, val);
	}

	public java.lang.String getContactMobile() {
		return GenericBase.__getString(__current_data[15]);
	}

	public void setAddressDelivery(java.lang.String val) {
		setCurrentData(16, val);
	}

	public java.lang.String getAddressDelivery() {
		return GenericBase.__getString(__current_data[16]);
	}

	public void setQuotationId(java.lang.Integer val) {
		setCurrentData(17, val);
	}

	public java.lang.Integer getQuotationId() {
		return GenericBase.__getInt(__current_data[17]);
	}

	public void setReasonInvalidation(java.lang.Integer val) {
		setCurrentData(18, val);
	}

	public java.lang.Integer getReasonInvalidation() {
		return GenericBase.__getInt(__current_data[18]);
	}

	public void setEmployeeIdCreated(java.lang.Integer val) {
		setCurrentData(19, val);
	}

	public java.lang.Integer getEmployeeIdCreated() {
		return GenericBase.__getInt(__current_data[19]);
	}

	public void setDateCreated(java.util.Date val) {
		setCurrentData(20, generateTimestampFromDate(val));
	}

	public java.util.Date getDateCreated() {
		return GenericBase.__getDateFromSQL(__current_data[20]);
	}

	public void setEmployeeIdUpdated(java.lang.Integer val) {
		setCurrentData(21, val);
	}

	public java.lang.Integer getEmployeeIdUpdated() {
		return GenericBase.__getInt(__current_data[21]);
	}

	public void setDateUpdated(java.util.Date val) {
		setCurrentData(22, generateTimestampFromDate(val));
	}

	public java.util.Date getDateUpdated() {
		return GenericBase.__getDateFromSQL(__current_data[22]);
	}

	public void setDepartmentId(java.lang.Integer val) {
		setCurrentData(23, val);
	}

	public java.lang.Integer getDepartmentId() {
		return GenericBase.__getInt(__current_data[23]);
	}

	public void setFlagLocked(java.lang.Boolean val) {
		setCurrentData(24, val);
	}

	public java.lang.Boolean getFlagLocked() {
		return GenericBase.__getBoolean(__current_data[24]);
	}

	public void setDateOrderPlaced(java.util.Date val) {
		setCurrentData(25, generateTimestampFromDate(val));
	}

	public java.util.Date getDateOrderPlaced() {
		return GenericBase.__getDateFromSQL(__current_data[25]);
	}

	public void setSumTotalListed(java.math.BigDecimal val) {
		setCurrentData(26, val);
	}

	public java.math.BigDecimal getSumTotalListed() {
		return GenericBase.__getDecimal(__current_data[26]);
	}

	public void setAmountTotalDiscount(java.math.BigDecimal val) {
		setCurrentData(27, val);
	}

	public java.math.BigDecimal getAmountTotalDiscount() {
		return GenericBase.__getDecimal(__current_data[27]);
	}

	public void setOrderVersion(java.lang.Integer val) {
		setCurrentData(28, val);
	}

	public java.lang.Integer getOrderVersion() {
		return GenericBase.__getInt(__current_data[28]);
	}

	public void setDeliverydate(java.util.Date val) {
		setCurrentData(29, generateTimestampFromDate(val));
	}

	public java.util.Date getDeliverydate() {
		return GenericBase.__getDateFromSQL(__current_data[29]);
	}

	public void setMemo(java.lang.String val) {
		setCurrentData(30, val);
	}

	public java.lang.String getMemo() {
		return GenericBase.__getString(__current_data[30]);
	}

	public void setCustomitem175_c(java.lang.Integer val) {
		setCurrentData(31, val);
	}

	public java.lang.Integer getCustomitem175_c() {
		return GenericBase.__getInt(__current_data[31]);
	}

	public void setCustomitem176_c(java.lang.Integer val) {
		setCurrentData(32, val);
	}

	public java.lang.Integer getCustomitem176_c() {
		return GenericBase.__getInt(__current_data[32]);
	}

	public void setCustomitem177_c(java.lang.Integer val) {
		setCurrentData(33, val);
	}

	public java.lang.Integer getCustomitem177_c() {
		return GenericBase.__getInt(__current_data[33]);
	}

	public void setCustomitem178_c(java.lang.Integer val) {
		setCurrentData(34, val);
	}

	public java.lang.Integer getCustomitem178_c() {
		return GenericBase.__getInt(__current_data[34]);
	}

	public void setConditionOrderId(String op, java.lang.Integer val) {
		setConditionOrderId(op, val, CONDITION_AND);
	}

	public void setConditionOrderId(String op, java.lang.Integer val, String relation) {
		addCondition(0, op, relation, val);
	}

	public void setSelectOrderId(boolean val) {
		__select_flags[0] = val;
	}

	public void setOrderIdExpression(String val) {
		__dataExpressions[0] = val;
	}

	public void setConditionOrderCode(String op, java.lang.String val) {
		setConditionOrderCode(op, val, CONDITION_AND);
	}

	public void setConditionOrderCode(String op, java.lang.String val, String relation) {
		addCondition(1, op, relation, val);
	}

	public void setSelectOrderCode(boolean val) {
		__select_flags[1] = val;
	}

	public void setOrderCodeExpression(String val) {
		__dataExpressions[1] = val;
	}

	public void setConditionOrderReturnCode(String op, java.lang.String val) {
		setConditionOrderReturnCode(op, val, CONDITION_AND);
	}

	public void setConditionOrderReturnCode(String op, java.lang.String val, String relation) {
		addCondition(2, op, relation, val);
	}

	public void setSelectOrderReturnCode(boolean val) {
		__select_flags[2] = val;
	}

	public void setOrderReturnCodeExpression(String val) {
		__dataExpressions[2] = val;
	}

	public void setConditionOrderType(String op, java.lang.Integer val) {
		setConditionOrderType(op, val, CONDITION_AND);
	}

	public void setConditionOrderType(String op, java.lang.Integer val, String relation) {
		addCondition(3, op, relation, val);
	}

	public void setSelectOrderType(boolean val) {
		__select_flags[3] = val;
	}

	public void setOrderTypeExpression(String val) {
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

	public void setConditionCustomerName(String op, java.lang.Integer val) {
		setConditionCustomerName(op, val, CONDITION_AND);
	}

	public void setConditionCustomerName(String op, java.lang.Integer val, String relation) {
		addCondition(5, op, relation, val);
	}

	public void setSelectCustomerName(boolean val) {
		__select_flags[5] = val;
	}

	public void setCustomerNameExpression(String val) {
		__dataExpressions[5] = val;
	}

	public void setConditionContractId(String op, java.lang.Integer val) {
		setConditionContractId(op, val, CONDITION_AND);
	}

	public void setConditionContractId(String op, java.lang.Integer val, String relation) {
		addCondition(6, op, relation, val);
	}

	public void setSelectContractId(boolean val) {
		__select_flags[6] = val;
	}

	public void setContractIdExpression(String val) {
		__dataExpressions[6] = val;
	}

	public void setConditionOpportunityId(String op, java.lang.Integer val) {
		setConditionOpportunityId(op, val, CONDITION_AND);
	}

	public void setConditionOpportunityId(String op, java.lang.Integer val, String relation) {
		addCondition(7, op, relation, val);
	}

	public void setSelectOpportunityId(boolean val) {
		__select_flags[7] = val;
	}

	public void setOpportunityIdExpression(String val) {
		__dataExpressions[7] = val;
	}

	public void setConditionStatusOrder(String op, java.lang.Integer val) {
		setConditionStatusOrder(op, val, CONDITION_AND);
	}

	public void setConditionStatusOrder(String op, java.lang.Integer val, String relation) {
		addCondition(8, op, relation, val);
	}

	public void setSelectStatusOrder(boolean val) {
		__select_flags[8] = val;
	}

	public void setStatusOrderExpression(String val) {
		__dataExpressions[8] = val;
	}

	public void setConditionPriceListId(String op, java.lang.Integer val) {
		setConditionPriceListId(op, val, CONDITION_AND);
	}

	public void setConditionPriceListId(String op, java.lang.Integer val, String relation) {
		addCondition(9, op, relation, val);
	}

	public void setSelectPriceListId(boolean val) {
		__select_flags[9] = val;
	}

	public void setPriceListIdExpression(String val) {
		__dataExpressions[9] = val;
	}

	public void setConditionContactId(String op, java.lang.Integer val) {
		setConditionContactId(op, val, CONDITION_AND);
	}

	public void setConditionContactId(String op, java.lang.Integer val, String relation) {
		addCondition(10, op, relation, val);
	}

	public void setSelectContactId(boolean val) {
		__select_flags[10] = val;
	}

	public void setContactIdExpression(String val) {
		__dataExpressions[10] = val;
	}

	public void setConditionStatusOrderReturn(String op, java.lang.Integer val) {
		setConditionStatusOrderReturn(op, val, CONDITION_AND);
	}

	public void setConditionStatusOrderReturn(String op, java.lang.Integer val, String relation) {
		addCondition(11, op, relation, val);
	}

	public void setSelectStatusOrderReturn(boolean val) {
		__select_flags[11] = val;
	}

	public void setStatusOrderReturnExpression(String val) {
		__dataExpressions[11] = val;
	}

	public void setConditionSumActual(String op, java.math.BigDecimal val) {
		setConditionSumActual(op, val, CONDITION_AND);
	}

	public void setConditionSumActual(String op, java.math.BigDecimal val, String relation) {
		addCondition(12, op, relation, val);
	}

	public void setSelectSumActual(boolean val) {
		__select_flags[12] = val;
	}

	public void setSumActualExpression(String val) {
		__dataExpressions[12] = val;
	}

	public void setConditionSumInitial(String op, java.math.BigDecimal val) {
		setConditionSumInitial(op, val, CONDITION_AND);
	}

	public void setConditionSumInitial(String op, java.math.BigDecimal val, String relation) {
		addCondition(13, op, relation, val);
	}

	public void setSelectSumInitial(boolean val) {
		__select_flags[13] = val;
	}

	public void setSumInitialExpression(String val) {
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

	public void setConditionContactMobile(String op, java.lang.String val) {
		setConditionContactMobile(op, val, CONDITION_AND);
	}

	public void setConditionContactMobile(String op, java.lang.String val, String relation) {
		addCondition(15, op, relation, val);
	}

	public void setSelectContactMobile(boolean val) {
		__select_flags[15] = val;
	}

	public void setContactMobileExpression(String val) {
		__dataExpressions[15] = val;
	}

	public void setConditionAddressDelivery(String op, java.lang.String val) {
		setConditionAddressDelivery(op, val, CONDITION_AND);
	}

	public void setConditionAddressDelivery(String op, java.lang.String val, String relation) {
		addCondition(16, op, relation, val);
	}

	public void setSelectAddressDelivery(boolean val) {
		__select_flags[16] = val;
	}

	public void setAddressDeliveryExpression(String val) {
		__dataExpressions[16] = val;
	}

	public void setConditionQuotationId(String op, java.lang.Integer val) {
		setConditionQuotationId(op, val, CONDITION_AND);
	}

	public void setConditionQuotationId(String op, java.lang.Integer val, String relation) {
		addCondition(17, op, relation, val);
	}

	public void setSelectQuotationId(boolean val) {
		__select_flags[17] = val;
	}

	public void setQuotationIdExpression(String val) {
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

	public void setConditionEmployeeIdCreated(String op, java.lang.Integer val) {
		setConditionEmployeeIdCreated(op, val, CONDITION_AND);
	}

	public void setConditionEmployeeIdCreated(String op, java.lang.Integer val, String relation) {
		addCondition(19, op, relation, val);
	}

	public void setSelectEmployeeIdCreated(boolean val) {
		__select_flags[19] = val;
	}

	public void setEmployeeIdCreatedExpression(String val) {
		__dataExpressions[19] = val;
	}

	public void setConditionDateCreated(String op, java.util.Date val) {
		setConditionDateCreated(op, val, CONDITION_AND);
	}

	public void setConditionDateCreated(String op, java.util.Date val, String relation) {
		addCondition(20, op, relation, generateTimestampFromDate(val));
	}

	public void setSelectDateCreated(boolean val) {
		__select_flags[20] = val;
	}

	public void setDateCreatedExpression(String val) {
		__dataExpressions[20] = val;
	}

	public void setConditionEmployeeIdUpdated(String op, java.lang.Integer val) {
		setConditionEmployeeIdUpdated(op, val, CONDITION_AND);
	}

	public void setConditionEmployeeIdUpdated(String op, java.lang.Integer val, String relation) {
		addCondition(21, op, relation, val);
	}

	public void setSelectEmployeeIdUpdated(boolean val) {
		__select_flags[21] = val;
	}

	public void setEmployeeIdUpdatedExpression(String val) {
		__dataExpressions[21] = val;
	}

	public void setConditionDateUpdated(String op, java.util.Date val) {
		setConditionDateUpdated(op, val, CONDITION_AND);
	}

	public void setConditionDateUpdated(String op, java.util.Date val, String relation) {
		addCondition(22, op, relation, generateTimestampFromDate(val));
	}

	public void setSelectDateUpdated(boolean val) {
		__select_flags[22] = val;
	}

	public void setDateUpdatedExpression(String val) {
		__dataExpressions[22] = val;
	}

	public void setConditionDepartmentId(String op, java.lang.Integer val) {
		setConditionDepartmentId(op, val, CONDITION_AND);
	}

	public void setConditionDepartmentId(String op, java.lang.Integer val, String relation) {
		addCondition(23, op, relation, val);
	}

	public void setSelectDepartmentId(boolean val) {
		__select_flags[23] = val;
	}

	public void setDepartmentIdExpression(String val) {
		__dataExpressions[23] = val;
	}

	public void setConditionFlagLocked(String op, java.lang.Boolean val) {
		setConditionFlagLocked(op, val, CONDITION_AND);
	}

	public void setConditionFlagLocked(String op, java.lang.Boolean val, String relation) {
		addCondition(24, op, relation, val);
	}

	public void setSelectFlagLocked(boolean val) {
		__select_flags[24] = val;
	}

	public void setFlagLockedExpression(String val) {
		__dataExpressions[24] = val;
	}

	public void setConditionDateOrderPlaced(String op, java.util.Date val) {
		setConditionDateOrderPlaced(op, val, CONDITION_AND);
	}

	public void setConditionDateOrderPlaced(String op, java.util.Date val, String relation) {
		addCondition(25, op, relation, generateTimestampFromDate(val));
	}

	public void setSelectDateOrderPlaced(boolean val) {
		__select_flags[25] = val;
	}

	public void setDateOrderPlacedExpression(String val) {
		__dataExpressions[25] = val;
	}

	public void setConditionSumTotalListed(String op, java.math.BigDecimal val) {
		setConditionSumTotalListed(op, val, CONDITION_AND);
	}

	public void setConditionSumTotalListed(String op, java.math.BigDecimal val, String relation) {
		addCondition(26, op, relation, val);
	}

	public void setSelectSumTotalListed(boolean val) {
		__select_flags[26] = val;
	}

	public void setSumTotalListedExpression(String val) {
		__dataExpressions[26] = val;
	}

	public void setConditionAmountTotalDiscount(String op, java.math.BigDecimal val) {
		setConditionAmountTotalDiscount(op, val, CONDITION_AND);
	}

	public void setConditionAmountTotalDiscount(String op, java.math.BigDecimal val, String relation) {
		addCondition(27, op, relation, val);
	}

	public void setSelectAmountTotalDiscount(boolean val) {
		__select_flags[27] = val;
	}

	public void setAmountTotalDiscountExpression(String val) {
		__dataExpressions[27] = val;
	}

	public void setConditionOrderVersion(String op, java.lang.Integer val) {
		setConditionOrderVersion(op, val, CONDITION_AND);
	}

	public void setConditionOrderVersion(String op, java.lang.Integer val, String relation) {
		addCondition(28, op, relation, val);
	}

	public void setSelectOrderVersion(boolean val) {
		__select_flags[28] = val;
	}

	public void setOrderVersionExpression(String val) {
		__dataExpressions[28] = val;
	}

	public void setConditionDeliverydate(String op, java.util.Date val) {
		setConditionDeliverydate(op, val, CONDITION_AND);
	}

	public void setConditionDeliverydate(String op, java.util.Date val, String relation) {
		addCondition(29, op, relation, generateTimestampFromDate(val));
	}

	public void setSelectDeliverydate(boolean val) {
		__select_flags[29] = val;
	}

	public void setDeliverydateExpression(String val) {
		__dataExpressions[29] = val;
	}

	public void setConditionMemo(String op, java.lang.String val) {
		setConditionMemo(op, val, CONDITION_AND);
	}

	public void setConditionMemo(String op, java.lang.String val, String relation) {
		addCondition(30, op, relation, val);
	}

	public void setSelectMemo(boolean val) {
		__select_flags[30] = val;
	}

	public void setMemoExpression(String val) {
		__dataExpressions[30] = val;
	}

	public void setConditionCustomitem175_c(String op, java.lang.Integer val) {
		setConditionCustomitem175_c(op, val, CONDITION_AND);
	}

	public void setConditionCustomitem175_c(String op, java.lang.Integer val, String relation) {
		addCondition(31, op, relation, val);
	}

	public void setSelectCustomitem175_c(boolean val) {
		__select_flags[31] = val;
	}

	public void setCustomitem175_cExpression(String val) {
		__dataExpressions[31] = val;
	}

	public void setConditionCustomitem176_c(String op, java.lang.Integer val) {
		setConditionCustomitem176_c(op, val, CONDITION_AND);
	}

	public void setConditionCustomitem176_c(String op, java.lang.Integer val, String relation) {
		addCondition(32, op, relation, val);
	}

	public void setSelectCustomitem176_c(boolean val) {
		__select_flags[32] = val;
	}

	public void setCustomitem176_cExpression(String val) {
		__dataExpressions[32] = val;
	}

	public void setConditionCustomitem177_c(String op, java.lang.Integer val) {
		setConditionCustomitem177_c(op, val, CONDITION_AND);
	}

	public void setConditionCustomitem177_c(String op, java.lang.Integer val, String relation) {
		addCondition(33, op, relation, val);
	}

	public void setSelectCustomitem177_c(boolean val) {
		__select_flags[33] = val;
	}

	public void setCustomitem177_cExpression(String val) {
		__dataExpressions[33] = val;
	}

	public void setConditionCustomitem178_c(String op, java.lang.Integer val) {
		setConditionCustomitem178_c(op, val, CONDITION_AND);
	}

	public void setConditionCustomitem178_c(String op, java.lang.Integer val, String relation) {
		addCondition(34, op, relation, val);
	}

	public void setSelectCustomitem178_c(boolean val) {
		__select_flags[34] = val;
	}

	public void setCustomitem178_cExpression(String val) {
		__dataExpressions[34] = val;
	}


}

