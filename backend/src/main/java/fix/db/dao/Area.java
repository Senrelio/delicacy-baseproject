package fix.db.dao;

import delicacy.common.AbstractTable;
import delicacy.common.GenericBase;
import fix.db.bean.BaseArea;


public class Area extends AbstractTable<BaseArea>
{

	public Area() throws java.sql.SQLException 
	{

		initColumnNames();
	}

	protected final void initColumnNames()  throws java.sql.SQLException {

		__columnCount          = 16;

		initTables();

		__tableName            = "area";

		__key_columns          = new int[0];

		__column_names[0] = BaseArea.CS_ID;
		__column_names[1] = BaseArea.CS_CODE;
		__column_names[2] = BaseArea.CS_TITLE;
		__column_names[3] = BaseArea.CS_PATH;
		__column_names[4] = BaseArea.CS_STATUS;
		__column_names[5] = BaseArea.CS_PID;
		__column_names[6] = BaseArea.CS_FIRST_WORD;
		__column_names[7] = BaseArea.CS_LEVEL;
		__column_names[8] = BaseArea.CS_IS_TOWN;
		__column_names[9] = BaseArea.CS_REMARK;
		__column_names[10] = BaseArea.CS_EN_MARK;
		__column_names[11] = BaseArea.CS_DEL_FLAG;
		__column_names[12] = BaseArea.CS_CREATE_BY;
		__column_names[13] = BaseArea.CS_CREATE_TIME;
		__column_names[14] = BaseArea.CS_UPDATE_BY;
		__column_names[15] = BaseArea.CS_UPDATE_TIME;

		resetSelectFlags() ;
		resetInsertFlags() ;
	}

	public void resetInsertFlags(){
		for(int i = 0; i < __columnCount; i ++ ) __insert_flags[i] = true;
	}

	public void setPrimaryKeyFromBase(BaseArea b) {
		clear();
	}

	public boolean isPrimaryKeyNull() {
		return true;
	}

	@Override
	public BaseArea generateBase(){
		BaseArea b = new BaseArea();
		setDataToBase(b);
		return b;
	}

	@Override
	public void setDataToBase(BaseArea b){
		int count = 0; Object val;
		if((val = __current_data[count++]) != null) b.setId(GenericBase.__getInt(val));
		if((val = __current_data[count++]) != null) b.setCode(GenericBase.__getString(val));
		if((val = __current_data[count++]) != null) b.setTitle(GenericBase.__getString(val));
		if((val = __current_data[count++]) != null) b.setPath(GenericBase.__getString(val));
		if((val = __current_data[count++]) != null) b.setStatus(GenericBase.__getInt(val));
		if((val = __current_data[count++]) != null) b.setPid(GenericBase.__getInt(val));
		if((val = __current_data[count++]) != null) b.setFirstWord(GenericBase.__getString(val));
		if((val = __current_data[count++]) != null) b.setLevel(GenericBase.__getInt(val));
		if((val = __current_data[count++]) != null) b.setIsTown(GenericBase.__getBoolean(val));
		if((val = __current_data[count++]) != null) b.setRemark(GenericBase.__getString(val));
		if((val = __current_data[count++]) != null) b.setEnMark(GenericBase.__getString(val));
		if((val = __current_data[count++]) != null) b.setDelFlag(GenericBase.__getBoolean(val));
		if((val = __current_data[count++]) != null) b.setCreateBy(GenericBase.__getString(val));
		if((val = __current_data[count++]) != null) b.setCreateTime(GenericBase.__getDateFromSQL(val));
		if((val = __current_data[count++]) != null) b.setUpdateBy(GenericBase.__getString(val));
		if((val = __current_data[count++]) != null) b.setUpdateTime(GenericBase.__getDateFromSQL(val));
	}

	@Override
	public void setBaseToBuffer(BaseArea b, Object[] buff){
		int count = 0;
		buff[count++] = b.getId();
		buff[count++] = b.getCode();
		buff[count++] = b.getTitle();
		buff[count++] = b.getPath();
		buff[count++] = b.getStatus();
		buff[count++] = b.getPid();
		buff[count++] = b.getFirstWord();
		buff[count++] = b.getLevel();
		buff[count++] = b.getIsTown();
		buff[count++] = b.getRemark();
		buff[count++] = b.getEnMark();
		buff[count++] = b.getDelFlag();
		buff[count++] = b.getCreateBy();
		buff[count++] = generateTimestampFromDate(b.getCreateTime());
		buff[count++] = b.getUpdateBy();
		buff[count++] = generateTimestampFromDate(b.getUpdateTime());
	}

