package fix.db.dao;

import delicacy.common.AbstractTable;
import delicacy.common.GenericBase;
import fix.db.bean.BaseCrmDeliveryProduct;


public class CrmDeliveryProduct extends AbstractTable<BaseCrmDeliveryProduct>
{

	public CrmDeliveryProduct() throws java.sql.SQLException 
	{

		initColumnNames();
	}

	protected final void initColumnNames()  throws java.sql.SQLException {

		__columnCount          = 19;

		initTables();

		__tableName            = "crm_delivery_products";

		__key_columns          = new int[1];
		__key_columns[0] = 0;

		__column_names[0] = BaseCrmDeliveryProduct.CS_DELIVERY_PRODUCT_ID;
		__column_names[1] = BaseCrmDeliveryProduct.CS_DELIVERY_ID;
		__column_names[2] = BaseCrmDeliveryProduct.CS_PRODUCT_ID;
		__column_names[3] = BaseCrmDeliveryProduct.CS_DEPARTMENT_ID;
		__column_names[4] = BaseCrmDeliveryProduct.CS_EMPLOYEE_ID_CREATED;
		__column_names[5] = BaseCrmDeliveryProduct.CS_DATE_CREATED;
		__column_names[6] = BaseCrmDeliveryProduct.CS_EMPLOYEE_ID_UPDATED;
		__column_names[7] = BaseCrmDeliveryProduct.CS_DATE_UPDATED;
		__column_names[8] = BaseCrmDeliveryProduct.CS_FLAG_LOCKED;
		__column_names[9] = BaseCrmDeliveryProduct.CS_DELIVERY_NAME;
		__column_names[10] = BaseCrmDeliveryProduct.CS_ORDER_ID;
		__column_names[11] = BaseCrmDeliveryProduct.CS_QUANTITY_TOTAL_DELIVER;
		__column_names[12] = BaseCrmDeliveryProduct.CS_QUANTITY_DELIVERED;
		__column_names[13] = BaseCrmDeliveryProduct.CS_FLAG_SQUARED_UP;
		__column_names[14] = BaseCrmDeliveryProduct.CS_CONTACT_NAME;
		__column_names[15] = BaseCrmDeliveryProduct.CS_CONTACT_MOBILE;
		__column_names[16] = BaseCrmDeliveryProduct.CS_DETAILED_ADDRESS_DELIVERY;
		__column_names[17] = BaseCrmDeliveryProduct.CS_MEMO;
		__column_names[18] = BaseCrmDeliveryProduct.CS_ORDER_PRODUCT_ID;

		resetSelectFlags() ;
		resetInsertFlags() ;
	}

	public void resetInsertFlags(){
		for(int i = 0; i < __columnCount; i ++ ) __insert_flags[i] = true;
		__insert_flags[0] = false;
		__serial_column = 0;
	}

	public void setPrimaryKeyFromBase(BaseCrmDeliveryProduct b) {
		clear();
		setDeliveryProductIdClear(b.getDeliveryProductId());
	}

	public boolean isPrimaryKeyNull() {
		return getDeliveryProductId() == null;
	}

	@Override
	public BaseCrmDeliveryProduct generateBase(){
		BaseCrmDeliveryProduct b = new BaseCrmDeliveryProduct();
		setDataToBase(b);
		return b;
	}

