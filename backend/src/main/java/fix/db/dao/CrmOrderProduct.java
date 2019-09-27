package fix.db.dao;

import delicacy.common.AbstractTable;
import delicacy.common.GenericBase;
import fix.db.bean.BaseCrmOrderProduct;


public class CrmOrderProduct extends AbstractTable<BaseCrmOrderProduct>
{

	public CrmOrderProduct() throws java.sql.SQLException 
	{

		initColumnNames();
	}

	protected final void initColumnNames()  throws java.sql.SQLException {

		__columnCount          = 23;

		initTables();

		__tableName            = "crm_order_products";

		__key_columns          = new int[1];
		__key_columns[0] = 0;

		__column_names[0] = BaseCrmOrderProduct.CS_ORDER_PRODUCT_ID;
		__column_names[1] = BaseCrmOrderProduct.CS_ORDER_ID;
		__column_names[2] = BaseCrmOrderProduct.CS_PRODUCT_ID;
		__column_names[3] = BaseCrmOrderProduct.CS_PRICE_UNIT;
		__column_names[4] = BaseCrmOrderProduct.CS_QUANTITY;
		__column_names[5] = BaseCrmOrderProduct.CS_DISCOUNT_RATE;
		__column_names[6] = BaseCrmOrderProduct.CS_SUM;
		__column_names[7] = BaseCrmOrderProduct.CS_MEMO;
		__column_names[8] = BaseCrmOrderProduct.CS_EMPLOYEE_ID_CREATED;
		__column_names[9] = BaseCrmOrderProduct.CS_DATE_CREATED;
		__column_names[10] = BaseCrmOrderProduct.CS_PRICE_UNIT_LISTED;
		__column_names[11] = BaseCrmOrderProduct.CS_EMPLOYEE_ID_UPDATED;
		__column_names[12] = BaseCrmOrderProduct.CS_DATE_UPDATED;
		__column_names[13] = BaseCrmOrderProduct.CS_QUANTITY_TO_DELIVER;
		__column_names[14] = BaseCrmOrderProduct.CS_QUANTITY_DELIVERED;
		__column_names[15] = BaseCrmOrderProduct.CS_FLAG_SQUARED_UP;
		__column_names[16] = BaseCrmOrderProduct.CS_DATE_ORDER_PLACED;
		__column_names[17] = BaseCrmOrderProduct.CS_SUM_TOTAL_LISTED;
		__column_names[18] = BaseCrmOrderProduct.CS_AMOUNT_TOTAL_DISCOUNT;
		__column_names[19] = BaseCrmOrderProduct.CS_QUANTITY_CHANGE;
		__column_names[20] = BaseCrmOrderProduct.CS_AMOUNT_CHANGE;
		__column_names[21] = BaseCrmOrderProduct.CS_ORDER_VERSION;
		__column_names[22] = BaseCrmOrderProduct.CS_CHANGETYPE;

		resetSelectFlags() ;
		resetInsertFlags() ;
	}

	public void resetInsertFlags(){
		for(int i = 0; i < __columnCount; i ++ ) __insert_flags[i] = true;
		__insert_flags[0] = false;
		__serial_column = 0;
	}

	public void setPrimaryKeyFromBase(BaseCrmOrderProduct b) {
		clear();
		setOrderProductIdClear(b.getOrderProductId());
	}

	public boolean isPrimaryKeyNull() {
		return getOrderProductId() == null;
	}

	@Override
	public BaseCrmOrderProduct generateBase(){
		BaseCrmOrderProduct b = new BaseCrmOrderProduct();
		setDataToBase(b);
		return b;
	}

