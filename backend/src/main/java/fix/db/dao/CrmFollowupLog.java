package fix.db.dao;

import delicacy.common.AbstractTable;
import delicacy.common.GenericBase;
import fix.db.bean.BaseCrmFollowupLog;


public class CrmFollowupLog extends AbstractTable<BaseCrmFollowupLog>
{

	public CrmFollowupLog() throws java.sql.SQLException 
	{

		initColumnNames();
	}

	protected final void initColumnNames()  throws java.sql.SQLException {

		__columnCount          = 5;

		initTables();

		__tableName            = "crm_followup_log";

		__key_columns          = new int[1];
		__key_columns[0] = 0;

		__column_names[0] = BaseCrmFollowupLog.CS_ID;
		__column_names[1] = BaseCrmFollowupLog.CS_EMPLOYEES_ID;
		__column_names[2] = BaseCrmFollowupLog.CS_SOURCE_TABLE;
		__column_names[3] = BaseCrmFollowupLog.CS_SOURCE_ID;
		__column_names[4] = BaseCrmFollowupLog.CS_OPERATE;

		resetSelectFlags() ;
		resetInsertFlags() ;
	}

	public void resetInsertFlags(){
		for(int i = 0; i < __columnCount; i ++ ) __insert_flags[i] = true;
		__insert_flags[0] = false;
		__serial_column = 0;
	}

	public void setPrimaryKeyFromBase(BaseCrmFollowupLog b) {
		clear();
		setIdClear(b.getId());
	}

	public boolean isPrimaryKeyNull() {
		return getId() == null;
	}

	@Override
	public BaseCrmFollowupLog generateBase(){
		BaseCrmFollowupLog b = new BaseCrmFollowupLog();
		setDataToBase(b);
		return b;
	}

	@Override
	public void setDataToBase(BaseCrmFollowupLog b){
		int count = 0; Object val;
		if((val = __current_data[count++]) != null) b.setId(GenericBase.__getInt(val));
		if((val = __current_data[count++]) != null) b.setEmployeesId(GenericBase.__getInt(val));
		if((val = __current_data[count++]) != null) b.setSourceTable(GenericBase.__getString(val));
		if((val = __current_data[count++]) != null) b.setSourceId(GenericBase.__getInt(val));
		if((val = __current_data[count++]) != null) b.setOperate(GenericBase.__getString(val));
	}

	@Override
	public void setBaseToBuffer(BaseCrmFollowupLog b, Object[] buff){
		int count = 0;
		buff[count++] = b.getId();
		buff[count++] = b.getEmployeesId();
		buff[count++] = b.getSourceTable();
		buff[count++] = b.getSourceId();
		buff[count++] = b.getOperate();
	}

	@Override
	public void setDataFromBase(BaseCrmFollowupLog b){
		if(b.getId() != null) setIdClear(b.getId());
		if(b.getEmployeesId() != null) setEmployeesId(b.getEmployeesId());
		if(b.getSourceTable() != null) setSourceTable(b.getSourceTable());
		if(b.getSourceId() != null) setSourceId(b.getSourceId());
		if(b.getOperate() != null) setOperate(b.getOperate());
	}

	@Override
	public BaseCrmFollowupLog generateBaseFromResultSet(java.sql.ResultSet sdr)  throws java.sql.SQLException {

		BaseCrmFollowupLog b = new BaseCrmFollowupLog();
		setQueryResultToBase(b, sdr);
		return b;
	}

