package fix.db.dao;

import delicacy.common.AbstractTable;
import delicacy.common.GenericBase;
import fix.db.bean.BaseCrmPriceListProduct;


public class CrmPriceListProduct extends AbstractTable<BaseCrmPriceListProduct>
{

	public CrmPriceListProduct() throws java.sql.SQLException 
	{

		initColumnNames();
	}

	protected final void initColumnNames()  throws java.sql.SQLException {

		__columnCount          = 13;

		initTables();

		__tableName            = "crm_price_list_products";

		__key_columns          = new int[1];
		__key_columns[0] = 0;

		__column_names[0] = BaseCrmPriceListProduct.CS_PRICE_LIST_PRODUCT_ID;
		__column_names[1] = BaseCrmPriceListProduct.CS_PRICE_LIST_ID;
		__column_names[2] = BaseCrmPriceListProduct.CS_PRODUCT_ID;
		__column_names[3] = BaseCrmPriceListProduct.CS_DEPARTMENT_ID;
		__column_names[4] = BaseCrmPriceListProduct.CS_EMPLOYEE_ID_CREATED;
		__column_names[5] = BaseCrmPriceListProduct.CS_DATE_CREATED;
		__column_names[6] = BaseCrmPriceListProduct.CS_EMPLOYEE_ID_UPDATED;
		__column_names[7] = BaseCrmPriceListProduct.CS_DATE_UPDATED;
		__column_names[8] = BaseCrmPriceListProduct.CS_PRICE_UNIT_LISTED;
		__column_names[9] = BaseCrmPriceListProduct.CS_FLAG_STANDARD_PRICE_UNIT;
		__column_names[10] = BaseCrmPriceListProduct.CS_PRICE_UNIT;
		__column_names[11] = BaseCrmPriceListProduct.CS_FLAG_ENABLED;
		__column_names[12] = BaseCrmPriceListProduct.CS_MEMO;

		resetSelectFlags() ;
		resetInsertFlags() ;
	}

	public void resetInsertFlags(){
		for(int i = 0; i < __columnCount; i ++ ) __insert_flags[i] = true;
		__insert_flags[0] = false;
		__serial_column = 0;
	}

	public void setPrimaryKeyFromBase(BaseCrmPriceListProduct b) {
		clear();
		setPriceListProductIdClear(b.getPriceListProductId());
	}

	public boolean isPrimaryKeyNull() {
		return getPriceListProductId() == null;
	}

	@Override
	public BaseCrmPriceListProduct generateBase(){
		BaseCrmPriceListProduct b = new BaseCrmPriceListProduct();
		setDataToBase(b);
		return b;
	}

	@Override
	public void setDataToBase(BaseCrmPriceListProduct b){
		int count = 0; Object val;
		if((val = __current_data[count++]) != null) b.setPriceListProductId(GenericBase.__getInt(val));
		if((val = __current_data[count++]) != null) b.setPriceListId(GenericBase.__getInt(val));
		if((val = __current_data[count++]) != null) b.setProductId(GenericBase.__getInt(val));
		if((val = __current_data[count++]) != null) b.setDepartmentId(GenericBase.__getString(val));
		if((val = __current_data[count++]) != null) b.setEmployeeIdCreated(GenericBase.__getString(val));
		if((val = __current_data[count++]) != null) b.setDateCreated(GenericBase.__getDateFromSQL(val));
		if((val = __current_data[count++]) != null) b.setEmployeeIdUpdated(GenericBase.__getString(val));
		if((val = __current_data[count++]) != null) b.setDateUpdated(GenericBase.__getDateFromSQL(val));
		if((val = __current_data[count++]) != null) b.setPriceUnitListed(GenericBase.__getFloat(val));
		if((val = __current_data[count++]) != null) b.setFlagStandardPriceUnit(GenericBase.__getBoolean(val));
		if((val = __current_data[count++]) != null) b.setPriceUnit(GenericBase.__getFloat(val));
		if((val = __current_data[count++]) != null) b.setFlagEnabled(GenericBase.__getBoolean(val));
		if((val = __current_data[count++]) != null) b.setMemo(GenericBase.__getString(val));
	}

	@Override
	public void setBaseToBuffer(BaseCrmPriceListProduct b, Object[] buff){
		int count = 0;
		buff[count++] = b.getPriceListProductId();
		buff[count++] = b.getPriceListId();
		buff[count++] = b.getProductId();
		buff[count++] = b.getDepartmentId();
		buff[count++] = b.getEmployeeIdCreated();
		buff[count++] = generateTimestampFromDate(b.getDateCreated());
		buff[count++] = b.getEmployeeIdUpdated();
		buff[count++] = generateTimestampFromDate(b.getDateUpdated());
		buff[count++] = b.getPriceUnitListed();
		buff[count++] = b.getFlagStandardPriceUnit();
		buff[count++] = b.getPriceUnit();
		buff[count++] = b.getFlagEnabled();
		buff[count++] = b.getMemo();
	}

