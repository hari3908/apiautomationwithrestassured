package restapitest;

import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;
import restUtils.RestUtils;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import static org.hamcrest.Matchers.equalTo;

public class CreateUserTest {
    @Test
    public static void createUser(){
        String endpoint ="https://api.escuelajs.co/api/v1/users";
        String payload = Payloads.getUsersPayload("Rithvik","rithvik@gmail.com","123456");
       Response response = RestUtils.getPostRequest(endpoint, payload, new HashMap<String,String>() );

        Assert.assertEquals(response.statusCode(),201);

    }
    @Test
    public static void getUsers(){
        String endPoint ="https://reqres.in/api/users";
        Response response = RestUtils.getRequest(endPoint,new HashMap<String,String>());
        response.then().body("data[2].email",equalTo("emma.wong@reqres.in"));
    }
}
