package fix.db.dao;

import delicacy.common.AbstractTable;
import delicacy.common.GenericBase;
import fix.db.bean.BaseCrmQuotationProduct;


public class CrmQuotationProduct extends AbstractTable<BaseCrmQuotationProduct>
{

	public CrmQuotationProduct() throws java.sql.SQLException 
	{

		initColumnNames();
	}

	protected final void initColumnNames()  throws java.sql.SQLException {

		__columnCount          = 22;

		initTables();

		__tableName            = "crm_quotation_products";

		__key_columns          = new int[1];
		__key_columns[0] = 0;

		__column_names[0] = BaseCrmQuotationProduct.CS_QUOTATION_PRODUCT_ID;
		__column_names[1] = BaseCrmQuotationProduct.CS_QUOTATION_PRODUCT_CODE;
		__column_names[2] = BaseCrmQuotationProduct.CS_DEPARTMENT_ID;
		__column_names[3] = BaseCrmQuotationProduct.CS_EMPLOYEE_ID_CREATED;
		__column_names[4] = BaseCrmQuotationProduct.CS_DATE_CREATED;
		__column_names[5] = BaseCrmQuotationProduct.CS_EMPLOYEE_ID_UPDATED;
		__column_names[6] = BaseCrmQuotationProduct.CS_DATE_UPDATED;
		__column_names[7] = BaseCrmQuotationProduct.CS_FLAG_LOCKED;
		__column_names[8] = BaseCrmQuotationProduct.CS_QUOTATION_ID;
		__column_names[9] = BaseCrmQuotationProduct.CS_PRODUCT_NAME;
		__column_names[10] = BaseCrmQuotationProduct.CS_PRICE_UNIT_LISTED;
		__column_names[11] = BaseCrmQuotationProduct.CS_CUSTOMER_NAME;
		__column_names[12] = BaseCrmQuotationProduct.CS_UNIT;
		__column_names[13] = BaseCrmQuotationProduct.CS_PRICE_UNIT;
		__column_names[14] = BaseCrmQuotationProduct.CS_QUANTITY;
		__column_names[15] = BaseCrmQuotationProduct.CS_DISCOUNT_RATE;
		__column_names[16] = BaseCrmQuotationProduct.CS_AMOUNT;
		__column_names[17] = BaseCrmQuotationProduct.CS_MEMO;
		__column_names[18] = BaseCrmQuotationProduct.CS_PARENT_ID;
		__column_names[19] = BaseCrmQuotationProduct.CS_SUM_LISTED;
		__column_names[20] = BaseCrmQuotationProduct.CS_AMOUNT_TOTAL_DISCOUNT;
		__column_names[21] = BaseCrmQuotationProduct.CS_LEVEL;

		resetSelectFlags() ;
		resetInsertFlags() ;
	}

	public void resetInsertFlags(){
		for(int i = 0; i < __columnCount; i ++ ) __insert_flags[i] = true;
		__insert_flags[0] = false;
		__serial_column = 0;
	}

	public void setPrimaryKeyFromBase(BaseCrmQuotationProduct b) {
		clear();
		setQuotationProductIdClear(b.getQuotationProductId());
	}

	public boolean isPrimaryKeyNull() {
		return getQuotationProductId() == null;
	}

	@Override
	public BaseCrmQuotationProduct generateBase(){
		BaseCrmQuotationProduct b = new BaseCrmQuotationProduct();
		setDataToBase(b);
		return b;
	}

