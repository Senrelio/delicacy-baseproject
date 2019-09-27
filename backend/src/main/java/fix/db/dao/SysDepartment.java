package fix.db.dao;

import delicacy.common.AbstractTable;
import delicacy.common.GenericBase;
import fix.db.bean.BaseSysDepartment;


public class SysDepartment extends AbstractTable<BaseSysDepartment>
{

	public SysDepartment() throws java.sql.SQLException 
	{

		initColumnNames();
	}

	protected final void initColumnNames()  throws java.sql.SQLException {

		__columnCount          = 14;

		initTables();

		__tableName            = "sys_departments";

		__key_columns          = new int[1];
		__key_columns[0] = 0;

		__column_names[0] = BaseSysDepartment.CS_DEPARTMENT_ID;
		__column_names[1] = BaseSysDepartment.CS_DEPARTMENT_CODE;
		__column_names[2] = BaseSysDepartment.CS_DEPARTMENT_NAME;
		__column_names[3] = BaseSysDepartment.CS_PARENT_DEPARTMENT_ID;
		__column_names[4] = BaseSysDepartment.CS_DEPARTMENT_TYPE;
		__column_names[5] = BaseSysDepartment.CS_DEPARTMENT_SECOND_TYPE;
		__column_names[6] = BaseSysDepartment.CS_ENTITY_TYPE;
		__column_names[7] = BaseSysDepartment.CS_AREA_CODE;
		__column_names[8] = BaseSysDepartment.CS_BUSINESS;
		__column_names[9] = BaseSysDepartment.CS_PRODUCT_LINE;
		__column_names[10] = BaseSysDepartment.CS_DATE_CREATED;
		__column_names[11] = BaseSysDepartment.CS_EMPLOYEE_ID_CREATED;
		__column_names[12] = BaseSysDepartment.CS_DATE_UPDATED;
		__column_names[13] = BaseSysDepartment.CS_EMPLOYEE_ID_UPDATED;

		resetSelectFlags() ;
		resetInsertFlags() ;
	}

	public void resetInsertFlags(){
		for(int i = 0; i < __columnCount; i ++ ) __insert_flags[i] = true;
		__insert_flags[0] = false;
		__serial_column = 0;
	}

	public void setPrimaryKeyFromBase(BaseSysDepartment b) {
		clear();
		setDepartmentIdClear(b.getDepartmentId());
	}

	public boolean isPrimaryKeyNull() {
		return getDepartmentId() == null;
	}

	@Override
	public BaseSysDepartment generateBase(){
		BaseSysDepartment b = new BaseSysDepartment();
		setDataToBase(b);
		return b;
	}

	@Override
	public void setDataToBase(BaseSysDepartment b){
		int count = 0; Object val;
		if((val = __current_data[count++]) != null) b.setDepartmentId(GenericBase.__getInt(val));
		if((val = __current_data[count++]) != null) b.setDepartmentCode(GenericBase.__getString(val));
		if((val = __current_data[count++]) != null) b.setDepartmentName(GenericBase.__getString(val));
		if((val = __current_data[count++]) != null) b.setParentDepartmentId(GenericBase.__getInt(val));
		if((val = __current_data[count++]) != null) b.setDepartmentType(GenericBase.__getByte(val));
		if((val = __current_data[count++]) != null) b.setDepartmentSecondType(GenericBase.__getByte(val));
		if((val = __current_data[count++]) != null) b.setEntityType(GenericBase.__getInt(val));
		if((val = __current_data[count++]) != null) b.setAreaCode(GenericBase.__getString(val));
		if((val = __current_data[count++]) != null) b.setBusiness(GenericBase.__getString(val));
		if((val = __current_data[count++]) != null) b.setProductLine(GenericBase.__getString(val));
		if((val = __current_data[count++]) != null) b.setDateCreated(GenericBase.__getDateFromSQL(val));
		if((val = __current_data[count++]) != null) b.setEmployeeIdCreated(GenericBase.__getInt(val));
		if((val = __current_data[count++]) != null) b.setDateUpdated(GenericBase.__getDateFromSQL(val));
		if((val = __current_data[count++]) != null) b.setEmployeeIdUpdated(GenericBase.__getInt(val));
	}

