package fix.db.dao;

import delicacy.common.AbstractTable;
import delicacy.common.GenericBase;
import fix.db.bean.BaseFinReceivableChangeOrderProduct;


public class FinReceivableChangeOrderProduct extends AbstractTable<BaseFinReceivableChangeOrderProduct>
{

	public FinReceivableChangeOrderProduct() throws java.sql.SQLException 
	{

		initColumnNames();
	}

	protected final void initColumnNames()  throws java.sql.SQLException {

		__columnCount          = 14;

		initTables();

		__tableName            = "fin_receivable_change_order_products";

		__key_columns          = new int[1];
		__key_columns[0] = 0;

		__column_names[0] = BaseFinReceivableChangeOrderProduct.CS_RECEIVABLE_CHANGE_ORDER_PRODUCT_ID;
		__column_names[1] = BaseFinReceivableChangeOrderProduct.CS_RECEIVABLE_CHANGE_ID;
		__column_names[2] = BaseFinReceivableChangeOrderProduct.CS_ORDER_ID;
		__column_names[3] = BaseFinReceivableChangeOrderProduct.CS_DEPARTMENT_ID;
		__column_names[4] = BaseFinReceivableChangeOrderProduct.CS_ORDER_PRODUCT_ID;
		__column_names[5] = BaseFinReceivableChangeOrderProduct.CS_RECEIVABLE_ID;
		__column_names[6] = BaseFinReceivableChangeOrderProduct.CS_INVOICEITEMID;
		__column_names[7] = BaseFinReceivableChangeOrderProduct.CS_PRODUCT_ID;
		__column_names[8] = BaseFinReceivableChangeOrderProduct.CS_AMOUNT_CHANGE_RECEIVABLE_ORDER_PRODUCT;
		__column_names[9] = BaseFinReceivableChangeOrderProduct.CS_EMPLOYEE_ID_CREATED;
		__column_names[10] = BaseFinReceivableChangeOrderProduct.CS_DATE_CHANGED;
		__column_names[11] = BaseFinReceivableChangeOrderProduct.CS_DATE_CREATED;
		__column_names[12] = BaseFinReceivableChangeOrderProduct.CS_EMPLOYEE_ID_UPDATED;
		__column_names[13] = BaseFinReceivableChangeOrderProduct.CS_DATE_UPDATED;

		resetSelectFlags() ;
		resetInsertFlags() ;
	}

	public void resetInsertFlags(){
		for(int i = 0; i < __columnCount; i ++ ) __insert_flags[i] = true;
		__insert_flags[0] = false;
		__serial_column = 0;
	}

	public void setPrimaryKeyFromBase(BaseFinReceivableChangeOrderProduct b) {
		clear();
		setReceivableChangeOrderProductIdClear(b.getReceivableChangeOrderProductId());
	}

	public boolean isPrimaryKeyNull() {
		return getReceivableChangeOrderProductId() == null;
	}

	@Override
	public BaseFinReceivableChangeOrderProduct generateBase(){
		BaseFinReceivableChangeOrderProduct b = new BaseFinReceivableChangeOrderProduct();
		setDataToBase(b);
		return b;
	}

	@Override
	public void setDataToBase(BaseFinReceivableChangeOrderProduct b){
		int count = 0; Object val;
		if((val = __current_data[count++]) != null) b.setReceivableChangeOrderProductId(GenericBase.__getInt(val));
		if((val = __current_data[count++]) != null) b.setReceivableChangeId(GenericBase.__getInt(val));
		if((val = __current_data[count++]) != null) b.setOrderId(GenericBase.__getInt(val));
		if((val = __current_data[count++]) != null) b.setDepartmentId(GenericBase.__getInt(val));
		if((val = __current_data[count++]) != null) b.setOrderProductId(GenericBase.__getInt(val));
		if((val = __current_data[count++]) != null) b.setReceivableId(GenericBase.__getInt(val));
		if((val = __current_data[count++]) != null) b.setInvoiceitemid(GenericBase.__getInt(val));
		if((val = __current_data[count++]) != null) b.setProductId(GenericBase.__getInt(val));
		if((val = __current_data[count++]) != null) b.setAmountChangeReceivableOrderProduct(GenericBase.__getDecimal(val));
		if((val = __current_data[count++]) != null) b.setEmployeeIdCreated(GenericBase.__getInt(val));
		if((val = __current_data[count++]) != null) b.setDateChanged(GenericBase.__getDateFromSQL(val));
		if((val = __current_data[count++]) != null) b.setDateCreated(GenericBase.__getDateFromSQL(val));
		if((val = __current_data[count++]) != null) b.setEmployeeIdUpdated(GenericBase.__getInt(val));
		if((val = __current_data[count++]) != null) b.setDateUpdated(GenericBase.__getDateFromSQL(val));
	}