	@Override
	public void setDataToBase(BaseCrmQuotationProduct b){
		int count = 0; Object val;
		if((val = __current_data[count++]) != null) b.setQuotationProductId(GenericBase.__getInt(val));
		if((val = __current_data[count++]) != null) b.setQuotationProductCode(GenericBase.__getString(val));
		if((val = __current_data[count++]) != null) b.setDepartmentId(GenericBase.__getInt(val));
		if((val = __current_data[count++]) != null) b.setEmployeeIdCreated(GenericBase.__getInt(val));
		if((val = __current_data[count++]) != null) b.setDateCreated(GenericBase.__getDateFromSQL(val));
		if((val = __current_data[count++]) != null) b.setEmployeeIdUpdated(GenericBase.__getInt(val));
		if((val = __current_data[count++]) != null) b.setDateUpdated(GenericBase.__getDateFromSQL(val));
		if((val = __current_data[count++]) != null) b.setFlagLocked(GenericBase.__getBoolean(val));
		if((val = __current_data[count++]) != null) b.setQuotationId(GenericBase.__getInt(val));
		if((val = __current_data[count++]) != null) b.setProductName(GenericBase.__getInt(val));
		if((val = __current_data[count++]) != null) b.setPriceUnitListed(GenericBase.__getDecimal(val));
		if((val = __current_data[count++]) != null) b.setCustomerName(GenericBase.__getInt(val));
		if((val = __current_data[count++]) != null) b.setUnit(GenericBase.__getString(val));
		if((val = __current_data[count++]) != null) b.setPriceUnit(GenericBase.__getDecimal(val));
		if((val = __current_data[count++]) != null) b.setQuantity(GenericBase.__getFloat(val));
		if((val = __current_data[count++]) != null) b.setDiscountRate(GenericBase.__getDecimal(val));
		if((val = __current_data[count++]) != null) b.setAmount(GenericBase.__getDecimal(val));
		if((val = __current_data[count++]) != null) b.setMemo(GenericBase.__getString(val));
		if((val = __current_data[count++]) != null) b.setParentId(GenericBase.__getInt(val));
		if((val = __current_data[count++]) != null) b.setSumListed(GenericBase.__getDecimal(val));
		if((val = __current_data[count++]) != null) b.setAmountTotalDiscount(GenericBase.__getDecimal(val));
		if((val = __current_data[count++]) != null) b.setLevel(GenericBase.__getFloat(val));
	}

	@Override
	public void setBaseToBuffer(BaseCrmQuotationProduct b, Object[] buff){
		int count = 0;
		buff[count++] = b.getQuotationProductId();
		buff[count++] = b.getQuotationProductCode();
		buff[count++] = b.getDepartmentId();
		buff[count++] = b.getEmployeeIdCreated();
		buff[count++] = generateTimestampFromDate(b.getDateCreated());
		buff[count++] = b.getEmployeeIdUpdated();
		buff[count++] = generateTimestampFromDate(b.getDateUpdated());
		buff[count++] = b.getFlagLocked();
		buff[count++] = b.getQuotationId();
		buff[count++] = b.getProductName();
		buff[count++] = b.getPriceUnitListed();
		buff[count++] = b.getCustomerName();
		buff[count++] = b.getUnit();
		buff[count++] = b.getPriceUnit();
		buff[count++] = b.getQuantity();
		buff[count++] = b.getDiscountRate();
		buff[count++] = b.getAmount();
		buff[count++] = b.getMemo();
		buff[count++] = b.getParentId();
		buff[count++] = b.getSumListed();
		buff[count++] = b.getAmountTotalDiscount();
		buff[count++] = b.getLevel();
	}

	@Override
	public void setDataFromBase(BaseCrmQuotationProduct b){
		if(b.getQuotationProductId() != null) setQuotationProductIdClear(b.getQuotationProductId());
		if(b.getQuotationProductCode() != null) setQuotationProductCode(b.getQuotationProductCode());
		if(b.getDepartmentId() != null) setDepartmentId(b.getDepartmentId());
		if(b.getEmployeeIdCreated() != null) setEmployeeIdCreated(b.getEmployeeIdCreated());
		if(b.getDateCreated() != null) setDateCreated(b.getDateCreated());
		if(b.getEmployeeIdUpdated() != null) setEmployeeIdUpdated(b.getEmployeeIdUpdated());
		if(b.getDateUpdated() != null) setDateUpdated(b.getDateUpdated());
		if(b.getFlagLocked() != null) setFlagLocked(b.getFlagLocked());
		if(b.getQuotationId() != null) setQuotationId(b.getQuotationId());
		if(b.getProductName() != null) setProductName(b.getProductName());
		if(b.getPriceUnitListed() != null) setPriceUnitListed(b.getPriceUnitListed());
		if(b.getCustomerName() != null) setCustomerName(b.getCustomerName());
		if(b.getUnit() != null) setUnit(b.getUnit());
		if(b.getPriceUnit() != null) setPriceUnit(b.getPriceUnit());
		if(b.getQuantity() != null) setQuantity(b.getQuantity());
		if(b.getDiscountRate() != null) setDiscountRate(b.getDiscountRate());
		if(b.getAmount() != null) setAmount(b.getAmount());
		if(b.getMemo() != null) setMemo(b.getMemo());
		if(b.getParentId() != null) setParentId(b.getParentId());
		if(b.getSumListed() != null) setSumListed(b.getSumListed());
		if(b.getAmountTotalDiscount() != null) setAmountTotalDiscount(b.getAmountTotalDiscount());
		if(b.getLevel() != null) setLevel(b.getLevel());
	}

