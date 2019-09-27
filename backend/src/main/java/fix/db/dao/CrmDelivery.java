package fix.db.dao;

import delicacy.common.AbstractTable;
import delicacy.common.GenericBase;
import fix.db.bean.BaseCrmDelivery;


public class CrmDelivery extends AbstractTable<BaseCrmDelivery>
{

	public CrmDelivery() throws java.sql.SQLException 
	{

		initColumnNames();
	}

	protected final void initColumnNames()  throws java.sql.SQLException {

		__columnCount          = 14;

		initTables();

		__tableName            = "crm_deliveries";

		__key_columns          = new int[1];
		__key_columns[0] = 0;

		__column_names[0] = BaseCrmDelivery.CS_DELIVERY_ID;
		__column_names[1] = BaseCrmDelivery.CS_DELIVERY_CODE;
		__column_names[2] = BaseCrmDelivery.CS_DELIVERY_NAME;
		__column_names[3] = BaseCrmDelivery.CS_EMPLOYEE_ID_MAINTAINER;
		__column_names[4] = BaseCrmDelivery.CS_DEPARTMENT_ID;
		__column_names[5] = BaseCrmDelivery.CS_EMPLOYEE_ID_CREATED;
		__column_names[6] = BaseCrmDelivery.CS_DATE_CREATED;
		__column_names[7] = BaseCrmDelivery.CS_EMPLOYEE_ID_UPDATED;
		__column_names[8] = BaseCrmDelivery.CS_DATE_UPDATED;
		__column_names[9] = BaseCrmDelivery.CS_STATUS_DELIVERY;
		__column_names[10] = BaseCrmDelivery.CS_FLAG_LOCKED;
		__column_names[11] = BaseCrmDelivery.CS_CUSTOMER_ID;
		__column_names[12] = BaseCrmDelivery.CS_DATE_DELIVERED;
		__column_names[13] = BaseCrmDelivery.CS_MEMO;

		resetSelectFlags() ;
		resetInsertFlags() ;
	}

	public void resetInsertFlags(){
		for(int i = 0; i < __columnCount; i ++ ) __insert_flags[i] = true;
		__insert_flags[0] = false;
		__serial_column = 0;
	}

	public void setPrimaryKeyFromBase(BaseCrmDelivery b) {
		clear();
		setDeliveryIdClear(b.getDeliveryId());
	}

	public boolean isPrimaryKeyNull() {
		return getDeliveryId() == null;
	}

	@Override
	public BaseCrmDelivery generateBase(){
		BaseCrmDelivery b = new BaseCrmDelivery();
		setDataToBase(b);
		return b;
	}

	@Override
	public void setDataToBase(BaseCrmDelivery b){
		int count = 0; Object val;
		if((val = __current_data[count++]) != null) b.setDeliveryId(GenericBase.__getInt(val));
		if((val = __current_data[count++]) != null) b.setDeliveryCode(GenericBase.__getString(val));
		if((val = __current_data[count++]) != null) b.setDeliveryName(GenericBase.__getString(val));
		if((val = __current_data[count++]) != null) b.setEmployeeIdMaintainer(GenericBase.__getString(val));
		if((val = __current_data[count++]) != null) b.setDepartmentId(GenericBase.__getString(val));
		if((val = __current_data[count++]) != null) b.setEmployeeIdCreated(GenericBase.__getString(val));
		if((val = __current_data[count++]) != null) b.setDateCreated(GenericBase.__getDateFromSQL(val));
		if((val = __current_data[count++]) != null) b.setEmployeeIdUpdated(GenericBase.__getString(val));
		if((val = __current_data[count++]) != null) b.setDateUpdated(GenericBase.__getDateFromSQL(val));
		if((val = __current_data[count++]) != null) b.setStatusDelivery(GenericBase.__getInt(val));
		if((val = __current_data[count++]) != null) b.setFlagLocked(GenericBase.__getBoolean(val));
		if((val = __current_data[count++]) != null) b.setCustomerId(GenericBase.__getInt(val));
		if((val = __current_data[count++]) != null) b.setDateDelivered(GenericBase.__getDateFromSQL(val));
		if((val = __current_data[count++]) != null) b.setMemo(GenericBase.__getString(val));
	}

	@Override
	public void setBaseToBuffer(BaseCrmDelivery b, Object[] buff){
		int count = 0;
		buff[count++] = b.getDeliveryId();
		buff[count++] = b.getDeliveryCode();
		buff[count++] = b.getDeliveryName();
		buff[count++] = b.getEmployeeIdMaintainer();
		buff[count++] = b.getDepartmentId();
		buff[count++] = b.getEmployeeIdCreated();
		buff[count++] = generateTimestampFromDate(b.getDateCreated());
		buff[count++] = b.getEmployeeIdUpdated();
		buff[count++] = generateTimestampFromDate(b.getDateUpdated());
		buff[count++] = b.getStatusDelivery();
		buff[count++] = b.getFlagLocked();
		buff[count++] = b.getCustomerId();
		buff[count++] = generateTimestampFromDate(b.getDateDelivered());
		buff[count++] = b.getMemo();
	}

