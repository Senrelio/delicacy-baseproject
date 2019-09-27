package fix.db.dao;

import delicacy.common.AbstractTable;
import delicacy.common.GenericBase;
import fix.db.bean.BaseFinReceivableProduct;


public class FinReceivableProduct extends AbstractTable<BaseFinReceivableProduct>
{

	public FinReceivableProduct() throws java.sql.SQLException 
	{

		initColumnNames();
	}

	protected final void initColumnNames()  throws java.sql.SQLException {

		__columnCount          = 16;

		initTables();

		__tableName            = "fin_receivable_products";

		__key_columns          = new int[1];
		__key_columns[0] = 0;

		__column_names[0] = BaseFinReceivableProduct.CS_RECEIVABLE_PRODUCT_ID;
		__column_names[1] = BaseFinReceivableProduct.CS_RECEIVABLE_ID;
		__column_names[2] = BaseFinReceivableProduct.CS_ENTITY_TYPE;
		__column_names[3] = BaseFinReceivableProduct.CS_ORDER_ID;
		__column_names[4] = BaseFinReceivableProduct.CS_ORDER_PRODUCT_ID;
		__column_names[5] = BaseFinReceivableProduct.CS_DEPARTMENT_ID;
		__column_names[6] = BaseFinReceivableProduct.CS_PRODUCT_ID;
		__column_names[7] = BaseFinReceivableProduct.CS_AMOUNT_RECEIVABLE;
		__column_names[8] = BaseFinReceivableProduct.CS_EMPLOYEE_ID_CREATED;
		__column_names[9] = BaseFinReceivableProduct.CS_DATE_CREATED;
		__column_names[10] = BaseFinReceivableProduct.CS_EMPLOYEE_ID_UPDATED;
		__column_names[11] = BaseFinReceivableProduct.CS_DATE_DUE_RECEIPT;
		__column_names[12] = BaseFinReceivableProduct.CS_DATE_UPDATED;
		__column_names[13] = BaseFinReceivableProduct.CS_FLAG_OVERTIME;
		__column_names[14] = BaseFinReceivableProduct.CS_CONTRACT_ID;
		__column_names[15] = BaseFinReceivableProduct.CS_RECEIPT_PLAN_ID;

		resetSelectFlags() ;
		resetInsertFlags() ;
	}

	public void resetInsertFlags(){
		for(int i = 0; i < __columnCount; i ++ ) __insert_flags[i] = true;
		__insert_flags[0] = false;
		__serial_column = 0;
	}

	public void setPrimaryKeyFromBase(BaseFinReceivableProduct b) {
		clear();
		setReceivableProductIdClear(b.getReceivableProductId());
	}

	public boolean isPrimaryKeyNull() {
		return getReceivableProductId() == null;
	}

	@Override
	public BaseFinReceivableProduct generateBase(){
		BaseFinReceivableProduct b = new BaseFinReceivableProduct();
		setDataToBase(b);
		return b;
	}

	@Override
	public void setDataToBase(BaseFinReceivableProduct b){
		int count = 0; Object val;
		if((val = __current_data[count++]) != null) b.setReceivableProductId(GenericBase.__getInt(val));
		if((val = __current_data[count++]) != null) b.setReceivableId(GenericBase.__getInt(val));
		if((val = __current_data[count++]) != null) b.setEntityType(GenericBase.__getInt(val));
		if((val = __current_data[count++]) != null) b.setOrderId(GenericBase.__getInt(val));
		if((val = __current_data[count++]) != null) b.setOrderProductId(GenericBase.__getInt(val));
		if((val = __current_data[count++]) != null) b.setDepartmentId(GenericBase.__getInt(val));
		if((val = __current_data[count++]) != null) b.setProductId(GenericBase.__getInt(val));
		if((val = __current_data[count++]) != null) b.setAmountReceivable(GenericBase.__getDecimal(val));
		if((val = __current_data[count++]) != null) b.setEmployeeIdCreated(GenericBase.__getInt(val));
		if((val = __current_data[count++]) != null) b.setDateCreated(GenericBase.__getDateFromSQL(val));
		if((val = __current_data[count++]) != null) b.setEmployeeIdUpdated(GenericBase.__getInt(val));
		if((val = __current_data[count++]) != null) b.setDateDueReceipt(GenericBase.__getDateFromSQL(val));
		if((val = __current_data[count++]) != null) b.setDateUpdated(GenericBase.__getDateFromSQL(val));
		if((val = __current_data[count++]) != null) b.setFlagOvertime(GenericBase.__getBoolean(val));
		if((val = __current_data[count++]) != null) b.setContractId(GenericBase.__getInt(val));
		if((val = __current_data[count++]) != null) b.setReceiptPlanId(GenericBase.__getInt(val));
	}