	@Override
	public BaseCrmQuotationProduct generateBaseFromResultSet(java.sql.ResultSet sdr)  throws java.sql.SQLException {

		BaseCrmQuotationProduct b = new BaseCrmQuotationProduct();
		setQueryResultToBase(b, sdr);
		return b;
	}

	@Override
	public void setQueryResultToBase(BaseCrmQuotationProduct __base, java.sql.ResultSet sdr ) throws java.sql.SQLException {
		int count = 1, index = 0;
		java.sql.ResultSetMetaData rsmd = sdr.getMetaData();
		int columnCount = rsmd.getColumnCount();
		Object val;
		if(__select_flags[index++] && count <= columnCount && (val = sdr.getObject(count++)) != null) __base.setQuotationProductId(GenericBase.__getInt(val));
		if(__select_flags[index++] && count <= columnCount && (val = sdr.getObject(count++)) != null) __base.setQuotationProductCode(GenericBase.__getString(val));
		if(__select_flags[index++] && count <= columnCount && (val = sdr.getObject(count++)) != null) __base.setDepartmentId(GenericBase.__getInt(val));
		if(__select_flags[index++] && count <= columnCount && (val = sdr.getObject(count++)) != null) __base.setEmployeeIdCreated(GenericBase.__getInt(val));
		if(__select_flags[index++] && count <= columnCount && (val = sdr.getObject(count++)) != null) __base.setDateCreated(GenericBase.__getDateFromSQL(val));
		if(__select_flags[index++] && count <= columnCount && (val = sdr.getObject(count++)) != null) __base.setEmployeeIdUpdated(GenericBase.__getInt(val));
		if(__select_flags[index++] && count <= columnCount && (val = sdr.getObject(count++)) != null) __base.setDateUpdated(GenericBase.__getDateFromSQL(val));
		if(__select_flags[index++] && count <= columnCount && (val = sdr.getObject(count++)) != null) __base.setFlagLocked(GenericBase.__getBoolean(val));
		if(__select_flags[index++] && count <= columnCount && (val = sdr.getObject(count++)) != null) __base.setQuotationId(GenericBase.__getInt(val));
		if(__select_flags[index++] && count <= columnCount && (val = sdr.getObject(count++)) != null) __base.setProductName(GenericBase.__getInt(val));
		if(__select_flags[index++] && count <= columnCount && (val = sdr.getObject(count++)) != null) __base.setPriceUnitListed(GenericBase.__getDecimal(val));
		if(__select_flags[index++] && count <= columnCount && (val = sdr.getObject(count++)) != null) __base.setCustomerName(GenericBase.__getInt(val));
		if(__select_flags[index++] && count <= columnCount && (val = sdr.getObject(count++)) != null) __base.setUnit(GenericBase.__getString(val));
		if(__select_flags[index++] && count <= columnCount && (val = sdr.getObject(count++)) != null) __base.setPriceUnit(GenericBase.__getDecimal(val));
		if(__select_flags[index++] && count <= columnCount && (val = sdr.getObject(count++)) != null) __base.setQuantity(GenericBase.__getFloat(val));
		if(__select_flags[index++] && count <= columnCount && (val = sdr.getObject(count++)) != null) __base.setDiscountRate(GenericBase.__getDecimal(val));
		if(__select_flags[index++] && count <= columnCount && (val = sdr.getObject(count++)) != null) __base.setAmount(GenericBase.__getDecimal(val));
		if(__select_flags[index++] && count <= columnCount && (val = sdr.getObject(count++)) != null) __base.setMemo(GenericBase.__getString(val));
		if(__select_flags[index++] && count <= columnCount && (val = sdr.getObject(count++)) != null) __base.setParentId(GenericBase.__getInt(val));
		if(__select_flags[index++] && count <= columnCount && (val = sdr.getObject(count++)) != null) __base.setSumListed(GenericBase.__getDecimal(val));
		if(__select_flags[index++] && count <= columnCount && (val = sdr.getObject(count++)) != null) __base.setAmountTotalDiscount(GenericBase.__getDecimal(val));
		if(__select_flags[index++] && count <= columnCount && (val = sdr.getObject(count++)) != null) __base.setLevel(GenericBase.__getFloat(val));
	}