	@Override
	public void setDataFromBase(BaseCrmDelivery b){
		if(b.getDeliveryId() != null) setDeliveryIdClear(b.getDeliveryId());
		if(b.getDeliveryCode() != null) setDeliveryCode(b.getDeliveryCode());
		if(b.getDeliveryName() != null) setDeliveryName(b.getDeliveryName());
		if(b.getEmployeeIdMaintainer() != null) setEmployeeIdMaintainer(b.getEmployeeIdMaintainer());
		if(b.getDepartmentId() != null) setDepartmentId(b.getDepartmentId());
		if(b.getEmployeeIdCreated() != null) setEmployeeIdCreated(b.getEmployeeIdCreated());
		if(b.getDateCreated() != null) setDateCreated(b.getDateCreated());
		if(b.getEmployeeIdUpdated() != null) setEmployeeIdUpdated(b.getEmployeeIdUpdated());
		if(b.getDateUpdated() != null) setDateUpdated(b.getDateUpdated());
		if(b.getStatusDelivery() != null) setStatusDelivery(b.getStatusDelivery());
		if(b.getFlagLocked() != null) setFlagLocked(b.getFlagLocked());
		if(b.getCustomerId() != null) setCustomerId(b.getCustomerId());
		if(b.getDateDelivered() != null) setDateDelivered(b.getDateDelivered());
		if(b.getMemo() != null) setMemo(b.getMemo());
	}

	@Override
	public BaseCrmDelivery generateBaseFromResultSet(java.sql.ResultSet sdr)  throws java.sql.SQLException {

		BaseCrmDelivery b = new BaseCrmDelivery();
		setQueryResultToBase(b, sdr);
		return b;
	}

	@Override
	public void setQueryResultToBase(BaseCrmDelivery __base, java.sql.ResultSet sdr ) throws java.sql.SQLException {
		int count = 1, index = 0;
		java.sql.ResultSetMetaData rsmd = sdr.getMetaData();
		int columnCount = rsmd.getColumnCount();
		Object val;
		if(__select_flags[index++] && count <= columnCount && (val = sdr.getObject(count++)) != null) __base.setDeliveryId(GenericBase.__getInt(val));
		if(__select_flags[index++] && count <= columnCount && (val = sdr.getObject(count++)) != null) __base.setDeliveryCode(GenericBase.__getString(val));
		if(__select_flags[index++] && count <= columnCount && (val = sdr.getObject(count++)) != null) __base.setDeliveryName(GenericBase.__getString(val));
		if(__select_flags[index++] && count <= columnCount && (val = sdr.getObject(count++)) != null) __base.setEmployeeIdMaintainer(GenericBase.__getString(val));
		if(__select_flags[index++] && count <= columnCount && (val = sdr.getObject(count++)) != null) __base.setDepartmentId(GenericBase.__getString(val));
		if(__select_flags[index++] && count <= columnCount && (val = sdr.getObject(count++)) != null) __base.setEmployeeIdCreated(GenericBase.__getString(val));
		if(__select_flags[index++] && count <= columnCount && (val = sdr.getObject(count++)) != null) __base.setDateCreated(GenericBase.__getDateFromSQL(val));
		if(__select_flags[index++] && count <= columnCount && (val = sdr.getObject(count++)) != null) __base.setEmployeeIdUpdated(GenericBase.__getString(val));
		if(__select_flags[index++] && count <= columnCount && (val = sdr.getObject(count++)) != null) __base.setDateUpdated(GenericBase.__getDateFromSQL(val));
		if(__select_flags[index++] && count <= columnCount && (val = sdr.getObject(count++)) != null) __base.setStatusDelivery(GenericBase.__getInt(val));
		if(__select_flags[index++] && count <= columnCount && (val = sdr.getObject(count++)) != null) __base.setFlagLocked(GenericBase.__getBoolean(val));
		if(__select_flags[index++] && count <= columnCount && (val = sdr.getObject(count++)) != null) __base.setCustomerId(GenericBase.__getInt(val));
		if(__select_flags[index++] && count <= columnCount && (val = sdr.getObject(count++)) != null) __base.setDateDelivered(GenericBase.__getDateFromSQL(val));
		if(__select_flags[index++] && count <= columnCount && (val = sdr.getObject(count++)) != null) __base.setMemo(GenericBase.__getString(val));
	}