	@Override
	public void setBaseToBuffer(BaseFinReceivableChangeOrderProduct b, Object[] buff){
		int count = 0;
		buff[count++] = b.getReceivableChangeOrderProductId();
		buff[count++] = b.getReceivableChangeId();
		buff[count++] = b.getOrderId();
		buff[count++] = b.getDepartmentId();
		buff[count++] = b.getOrderProductId();
		buff[count++] = b.getReceivableId();
		buff[count++] = b.getInvoiceitemid();
		buff[count++] = b.getProductId();
		buff[count++] = b.getAmountChangeReceivableOrderProduct();
		buff[count++] = b.getEmployeeIdCreated();
		buff[count++] = generateTimestampFromDate(b.getDateChanged());
		buff[count++] = generateTimestampFromDate(b.getDateCreated());
		buff[count++] = b.getEmployeeIdUpdated();
		buff[count++] = generateTimestampFromDate(b.getDateUpdated());
	}

	@Override
	public void setDataFromBase(BaseFinReceivableChangeOrderProduct b){
		if(b.getReceivableChangeOrderProductId() != null) setReceivableChangeOrderProductIdClear(b.getReceivableChangeOrderProductId());
		if(b.getReceivableChangeId() != null) setReceivableChangeId(b.getReceivableChangeId());
		if(b.getOrderId() != null) setOrderId(b.getOrderId());
		if(b.getDepartmentId() != null) setDepartmentId(b.getDepartmentId());
		if(b.getOrderProductId() != null) setOrderProductId(b.getOrderProductId());
		if(b.getReceivableId() != null) setReceivableId(b.getReceivableId());
		if(b.getInvoiceitemid() != null) setInvoiceitemid(b.getInvoiceitemid());
		if(b.getProductId() != null) setProductId(b.getProductId());
		if(b.getAmountChangeReceivableOrderProduct() != null) setAmountChangeReceivableOrderProduct(b.getAmountChangeReceivableOrderProduct());
		if(b.getEmployeeIdCreated() != null) setEmployeeIdCreated(b.getEmployeeIdCreated());
		if(b.getDateChanged() != null) setDateChanged(b.getDateChanged());
		if(b.getDateCreated() != null) setDateCreated(b.getDateCreated());
		if(b.getEmployeeIdUpdated() != null) setEmployeeIdUpdated(b.getEmployeeIdUpdated());
		if(b.getDateUpdated() != null) setDateUpdated(b.getDateUpdated());
	}

	@Override
	public BaseFinReceivableChangeOrderProduct generateBaseFromResultSet(java.sql.ResultSet sdr)  throws java.sql.SQLException {

		BaseFinReceivableChangeOrderProduct b = new BaseFinReceivableChangeOrderProduct();
		setQueryResultToBase(b, sdr);
		return b;
	}

	@Override
	public void setQueryResultToBase(BaseFinReceivableChangeOrderProduct __base, java.sql.ResultSet sdr ) throws java.sql.SQLException {
		int count = 1, index = 0;
		java.sql.ResultSetMetaData rsmd = sdr.getMetaData();
		int columnCount = rsmd.getColumnCount();
		Object val;
		if(__select_flags[index++] && count <= columnCount && (val = sdr.getObject(count++)) != null) __base.setReceivableChangeOrderProductId(GenericBase.__getInt(val));
		if(__select_flags[index++] && count <= columnCount && (val = sdr.getObject(count++)) != null) __base.setReceivableChangeId(GenericBase.__getInt(val));
		if(__select_flags[index++] && count <= columnCount && (val = sdr.getObject(count++)) != null) __base.setOrderId(GenericBase.__getInt(val));
		if(__select_flags[index++] && count <= columnCount && (val = sdr.getObject(count++)) != null) __base.setDepartmentId(GenericBase.__getInt(val));
		if(__select_flags[index++] && count <= columnCount && (val = sdr.getObject(count++)) != null) __base.setOrderProductId(GenericBase.__getInt(val));
		if(__select_flags[index++] && count <= columnCount && (val = sdr.getObject(count++)) != null) __base.setReceivableId(GenericBase.__getInt(val));
		if(__select_flags[index++] && count <= columnCount && (val = sdr.getObject(count++)) != null) __base.setInvoiceitemid(GenericBase.__getInt(val));
		if(__select_flags[index++] && count <= columnCount && (val = sdr.getObject(count++)) != null) __base.setProductId(GenericBase.__getInt(val));
		if(__select_flags[index++] && count <= columnCount && (val = sdr.getObject(count++)) != null) __base.setAmountChangeReceivableOrderProduct(GenericBase.__getDecimal(val));
		if(__select_flags[index++] && count <= columnCount && (val = sdr.getObject(count++)) != null) __base.setEmployeeIdCreated(GenericBase.__getInt(val));
		if(__select_flags[index++] && count <= columnCount && (val = sdr.getObject(count++)) != null) __base.setDateChanged(GenericBase.__getDateFromSQL(val));
		if(__select_flags[index++] && count <= columnCount && (val = sdr.getObject(count++)) != null) __base.setDateCreated(GenericBase.__getDateFromSQL(val));
		if(__select_flags[index++] && count <= columnCount && (val = sdr.getObject(count++)) != null) __base.setEmployeeIdUpdated(GenericBase.__getInt(val));
		if(__select_flags[index++] && count <= columnCount && (val = sdr.getObject(count++)) != null) __base.setDateUpdated(GenericBase.__getDateFromSQL(val));
	}

