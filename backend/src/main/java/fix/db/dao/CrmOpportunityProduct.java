package fix.db.dao;

import delicacy.common.AbstractTable;
import delicacy.common.GenericBase;
import fix.db.bean.BaseCrmOpportunityProduct;


public class CrmOpportunityProduct extends AbstractTable<BaseCrmOpportunityProduct>
{

	public CrmOpportunityProduct() throws java.sql.SQLException 
	{

		initColumnNames();
	}

	protected final void initColumnNames()  throws java.sql.SQLException {

		__columnCount          = 14;

		initTables();

		__tableName            = "crm_opportunity_products";

		__key_columns          = new int[1];
		__key_columns[0] = 0;

		__column_names[0] = BaseCrmOpportunityProduct.CS_OPPORTUNITY_PRODUCT_ID;
		__column_names[1] = BaseCrmOpportunityProduct.CS_OPPORTUNITY_ID;
		__column_names[2] = BaseCrmOpportunityProduct.CS_PRODUCT_ID;
		__column_names[3] = BaseCrmOpportunityProduct.CS_PRICE_UNIT;
		__column_names[4] = BaseCrmOpportunityProduct.CS_QUANTITY;
		__column_names[5] = BaseCrmOpportunityProduct.CS_DISCOUNT_RATE;
		__column_names[6] = BaseCrmOpportunityProduct.CS_SUM;
		__column_names[7] = BaseCrmOpportunityProduct.CS_PRICE_UNIT_LISTED;
		__column_names[8] = BaseCrmOpportunityProduct.CS_ENTITY_TYPE;
		__column_names[9] = BaseCrmOpportunityProduct.CS_DATE_CREATED;
		__column_names[10] = BaseCrmOpportunityProduct.CS_EMPLOYEE_ID_CREATED;
		__column_names[11] = BaseCrmOpportunityProduct.CS_DATE_UPDATED;
		__column_names[12] = BaseCrmOpportunityProduct.CS_EMPLOYEE_ID_UPDATED;
		__column_names[13] = BaseCrmOpportunityProduct.CS_MEMO;

		resetSelectFlags() ;
		resetInsertFlags() ;
	}

	public void resetInsertFlags(){
		for(int i = 0; i < __columnCount; i ++ ) __insert_flags[i] = true;
		__insert_flags[0] = false;
		__serial_column = 0;
	}

	public void setPrimaryKeyFromBase(BaseCrmOpportunityProduct b) {
		clear();
		setOpportunityProductIdClear(b.getOpportunityProductId());
	}

	public boolean isPrimaryKeyNull() {
		return getOpportunityProductId() == null;
	}

	@Override
	public BaseCrmOpportunityProduct generateBase(){
		BaseCrmOpportunityProduct b = new BaseCrmOpportunityProduct();
		setDataToBase(b);
		return b;
	}

	@Override
	public void setDataToBase(BaseCrmOpportunityProduct b){
		int count = 0; Object val;
		if((val = __current_data[count++]) != null) b.setOpportunityProductId(GenericBase.__getInt(val));
		if((val = __current_data[count++]) != null) b.setOpportunityId(GenericBase.__getInt(val));
		if((val = __current_data[count++]) != null) b.setProductId(GenericBase.__getInt(val));
		if((val = __current_data[count++]) != null) b.setPriceUnit(GenericBase.__getDecimal(val));
		if((val = __current_data[count++]) != null) b.setQuantity(GenericBase.__getFloat(val));
		if((val = __current_data[count++]) != null) b.setDiscountRate(GenericBase.__getFloat(val));
		if((val = __current_data[count++]) != null) b.setSum(GenericBase.__getDecimal(val));
		if((val = __current_data[count++]) != null) b.setPriceUnitListed(GenericBase.__getDecimal(val));
		if((val = __current_data[count++]) != null) b.setEntityType(GenericBase.__getInt(val));
		if((val = __current_data[count++]) != null) b.setDateCreated(GenericBase.__getDateFromSQL(val));
		if((val = __current_data[count++]) != null) b.setEmployeeIdCreated(GenericBase.__getInt(val));
		if((val = __current_data[count++]) != null) b.setDateUpdated(GenericBase.__getDateFromSQL(val));
		if((val = __current_data[count++]) != null) b.setEmployeeIdUpdated(GenericBase.__getInt(val));
		if((val = __current_data[count++]) != null) b.setMemo(GenericBase.__getString(val));
	}

