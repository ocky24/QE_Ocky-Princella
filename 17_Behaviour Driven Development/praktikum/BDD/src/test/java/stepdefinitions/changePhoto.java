package stepdefinitions;

import Stater.Login;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.Steps;

public class changePhoto {
    @Steps
    Login change;

    @Given("I am on profile page")
    public void onProfilePage(){
        change.onProfilePage();
    }

    @When("I click my photo")
    public void clickMyPhoto(){
        change.clickMyPhoto();
    }

    @And("I click added photo")
    public void clickAddedPhoto(){
    change.clickAddedPhoto();
    }

    @And("I click upload photo")
    public void clickUploadPhoto() {
        change.clickUploadPhoto();
    }

    @Then("my folder is displayed")
    public void folderDisplayed(){
        change.folderDisplayed();
    }

    @And("I click photo")
    public void clickPhoto(){
        change.clickPhoto();
    }

    @And("I click open button")
    public void clickOpenButton(){
        change.clickOpenButton();
    }

    @And("i click save photo")
    public void clickSavePhoto(){
        change.clickSavePhoto();
    }

}
