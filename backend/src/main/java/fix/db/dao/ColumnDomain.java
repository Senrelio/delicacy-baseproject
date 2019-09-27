package fix.db.dao;

import delicacy.common.AbstractTable;
import delicacy.common.GenericBase;
import fix.db.bean.BaseColumnDomain;


public class ColumnDomain extends AbstractTable<BaseColumnDomain>
{

	public ColumnDomain() throws java.sql.SQLException 
	{

		initColumnNames();
	}

	protected final void initColumnNames()  throws java.sql.SQLException {

		__columnCount          = 10;

		initTables();

		__tableName            = "column_domains";

		__key_columns          = new int[0];

		__column_names[0] = BaseColumnDomain.CS_SELECT_ID;
		__column_names[1] = BaseColumnDomain.CS_TABLE_NAME;
		__column_names[2] = BaseColumnDomain.CS_KEY_COLUMN;
		__column_names[3] = BaseColumnDomain.CS_VALUE_COLUMN;
		__column_names[4] = BaseColumnDomain.CS_CONDITION_COLUMN;
		__column_names[5] = BaseColumnDomain.CS_ADDITIONAL_CONDITION;
		__column_names[6] = BaseColumnDomain.CS_LOAD_ON_STARTUP;
		__column_names[7] = BaseColumnDomain.CS_IS_BASIC_DATA;
		__column_names[8] = BaseColumnDomain.CS_APPLICATION_ID;
		__column_names[9] = BaseColumnDomain.CS_ORGANIZATION_ID;

		resetSelectFlags() ;
		resetInsertFlags() ;
	}

	public void resetInsertFlags(){
		for(int i = 0; i < __columnCount; i ++ ) __insert_flags[i] = true;
	}

	public void setPrimaryKeyFromBase(BaseColumnDomain b) {
		clear();
	}

	public boolean isPrimaryKeyNull() {
		return true;
	}

	@Override
	public BaseColumnDomain generateBase(){
		BaseColumnDomain b = new BaseColumnDomain();
		setDataToBase(b);
		return b;
	}

	@Override
	public void setDataToBase(BaseColumnDomain b){
		int count = 0; Object val;
		if((val = __current_data[count++]) != null) b.setSelectId(GenericBase.__getString(val));
		if((val = __current_data[count++]) != null) b.setTableName(GenericBase.__getString(val));
		if((val = __current_data[count++]) != null) b.setKeyColumn(GenericBase.__getString(val));
		if((val = __current_data[count++]) != null) b.setValueColumn(GenericBase.__getString(val));
		if((val = __current_data[count++]) != null) b.setConditionColumn(GenericBase.__getString(val));
		if((val = __current_data[count++]) != null) b.setAdditionalCondition(GenericBase.__getString(val));
		if((val = __current_data[count++]) != null) b.setLoadOnStartup(GenericBase.__getBoolean(val));
		if((val = __current_data[count++]) != null) b.setIsBasicData(GenericBase.__getByte(val));
		if((val = __current_data[count++]) != null) b.setApplicationId(GenericBase.__getInt(val));
		if((val = __current_data[count++]) != null) b.setOrganizationId(GenericBase.__getInt(val));
	}

	@Override
	public void setBaseToBuffer(BaseColumnDomain b, Object[] buff){
		int count = 0;
		buff[count++] = b.getSelectId();
		buff[count++] = b.getTableName();
		buff[count++] = b.getKeyColumn();
		buff[count++] = b.getValueColumn();
		buff[count++] = b.getConditionColumn();
		buff[count++] = b.getAdditionalCondition();
		buff[count++] = b.getLoadOnStartup();
		buff[count++] = b.getIsBasicData();
		buff[count++] = b.getApplicationId();
		buff[count++] = b.getOrganizationId();
	}

	@Override
	public void setDataFromBase(BaseColumnDomain b){
		if(b.getSelectId() != null) setSelectId(b.getSelectId());
		if(b.getTableName() != null) setTableName(b.getTableName());
		if(b.getKeyColumn() != null) setKeyColumn(b.getKeyColumn());
		if(b.getValueColumn() != null) setValueColumn(b.getValueColumn());
		if(b.getConditionColumn() != null) setConditionColumn(b.getConditionColumn());
		if(b.getAdditionalCondition() != null) setAdditionalCondition(b.getAdditionalCondition());
		if(b.getLoadOnStartup() != null) setLoadOnStartup(b.getLoadOnStartup());
		if(b.getIsBasicData() != null) setIsBasicData(b.getIsBasicData());
		if(b.getApplicationId() != null) setApplicationId(b.getApplicationId());
		if(b.getOrganizationId() != null) setOrganizationId(b.getOrganizationId());
	}

