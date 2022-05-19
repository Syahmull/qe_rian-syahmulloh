package starter.stepdefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.page.SelectCategoriesPage;

public class SelectcategorieStep {

    @Steps
    SelectCategoriesPage inipilihkategori;

    @Given("user on a homeepage")
    public void userHomeePage(){
        inipilihkategori.OpenPageSasmey();
        inipilihkategori.onHomeePagee();
    }
    @When("user click select category")
    public void clickSelectCategoriy(){
        inipilihkategori.selectBoxCategories();
        inipilihkategori.velidateCategoriesBox();
    }
    @And("user choose alat category")
    public void chooseAlatCategoriy(){
        inipilihkategori.clickACategory();
    }
    @Then("user are shown all categories of alat")
    public void showAllCategoriesAlat(){
        inipilihkategori.validateDisplayedCategory();
    }
}
