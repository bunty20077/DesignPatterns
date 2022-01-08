package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import page.GoogleSearchResultMainPage;
import page.OpenGoogle;
import page.SearchFieldGoogleHomePage;

import java.net.StandardSocketOptions;

public class GoogleTestPageObjects {

    protected WebDriver driver;
    SearchFieldGoogleHomePage searchFieldGoogleHomePage;
    GoogleSearchResultMainPage googleSearchResultMainPage;
    OpenGoogle openGoogle;
    private static String url = "https://www.google.com";

    public GoogleTestPageObjects(WebDriver driver) {
        this.driver = driver;
        searchFieldGoogleHomePage = new SearchFieldGoogleHomePage(driver);
        openGoogle = new OpenGoogle(driver);
        googleSearchResultMainPage = new GoogleSearchResultMainPage(driver);
    }


    public void enterDataInSearchQuery(String searchData){
        openGoogle.openURL(url);
        searchFieldGoogleHomePage.getSearchTextBox().clear();
        searchFieldGoogleHomePage.getSearchTextBox().sendKeys(searchData);
        searchFieldGoogleHomePage.getSearchTextBox().sendKeys(Keys.ENTER);
    }

    public String getSearchResultCountText() throws InterruptedException {
       System.out.println("I am called ?");
       // WebDriverWait wait = new WebDriverWait(driver,90);
       // wait.until(ExpectedConditions.visibilityOfElementLocated((By) googleSearchResultMainPage.getSearchResultCountElement()));
        Thread.sleep(5000);
    // click on the compose button as soon as the "compose" button is visible
       String resultCount = googleSearchResultMainPage.getSearchResultCountElement().getText();
       return resultCount;
    }
}
