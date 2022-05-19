package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.gadogado.Ratings;

public class RatingsStep {

    @Steps
    Ratings iniRating;

    @Given("user set endpoint for ratings product")
    public void setEndPointRating(){
        iniRating.setGetEndpointRating();
    }
    @When("user send get request")
    public void getReqquest(){
        iniRating.getReqqRatings();
    }
    @Then("user see statuss code 200")
    public void sstatusCodee(){
        iniRating.seeStatusCode200();
    }
    @And("I receive rating data for a product")
    public void validateRatingData(){
        iniRating.validateRatingData();
    }
}
