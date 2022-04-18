package starter.stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.Page.booksPage;
import starter.Page.RumahPage;

public class bookStep {
    @Steps
    booksPage detailbuku;

    @Steps
    RumahPage nexthalaman;

    @Given("I on book store page")
    public void detailBukunya(){
        detailbuku.onPage();
        detailbuku.validasiHomepage();
    }

    @When("I click on You Don't Know JS book")
    public void klikBukuyangdipilih(){
        detailbuku.klikTombolnya();
    }
    @Then("I can see the detail of a book")
    public void halamanPindah(){
        nexthalaman.validasiHalamanBaru();
    }
}
