package starter.stepdefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.page.RegisPage;

import java.util.Random;

public class RegisStep {
    @Steps
    RegisPage kelasregis;

    @Given("user on home pageku")
    public void homePageku(){
        kelasregis.OpenHomePagenya();
        kelasregis.onHomePageee();
    }
    @And("user direct to register page")
    public void directRegisPage(){
        kelasregis.clickLogoLogin();
        kelasregis.regisTextClick();
        kelasregis.validateRegisPage();
    }
    @When("user input valid nama lengkap, email, and password")
    public void inputNamaEmailPass(){
        Random rand = new Random();
        int number = rand.nextInt(1000000);

        kelasregis.typeNamaLengkapnya("Amull");
        kelasregis.typeEmailValid("riansyah"+ String.valueOf(number)+"@gmail.com");
        kelasregis.typePasswordValid("mamahmuda12");

    }
    @And("user click register button")
    public void clickRegisbuttom(){
        kelasregis.registerButton();
    }
    @Then("user on a login page")
    public void validateLoginPage(){
        kelasregis.validatePageLogin();
    }
}
