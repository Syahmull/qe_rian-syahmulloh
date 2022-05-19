package starter.page;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class OrderPage extends PageObject {
    private By homepagenih(){
        return By.xpath("//div[contains(@class,'v-main__wrap')]");
    }
    private By beliButtomLaptop(){
        return By.xpath("(//span[text()= 'Beli']/parent::button)[4]");
    }
    private By buttomKeranjang(){
        return By.xpath("(//button[contains(@class,'v-btn v-btn--icon v-btn--round theme--dark v-size--default')])[1]");
    }
    private By validasiorderpage(){
        return By.xpath("//div[contains(@class,'v-card__text')]");
    }
    private By klikButtomPlusnya(){
        return By.xpath("(//button[contains(@class,'v-btn v-btn--icon v-btn--outlined v-btn--round theme--light v-size--default')])[2]");
    }
    private By validasiTotalBayaran(){
        return By.xpath("//span[contains(@id,'label-total-bayar')]");
    }

    @Step
    public void openHomePage(){
        open();
    }
    @Step
    public void homepagenyamuncul(){
        $(homepagenih()).isDisplayed();
    }
    @Step
    public void beliinnih(){
        $(beliButtomLaptop()).click();
    }
    @Step
    public void klikkeranjangnya(){
        $(buttomKeranjang()).click();
    }
    @Step
    public void validasikanorderpage(){
        $(validasiorderpage()).isDisplayed();
    }
    @Step
    public void buttonplusnya(){
        $(klikButtomPlusnya()).click();
    }
    @Step
    public void munculhargatotal(){
        $(validasiTotalBayaran()).isDisplayed();
    }

}
