package temptest;

import com.auth0.jwt.JWT;
import com.auth0.jwt.algorithms.Algorithm;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import delicacy.common.JsonParser;
import delicacy.common.MapUtils;

import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;

public class Test001 {
    public static void main(String[] args) throws SQLException, JsonProcessingException {
        Algorithm algorithm = Algorithm.HMAC256("secret");
        String token = JWT.create().withIssuer("auth0").sign(algorithm);
        HashMap<String, String> response = new HashMap<>();
        response.put("token", token);
        response.put("result", String.valueOf(true));
        String json = MapUtils.toJSON(response);
        System.out.println(json);
    }
}