	@Override
	public void setBaseToBuffer(BaseSysDepartment b, Object[] buff){
		int count = 0;
		buff[count++] = b.getDepartmentId();
		buff[count++] = b.getDepartmentCode();
		buff[count++] = b.getDepartmentName();
		buff[count++] = b.getParentDepartmentId();
		buff[count++] = b.getDepartmentType();
		buff[count++] = b.getDepartmentSecondType();
		buff[count++] = b.getEntityType();
		buff[count++] = b.getAreaCode();
		buff[count++] = b.getBusiness();
		buff[count++] = b.getProductLine();
		buff[count++] = generateTimestampFromDate(b.getDateCreated());
		buff[count++] = b.getEmployeeIdCreated();
		buff[count++] = generateTimestampFromDate(b.getDateUpdated());
		buff[count++] = b.getEmployeeIdUpdated();
	}

	@Override
	public void setDataFromBase(BaseSysDepartment b){
		if(b.getDepartmentId() != null) setDepartmentIdClear(b.getDepartmentId());
		if(b.getDepartmentCode() != null) setDepartmentCode(b.getDepartmentCode());
		if(b.getDepartmentName() != null) setDepartmentName(b.getDepartmentName());
		if(b.getParentDepartmentId() != null) setParentDepartmentId(b.getParentDepartmentId());
		if(b.getDepartmentType() != null) setDepartmentType(b.getDepartmentType());
		if(b.getDepartmentSecondType() != null) setDepartmentSecondType(b.getDepartmentSecondType());
		if(b.getEntityType() != null) setEntityType(b.getEntityType());
		if(b.getAreaCode() != null) setAreaCode(b.getAreaCode());
		if(b.getBusiness() != null) setBusiness(b.getBusiness());
		if(b.getProductLine() != null) setProductLine(b.getProductLine());
		if(b.getDateCreated() != null) setDateCreated(b.getDateCreated());
		if(b.getEmployeeIdCreated() != null) setEmployeeIdCreated(b.getEmployeeIdCreated());
		if(b.getDateUpdated() != null) setDateUpdated(b.getDateUpdated());
		if(b.getEmployeeIdUpdated() != null) setEmployeeIdUpdated(b.getEmployeeIdUpdated());
	}

	@Override
	public BaseSysDepartment generateBaseFromResultSet(java.sql.ResultSet sdr)  throws java.sql.SQLException {

		BaseSysDepartment b = new BaseSysDepartment();
		setQueryResultToBase(b, sdr);
		return b;
	}

	@Override
	public void setQueryResultToBase(BaseSysDepartment __base, java.sql.ResultSet sdr ) throws java.sql.SQLException {
		int count = 1, index = 0;
		java.sql.ResultSetMetaData rsmd = sdr.getMetaData();
		int columnCount = rsmd.getColumnCount();
		Object val;
		if(__select_flags[index++] && count <= columnCount && (val = sdr.getObject(count++)) != null) __base.setDepartmentId(GenericBase.__getInt(val));
		if(__select_flags[index++] && count <= columnCount && (val = sdr.getObject(count++)) != null) __base.setDepartmentCode(GenericBase.__getString(val));
		if(__select_flags[index++] && count <= columnCount && (val = sdr.getObject(count++)) != null) __base.setDepartmentName(GenericBase.__getString(val));
		if(__select_flags[index++] && count <= columnCount && (val = sdr.getObject(count++)) != null) __base.setParentDepartmentId(GenericBase.__getInt(val));
		if(__select_flags[index++] && count <= columnCount && (val = sdr.getObject(count++)) != null) __base.setDepartmentType(GenericBase.__getByte(val));
		if(__select_flags[index++] && count <= columnCount && (val = sdr.getObject(count++)) != null) __base.setDepartmentSecondType(GenericBase.__getByte(val));
		if(__select_flags[index++] && count <= columnCount && (val = sdr.getObject(count++)) != null) __base.setEntityType(GenericBase.__getInt(val));
		if(__select_flags[index++] && count <= columnCount && (val = sdr.getObject(count++)) != null) __base.setAreaCode(GenericBase.__getString(val));
		if(__select_flags[index++] && count <= columnCount && (val = sdr.getObject(count++)) != null) __base.setBusiness(GenericBase.__getString(val));
		if(__select_flags[index++] && count <= columnCount && (val = sdr.getObject(count++)) != null) __base.setProductLine(GenericBase.__getString(val));
		if(__select_flags[index++] && count <= columnCount && (val = sdr.getObject(count++)) != null) __base.setDateCreated(GenericBase.__getDateFromSQL(val));
		if(__select_flags[index++] && count <= columnCount && (val = sdr.getObject(count++)) != null) __base.setEmployeeIdCreated(GenericBase.__getInt(val));
		if(__select_flags[index++] && count <= columnCount && (val = sdr.getObject(count++)) != null) __base.setDateUpdated(GenericBase.__getDateFromSQL(val));
		if(__select_flags[index++] && count <= columnCount && (val = sdr.getObject(count++)) != null) __base.setEmployeeIdUpdated(GenericBase.__getInt(val));
	}