	@Override
	public void setBaseToBuffer(BaseFinReceivableProduct b, Object[] buff){
		int count = 0;
		buff[count++] = b.getReceivableProductId();
		buff[count++] = b.getReceivableId();
		buff[count++] = b.getEntityType();
		buff[count++] = b.getOrderId();
		buff[count++] = b.getOrderProductId();
		buff[count++] = b.getDepartmentId();
		buff[count++] = b.getProductId();
		buff[count++] = b.getAmountReceivable();
		buff[count++] = b.getEmployeeIdCreated();
		buff[count++] = generateTimestampFromDate(b.getDateCreated());
		buff[count++] = b.getEmployeeIdUpdated();
		buff[count++] = generateTimestampFromDate(b.getDateDueReceipt());
		buff[count++] = generateTimestampFromDate(b.getDateUpdated());
		buff[count++] = b.getFlagOvertime();
		buff[count++] = b.getContractId();
		buff[count++] = b.getReceiptPlanId();
	}

	@Override
	public void setDataFromBase(BaseFinReceivableProduct b){
		if(b.getReceivableProductId() != null) setReceivableProductIdClear(b.getReceivableProductId());
		if(b.getReceivableId() != null) setReceivableId(b.getReceivableId());
		if(b.getEntityType() != null) setEntityType(b.getEntityType());
		if(b.getOrderId() != null) setOrderId(b.getOrderId());
		if(b.getOrderProductId() != null) setOrderProductId(b.getOrderProductId());
		if(b.getDepartmentId() != null) setDepartmentId(b.getDepartmentId());
		if(b.getProductId() != null) setProductId(b.getProductId());
		if(b.getAmountReceivable() != null) setAmountReceivable(b.getAmountReceivable());
		if(b.getEmployeeIdCreated() != null) setEmployeeIdCreated(b.getEmployeeIdCreated());
		if(b.getDateCreated() != null) setDateCreated(b.getDateCreated());
		if(b.getEmployeeIdUpdated() != null) setEmployeeIdUpdated(b.getEmployeeIdUpdated());
		if(b.getDateDueReceipt() != null) setDateDueReceipt(b.getDateDueReceipt());
		if(b.getDateUpdated() != null) setDateUpdated(b.getDateUpdated());
		if(b.getFlagOvertime() != null) setFlagOvertime(b.getFlagOvertime());
		if(b.getContractId() != null) setContractId(b.getContractId());
		if(b.getReceiptPlanId() != null) setReceiptPlanId(b.getReceiptPlanId());
	}

	@Override
	public BaseFinReceivableProduct generateBaseFromResultSet(java.sql.ResultSet sdr)  throws java.sql.SQLException {

		BaseFinReceivableProduct b = new BaseFinReceivableProduct();
		setQueryResultToBase(b, sdr);
		return b;
	}

