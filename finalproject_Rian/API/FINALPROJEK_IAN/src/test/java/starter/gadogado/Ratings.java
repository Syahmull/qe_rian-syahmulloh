package starter.gadogado;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;
import static org.hamcrest.Matchers.equalTo;

public class Ratings {

    protected static String url = "https://be-qa.alta.id/api/";

    @Step("user set endpoint for ratings product")
    public String setGetEndpointRating() {
        return url + "products/12/ratings";
    }
    @Step("user send get request")
    public void getReqqRatings(){
        SerenityRest.given().get(setGetEndpointRating());
    }
    @Step("user see statuss code 200")
    public void seeStatusCode200(){
        restAssuredThat(response -> response.statusCode(200));
    }
    @Step("I receive rating data for a product")
    public void validateRatingData(){
        restAssuredThat(response -> response.body("'data'",equalTo(3)));
    }
}
