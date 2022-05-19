package starter.page;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class LoginPage extends PageObject {
    private By inputUserName(){
        return By.xpath("//label[contains(text(),'Email')]/following-sibling::input");
    }
    private By inputPassword(){
        return By.xpath("//label[contains(text(),'Password')]/following-sibling::input");
    }
    private By tombolLogin(){
        return By.xpath("//span[contains(text(),'Login')]/parent::button");
    }
    private By iconLoginnya(){
        return By.xpath("(//button[contains(@class,'v-btn v-btn--icon v-btn--round theme--dark v-size--default')])[2]");
    }

    @Step
    public void openPage(){
        open();
    }
    @Step
    public void validateonLoginPage(){
        $(tombolLogin()).isDisplayed();
    }

    @Step
    public void inputEmail(String email){
        $(inputUserName()).type(email);
    }

    @Step
    public void inputPassword(String password){
        $(inputPassword()).type(password);
    }

    @Step
    public void clickLoginIcon(){
        $(iconLoginnya()).click();
    }
    @Step
    public void clickloginButton() {
        $(tombolLogin()).click();
    }

}
