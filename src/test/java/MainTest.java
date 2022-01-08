import org.testng.Assert;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import org.testng.reporters.jq.Main;
import pageobjects.GoogleTestPageObjects;

public class MainTest extends BaseTest{

    String expectedResult = "results";

    @Test
    public void mainTest() throws InterruptedException {
        System.out.println("Test Case Started");
        GoogleTestPageObjects googleTestPageObjects = new GoogleTestPageObjects(driver);
        googleTestPageObjects.enterDataInSearchQuery("Sayantan");
        String actualResult =  googleTestPageObjects.getSearchResultCountText();
        Assert.assertTrue(actualResult.contains(expectedResult));
        System.out.println(actualResult);
        System.out.println("Test Case Ended");
    }

}

