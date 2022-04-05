package starter.login;

import net.thucydides.core.annotations.Step;

public class Search {
    @Step("I am on a home page")
    public void onHomePage(){
        System.out.println("I am on a home page");
    }
    @Step("I click search bar")
    public void searchBar(){
        System.out.println("I click search bar");
    }
    @Step("I type another acount at search bar")
    public void typeAcount(){
        System.out.println("I type another acount at search bar");
    }
    @Step("I press my enter buttom")
    public void enterButtom(){
        System.out.println("I press my enter buttom");
    }
    @Step("I directed to another page with account data")
    public void directToPage(){
        System.out.println("I directed to another page with account data");
    }
}