	@Override
	public void setDataFromBase(BaseArea b){
		if(b.getId() != null) setId(b.getId());
		if(b.getCode() != null) setCode(b.getCode());
		if(b.getTitle() != null) setTitle(b.getTitle());
		if(b.getPath() != null) setPath(b.getPath());
		if(b.getStatus() != null) setStatus(b.getStatus());
		if(b.getPid() != null) setPid(b.getPid());
		if(b.getFirstWord() != null) setFirstWord(b.getFirstWord());
		if(b.getLevel() != null) setLevel(b.getLevel());
		if(b.getIsTown() != null) setIsTown(b.getIsTown());
		if(b.getRemark() != null) setRemark(b.getRemark());
		if(b.getEnMark() != null) setEnMark(b.getEnMark());
		if(b.getDelFlag() != null) setDelFlag(b.getDelFlag());
		if(b.getCreateBy() != null) setCreateBy(b.getCreateBy());
		if(b.getCreateTime() != null) setCreateTime(b.getCreateTime());
		if(b.getUpdateBy() != null) setUpdateBy(b.getUpdateBy());
		if(b.getUpdateTime() != null) setUpdateTime(b.getUpdateTime());
	}

	@Override
	public BaseArea generateBaseFromResultSet(java.sql.ResultSet sdr)  throws java.sql.SQLException {

		BaseArea b = new BaseArea();
		setQueryResultToBase(b, sdr);
		return b;
	}

	@Override
	public void setQueryResultToBase(BaseArea __base, java.sql.ResultSet sdr ) throws java.sql.SQLException {
		int count = 1, index = 0;
		java.sql.ResultSetMetaData rsmd = sdr.getMetaData();
		int columnCount = rsmd.getColumnCount();
		Object val;
		if(__select_flags[index++] && count <= columnCount && (val = sdr.getObject(count++)) != null) __base.setId(GenericBase.__getInt(val));
		if(__select_flags[index++] && count <= columnCount && (val = sdr.getObject(count++)) != null) __base.setCode(GenericBase.__getString(val));
		if(__select_flags[index++] && count <= columnCount && (val = sdr.getObject(count++)) != null) __base.setTitle(GenericBase.__getString(val));
		if(__select_flags[index++] && count <= columnCount && (val = sdr.getObject(count++)) != null) __base.setPath(GenericBase.__getString(val));
		if(__select_flags[index++] && count <= columnCount && (val = sdr.getObject(count++)) != null) __base.setStatus(GenericBase.__getInt(val));
		if(__select_flags[index++] && count <= columnCount && (val = sdr.getObject(count++)) != null) __base.setPid(GenericBase.__getInt(val));
		if(__select_flags[index++] && count <= columnCount && (val = sdr.getObject(count++)) != null) __base.setFirstWord(GenericBase.__getString(val));
		if(__select_flags[index++] && count <= columnCount && (val = sdr.getObject(count++)) != null) __base.setLevel(GenericBase.__getInt(val));
		if(__select_flags[index++] && count <= columnCount && (val = sdr.getObject(count++)) != null) __base.setIsTown(GenericBase.__getBoolean(val));
		if(__select_flags[index++] && count <= columnCount && (val = sdr.getObject(count++)) != null) __base.setRemark(GenericBase.__getString(val));
		if(__select_flags[index++] && count <= columnCount && (val = sdr.getObject(count++)) != null) __base.setEnMark(GenericBase.__getString(val));
		if(__select_flags[index++] && count <= columnCount && (val = sdr.getObject(count++)) != null) __base.setDelFlag(GenericBase.__getBoolean(val));
		if(__select_flags[index++] && count <= columnCount && (val = sdr.getObject(count++)) != null) __base.setCreateBy(GenericBase.__getString(val));
		if(__select_flags[index++] && count <= columnCount && (val = sdr.getObject(count++)) != null) __base.setCreateTime(GenericBase.__getDateFromSQL(val));
		if(__select_flags[index++] && count <= columnCount && (val = sdr.getObject(count++)) != null) __base.setUpdateBy(GenericBase.__getString(val));
		if(__select_flags[index++] && count <= columnCount && (val = sdr.getObject(count++)) != null) __base.setUpdateTime(GenericBase.__getDateFromSQL(val));
	}

	public void setId(java.lang.Integer val) {
		setCurrentData(0, val);
	}

	public java.lang.Integer getId() {
		return GenericBase.__getInt(__current_data[0]);
	}

	public void setCode(java.lang.String val) {
		setCurrentData(1, val);
	}

	public java.lang.String getCode() {
		return GenericBase.__getString(__current_data[1]);
	}

	public void setTitle(java.lang.String val) {
		setCurrentData(2, val);
	}