	public void setQuotationProductId(java.lang.Integer val) {
		setCurrentData(0, val);
	}

	public java.lang.Integer getQuotationProductId() {
		return GenericBase.__getInt(__current_data[0]);
	}

	public void setQuotationProductIdClear(java.lang.Integer val) {
		__backup_data[0] = __current_data[0] =  val;
		__modified_flags[0] = false;
	}

	public void setQuotationProductCode(java.lang.String val) {
		setCurrentData(1, val);
	}

	public java.lang.String getQuotationProductCode() {
		return GenericBase.__getString(__current_data[1]);
	}

	public void setDepartmentId(java.lang.Integer val) {
		setCurrentData(2, val);
	}

	public java.lang.Integer getDepartmentId() {
		return GenericBase.__getInt(__current_data[2]);
	}

	public void setEmployeeIdCreated(java.lang.Integer val) {
		setCurrentData(3, val);
	}

	public java.lang.Integer getEmployeeIdCreated() {
		return GenericBase.__getInt(__current_data[3]);
	}

	public void setDateCreated(java.util.Date val) {
		setCurrentData(4, generateTimestampFromDate(val));
	}

	public java.util.Date getDateCreated() {
		return GenericBase.__getDateFromSQL(__current_data[4]);
	}

	public void setEmployeeIdUpdated(java.lang.Integer val) {
		setCurrentData(5, val);
	}

	public java.lang.Integer getEmployeeIdUpdated() {
		return GenericBase.__getInt(__current_data[5]);
	}

	public void setDateUpdated(java.util.Date val) {
		setCurrentData(6, generateTimestampFromDate(val));
	}

	public java.util.Date getDateUpdated() {
		return GenericBase.__getDateFromSQL(__current_data[6]);
	}

	public void setFlagLocked(java.lang.Boolean val) {
		setCurrentData(7, val);
	}

	public java.lang.Boolean getFlagLocked() {
		return GenericBase.__getBoolean(__current_data[7]);
	}

	public void setQuotationId(java.lang.Integer val) {
		setCurrentData(8, val);
	}

	public java.lang.Integer getQuotationId() {
		return GenericBase.__getInt(__current_data[8]);
	}

	public void setProductName(java.lang.Integer val) {
		setCurrentData(9, val);
	}

	public java.lang.Integer getProductName() {
		return GenericBase.__getInt(__current_data[9]);
	}

	public void setPriceUnitListed(java.math.BigDecimal val) {
		setCurrentData(10, val);
	}

	public java.math.BigDecimal getPriceUnitListed() {
		return GenericBase.__getDecimal(__current_data[10]);
	}

	public void setCustomerName(java.lang.Integer val) {
		setCurrentData(11, val);
	}

	public java.lang.Integer getCustomerName() {
		return GenericBase.__getInt(__current_data[11]);
	}

	public void setUnit(java.lang.String val) {
		setCurrentData(12, val);
	}

