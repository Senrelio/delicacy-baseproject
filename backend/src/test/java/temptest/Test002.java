package temptest;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;
import delicacy.common.JsonParser;
import fix.db.bean.BaseSysEmployee;
import fix.db.dao.CrmContact;
import fix.db.dao.SysEmployee;
import fix.db.handler.SysEmployeeHandler;

import java.sql.SQLException;
import java.util.Map;

public class Test002 {
    public static void main(String[] args) throws SQLException, JsonProcessingException {
        String s = "{\"email\":\"root\",\"passwordsShow\":\"\",\"passwordsHide\":\"root\"}";
        ObjectMapper mapper = new ObjectMapper();
    }

}