package starter.gadogado;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.json.simple.JSONObject;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class Login {

    protected static String url = "https://be-qa.alta.id/api/";

    @Step("user set endpoint for login")
    public String setEndpontss() {
        return url + "auth/login";
    }

    @Step("user input valid email and password in body")
    public void inputValidBodyy() {
        JSONObject requestBody = new JSONObject();
        requestBody.put("Email", "r.syahmullohh.h@gmail.com");
        requestBody.put("Password", "mamahmuda12");

        SerenityRest.given().header("Conten-Type", "application/json").body(requestBody.toJSONString()).post(setEndpontss());
    }

    @Step("user see status code in 200")
    public void statusCodee() {
        restAssuredThat(response -> response.statusCode(200));
    }
}