	public java.lang.String getUnit() {
		return GenericBase.__getString(__current_data[12]);
	}

	public void setPriceUnit(java.math.BigDecimal val) {
		setCurrentData(13, val);
	}

	public java.math.BigDecimal getPriceUnit() {
		return GenericBase.__getDecimal(__current_data[13]);
	}

	public void setQuantity(java.lang.Float val) {
		setCurrentData(14, val);
	}

	public java.lang.Float getQuantity() {
		return GenericBase.__getFloat(__current_data[14]);
	}

	public void setDiscountRate(java.math.BigDecimal val) {
		setCurrentData(15, val);
	}

	public java.math.BigDecimal getDiscountRate() {
		return GenericBase.__getDecimal(__current_data[15]);
	}

	public void setAmount(java.math.BigDecimal val) {
		setCurrentData(16, val);
	}

	public java.math.BigDecimal getAmount() {
		return GenericBase.__getDecimal(__current_data[16]);
	}

	public void setMemo(java.lang.String val) {
		setCurrentData(17, val);
	}

	public java.lang.String getMemo() {
		return GenericBase.__getString(__current_data[17]);
	}

	public void setParentId(java.lang.Integer val) {
		setCurrentData(18, val);
	}

	public java.lang.Integer getParentId() {
		return GenericBase.__getInt(__current_data[18]);
	}

	public void setSumListed(java.math.BigDecimal val) {
		setCurrentData(19, val);
	}

	public java.math.BigDecimal getSumListed() {
		return GenericBase.__getDecimal(__current_data[19]);
	}

	public void setAmountTotalDiscount(java.math.BigDecimal val) {
		setCurrentData(20, val);
	}

	public java.math.BigDecimal getAmountTotalDiscount() {
		return GenericBase.__getDecimal(__current_data[20]);
	}

	public void setLevel(java.lang.Float val) {
		setCurrentData(21, val);
	}

	public java.lang.Float getLevel() {
		return GenericBase.__getFloat(__current_data[21]);
	}

	public void setConditionQuotationProductId(String op, java.lang.Integer val) {
		setConditionQuotationProductId(op, val, CONDITION_AND);
	}

	public void setConditionQuotationProductId(String op, java.lang.Integer val, String relation) {
		addCondition(0, op, relation, val);
	}

	public void setSelectQuotationProductId(boolean val) {
		__select_flags[0] = val;
	}

	public void setQuotationProductIdExpression(String val) {
		__dataExpressions[0] = val;
	}

	public void setConditionQuotationProductCode(String op, java.lang.String val) {
		setConditionQuotationProductCode(op, val, CONDITION_AND);
	}

	public void setConditionQuotationProductCode(String op, java.lang.String val, String relation) {
		addCondition(1, op, relation, val);
	}

	public void setSelectQuotationProductCode(boolean val) {
		__select_flags[1] = val;
	}

	public void setQuotationProductCodeExpression(String val) {
		__dataExpressions[1] = val;
	}

	public void setConditionDepartmentId(String op, java.lang.Integer val) {
		setConditionDepartmentId(op, val, CONDITION_AND);
	}

	public void setConditionDepartmentId(String op, java.lang.Integer val, String relation) {
		addCondition(2, op, relation, val);
	}

	public void setSelectDepartmentId(boolean val) {
		__select_flags[2] = val;
	}

	public void setDepartmentIdExpression(String val) {
		__dataExpressions[2] = val;
	}

	public void setConditionEmployeeIdCreated(String op, java.lang.Integer val) {
		setConditionEmployeeIdCreated(op, val, CONDITION_AND);
	}

	public void setConditionEmployeeIdCreated(String op, java.lang.Integer val, String relation) {
		addCondition(3, op, relation, val);
	}

	public void setSelectEmployeeIdCreated(boolean val) {
		__select_flags[3] = val;
	}

	public void setEmployeeIdCreatedExpression(String val) {
		__dataExpressions[3] = val;
	}

	public void setConditionDateCreated(String op, java.util.Date val) {
		setConditionDateCreated(op, val, CONDITION_AND);
	}