	public java.lang.String getTitle() {
		return GenericBase.__getString(__current_data[2]);
	}

	public void setPath(java.lang.String val) {
		setCurrentData(3, val);
	}

	public java.lang.String getPath() {
		return GenericBase.__getString(__current_data[3]);
	}

	public void setStatus(java.lang.Integer val) {
		setCurrentData(4, val);
	}

	public java.lang.Integer getStatus() {
		return GenericBase.__getInt(__current_data[4]);
	}

	public void setPid(java.lang.Integer val) {
		setCurrentData(5, val);
	}

	public java.lang.Integer getPid() {
		return GenericBase.__getInt(__current_data[5]);
	}

	public void setFirstWord(java.lang.String val) {
		setCurrentData(6, val);
	}

	public java.lang.String getFirstWord() {
		return GenericBase.__getString(__current_data[6]);
	}

	public void setLevel(java.lang.Integer val) {
		setCurrentData(7, val);
	}

	public java.lang.Integer getLevel() {
		return GenericBase.__getInt(__current_data[7]);
	}

	public void setIsTown(java.lang.Boolean val) {
		setCurrentData(8, val);
	}

	public java.lang.Boolean getIsTown() {
		return GenericBase.__getBoolean(__current_data[8]);
	}

	public void setRemark(java.lang.String val) {
		setCurrentData(9, val);
	}

	public java.lang.String getRemark() {
		return GenericBase.__getString(__current_data[9]);
	}

	public void setEnMark(java.lang.String val) {
		setCurrentData(10, val);
	}

	public java.lang.String getEnMark() {
		return GenericBase.__getString(__current_data[10]);
	}

	public void setDelFlag(java.lang.Boolean val) {
		setCurrentData(11, val);
	}

	public java.lang.Boolean getDelFlag() {
		return GenericBase.__getBoolean(__current_data[11]);
	}

	public void setCreateBy(java.lang.String val) {
		setCurrentData(12, val);
	}

	public java.lang.String getCreateBy() {
		return GenericBase.__getString(__current_data[12]);
	}

	public void setCreateTime(java.util.Date val) {
		setCurrentData(13, generateTimestampFromDate(val));
	}

	public java.util.Date getCreateTime() {
		return GenericBase.__getDateFromSQL(__current_data[13]);
	}

	public void setUpdateBy(java.lang.String val) {
		setCurrentData(14, val);
	}

	public java.lang.String getUpdateBy() {
		return GenericBase.__getString(__current_data[14]);
	}

	public void setUpdateTime(java.util.Date val) {
		setCurrentData(15, generateTimestampFromDate(val));
	}

