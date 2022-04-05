package starter.login;

import net.thucydides.core.annotations.Step;

public class Photopost {

    @Step("I am at home page")
    public void atHomePage(){
        System.out.println("I am at home page");
    }
    @Step("I click photo buttom")
    public void buttomPoto(){
        System.out.println("I click photo buttom");
    }
    @Step("my folder was displayed")
    public void folderDisplay(){
        System.out.println("my folder was displayed");
    }
    @Step("I chose a photo")
    public void chosePhoto(){
        System.out.println("I chose a photo");
    }
    @Step("I click open buttom")
    public void clickButtom(){
        System.out.println("I click open buttom");
    }
    @Step("i click done buttom")
    public void doneButtom(){
        System.out.println("i click done buttom");
    }
    @Step("Create a post was displayed")
    public void createPost(){
        System.out.println("Create a post was displayed");
    }
    @Step("I type my test in text box")
    public void typeTextBox(){
        System.out.println("I type my test in text box");
    }
    @Step("I click post")
    public void clickPost(){
        System.out.println("I click post");
    }
}