	@Override
	public void setDataToBase(BaseCrmDeliveryProduct b){
		int count = 0; Object val;
		if((val = __current_data[count++]) != null) b.setDeliveryProductId(GenericBase.__getInt(val));
		if((val = __current_data[count++]) != null) b.setDeliveryId(GenericBase.__getInt(val));
		if((val = __current_data[count++]) != null) b.setProductId(GenericBase.__getInt(val));
		if((val = __current_data[count++]) != null) b.setDepartmentId(GenericBase.__getString(val));
		if((val = __current_data[count++]) != null) b.setEmployeeIdCreated(GenericBase.__getString(val));
		if((val = __current_data[count++]) != null) b.setDateCreated(GenericBase.__getDateFromSQL(val));
		if((val = __current_data[count++]) != null) b.setEmployeeIdUpdated(GenericBase.__getString(val));
		if((val = __current_data[count++]) != null) b.setDateUpdated(GenericBase.__getDateFromSQL(val));
		if((val = __current_data[count++]) != null) b.setFlagLocked(GenericBase.__getBoolean(val));
		if((val = __current_data[count++]) != null) b.setDeliveryName(GenericBase.__getString(val));
		if((val = __current_data[count++]) != null) b.setOrderId(GenericBase.__getInt(val));
		if((val = __current_data[count++]) != null) b.setQuantityTotalDeliver(GenericBase.__getInt(val));
		if((val = __current_data[count++]) != null) b.setQuantityDelivered(GenericBase.__getFloat(val));
		if((val = __current_data[count++]) != null) b.setFlagSquaredUp(GenericBase.__getBoolean(val));
		if((val = __current_data[count++]) != null) b.setContactName(GenericBase.__getString(val));
		if((val = __current_data[count++]) != null) b.setContactMobile(GenericBase.__getString(val));
		if((val = __current_data[count++]) != null) b.setDetailedAddressDelivery(GenericBase.__getString(val));
		if((val = __current_data[count++]) != null) b.setMemo(GenericBase.__getString(val));
		if((val = __current_data[count++]) != null) b.setOrderProductId(GenericBase.__getInt(val));
	}

	@Override
	public void setBaseToBuffer(BaseCrmDeliveryProduct b, Object[] buff){
		int count = 0;
		buff[count++] = b.getDeliveryProductId();
		buff[count++] = b.getDeliveryId();
		buff[count++] = b.getProductId();
		buff[count++] = b.getDepartmentId();
		buff[count++] = b.getEmployeeIdCreated();
		buff[count++] = generateTimestampFromDate(b.getDateCreated());
		buff[count++] = b.getEmployeeIdUpdated();
		buff[count++] = generateTimestampFromDate(b.getDateUpdated());
		buff[count++] = b.getFlagLocked();
		buff[count++] = b.getDeliveryName();
		buff[count++] = b.getOrderId();
		buff[count++] = b.getQuantityTotalDeliver();
		buff[count++] = b.getQuantityDelivered();
		buff[count++] = b.getFlagSquaredUp();
		buff[count++] = b.getContactName();
		buff[count++] = b.getContactMobile();
		buff[count++] = b.getDetailedAddressDelivery();
		buff[count++] = b.getMemo();
		buff[count++] = b.getOrderProductId();
	}

	@Override
	public void setDataFromBase(BaseCrmDeliveryProduct b){
		if(b.getDeliveryProductId() != null) setDeliveryProductIdClear(b.getDeliveryProductId());
		if(b.getDeliveryId() != null) setDeliveryId(b.getDeliveryId());
		if(b.getProductId() != null) setProductId(b.getProductId());
		if(b.getDepartmentId() != null) setDepartmentId(b.getDepartmentId());
		if(b.getEmployeeIdCreated() != null) setEmployeeIdCreated(b.getEmployeeIdCreated());
		if(b.getDateCreated() != null) setDateCreated(b.getDateCreated());
		if(b.getEmployeeIdUpdated() != null) setEmployeeIdUpdated(b.getEmployeeIdUpdated());
		if(b.getDateUpdated() != null) setDateUpdated(b.getDateUpdated());
		if(b.getFlagLocked() != null) setFlagLocked(b.getFlagLocked());
		if(b.getDeliveryName() != null) setDeliveryName(b.getDeliveryName());
		if(b.getOrderId() != null) setOrderId(b.getOrderId());
		if(b.getQuantityTotalDeliver() != null) setQuantityTotalDeliver(b.getQuantityTotalDeliver());
		if(b.getQuantityDelivered() != null) setQuantityDelivered(b.getQuantityDelivered());
		if(b.getFlagSquaredUp() != null) setFlagSquaredUp(b.getFlagSquaredUp());
		if(b.getContactName() != null) setContactName(b.getContactName());
		if(b.getContactMobile() != null) setContactMobile(b.getContactMobile());
		if(b.getDetailedAddressDelivery() != null) setDetailedAddressDelivery(b.getDetailedAddressDelivery());
		if(b.getMemo() != null) setMemo(b.getMemo());
		if(b.getOrderProductId() != null) setOrderProductId(b.getOrderProductId());
	}

