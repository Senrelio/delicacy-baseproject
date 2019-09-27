package fix.db.dao;

import delicacy.common.AbstractTable;
import delicacy.common.GenericBase;
import fix.db.bean.BaseFinRefundReceivableProduct;


public class FinRefundReceivableProduct extends AbstractTable<BaseFinRefundReceivableProduct>
{

	public FinRefundReceivableProduct() throws java.sql.SQLException 
	{

		initColumnNames();
	}

	protected final void initColumnNames()  throws java.sql.SQLException {

		__columnCount          = 17;

		initTables();

		__tableName            = "fin_refund_receivable_products";

		__key_columns          = new int[1];
		__key_columns[0] = 0;

		__column_names[0] = BaseFinRefundReceivableProduct.CS_REFUND_RECEIVABLE_PRODUCT_ID;
		__column_names[1] = BaseFinRefundReceivableProduct.CS_REFUND_RECEIVABLE_PRODUCT_CODE;
		__column_names[2] = BaseFinRefundReceivableProduct.CS_REFUND_ID;
		__column_names[3] = BaseFinRefundReceivableProduct.CS_ORDER_ID;
		__column_names[4] = BaseFinRefundReceivableProduct.CS_DEPARTMENT_ID;
		__column_names[5] = BaseFinRefundReceivableProduct.CS_ORDER_PRODUCT_ID;
		__column_names[6] = BaseFinRefundReceivableProduct.CS_RECEIVABLE_ID;
		__column_names[7] = BaseFinRefundReceivableProduct.CS_RECEIVABLE_PRODUCT_ID;
		__column_names[8] = BaseFinRefundReceivableProduct.CS_RECEIPT_ID;
		__column_names[9] = BaseFinRefundReceivableProduct.CS_RECEIPT_RECEIVABLE_PRODUCT_ID;
		__column_names[10] = BaseFinRefundReceivableProduct.CS_PRODUCT_ID;
		__column_names[11] = BaseFinRefundReceivableProduct.CS_EMPLOYEE_ID_CREATED;
		__column_names[12] = BaseFinRefundReceivableProduct.CS_AMOUNT_REFUND_RECEIVABLE_PRODUCT;
		__column_names[13] = BaseFinRefundReceivableProduct.CS_DATE_CREATED;
		__column_names[14] = BaseFinRefundReceivableProduct.CS_DATE_REFUNDED;
		__column_names[15] = BaseFinRefundReceivableProduct.CS_EMPLOYEE_ID_UPDATED;
		__column_names[16] = BaseFinRefundReceivableProduct.CS_DATE_UPDATED;

		resetSelectFlags() ;
		resetInsertFlags() ;
	}

	public void resetInsertFlags(){
		for(int i = 0; i < __columnCount; i ++ ) __insert_flags[i] = true;
		__insert_flags[0] = false;
		__serial_column = 0;
	}

	public void setPrimaryKeyFromBase(BaseFinRefundReceivableProduct b) {
		clear();
		setRefundReceivableProductIdClear(b.getRefundReceivableProductId());
	}

	public boolean isPrimaryKeyNull() {
		return getRefundReceivableProductId() == null;
	}

	@Override
	public BaseFinRefundReceivableProduct generateBase(){
		BaseFinRefundReceivableProduct b = new BaseFinRefundReceivableProduct();
		setDataToBase(b);
		return b;
	}

	@Override
	public void setDataToBase(BaseFinRefundReceivableProduct b){
		int count = 0; Object val;
		if((val = __current_data[count++]) != null) b.setRefundReceivableProductId(GenericBase.__getInt(val));
		if((val = __current_data[count++]) != null) b.setRefundReceivableProductCode(GenericBase.__getString(val));
		if((val = __current_data[count++]) != null) b.setRefundId(GenericBase.__getInt(val));
		if((val = __current_data[count++]) != null) b.setOrderId(GenericBase.__getInt(val));
		if((val = __current_data[count++]) != null) b.setDepartmentId(GenericBase.__getInt(val));
		if((val = __current_data[count++]) != null) b.setOrderProductId(GenericBase.__getInt(val));
		if((val = __current_data[count++]) != null) b.setReceivableId(GenericBase.__getInt(val));
		if((val = __current_data[count++]) != null) b.setReceivableProductId(GenericBase.__getInt(val));
		if((val = __current_data[count++]) != null) b.setReceiptId(GenericBase.__getInt(val));
		if((val = __current_data[count++]) != null) b.setReceiptReceivableProductId(GenericBase.__getInt(val));
		if((val = __current_data[count++]) != null) b.setProductId(GenericBase.__getInt(val));
		if((val = __current_data[count++]) != null) b.setEmployeeIdCreated(GenericBase.__getInt(val));
		if((val = __current_data[count++]) != null) b.setAmountRefundReceivableProduct(GenericBase.__getDecimal(val));
		if((val = __current_data[count++]) != null) b.setDateCreated(GenericBase.__getDateFromSQL(val));
		if((val = __current_data[count++]) != null) b.setDateRefunded(GenericBase.__getDateFromSQL(val));
		if((val = __current_data[count++]) != null) b.setEmployeeIdUpdated(GenericBase.__getInt(val));
		if((val = __current_data[count++]) != null) b.setDateUpdated(GenericBase.__getDateFromSQL(val));
	}

