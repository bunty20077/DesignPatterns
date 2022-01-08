package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class SearchFieldGoogleHomePage {

    protected WebDriver driver;
    By searchField =  By.name("q");

    // Constructor accepts Driver info from Maintest and passes into this class
    public SearchFieldGoogleHomePage(WebDriver driver){
        this.driver = driver;
    }

    // Method accepts param from Main test and does actual Selenium operation

    public WebElement getSearchTextBox(){
        return driver.findElement(searchField);
    }

}