	public void setDeliveryId(java.lang.Integer val) {
		setCurrentData(0, val);
	}

	public java.lang.Integer getDeliveryId() {
		return GenericBase.__getInt(__current_data[0]);
	}

	public void setDeliveryIdClear(java.lang.Integer val) {
		__backup_data[0] = __current_data[0] =  val;
		__modified_flags[0] = false;
	}

	public void setDeliveryCode(java.lang.String val) {
		setCurrentData(1, val);
	}

	public java.lang.String getDeliveryCode() {
		return GenericBase.__getString(__current_data[1]);
	}

	public void setDeliveryName(java.lang.String val) {
		setCurrentData(2, val);
	}

	public java.lang.String getDeliveryName() {
		return GenericBase.__getString(__current_data[2]);
	}

	public void setEmployeeIdMaintainer(java.lang.String val) {
		setCurrentData(3, val);
	}

	public java.lang.String getEmployeeIdMaintainer() {
		return GenericBase.__getString(__current_data[3]);
	}

	public void setDepartmentId(java.lang.String val) {
		setCurrentData(4, val);
	}

	public java.lang.String getDepartmentId() {
		return GenericBase.__getString(__current_data[4]);
	}

	public void setEmployeeIdCreated(java.lang.String val) {
		setCurrentData(5, val);
	}

	public java.lang.String getEmployeeIdCreated() {
		return GenericBase.__getString(__current_data[5]);
	}

	public void setDateCreated(java.util.Date val) {
		setCurrentData(6, generateTimestampFromDate(val));
	}

	public java.util.Date getDateCreated() {
		return GenericBase.__getDateFromSQL(__current_data[6]);
	}

	public void setEmployeeIdUpdated(java.lang.String val) {
		setCurrentData(7, val);
	}

	public java.lang.String getEmployeeIdUpdated() {
		return GenericBase.__getString(__current_data[7]);
	}

	public void setDateUpdated(java.util.Date val) {
		setCurrentData(8, generateTimestampFromDate(val));
	}

	public java.util.Date getDateUpdated() {
		return GenericBase.__getDateFromSQL(__current_data[8]);
	}

	public void setStatusDelivery(java.lang.Integer val) {
		setCurrentData(9, val);
	}

	public java.lang.Integer getStatusDelivery() {
		return GenericBase.__getInt(__current_data[9]);
	}

	public void setFlagLocked(java.lang.Boolean val) {
		setCurrentData(10, val);
	}

	public java.lang.Boolean getFlagLocked() {
		return GenericBase.__getBoolean(__current_data[10]);
	}

	public void setCustomerId(java.lang.Integer val) {
		setCurrentData(11, val);
	}

	public java.lang.Integer getCustomerId() {
		return GenericBase.__getInt(__current_data[11]);
	}

	public void setDateDelivered(java.util.Date val) {
		setCurrentData(12, generateTimestampFromDate(val));
	}

	public java.util.Date getDateDelivered() {
		return GenericBase.__getDateFromSQL(__current_data[12]);
	}

	public void setMemo(java.lang.String val) {
		setCurrentData(13, val);
	}

	public java.lang.String getMemo() {
		return GenericBase.__getString(__current_data[13]);
	}

	public void setConditionDeliveryId(String op, java.lang.Integer val) {
		setConditionDeliveryId(op, val, CONDITION_AND);
	}

	public void setConditionDeliveryId(String op, java.lang.Integer val, String relation) {
		addCondition(0, op, relation, val);
	}

	public void setSelectDeliveryId(boolean val) {
		__select_flags[0] = val;
	}

	public void setDeliveryIdExpression(String val) {
		__dataExpressions[0] = val;
	}

	public void setConditionDeliveryCode(String op, java.lang.String val) {
		setConditionDeliveryCode(op, val, CONDITION_AND);
	}

	public void setConditionDeliveryCode(String op, java.lang.String val, String relation) {
		addCondition(1, op, relation, val);
	}

	public void setSelectDeliveryCode(boolean val) {
		__select_flags[1] = val;
	}

	public void setDeliveryCodeExpression(String val) {
		__dataExpressions[1] = val;
	}

	public void setConditionDeliveryName(String op, java.lang.String val) {
		setConditionDeliveryName(op, val, CONDITION_AND);
	}

	public void setConditionDeliveryName(String op, java.lang.String val, String relation) {
		addCondition(2, op, relation, val);
	}

	public void setSelectDeliveryName(boolean val) {
		__select_flags[2] = val;
	}

	public void setDeliveryNameExpression(String val) {
		__dataExpressions[2] = val;
	}

	public void setConditionEmployeeIdMaintainer(String op, java.lang.String val) {
		setConditionEmployeeIdMaintainer(op, val, CONDITION_AND);
	}