	@Override
	public void setBaseToBuffer(BaseFinRefundReceivableProduct b, Object[] buff){
		int count = 0;
		buff[count++] = b.getRefundReceivableProductId();
		buff[count++] = b.getRefundReceivableProductCode();
		buff[count++] = b.getRefundId();
		buff[count++] = b.getOrderId();
		buff[count++] = b.getDepartmentId();
		buff[count++] = b.getOrderProductId();
		buff[count++] = b.getReceivableId();
		buff[count++] = b.getReceivableProductId();
		buff[count++] = b.getReceiptId();
		buff[count++] = b.getReceiptReceivableProductId();
		buff[count++] = b.getProductId();
		buff[count++] = b.getEmployeeIdCreated();
		buff[count++] = b.getAmountRefundReceivableProduct();
		buff[count++] = generateTimestampFromDate(b.getDateCreated());
		buff[count++] = generateTimestampFromDate(b.getDateRefunded());
		buff[count++] = b.getEmployeeIdUpdated();
		buff[count++] = generateTimestampFromDate(b.getDateUpdated());
	}

	@Override
	public void setDataFromBase(BaseFinRefundReceivableProduct b){
		if(b.getRefundReceivableProductId() != null) setRefundReceivableProductIdClear(b.getRefundReceivableProductId());
		if(b.getRefundReceivableProductCode() != null) setRefundReceivableProductCode(b.getRefundReceivableProductCode());
		if(b.getRefundId() != null) setRefundId(b.getRefundId());
		if(b.getOrderId() != null) setOrderId(b.getOrderId());
		if(b.getDepartmentId() != null) setDepartmentId(b.getDepartmentId());
		if(b.getOrderProductId() != null) setOrderProductId(b.getOrderProductId());
		if(b.getReceivableId() != null) setReceivableId(b.getReceivableId());
		if(b.getReceivableProductId() != null) setReceivableProductId(b.getReceivableProductId());
		if(b.getReceiptId() != null) setReceiptId(b.getReceiptId());
		if(b.getReceiptReceivableProductId() != null) setReceiptReceivableProductId(b.getReceiptReceivableProductId());
		if(b.getProductId() != null) setProductId(b.getProductId());
		if(b.getEmployeeIdCreated() != null) setEmployeeIdCreated(b.getEmployeeIdCreated());
		if(b.getAmountRefundReceivableProduct() != null) setAmountRefundReceivableProduct(b.getAmountRefundReceivableProduct());
		if(b.getDateCreated() != null) setDateCreated(b.getDateCreated());
		if(b.getDateRefunded() != null) setDateRefunded(b.getDateRefunded());
		if(b.getEmployeeIdUpdated() != null) setEmployeeIdUpdated(b.getEmployeeIdUpdated());
		if(b.getDateUpdated() != null) setDateUpdated(b.getDateUpdated());
	}

	@Override
	public BaseFinRefundReceivableProduct generateBaseFromResultSet(java.sql.ResultSet sdr)  throws java.sql.SQLException {

		BaseFinRefundReceivableProduct b = new BaseFinRefundReceivableProduct();
		setQueryResultToBase(b, sdr);
		return b;
	}

