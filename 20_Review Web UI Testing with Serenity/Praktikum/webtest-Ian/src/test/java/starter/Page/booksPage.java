package starter.Page;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.By;

public class booksPage extends PageObject {
    private By bookstoretombol(){
        return By.xpath("(//div[contains(@class,\"action-buttons\")])[5]");
    }
    private By bookstoreValidasi(){
        return By.xpath("//img[contains(@src,'/images/Toolsqa.jpg')]");
    }
    @Step
    public void onPage(){
        open();
    }
    @Step
    public void validasiHomepage(){
        $(bookstoreValidasi()).isDisplayed();
    }
    public void klikTombolnya(){
        $(bookstoretombol()).click();
    }
}
