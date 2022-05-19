package starter.page;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class SelectCategoriesPage extends PageObject {
    private By homeePage(){
        return By.xpath("//div[contains(@class,'v-main__wrap')]");
    }
    private By klikSelectCategori(){
        return By.xpath("//div[contains(@class, 'v-select__slot')]");
    }
    private By validasiKotakKategori(){
        return By.xpath("//div[contains(@class,'v-menu__content theme--light menuable__content__active')]");
    }
    private By clickSalahSatuCategori(){
        return By.xpath("(//div[contains(text(),'alat')]/parent::div)[3]");
    }
    private By munculCategorinya(){
        return By.xpath("//div[contains(@class,'v-alert v-sheet theme--light elevation-2 v-alert--border v-alert--border-top')]");
    }

    @Step
    public void OpenPageSasmey(){
        open();
    }
    @Step
    public void onHomeePagee(){
        $(homeePage()).isDisplayed();
    }
    @Step
    public void selectBoxCategories(){
        $(klikSelectCategori()).click();
    }
    @Step
    public void velidateCategoriesBox(){
        $(validasiKotakKategori()).isDisplayed();
    }
    @Step
    public void clickACategory(){
        $(clickSalahSatuCategori()).click();
    }
    @Step
    public void validateDisplayedCategory(){
        $(munculCategorinya()).isDisplayed();
    }
}
