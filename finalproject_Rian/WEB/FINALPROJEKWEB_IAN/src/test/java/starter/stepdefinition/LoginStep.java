package starter.stepdefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.page.HomePage;
import starter.page.LoginPage;

public class LoginStep {

    @Steps
    LoginPage loginini;

    @Steps
    HomePage inihomepage;

    @Given("user on login page")
    public void onLoginPage(){
        loginini.openPage();
        loginini.clickLoginIcon();
        loginini.validateonLoginPage();
    }
    @When("user input valid username and password")
    public void inputValidEmail(){
        loginini.inputEmail("r.syahmullohhH.h@gmail.com");
        loginini.inputPassword("mamahmuda12");
    }
    @And("user click login button")
    public void clickLoginButtom(){
        loginini.clickloginButton();
    }
    @Then("user on home page")
    public void onHomePage(){
        inihomepage.validasiHomePage();
    }
}
