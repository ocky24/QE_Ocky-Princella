package stater.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import stater.kumpulan.kumpulan;

public class bookSteps {
    @Steps
    kumpulan bookss;

    @Given("user get API endpoint")
    public void userGetApiEndpoint(){
    bookss.userGetApiEndpoint();
    }

    @When("user send Get HTTP request")
    public void userSendGetHTTPRequest(){
    bookss.userSendGetHTTPRequest();
    }

    @Then("user receive valid HTTP response code 200")
    public void validHTTPResponse200(){
    bookss.receivevalidhttp200();
    }
    @And("validate ISBN and Title")
    public void validateISBNandTitle(){
    bookss.validateISBNandTitle();
    }


}