	@Override
	public void setDataFromBase(BaseCrmPriceListProduct b){
		if(b.getPriceListProductId() != null) setPriceListProductIdClear(b.getPriceListProductId());
		if(b.getPriceListId() != null) setPriceListId(b.getPriceListId());
		if(b.getProductId() != null) setProductId(b.getProductId());
		if(b.getDepartmentId() != null) setDepartmentId(b.getDepartmentId());
		if(b.getEmployeeIdCreated() != null) setEmployeeIdCreated(b.getEmployeeIdCreated());
		if(b.getDateCreated() != null) setDateCreated(b.getDateCreated());
		if(b.getEmployeeIdUpdated() != null) setEmployeeIdUpdated(b.getEmployeeIdUpdated());
		if(b.getDateUpdated() != null) setDateUpdated(b.getDateUpdated());
		if(b.getPriceUnitListed() != null) setPriceUnitListed(b.getPriceUnitListed());
		if(b.getFlagStandardPriceUnit() != null) setFlagStandardPriceUnit(b.getFlagStandardPriceUnit());
		if(b.getPriceUnit() != null) setPriceUnit(b.getPriceUnit());
		if(b.getFlagEnabled() != null) setFlagEnabled(b.getFlagEnabled());
		if(b.getMemo() != null) setMemo(b.getMemo());
	}

	@Override
	public BaseCrmPriceListProduct generateBaseFromResultSet(java.sql.ResultSet sdr)  throws java.sql.SQLException {

		BaseCrmPriceListProduct b = new BaseCrmPriceListProduct();
		setQueryResultToBase(b, sdr);
		return b;
	}

	@Override
	public void setQueryResultToBase(BaseCrmPriceListProduct __base, java.sql.ResultSet sdr ) throws java.sql.SQLException {
		int count = 1, index = 0;
		java.sql.ResultSetMetaData rsmd = sdr.getMetaData();
		int columnCount = rsmd.getColumnCount();
		Object val;
		if(__select_flags[index++] && count <= columnCount && (val = sdr.getObject(count++)) != null) __base.setPriceListProductId(GenericBase.__getInt(val));
		if(__select_flags[index++] && count <= columnCount && (val = sdr.getObject(count++)) != null) __base.setPriceListId(GenericBase.__getInt(val));
		if(__select_flags[index++] && count <= columnCount && (val = sdr.getObject(count++)) != null) __base.setProductId(GenericBase.__getInt(val));
		if(__select_flags[index++] && count <= columnCount && (val = sdr.getObject(count++)) != null) __base.setDepartmentId(GenericBase.__getString(val));
		if(__select_flags[index++] && count <= columnCount && (val = sdr.getObject(count++)) != null) __base.setEmployeeIdCreated(GenericBase.__getString(val));
		if(__select_flags[index++] && count <= columnCount && (val = sdr.getObject(count++)) != null) __base.setDateCreated(GenericBase.__getDateFromSQL(val));
		if(__select_flags[index++] && count <= columnCount && (val = sdr.getObject(count++)) != null) __base.setEmployeeIdUpdated(GenericBase.__getString(val));
		if(__select_flags[index++] && count <= columnCount && (val = sdr.getObject(count++)) != null) __base.setDateUpdated(GenericBase.__getDateFromSQL(val));
		if(__select_flags[index++] && count <= columnCount && (val = sdr.getObject(count++)) != null) __base.setPriceUnitListed(GenericBase.__getFloat(val));
		if(__select_flags[index++] && count <= columnCount && (val = sdr.getObject(count++)) != null) __base.setFlagStandardPriceUnit(GenericBase.__getBoolean(val));
		if(__select_flags[index++] && count <= columnCount && (val = sdr.getObject(count++)) != null) __base.setPriceUnit(GenericBase.__getFloat(val));
		if(__select_flags[index++] && count <= columnCount && (val = sdr.getObject(count++)) != null) __base.setFlagEnabled(GenericBase.__getBoolean(val));
		if(__select_flags[index++] && count <= columnCount && (val = sdr.getObject(count++)) != null) __base.setMemo(GenericBase.__getString(val));
	}