	@Override
	public void setQueryResultToBase(BaseFinReceivableProduct __base, java.sql.ResultSet sdr ) throws java.sql.SQLException {
		int count = 1, index = 0;
		java.sql.ResultSetMetaData rsmd = sdr.getMetaData();
		int columnCount = rsmd.getColumnCount();
		Object val;
		if(__select_flags[index++] && count <= columnCount && (val = sdr.getObject(count++)) != null) __base.setReceivableProductId(GenericBase.__getInt(val));
		if(__select_flags[index++] && count <= columnCount && (val = sdr.getObject(count++)) != null) __base.setReceivableId(GenericBase.__getInt(val));
		if(__select_flags[index++] && count <= columnCount && (val = sdr.getObject(count++)) != null) __base.setEntityType(GenericBase.__getInt(val));
		if(__select_flags[index++] && count <= columnCount && (val = sdr.getObject(count++)) != null) __base.setOrderId(GenericBase.__getInt(val));
		if(__select_flags[index++] && count <= columnCount && (val = sdr.getObject(count++)) != null) __base.setOrderProductId(GenericBase.__getInt(val));
		if(__select_flags[index++] && count <= columnCount && (val = sdr.getObject(count++)) != null) __base.setDepartmentId(GenericBase.__getInt(val));
		if(__select_flags[index++] && count <= columnCount && (val = sdr.getObject(count++)) != null) __base.setProductId(GenericBase.__getInt(val));
		if(__select_flags[index++] && count <= columnCount && (val = sdr.getObject(count++)) != null) __base.setAmountReceivable(GenericBase.__getDecimal(val));
		if(__select_flags[index++] && count <= columnCount && (val = sdr.getObject(count++)) != null) __base.setEmployeeIdCreated(GenericBase.__getInt(val));
		if(__select_flags[index++] && count <= columnCount && (val = sdr.getObject(count++)) != null) __base.setDateCreated(GenericBase.__getDateFromSQL(val));
		if(__select_flags[index++] && count <= columnCount && (val = sdr.getObject(count++)) != null) __base.setEmployeeIdUpdated(GenericBase.__getInt(val));
		if(__select_flags[index++] && count <= columnCount && (val = sdr.getObject(count++)) != null) __base.setDateDueReceipt(GenericBase.__getDateFromSQL(val));
		if(__select_flags[index++] && count <= columnCount && (val = sdr.getObject(count++)) != null) __base.setDateUpdated(GenericBase.__getDateFromSQL(val));
		if(__select_flags[index++] && count <= columnCount && (val = sdr.getObject(count++)) != null) __base.setFlagOvertime(GenericBase.__getBoolean(val));
		if(__select_flags[index++] && count <= columnCount && (val = sdr.getObject(count++)) != null) __base.setContractId(GenericBase.__getInt(val));
		if(__select_flags[index++] && count <= columnCount && (val = sdr.getObject(count++)) != null) __base.setReceiptPlanId(GenericBase.__getInt(val));
	}

	public void setReceivableProductId(java.lang.Integer val) {
		setCurrentData(0, val);
	}

	public java.lang.Integer getReceivableProductId() {
		return GenericBase.__getInt(__current_data[0]);
	}

	public void setReceivableProductIdClear(java.lang.Integer val) {
		__backup_data[0] = __current_data[0] =  val;
		__modified_flags[0] = false;
	}

	public void setReceivableId(java.lang.Integer val) {
		setCurrentData(1, val);
	}

	public java.lang.Integer getReceivableId() {
		return GenericBase.__getInt(__current_data[1]);
	}

	public void setEntityType(java.lang.Integer val) {
		setCurrentData(2, val);
	}

	public java.lang.Integer getEntityType() {
		return GenericBase.__getInt(__current_data[2]);
	}

	public void setOrderId(java.lang.Integer val) {
		setCurrentData(3, val);
	}

	public java.lang.Integer getOrderId() {
		return GenericBase.__getInt(__current_data[3]);
	}

	public void setOrderProductId(java.lang.Integer val) {
		setCurrentData(4, val);
	}

	public java.lang.Integer getOrderProductId() {
		return GenericBase.__getInt(__current_data[4]);
	}

	public void setDepartmentId(java.lang.Integer val) {
		setCurrentData(5, val);
	}

	public java.lang.Integer getDepartmentId() {
		return GenericBase.__getInt(__current_data[5]);
	}

	public void setProductId(java.lang.Integer val) {
		setCurrentData(6, val);
	}

	public java.lang.Integer getProductId() {
		return GenericBase.__getInt(__current_data[6]);
	}

