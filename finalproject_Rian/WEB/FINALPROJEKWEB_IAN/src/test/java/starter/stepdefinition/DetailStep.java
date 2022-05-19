package starter.stepdefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.page.DetailPage;

public class DetailStep {
    @Steps
    DetailPage inidetailnya;

    @Given("user on home page detail")
    public void userDetailHomePage(){
        inidetailnya.openPage();
        inidetailnya.homePage();
    }
    @When("user click detail button Laptop")
    public void clickDetailButtom(){
        inidetailnya.clickDetailLaptop();
    }
    @Then("user sucsess see detail Laptop Page")
    public void validateDetailDurianJatuh(){
        inidetailnya.validasiLaptopdetailku();
    }
}
