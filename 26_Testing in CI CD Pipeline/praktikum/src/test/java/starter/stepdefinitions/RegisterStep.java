package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.gadogado.Register;

public class RegisterStep {
    @Steps
    Register postRegis;

    @Given("user set endpoint for register")
    public void setPostApiEndPoints() {
        postRegis.setEndponts();
    }
    @When("user input valid full name,email, and password in body")
    public void requestBodyValid() {
        postRegis.inputValidBody();
    }

    @Then("user see status code 200")
    public void statusCode200() {
        postRegis.statusCode();
    }
    @And("user receive valid data")
    public void validData() {
        postRegis.validData();
    }

}