	@Override
	public void setDataToBase(BaseCrmOrderProduct b){
		int count = 0; Object val;
		if((val = __current_data[count++]) != null) b.setOrderProductId(GenericBase.__getInt(val));
		if((val = __current_data[count++]) != null) b.setOrderId(GenericBase.__getInt(val));
		if((val = __current_data[count++]) != null) b.setProductId(GenericBase.__getInt(val));
		if((val = __current_data[count++]) != null) b.setPriceUnit(GenericBase.__getDecimal(val));
		if((val = __current_data[count++]) != null) b.setQuantity(GenericBase.__getFloat(val));
		if((val = __current_data[count++]) != null) b.setDiscountRate(GenericBase.__getDecimal(val));
		if((val = __current_data[count++]) != null) b.setSum(GenericBase.__getDecimal(val));
		if((val = __current_data[count++]) != null) b.setMemo(GenericBase.__getString(val));
		if((val = __current_data[count++]) != null) b.setEmployeeIdCreated(GenericBase.__getInt(val));
		if((val = __current_data[count++]) != null) b.setDateCreated(GenericBase.__getDateFromSQL(val));
		if((val = __current_data[count++]) != null) b.setPriceUnitListed(GenericBase.__getDecimal(val));
		if((val = __current_data[count++]) != null) b.setEmployeeIdUpdated(GenericBase.__getInt(val));
		if((val = __current_data[count++]) != null) b.setDateUpdated(GenericBase.__getDateFromSQL(val));
		if((val = __current_data[count++]) != null) b.setQuantityToDeliver(GenericBase.__getFloat(val));
		if((val = __current_data[count++]) != null) b.setQuantityDelivered(GenericBase.__getFloat(val));
		if((val = __current_data[count++]) != null) b.setFlagSquaredUp(GenericBase.__getBoolean(val));
		if((val = __current_data[count++]) != null) b.setDateOrderPlaced(GenericBase.__getDateFromSQL(val));
		if((val = __current_data[count++]) != null) b.setSumTotalListed(GenericBase.__getDecimal(val));
		if((val = __current_data[count++]) != null) b.setAmountTotalDiscount(GenericBase.__getDecimal(val));
		if((val = __current_data[count++]) != null) b.setQuantityChange(GenericBase.__getFloat(val));
		if((val = __current_data[count++]) != null) b.setAmountChange(GenericBase.__getDecimal(val));
		if((val = __current_data[count++]) != null) b.setOrderVersion(GenericBase.__getInt(val));
		if((val = __current_data[count++]) != null) b.setChangetype(GenericBase.__getInt(val));
	}

	@Override
	public void setBaseToBuffer(BaseCrmOrderProduct b, Object[] buff){
		int count = 0;
		buff[count++] = b.getOrderProductId();
		buff[count++] = b.getOrderId();
		buff[count++] = b.getProductId();
		buff[count++] = b.getPriceUnit();
		buff[count++] = b.getQuantity();
		buff[count++] = b.getDiscountRate();
		buff[count++] = b.getSum();
		buff[count++] = b.getMemo();
		buff[count++] = b.getEmployeeIdCreated();
		buff[count++] = generateTimestampFromDate(b.getDateCreated());
		buff[count++] = b.getPriceUnitListed();
		buff[count++] = b.getEmployeeIdUpdated();
		buff[count++] = generateTimestampFromDate(b.getDateUpdated());
		buff[count++] = b.getQuantityToDeliver();
		buff[count++] = b.getQuantityDelivered();
		buff[count++] = b.getFlagSquaredUp();
		buff[count++] = generateTimestampFromDate(b.getDateOrderPlaced());
		buff[count++] = b.getSumTotalListed();
		buff[count++] = b.getAmountTotalDiscount();
		buff[count++] = b.getQuantityChange();
		buff[count++] = b.getAmountChange();
		buff[count++] = b.getOrderVersion();
		buff[count++] = b.getChangetype();
	}

