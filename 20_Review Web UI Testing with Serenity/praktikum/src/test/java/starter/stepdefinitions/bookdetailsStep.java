package starter.stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Step;
import starter.kumpulan.bookdetails;

public class bookdetailsStep {
    @Step
    bookdetails bookdetails;

    @Given("I am on book store page")
    public void onBookStorePage(){
    bookdetails.onBookStorePage();
    }


    @When("I click on Speaking JavaScript book")
    public void clickOnSpeakingJavaScriptBook(){

    }

    @Then("I can see the detail of that book")
    public void seeTheDetailofJavascriptBook(){

    }

}
