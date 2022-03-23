package stepdefinitions;

import Stater.Login;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.Steps;

public class posting {
    @Steps
    Login post;


    @And("I click input field")
    public void clickInputField(){
        post.clickInputField();
    }

    @When("I type my status")
    public void typeStatus(){
        post.typeStatus();
    }

    @And("I click posting")
    public void clickPosting(){
        post.clickPosting();
    }

    @Then("my status is posted")
    public void statusIsPosted(){
        post.statusIsPosted();
    }


}