	@Override
	public void setDataFromBase(BaseCrmOrderProduct b){
		if(b.getOrderProductId() != null) setOrderProductIdClear(b.getOrderProductId());
		if(b.getOrderId() != null) setOrderId(b.getOrderId());
		if(b.getProductId() != null) setProductId(b.getProductId());
		if(b.getPriceUnit() != null) setPriceUnit(b.getPriceUnit());
		if(b.getQuantity() != null) setQuantity(b.getQuantity());
		if(b.getDiscountRate() != null) setDiscountRate(b.getDiscountRate());
		if(b.getSum() != null) setSum(b.getSum());
		if(b.getMemo() != null) setMemo(b.getMemo());
		if(b.getEmployeeIdCreated() != null) setEmployeeIdCreated(b.getEmployeeIdCreated());
		if(b.getDateCreated() != null) setDateCreated(b.getDateCreated());
		if(b.getPriceUnitListed() != null) setPriceUnitListed(b.getPriceUnitListed());
		if(b.getEmployeeIdUpdated() != null) setEmployeeIdUpdated(b.getEmployeeIdUpdated());
		if(b.getDateUpdated() != null) setDateUpdated(b.getDateUpdated());
		if(b.getQuantityToDeliver() != null) setQuantityToDeliver(b.getQuantityToDeliver());
		if(b.getQuantityDelivered() != null) setQuantityDelivered(b.getQuantityDelivered());
		if(b.getFlagSquaredUp() != null) setFlagSquaredUp(b.getFlagSquaredUp());
		if(b.getDateOrderPlaced() != null) setDateOrderPlaced(b.getDateOrderPlaced());
		if(b.getSumTotalListed() != null) setSumTotalListed(b.getSumTotalListed());
		if(b.getAmountTotalDiscount() != null) setAmountTotalDiscount(b.getAmountTotalDiscount());
		if(b.getQuantityChange() != null) setQuantityChange(b.getQuantityChange());
		if(b.getAmountChange() != null) setAmountChange(b.getAmountChange());
		if(b.getOrderVersion() != null) setOrderVersion(b.getOrderVersion());
		if(b.getChangetype() != null) setChangetype(b.getChangetype());
	}

	@Override
	public BaseCrmOrderProduct generateBaseFromResultSet(java.sql.ResultSet sdr)  throws java.sql.SQLException {

		BaseCrmOrderProduct b = new BaseCrmOrderProduct();
		setQueryResultToBase(b, sdr);
		return b;
	}

	@Override
	public void setQueryResultToBase(BaseCrmOrderProduct __base, java.sql.ResultSet sdr ) throws java.sql.SQLException {
		int count = 1, index = 0;
		java.sql.ResultSetMetaData rsmd = sdr.getMetaData();
		int columnCount = rsmd.getColumnCount();
		Object val;
		if(__select_flags[index++] && count <= columnCount && (val = sdr.getObject(count++)) != null) __base.setOrderProductId(GenericBase.__getInt(val));
		if(__select_flags[index++] && count <= columnCount && (val = sdr.getObject(count++)) != null) __base.setOrderId(GenericBase.__getInt(val));
		if(__select_flags[index++] && count <= columnCount && (val = sdr.getObject(count++)) != null) __base.setProductId(GenericBase.__getInt(val));
		if(__select_flags[index++] && count <= columnCount && (val = sdr.getObject(count++)) != null) __base.setPriceUnit(GenericBase.__getDecimal(val));
		if(__select_flags[index++] && count <= columnCount && (val = sdr.getObject(count++)) != null) __base.setQuantity(GenericBase.__getFloat(val));
		if(__select_flags[index++] && count <= columnCount && (val = sdr.getObject(count++)) != null) __base.setDiscountRate(GenericBase.__getDecimal(val));
		if(__select_flags[index++] && count <= columnCount && (val = sdr.getObject(count++)) != null) __base.setSum(GenericBase.__getDecimal(val));
		if(__select_flags[index++] && count <= columnCount && (val = sdr.getObject(count++)) != null) __base.setMemo(GenericBase.__getString(val));
		if(__select_flags[index++] && count <= columnCount && (val = sdr.getObject(count++)) != null) __base.setEmployeeIdCreated(GenericBase.__getInt(val));
		if(__select_flags[index++] && count <= columnCount && (val = sdr.getObject(count++)) != null) __base.setDateCreated(GenericBase.__getDateFromSQL(val));
		if(__select_flags[index++] && count <= columnCount && (val = sdr.getObject(count++)) != null) __base.setPriceUnitListed(GenericBase.__getDecimal(val));
		if(__select_flags[index++] && count <= columnCount && (val = sdr.getObject(count++)) != null) __base.setEmployeeIdUpdated(GenericBase.__getInt(val));
		if(__select_flags[index++] && count <= columnCount && (val = sdr.getObject(count++)) != null) __base.setDateUpdated(GenericBase.__getDateFromSQL(val));
		if(__select_flags[index++] && count <= columnCount && (val = sdr.getObject(count++)) != null) __base.setQuantityToDeliver(GenericBase.__getFloat(val));
		if(__select_flags[index++] && count <= columnCount && (val = sdr.getObject(count++)) != null) __base.setQuantityDelivered(GenericBase.__getFloat(val));
		if(__select_flags[index++] && count <= columnCount && (val = sdr.getObject(count++)) != null) __base.setFlagSquaredUp(GenericBase.__getBoolean(val));
		if(__select_flags[index++] && count <= columnCount && (val = sdr.getObject(count++)) != null) __base.setDateOrderPlaced(GenericBase.__getDateFromSQL(val));
		if(__select_flags[index++] && count <= columnCount && (val = sdr.getObject(count++)) != null) __base.setSumTotalListed(GenericBase.__getDecimal(val));
		if(__select_flags[index++] && count <= columnCount && (val = sdr.getObject(count++)) != null) __base.setAmountTotalDiscount(GenericBase.__getDecimal(val));
		if(__select_flags[index++] && count <= columnCount && (val = sdr.getObject(count++)) != null) __base.setQuantityChange(GenericBase.__getFloat(val));
		if(__select_flags[index++] && count <= columnCount && (val = sdr.getObject(count++)) != null) __base.setAmountChange(GenericBase.__getDecimal(val));
		if(__select_flags[index++] && count <= columnCount && (val = sdr.getObject(count++)) != null) __base.setOrderVersion(GenericBase.__getInt(val));
		if(__select_flags[index++] && count <= columnCount && (val = sdr.getObject(count++)) != null) __base.setChangetype(GenericBase.__getInt(val));
	}