	public java.util.Date getUpdateTime() {
		return GenericBase.__getDateFromSQL(__current_data[15]);
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

	public void setConditionCode(String op, java.lang.String val) {
		setConditionCode(op, val, CONDITION_AND);
	}

	public void setConditionCode(String op, java.lang.String val, String relation) {
		addCondition(1, op, relation, val);
	}

	public void setSelectCode(boolean val) {
		__select_flags[1] = val;
	}

	public void setCodeExpression(String val) {
		__dataExpressions[1] = val;
	}

	public void setConditionTitle(String op, java.lang.String val) {
		setConditionTitle(op, val, CONDITION_AND);
	}

	public void setConditionTitle(String op, java.lang.String val, String relation) {
		addCondition(2, op, relation, val);
	}

	public void setSelectTitle(boolean val) {
		__select_flags[2] = val;
	}

	public void setTitleExpression(String val) {
		__dataExpressions[2] = val;
	}

	public void setConditionPath(String op, java.lang.String val) {
		setConditionPath(op, val, CONDITION_AND);
	}

	public void setConditionPath(String op, java.lang.String val, String relation) {
		addCondition(3, op, relation, val);
	}

	public void setSelectPath(boolean val) {
		__select_flags[3] = val;
	}

	public void setPathExpression(String val) {
		__dataExpressions[3] = val;
	}

	public void setConditionStatus(String op, java.lang.Integer val) {
		setConditionStatus(op, val, CONDITION_AND);
	}

	public void setConditionStatus(String op, java.lang.Integer val, String relation) {
		addCondition(4, op, relation, val);
	}

	public void setSelectStatus(boolean val) {
		__select_flags[4] = val;
	}

	public void setStatusExpression(String val) {
		__dataExpressions[4] = val;
	}

	public void setConditionPid(String op, java.lang.Integer val) {
		setConditionPid(op, val, CONDITION_AND);
	}

	public void setConditionPid(String op, java.lang.Integer val, String relation) {
		addCondition(5, op, relation, val);
	}

	public void setSelectPid(boolean val) {
		__select_flags[5] = val;
	}

	public void setPidExpression(String val) {
		__dataExpressions[5] = val;
	}

	public void setConditionFirstWord(String op, java.lang.String val) {
		setConditionFirstWord(op, val, CONDITION_AND);
	}

	public void setConditionFirstWord(String op, java.lang.String val, String relation) {
		addCondition(6, op, relation, val);
	}

	public void setSelectFirstWord(boolean val) {
		__select_flags[6] = val;
	}

	public void setFirstWordExpression(String val) {
		__dataExpressions[6] = val;
	}

	public void setConditionLevel(String op, java.lang.Integer val) {
		setConditionLevel(op, val, CONDITION_AND);
	}

	public void setConditionLevel(String op, java.lang.Integer val, String relation) {
		addCondition(7, op, relation, val);
	}

	public void setSelectLevel(boolean val) {
		__select_flags[7] = val;
	}

	public void setLevelExpression(String val) {
		__dataExpressions[7] = val;
	}

	public void setConditionIsTown(String op, java.lang.Boolean val) {
		setConditionIsTown(op, val, CONDITION_AND);
	}

	public void setConditionIsTown(String op, java.lang.Boolean val, String relation) {
		addCondition(8, op, relation, val);
	}

	public void setSelectIsTown(boolean val) {
		__select_flags[8] = val;
	}

	public void setIsTownExpression(String val) {
		__dataExpressions[8] = val;
	}

	public void setConditionRemark(String op, java.lang.String val) {
		setConditionRemark(op, val, CONDITION_AND);
	}

	public void setConditionRemark(String op, java.lang.String val, String relation) {
		addCondition(9, op, relation, val);
	}

	public void setSelectRemark(boolean val) {
		__select_flags[9] = val;
	}

	public void setRemarkExpression(String val) {
		__dataExpressions[9] = val;
	}

	public void setConditionEnMark(String op, java.lang.String val) {
		setConditionEnMark(op, val, CONDITION_AND);
	}

	public void setConditionEnMark(String op, java.lang.String val, String relation) {
		addCondition(10, op, relation, val);
	}

	public void setSelectEnMark(boolean val) {
		__select_flags[10] = val;
	}

	public void setEnMarkExpression(String val) {
		__dataExpressions[10] = val;
	}

	public void setConditionDelFlag(String op, java.lang.Boolean val) {
		setConditionDelFlag(op, val, CONDITION_AND);
	}

	public void setConditionDelFlag(String op, java.lang.Boolean val, String relation) {
		addCondition(11, op, relation, val);
	}

	public void setSelectDelFlag(boolean val) {
		__select_flags[11] = val;
	}

	public void setDelFlagExpression(String val) {
		__dataExpressions[11] = val;
	}

	public void setConditionCreateBy(String op, java.lang.String val) {
		setConditionCreateBy(op, val, CONDITION_AND);
	}

	public void setConditionCreateBy(String op, java.lang.String val, String relation) {
		addCondition(12, op, relation, val);
	}

	public void setSelectCreateBy(boolean val) {
		__select_flags[12] = val;
	}

	public void setCreateByExpression(String val) {
		__dataExpressions[12] = val;
	}

	public void setConditionCreateTime(String op, java.util.Date val) {
		setConditionCreateTime(op, val, CONDITION_AND);
	}

	public void setConditionCreateTime(String op, java.util.Date val, String relation) {
		addCondition(13, op, relation, generateTimestampFromDate(val));
	}

	public void setSelectCreateTime(boolean val) {
		__select_flags[13] = val;
	}

	public void setCreateTimeExpression(String val) {
		__dataExpressions[13] = val;
	}

	public void setConditionUpdateBy(String op, java.lang.String val) {
		setConditionUpdateBy(op, val, CONDITION_AND);
	}

	public void setConditionUpdateBy(String op, java.lang.String val, String relation) {
		addCondition(14, op, relation, val);
	}

	public void setSelectUpdateBy(boolean val) {
		__select_flags[14] = val;
	}

	public void setUpdateByExpression(String val) {
		__dataExpressions[14] = val;
	}

	public void setConditionUpdateTime(String op, java.util.Date val) {
		setConditionUpdateTime(op, val, CONDITION_AND);
	}

	public void setConditionUpdateTime(String op, java.util.Date val, String relation) {
		addCondition(15, op, relation, generateTimestampFromDate(val));
	}

	public void setSelectUpdateTime(boolean val) {
		__select_flags[15] = val;
	}

	public void setUpdateTimeExpression(String val) {
		__dataExpressions[15] = val;
	}


}

