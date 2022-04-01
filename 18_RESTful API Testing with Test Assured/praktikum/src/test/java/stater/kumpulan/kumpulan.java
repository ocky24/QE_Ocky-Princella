package stater.kumpulan;

import io.restassured.response.Response;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.json.simple.JSONObject;
import org.junit.Assert;

import static net.serenitybdd.rest.SerenityRest.rest;
import static net.serenitybdd.rest.SerenityRest.restAssuredThat;
import static org.hamcrest.Matchers.equalTo;

public class kumpulan {
    protected String url = "https://demoqa.com/Account/v1/";
    protected String url2 = "https://demoqa.com/BookStore/v1/";

    @Step("I set POST API endpoints")
    public String setPostApiEndpoints(){
        return url + "user";
    }

    @Step("I send POST HTTP request")
    public void sendPostHTTPrequest() {
        JSONObject requestBody = new JSONObject();
        requestBody.put("userName","ockyprincellaaaaa");
        requestBody.put("password","Password!222");

        SerenityRest.given().header("Content-Type","application/json").body(requestBody.toJSONString()).post(setPostApiEndpoints());

    }

    @Step("I receive valid HTTP response code 201")
    public void receiveValidHttpResponseCode201(){
        restAssuredThat(response -> response.statusCode(201));
    }

    @Step("I receive valid data for new user")
    public void validDataNewUser(){
        restAssuredThat(response -> response.body("username",equalTo("ockyprincellaaaaa")));
        restAssuredThat(response -> response.body("userId",equalTo("string")));
    }

    @Step("user get API endpoint")
    public String userGetApiEndpoint(){ return url2 + "Books";}

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
        String isbn = response.getBody().jsonPath().get("books.isbn[1]");
        String title = response.getBody().jsonPath().get("books.title");
        Assert.assertEquals(isbn,"9781449325862" );
        Assert.assertEquals(title,"Git Pocket Guide" );
    }



}