	@Override
	public void setQueryResultToBase(BaseFinRefundReceivableProduct __base, java.sql.ResultSet sdr ) throws java.sql.SQLException {
		int count = 1, index = 0;
		java.sql.ResultSetMetaData rsmd = sdr.getMetaData();
		int columnCount = rsmd.getColumnCount();
		Object val;
		if(__select_flags[index++] && count <= columnCount && (val = sdr.getObject(count++)) != null) __base.setRefundReceivableProductId(GenericBase.__getInt(val));
		if(__select_flags[index++] && count <= columnCount && (val = sdr.getObject(count++)) != null) __base.setRefundReceivableProductCode(GenericBase.__getString(val));
		if(__select_flags[index++] && count <= columnCount && (val = sdr.getObject(count++)) != null) __base.setRefundId(GenericBase.__getInt(val));
		if(__select_flags[index++] && count <= columnCount && (val = sdr.getObject(count++)) != null) __base.setOrderId(GenericBase.__getInt(val));
		if(__select_flags[index++] && count <= columnCount && (val = sdr.getObject(count++)) != null) __base.setDepartmentId(GenericBase.__getInt(val));
		if(__select_flags[index++] && count <= columnCount && (val = sdr.getObject(count++)) != null) __base.setOrderProductId(GenericBase.__getInt(val));
		if(__select_flags[index++] && count <= columnCount && (val = sdr.getObject(count++)) != null) __base.setReceivableId(GenericBase.__getInt(val));
		if(__select_flags[index++] && count <= columnCount && (val = sdr.getObject(count++)) != null) __base.setReceivableProductId(GenericBase.__getInt(val));
		if(__select_flags[index++] && count <= columnCount && (val = sdr.getObject(count++)) != null) __base.setReceiptId(GenericBase.__getInt(val));
		if(__select_flags[index++] && count <= columnCount && (val = sdr.getObject(count++)) != null) __base.setReceiptReceivableProductId(GenericBase.__getInt(val));
		if(__select_flags[index++] && count <= columnCount && (val = sdr.getObject(count++)) != null) __base.setProductId(GenericBase.__getInt(val));
		if(__select_flags[index++] && count <= columnCount && (val = sdr.getObject(count++)) != null) __base.setEmployeeIdCreated(GenericBase.__getInt(val));
		if(__select_flags[index++] && count <= columnCount && (val = sdr.getObject(count++)) != null) __base.setAmountRefundReceivableProduct(GenericBase.__getDecimal(val));
		if(__select_flags[index++] && count <= columnCount && (val = sdr.getObject(count++)) != null) __base.setDateCreated(GenericBase.__getDateFromSQL(val));
		if(__select_flags[index++] && count <= columnCount && (val = sdr.getObject(count++)) != null) __base.setDateRefunded(GenericBase.__getDateFromSQL(val));
		if(__select_flags[index++] && count <= columnCount && (val = sdr.getObject(count++)) != null) __base.setEmployeeIdUpdated(GenericBase.__getInt(val));
		if(__select_flags[index++] && count <= columnCount && (val = sdr.getObject(count++)) != null) __base.setDateUpdated(GenericBase.__getDateFromSQL(val));
	}

	public void setRefundReceivableProductId(java.lang.Integer val) {
		setCurrentData(0, val);
	}

	public java.lang.Integer getRefundReceivableProductId() {
		return GenericBase.__getInt(__current_data[0]);
	}

	public void setRefundReceivableProductIdClear(java.lang.Integer val) {
		__backup_data[0] = __current_data[0] =  val;
		__modified_flags[0] = false;
	}

	public void setRefundReceivableProductCode(java.lang.String val) {
		setCurrentData(1, val);
	}

	public java.lang.String getRefundReceivableProductCode() {
		return GenericBase.__getString(__current_data[1]);
	}

	public void setRefundId(java.lang.Integer val) {
		setCurrentData(2, val);
	}

	public java.lang.Integer getRefundId() {
		return GenericBase.__getInt(__current_data[2]);
	}

	public void setOrderId(java.lang.Integer val) {
		setCurrentData(3, val);
	}

	public java.lang.Integer getOrderId() {
		return GenericBase.__getInt(__current_data[3]);
	}

	public void setDepartmentId(java.lang.Integer val) {
		setCurrentData(4, val);
	}

	public java.lang.Integer getDepartmentId() {
		return GenericBase.__getInt(__current_data[4]);
	}

	public void setOrderProductId(java.lang.Integer val) {
		setCurrentData(5, val);
	}

