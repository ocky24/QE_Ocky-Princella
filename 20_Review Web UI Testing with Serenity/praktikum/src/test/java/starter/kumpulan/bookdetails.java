package starter.kumpulan;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.By;

public class bookdetails extends PageObject {
    private By bookstore(){
        return By.xpath("(//div[@class=\"card mt-4 top-card\"])[6]");
    }

    private By bookstorepage(){
        return By.xpath("(//div[contains(text(),'Book Store')])[1]");
    }

    @Step("I am on book store page")
    public void onBookStorePage(){
        open();
        $(bookstore()).click();
        $(bookstorepage()).isDisplayed();
    }

}
