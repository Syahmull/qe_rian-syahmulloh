package starter.gadogado;

import io.restassured.response.Response;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.junit.Assert;
import static net.serenitybdd.rest.SerenityRest.restAssuredThat;
import static org.hamcrest.Matchers.equalTo;


public class Product {

    protected static String url = "https://be-qa.alta.id/api/";

    @Step("user set get endpoint for product")
    public String setGetEndpoints() {
        return url + "products";
    }
    @Step("userr send get request")
    public void getReq(){
        SerenityRest.given().get(setGetEndpoints());
    }
    @Step("userr see status codee 200")
    public void statusCodeku(){
        restAssuredThat(response -> response.statusCode(200));
    }
}