	@Override
	public BaseCrmDeliveryProduct generateBaseFromResultSet(java.sql.ResultSet sdr)  throws java.sql.SQLException {

		BaseCrmDeliveryProduct b = new BaseCrmDeliveryProduct();
		setQueryResultToBase(b, sdr);
		return b;
	}

	@Override
	public void setQueryResultToBase(BaseCrmDeliveryProduct __base, java.sql.ResultSet sdr ) throws java.sql.SQLException {
		int count = 1, index = 0;
		java.sql.ResultSetMetaData rsmd = sdr.getMetaData();
		int columnCount = rsmd.getColumnCount();
		Object val;
		if(__select_flags[index++] && count <= columnCount && (val = sdr.getObject(count++)) != null) __base.setDeliveryProductId(GenericBase.__getInt(val));
		if(__select_flags[index++] && count <= columnCount && (val = sdr.getObject(count++)) != null) __base.setDeliveryId(GenericBase.__getInt(val));
		if(__select_flags[index++] && count <= columnCount && (val = sdr.getObject(count++)) != null) __base.setProductId(GenericBase.__getInt(val));
		if(__select_flags[index++] && count <= columnCount && (val = sdr.getObject(count++)) != null) __base.setDepartmentId(GenericBase.__getString(val));
		if(__select_flags[index++] && count <= columnCount && (val = sdr.getObject(count++)) != null) __base.setEmployeeIdCreated(GenericBase.__getString(val));
		if(__select_flags[index++] && count <= columnCount && (val = sdr.getObject(count++)) != null) __base.setDateCreated(GenericBase.__getDateFromSQL(val));
		if(__select_flags[index++] && count <= columnCount && (val = sdr.getObject(count++)) != null) __base.setEmployeeIdUpdated(GenericBase.__getString(val));
		if(__select_flags[index++] && count <= columnCount && (val = sdr.getObject(count++)) != null) __base.setDateUpdated(GenericBase.__getDateFromSQL(val));
		if(__select_flags[index++] && count <= columnCount && (val = sdr.getObject(count++)) != null) __base.setFlagLocked(GenericBase.__getBoolean(val));
		if(__select_flags[index++] && count <= columnCount && (val = sdr.getObject(count++)) != null) __base.setDeliveryName(GenericBase.__getString(val));
		if(__select_flags[index++] && count <= columnCount && (val = sdr.getObject(count++)) != null) __base.setOrderId(GenericBase.__getInt(val));
		if(__select_flags[index++] && count <= columnCount && (val = sdr.getObject(count++)) != null) __base.setQuantityTotalDeliver(GenericBase.__getInt(val));
		if(__select_flags[index++] && count <= columnCount && (val = sdr.getObject(count++)) != null) __base.setQuantityDelivered(GenericBase.__getFloat(val));
		if(__select_flags[index++] && count <= columnCount && (val = sdr.getObject(count++)) != null) __base.setFlagSquaredUp(GenericBase.__getBoolean(val));
		if(__select_flags[index++] && count <= columnCount && (val = sdr.getObject(count++)) != null) __base.setContactName(GenericBase.__getString(val));
		if(__select_flags[index++] && count <= columnCount && (val = sdr.getObject(count++)) != null) __base.setContactMobile(GenericBase.__getString(val));
		if(__select_flags[index++] && count <= columnCount && (val = sdr.getObject(count++)) != null) __base.setDetailedAddressDelivery(GenericBase.__getString(val));
		if(__select_flags[index++] && count <= columnCount && (val = sdr.getObject(count++)) != null) __base.setMemo(GenericBase.__getString(val));
		if(__select_flags[index++] && count <= columnCount && (val = sdr.getObject(count++)) != null) __base.setOrderProductId(GenericBase.__getInt(val));
	}

