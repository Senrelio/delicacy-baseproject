package fix.db.dao;

import delicacy.common.AbstractTable;
import delicacy.common.GenericBase;
import fix.db.bean.BaseFinReceiptReceivablesProduct;


public class FinReceiptReceivablesProduct extends AbstractTable<BaseFinReceiptReceivablesProduct>
{

	public FinReceiptReceivablesProduct() throws java.sql.SQLException 
	{

		initColumnNames();
	}

	protected final void initColumnNames()  throws java.sql.SQLException {

		__columnCount          = 17;

		initTables();

		__tableName            = "fin_receipt_receivables_products";

		__key_columns          = new int[1];
		__key_columns[0] = 0;

		__column_names[0] = BaseFinReceiptReceivablesProduct.CS_RECEIPT_RECEIVABLE_PRODUCT_ID;
		__column_names[1] = BaseFinReceiptReceivablesProduct.CS_RECEIPT_RECEIVABLE_CODE;
		__column_names[2] = BaseFinReceiptReceivablesProduct.CS_RECEIPT_ID;
		__column_names[3] = BaseFinReceiptReceivablesProduct.CS_RECEIVABLE_ID;
		__column_names[4] = BaseFinReceiptReceivablesProduct.CS_RECEIVABLE_PRODUCT_ID;
		__column_names[5] = BaseFinReceiptReceivablesProduct.CS_DEPARTMENT_ID;
		__column_names[6] = BaseFinReceiptReceivablesProduct.CS_ORDER_ID;
		__column_names[7] = BaseFinReceiptReceivablesProduct.CS_ORDER_PRODUCT_ID;
		__column_names[8] = BaseFinReceiptReceivablesProduct.CS_PRODUCT_ID;
		__column_names[9] = BaseFinReceiptReceivablesProduct.CS_AMOUNT_RECEIPT_RECEIVABLE_PRODUCT;
		__column_names[10] = BaseFinReceiptReceivablesProduct.CS_EMPLOYEE_ID_CREATED;
		__column_names[11] = BaseFinReceiptReceivablesProduct.CS_DATE_RECEIPTED;
		__column_names[12] = BaseFinReceiptReceivablesProduct.CS_DATE_CREATED;
		__column_names[13] = BaseFinReceiptReceivablesProduct.CS_EMPLOYEE_ID_UPDATED;
		__column_names[14] = BaseFinReceiptReceivablesProduct.CS_DATE_UPDATED;
		__column_names[15] = BaseFinReceiptReceivablesProduct.CS_CONTRACT_ID;
		__column_names[16] = BaseFinReceiptReceivablesProduct.CS_RECEIPT_PLAN_ID;

		resetSelectFlags() ;
		resetInsertFlags() ;
	}

	public void resetInsertFlags(){
		for(int i = 0; i < __columnCount; i ++ ) __insert_flags[i] = true;
		__insert_flags[0] = false;
		__serial_column = 0;
	}

	public void setPrimaryKeyFromBase(BaseFinReceiptReceivablesProduct b) {
		clear();
		setReceiptReceivableProductIdClear(b.getReceiptReceivableProductId());
	}

	public boolean isPrimaryKeyNull() {
		return getReceiptReceivableProductId() == null;
	}

	@Override
	public BaseFinReceiptReceivablesProduct generateBase(){
		BaseFinReceiptReceivablesProduct b = new BaseFinReceiptReceivablesProduct();
		setDataToBase(b);
		return b;
	}

