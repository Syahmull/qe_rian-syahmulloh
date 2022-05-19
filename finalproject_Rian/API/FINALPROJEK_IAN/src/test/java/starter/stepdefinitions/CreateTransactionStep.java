package starter.stepdefinitions;

import com.sun.security.jgss.AuthorizationDataEntry;
import io.restassured.response.Response;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class CreateTransactionStep {

    protected static String token = "";
    protected static String url = "https://be-qa.alta.id/api/";

    @Step("user succes auth using existing account")
    public void authExisAccount(){
        JSONObject requestBody = new JSONObject();
        requestBody.put("email","r.syahmullohh.h@gmail.com");
        requestBody.put("password","mamahmuda12");

        SerenityRest.given().header("Content-Type","application/json").body(requestBody.toJSONString()).post("https://be-qa.alta.id/api/auth/login");
        Response resp = SerenityRest.lastResponse();
        token = resp.getBody().jsonPath().get("data");
    }
    @Step("user set endpoint for order product")
    public String setEndpointOrder(){
        return url + "orders";
    }
    @Step("user send post request order")
    public void  sendPostOrder(){
        JSONObject requestBody = new JSONObject();
        requestBody.put("product_id",1);
        requestBody.put("quantity",2);

        JSONArray bodyArray = new JSONArray();
        bodyArray.add(requestBody);

        SerenityRest.given().header("Authorization","Bearer "+ token).body(bodyArray.toJSONString()).post(setEndpointOrder());

        Response resp = SerenityRest.lastResponse();
        String Fullname = resp.getBody().jsonPath().get("data[0].User.Fullname");

        System.out.println("ini fullname:" + Fullname );
    }
    @Step("user see status order code 200")
    public void seeStatusOrderCode(){
        restAssuredThat(response -> response.statusCode(200));
    }
}