	@Override
	public BaseColumnDomain generateBaseFromResultSet(java.sql.ResultSet sdr)  throws java.sql.SQLException {

		BaseColumnDomain b = new BaseColumnDomain();
		setQueryResultToBase(b, sdr);
		return b;
	}

	@Override
	public void setQueryResultToBase(BaseColumnDomain __base, java.sql.ResultSet sdr ) throws java.sql.SQLException {
		int count = 1, index = 0;
		java.sql.ResultSetMetaData rsmd = sdr.getMetaData();
		int columnCount = rsmd.getColumnCount();
		Object val;
		if(__select_flags[index++] && count <= columnCount && (val = sdr.getObject(count++)) != null) __base.setSelectId(GenericBase.__getString(val));
		if(__select_flags[index++] && count <= columnCount && (val = sdr.getObject(count++)) != null) __base.setTableName(GenericBase.__getString(val));
		if(__select_flags[index++] && count <= columnCount && (val = sdr.getObject(count++)) != null) __base.setKeyColumn(GenericBase.__getString(val));
		if(__select_flags[index++] && count <= columnCount && (val = sdr.getObject(count++)) != null) __base.setValueColumn(GenericBase.__getString(val));
		if(__select_flags[index++] && count <= columnCount && (val = sdr.getObject(count++)) != null) __base.setConditionColumn(GenericBase.__getString(val));
		if(__select_flags[index++] && count <= columnCount && (val = sdr.getObject(count++)) != null) __base.setAdditionalCondition(GenericBase.__getString(val));
		if(__select_flags[index++] && count <= columnCount && (val = sdr.getObject(count++)) != null) __base.setLoadOnStartup(GenericBase.__getBoolean(val));
		if(__select_flags[index++] && count <= columnCount && (val = sdr.getObject(count++)) != null) __base.setIsBasicData(GenericBase.__getByte(val));
		if(__select_flags[index++] && count <= columnCount && (val = sdr.getObject(count++)) != null) __base.setApplicationId(GenericBase.__getInt(val));
		if(__select_flags[index++] && count <= columnCount && (val = sdr.getObject(count++)) != null) __base.setOrganizationId(GenericBase.__getInt(val));
	}

	public void setSelectId(java.lang.String val) {
		setCurrentData(0, val);
	}

	public java.lang.String getSelectId() {
		return GenericBase.__getString(__current_data[0]);
	}

	public void setTableName(java.lang.String val) {
		setCurrentData(1, val);
	}

	public java.lang.String getTableName() {
		return GenericBase.__getString(__current_data[1]);
	}

	public void setKeyColumn(java.lang.String val) {
		setCurrentData(2, val);
	}

	public java.lang.String getKeyColumn() {
		return GenericBase.__getString(__current_data[2]);
	}

	public void setValueColumn(java.lang.String val) {
		setCurrentData(3, val);
	}

	public java.lang.String getValueColumn() {
		return GenericBase.__getString(__current_data[3]);
	}

	public void setConditionColumn(java.lang.String val) {
		setCurrentData(4, val);
	}

	public java.lang.String getConditionColumn() {
		return GenericBase.__getString(__current_data[4]);
	}

	public void setAdditionalCondition(java.lang.String val) {
		setCurrentData(5, val);
	}

	public java.lang.String getAdditionalCondition() {
		return GenericBase.__getString(__current_data[5]);
	}

	public void setLoadOnStartup(java.lang.Boolean val) {
		setCurrentData(6, val);
	}

	public java.lang.Boolean getLoadOnStartup() {
		return GenericBase.__getBoolean(__current_data[6]);
	}

	public void setIsBasicData(java.lang.Byte val) {
		setCurrentData(7, val);
	}

	public java.lang.Byte getIsBasicData() {
		return GenericBase.__getByte(__current_data[7]);
	}

	public void setApplicationId(java.lang.Integer val) {
		setCurrentData(8, val);
	}

	public java.lang.Integer getApplicationId() {
		return GenericBase.__getInt(__current_data[8]);
	}

	public void setOrganizationId(java.lang.Integer val) {
		setCurrentData(9, val);
	}

	public java.lang.Integer getOrganizationId() {
		return GenericBase.__getInt(__current_data[9]);
	}