	public void setDepartmentId(java.lang.Integer val) {
		setCurrentData(0, val);
	}

	public java.lang.Integer getDepartmentId() {
		return GenericBase.__getInt(__current_data[0]);
	}

	public void setDepartmentIdClear(java.lang.Integer val) {
		__backup_data[0] = __current_data[0] =  val;
		__modified_flags[0] = false;
	}

	public void setDepartmentCode(java.lang.String val) {
		setCurrentData(1, val);
	}

	public java.lang.String getDepartmentCode() {
		return GenericBase.__getString(__current_data[1]);
	}

	public void setDepartmentName(java.lang.String val) {
		setCurrentData(2, val);
	}

	public java.lang.String getDepartmentName() {
		return GenericBase.__getString(__current_data[2]);
	}

	public void setParentDepartmentId(java.lang.Integer val) {
		setCurrentData(3, val);
	}

	public java.lang.Integer getParentDepartmentId() {
		return GenericBase.__getInt(__current_data[3]);
	}

	public void setDepartmentType(java.lang.Byte val) {
		setCurrentData(4, val);
	}

	public java.lang.Byte getDepartmentType() {
		return GenericBase.__getByte(__current_data[4]);
	}

	public void setDepartmentSecondType(java.lang.Byte val) {
		setCurrentData(5, val);
	}

	public java.lang.Byte getDepartmentSecondType() {
		return GenericBase.__getByte(__current_data[5]);
	}

	public void setEntityType(java.lang.Integer val) {
		setCurrentData(6, val);
	}

	public java.lang.Integer getEntityType() {
		return GenericBase.__getInt(__current_data[6]);
	}

	public void setAreaCode(java.lang.String val) {
		setCurrentData(7, val);
	}

	public java.lang.String getAreaCode() {
		return GenericBase.__getString(__current_data[7]);
	}

	public void setBusiness(java.lang.String val) {
		setCurrentData(8, val);
	}

	public java.lang.String getBusiness() {
		return GenericBase.__getString(__current_data[8]);
	}

	public void setProductLine(java.lang.String val) {
		setCurrentData(9, val);
	}

	public java.lang.String getProductLine() {
		return GenericBase.__getString(__current_data[9]);
	}

	public void setDateCreated(java.util.Date val) {
		setCurrentData(10, generateTimestampFromDate(val));
	}

	public java.util.Date getDateCreated() {
		return GenericBase.__getDateFromSQL(__current_data[10]);
	}

	public void setEmployeeIdCreated(java.lang.Integer val) {
		setCurrentData(11, val);
	}

	public java.lang.Integer getEmployeeIdCreated() {
		return GenericBase.__getInt(__current_data[11]);
	}

	public void setDateUpdated(java.util.Date val) {
		setCurrentData(12, generateTimestampFromDate(val));
	}

	public java.util.Date getDateUpdated() {
		return GenericBase.__getDateFromSQL(__current_data[12]);
	}

	public void setEmployeeIdUpdated(java.lang.Integer val) {
		setCurrentData(13, val);
	}

	public java.lang.Integer getEmployeeIdUpdated() {
		return GenericBase.__getInt(__current_data[13]);
	}

	public void setConditionDepartmentId(String op, java.lang.Integer val) {
		setConditionDepartmentId(op, val, CONDITION_AND);
	}

	public void setConditionDepartmentId(String op, java.lang.Integer val, String relation) {
		addCondition(0, op, relation, val);
	}

	public void setSelectDepartmentId(boolean val) {
		__select_flags[0] = val;
	}

	public void setDepartmentIdExpression(String val) {
		__dataExpressions[0] = val;
	}

	public void setConditionDepartmentCode(String op, java.lang.String val) {
		setConditionDepartmentCode(op, val, CONDITION_AND);
	}

