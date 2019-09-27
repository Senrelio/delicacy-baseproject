package fix.db.dao;

import delicacy.common.AbstractTable;
import delicacy.common.GenericBase;
import fix.db.bean.BaseSystemDictionary;


public class SystemDictionary extends AbstractTable<BaseSystemDictionary>
{

	public SystemDictionary() throws java.sql.SQLException 
	{

		initColumnNames();
	}

	protected final void initColumnNames()  throws java.sql.SQLException {

		__columnCount          = 9;

		initTables();

		__tableName            = "system_dictionary";

		__key_columns          = new int[1];
		__key_columns[0] = 0;

		__column_names[0] = BaseSystemDictionary.CS_DICTIONARY_ID;
		__column_names[1] = BaseSystemDictionary.CS_DIC_TYPE_ID;
		__column_names[2] = BaseSystemDictionary.CS_DIC_TYPE_NAME;
		__column_names[3] = BaseSystemDictionary.CS_DIC_TYPE_VALUE_ID;
		__column_names[4] = BaseSystemDictionary.CS_DIC_TYPE_VALUE;
		__column_names[5] = BaseSystemDictionary.CS_DIC_IS_ENABLE;
		__column_names[6] = BaseSystemDictionary.CS_PARENT_ID;
		__column_names[7] = BaseSystemDictionary.CS_MANAGEMENT_TYPE;
		__column_names[8] = BaseSystemDictionary.CS_ORGANIZATION_ID;

		resetSelectFlags() ;
		resetInsertFlags() ;
	}

	public void resetInsertFlags(){
		for(int i = 0; i < __columnCount; i ++ ) __insert_flags[i] = true;
	}

	public void setPrimaryKeyFromBase(BaseSystemDictionary b) {
		clear();
		setDictionaryIdClear(b.getDictionaryId());
	}

	public boolean isPrimaryKeyNull() {
		return getDictionaryId() == null;
	}

	@Override
	public BaseSystemDictionary generateBase(){
		BaseSystemDictionary b = new BaseSystemDictionary();
		setDataToBase(b);
		return b;
	}

	@Override
	public void setDataToBase(BaseSystemDictionary b){
		int count = 0; Object val;
		if((val = __current_data[count++]) != null) b.setDictionaryId(GenericBase.__getInt(val));
		if((val = __current_data[count++]) != null) b.setDicTypeId(GenericBase.__getInt(val));
		if((val = __current_data[count++]) != null) b.setDicTypeName(GenericBase.__getString(val));
		if((val = __current_data[count++]) != null) b.setDicTypeValueId(GenericBase.__getInt(val));
		if((val = __current_data[count++]) != null) b.setDicTypeValue(GenericBase.__getString(val));
		if((val = __current_data[count++]) != null) b.setDicIsEnable(GenericBase.__getByte(val));
		if((val = __current_data[count++]) != null) b.setParentId(GenericBase.__getInt(val));
		if((val = __current_data[count++]) != null) b.setManagementType(GenericBase.__getInt(val));
		if((val = __current_data[count++]) != null) b.setOrganizationId(GenericBase.__getInt(val));
	}

	@Override
	public void setBaseToBuffer(BaseSystemDictionary b, Object[] buff){
		int count = 0;
		buff[count++] = b.getDictionaryId();
		buff[count++] = b.getDicTypeId();
		buff[count++] = b.getDicTypeName();
		buff[count++] = b.getDicTypeValueId();
		buff[count++] = b.getDicTypeValue();
		buff[count++] = b.getDicIsEnable();
		buff[count++] = b.getParentId();
		buff[count++] = b.getManagementType();
		buff[count++] = b.getOrganizationId();
	}

	@Override
	public void setDataFromBase(BaseSystemDictionary b){
		if(b.getDictionaryId() != null) setDictionaryIdClear(b.getDictionaryId());
		if(b.getDicTypeId() != null) setDicTypeId(b.getDicTypeId());
		if(b.getDicTypeName() != null) setDicTypeName(b.getDicTypeName());
		if(b.getDicTypeValueId() != null) setDicTypeValueId(b.getDicTypeValueId());
		if(b.getDicTypeValue() != null) setDicTypeValue(b.getDicTypeValue());
		if(b.getDicIsEnable() != null) setDicIsEnable(b.getDicIsEnable());
		if(b.getParentId() != null) setParentId(b.getParentId());
		if(b.getManagementType() != null) setManagementType(b.getManagementType());
		if(b.getOrganizationId() != null) setOrganizationId(b.getOrganizationId());
	}

