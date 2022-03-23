package stepdefinitions;

import Stater.Login;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;

public class searchSteps {
   @Steps
   Login search;

    @And("I click search bar")
    public void clickSearchBar(){
search.clickSearchBar();
    }

    @When("my search histories are appeared")
    public void searchHistoryAppeared(){
search.searchHistoryAppeared();
    }

    @And("I click delete history")
    public void clickDeleteHistory(){
search.clickDeleteHistory();
    }

    @And("validation pop up will be appeared")
    public void popUpAppeared(){
search.popUpAppeared();
    }

    @And("I click delete history on pop up")
    public void clickDeleteHistoryPopUp(){
search.clickDeleteHistoryPopUp();
    }

    @Then("my histories are deleted")
    public  void HmyHistoryDeleted(){
search.HmyHistoryDeleted();
    }

}
