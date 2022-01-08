package page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.WebDriver;

public class OpenGoogle {

    protected WebDriver driver ;

    public OpenGoogle(WebDriver driver) {
        this.driver = driver;
    }

    public void openURL(String url){
         driver.get(url);
    }
}
