package stepdefinitions;

import Stater.Login;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;

public class LoginSteps {
    @Steps
    Login login;

    //scenario 1

    @Given("I am on login page")
    public void onTheLoginPage(){
    login.onTheLoginPage();
    }

    @When("I enter my valid username and valid password")
    public void entervalidusernamepassword(){
    login.entervalidusernamepassword();
    }

    @And("I click login button")
    public void clickLoginButton(){
    login.clickLoginButton();
    }

    @Then("I am on my home")
    public void onMyHome(){
    login.onMyHome();
    }

    //scenario2
    @When("I enter my invalid username and valid password")
    public void enterInvalidUsernameValidPassword() {
    login.enterInvalidUsernameValidPassword();
    }

    @Then("error notification is appeared")
    public void errorNotification(){
    login.errorNotification();
    }

    //Scenario3
    @When("I enter my valid username and invalid password")
    public void enterValidUsernameInvalidPassword() {
        login.enterValidUsernameInvalidPassword();
    }
}