	public void setDeliveryProductId(java.lang.Integer val) {
		setCurrentData(0, val);
	}

	public java.lang.Integer getDeliveryProductId() {
		return GenericBase.__getInt(__current_data[0]);
	}

	public void setDeliveryProductIdClear(java.lang.Integer val) {
		__backup_data[0] = __current_data[0] =  val;
		__modified_flags[0] = false;
	}

	public void setDeliveryId(java.lang.Integer val) {
		setCurrentData(1, val);
	}

	public java.lang.Integer getDeliveryId() {
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

	public void setFlagLocked(java.lang.Boolean val) {
		setCurrentData(8, val);
	}

	public java.lang.Boolean getFlagLocked() {
		return GenericBase.__getBoolean(__current_data[8]);
	}

	public void setDeliveryName(java.lang.String val) {
		setCurrentData(9, val);
	}

	public java.lang.String getDeliveryName() {
		return GenericBase.__getString(__current_data[9]);
	}

	public void setOrderId(java.lang.Integer val) {
		setCurrentData(10, val);
	}

	public java.lang.Integer getOrderId() {
		return GenericBase.__getInt(__current_data[10]);
	}

	public void setQuantityTotalDeliver(java.lang.Integer val) {
		setCurrentData(11, val);
	}

	public java.lang.Integer getQuantityTotalDeliver() {
		return GenericBase.__getInt(__current_data[11]);
	}

	public void setQuantityDelivered(java.lang.Float val) {
		setCurrentData(12, val);
	}

	public java.lang.Float getQuantityDelivered() {
		return GenericBase.__getFloat(__current_data[12]);
	}

	public void setFlagSquaredUp(java.lang.Boolean val) {
		setCurrentData(13, val);
	}

	public java.lang.Boolean getFlagSquaredUp() {
		return GenericBase.__getBoolean(__current_data[13]);
	}

	public void setContactName(java.lang.String val) {
		setCurrentData(14, val);
	}

	public java.lang.String getContactName() {
		return GenericBase.__getString(__current_data[14]);
	}

	public void setContactMobile(java.lang.String val) {
		setCurrentData(15, val);
	}

	public java.lang.String getContactMobile() {
		return GenericBase.__getString(__current_data[15]);
	}

	public void setDetailedAddressDelivery(java.lang.String val) {
		setCurrentData(16, val);
	}

	public java.lang.String getDetailedAddressDelivery() {
		return GenericBase.__getString(__current_data[16]);
	}

	public void setMemo(java.lang.String val) {
		setCurrentData(17, val);
	}

	public java.lang.String getMemo() {
		return GenericBase.__getString(__current_data[17]);
	}

	public void setOrderProductId(java.lang.Integer val) {
		setCurrentData(18, val);
	}

	public java.lang.Integer getOrderProductId() {
		return GenericBase.__getInt(__current_data[18]);
	}

	public void setConditionDeliveryProductId(String op, java.lang.Integer val) {
		setConditionDeliveryProductId(op, val, CONDITION_AND);
	}

	public void setConditionDeliveryProductId(String op, java.lang.Integer val, String relation) {
		addCondition(0, op, relation, val);
	}

	public void setSelectDeliveryProductId(boolean val) {
		__select_flags[0] = val;
	}

	public void setDeliveryProductIdExpression(String val) {
		__dataExpressions[0] = val;
	}

	public void setConditionDeliveryId(String op, java.lang.Integer val) {
		setConditionDeliveryId(op, val, CONDITION_AND);
	}

	public void setConditionDeliveryId(String op, java.lang.Integer val, String relation) {
		addCondition(1, op, relation, val);
	}

	public void setSelectDeliveryId(boolean val) {
		__select_flags[1] = val;
	}

	public void setDeliveryIdExpression(String val) {
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

	public void setConditionFlagLocked(String op, java.lang.Boolean val) {
		setConditionFlagLocked(op, val, CONDITION_AND);
	}

	public void setConditionFlagLocked(String op, java.lang.Boolean val, String relation) {
		addCondition(8, op, relation, val);
	}

	public void setSelectFlagLocked(boolean val) {
		__select_flags[8] = val;
	}

	public void setFlagLockedExpression(String val) {
		__dataExpressions[8] = val;
	}

	public void setConditionDeliveryName(String op, java.lang.String val) {
		setConditionDeliveryName(op, val, CONDITION_AND);
	}

	public void setConditionDeliveryName(String op, java.lang.String val, String relation) {
		addCondition(9, op, relation, val);
	}

	public void setSelectDeliveryName(boolean val) {
		__select_flags[9] = val;
	}

	public void setDeliveryNameExpression(String val) {
		__dataExpressions[9] = val;
	}

	public void setConditionOrderId(String op, java.lang.Integer val) {
		setConditionOrderId(op, val, CONDITION_AND);
	}

	public void setConditionOrderId(String op, java.lang.Integer val, String relation) {
		addCondition(10, op, relation, val);
	}

	public void setSelectOrderId(boolean val) {
		__select_flags[10] = val;
	}

	public void setOrderIdExpression(String val) {
		__dataExpressions[10] = val;
	}

	public void setConditionQuantityTotalDeliver(String op, java.lang.Integer val) {
		setConditionQuantityTotalDeliver(op, val, CONDITION_AND);
	}

	public void setConditionQuantityTotalDeliver(String op, java.lang.Integer val, String relation) {
		addCondition(11, op, relation, val);
	}

	public void setSelectQuantityTotalDeliver(boolean val) {
		__select_flags[11] = val;
	}

	public void setQuantityTotalDeliverExpression(String val) {
		__dataExpressions[11] = val;
	}

	public void setConditionQuantityDelivered(String op, java.lang.Float val) {
		setConditionQuantityDelivered(op, val, CONDITION_AND);
	}

	public void setConditionQuantityDelivered(String op, java.lang.Float val, String relation) {
		addCondition(12, op, relation, val);
	}

	public void setSelectQuantityDelivered(boolean val) {
		__select_flags[12] = val;
	}

	public void setQuantityDeliveredExpression(String val) {
		__dataExpressions[12] = val;
	}

	public void setConditionFlagSquaredUp(String op, java.lang.Boolean val) {
		setConditionFlagSquaredUp(op, val, CONDITION_AND);
	}

	public void setConditionFlagSquaredUp(String op, java.lang.Boolean val, String relation) {
		addCondition(13, op, relation, val);
	}

	public void setSelectFlagSquaredUp(boolean val) {
		__select_flags[13] = val;
	}

	public void setFlagSquaredUpExpression(String val) {
		__dataExpressions[13] = val;
	}

	public void setConditionContactName(String op, java.lang.String val) {
		setConditionContactName(op, val, CONDITION_AND);
	}

	public void setConditionContactName(String op, java.lang.String val, String relation) {
		addCondition(14, op, relation, val);
	}

	public void setSelectContactName(boolean val) {
		__select_flags[14] = val;
	}

	public void setContactNameExpression(String val) {
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

	public void setConditionDetailedAddressDelivery(String op, java.lang.String val) {
		setConditionDetailedAddressDelivery(op, val, CONDITION_AND);
	}

	public void setConditionDetailedAddressDelivery(String op, java.lang.String val, String relation) {
		addCondition(16, op, relation, val);
	}

	public void setSelectDetailedAddressDelivery(boolean val) {
		__select_flags[16] = val;
	}

	public void setDetailedAddressDeliveryExpression(String val) {
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

	public void setConditionOrderProductId(String op, java.lang.Integer val) {
		setConditionOrderProductId(op, val, CONDITION_AND);
	}

	public void setConditionOrderProductId(String op, java.lang.Integer val, String relation) {
		addCondition(18, op, relation, val);
	}

	public void setSelectOrderProductId(boolean val) {
		__select_flags[18] = val;
	}

	public void setOrderProductIdExpression(String val) {
		__dataExpressions[18] = val;
	}


}