	public void setPriceListProductId(java.lang.Integer val) {
		setCurrentData(0, val);
	}

	public java.lang.Integer getPriceListProductId() {
		return GenericBase.__getInt(__current_data[0]);
	}

	public void setPriceListProductIdClear(java.lang.Integer val) {
		__backup_data[0] = __current_data[0] =  val;
		__modified_flags[0] = false;
	}

	public void setPriceListId(java.lang.Integer val) {
		setCurrentData(1, val);
	}

	public java.lang.Integer getPriceListId() {
		return GenericBase.__getInt(__current_data[1]);
	}

	public void setProductId(java.lang.Integer val) {
		setCurrentData(2, val);
	}

	public java.lang.Integer getProductId() {
		return GenericBase.__getInt(__current_data[2]);
	}

	public void setDepartmentId(java.lang.String val) {
		setCurrentData(3, val);
	}

	public java.lang.String getDepartmentId() {
		return GenericBase.__getString(__current_data[3]);
	}

	public void setEmployeeIdCreated(java.lang.String val) {
		setCurrentData(4, val);
	}

	public java.lang.String getEmployeeIdCreated() {
		return GenericBase.__getString(__current_data[4]);
	}

	public void setDateCreated(java.util.Date val) {
		setCurrentData(5, generateTimestampFromDate(val));
	}

	public java.util.Date getDateCreated() {
		return GenericBase.__getDateFromSQL(__current_data[5]);
	}

	public void setEmployeeIdUpdated(java.lang.String val) {
		setCurrentData(6, val);
	}

	public java.lang.String getEmployeeIdUpdated() {
		return GenericBase.__getString(__current_data[6]);
	}

	public void setDateUpdated(java.util.Date val) {
		setCurrentData(7, generateTimestampFromDate(val));
	}

	public java.util.Date getDateUpdated() {
		return GenericBase.__getDateFromSQL(__current_data[7]);
	}

	public void setPriceUnitListed(java.lang.Float val) {
		setCurrentData(8, val);
	}

	public java.lang.Float getPriceUnitListed() {
		return GenericBase.__getFloat(__current_data[8]);
	}

	public void setFlagStandardPriceUnit(java.lang.Boolean val) {
		setCurrentData(9, val);
	}

	public java.lang.Boolean getFlagStandardPriceUnit() {
		return GenericBase.__getBoolean(__current_data[9]);
	}

	public void setPriceUnit(java.lang.Float val) {
		setCurrentData(10, val);
	}

	public java.lang.Float getPriceUnit() {
		return GenericBase.__getFloat(__current_data[10]);
	}

	public void setFlagEnabled(java.lang.Boolean val) {
		setCurrentData(11, val);
	}

	public java.lang.Boolean getFlagEnabled() {
		return GenericBase.__getBoolean(__current_data[11]);
	}

	public void setMemo(java.lang.String val) {
		setCurrentData(12, val);
	}

	public java.lang.String getMemo() {
		return GenericBase.__getString(__current_data[12]);
	}

	public void setConditionPriceListProductId(String op, java.lang.Integer val) {
		setConditionPriceListProductId(op, val, CONDITION_AND);
	}

	public void setConditionPriceListProductId(String op, java.lang.Integer val, String relation) {
		addCondition(0, op, relation, val);
	}

	public void setSelectPriceListProductId(boolean val) {
		__select_flags[0] = val;
	}

	public void setPriceListProductIdExpression(String val) {
		__dataExpressions[0] = val;
	}

	public void setConditionPriceListId(String op, java.lang.Integer val) {
		setConditionPriceListId(op, val, CONDITION_AND);
	}

	public void setConditionPriceListId(String op, java.lang.Integer val, String relation) {
		addCondition(1, op, relation, val);
	}

	public void setSelectPriceListId(boolean val) {
		__select_flags[1] = val;
	}

	public void setPriceListIdExpression(String val) {
		__dataExpressions[1] = val;
	}

	public void setConditionProductId(String op, java.lang.Integer val) {
		setConditionProductId(op, val, CONDITION_AND);
	}

	public void setConditionProductId(String op, java.lang.Integer val, String relation) {
		addCondition(2, op, relation, val);
	}

	public void setSelectProductId(boolean val) {
		__select_flags[2] = val;
	}

	public void setProductIdExpression(String val) {
		__dataExpressions[2] = val;
	}

	public void setConditionDepartmentId(String op, java.lang.String val) {
		setConditionDepartmentId(op, val, CONDITION_AND);
	}

	public void setConditionDepartmentId(String op, java.lang.String val, String relation) {
		addCondition(3, op, relation, val);
	}

