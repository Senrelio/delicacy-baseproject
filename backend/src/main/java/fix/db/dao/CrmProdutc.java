package fix.db.dao;

import delicacy.common.AbstractTable;
import delicacy.common.GenericBase;
import fix.db.bean.BaseCrmProdutc;


public class CrmProdutc extends AbstractTable<BaseCrmProdutc>
{

	public CrmProdutc() throws java.sql.SQLException 
	{

		initColumnNames();
	}

	protected final void initColumnNames()  throws java.sql.SQLException {

		__columnCount          = 15;

		initTables();

		__tableName            = "crm_produtcs";

		__key_columns          = new int[1];
		__key_columns[0] = 0;

		__column_names[0] = BaseCrmProdutc.CS_PRODUCT_ID;
		__column_names[1] = BaseCrmProdutc.CS_PRODUCT_NAME;
		__column_names[2] = BaseCrmProdutc.CS_PARENT_ID;
		__column_names[3] = BaseCrmProdutc.CS_EMPLOYEE_ID_MAINTAINER;
		__column_names[4] = BaseCrmProdutc.CS_PRICE_UNIT_LISTED;
		__column_names[5] = BaseCrmProdutc.CS_UNIT;
		__column_names[6] = BaseCrmProdutc.CS_PRODUCT_IMAGE1;
		__column_names[7] = BaseCrmProdutc.CS_DESCRIPTION;
		__column_names[8] = BaseCrmProdutc.CS_DATE_CREATED;
		__column_names[9] = BaseCrmProdutc.CS_DATE_UPDATED;
		__column_names[10] = BaseCrmProdutc.CS_FLAG_ENABLED;
		__column_names[11] = BaseCrmProdutc.CS_EMPLOYEE_ID_CREATED;
		__column_names[12] = BaseCrmProdutc.CS_EMPLOYEE_ID_UPDATED;
		__column_names[13] = BaseCrmProdutc.CS_ENTITY_TYPE;
		__column_names[14] = BaseCrmProdutc.CS_DEPARTMENT_ID;

		resetSelectFlags() ;
		resetInsertFlags() ;
	}

	public void resetInsertFlags(){
		for(int i = 0; i < __columnCount; i ++ ) __insert_flags[i] = true;
		__insert_flags[0] = false;
		__serial_column = 0;
	}

	public void setPrimaryKeyFromBase(BaseCrmProdutc b) {
		clear();
		setProductIdClear(b.getProductId());
	}

	public boolean isPrimaryKeyNull() {
		return getProductId() == null;
	}

	@Override
	public BaseCrmProdutc generateBase(){
		BaseCrmProdutc b = new BaseCrmProdutc();
		setDataToBase(b);
		return b;
	}

	@Override
	public void setDataToBase(BaseCrmProdutc b){
		int count = 0; Object val;
		if((val = __current_data[count++]) != null) b.setProductId(GenericBase.__getInt(val));
		if((val = __current_data[count++]) != null) b.setProductName(GenericBase.__getString(val));
		if((val = __current_data[count++]) != null) b.setParentId(GenericBase.__getInt(val));
		if((val = __current_data[count++]) != null) b.setEmployeeIdMaintainer(GenericBase.__getInt(val));
		if((val = __current_data[count++]) != null) b.setPriceUnitListed(GenericBase.__getDecimal(val));
		if((val = __current_data[count++]) != null) b.setUnit(GenericBase.__getString(val));
		if((val = __current_data[count++]) != null) b.setProductImage1(GenericBase.__getString(val));
		if((val = __current_data[count++]) != null) b.setDescription(GenericBase.__getString(val));
		if((val = __current_data[count++]) != null) b.setDateCreated(GenericBase.__getDateFromSQL(val));
		if((val = __current_data[count++]) != null) b.setDateUpdated(GenericBase.__getDateFromSQL(val));
		if((val = __current_data[count++]) != null) b.setFlagEnabled(GenericBase.__getBoolean(val));
		if((val = __current_data[count++]) != null) b.setEmployeeIdCreated(GenericBase.__getInt(val));
		if((val = __current_data[count++]) != null) b.setEmployeeIdUpdated(GenericBase.__getInt(val));
		if((val = __current_data[count++]) != null) b.setEntityType(GenericBase.__getInt(val));
		if((val = __current_data[count++]) != null) b.setDepartmentId(GenericBase.__getInt(val));
	}

