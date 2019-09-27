package com.login.dummyMainFunction.query;

import com.login.dummyMainFunction.bean.ConditionDummyMainFunction;
import delicacy.common.AbstractQuery;
import delicacy.common.BaseCollection;
import delicacy.common.GenericBase;
import delicacy.common.KeyValuePair;
import delicacy.connection.ThreadConnection;
import fix.db.bean.BaseMainFunction;
import org.apache.log4j.Logger;

public class QueryDummyMainFunction extends AbstractQuery<BaseMainFunction, ConditionDummyMainFunction> {

    private static final Logger __logger = Logger.getLogger(QueryDummyMainFunction.class);

    public QueryDummyMainFunction() throws java.sql.SQLException {
        setParameterNumber(2);
        setConnection(ThreadConnection.getConnection());
        setOrderByFields("mf.function_id");
    }

    @Override
    public BaseCollection<BaseMainFunction> executeQuery(KeyValuePair[] replacements, ConditionDummyMainFunction condition) throws java.sql.SQLException {
        return executeQuery(replacements,
                condition.getUserId(),
                condition.getFunctionType()
        );
    }

    public BaseCollection<BaseMainFunction> execute(KeyValuePair[] replacements, ConditionDummyMainFunction condition) throws java.sql.SQLException {
        return execute(condition, replacements,
                condition.getUserId(),
                condition.getFunctionType()
        );
    }

    @Override
    public BaseMainFunction generateBase(Object[] __data) throws java.sql.SQLException {
        BaseMainFunction __base = new BaseMainFunction();
        int count = 0;
        Object val;
        if ((val = __data[count++]) != null) __base.setFunctionId(GenericBase.__getInt(val));
        if ((val = __data[count++]) != null) __base.setFunctionName(GenericBase.__getString(val));
        if ((val = __data[count++]) != null) __base.setParentId(GenericBase.__getInt(val));
        if ((val = __data[count++]) != null) __base.setFunctionCode(GenericBase.__getString(val));
        if ((val = __data[count++]) != null) __base.setAppliedSystemId(GenericBase.__getInt(val));
        if ((val = __data[count++]) != null) __base.setFunctionType(GenericBase.__getInt(val));
        if ((val = __data[count++]) != null) __base.setPrivilegeType(GenericBase.__getInt(val));
        if ((val = __data[count++]) != null) __base.setFlagEnabled(GenericBase.__getBoolean(val));
        if ((val = __data[count++]) != null) __base.setLeaf(Byte.valueOf(GenericBase.__getString(val)));
        if ((val = __data[count++]) != null) __base.setFlagMobile(GenericBase.__getBoolean(val));
        if ((val = __data[count++]) != null) __base.setIcon(GenericBase.__getString(val));
        if ((val = __data[count++]) != null) __base.setStyleName(GenericBase.__getString(val));
        if ((val = __data[count++]) != null) __base.setClassName(GenericBase.__getString(val));
        if ((val = __data[count++]) != null) __base.setIconColor(GenericBase.__getString(val));
        if ((val = __data[count++]) != null) __base.setMarginTop(GenericBase.__getDecimal(val));
        if ((val = __data[count++]) != null) __base.setMarginBottom(GenericBase.__getDecimal(val));
        if ((val = __data[count++]) != null) __base.setExecuteName(GenericBase.__getString(val));
        if ((val = __data[count++]) != null) __base.setMemo(GenericBase.__getString(val));
        if ((val = __data[count++]) != null) __base.setSeqNo(GenericBase.__getInt(val));
        if ((val = __data[count++]) != null) __base.setOrganizationId(GenericBase.__getInt(val));
        return __base;
    }

    @Override
    public int setStatementParameters(int count, Object... args) throws java.sql.SQLException {

        int index = 0;
        for (int ii = 0; ii < args.length; ii++) {
            if (args[ii] == null) continue;
            index++;
            __logger.info(String.format("%1$s = [%2$s]", fieldNames[ii], args[ii]));
        }
        if (index > 0) __logger.info("=================================================");
        if (args[0] != null) __statement.setInt(count++, GenericBase.__getInt(args[0]));
        if (args[1] != null) __statement.setInt(count++, GenericBase.__getInt(args[1]));
        return count;
    }

