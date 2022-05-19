package starter.page;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class RegisPage extends PageObject {
    private By iniHomepage(){
        return By.xpath("//div[contains(@class,'v-main__wrap')]");
    }
    private By clickLogoLoginn(){
        return By.xpath("(//button[contains(@class,'v-btn v-btn--icon v-btn--round theme--dark v-size--default')])[2]");
    }
    private By clickRegisnya(){
        return By.xpath("//a[contains(text(),'Register')]");
    }
    private By validasiHalamanRegis(){
        return By.xpath("//div[contains(@class,'v-card v-sheet theme--light')]");
    }
    private By masukinNamamu(){
        return By.xpath("//label[contains(text(),'Nama Lengkap')]/following-sibling::input");
    }
    private By masukinEmailnya(){
        return By.xpath("//label[contains(text(),'Email')]/following-sibling::input");
    }
    private By masukinPasswordnya(){
        return By.xpath("//label[contains(text(),'Password')]/following-sibling::input");
    }
    private By klikRegisButton(){
        return By.xpath("//span[contains(text(),'Register')]/parent::button");
    }
    private By validasikanLoginPage(){
        return By.xpath("//div[contains(text(),'Login')]/parent::div");
    }

    @Step
    public void OpenHomePagenya(){
        open();
    }
    @Step
    public void onHomePageee(){
        $(iniHomepage()).isDisplayed();
    }
    @Step
    public void clickLogoLogin(){
        $(clickLogoLoginn()).click();
    }
    @Step
    public void regisTextClick(){
        $(clickRegisnya()).click();
    }
    @Step
    public void validateRegisPage(){
        $(validasiHalamanRegis()).isDisplayed();
    }
    @Step
    public void typeNamaLengkapnya(String NamaLengkap){
        $(masukinNamamu()).type(NamaLengkap);
    }
    @Step
    public void typeEmailValid(String Email){
        $(masukinEmailnya()).type(Email);
    }
    @Step
    public void typePasswordValid(String Password){
        $(masukinPasswordnya()).type(Password);
    }
    @Step
    public void registerButton(){
        $(klikRegisButton()).click();
    }
    @Step
    public void validatePageLogin(){
        $(validasikanLoginPage()).isDisplayed();
    }
}