	@Override
	public void setBaseToBuffer(BaseCrmOpportunityProduct b, Object[] buff){
		int count = 0;
		buff[count++] = b.getOpportunityProductId();
		buff[count++] = b.getOpportunityId();
		buff[count++] = b.getProductId();
		buff[count++] = b.getPriceUnit();
		buff[count++] = b.getQuantity();
		buff[count++] = b.getDiscountRate();
		buff[count++] = b.getSum();
		buff[count++] = b.getPriceUnitListed();
		buff[count++] = b.getEntityType();
		buff[count++] = generateTimestampFromDate(b.getDateCreated());
		buff[count++] = b.getEmployeeIdCreated();
		buff[count++] = generateTimestampFromDate(b.getDateUpdated());
		buff[count++] = b.getEmployeeIdUpdated();
		buff[count++] = b.getMemo();
	}

	@Override
	public void setDataFromBase(BaseCrmOpportunityProduct b){
		if(b.getOpportunityProductId() != null) setOpportunityProductIdClear(b.getOpportunityProductId());
		if(b.getOpportunityId() != null) setOpportunityId(b.getOpportunityId());
		if(b.getProductId() != null) setProductId(b.getProductId());
		if(b.getPriceUnit() != null) setPriceUnit(b.getPriceUnit());
		if(b.getQuantity() != null) setQuantity(b.getQuantity());
		if(b.getDiscountRate() != null) setDiscountRate(b.getDiscountRate());
		if(b.getSum() != null) setSum(b.getSum());
		if(b.getPriceUnitListed() != null) setPriceUnitListed(b.getPriceUnitListed());
		if(b.getEntityType() != null) setEntityType(b.getEntityType());
		if(b.getDateCreated() != null) setDateCreated(b.getDateCreated());
		if(b.getEmployeeIdCreated() != null) setEmployeeIdCreated(b.getEmployeeIdCreated());
		if(b.getDateUpdated() != null) setDateUpdated(b.getDateUpdated());
		if(b.getEmployeeIdUpdated() != null) setEmployeeIdUpdated(b.getEmployeeIdUpdated());
		if(b.getMemo() != null) setMemo(b.getMemo());
	}

	@Override
	public BaseCrmOpportunityProduct generateBaseFromResultSet(java.sql.ResultSet sdr)  throws java.sql.SQLException {

		BaseCrmOpportunityProduct b = new BaseCrmOpportunityProduct();
		setQueryResultToBase(b, sdr);
		return b;
	}

	@Override
	public void setQueryResultToBase(BaseCrmOpportunityProduct __base, java.sql.ResultSet sdr ) throws java.sql.SQLException {
		int count = 1, index = 0;
		java.sql.ResultSetMetaData rsmd = sdr.getMetaData();
		int columnCount = rsmd.getColumnCount();
		Object val;
		if(__select_flags[index++] && count <= columnCount && (val = sdr.getObject(count++)) != null) __base.setOpportunityProductId(GenericBase.__getInt(val));
		if(__select_flags[index++] && count <= columnCount && (val = sdr.getObject(count++)) != null) __base.setOpportunityId(GenericBase.__getInt(val));
		if(__select_flags[index++] && count <= columnCount && (val = sdr.getObject(count++)) != null) __base.setProductId(GenericBase.__getInt(val));
		if(__select_flags[index++] && count <= columnCount && (val = sdr.getObject(count++)) != null) __base.setPriceUnit(GenericBase.__getDecimal(val));
		if(__select_flags[index++] && count <= columnCount && (val = sdr.getObject(count++)) != null) __base.setQuantity(GenericBase.__getFloat(val));
		if(__select_flags[index++] && count <= columnCount && (val = sdr.getObject(count++)) != null) __base.setDiscountRate(GenericBase.__getFloat(val));
		if(__select_flags[index++] && count <= columnCount && (val = sdr.getObject(count++)) != null) __base.setSum(GenericBase.__getDecimal(val));
		if(__select_flags[index++] && count <= columnCount && (val = sdr.getObject(count++)) != null) __base.setPriceUnitListed(GenericBase.__getDecimal(val));
		if(__select_flags[index++] && count <= columnCount && (val = sdr.getObject(count++)) != null) __base.setEntityType(GenericBase.__getInt(val));
		if(__select_flags[index++] && count <= columnCount && (val = sdr.getObject(count++)) != null) __base.setDateCreated(GenericBase.__getDateFromSQL(val));
		if(__select_flags[index++] && count <= columnCount && (val = sdr.getObject(count++)) != null) __base.setEmployeeIdCreated(GenericBase.__getInt(val));
		if(__select_flags[index++] && count <= columnCount && (val = sdr.getObject(count++)) != null) __base.setDateUpdated(GenericBase.__getDateFromSQL(val));
		if(__select_flags[index++] && count <= columnCount && (val = sdr.getObject(count++)) != null) __base.setEmployeeIdUpdated(GenericBase.__getInt(val));
		if(__select_flags[index++] && count <= columnCount && (val = sdr.getObject(count++)) != null) __base.setMemo(GenericBase.__getString(val));
	}

