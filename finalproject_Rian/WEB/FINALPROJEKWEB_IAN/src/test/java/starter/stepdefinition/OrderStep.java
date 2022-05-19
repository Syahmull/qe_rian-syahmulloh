package starter.stepdefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.page.OrderPage;

public class OrderStep {

    @Steps
    OrderPage fiturorder;

    @Given("user on homepage")
    public void homePageUser(){
        fiturorder.openHomePage();
        fiturorder.homepagenyamuncul();
    }

    @And("user click beli buttom of laptop")
    public void belibuttomlaptop(){
        fiturorder.beliinnih();
    }

    @When("user click basket buttom")
    public void basketButtomClick(){
        fiturorder.klikkeranjangnya();
    }

    @And("user on order home page")
    public void onorderPage(){
        fiturorder.validasikanorderpage();
    }

    @And("user click plus buttom")
    public void plusButtomClick(){
        fiturorder.buttonplusnya();
    }

    @Then("user see total bayar was change")
    public void seeTotalBayar(){
        fiturorder.munculhargatotal();
    }
}