	@Override
	public void setDataToBase(BaseFinReceiptReceivablesProduct b){
		int count = 0; Object val;
		if((val = __current_data[count++]) != null) b.setReceiptReceivableProductId(GenericBase.__getInt(val));
		if((val = __current_data[count++]) != null) b.setReceiptReceivableCode(GenericBase.__getString(val));
		if((val = __current_data[count++]) != null) b.setReceiptId(GenericBase.__getInt(val));
		if((val = __current_data[count++]) != null) b.setReceivableId(GenericBase.__getInt(val));
		if((val = __current_data[count++]) != null) b.setReceivableProductId(GenericBase.__getInt(val));
		if((val = __current_data[count++]) != null) b.setDepartmentId(GenericBase.__getInt(val));
		if((val = __current_data[count++]) != null) b.setOrderId(GenericBase.__getInt(val));
		if((val = __current_data[count++]) != null) b.setOrderProductId(GenericBase.__getInt(val));
		if((val = __current_data[count++]) != null) b.setProductId(GenericBase.__getInt(val));
		if((val = __current_data[count++]) != null) b.setAmountReceiptReceivableProduct(GenericBase.__getDecimal(val));
		if((val = __current_data[count++]) != null) b.setEmployeeIdCreated(GenericBase.__getInt(val));
		if((val = __current_data[count++]) != null) b.setDateReceipted(GenericBase.__getDateFromSQL(val));
		if((val = __current_data[count++]) != null) b.setDateCreated(GenericBase.__getDateFromSQL(val));
		if((val = __current_data[count++]) != null) b.setEmployeeIdUpdated(GenericBase.__getInt(val));
		if((val = __current_data[count++]) != null) b.setDateUpdated(GenericBase.__getDateFromSQL(val));
		if((val = __current_data[count++]) != null) b.setContractId(GenericBase.__getInt(val));
		if((val = __current_data[count++]) != null) b.setReceiptPlanId(GenericBase.__getInt(val));
	}

	@Override
	public void setBaseToBuffer(BaseFinReceiptReceivablesProduct b, Object[] buff){
		int count = 0;
		buff[count++] = b.getReceiptReceivableProductId();
		buff[count++] = b.getReceiptReceivableCode();
		buff[count++] = b.getReceiptId();
		buff[count++] = b.getReceivableId();
		buff[count++] = b.getReceivableProductId();
		buff[count++] = b.getDepartmentId();
		buff[count++] = b.getOrderId();
		buff[count++] = b.getOrderProductId();
		buff[count++] = b.getProductId();
		buff[count++] = b.getAmountReceiptReceivableProduct();
		buff[count++] = b.getEmployeeIdCreated();
		buff[count++] = generateTimestampFromDate(b.getDateReceipted());
		buff[count++] = generateTimestampFromDate(b.getDateCreated());
		buff[count++] = b.getEmployeeIdUpdated();
		buff[count++] = generateTimestampFromDate(b.getDateUpdated());
		buff[count++] = b.getContractId();
		buff[count++] = b.getReceiptPlanId();
	}

	@Override
	public void setDataFromBase(BaseFinReceiptReceivablesProduct b){
		if(b.getReceiptReceivableProductId() != null) setReceiptReceivableProductIdClear(b.getReceiptReceivableProductId());
		if(b.getReceiptReceivableCode() != null) setReceiptReceivableCode(b.getReceiptReceivableCode());
		if(b.getReceiptId() != null) setReceiptId(b.getReceiptId());
		if(b.getReceivableId() != null) setReceivableId(b.getReceivableId());
		if(b.getReceivableProductId() != null) setReceivableProductId(b.getReceivableProductId());
		if(b.getDepartmentId() != null) setDepartmentId(b.getDepartmentId());
		if(b.getOrderId() != null) setOrderId(b.getOrderId());
		if(b.getOrderProductId() != null) setOrderProductId(b.getOrderProductId());
		if(b.getProductId() != null) setProductId(b.getProductId());
		if(b.getAmountReceiptReceivableProduct() != null) setAmountReceiptReceivableProduct(b.getAmountReceiptReceivableProduct());
		if(b.getEmployeeIdCreated() != null) setEmployeeIdCreated(b.getEmployeeIdCreated());
		if(b.getDateReceipted() != null) setDateReceipted(b.getDateReceipted());
		if(b.getDateCreated() != null) setDateCreated(b.getDateCreated());
		if(b.getEmployeeIdUpdated() != null) setEmployeeIdUpdated(b.getEmployeeIdUpdated());
		if(b.getDateUpdated() != null) setDateUpdated(b.getDateUpdated());
		if(b.getContractId() != null) setContractId(b.getContractId());
		if(b.getReceiptPlanId() != null) setReceiptPlanId(b.getReceiptPlanId());
	}