	public void setSelectDepartmentId(boolean val) {
		__select_flags[3] = val;
	}

	public void setDepartmentIdExpression(String val) {
		__dataExpressions[3] = val;
	}

	public void setConditionEmployeeIdCreated(String op, java.lang.String val) {
		setConditionEmployeeIdCreated(op, val, CONDITION_AND);
	}

	public void setConditionEmployeeIdCreated(String op, java.lang.String val, String relation) {
		addCondition(4, op, relation, val);
	}

	public void setSelectEmployeeIdCreated(boolean val) {
		__select_flags[4] = val;
	}

	public void setEmployeeIdCreatedExpression(String val) {
		__dataExpressions[4] = val;
	}

	public void setConditionDateCreated(String op, java.util.Date val) {
		setConditionDateCreated(op, val, CONDITION_AND);
	}

	public void setConditionDateCreated(String op, java.util.Date val, String relation) {
		addCondition(5, op, relation, generateTimestampFromDate(val));
	}

	public void setSelectDateCreated(boolean val) {
		__select_flags[5] = val;
	}

	public void setDateCreatedExpression(String val) {
		__dataExpressions[5] = val;
	}

	public void setConditionEmployeeIdUpdated(String op, java.lang.String val) {
		setConditionEmployeeIdUpdated(op, val, CONDITION_AND);
	}

	public void setConditionEmployeeIdUpdated(String op, java.lang.String val, String relation) {
		addCondition(6, op, relation, val);
	}

	public void setSelectEmployeeIdUpdated(boolean val) {
		__select_flags[6] = val;
	}

	public void setEmployeeIdUpdatedExpression(String val) {
		__dataExpressions[6] = val;
	}

	public void setConditionDateUpdated(String op, java.util.Date val) {
		setConditionDateUpdated(op, val, CONDITION_AND);
	}

	public void setConditionDateUpdated(String op, java.util.Date val, String relation) {
		addCondition(7, op, relation, generateTimestampFromDate(val));
	}

	public void setSelectDateUpdated(boolean val) {
		__select_flags[7] = val;
	}

	public void setDateUpdatedExpression(String val) {
		__dataExpressions[7] = val;
	}

	public void setConditionPriceUnitListed(String op, java.lang.Float val) {
		setConditionPriceUnitListed(op, val, CONDITION_AND);
	}

	public void setConditionPriceUnitListed(String op, java.lang.Float val, String relation) {
		addCondition(8, op, relation, val);
	}

	public void setSelectPriceUnitListed(boolean val) {
		__select_flags[8] = val;
	}

	public void setPriceUnitListedExpression(String val) {
		__dataExpressions[8] = val;
	}

	public void setConditionFlagStandardPriceUnit(String op, java.lang.Boolean val) {
		setConditionFlagStandardPriceUnit(op, val, CONDITION_AND);
	}

	public void setConditionFlagStandardPriceUnit(String op, java.lang.Boolean val, String relation) {
		addCondition(9, op, relation, val);
	}

	public void setSelectFlagStandardPriceUnit(boolean val) {
		__select_flags[9] = val;
	}

	public void setFlagStandardPriceUnitExpression(String val) {
		__dataExpressions[9] = val;
	}

	public void setConditionPriceUnit(String op, java.lang.Float val) {
		setConditionPriceUnit(op, val, CONDITION_AND);
	}

	public void setConditionPriceUnit(String op, java.lang.Float val, String relation) {
		addCondition(10, op, relation, val);
	}

	public void setSelectPriceUnit(boolean val) {
		__select_flags[10] = val;
	}

	public void setPriceUnitExpression(String val) {
		__dataExpressions[10] = val;
	}

	public void setConditionFlagEnabled(String op, java.lang.Boolean val) {
		setConditionFlagEnabled(op, val, CONDITION_AND);
	}

	public void setConditionFlagEnabled(String op, java.lang.Boolean val, String relation) {
		addCondition(11, op, relation, val);
	}

	public void setSelectFlagEnabled(boolean val) {
		__select_flags[11] = val;
	}

	public void setFlagEnabledExpression(String val) {
		__dataExpressions[11] = val;
	}

	public void setConditionMemo(String op, java.lang.String val) {
		setConditionMemo(op, val, CONDITION_AND);
	}

	public void setConditionMemo(String op, java.lang.String val, String relation) {
		addCondition(12, op, relation, val);
	}

	public void setSelectMemo(boolean val) {
		__select_flags[12] = val;
	}

	public void setMemoExpression(String val) {
		__dataExpressions[12] = val;
	}


}

