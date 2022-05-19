package starter.stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.gadogado.Login;


public class LoginStep {
    @Steps
    Login postLogin;

    @Given("user set endpoint for login")
    public void setPostApiEndPointss() {
        postLogin.setEndpontss();
    }
    @When("user input valid email and password in body")
    public void requestBodyValidd() {
        postLogin.inputValidBodyy();
    }

    @Then("user see status code in 200")
    public void statusCodee200() {
        postLogin.statusCodee();
    }
}
