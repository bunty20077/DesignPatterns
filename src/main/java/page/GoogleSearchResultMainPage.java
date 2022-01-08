package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class GoogleSearchResultMainPage {

    protected WebDriver driver;
    By resultCount =  By.id("result-stats");

    public GoogleSearchResultMainPage(WebDriver driver){
        this.driver = driver;
    }

    public WebElement getSearchResultCountElement() {
        WebElement getCountElement = driver.findElement(resultCount);
        return getCountElement;
    }

    public String verifyResultCount(){
        WebElement verifyResult = driver.findElement(resultCount);
        String message = verifyResult.getText();
        System.out.println(message);
        return verifyResult.getText();
    }
}