	public void setConditionDepartmentCode(String op, java.lang.String val, String relation) {
		addCondition(1, op, relation, val);
	}

	public void setSelectDepartmentCode(boolean val) {
		__select_flags[1] = val;
	}

	public void setDepartmentCodeExpression(String val) {
		__dataExpressions[1] = val;
	}

	public void setConditionDepartmentName(String op, java.lang.String val) {
		setConditionDepartmentName(op, val, CONDITION_AND);
	}

	public void setConditionDepartmentName(String op, java.lang.String val, String relation) {
		addCondition(2, op, relation, val);
	}

	public void setSelectDepartmentName(boolean val) {
		__select_flags[2] = val;
	}

	public void setDepartmentNameExpression(String val) {
		__dataExpressions[2] = val;
	}

	public void setConditionParentDepartmentId(String op, java.lang.Integer val) {
		setConditionParentDepartmentId(op, val, CONDITION_AND);
	}

	public void setConditionParentDepartmentId(String op, java.lang.Integer val, String relation) {
		addCondition(3, op, relation, val);
	}

	public void setSelectParentDepartmentId(boolean val) {
		__select_flags[3] = val;
	}

	public void setParentDepartmentIdExpression(String val) {
		__dataExpressions[3] = val;
	}

	public void setConditionDepartmentType(String op, java.lang.Byte val) {
		setConditionDepartmentType(op, val, CONDITION_AND);
	}

	public void setConditionDepartmentType(String op, java.lang.Byte val, String relation) {
		addCondition(4, op, relation, val);
	}

	public void setSelectDepartmentType(boolean val) {
		__select_flags[4] = val;
	}

	public void setDepartmentTypeExpression(String val) {
		__dataExpressions[4] = val;
	}

	public void setConditionDepartmentSecondType(String op, java.lang.Byte val) {
		setConditionDepartmentSecondType(op, val, CONDITION_AND);
	}

	public void setConditionDepartmentSecondType(String op, java.lang.Byte val, String relation) {
		addCondition(5, op, relation, val);
	}

	public void setSelectDepartmentSecondType(boolean val) {
		__select_flags[5] = val;
	}

	public void setDepartmentSecondTypeExpression(String val) {
		__dataExpressions[5] = val;
	}

	public void setConditionEntityType(String op, java.lang.Integer val) {
		setConditionEntityType(op, val, CONDITION_AND);
	}

	public void setConditionEntityType(String op, java.lang.Integer val, String relation) {
		addCondition(6, op, relation, val);
	}

	public void setSelectEntityType(boolean val) {
		__select_flags[6] = val;
	}

	public void setEntityTypeExpression(String val) {
		__dataExpressions[6] = val;
	}

	public void setConditionAreaCode(String op, java.lang.String val) {
		setConditionAreaCode(op, val, CONDITION_AND);
	}

	public void setConditionAreaCode(String op, java.lang.String val, String relation) {
		addCondition(7, op, relation, val);
	}

	public void setSelectAreaCode(boolean val) {
		__select_flags[7] = val;
	}

	public void setAreaCodeExpression(String val) {
		__dataExpressions[7] = val;
	}

	public void setConditionBusiness(String op, java.lang.String val) {
		setConditionBusiness(op, val, CONDITION_AND);
	}

	public void setConditionBusiness(String op, java.lang.String val, String relation) {
		addCondition(8, op, relation, val);
	}

	public void setSelectBusiness(boolean val) {
		__select_flags[8] = val;
	}

	public void setBusinessExpression(String val) {
		__dataExpressions[8] = val;
	}

	public void setConditionProductLine(String op, java.lang.String val) {
		setConditionProductLine(op, val, CONDITION_AND);
	}

	public void setConditionProductLine(String op, java.lang.String val, String relation) {
		addCondition(9, op, relation, val);
	}

	public void setSelectProductLine(boolean val) {
		__select_flags[9] = val;
	}

	public void setProductLineExpression(String val) {
		__dataExpressions[9] = val;
	}

	public void setConditionDateCreated(String op, java.util.Date val) {
		setConditionDateCreated(op, val, CONDITION_AND);
	}

	public void setConditionDateCreated(String op, java.util.Date val, String relation) {
		addCondition(10, op, relation, generateTimestampFromDate(val));
	}

	public void setSelectDateCreated(boolean val) {
		__select_flags[10] = val;
	}

	public void setDateCreatedExpression(String val) {
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


}