	@Override
	public void setQueryResultToBase(BaseCrmFollowupLog __base, java.sql.ResultSet sdr ) throws java.sql.SQLException {
		int count = 1, index = 0;
		java.sql.ResultSetMetaData rsmd = sdr.getMetaData();
		int columnCount = rsmd.getColumnCount();
		Object val;
		if(__select_flags[index++] && count <= columnCount && (val = sdr.getObject(count++)) != null) __base.setId(GenericBase.__getInt(val));
		if(__select_flags[index++] && count <= columnCount && (val = sdr.getObject(count++)) != null) __base.setEmployeesId(GenericBase.__getInt(val));
		if(__select_flags[index++] && count <= columnCount && (val = sdr.getObject(count++)) != null) __base.setSourceTable(GenericBase.__getString(val));
		if(__select_flags[index++] && count <= columnCount && (val = sdr.getObject(count++)) != null) __base.setSourceId(GenericBase.__getInt(val));
		if(__select_flags[index++] && count <= columnCount && (val = sdr.getObject(count++)) != null) __base.setOperate(GenericBase.__getString(val));
	}

	public void setId(java.lang.Integer val) {
		setCurrentData(0, val);
	}

	public java.lang.Integer getId() {
		return GenericBase.__getInt(__current_data[0]);
	}

	public void setIdClear(java.lang.Integer val) {
		__backup_data[0] = __current_data[0] =  val;
		__modified_flags[0] = false;
	}

	public void setEmployeesId(java.lang.Integer val) {
		setCurrentData(1, val);
	}

	public java.lang.Integer getEmployeesId() {
		return GenericBase.__getInt(__current_data[1]);
	}

	public void setSourceTable(java.lang.String val) {
		setCurrentData(2, val);
	}

	public java.lang.String getSourceTable() {
		return GenericBase.__getString(__current_data[2]);
	}

	public void setSourceId(java.lang.Integer val) {
		setCurrentData(3, val);
	}

	public java.lang.Integer getSourceId() {
		return GenericBase.__getInt(__current_data[3]);
	}

	public void setOperate(java.lang.String val) {
		setCurrentData(4, val);
	}

	public java.lang.String getOperate() {
		return GenericBase.__getString(__current_data[4]);
	}

	public void setConditionId(String op, java.lang.Integer val) {
		setConditionId(op, val, CONDITION_AND);
	}

	public void setConditionId(String op, java.lang.Integer val, String relation) {
		addCondition(0, op, relation, val);
	}

	public void setSelectId(boolean val) {
		__select_flags[0] = val;
	}

	public void setIdExpression(String val) {
		__dataExpressions[0] = val;
	}

	public void setConditionEmployeesId(String op, java.lang.Integer val) {
		setConditionEmployeesId(op, val, CONDITION_AND);
	}

	public void setConditionEmployeesId(String op, java.lang.Integer val, String relation) {
		addCondition(1, op, relation, val);
	}

	public void setSelectEmployeesId(boolean val) {
		__select_flags[1] = val;
	}

	public void setEmployeesIdExpression(String val) {
		__dataExpressions[1] = val;
	}

	public void setConditionSourceTable(String op, java.lang.String val) {
		setConditionSourceTable(op, val, CONDITION_AND);
	}

	public void setConditionSourceTable(String op, java.lang.String val, String relation) {
		addCondition(2, op, relation, val);
	}

	public void setSelectSourceTable(boolean val) {
		__select_flags[2] = val;
	}

	public void setSourceTableExpression(String val) {
		__dataExpressions[2] = val;
	}

	public void setConditionSourceId(String op, java.lang.Integer val) {
		setConditionSourceId(op, val, CONDITION_AND);
	}

	public void setConditionSourceId(String op, java.lang.Integer val, String relation) {
		addCondition(3, op, relation, val);
	}

	public void setSelectSourceId(boolean val) {
		__select_flags[3] = val;
	}

	public void setSourceIdExpression(String val) {
		__dataExpressions[3] = val;
	}

	public void setConditionOperate(String op, java.lang.String val) {
		setConditionOperate(op, val, CONDITION_AND);
	}

	public void setConditionOperate(String op, java.lang.String val, String relation) {
		addCondition(4, op, relation, val);
	}

	public void setSelectOperate(boolean val) {
		__select_flags[4] = val;
	}

	public void setOperateExpression(String val) {
		__dataExpressions[4] = val;
	}


}