	public void setAmountReceivable(java.math.BigDecimal val) {
		setCurrentData(7, val);
	}

	public java.math.BigDecimal getAmountReceivable() {
		return GenericBase.__getDecimal(__current_data[7]);
	}

	public void setEmployeeIdCreated(java.lang.Integer val) {
		setCurrentData(8, val);
	}

	public java.lang.Integer getEmployeeIdCreated() {
		return GenericBase.__getInt(__current_data[8]);
	}

	public void setDateCreated(java.util.Date val) {
		setCurrentData(9, generateTimestampFromDate(val));
	}

	public java.util.Date getDateCreated() {
		return GenericBase.__getDateFromSQL(__current_data[9]);
	}

	public void setEmployeeIdUpdated(java.lang.Integer val) {
		setCurrentData(10, val);
	}

	public java.lang.Integer getEmployeeIdUpdated() {
		return GenericBase.__getInt(__current_data[10]);
	}

	public void setDateDueReceipt(java.util.Date val) {
		setCurrentData(11, generateTimestampFromDate(val));
	}

	public java.util.Date getDateDueReceipt() {
		return GenericBase.__getDateFromSQL(__current_data[11]);
	}

	public void setDateUpdated(java.util.Date val) {
		setCurrentData(12, generateTimestampFromDate(val));
	}

	public java.util.Date getDateUpdated() {
		return GenericBase.__getDateFromSQL(__current_data[12]);
	}

	public void setFlagOvertime(java.lang.Boolean val) {
		setCurrentData(13, val);
	}

	public java.lang.Boolean getFlagOvertime() {
		return GenericBase.__getBoolean(__current_data[13]);
	}

	public void setContractId(java.lang.Integer val) {
		setCurrentData(14, val);
	}

	public java.lang.Integer getContractId() {
		return GenericBase.__getInt(__current_data[14]);
	}

	public void setReceiptPlanId(java.lang.Integer val) {
		setCurrentData(15, val);
	}

	public java.lang.Integer getReceiptPlanId() {
		return GenericBase.__getInt(__current_data[15]);
	}

	public void setConditionReceivableProductId(String op, java.lang.Integer val) {
		setConditionReceivableProductId(op, val, CONDITION_AND);
	}

	public void setConditionReceivableProductId(String op, java.lang.Integer val, String relation) {
		addCondition(0, op, relation, val);
	}

	public void setSelectReceivableProductId(boolean val) {
		__select_flags[0] = val;
	}

	public void setReceivableProductIdExpression(String val) {
		__dataExpressions[0] = val;
	}

	public void setConditionReceivableId(String op, java.lang.Integer val) {
		setConditionReceivableId(op, val, CONDITION_AND);
	}

	public void setConditionReceivableId(String op, java.lang.Integer val, String relation) {
		addCondition(1, op, relation, val);
	}

	public void setSelectReceivableId(boolean val) {
		__select_flags[1] = val;
	}

