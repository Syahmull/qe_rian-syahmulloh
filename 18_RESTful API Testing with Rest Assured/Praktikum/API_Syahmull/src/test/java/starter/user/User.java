package starter.user;

import io.restassured.response.Response;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.json.simple.JSONObject;
import org.junit.Assert;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class User {
    protected String url = "https://demoqa.com/Account/v1/";

    @Step("I am set POST API endpoints")
    public String setPostApiEndpoints(){
        return url + "user";
    }

    @Step("I am send POST HTTP request")
    public void sendPostHTTPrequest() {
        JSONObject requestBody = new JSONObject();
        requestBody.put("userName","syahmull");
        requestBody.put("password","inipassword24");

        SerenityRest.given().header("Content-Type","application/json").body(requestBody.toJSONString()).post(setPostApiEndpoints());
    }

    @Step("I am receive valid HTTP response code 201")
    public void receiveValidHttpResponseCode201(){
        restAssuredThat(response -> response.statusCode(201));
    }

    @Step("I am receive valid data for new user")
    public void validDataNewUser(){
        Response response = SerenityRest.lastResponse();
        String username = response.getBody().jsonPath().get("username");
        Assert.assertEquals(username,"syahmull" );
    }

}
