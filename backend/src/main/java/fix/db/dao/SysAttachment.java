package fix.db.dao;

import delicacy.common.AbstractTable;
import delicacy.common.GenericBase;
import fix.db.bean.BaseSysAttachment;


public class SysAttachment extends AbstractTable<BaseSysAttachment>
{

	public SysAttachment() throws java.sql.SQLException 
	{

		initColumnNames();
	}

	protected final void initColumnNames()  throws java.sql.SQLException {

		__columnCount          = 3;

		initTables();

		__tableName            = "sys_attachment";

		__key_columns          = new int[0];

		__column_names[0] = BaseSysAttachment.CS_ID;
		__column_names[1] = BaseSysAttachment.CS_URI;
		__column_names[2] = BaseSysAttachment.CS_CREATE_TIME;

		resetSelectFlags() ;
		resetInsertFlags() ;
	}

	public void resetInsertFlags(){
		for(int i = 0; i < __columnCount; i ++ ) __insert_flags[i] = true;
	}

	public void setPrimaryKeyFromBase(BaseSysAttachment b) {
		clear();
	}

	public boolean isPrimaryKeyNull() {
		return true;
	}

	@Override
	public BaseSysAttachment generateBase(){
		BaseSysAttachment b = new BaseSysAttachment();
		setDataToBase(b);
		return b;
	}

	@Override
	public void setDataToBase(BaseSysAttachment b){
		int count = 0; Object val;
		if((val = __current_data[count++]) != null) b.setId(GenericBase.__getInt(val));
		if((val = __current_data[count++]) != null) b.setUri(GenericBase.__getString(val));
		if((val = __current_data[count++]) != null) b.setCreateTime(GenericBase.__getString(val));
	}

	@Override
	public void setBaseToBuffer(BaseSysAttachment b, Object[] buff){
		int count = 0;
		buff[count++] = b.getId();
		buff[count++] = b.getUri();
		buff[count++] = b.getCreateTime();
	}

	@Override
	public void setDataFromBase(BaseSysAttachment b){
		if(b.getId() != null) setId(b.getId());
		if(b.getUri() != null) setUri(b.getUri());
		if(b.getCreateTime() != null) setCreateTime(b.getCreateTime());
	}

	@Override
	public BaseSysAttachment generateBaseFromResultSet(java.sql.ResultSet sdr)  throws java.sql.SQLException {

		BaseSysAttachment b = new BaseSysAttachment();
		setQueryResultToBase(b, sdr);
		return b;
	}

	@Override
	public void setQueryResultToBase(BaseSysAttachment __base, java.sql.ResultSet sdr ) throws java.sql.SQLException {
		int count = 1, index = 0;
		java.sql.ResultSetMetaData rsmd = sdr.getMetaData();
		int columnCount = rsmd.getColumnCount();
		Object val;
		if(__select_flags[index++] && count <= columnCount && (val = sdr.getObject(count++)) != null) __base.setId(GenericBase.__getInt(val));
		if(__select_flags[index++] && count <= columnCount && (val = sdr.getObject(count++)) != null) __base.setUri(GenericBase.__getString(val));
		if(__select_flags[index++] && count <= columnCount && (val = sdr.getObject(count++)) != null) __base.setCreateTime(GenericBase.__getString(val));
	}

	public void setId(java.lang.Integer val) {
		setCurrentData(0, val);
	}

	public java.lang.Integer getId() {
		return GenericBase.__getInt(__current_data[0]);
	}

	public void setUri(java.lang.String val) {
		setCurrentData(1, val);
	}

	public java.lang.String getUri() {
		return GenericBase.__getString(__current_data[1]);
	}

	public void setCreateTime(java.lang.String val) {
		setCurrentData(2, val);
	}

	public java.lang.String getCreateTime() {
		return GenericBase.__getString(__current_data[2]);
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

	public void setConditionUri(String op, java.lang.String val) {
		setConditionUri(op, val, CONDITION_AND);
	}

	public void setConditionUri(String op, java.lang.String val, String relation) {
		addCondition(1, op, relation, val);
	}

	public void setSelectUri(boolean val) {
		__select_flags[1] = val;
	}

	public void setUriExpression(String val) {
		__dataExpressions[1] = val;
	}

	public void setConditionCreateTime(String op, java.lang.String val) {
		setConditionCreateTime(op, val, CONDITION_AND);
	}

	public void setConditionCreateTime(String op, java.lang.String val, String relation) {
		addCondition(2, op, relation, val);
	}

	public void setSelectCreateTime(boolean val) {
		__select_flags[2] = val;
	}

	public void setCreateTimeExpression(String val) {
		__dataExpressions[2] = val;
	}


}