	@Override
	public void setBaseToBuffer(BaseCrmProdutc b, Object[] buff){
		int count = 0;
		buff[count++] = b.getProductId();
		buff[count++] = b.getProductName();
		buff[count++] = b.getParentId();
		buff[count++] = b.getEmployeeIdMaintainer();
		buff[count++] = b.getPriceUnitListed();
		buff[count++] = b.getUnit();
		buff[count++] = b.getProductImage1();
		buff[count++] = b.getDescription();
		buff[count++] = generateTimestampFromDate(b.getDateCreated());
		buff[count++] = generateTimestampFromDate(b.getDateUpdated());
		buff[count++] = b.getFlagEnabled();
		buff[count++] = b.getEmployeeIdCreated();
		buff[count++] = b.getEmployeeIdUpdated();
		buff[count++] = b.getEntityType();
		buff[count++] = b.getDepartmentId();
	}

	@Override
	public void setDataFromBase(BaseCrmProdutc b){
		if(b.getProductId() != null) setProductIdClear(b.getProductId());
		if(b.getProductName() != null) setProductName(b.getProductName());
		if(b.getParentId() != null) setParentId(b.getParentId());
		if(b.getEmployeeIdMaintainer() != null) setEmployeeIdMaintainer(b.getEmployeeIdMaintainer());
		if(b.getPriceUnitListed() != null) setPriceUnitListed(b.getPriceUnitListed());
		if(b.getUnit() != null) setUnit(b.getUnit());
		if(b.getProductImage1() != null) setProductImage1(b.getProductImage1());
		if(b.getDescription() != null) setDescription(b.getDescription());
		if(b.getDateCreated() != null) setDateCreated(b.getDateCreated());
		if(b.getDateUpdated() != null) setDateUpdated(b.getDateUpdated());
		if(b.getFlagEnabled() != null) setFlagEnabled(b.getFlagEnabled());
		if(b.getEmployeeIdCreated() != null) setEmployeeIdCreated(b.getEmployeeIdCreated());
		if(b.getEmployeeIdUpdated() != null) setEmployeeIdUpdated(b.getEmployeeIdUpdated());
		if(b.getEntityType() != null) setEntityType(b.getEntityType());
		if(b.getDepartmentId() != null) setDepartmentId(b.getDepartmentId());
	}

	@Override
	public BaseCrmProdutc generateBaseFromResultSet(java.sql.ResultSet sdr)  throws java.sql.SQLException {

		BaseCrmProdutc b = new BaseCrmProdutc();
		setQueryResultToBase(b, sdr);
		return b;
	}

	@Override
	public void setQueryResultToBase(BaseCrmProdutc __base, java.sql.ResultSet sdr ) throws java.sql.SQLException {
		int count = 1, index = 0;
		java.sql.ResultSetMetaData rsmd = sdr.getMetaData();
		int columnCount = rsmd.getColumnCount();
		Object val;
		if(__select_flags[index++] && count <= columnCount && (val = sdr.getObject(count++)) != null) __base.setProductId(GenericBase.__getInt(val));
		if(__select_flags[index++] && count <= columnCount && (val = sdr.getObject(count++)) != null) __base.setProductName(GenericBase.__getString(val));
		if(__select_flags[index++] && count <= columnCount && (val = sdr.getObject(count++)) != null) __base.setParentId(GenericBase.__getInt(val));
		if(__select_flags[index++] && count <= columnCount && (val = sdr.getObject(count++)) != null) __base.setEmployeeIdMaintainer(GenericBase.__getInt(val));
		if(__select_flags[index++] && count <= columnCount && (val = sdr.getObject(count++)) != null) __base.setPriceUnitListed(GenericBase.__getDecimal(val));
		if(__select_flags[index++] && count <= columnCount && (val = sdr.getObject(count++)) != null) __base.setUnit(GenericBase.__getString(val));
		if(__select_flags[index++] && count <= columnCount && (val = sdr.getObject(count++)) != null) __base.setProductImage1(GenericBase.__getString(val));
		if(__select_flags[index++] && count <= columnCount && (val = sdr.getObject(count++)) != null) __base.setDescription(GenericBase.__getString(val));
		if(__select_flags[index++] && count <= columnCount && (val = sdr.getObject(count++)) != null) __base.setDateCreated(GenericBase.__getDateFromSQL(val));
		if(__select_flags[index++] && count <= columnCount && (val = sdr.getObject(count++)) != null) __base.setDateUpdated(GenericBase.__getDateFromSQL(val));
		if(__select_flags[index++] && count <= columnCount && (val = sdr.getObject(count++)) != null) __base.setFlagEnabled(GenericBase.__getBoolean(val));
		if(__select_flags[index++] && count <= columnCount && (val = sdr.getObject(count++)) != null) __base.setEmployeeIdCreated(GenericBase.__getInt(val));
		if(__select_flags[index++] && count <= columnCount && (val = sdr.getObject(count++)) != null) __base.setEmployeeIdUpdated(GenericBase.__getInt(val));
		if(__select_flags[index++] && count <= columnCount && (val = sdr.getObject(count++)) != null) __base.setEntityType(GenericBase.__getInt(val));
		if(__select_flags[index++] && count <= columnCount && (val = sdr.getObject(count++)) != null) __base.setDepartmentId(GenericBase.__getInt(val));
	}

