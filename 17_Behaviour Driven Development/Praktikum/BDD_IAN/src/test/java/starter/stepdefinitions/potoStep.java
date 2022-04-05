package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.login.Photopost;

public class potoStep {
    @Steps
    Photopost potopost;

    @Given("I am at home page")
    public void atHomePage(){
        potopost.atHomePage();
    }
    @When("I click photo buttom")
    public void buttomPoto(){
        potopost.buttomPoto();
    }
    @Then("my folder was displayed")
    public void folderDisplay(){
        potopost.folderDisplay();
    }
    @And("I chose a photo")
    public void chosePhoto(){
        potopost.chosePhoto();
    }
    @And("I click open buttom")
    public void clickButtom(){
        potopost.clickButtom();
    }
    @And("i click done buttom")
    public void doneButtom(){
        potopost.doneButtom();
    }
    @Then("Create a post was displayed")
    public void createPost(){
        potopost.createPost();
    }
    @And("I type my test in text box")
    public void typeTextBox(){
        potopost.typeTextBox();
    }
    @And("I click post")
    public void clickPost(){
        potopost.clickPost();
    }
}