	public java.lang.Integer getOrderProductId() {
		return GenericBase.__getInt(__current_data[5]);
	}

	public void setReceivableId(java.lang.Integer val) {
		setCurrentData(6, val);
	}

	public java.lang.Integer getReceivableId() {
		return GenericBase.__getInt(__current_data[6]);
	}

	public void setReceivableProductId(java.lang.Integer val) {
		setCurrentData(7, val);
	}

	public java.lang.Integer getReceivableProductId() {
		return GenericBase.__getInt(__current_data[7]);
	}

	public void setReceiptId(java.lang.Integer val) {
		setCurrentData(8, val);
	}

	public java.lang.Integer getReceiptId() {
		return GenericBase.__getInt(__current_data[8]);
	}

	public void setReceiptReceivableProductId(java.lang.Integer val) {
		setCurrentData(9, val);
	}

	public java.lang.Integer getReceiptReceivableProductId() {
		return GenericBase.__getInt(__current_data[9]);
	}

	public void setProductId(java.lang.Integer val) {
		setCurrentData(10, val);
	}

	public java.lang.Integer getProductId() {
		return GenericBase.__getInt(__current_data[10]);
	}

	public void setEmployeeIdCreated(java.lang.Integer val) {
		setCurrentData(11, val);
	}

	public java.lang.Integer getEmployeeIdCreated() {
		return GenericBase.__getInt(__current_data[11]);
	}

	public void setAmountRefundReceivableProduct(java.math.BigDecimal val) {
		setCurrentData(12, val);
	}

	public java.math.BigDecimal getAmountRefundReceivableProduct() {
		return GenericBase.__getDecimal(__current_data[12]);
	}

	public void setDateCreated(java.util.Date val) {
		setCurrentData(13, generateTimestampFromDate(val));
	}

	public java.util.Date getDateCreated() {
		return GenericBase.__getDateFromSQL(__current_data[13]);
	}

	public void setDateRefunded(java.util.Date val) {
		setCurrentData(14, generateTimestampFromDate(val));
	}

	public java.util.Date getDateRefunded() {
		return GenericBase.__getDateFromSQL(__current_data[14]);
	}

	public void setEmployeeIdUpdated(java.lang.Integer val) {
		setCurrentData(15, val);
	}

	public java.lang.Integer getEmployeeIdUpdated() {
		return GenericBase.__getInt(__current_data[15]);
	}

	public void setDateUpdated(java.util.Date val) {
		setCurrentData(16, generateTimestampFromDate(val));
	}

	public java.util.Date getDateUpdated() {
		return GenericBase.__getDateFromSQL(__current_data[16]);
	}

	public void setConditionRefundReceivableProductId(String op, java.lang.Integer val) {
		setConditionRefundReceivableProductId(op, val, CONDITION_AND);
	}

	public void setConditionRefundReceivableProductId(String op, java.lang.Integer val, String relation) {
		addCondition(0, op, relation, val);
	}

	public void setSelectRefundReceivableProductId(boolean val) {
		__select_flags[0] = val;
	}

	public void setRefundReceivableProductIdExpression(String val) {
		__dataExpressions[0] = val;
	}

	public void setConditionRefundReceivableProductCode(String op, java.lang.String val) {
		setConditionRefundReceivableProductCode(op, val, CONDITION_AND);
	}

	public void setConditionRefundReceivableProductCode(String op, java.lang.String val, String relation) {
		addCondition(1, op, relation, val);
	}

	public void setSelectRefundReceivableProductCode(boolean val) {
		__select_flags[1] = val;
	}

	public void setRefundReceivableProductCodeExpression(String val) {
		__dataExpressions[1] = val;
	}

	public void setConditionRefundId(String op, java.lang.Integer val) {
		setConditionRefundId(op, val, CONDITION_AND);
	}

	public void setConditionRefundId(String op, java.lang.Integer val, String relation) {
		addCondition(2, op, relation, val);
	}

	public void setSelectRefundId(boolean val) {
		__select_flags[2] = val;
	}

