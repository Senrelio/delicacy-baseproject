package com.login.logincheck;

import com.auth0.jwt.JWT;
import com.auth0.jwt.algorithms.Algorithm;
import delicacy.common.GenericProcessor;
import delicacy.common.JsonParser;
import delicacy.common.MapUtils;
import fix.db.bean.BaseSysEmployee;
import fix.db.dao.SysEmployee;
import fix.db.handler.SysEmployeeHandler;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;

public class LoginCheck implements GenericProcessor {
    @Override
    public String execute(String s, HttpServletRequest httpServletRequest) throws Exception {
        HashMap content = (HashMap) JsonParser.parse(s);
        BaseSysEmployee bean = new BaseSysEmployee();
        bean.setPersonalEmail((String) content.get("email"));
        bean.setEmployeeCode((String) content.get("passwordsHide"));
        SysEmployee dao = new SysEmployee();
        SysEmployeeHandler.setConditions(bean, dao);
        Boolean result = dao.conditionalLoad().size() == 1;
        if (result) {
            Algorithm algorithm = Algorithm.HMAC256("secret");
            String token = JWT.create().withIssuer("auth0").sign(algorithm);
            HashMap<String, String> response = new HashMap<>();
            response.put("token", token);
            response.put("result", String.valueOf(result));
            String json = MapUtils.toJSON(response);
            return json;
        }
        return String.valueOf(result);
    }
}