	@Override
	public BaseSystemDictionary generateBaseFromResultSet(java.sql.ResultSet sdr)  throws java.sql.SQLException {

		BaseSystemDictionary b = new BaseSystemDictionary();
		setQueryResultToBase(b, sdr);
		return b;
	}

	@Override
	public void setQueryResultToBase(BaseSystemDictionary __base, java.sql.ResultSet sdr ) throws java.sql.SQLException {
		int count = 1, index = 0;
		java.sql.ResultSetMetaData rsmd = sdr.getMetaData();
		int columnCount = rsmd.getColumnCount();
		Object val;
		if(__select_flags[index++] && count <= columnCount && (val = sdr.getObject(count++)) != null) __base.setDictionaryId(GenericBase.__getInt(val));
		if(__select_flags[index++] && count <= columnCount && (val = sdr.getObject(count++)) != null) __base.setDicTypeId(GenericBase.__getInt(val));
		if(__select_flags[index++] && count <= columnCount && (val = sdr.getObject(count++)) != null) __base.setDicTypeName(GenericBase.__getString(val));
		if(__select_flags[index++] && count <= columnCount && (val = sdr.getObject(count++)) != null) __base.setDicTypeValueId(GenericBase.__getInt(val));
		if(__select_flags[index++] && count <= columnCount && (val = sdr.getObject(count++)) != null) __base.setDicTypeValue(GenericBase.__getString(val));
		if(__select_flags[index++] && count <= columnCount && (val = sdr.getObject(count++)) != null) __base.setDicIsEnable(GenericBase.__getByte(val));
		if(__select_flags[index++] && count <= columnCount && (val = sdr.getObject(count++)) != null) __base.setParentId(GenericBase.__getInt(val));
		if(__select_flags[index++] && count <= columnCount && (val = sdr.getObject(count++)) != null) __base.setManagementType(GenericBase.__getInt(val));
		if(__select_flags[index++] && count <= columnCount && (val = sdr.getObject(count++)) != null) __base.setOrganizationId(GenericBase.__getInt(val));
	}

	public void setDictionaryId(java.lang.Integer val) {
		setCurrentData(0, val);
	}

	public java.lang.Integer getDictionaryId() {
		return GenericBase.__getInt(__current_data[0]);
	}

	public void setDictionaryIdClear(java.lang.Integer val) {
		__backup_data[0] = __current_data[0] =  val;
		__modified_flags[0] = false;
	}

	public void setDicTypeId(java.lang.Integer val) {
		setCurrentData(1, val);
	}

	public java.lang.Integer getDicTypeId() {
		return GenericBase.__getInt(__current_data[1]);
	}

	public void setDicTypeName(java.lang.String val) {
		setCurrentData(2, val);
	}

	public java.lang.String getDicTypeName() {
		return GenericBase.__getString(__current_data[2]);
	}

	public void setDicTypeValueId(java.lang.Integer val) {
		setCurrentData(3, val);
	}

	public java.lang.Integer getDicTypeValueId() {
		return GenericBase.__getInt(__current_data[3]);
	}

	public void setDicTypeValue(java.lang.String val) {
		setCurrentData(4, val);
	}

	public java.lang.String getDicTypeValue() {
		return GenericBase.__getString(__current_data[4]);
	}

	public void setDicIsEnable(java.lang.Byte val) {
		setCurrentData(5, val);
	}

	public java.lang.Byte getDicIsEnable() {
		return GenericBase.__getByte(__current_data[5]);
	}

	public void setParentId(java.lang.Integer val) {
		setCurrentData(6, val);
	}

	public java.lang.Integer getParentId() {
		return GenericBase.__getInt(__current_data[6]);
	}

	public void setManagementType(java.lang.Integer val) {
		setCurrentData(7, val);
	}

	public java.lang.Integer getManagementType() {
		return GenericBase.__getInt(__current_data[7]);
	}

	public void setOrganizationId(java.lang.Integer val) {
		setCurrentData(8, val);
	}