	public void setRefundIdExpression(String val) {
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

	public void setConditionDepartmentId(String op, java.lang.Integer val) {
		setConditionDepartmentId(op, val, CONDITION_AND);
	}

	public void setConditionDepartmentId(String op, java.lang.Integer val, String relation) {
		addCondition(4, op, relation, val);
	}

	public void setSelectDepartmentId(boolean val) {
		__select_flags[4] = val;
	}

	public void setDepartmentIdExpression(String val) {
		__dataExpressions[4] = val;
	}

	public void setConditionOrderProductId(String op, java.lang.Integer val) {
		setConditionOrderProductId(op, val, CONDITION_AND);
	}

	public void setConditionOrderProductId(String op, java.lang.Integer val, String relation) {
		addCondition(5, op, relation, val);
	}

	public void setSelectOrderProductId(boolean val) {
		__select_flags[5] = val;
	}

	public void setOrderProductIdExpression(String val) {
		__dataExpressions[5] = val;
	}

	public void setConditionReceivableId(String op, java.lang.Integer val) {
		setConditionReceivableId(op, val, CONDITION_AND);
	}

	public void setConditionReceivableId(String op, java.lang.Integer val, String relation) {
		addCondition(6, op, relation, val);
	}

	public void setSelectReceivableId(boolean val) {
		__select_flags[6] = val;
	}

	public void setReceivableIdExpression(String val) {
		__dataExpressions[6] = val;
	}

	public void setConditionReceivableProductId(String op, java.lang.Integer val) {
		setConditionReceivableProductId(op, val, CONDITION_AND);
	}

	public void setConditionReceivableProductId(String op, java.lang.Integer val, String relation) {
		addCondition(7, op, relation, val);
	}

	public void setSelectReceivableProductId(boolean val) {
		__select_flags[7] = val;
	}

	public void setReceivableProductIdExpression(String val) {
		__dataExpressions[7] = val;
	}

	public void setConditionReceiptId(String op, java.lang.Integer val) {
		setConditionReceiptId(op, val, CONDITION_AND);
	}

	public void setConditionReceiptId(String op, java.lang.Integer val, String relation) {
		addCondition(8, op, relation, val);
	}

	public void setSelectReceiptId(boolean val) {
		__select_flags[8] = val;
	}

	public void setReceiptIdExpression(String val) {
		__dataExpressions[8] = val;
	}

	public void setConditionReceiptReceivableProductId(String op, java.lang.Integer val) {
		setConditionReceiptReceivableProductId(op, val, CONDITION_AND);
	}

	public void setConditionReceiptReceivableProductId(String op, java.lang.Integer val, String relation) {
		addCondition(9, op, relation, val);
	}

	public void setSelectReceiptReceivableProductId(boolean val) {
		__select_flags[9] = val;
	}

	public void setReceiptReceivableProductIdExpression(String val) {
		__dataExpressions[9] = val;
	}

	public void setConditionProductId(String op, java.lang.Integer val) {
		setConditionProductId(op, val, CONDITION_AND);
	}

	public void setConditionProductId(String op, java.lang.Integer val, String relation) {
		addCondition(10, op, relation, val);
	}

	public void setSelectProductId(boolean val) {
		__select_flags[10] = val;
	}

	public void setProductIdExpression(String val) {
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

	public void setConditionAmountRefundReceivableProduct(String op, java.math.BigDecimal val) {
		setConditionAmountRefundReceivableProduct(op, val, CONDITION_AND);
	}

	public void setConditionAmountRefundReceivableProduct(String op, java.math.BigDecimal val, String relation) {
		addCondition(12, op, relation, val);
	}

	public void setSelectAmountRefundReceivableProduct(boolean val) {
		__select_flags[12] = val;
	}

	public void setAmountRefundReceivableProductExpression(String val) {
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

	public void setConditionDateRefunded(String op, java.util.Date val) {
		setConditionDateRefunded(op, val, CONDITION_AND);
	}

	public void setConditionDateRefunded(String op, java.util.Date val, String relation) {
		addCondition(14, op, relation, generateTimestampFromDate(val));
	}

	public void setSelectDateRefunded(boolean val) {
		__select_flags[14] = val;
	}

	public void setDateRefundedExpression(String val) {
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

	public void setConditionDateUpdated(String op, java.util.Date val) {
		setConditionDateUpdated(op, val, CONDITION_AND);
	}

	public void setConditionDateUpdated(String op, java.util.Date val, String relation) {
		addCondition(16, op, relation, generateTimestampFromDate(val));
	}

	public void setSelectDateUpdated(boolean val) {
		__select_flags[16] = val;
	}

	public void setDateUpdatedExpression(String val) {
		__dataExpressions[16] = val;
	}


}