	@Override
	public BaseFinReceiptReceivablesProduct generateBaseFromResultSet(java.sql.ResultSet sdr)  throws java.sql.SQLException {

		BaseFinReceiptReceivablesProduct b = new BaseFinReceiptReceivablesProduct();
		setQueryResultToBase(b, sdr);
		return b;
	}

	@Override
	public void setQueryResultToBase(BaseFinReceiptReceivablesProduct __base, java.sql.ResultSet sdr ) throws java.sql.SQLException {
		int count = 1, index = 0;
		java.sql.ResultSetMetaData rsmd = sdr.getMetaData();
		int columnCount = rsmd.getColumnCount();
		Object val;
		if(__select_flags[index++] && count <= columnCount && (val = sdr.getObject(count++)) != null) __base.setReceiptReceivableProductId(GenericBase.__getInt(val));
		if(__select_flags[index++] && count <= columnCount && (val = sdr.getObject(count++)) != null) __base.setReceiptReceivableCode(GenericBase.__getString(val));
		if(__select_flags[index++] && count <= columnCount && (val = sdr.getObject(count++)) != null) __base.setReceiptId(GenericBase.__getInt(val));
		if(__select_flags[index++] && count <= columnCount && (val = sdr.getObject(count++)) != null) __base.setReceivableId(GenericBase.__getInt(val));
		if(__select_flags[index++] && count <= columnCount && (val = sdr.getObject(count++)) != null) __base.setReceivableProductId(GenericBase.__getInt(val));
		if(__select_flags[index++] && count <= columnCount && (val = sdr.getObject(count++)) != null) __base.setDepartmentId(GenericBase.__getInt(val));
		if(__select_flags[index++] && count <= columnCount && (val = sdr.getObject(count++)) != null) __base.setOrderId(GenericBase.__getInt(val));
		if(__select_flags[index++] && count <= columnCount && (val = sdr.getObject(count++)) != null) __base.setOrderProductId(GenericBase.__getInt(val));
		if(__select_flags[index++] && count <= columnCount && (val = sdr.getObject(count++)) != null) __base.setProductId(GenericBase.__getInt(val));
		if(__select_flags[index++] && count <= columnCount && (val = sdr.getObject(count++)) != null) __base.setAmountReceiptReceivableProduct(GenericBase.__getDecimal(val));
		if(__select_flags[index++] && count <= columnCount && (val = sdr.getObject(count++)) != null) __base.setEmployeeIdCreated(GenericBase.__getInt(val));
		if(__select_flags[index++] && count <= columnCount && (val = sdr.getObject(count++)) != null) __base.setDateReceipted(GenericBase.__getDateFromSQL(val));
		if(__select_flags[index++] && count <= columnCount && (val = sdr.getObject(count++)) != null) __base.setDateCreated(GenericBase.__getDateFromSQL(val));
		if(__select_flags[index++] && count <= columnCount && (val = sdr.getObject(count++)) != null) __base.setEmployeeIdUpdated(GenericBase.__getInt(val));
		if(__select_flags[index++] && count <= columnCount && (val = sdr.getObject(count++)) != null) __base.setDateUpdated(GenericBase.__getDateFromSQL(val));
		if(__select_flags[index++] && count <= columnCount && (val = sdr.getObject(count++)) != null) __base.setContractId(GenericBase.__getInt(val));
		if(__select_flags[index++] && count <= columnCount && (val = sdr.getObject(count++)) != null) __base.setReceiptPlanId(GenericBase.__getInt(val));
	}

	public void setReceiptReceivableProductId(java.lang.Integer val) {
		setCurrentData(0, val);
	}

	public java.lang.Integer getReceiptReceivableProductId() {
		return GenericBase.__getInt(__current_data[0]);
	}

	public void setReceiptReceivableProductIdClear(java.lang.Integer val) {
		__backup_data[0] = __current_data[0] =  val;
		__modified_flags[0] = false;
	}

	public void setReceiptReceivableCode(java.lang.String val) {
		setCurrentData(1, val);
	}

	public java.lang.String getReceiptReceivableCode() {
		return GenericBase.__getString(__current_data[1]);
	}

