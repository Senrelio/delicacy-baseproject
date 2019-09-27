package fix.db.dao;

import delicacy.common.AbstractTable;
import delicacy.common.GenericBase;
import fix.db.bean.BaseSysBusinessAttachment;


public class SysBusinessAttachment extends AbstractTable<BaseSysBusinessAttachment>
{

	public SysBusinessAttachment() throws java.sql.SQLException 
	{

		initColumnNames();
	}

	protected final void initColumnNames()  throws java.sql.SQLException {

		__columnCount          = 4;

		initTables();

		__tableName            = "sys_business_attachment";

		__key_columns          = new int[1];
		__key_columns[0] = 0;

		__column_names[0] = BaseSysBusinessAttachment.CS_ID;
		__column_names[1] = BaseSysBusinessAttachment.CS_BUSINESS_TYPE;
		__column_names[2] = BaseSysBusinessAttachment.CS_BUSINESS_ID;
		__column_names[3] = BaseSysBusinessAttachment.CS_ATTACHMENT_ID;

		resetSelectFlags() ;
		resetInsertFlags() ;
	}

	public void resetInsertFlags(){
		for(int i = 0; i < __columnCount; i ++ ) __insert_flags[i] = true;
	}

	public void setPrimaryKeyFromBase(BaseSysBusinessAttachment b) {
		clear();
		setIdClear(b.getId());
	}

	public boolean isPrimaryKeyNull() {
		return getId() == null;
	}

	@Override
	public BaseSysBusinessAttachment generateBase(){
		BaseSysBusinessAttachment b = new BaseSysBusinessAttachment();
		setDataToBase(b);
		return b;
	}

	@Override
	public void setDataToBase(BaseSysBusinessAttachment b){
		int count = 0; Object val;
		if((val = __current_data[count++]) != null) b.setId(GenericBase.__getInt(val));
		if((val = __current_data[count++]) != null) b.setBusinessType(GenericBase.__getString(val));
		if((val = __current_data[count++]) != null) b.setBusinessId(GenericBase.__getInt(val));
		if((val = __current_data[count++]) != null) b.setAttachmentId(GenericBase.__getInt(val));
	}

	@Override
	public void setBaseToBuffer(BaseSysBusinessAttachment b, Object[] buff){
		int count = 0;
		buff[count++] = b.getId();
		buff[count++] = b.getBusinessType();
		buff[count++] = b.getBusinessId();
		buff[count++] = b.getAttachmentId();
	}

	@Override
	public void setDataFromBase(BaseSysBusinessAttachment b){
		if(b.getId() != null) setIdClear(b.getId());
		if(b.getBusinessType() != null) setBusinessType(b.getBusinessType());
		if(b.getBusinessId() != null) setBusinessId(b.getBusinessId());
		if(b.getAttachmentId() != null) setAttachmentId(b.getAttachmentId());
	}

	@Override
	public BaseSysBusinessAttachment generateBaseFromResultSet(java.sql.ResultSet sdr)  throws java.sql.SQLException {

		BaseSysBusinessAttachment b = new BaseSysBusinessAttachment();
		setQueryResultToBase(b, sdr);
		return b;
	}

	@Override
	public void setQueryResultToBase(BaseSysBusinessAttachment __base, java.sql.ResultSet sdr ) throws java.sql.SQLException {
		int count = 1, index = 0;
		java.sql.ResultSetMetaData rsmd = sdr.getMetaData();
		int columnCount = rsmd.getColumnCount();
		Object val;
		if(__select_flags[index++] && count <= columnCount && (val = sdr.getObject(count++)) != null) __base.setId(GenericBase.__getInt(val));
		if(__select_flags[index++] && count <= columnCount && (val = sdr.getObject(count++)) != null) __base.setBusinessType(GenericBase.__getString(val));
		if(__select_flags[index++] && count <= columnCount && (val = sdr.getObject(count++)) != null) __base.setBusinessId(GenericBase.__getInt(val));
		if(__select_flags[index++] && count <= columnCount && (val = sdr.getObject(count++)) != null) __base.setAttachmentId(GenericBase.__getInt(val));
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

	public void setBusinessType(java.lang.String val) {
		setCurrentData(1, val);
	}

	public java.lang.String getBusinessType() {
		return GenericBase.__getString(__current_data[1]);
	}

	public void setBusinessId(java.lang.Integer val) {
		setCurrentData(2, val);
	}

	public java.lang.Integer getBusinessId() {
		return GenericBase.__getInt(__current_data[2]);
	}

	public void setAttachmentId(java.lang.Integer val) {
		setCurrentData(3, val);
	}

	public java.lang.Integer getAttachmentId() {
		return GenericBase.__getInt(__current_data[3]);
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

	public void setConditionBusinessType(String op, java.lang.String val) {
		setConditionBusinessType(op, val, CONDITION_AND);
	}

	public void setConditionBusinessType(String op, java.lang.String val, String relation) {
		addCondition(1, op, relation, val);
	}

	public void setSelectBusinessType(boolean val) {
		__select_flags[1] = val;
	}

	public void setBusinessTypeExpression(String val) {
		__dataExpressions[1] = val;
	}

	public void setConditionBusinessId(String op, java.lang.Integer val) {
		setConditionBusinessId(op, val, CONDITION_AND);
	}

	public void setConditionBusinessId(String op, java.lang.Integer val, String relation) {
		addCondition(2, op, relation, val);
	}

	public void setSelectBusinessId(boolean val) {
		__select_flags[2] = val;
	}

	public void setBusinessIdExpression(String val) {
		__dataExpressions[2] = val;
	}

	public void setConditionAttachmentId(String op, java.lang.Integer val) {
		setConditionAttachmentId(op, val, CONDITION_AND);
	}

	public void setConditionAttachmentId(String op, java.lang.Integer val, String relation) {
		addCondition(3, op, relation, val);
	}

	public void setSelectAttachmentId(boolean val) {
		__select_flags[3] = val;
	}

	public void setAttachmentIdExpression(String val) {
		__dataExpressions[3] = val;
	}


}