	public void setProductId(java.lang.Integer val) {
		setCurrentData(0, val);
	}

	public java.lang.Integer getProductId() {
		return GenericBase.__getInt(__current_data[0]);
	}

	public void setProductIdClear(java.lang.Integer val) {
		__backup_data[0] = __current_data[0] =  val;
		__modified_flags[0] = false;
	}

	public void setProductName(java.lang.String val) {
		setCurrentData(1, val);
	}

	public java.lang.String getProductName() {
		return GenericBase.__getString(__current_data[1]);
	}

	public void setParentId(java.lang.Integer val) {
		setCurrentData(2, val);
	}

	public java.lang.Integer getParentId() {
		return GenericBase.__getInt(__current_data[2]);
	}

	public void setEmployeeIdMaintainer(java.lang.Integer val) {
		setCurrentData(3, val);
	}

	public java.lang.Integer getEmployeeIdMaintainer() {
		return GenericBase.__getInt(__current_data[3]);
	}

	public void setPriceUnitListed(java.math.BigDecimal val) {
		setCurrentData(4, val);
	}

	public java.math.BigDecimal getPriceUnitListed() {
		return GenericBase.__getDecimal(__current_data[4]);
	}

	public void setUnit(java.lang.String val) {
		setCurrentData(5, val);
	}

	public java.lang.String getUnit() {
		return GenericBase.__getString(__current_data[5]);
	}

	public void setProductImage1(java.lang.String val) {
		setCurrentData(6, val);
	}

	public java.lang.String getProductImage1() {
		return GenericBase.__getString(__current_data[6]);
	}

	public void setDescription(java.lang.String val) {
		setCurrentData(7, val);
	}

	public java.lang.String getDescription() {
		return GenericBase.__getString(__current_data[7]);
	}

	public void setDateCreated(java.util.Date val) {
		setCurrentData(8, generateTimestampFromDate(val));
	}

	public java.util.Date getDateCreated() {
		return GenericBase.__getDateFromSQL(__current_data[8]);
	}

	public void setDateUpdated(java.util.Date val) {
		setCurrentData(9, generateTimestampFromDate(val));
	}

	public java.util.Date getDateUpdated() {
		return GenericBase.__getDateFromSQL(__current_data[9]);
	}

	public void setFlagEnabled(java.lang.Boolean val) {
		setCurrentData(10, val);
	}

	public java.lang.Boolean getFlagEnabled() {
		return GenericBase.__getBoolean(__current_data[10]);
	}

	public void setEmployeeIdCreated(java.lang.Integer val) {
		setCurrentData(11, val);
	}

	public java.lang.Integer getEmployeeIdCreated() {
		return GenericBase.__getInt(__current_data[11]);
	}

	public void setEmployeeIdUpdated(java.lang.Integer val) {
		setCurrentData(12, val);
	}

	public java.lang.Integer getEmployeeIdUpdated() {
		return GenericBase.__getInt(__current_data[12]);
	}

	public void setEntityType(java.lang.Integer val) {
		setCurrentData(13, val);
	}

	public java.lang.Integer getEntityType() {
		return GenericBase.__getInt(__current_data[13]);
	}

	public void setDepartmentId(java.lang.Integer val) {
		setCurrentData(14, val);
	}

	public java.lang.Integer getDepartmentId() {
		return GenericBase.__getInt(__current_data[14]);
	}

	public void setConditionProductId(String op, java.lang.Integer val) {
		setConditionProductId(op, val, CONDITION_AND);
	}

	public void setConditionProductId(String op, java.lang.Integer val, String relation) {
		addCondition(0, op, relation, val);
	}

	public void setSelectProductId(boolean val) {
		__select_flags[0] = val;
	}

	public void setProductIdExpression(String val) {
		__dataExpressions[0] = val;
	}

	public void setConditionProductName(String op, java.lang.String val) {
		setConditionProductName(op, val, CONDITION_AND);
	}

	public void setConditionProductName(String op, java.lang.String val, String relation) {
		addCondition(1, op, relation, val);
	}

	public void setSelectProductName(boolean val) {
		__select_flags[1] = val;
	}

