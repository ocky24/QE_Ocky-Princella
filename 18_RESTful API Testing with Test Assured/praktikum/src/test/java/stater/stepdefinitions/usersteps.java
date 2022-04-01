package stater.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import stater.kumpulan.kumpulan;

public class usersteps {
    @Steps
    kumpulan user;

    @Given("I set POST API endpoints")
    public void setPostApiEndpoints(){
        user.setPostApiEndpoints();
    }


    @When("I send POST HTTP request")
    public void sendPostHTTPrequest(){
    user.sendPostHTTPrequest();
    }


    @Then("I receive valid HTTP response code 201")
    public void receiveValidHttpResponseCode201(){
    user.receiveValidHttpResponseCode201();
    }


    @And("I receive valid data for new user")
    public void validDataNewUser(){
    user.validDataNewUser();
    }








}