	public void setOpportunityProductId(java.lang.Integer val) {
		setCurrentData(0, val);
	}

	public java.lang.Integer getOpportunityProductId() {
		return GenericBase.__getInt(__current_data[0]);
	}

	public void setOpportunityProductIdClear(java.lang.Integer val) {
		__backup_data[0] = __current_data[0] =  val;
		__modified_flags[0] = false;
	}

	public void setOpportunityId(java.lang.Integer val) {
		setCurrentData(1, val);
	}

	public java.lang.Integer getOpportunityId() {
		return GenericBase.__getInt(__current_data[1]);
	}

	public void setProductId(java.lang.Integer val) {
		setCurrentData(2, val);
	}

	public java.lang.Integer getProductId() {
		return GenericBase.__getInt(__current_data[2]);
	}

	public void setPriceUnit(java.math.BigDecimal val) {
		setCurrentData(3, val);
	}

	public java.math.BigDecimal getPriceUnit() {
		return GenericBase.__getDecimal(__current_data[3]);
	}

	public void setQuantity(java.lang.Float val) {
		setCurrentData(4, val);
	}

	public java.lang.Float getQuantity() {
		return GenericBase.__getFloat(__current_data[4]);
	}

	public void setDiscountRate(java.lang.Float val) {
		setCurrentData(5, val);
	}

	public java.lang.Float getDiscountRate() {
		return GenericBase.__getFloat(__current_data[5]);
	}

	public void setSum(java.math.BigDecimal val) {
		setCurrentData(6, val);
	}

	public java.math.BigDecimal getSum() {
		return GenericBase.__getDecimal(__current_data[6]);
	}

	public void setPriceUnitListed(java.math.BigDecimal val) {
		setCurrentData(7, val);
	}

	public java.math.BigDecimal getPriceUnitListed() {
		return GenericBase.__getDecimal(__current_data[7]);
	}

	public void setEntityType(java.lang.Integer val) {
		setCurrentData(8, val);
	}

	public java.lang.Integer getEntityType() {
		return GenericBase.__getInt(__current_data[8]);
	}

	public void setDateCreated(java.util.Date val) {
		setCurrentData(9, generateTimestampFromDate(val));
	}

	public java.util.Date getDateCreated() {
		return GenericBase.__getDateFromSQL(__current_data[9]);
	}

	public void setEmployeeIdCreated(java.lang.Integer val) {
		setCurrentData(10, val);
	}

	public java.lang.Integer getEmployeeIdCreated() {
		return GenericBase.__getInt(__current_data[10]);
	}

	public void setDateUpdated(java.util.Date val) {
		setCurrentData(11, generateTimestampFromDate(val));
	}

	public java.util.Date getDateUpdated() {
		return GenericBase.__getDateFromSQL(__current_data[11]);
	}

	public void setEmployeeIdUpdated(java.lang.Integer val) {
		setCurrentData(12, val);
	}

	public java.lang.Integer getEmployeeIdUpdated() {
		return GenericBase.__getInt(__current_data[12]);
	}

	public void setMemo(java.lang.String val) {
		setCurrentData(13, val);
	}

	public java.lang.String getMemo() {
		return GenericBase.__getString(__current_data[13]);
	}

	public void setConditionOpportunityProductId(String op, java.lang.Integer val) {
		setConditionOpportunityProductId(op, val, CONDITION_AND);
	}

