package Stater;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Step;

import javax.xml.bind.SchemaOutputResolver;

public class Login {

    @Step("I am on login page")
    public void onTheLoginPage(){
        System.out.println("Sudah di halaman login");
    }

    @Step("I enter my valid username and valid password")
    public void entervalidusernamepassword(){
        System.out.println("valid username dan password");
    }

    @Step("I click login button")
    public void clickLoginButton(){
        System.out.println("klik login button");
    }

    @Step("I am on my home")
    public void onMyHome(){
        System.out.println("home");
    }



    @Step("I am on profile page")
    public void onProfilePage(){System.out.println("Sudah berada di halaman profil");}

    @Step("I click my photo")
    public void clickMyPhoto(){System.out.println("Klik my photo");}

    @Step("I click added photo")
    public void clickAddedPhoto(){System.out.println("klik add photo");}

    @Step("I click upload photo")
    public void clickUploadPhoto(){System.out.println("klik upload foto");}

    @Step("my folder is displayed")
    public void folderDisplayed(){System.out.println("my folder tampil");}

    @Step("I click photo")
    public void clickPhoto(){System.out.println("klik foto");}

    @Step("I click open button")
    public void clickOpenButton(){System.out.println("klik open button");}

    @Step("i click save photo")
    public void clickSavePhoto(){System.out.println("klik save foto");}

    @Step("I enter my invalid username and valid password")
    public void enterInvalidUsernameValidPassword(){System.out.println("invalid username dan password");}

    @Step("error notification is appeared")
    public void errorNotification(){System.out.println("Error notifikasi muncul");}

    @Step("I enter my valid username and invalid password")
    public void enterValidUsernameInvalidPassword(){System.out.println("valid username dan invalid password");}


    @Step("I click input field")
    public void clickInputField(){
        System.out.println("klik input field");

    }
    @Step("I type my status")
    public void typeStatus(){
        System.out.println("type status");
    }

    @Step("I click posting")
    public void clickPosting(){
        System.out.println("click posting");
    }

    @Step("my status is posted")
    public void statusIsPosted(){
        System.out.println("status telah di post");
    }

    @Step("I click search bar")
    public void clickSearchBar(){
        System.out.println("Klik search bar");
    }

    @Step("my search histories are appeared")
    public void searchHistoryAppeared(){
        System.out.println("Riwayat pencarian muncul");
    }

    @Step("I click delete history")
    public void clickDeleteHistory(){
        System.out.println("Klik delete history");
    }

    @Step("validation pop up will be appeared")
    public void popUpAppeared(){
        System.out.println("Muncul pop up validasi");
    }

    @Step("I click delete history on pop up")
    public void clickDeleteHistoryPopUp(){
        System.out.println("Klik hapus riwayat pada pop up");
    }

    @Step("my histories are deleted")
    public  void HmyHistoryDeleted(){
        System.out.println("Riwayat pencarian terhapus");
    }


}
