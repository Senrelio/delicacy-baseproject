package com.login.logincheck;

import com.fasterxml.jackson.databind.ObjectMapper;
import delicacy.common.GenericProcessor;
import fix.db.bean.BaseSysEmployee;
import fix.db.dao.SysEmployee;
import fix.db.handler.SysEmployeeHandler;

import javax.servlet.http.HttpServletRequest;
import java.util.Map;

public class LoginCheck2 implements GenericProcessor {
    @Override
    public String execute(String s, HttpServletRequest httpServletRequest) throws Exception {
        BaseSysEmployee bean = new BaseSysEmployee();
        ObjectMapper mapper = new ObjectMapper();
        Map content = mapper.readValue(s, Map.class);
        bean.setPersonalEmail((String) content.get("email"));
        bean.setEmployeeCode((String) content.get("passwordsHide"));
        SysEmployee dao = new SysEmployee();
        SysEmployeeHandler.setConditions(bean, dao);
        Boolean result = dao.conditionalLoad().size() > 0;
        return  result.toString();
    }
}
