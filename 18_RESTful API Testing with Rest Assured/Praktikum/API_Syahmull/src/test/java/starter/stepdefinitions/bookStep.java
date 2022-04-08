package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.user.Books;

public class bookStep {
    @Steps
    Books inibuku;

    @Given("I am get API endpoint")
    public void userGetApiEndpoint(){
        inibuku.userGetApiEndpoint();
    }

    @When("I am send Get HTTP request")
    public void userSendGetHTTPRequest(){
        inibuku.userSendGetHTTPRequest();
    }

    @Then("I am receive valid HTTP response code 200")
    public void validHTTPResponse200(){
        inibuku.receivevalidhttp200();
    }
    @And("validate ISBN and Title")
    public void validateISBNandTitle(){
        inibuku.validateISBNandTitle();
    }
}
