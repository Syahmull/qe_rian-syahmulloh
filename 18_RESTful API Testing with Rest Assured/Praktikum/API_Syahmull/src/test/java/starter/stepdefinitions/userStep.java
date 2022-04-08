package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.user.User;

public class userStep {
    @Steps
    User user;

    @Given("I am set POST API endpoints")
    public void setPostApiEndpoints(){
        user.setPostApiEndpoints();
    }

    @When("I am send POST HTTP request")
    public void sendPostHTTPrequest(){
        user.sendPostHTTPrequest();
    }

    @Then("I am receive valid HTTP response code 201")
    public void receiveValidHttpResponseCode201(){
        user.receiveValidHttpResponseCode201();
    }

    @And("I am receive valid data for new user")
    public void validDataNewUser(){
        user.validDataNewUser();
    }
}