	public void setProductNameExpression(String val) {
		__dataExpressions[1] = val;
	}

	public void setConditionParentId(String op, java.lang.Integer val) {
		setConditionParentId(op, val, CONDITION_AND);
	}

	public void setConditionParentId(String op, java.lang.Integer val, String relation) {
		addCondition(2, op, relation, val);
	}

	public void setSelectParentId(boolean val) {
		__select_flags[2] = val;
	}

	public void setParentIdExpression(String val) {
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

	public void setConditionPriceUnitListed(String op, java.math.BigDecimal val) {
		setConditionPriceUnitListed(op, val, CONDITION_AND);
	}

	public void setConditionPriceUnitListed(String op, java.math.BigDecimal val, String relation) {
		addCondition(4, op, relation, val);
	}

	public void setSelectPriceUnitListed(boolean val) {
		__select_flags[4] = val;
	}

	public void setPriceUnitListedExpression(String val) {
		__dataExpressions[4] = val;
	}

	public void setConditionUnit(String op, java.lang.String val) {
		setConditionUnit(op, val, CONDITION_AND);
	}

	public void setConditionUnit(String op, java.lang.String val, String relation) {
		addCondition(5, op, relation, val);
	}

	public void setSelectUnit(boolean val) {
		__select_flags[5] = val;
	}

	public void setUnitExpression(String val) {
		__dataExpressions[5] = val;
	}

	public void setConditionProductImage1(String op, java.lang.String val) {
		setConditionProductImage1(op, val, CONDITION_AND);
	}

	public void setConditionProductImage1(String op, java.lang.String val, String relation) {
		addCondition(6, op, relation, val);
	}

	public void setSelectProductImage1(boolean val) {
		__select_flags[6] = val;
	}

	public void setProductImage1Expression(String val) {
		__dataExpressions[6] = val;
	}

	public void setConditionDescription(String op, java.lang.String val) {
		setConditionDescription(op, val, CONDITION_AND);
	}

	public void setConditionDescription(String op, java.lang.String val, String relation) {
		addCondition(7, op, relation, val);
	}

	public void setSelectDescription(boolean val) {
		__select_flags[7] = val;
	}

	public void setDescriptionExpression(String val) {
		__dataExpressions[7] = val;
	}

	public void setConditionDateCreated(String op, java.util.Date val) {
		setConditionDateCreated(op, val, CONDITION_AND);
	}

	public void setConditionDateCreated(String op, java.util.Date val, String relation) {
		addCondition(8, op, relation, generateTimestampFromDate(val));
	}

	public void setSelectDateCreated(boolean val) {
		__select_flags[8] = val;
	}

	public void setDateCreatedExpression(String val) {
		__dataExpressions[8] = val;
	}

	public void setConditionDateUpdated(String op, java.util.Date val) {
		setConditionDateUpdated(op, val, CONDITION_AND);
	}

	public void setConditionDateUpdated(String op, java.util.Date val, String relation) {
		addCondition(9, op, relation, generateTimestampFromDate(val));
	}

	public void setSelectDateUpdated(boolean val) {
		__select_flags[9] = val;
	}

	public void setDateUpdatedExpression(String val) {
		__dataExpressions[9] = val;
	}

	public void setConditionFlagEnabled(String op, java.lang.Boolean val) {
		setConditionFlagEnabled(op, val, CONDITION_AND);
	}

	public void setConditionFlagEnabled(String op, java.lang.Boolean val, String relation) {
		addCondition(10, op, relation, val);
	}

	public void setSelectFlagEnabled(boolean val) {
		__select_flags[10] = val;
	}

	public void setFlagEnabledExpression(String val) {
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

	public void setConditionEntityType(String op, java.lang.Integer val) {
		setConditionEntityType(op, val, CONDITION_AND);
	}

	public void setConditionEntityType(String op, java.lang.Integer val, String relation) {
		addCondition(13, op, relation, val);
	}

	public void setSelectEntityType(boolean val) {
		__select_flags[13] = val;
	}

	public void setEntityTypeExpression(String val) {
		__dataExpressions[13] = val;
	}

	public void setConditionDepartmentId(String op, java.lang.Integer val) {
		setConditionDepartmentId(op, val, CONDITION_AND);
	}

	public void setConditionDepartmentId(String op, java.lang.Integer val, String relation) {
		addCondition(14, op, relation, val);
	}

	public void setSelectDepartmentId(boolean val) {
		__select_flags[14] = val;
	}

	public void setDepartmentIdExpression(String val) {
		__dataExpressions[14] = val;
	}


}

