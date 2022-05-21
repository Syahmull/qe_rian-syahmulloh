package starter.gadogado;

import io.restassured.response.Response;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.json.simple.JSONObject;
import org.junit.Assert;

import java.util.Random;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;
import static org.hamcrest.Matchers.equalTo;

public class Register {

    protected static String url = "https://be-qa.alta.id/api/";

    @Step("user set endpoint for register")
    public String setEndponts() {
        return url + "auth/register";
    }

    @Step("user input valid full name,email, and password in body")
    public void inputValidBody() {
        Random rand = new Random();
        int number = rand.nextInt(1000000);

        JSONObject requestBody = new JSONObject();
        requestBody.put("Fullname", "AmullL");
        requestBody.put("Email", "amull"+ String.valueOf(number)+"@gmail.com");
        requestBody.put("Password", "mamahmuda12");

        SerenityRest.given().header("Conten-Type", "application/json").body(requestBody.toJSONString()).post(setEndponts());
    }

    @Step("user see status code 200")
    public void statusCode() {
        restAssuredThat(response -> response.statusCode(200));
    }

    @Step("user receive valid data")
    public void validData() {
        Response resp = SerenityRest.lastResponse();
        String Fullname = resp.getBody().jsonPath().get("data.Fullname");
        Assert.assertEquals(Fullname, "AmullL");
    }
}