    @Override
    public String getSQLText() {
        __logger.info(__SQLText);
        return __SQLText;
    }

    @Override
    public String getOriginalSQLText() {
        return __originalSQL;
    }

    @Override
    public String[] getQueryStringArray() {
        return __queryConditions;
    }

    @Override
    public String getFieldList() {
        return RESULTSETFIELDLIST;
    }

    private final static String __SQLText = "SELECT mf.function_id, function_name, parent_id, function_code, applied_system_id, function_type, privilege_type, flag_enabled, leaf, flag_mobile, icon, style_name, class_name, icon_color, margin_top, margin_bottom, execute_name, memo, seq_no, organization_id FROM (SELECT ur.user_id, rf.function_id FROM role_functions rf LEFT JOIN user_roles ur ON rf.role_id = ur.role_id UNION SELECT urd.user_id, drf.function_id FROM department_role_functions drf LEFT JOIN (SELECT u.user_id, ur2.role_id, u.department_id FROM user_roles ur2 LEFT JOIN users u ON ur2.user_id = u.user_id) urd ON (drf.role_id = urd.role_id AND drf.department_id = urd.department_id) UNION SELECT uf.user_id, uf.function_id FROM user_functions uf) result LEFT JOIN main_functions mf ON result.function_id = mf.function_id WHERE result.user_id = ? and mf.function_type = ? ORDER BY function_code";
    private final static String __originalSQL = "SELECT mf.function_id, function_name, parent_id, function_code, applied_system_id, function_type, privilege_type, flag_enabled, leaf, flag_mobile, icon, style_name, class_name, icon_color, margin_top, margin_bottom, execute_name, memo, seq_no, organization_id FROM (SELECT ur.user_id, rf.function_id FROM role_functions rf LEFT JOIN user_roles ur ON rf.role_id = ur.role_id UNION SELECT urd.user_id, drf.function_id FROM department_role_functions drf LEFT JOIN (SELECT u.user_id, ur2.role_id, u.department_id FROM user_roles ur2 LEFT JOIN users u ON ur2.user_id = u.user_id) urd ON (drf.role_id = urd.role_id AND drf.department_id = urd.department_id) UNION SELECT uf.user_id, uf.function_id FROM user_functions uf) result LEFT JOIN main_functions mf ON result.function_id = mf.function_id WHERE result.user_id = @user_id and mf.function_type = @function_type ORDER BY function_code ";
    private final static String[] __queryConditions = {
            "{\"fullCondition\": \"result.user_id = @user_id and mf.function_type = @function_type\",\"startIndex\": 796,\"stopIndex\":858,\"isor\":false,\"hasVariable\":true,\"hasBracket\":false,\"isVariableFirst\":false,\"topLevel\":true,\"children\": [{\"fullCondition\": \"result.user_id = @user_id\",\"fullFieldName\":\"result.user_id\",\"operationName\":\"=\",\"variableName\":\"userId\",\"startIndex\": 796,\"stopIndex\":820,\"isor\":false,\"hasVariable\":true,\"hasBracket\":false,\"isVariableFirst\":false,\"topLevel\":false,\"children\": []},{\"fullCondition\": \"mf.function_type = @function_type\",\"fullFieldName\":\"mf.function_type\",\"operationName\":\"=\",\"variableName\":\"functionType\",\"startIndex\": 826,\"stopIndex\":858,\"isor\":false,\"hasVariable\":true,\"hasBracket\":false,\"isVariableFirst\":false,\"topLevel\":false,\"children\": []}]}"
    };
    private final static String RESULTSETFIELDLIST = "function_id,function_name,parent_id,function_code,applied_system_id,function_type,privilege_type,flag_enabled,leaf,flag_mobile,icon,style_name,class_name,icon_color,margin_top,margin_bottom,execute_name,memo,seq_no,organization_id";
    private final static String[] fieldNames = {"user_id", "function_type"};
}