	public void setConditionSelectId(String op, java.lang.String val) {
		setConditionSelectId(op, val, CONDITION_AND);
	}

	public void setConditionSelectId(String op, java.lang.String val, String relation) {
		addCondition(0, op, relation, val);
	}

	public void setSelectSelectId(boolean val) {
		__select_flags[0] = val;
	}

	public void setSelectIdExpression(String val) {
		__dataExpressions[0] = val;
	}

	public void setConditionTableName(String op, java.lang.String val) {
		setConditionTableName(op, val, CONDITION_AND);
	}

	public void setConditionTableName(String op, java.lang.String val, String relation) {
		addCondition(1, op, relation, val);
	}

	public void setSelectTableName(boolean val) {
		__select_flags[1] = val;
	}

	public void setTableNameExpression(String val) {
		__dataExpressions[1] = val;
	}

	public void setConditionKeyColumn(String op, java.lang.String val) {
		setConditionKeyColumn(op, val, CONDITION_AND);
	}

	public void setConditionKeyColumn(String op, java.lang.String val, String relation) {
		addCondition(2, op, relation, val);
	}

	public void setSelectKeyColumn(boolean val) {
		__select_flags[2] = val;
	}

	public void setKeyColumnExpression(String val) {
		__dataExpressions[2] = val;
	}

	public void setConditionValueColumn(String op, java.lang.String val) {
		setConditionValueColumn(op, val, CONDITION_AND);
	}

	public void setConditionValueColumn(String op, java.lang.String val, String relation) {
		addCondition(3, op, relation, val);
	}

	public void setSelectValueColumn(boolean val) {
		__select_flags[3] = val;
	}

	public void setValueColumnExpression(String val) {
		__dataExpressions[3] = val;
	}

	public void setConditionConditionColumn(String op, java.lang.String val) {
		setConditionConditionColumn(op, val, CONDITION_AND);
	}

	public void setConditionConditionColumn(String op, java.lang.String val, String relation) {
		addCondition(4, op, relation, val);
	}

	public void setSelectConditionColumn(boolean val) {
		__select_flags[4] = val;
	}

	public void setConditionColumnExpression(String val) {
		__dataExpressions[4] = val;
	}

	public void setConditionAdditionalCondition(String op, java.lang.String val) {
		setConditionAdditionalCondition(op, val, CONDITION_AND);
	}

	public void setConditionAdditionalCondition(String op, java.lang.String val, String relation) {
		addCondition(5, op, relation, val);
	}

	public void setSelectAdditionalCondition(boolean val) {
		__select_flags[5] = val;
	}

	public void setAdditionalConditionExpression(String val) {
		__dataExpressions[5] = val;
	}

	public void setConditionLoadOnStartup(String op, java.lang.Boolean val) {
		setConditionLoadOnStartup(op, val, CONDITION_AND);
	}

	public void setConditionLoadOnStartup(String op, java.lang.Boolean val, String relation) {
		addCondition(6, op, relation, val);
	}

	public void setSelectLoadOnStartup(boolean val) {
		__select_flags[6] = val;
	}

	public void setLoadOnStartupExpression(String val) {
		__dataExpressions[6] = val;
	}

	public void setConditionIsBasicData(String op, java.lang.Byte val) {
		setConditionIsBasicData(op, val, CONDITION_AND);
	}

	public void setConditionIsBasicData(String op, java.lang.Byte val, String relation) {
		addCondition(7, op, relation, val);
	}

	public void setSelectIsBasicData(boolean val) {
		__select_flags[7] = val;
	}

	public void setIsBasicDataExpression(String val) {
		__dataExpressions[7] = val;
	}

	public void setConditionApplicationId(String op, java.lang.Integer val) {
		setConditionApplicationId(op, val, CONDITION_AND);
	}

	public void setConditionApplicationId(String op, java.lang.Integer val, String relation) {
		addCondition(8, op, relation, val);
	}

	public void setSelectApplicationId(boolean val) {
		__select_flags[8] = val;
	}

	public void setApplicationIdExpression(String val) {
		__dataExpressions[8] = val;
	}

	public void setConditionOrganizationId(String op, java.lang.Integer val) {
		setConditionOrganizationId(op, val, CONDITION_AND);
	}

	public void setConditionOrganizationId(String op, java.lang.Integer val, String relation) {
		addCondition(9, op, relation, val);
	}

	public void setSelectOrganizationId(boolean val) {
		__select_flags[9] = val;
	}

	public void setOrganizationIdExpression(String val) {
		__dataExpressions[9] = val;
	}


}