	public void setConditionDateCreated(String op, java.util.Date val, String relation) {
		addCondition(4, op, relation, generateTimestampFromDate(val));
	}

	public void setSelectDateCreated(boolean val) {
		__select_flags[4] = val;
	}

	public void setDateCreatedExpression(String val) {
		__dataExpressions[4] = val;
	}

	public void setConditionEmployeeIdUpdated(String op, java.lang.Integer val) {
		setConditionEmployeeIdUpdated(op, val, CONDITION_AND);
	}

	public void setConditionEmployeeIdUpdated(String op, java.lang.Integer val, String relation) {
		addCondition(5, op, relation, val);
	}

	public void setSelectEmployeeIdUpdated(boolean val) {
		__select_flags[5] = val;
	}

	public void setEmployeeIdUpdatedExpression(String val) {
		__dataExpressions[5] = val;
	}

	public void setConditionDateUpdated(String op, java.util.Date val) {
		setConditionDateUpdated(op, val, CONDITION_AND);
	}

	public void setConditionDateUpdated(String op, java.util.Date val, String relation) {
		addCondition(6, op, relation, generateTimestampFromDate(val));
	}

	public void setSelectDateUpdated(boolean val) {
		__select_flags[6] = val;
	}

	public void setDateUpdatedExpression(String val) {
		__dataExpressions[6] = val;
	}

	public void setConditionFlagLocked(String op, java.lang.Boolean val) {
		setConditionFlagLocked(op, val, CONDITION_AND);
	}

	public void setConditionFlagLocked(String op, java.lang.Boolean val, String relation) {
		addCondition(7, op, relation, val);
	}

	public void setSelectFlagLocked(boolean val) {
		__select_flags[7] = val;
	}

	public void setFlagLockedExpression(String val) {
		__dataExpressions[7] = val;
	}

	public void setConditionQuotationId(String op, java.lang.Integer val) {
		setConditionQuotationId(op, val, CONDITION_AND);
	}

	public void setConditionQuotationId(String op, java.lang.Integer val, String relation) {
		addCondition(8, op, relation, val);
	}

	public void setSelectQuotationId(boolean val) {
		__select_flags[8] = val;
	}

	public void setQuotationIdExpression(String val) {
		__dataExpressions[8] = val;
	}

	public void setConditionProductName(String op, java.lang.Integer val) {
		setConditionProductName(op, val, CONDITION_AND);
	}

	public void setConditionProductName(String op, java.lang.Integer val, String relation) {
		addCondition(9, op, relation, val);
	}

	public void setSelectProductName(boolean val) {
		__select_flags[9] = val;
	}

	public void setProductNameExpression(String val) {
		__dataExpressions[9] = val;
	}

	public void setConditionPriceUnitListed(String op, java.math.BigDecimal val) {
		setConditionPriceUnitListed(op, val, CONDITION_AND);
	}

	public void setConditionPriceUnitListed(String op, java.math.BigDecimal val, String relation) {
		addCondition(10, op, relation, val);
	}

	public void setSelectPriceUnitListed(boolean val) {
		__select_flags[10] = val;
	}

	public void setPriceUnitListedExpression(String val) {
		__dataExpressions[10] = val;
	}

	public void setConditionCustomerName(String op, java.lang.Integer val) {
		setConditionCustomerName(op, val, CONDITION_AND);
	}

	public void setConditionCustomerName(String op, java.lang.Integer val, String relation) {
		addCondition(11, op, relation, val);
	}

	public void setSelectCustomerName(boolean val) {
		__select_flags[11] = val;
	}

	public void setCustomerNameExpression(String val) {
		__dataExpressions[11] = val;
	}

	public void setConditionUnit(String op, java.lang.String val) {
		setConditionUnit(op, val, CONDITION_AND);
	}

	public void setConditionUnit(String op, java.lang.String val, String relation) {
		addCondition(12, op, relation, val);
	}

	public void setSelectUnit(boolean val) {
		__select_flags[12] = val;
	}

	public void setUnitExpression(String val) {
		__dataExpressions[12] = val;
	}