	public void setConditionOpportunityProductId(String op, java.lang.Integer val, String relation) {
		addCondition(0, op, relation, val);
	}

	public void setSelectOpportunityProductId(boolean val) {
		__select_flags[0] = val;
	}

	public void setOpportunityProductIdExpression(String val) {
		__dataExpressions[0] = val;
	}

	public void setConditionOpportunityId(String op, java.lang.Integer val) {
		setConditionOpportunityId(op, val, CONDITION_AND);
	}

	public void setConditionOpportunityId(String op, java.lang.Integer val, String relation) {
		addCondition(1, op, relation, val);
	}

	public void setSelectOpportunityId(boolean val) {
		__select_flags[1] = val;
	}

	public void setOpportunityIdExpression(String val) {
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

	public void setConditionPriceUnit(String op, java.math.BigDecimal val) {
		setConditionPriceUnit(op, val, CONDITION_AND);
	}

	public void setConditionPriceUnit(String op, java.math.BigDecimal val, String relation) {
		addCondition(3, op, relation, val);
	}

	public void setSelectPriceUnit(boolean val) {
		__select_flags[3] = val;
	}

	public void setPriceUnitExpression(String val) {
		__dataExpressions[3] = val;
	}

	public void setConditionQuantity(String op, java.lang.Float val) {
		setConditionQuantity(op, val, CONDITION_AND);
	}

	public void setConditionQuantity(String op, java.lang.Float val, String relation) {
		addCondition(4, op, relation, val);
	}

	public void setSelectQuantity(boolean val) {
		__select_flags[4] = val;
	}

	public void setQuantityExpression(String val) {
		__dataExpressions[4] = val;
	}

	public void setConditionDiscountRate(String op, java.lang.Float val) {
		setConditionDiscountRate(op, val, CONDITION_AND);
	}

	public void setConditionDiscountRate(String op, java.lang.Float val, String relation) {
		addCondition(5, op, relation, val);
	}

	public void setSelectDiscountRate(boolean val) {
		__select_flags[5] = val;
	}

	public void setDiscountRateExpression(String val) {
		__dataExpressions[5] = val;
	}

	public void setConditionSum(String op, java.math.BigDecimal val) {
		setConditionSum(op, val, CONDITION_AND);
	}

	public void setConditionSum(String op, java.math.BigDecimal val, String relation) {
		addCondition(6, op, relation, val);
	}

	public void setSelectSum(boolean val) {
		__select_flags[6] = val;
	}

	public void setSumExpression(String val) {
		__dataExpressions[6] = val;
	}

	public void setConditionPriceUnitListed(String op, java.math.BigDecimal val) {
		setConditionPriceUnitListed(op, val, CONDITION_AND);
	}

	public void setConditionPriceUnitListed(String op, java.math.BigDecimal val, String relation) {
		addCondition(7, op, relation, val);
	}

	public void setSelectPriceUnitListed(boolean val) {
		__select_flags[7] = val;
	}

	public void setPriceUnitListedExpression(String val) {
		__dataExpressions[7] = val;
	}

	public void setConditionEntityType(String op, java.lang.Integer val) {
		setConditionEntityType(op, val, CONDITION_AND);
	}

	public void setConditionEntityType(String op, java.lang.Integer val, String relation) {
		addCondition(8, op, relation, val);
	}

	public void setSelectEntityType(boolean val) {
		__select_flags[8] = val;
	}

	public void setEntityTypeExpression(String val) {
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

	public void setConditionDateUpdated(String op, java.util.Date val) {
		setConditionDateUpdated(op, val, CONDITION_AND);
	}

	public void setConditionDateUpdated(String op, java.util.Date val, String relation) {
		addCondition(11, op, relation, generateTimestampFromDate(val));
	}

	public void setSelectDateUpdated(boolean val) {
		__select_flags[11] = val;
	}

	public void setDateUpdatedExpression(String val) {
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

	public void setConditionMemo(String op, java.lang.String val) {
		setConditionMemo(op, val, CONDITION_AND);
	}

	public void setConditionMemo(String op, java.lang.String val, String relation) {
		addCondition(13, op, relation, val);
	}

	public void setSelectMemo(boolean val) {
		__select_flags[13] = val;
	}

	public void setMemoExpression(String val) {
		__dataExpressions[13] = val;
	}


}

