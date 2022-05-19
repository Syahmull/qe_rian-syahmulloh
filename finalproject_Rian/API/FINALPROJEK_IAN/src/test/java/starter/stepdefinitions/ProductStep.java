package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.gadogado.Product;

public class ProductStep {

    @Steps
    Product produkKu;

    @Given("user set get endpoint for product")
    public void getEndPoint(){
        produkKu.setGetEndpoints();
    }
    @When("userr send get request")
    public void getRequest(){
        produkKu.getReq();
    }
    @Then("userr see status codee 200")
    public void statusCoda(){
        produkKu.statusCodeku();
    }
}