	public void setConditionPriceUnit(String op, java.math.BigDecimal val) {
		setConditionPriceUnit(op, val, CONDITION_AND);
	}

	public void setConditionPriceUnit(String op, java.math.BigDecimal val, String relation) {
		addCondition(13, op, relation, val);
	}

	public void setSelectPriceUnit(boolean val) {
		__select_flags[13] = val;
	}

	public void setPriceUnitExpression(String val) {
		__dataExpressions[13] = val;
	}

	public void setConditionQuantity(String op, java.lang.Float val) {
		setConditionQuantity(op, val, CONDITION_AND);
	}

	public void setConditionQuantity(String op, java.lang.Float val, String relation) {
		addCondition(14, op, relation, val);
	}

	public void setSelectQuantity(boolean val) {
		__select_flags[14] = val;
	}

	public void setQuantityExpression(String val) {
		__dataExpressions[14] = val;
	}

	public void setConditionDiscountRate(String op, java.math.BigDecimal val) {
		setConditionDiscountRate(op, val, CONDITION_AND);
	}

	public void setConditionDiscountRate(String op, java.math.BigDecimal val, String relation) {
		addCondition(15, op, relation, val);
	}

	public void setSelectDiscountRate(boolean val) {
		__select_flags[15] = val;
	}

	public void setDiscountRateExpression(String val) {
		__dataExpressions[15] = val;
	}

	public void setConditionAmount(String op, java.math.BigDecimal val) {
		setConditionAmount(op, val, CONDITION_AND);
	}

	public void setConditionAmount(String op, java.math.BigDecimal val, String relation) {
		addCondition(16, op, relation, val);
	}

	public void setSelectAmount(boolean val) {
		__select_flags[16] = val;
	}

	public void setAmountExpression(String val) {
		__dataExpressions[16] = val;
	}

	public void setConditionMemo(String op, java.lang.String val) {
		setConditionMemo(op, val, CONDITION_AND);
	}

	public void setConditionMemo(String op, java.lang.String val, String relation) {
		addCondition(17, op, relation, val);
	}

	public void setSelectMemo(boolean val) {
		__select_flags[17] = val;
	}

	public void setMemoExpression(String val) {
		__dataExpressions[17] = val;
	}

	public void setConditionParentId(String op, java.lang.Integer val) {
		setConditionParentId(op, val, CONDITION_AND);
	}

	public void setConditionParentId(String op, java.lang.Integer val, String relation) {
		addCondition(18, op, relation, val);
	}

	public void setSelectParentId(boolean val) {
		__select_flags[18] = val;
	}

	public void setParentIdExpression(String val) {
		__dataExpressions[18] = val;
	}

	public void setConditionSumListed(String op, java.math.BigDecimal val) {
		setConditionSumListed(op, val, CONDITION_AND);
	}

	public void setConditionSumListed(String op, java.math.BigDecimal val, String relation) {
		addCondition(19, op, relation, val);
	}

	public void setSelectSumListed(boolean val) {
		__select_flags[19] = val;
	}

	public void setSumListedExpression(String val) {
		__dataExpressions[19] = val;
	}

	public void setConditionAmountTotalDiscount(String op, java.math.BigDecimal val) {
		setConditionAmountTotalDiscount(op, val, CONDITION_AND);
	}

	public void setConditionAmountTotalDiscount(String op, java.math.BigDecimal val, String relation) {
		addCondition(20, op, relation, val);
	}

	public void setSelectAmountTotalDiscount(boolean val) {
		__select_flags[20] = val;
	}

	public void setAmountTotalDiscountExpression(String val) {
		__dataExpressions[20] = val;
	}

	public void setConditionLevel(String op, java.lang.Float val) {
		setConditionLevel(op, val, CONDITION_AND);
	}

	public void setConditionLevel(String op, java.lang.Float val, String relation) {
		addCondition(21, op, relation, val);
	}

	public void setSelectLevel(boolean val) {
		__select_flags[21] = val;
	}

	public void setLevelExpression(String val) {
		__dataExpressions[21] = val;
	}


}