	public java.lang.Integer getOrganizationId() {
		return GenericBase.__getInt(__current_data[8]);
	}

	public void setConditionDictionaryId(String op, java.lang.Integer val) {
		setConditionDictionaryId(op, val, CONDITION_AND);
	}

	public void setConditionDictionaryId(String op, java.lang.Integer val, String relation) {
		addCondition(0, op, relation, val);
	}

	public void setSelectDictionaryId(boolean val) {
		__select_flags[0] = val;
	}

	public void setDictionaryIdExpression(String val) {
		__dataExpressions[0] = val;
	}

	public void setConditionDicTypeId(String op, java.lang.Integer val) {
		setConditionDicTypeId(op, val, CONDITION_AND);
	}

	public void setConditionDicTypeId(String op, java.lang.Integer val, String relation) {
		addCondition(1, op, relation, val);
	}

	public void setSelectDicTypeId(boolean val) {
		__select_flags[1] = val;
	}

	public void setDicTypeIdExpression(String val) {
		__dataExpressions[1] = val;
	}

	public void setConditionDicTypeName(String op, java.lang.String val) {
		setConditionDicTypeName(op, val, CONDITION_AND);
	}

	public void setConditionDicTypeName(String op, java.lang.String val, String relation) {
		addCondition(2, op, relation, val);
	}

	public void setSelectDicTypeName(boolean val) {
		__select_flags[2] = val;
	}

	public void setDicTypeNameExpression(String val) {
		__dataExpressions[2] = val;
	}

	public void setConditionDicTypeValueId(String op, java.lang.Integer val) {
		setConditionDicTypeValueId(op, val, CONDITION_AND);
	}

	public void setConditionDicTypeValueId(String op, java.lang.Integer val, String relation) {
		addCondition(3, op, relation, val);
	}

	public void setSelectDicTypeValueId(boolean val) {
		__select_flags[3] = val;
	}

	public void setDicTypeValueIdExpression(String val) {
		__dataExpressions[3] = val;
	}

	public void setConditionDicTypeValue(String op, java.lang.String val) {
		setConditionDicTypeValue(op, val, CONDITION_AND);
	}

	public void setConditionDicTypeValue(String op, java.lang.String val, String relation) {
		addCondition(4, op, relation, val);
	}

	public void setSelectDicTypeValue(boolean val) {
		__select_flags[4] = val;
	}

	public void setDicTypeValueExpression(String val) {
		__dataExpressions[4] = val;
	}

	public void setConditionDicIsEnable(String op, java.lang.Byte val) {
		setConditionDicIsEnable(op, val, CONDITION_AND);
	}

	public void setConditionDicIsEnable(String op, java.lang.Byte val, String relation) {
		addCondition(5, op, relation, val);
	}

	public void setSelectDicIsEnable(boolean val) {
		__select_flags[5] = val;
	}

	public void setDicIsEnableExpression(String val) {
		__dataExpressions[5] = val;
	}

	public void setConditionParentId(String op, java.lang.Integer val) {
		setConditionParentId(op, val, CONDITION_AND);
	}

	public void setConditionParentId(String op, java.lang.Integer val, String relation) {
		addCondition(6, op, relation, val);
	}

	public void setSelectParentId(boolean val) {
		__select_flags[6] = val;
	}

	public void setParentIdExpression(String val) {
		__dataExpressions[6] = val;
	}

	public void setConditionManagementType(String op, java.lang.Integer val) {
		setConditionManagementType(op, val, CONDITION_AND);
	}

	public void setConditionManagementType(String op, java.lang.Integer val, String relation) {
		addCondition(7, op, relation, val);
	}

	public void setSelectManagementType(boolean val) {
		__select_flags[7] = val;
	}

	public void setManagementTypeExpression(String val) {
		__dataExpressions[7] = val;
	}

	public void setConditionOrganizationId(String op, java.lang.Integer val) {
		setConditionOrganizationId(op, val, CONDITION_AND);
	}

	public void setConditionOrganizationId(String op, java.lang.Integer val, String relation) {
		addCondition(8, op, relation, val);
	}

	public void setSelectOrganizationId(boolean val) {
		__select_flags[8] = val;
	}

	public void setOrganizationIdExpression(String val) {
		__dataExpressions[8] = val;
	}


}

