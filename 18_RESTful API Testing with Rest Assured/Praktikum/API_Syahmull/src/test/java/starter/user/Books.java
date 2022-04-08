package starter.user;

import io.restassured.response.Response;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.junit.Assert;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class Books {
    protected String urll = "https://demoqa.com/BookStore/v1/";

    @Step("user get API endpoint")
    public String userGetApiEndpoint(){ return urll + "Books";}

    @Step("user send Get HTTP request")
    public void userSendGetHTTPRequest(){
        SerenityRest.given().get(userGetApiEndpoint());
    }
    @Step("user receive valid HTTP response code 200")
    public void receivevalidhttp200(){
        restAssuredThat(response -> response.statusCode(200));
    }
    @Step("validate ISBN and Title")
    public void validateISBNandTitle(){
        Response response = SerenityRest.lastResponse();
        String isbn = response.getBody().jsonPath().get("books.isbn[0]");
        String title = response.getBody().jsonPath().get("books.title[0]");
        Assert.assertEquals(isbn,"9781449325862" );
        Assert.assertEquals(title,"Git Pocket Guide" );
    }

}