	public void setReceiptId(java.lang.Integer val) {
		setCurrentData(2, val);
	}

	public java.lang.Integer getReceiptId() {
		return GenericBase.__getInt(__current_data[2]);
	}

	public void setReceivableId(java.lang.Integer val) {
		setCurrentData(3, val);
	}

	public java.lang.Integer getReceivableId() {
		return GenericBase.__getInt(__current_data[3]);
	}

	public void setReceivableProductId(java.lang.Integer val) {
		setCurrentData(4, val);
	}

	public java.lang.Integer getReceivableProductId() {
		return GenericBase.__getInt(__current_data[4]);
	}

	public void setDepartmentId(java.lang.Integer val) {
		setCurrentData(5, val);
	}

	public java.lang.Integer getDepartmentId() {
		return GenericBase.__getInt(__current_data[5]);
	}

	public void setOrderId(java.lang.Integer val) {
		setCurrentData(6, val);
	}

	public java.lang.Integer getOrderId() {
		return GenericBase.__getInt(__current_data[6]);
	}

	public void setOrderProductId(java.lang.Integer val) {
		setCurrentData(7, val);
	}

	public java.lang.Integer getOrderProductId() {
		return GenericBase.__getInt(__current_data[7]);
	}

	public void setProductId(java.lang.Integer val) {
		setCurrentData(8, val);
	}

	public java.lang.Integer getProductId() {
		return GenericBase.__getInt(__current_data[8]);
	}

	public void setAmountReceiptReceivableProduct(java.math.BigDecimal val) {
		setCurrentData(9, val);
	}

	public java.math.BigDecimal getAmountReceiptReceivableProduct() {
		return GenericBase.__getDecimal(__current_data[9]);
	}

	public void setEmployeeIdCreated(java.lang.Integer val) {
		setCurrentData(10, val);
	}

	public java.lang.Integer getEmployeeIdCreated() {
		return GenericBase.__getInt(__current_data[10]);
	}

	public void setDateReceipted(java.util.Date val) {
		setCurrentData(11, generateTimestampFromDate(val));
	}