	public void setReceivableIdExpression(String val) {
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

	public void setConditionOrderId(String op, java.lang.Integer val) {
		setConditionOrderId(op, val, CONDITION_AND);
	}

	public void setConditionOrderId(String op, java.lang.Integer val, String relation) {
		addCondition(3, op, relation, val);
	}

	public void setSelectOrderId(boolean val) {
		__select_flags[3] = val;
	}

	public void setOrderIdExpression(String val) {
		__dataExpressions[3] = val;
	}

	public void setConditionOrderProductId(String op, java.lang.Integer val) {
		setConditionOrderProductId(op, val, CONDITION_AND);
	}

	public void setConditionOrderProductId(String op, java.lang.Integer val, String relation) {
		addCondition(4, op, relation, val);
	}

	public void setSelectOrderProductId(boolean val) {
		__select_flags[4] = val;
	}

	public void setOrderProductIdExpression(String val) {
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

	public void setConditionProductId(String op, java.lang.Integer val) {
		setConditionProductId(op, val, CONDITION_AND);
	}

	public void setConditionProductId(String op, java.lang.Integer val, String relation) {
		addCondition(6, op, relation, val);
	}

	public void setSelectProductId(boolean val) {
		__select_flags[6] = val;
	}

	public void setProductIdExpression(String val) {
		__dataExpressions[6] = val;
	}

	public void setConditionAmountReceivable(String op, java.math.BigDecimal val) {
		setConditionAmountReceivable(op, val, CONDITION_AND);
	}

	public void setConditionAmountReceivable(String op, java.math.BigDecimal val, String relation) {
		addCondition(7, op, relation, val);
	}

	public void setSelectAmountReceivable(boolean val) {
		__select_flags[7] = val;
	}

	public void setAmountReceivableExpression(String val) {
		__dataExpressions[7] = val;
	}

	public void setConditionEmployeeIdCreated(String op, java.lang.Integer val) {
		setConditionEmployeeIdCreated(op, val, CONDITION_AND);
	}

	public void setConditionEmployeeIdCreated(String op, java.lang.Integer val, String relation) {
		addCondition(8, op, relation, val);
	}

	public void setSelectEmployeeIdCreated(boolean val) {
		__select_flags[8] = val;
	}

	public void setEmployeeIdCreatedExpression(String val) {
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

	public void setConditionEmployeeIdUpdated(String op, java.lang.Integer val) {
		setConditionEmployeeIdUpdated(op, val, CONDITION_AND);
	}

	public void setConditionEmployeeIdUpdated(String op, java.lang.Integer val, String relation) {
		addCondition(10, op, relation, val);
	}

	public void setSelectEmployeeIdUpdated(boolean val) {
		__select_flags[10] = val;
	}

	public void setEmployeeIdUpdatedExpression(String val) {
		__dataExpressions[10] = val;
	}

	public void setConditionDateDueReceipt(String op, java.util.Date val) {
		setConditionDateDueReceipt(op, val, CONDITION_AND);
	}

	public void setConditionDateDueReceipt(String op, java.util.Date val, String relation) {
		addCondition(11, op, relation, generateTimestampFromDate(val));
	}

	public void setSelectDateDueReceipt(boolean val) {
		__select_flags[11] = val;
	}

	public void setDateDueReceiptExpression(String val) {
		__dataExpressions[11] = val;
	}

	public void setConditionDateUpdated(String op, java.util.Date val) {
		setConditionDateUpdated(op, val, CONDITION_AND);
	}

	public void setConditionDateUpdated(String op, java.util.Date val, String relation) {
		addCondition(12, op, relation, generateTimestampFromDate(val));
	}

	public void setSelectDateUpdated(boolean val) {
		__select_flags[12] = val;
	}

	public void setDateUpdatedExpression(String val) {
		__dataExpressions[12] = val;
	}

	public void setConditionFlagOvertime(String op, java.lang.Boolean val) {
		setConditionFlagOvertime(op, val, CONDITION_AND);
	}

	public void setConditionFlagOvertime(String op, java.lang.Boolean val, String relation) {
		addCondition(13, op, relation, val);
	}

	public void setSelectFlagOvertime(boolean val) {
		__select_flags[13] = val;
	}

	public void setFlagOvertimeExpression(String val) {
		__dataExpressions[13] = val;
	}

	public void setConditionContractId(String op, java.lang.Integer val) {
		setConditionContractId(op, val, CONDITION_AND);
	}

	public void setConditionContractId(String op, java.lang.Integer val, String relation) {
		addCondition(14, op, relation, val);
	}

	public void setSelectContractId(boolean val) {
		__select_flags[14] = val;
	}

	public void setContractIdExpression(String val) {
		__dataExpressions[14] = val;
	}

	public void setConditionReceiptPlanId(String op, java.lang.Integer val) {
		setConditionReceiptPlanId(op, val, CONDITION_AND);
	}

	public void setConditionReceiptPlanId(String op, java.lang.Integer val, String relation) {
		addCondition(15, op, relation, val);
	}

	public void setSelectReceiptPlanId(boolean val) {
		__select_flags[15] = val;
	}

	public void setReceiptPlanIdExpression(String val) {
		__dataExpressions[15] = val;
	}


}

