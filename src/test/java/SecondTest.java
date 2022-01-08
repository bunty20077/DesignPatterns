import org.testng.Assert;
import org.testng.annotations.Test;
import pageobjects.GoogleTestPageObjects;

public class SecondTest extends BaseTest{

    String expectedResult = "About";

    @Test
    public void mainTest() throws InterruptedException {
        System.out.println("Test Case Started");
        GoogleTestPageObjects googleTestPageObjects = new GoogleTestPageObjects(driver);
        googleTestPageObjects.enterDataInSearchQuery("Trisha");
        String actualResult =  googleTestPageObjects.getSearchResultCountText();
        Assert.assertTrue(actualResult.contains(expectedResult));
        System.out.println(actualResult);
        System.out.println("Test Case Ended");
    }
}