	public void setOrderProductId(java.lang.Integer val) {
		setCurrentData(0, val);
	}

	public java.lang.Integer getOrderProductId() {
		return GenericBase.__getInt(__current_data[0]);
	}

	public void setOrderProductIdClear(java.lang.Integer val) {
		__backup_data[0] = __current_data[0] =  val;
		__modified_flags[0] = false;
	}

	public void setOrderId(java.lang.Integer val) {
		setCurrentData(1, val);
	}

	public java.lang.Integer getOrderId() {
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

	public void setDiscountRate(java.math.BigDecimal val) {
		setCurrentData(5, val);
	}

	public java.math.BigDecimal getDiscountRate() {
		return GenericBase.__getDecimal(__current_data[5]);
	}

	public void setSum(java.math.BigDecimal val) {
		setCurrentData(6, val);
	}

	public java.math.BigDecimal getSum() {
		return GenericBase.__getDecimal(__current_data[6]);
	}

	public void setMemo(java.lang.String val) {
		setCurrentData(7, val);
	}

	public java.lang.String getMemo() {
		return GenericBase.__getString(__current_data[7]);
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

	public void setPriceUnitListed(java.math.BigDecimal val) {
		setCurrentData(10, val);
	}

	public java.math.BigDecimal getPriceUnitListed() {
		return GenericBase.__getDecimal(__current_data[10]);
	}

	public void setEmployeeIdUpdated(java.lang.Integer val) {
		setCurrentData(11, val);
	}

	public java.lang.Integer getEmployeeIdUpdated() {
		return GenericBase.__getInt(__current_data[11]);
	}

	public void setDateUpdated(java.util.Date val) {
		setCurrentData(12, generateTimestampFromDate(val));
	}

	public java.util.Date getDateUpdated() {
		return GenericBase.__getDateFromSQL(__current_data[12]);
	}

	public void setQuantityToDeliver(java.lang.Float val) {
		setCurrentData(13, val);
	}

	public java.lang.Float getQuantityToDeliver() {
		return GenericBase.__getFloat(__current_data[13]);
	}

	public void setQuantityDelivered(java.lang.Float val) {
		setCurrentData(14, val);
	}

	public java.lang.Float getQuantityDelivered() {
		return GenericBase.__getFloat(__current_data[14]);
	}

	public void setFlagSquaredUp(java.lang.Boolean val) {
		setCurrentData(15, val);
	}

	public java.lang.Boolean getFlagSquaredUp() {
		return GenericBase.__getBoolean(__current_data[15]);
	}

	public void setDateOrderPlaced(java.util.Date val) {
		setCurrentData(16, generateTimestampFromDate(val));
	}

	public java.util.Date getDateOrderPlaced() {
		return GenericBase.__getDateFromSQL(__current_data[16]);
	}

	public void setSumTotalListed(java.math.BigDecimal val) {
		setCurrentData(17, val);
	}

	public java.math.BigDecimal getSumTotalListed() {
		return GenericBase.__getDecimal(__current_data[17]);
	}

	public void setAmountTotalDiscount(java.math.BigDecimal val) {
		setCurrentData(18, val);
	}

	public java.math.BigDecimal getAmountTotalDiscount() {
		return GenericBase.__getDecimal(__current_data[18]);
	}

	public void setQuantityChange(java.lang.Float val) {
		setCurrentData(19, val);
	}

	public java.lang.Float getQuantityChange() {
		return GenericBase.__getFloat(__current_data[19]);
	}

	public void setAmountChange(java.math.BigDecimal val) {
		setCurrentData(20, val);
	}

	public java.math.BigDecimal getAmountChange() {
		return GenericBase.__getDecimal(__current_data[20]);
	}

	public void setOrderVersion(java.lang.Integer val) {
		setCurrentData(21, val);
	}

	public java.lang.Integer getOrderVersion() {
		return GenericBase.__getInt(__current_data[21]);
	}

	public void setChangetype(java.lang.Integer val) {
		setCurrentData(22, val);
	}

	public java.lang.Integer getChangetype() {
		return GenericBase.__getInt(__current_data[22]);
	}

	public void setConditionOrderProductId(String op, java.lang.Integer val) {
		setConditionOrderProductId(op, val, CONDITION_AND);
	}

	public void setConditionOrderProductId(String op, java.lang.Integer val, String relation) {
		addCondition(0, op, relation, val);
	}

	public void setSelectOrderProductId(boolean val) {
		__select_flags[0] = val;
	}

	public void setOrderProductIdExpression(String val) {
		__dataExpressions[0] = val;
	}

	public void setConditionOrderId(String op, java.lang.Integer val) {
		setConditionOrderId(op, val, CONDITION_AND);
	}

	public void setConditionOrderId(String op, java.lang.Integer val, String relation) {
		addCondition(1, op, relation, val);
	}

	public void setSelectOrderId(boolean val) {
		__select_flags[1] = val;
	}

	public void setOrderIdExpression(String val) {
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

	public void setConditionDiscountRate(String op, java.math.BigDecimal val) {
		setConditionDiscountRate(op, val, CONDITION_AND);
	}

	public void setConditionDiscountRate(String op, java.math.BigDecimal val, String relation) {
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

	public void setConditionMemo(String op, java.lang.String val) {
		setConditionMemo(op, val, CONDITION_AND);
	}

	public void setConditionMemo(String op, java.lang.String val, String relation) {
		addCondition(7, op, relation, val);
	}

	public void setSelectMemo(boolean val) {
		__select_flags[7] = val;
	}

	public void setMemoExpression(String val) {
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

	public void setConditionEmployeeIdUpdated(String op, java.lang.Integer val) {
		setConditionEmployeeIdUpdated(op, val, CONDITION_AND);
	}

	public void setConditionEmployeeIdUpdated(String op, java.lang.Integer val, String relation) {
		addCondition(11, op, relation, val);
	}

	public void setSelectEmployeeIdUpdated(boolean val) {
		__select_flags[11] = val;
	}

	public void setEmployeeIdUpdatedExpression(String val) {
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

	public void setConditionQuantityToDeliver(String op, java.lang.Float val) {
		setConditionQuantityToDeliver(op, val, CONDITION_AND);
	}

	public void setConditionQuantityToDeliver(String op, java.lang.Float val, String relation) {
		addCondition(13, op, relation, val);
	}

	public void setSelectQuantityToDeliver(boolean val) {
		__select_flags[13] = val;
	}

	public void setQuantityToDeliverExpression(String val) {
		__dataExpressions[13] = val;
	}

	public void setConditionQuantityDelivered(String op, java.lang.Float val) {
		setConditionQuantityDelivered(op, val, CONDITION_AND);
	}

	public void setConditionQuantityDelivered(String op, java.lang.Float val, String relation) {
		addCondition(14, op, relation, val);
	}

	public void setSelectQuantityDelivered(boolean val) {
		__select_flags[14] = val;
	}

	public void setQuantityDeliveredExpression(String val) {
		__dataExpressions[14] = val;
	}

	public void setConditionFlagSquaredUp(String op, java.lang.Boolean val) {
		setConditionFlagSquaredUp(op, val, CONDITION_AND);
	}

	public void setConditionFlagSquaredUp(String op, java.lang.Boolean val, String relation) {
		addCondition(15, op, relation, val);
	}

	public void setSelectFlagSquaredUp(boolean val) {
		__select_flags[15] = val;
	}

	public void setFlagSquaredUpExpression(String val) {
		__dataExpressions[15] = val;
	}

	public void setConditionDateOrderPlaced(String op, java.util.Date val) {
		setConditionDateOrderPlaced(op, val, CONDITION_AND);
	}

	public void setConditionDateOrderPlaced(String op, java.util.Date val, String relation) {
		addCondition(16, op, relation, generateTimestampFromDate(val));
	}

	public void setSelectDateOrderPlaced(boolean val) {
		__select_flags[16] = val;
	}

	public void setDateOrderPlacedExpression(String val) {
		__dataExpressions[16] = val;
	}

	public void setConditionSumTotalListed(String op, java.math.BigDecimal val) {
		setConditionSumTotalListed(op, val, CONDITION_AND);
	}

	public void setConditionSumTotalListed(String op, java.math.BigDecimal val, String relation) {
		addCondition(17, op, relation, val);
	}

	public void setSelectSumTotalListed(boolean val) {
		__select_flags[17] = val;
	}

	public void setSumTotalListedExpression(String val) {
		__dataExpressions[17] = val;
	}

	public void setConditionAmountTotalDiscount(String op, java.math.BigDecimal val) {
		setConditionAmountTotalDiscount(op, val, CONDITION_AND);
	}

	public void setConditionAmountTotalDiscount(String op, java.math.BigDecimal val, String relation) {
		addCondition(18, op, relation, val);
	}

	public void setSelectAmountTotalDiscount(boolean val) {
		__select_flags[18] = val;
	}

	public void setAmountTotalDiscountExpression(String val) {
		__dataExpressions[18] = val;
	}

	public void setConditionQuantityChange(String op, java.lang.Float val) {
		setConditionQuantityChange(op, val, CONDITION_AND);
	}

	public void setConditionQuantityChange(String op, java.lang.Float val, String relation) {
		addCondition(19, op, relation, val);
	}

	public void setSelectQuantityChange(boolean val) {
		__select_flags[19] = val;
	}

	public void setQuantityChangeExpression(String val) {
		__dataExpressions[19] = val;
	}

	public void setConditionAmountChange(String op, java.math.BigDecimal val) {
		setConditionAmountChange(op, val, CONDITION_AND);
	}

	public void setConditionAmountChange(String op, java.math.BigDecimal val, String relation) {
		addCondition(20, op, relation, val);
	}

	public void setSelectAmountChange(boolean val) {
		__select_flags[20] = val;
	}

	public void setAmountChangeExpression(String val) {
		__dataExpressions[20] = val;
	}

	public void setConditionOrderVersion(String op, java.lang.Integer val) {
		setConditionOrderVersion(op, val, CONDITION_AND);
	}

	public void setConditionOrderVersion(String op, java.lang.Integer val, String relation) {
		addCondition(21, op, relation, val);
	}

	public void setSelectOrderVersion(boolean val) {
		__select_flags[21] = val;
	}

	public void setOrderVersionExpression(String val) {
		__dataExpressions[21] = val;
	}

	public void setConditionChangetype(String op, java.lang.Integer val) {
		setConditionChangetype(op, val, CONDITION_AND);
	}

	public void setConditionChangetype(String op, java.lang.Integer val, String relation) {
		addCondition(22, op, relation, val);
	}

	public void setSelectChangetype(boolean val) {
		__select_flags[22] = val;
	}

	public void setChangetypeExpression(String val) {
		__dataExpressions[22] = val;
	}


}