	public java.util.Date getDateReceipted() {
		return GenericBase.__getDateFromSQL(__current_data[11]);
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

	public void setContractId(java.lang.Integer val) {
		setCurrentData(15, val);
	}

	public java.lang.Integer getContractId() {
		return GenericBase.__getInt(__current_data[15]);
	}

	public void setReceiptPlanId(java.lang.Integer val) {
		setCurrentData(16, val);
	}

	public java.lang.Integer getReceiptPlanId() {
		return GenericBase.__getInt(__current_data[16]);
	}

	public void setConditionReceiptReceivableProductId(String op, java.lang.Integer val) {
		setConditionReceiptReceivableProductId(op, val, CONDITION_AND);
	}

	public void setConditionReceiptReceivableProductId(String op, java.lang.Integer val, String relation) {
		addCondition(0, op, relation, val);
	}

	public void setSelectReceiptReceivableProductId(boolean val) {
		__select_flags[0] = val;
	}

	public void setReceiptReceivableProductIdExpression(String val) {
		__dataExpressions[0] = val;
	}

	public void setConditionReceiptReceivableCode(String op, java.lang.String val) {
		setConditionReceiptReceivableCode(op, val, CONDITION_AND);
	}

	public void setConditionReceiptReceivableCode(String op, java.lang.String val, String relation) {
		addCondition(1, op, relation, val);
	}

	public void setSelectReceiptReceivableCode(boolean val) {
		__select_flags[1] = val;
	}

	public void setReceiptReceivableCodeExpression(String val) {
		__dataExpressions[1] = val;
	}

	public void setConditionReceiptId(String op, java.lang.Integer val) {
		setConditionReceiptId(op, val, CONDITION_AND);
	}

	public void setConditionReceiptId(String op, java.lang.Integer val, String relation) {
		addCondition(2, op, relation, val);
	}

	public void setSelectReceiptId(boolean val) {
		__select_flags[2] = val;
	}

	public void setReceiptIdExpression(String val) {
		__dataExpressions[2] = val;
	}

	public void setConditionReceivableId(String op, java.lang.Integer val) {
		setConditionReceivableId(op, val, CONDITION_AND);
	}

	public void setConditionReceivableId(String op, java.lang.Integer val, String relation) {
		addCondition(3, op, relation, val);
	}

	public void setSelectReceivableId(boolean val) {
		__select_flags[3] = val;
	}

	public void setReceivableIdExpression(String val) {
		__dataExpressions[3] = val;
	}

	public void setConditionReceivableProductId(String op, java.lang.Integer val) {
		setConditionReceivableProductId(op, val, CONDITION_AND);
	}

	public void setConditionReceivableProductId(String op, java.lang.Integer val, String relation) {
		addCondition(4, op, relation, val);
	}

	public void setSelectReceivableProductId(boolean val) {
		__select_flags[4] = val;
	}

	public void setReceivableProductIdExpression(String val) {
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

	public void setConditionOrderId(String op, java.lang.Integer val) {
		setConditionOrderId(op, val, CONDITION_AND);
	}

	public void setConditionOrderId(String op, java.lang.Integer val, String relation) {
		addCondition(6, op, relation, val);
	}

	public void setSelectOrderId(boolean val) {
		__select_flags[6] = val;
	}

	public void setOrderIdExpression(String val) {
		__dataExpressions[6] = val;
	}

	public void setConditionOrderProductId(String op, java.lang.Integer val) {
		setConditionOrderProductId(op, val, CONDITION_AND);
	}

	public void setConditionOrderProductId(String op, java.lang.Integer val, String relation) {
		addCondition(7, op, relation, val);
	}

	public void setSelectOrderProductId(boolean val) {
		__select_flags[7] = val;
	}

	public void setOrderProductIdExpression(String val) {
		__dataExpressions[7] = val;
	}

	public void setConditionProductId(String op, java.lang.Integer val) {
		setConditionProductId(op, val, CONDITION_AND);
	}

	public void setConditionProductId(String op, java.lang.Integer val, String relation) {
		addCondition(8, op, relation, val);
	}

	public void setSelectProductId(boolean val) {
		__select_flags[8] = val;
	}

	public void setProductIdExpression(String val) {
		__dataExpressions[8] = val;
	}

	public void setConditionAmountReceiptReceivableProduct(String op, java.math.BigDecimal val) {
		setConditionAmountReceiptReceivableProduct(op, val, CONDITION_AND);
	}

	public void setConditionAmountReceiptReceivableProduct(String op, java.math.BigDecimal val, String relation) {
		addCondition(9, op, relation, val);
	}

	public void setSelectAmountReceiptReceivableProduct(boolean val) {
		__select_flags[9] = val;
	}

	public void setAmountReceiptReceivableProductExpression(String val) {
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

	public void setConditionDateReceipted(String op, java.util.Date val) {
		setConditionDateReceipted(op, val, CONDITION_AND);
	}

	public void setConditionDateReceipted(String op, java.util.Date val, String relation) {
		addCondition(11, op, relation, generateTimestampFromDate(val));
	}

	public void setSelectDateReceipted(boolean val) {
		__select_flags[11] = val;
	}

	public void setDateReceiptedExpression(String val) {
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

	public void setConditionContractId(String op, java.lang.Integer val) {
		setConditionContractId(op, val, CONDITION_AND);
	}

	public void setConditionContractId(String op, java.lang.Integer val, String relation) {
		addCondition(15, op, relation, val);
	}

	public void setSelectContractId(boolean val) {
		__select_flags[15] = val;
	}

	public void setContractIdExpression(String val) {
		__dataExpressions[15] = val;
	}

	public void setConditionReceiptPlanId(String op, java.lang.Integer val) {
		setConditionReceiptPlanId(op, val, CONDITION_AND);
	}

	public void setConditionReceiptPlanId(String op, java.lang.Integer val, String relation) {
		addCondition(16, op, relation, val);
	}

	public void setSelectReceiptPlanId(boolean val) {
		__select_flags[16] = val;
	}

	public void setReceiptPlanIdExpression(String val) {
		__dataExpressions[16] = val;
	}


}

