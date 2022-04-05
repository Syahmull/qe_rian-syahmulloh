package starter.login;

import net.thucydides.core.annotations.Step;

public class Login {
    @Step("I am on a login page")
    public void onTheLoginPage(){
        System.out.println("I am on a login page");
    }
    @Step("I enter my username and password correctly")
    public void enterUserNameAndPassword(){
        System.out.println("I enter my username and password correctly");
    }

    @Step("I click login button")
    public void clickLoginButton(){
        System.out.println("I click login button");
    }

    @Step("I am the home page")
    public void onHomePage(){
        System.out.println("I am the home page");
    }
}