	public void setReceivableChangeOrderProductId(java.lang.Integer val) {
		setCurrentData(0, val);
	}

	public java.lang.Integer getReceivableChangeOrderProductId() {
		return GenericBase.__getInt(__current_data[0]);
	}

	public void setReceivableChangeOrderProductIdClear(java.lang.Integer val) {
		__backup_data[0] = __current_data[0] =  val;
		__modified_flags[0] = false;
	}

	public void setReceivableChangeId(java.lang.Integer val) {
		setCurrentData(1, val);
	}

	public java.lang.Integer getReceivableChangeId() {
		return GenericBase.__getInt(__current_data[1]);
	}

	public void setOrderId(java.lang.Integer val) {
		setCurrentData(2, val);
	}

	public java.lang.Integer getOrderId() {
		return GenericBase.__getInt(__current_data[2]);
	}

	public void setDepartmentId(java.lang.Integer val) {
		setCurrentData(3, val);
	}

	public java.lang.Integer getDepartmentId() {
		return GenericBase.__getInt(__current_data[3]);
	}

	public void setOrderProductId(java.lang.Integer val) {
		setCurrentData(4, val);
	}

	public java.lang.Integer getOrderProductId() {
		return GenericBase.__getInt(__current_data[4]);
	}

	public void setReceivableId(java.lang.Integer val) {
		setCurrentData(5, val);
	}

	public java.lang.Integer getReceivableId() {
		return GenericBase.__getInt(__current_data[5]);
	}

	public void setInvoiceitemid(java.lang.Integer val) {
		setCurrentData(6, val);
	}

	public java.lang.Integer getInvoiceitemid() {
		return GenericBase.__getInt(__current_data[6]);
	}

	public void setProductId(java.lang.Integer val) {
		setCurrentData(7, val);
	}

	public java.lang.Integer getProductId() {
		return GenericBase.__getInt(__current_data[7]);
	}

	public void setAmountChangeReceivableOrderProduct(java.math.BigDecimal val) {
		setCurrentData(8, val);
	}

	public java.math.BigDecimal getAmountChangeReceivableOrderProduct() {
		return GenericBase.__getDecimal(__current_data[8]);
	}

	public void setEmployeeIdCreated(java.lang.Integer val) {
		setCurrentData(9, val);
	}

	public java.lang.Integer getEmployeeIdCreated() {
		return GenericBase.__getInt(__current_data[9]);
	}

	public void setDateChanged(java.util.Date val) {
		setCurrentData(10, generateTimestampFromDate(val));
	}

	public java.util.Date getDateChanged() {
		return GenericBase.__getDateFromSQL(__current_data[10]);
	}

	public void setDateCreated(java.util.Date val) {
		setCurrentData(11, generateTimestampFromDate(val));
	}

	public java.util.Date getDateCreated() {
		return GenericBase.__getDateFromSQL(__current_data[11]);
	}

	public void setEmployeeIdUpdated(java.lang.Integer val) {
		setCurrentData(12, val);
	}

	public java.lang.Integer getEmployeeIdUpdated() {
		return GenericBase.__getInt(__current_data[12]);
	}

	public void setDateUpdated(java.util.Date val) {
		setCurrentData(13, generateTimestampFromDate(val));
	}

	public java.util.Date getDateUpdated() {
		return GenericBase.__getDateFromSQL(__current_data[13]);
	}

	public void setConditionReceivableChangeOrderProductId(String op, java.lang.Integer val) {
		setConditionReceivableChangeOrderProductId(op, val, CONDITION_AND);
	}

	public void setConditionReceivableChangeOrderProductId(String op, java.lang.Integer val, String relation) {
		addCondition(0, op, relation, val);
	}

	public void setSelectReceivableChangeOrderProductId(boolean val) {
		__select_flags[0] = val;
	}

	public void setReceivableChangeOrderProductIdExpression(String val) {
		__dataExpressions[0] = val;
	}

