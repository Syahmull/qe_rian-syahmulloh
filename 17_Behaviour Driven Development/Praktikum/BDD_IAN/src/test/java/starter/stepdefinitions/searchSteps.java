package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.login.Search;


public class searchSteps {
    @Steps
    Search search;

    @Given("I am on a home page")
    public void onHomePage(){
        search.onHomePage();
    }
    @When("I click search bar")
    public void searchBar(){
        search.searchBar();
    }
    @And("I type another acount at search bar")
    public void typeAcount(){
        search.typeAcount();
    }
    @And("I press my enter buttom")
    public void enterButtom(){
        search.enterButtom();
    }
    @Then("I directed to another page with account data")
    public void directToPage(){
        search.directToPage();
    }

}
