package starter.gadogado;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.stepdefinitions.CreateTransactionStep;

public class CreateTransaction {

    @Steps
    CreateTransactionStep orderku;

    @Given("user succes auth using existing account")
    public void authExistingAccount(){
        orderku.authExisAccount();
    }
    @And("user set endpoint for order product")
    public void setOrderEndpoint(){
        orderku.setEndpointOrder();
    }
    @When("user send post request order")
    public void sendPostOrder(){
        orderku.sendPostOrder();
    }
    @Then("user see status order code 200")
    public void statusOrderCode(){
        orderku.seeStatusOrderCode();
    }
}