	public void setConditionEmployeeIdMaintainer(String op, java.lang.String val, String relation) {
		addCondition(3, op, relation, val);
	}

	public void setSelectEmployeeIdMaintainer(boolean val) {
		__select_flags[3] = val;
	}

	public void setEmployeeIdMaintainerExpression(String val) {
		__dataExpressions[3] = val;
	}

	public void setConditionDepartmentId(String op, java.lang.String val) {
		setConditionDepartmentId(op, val, CONDITION_AND);
	}

	public void setConditionDepartmentId(String op, java.lang.String val, String relation) {
		addCondition(4, op, relation, val);
	}

	public void setSelectDepartmentId(boolean val) {
		__select_flags[4] = val;
	}

	public void setDepartmentIdExpression(String val) {
		__dataExpressions[4] = val;
	}

	public void setConditionEmployeeIdCreated(String op, java.lang.String val) {
		setConditionEmployeeIdCreated(op, val, CONDITION_AND);
	}

	public void setConditionEmployeeIdCreated(String op, java.lang.String val, String relation) {
		addCondition(5, op, relation, val);
	}

	public void setSelectEmployeeIdCreated(boolean val) {
		__select_flags[5] = val;
	}

	public void setEmployeeIdCreatedExpression(String val) {
		__dataExpressions[5] = val;
	}

	public void setConditionDateCreated(String op, java.util.Date val) {
		setConditionDateCreated(op, val, CONDITION_AND);
	}

	public void setConditionDateCreated(String op, java.util.Date val, String relation) {
		addCondition(6, op, relation, generateTimestampFromDate(val));
	}

	public void setSelectDateCreated(boolean val) {
		__select_flags[6] = val;
	}

	public void setDateCreatedExpression(String val) {
		__dataExpressions[6] = val;
	}

	public void setConditionEmployeeIdUpdated(String op, java.lang.String val) {
		setConditionEmployeeIdUpdated(op, val, CONDITION_AND);
	}

	public void setConditionEmployeeIdUpdated(String op, java.lang.String val, String relation) {
		addCondition(7, op, relation, val);
	}

	public void setSelectEmployeeIdUpdated(boolean val) {
		__select_flags[7] = val;
	}

	public void setEmployeeIdUpdatedExpression(String val) {
		__dataExpressions[7] = val;
	}

	public void setConditionDateUpdated(String op, java.util.Date val) {
		setConditionDateUpdated(op, val, CONDITION_AND);
	}

	public void setConditionDateUpdated(String op, java.util.Date val, String relation) {
		addCondition(8, op, relation, generateTimestampFromDate(val));
	}

	public void setSelectDateUpdated(boolean val) {
		__select_flags[8] = val;
	}

	public void setDateUpdatedExpression(String val) {
		__dataExpressions[8] = val;
	}

	public void setConditionStatusDelivery(String op, java.lang.Integer val) {
		setConditionStatusDelivery(op, val, CONDITION_AND);
	}

	public void setConditionStatusDelivery(String op, java.lang.Integer val, String relation) {
		addCondition(9, op, relation, val);
	}

	public void setSelectStatusDelivery(boolean val) {
		__select_flags[9] = val;
	}

	public void setStatusDeliveryExpression(String val) {
		__dataExpressions[9] = val;
	}

	public void setConditionFlagLocked(String op, java.lang.Boolean val) {
		setConditionFlagLocked(op, val, CONDITION_AND);
	}

	public void setConditionFlagLocked(String op, java.lang.Boolean val, String relation) {
		addCondition(10, op, relation, val);
	}

	public void setSelectFlagLocked(boolean val) {
		__select_flags[10] = val;
	}

	public void setFlagLockedExpression(String val) {
		__dataExpressions[10] = val;
	}

	public void setConditionCustomerId(String op, java.lang.Integer val) {
		setConditionCustomerId(op, val, CONDITION_AND);
	}

	public void setConditionCustomerId(String op, java.lang.Integer val, String relation) {
		addCondition(11, op, relation, val);
	}

	public void setSelectCustomerId(boolean val) {
		__select_flags[11] = val;
	}

	public void setCustomerIdExpression(String val) {
		__dataExpressions[11] = val;
	}

	public void setConditionDateDelivered(String op, java.util.Date val) {
		setConditionDateDelivered(op, val, CONDITION_AND);
	}

	public void setConditionDateDelivered(String op, java.util.Date val, String relation) {
		addCondition(12, op, relation, generateTimestampFromDate(val));
	}

	public void setSelectDateDelivered(boolean val) {
		__select_flags[12] = val;
	}

	public void setDateDeliveredExpression(String val) {
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