	public void setConditionReceivableChangeId(String op, java.lang.Integer val) {
		setConditionReceivableChangeId(op, val, CONDITION_AND);
	}

	public void setConditionReceivableChangeId(String op, java.lang.Integer val, String relation) {
		addCondition(1, op, relation, val);
	}

	public void setSelectReceivableChangeId(boolean val) {
		__select_flags[1] = val;
	}

	public void setReceivableChangeIdExpression(String val) {
		__dataExpressions[1] = val;
	}

	public void setConditionOrderId(String op, java.lang.Integer val) {
		setConditionOrderId(op, val, CONDITION_AND);
	}

	public void setConditionOrderId(String op, java.lang.Integer val, String relation) {
		addCondition(2, op, relation, val);
	}

	public void setSelectOrderId(boolean val) {
		__select_flags[2] = val;
	}

	public void setOrderIdExpression(String val) {
		__dataExpressions[2] = val;
	}

	public void setConditionDepartmentId(String op, java.lang.Integer val) {
		setConditionDepartmentId(op, val, CONDITION_AND);
	}

	public void setConditionDepartmentId(String op, java.lang.Integer val, String relation) {
		addCondition(3, op, relation, val);
	}

	public void setSelectDepartmentId(boolean val) {
		__select_flags[3] = val;
	}

	public void setDepartmentIdExpression(String val) {
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

	public void setConditionReceivableId(String op, java.lang.Integer val) {
		setConditionReceivableId(op, val, CONDITION_AND);
	}

	public void setConditionReceivableId(String op, java.lang.Integer val, String relation) {
		addCondition(5, op, relation, val);
	}

	public void setSelectReceivableId(boolean val) {
		__select_flags[5] = val;
	}

	public void setReceivableIdExpression(String val) {
		__dataExpressions[5] = val;
	}

	public void setConditionInvoiceitemid(String op, java.lang.Integer val) {
		setConditionInvoiceitemid(op, val, CONDITION_AND);
	}

	public void setConditionInvoiceitemid(String op, java.lang.Integer val, String relation) {
		addCondition(6, op, relation, val);
	}

	public void setSelectInvoiceitemid(boolean val) {
		__select_flags[6] = val;
	}

	public void setInvoiceitemidExpression(String val) {
		__dataExpressions[6] = val;
	}

	public void setConditionProductId(String op, java.lang.Integer val) {
		setConditionProductId(op, val, CONDITION_AND);
	}

	public void setConditionProductId(String op, java.lang.Integer val, String relation) {
		addCondition(7, op, relation, val);
	}

	public void setSelectProductId(boolean val) {
		__select_flags[7] = val;
	}

	public void setProductIdExpression(String val) {
		__dataExpressions[7] = val;
	}

	public void setConditionAmountChangeReceivableOrderProduct(String op, java.math.BigDecimal val) {
		setConditionAmountChangeReceivableOrderProduct(op, val, CONDITION_AND);
	}

	public void setConditionAmountChangeReceivableOrderProduct(String op, java.math.BigDecimal val, String relation) {
		addCondition(8, op, relation, val);
	}

	public void setSelectAmountChangeReceivableOrderProduct(boolean val) {
		__select_flags[8] = val;
	}

	public void setAmountChangeReceivableOrderProductExpression(String val) {
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

	public void setConditionDateChanged(String op, java.util.Date val) {
		setConditionDateChanged(op, val, CONDITION_AND);
	}

	public void setConditionDateChanged(String op, java.util.Date val, String relation) {
		addCondition(10, op, relation, generateTimestampFromDate(val));
	}

	public void setSelectDateChanged(boolean val) {
		__select_flags[10] = val;
	}

	public void setDateChangedExpression(String val) {
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

	public void setConditionEmployeeIdUpdated(String op, java.lang.Integer val) {
		setConditionEmployeeIdUpdated(op, val, CONDITION_AND);
	}

	public void setConditionEmployeeIdUpdated(String op, java.lang.Integer val, String relation) {
		addCondition(12, op, relation, val);
	}

	public void setSelectEmployeeIdUpdated(boolean val) {
		__select_flags[12] = val;
	}

	public void setEmployeeIdUpdatedExpression(String val) {
		__dataExpressions[12] = val;
	}

	public void setConditionDateUpdated(String op, java.util.Date val) {
		setConditionDateUpdated(op, val, CONDITION_AND);
	}

	public void setConditionDateUpdated(String op, java.util.Date val, String relation) {
		addCondition(13, op, relation, generateTimestampFromDate(val));
	}

	public void setSelectDateUpdated(boolean val) {
		__select_flags[13] = val;
	}

	public void setDateUpdatedExpression(String val) {
		__dataExpressions[13] = val;
	}


}

