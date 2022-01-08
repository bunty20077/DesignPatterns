package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class GoogleHomePageButtons {

    protected WebDriver driver;
    By googleSearch = By.name("btnK");

    public GoogleHomePageButtons(WebDriver driver){
        this.driver = driver;
    }

    public void googleSearchButtonClick() throws InterruptedException {

        Thread.sleep(5000);
        System.out.println("I am again called");

    }
}
