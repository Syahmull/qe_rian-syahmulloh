package starter.page;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class DetailPage extends PageObject {
    private By onHomepage(){
        return By.xpath("//div[contains(@class,'v-main__wrap')]");
    }
    private By clickDetailLaptopku(){
        return By.xpath("(//span[text()= 'Detail']/parent::button)[3]");
    }
    private By validateLaptopDetailku(){
        return By.xpath("//div[contains(@class,'v-card__text')]");
    }

    @Step
    public void openPage(){
        open();
    }
    @Step
    public void homePage(){
        $(onHomepage()).isDisplayed();
    }
    @Step
    public void clickDetailLaptop(){
        $(clickDetailLaptopku()).click();
    }
    @Step
    public void validasiLaptopdetailku(){
        $(validateLaptopDetailku()).isDisplayed();
    }

}
