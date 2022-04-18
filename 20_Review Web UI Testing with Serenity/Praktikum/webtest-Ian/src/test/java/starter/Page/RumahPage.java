package starter.Page;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.By;


public class RumahPage extends PageObject {
    private By isbn(){
        return By.xpath("(//label[contains(@id,'userName-value')])[2]");
    }
    @Step
    public void validasiHalamanBaru(){
        $(isbn()).isDisplayed();
    }
}
