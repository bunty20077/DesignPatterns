import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import utils.DriverEnum;
import utils.DriverSupplier;

public class BaseTest {

    protected WebDriver driver;

    @BeforeClass
    public void setup(){
        DriverEnum driverType = DriverEnum.SAFARI;
        driver = DriverSupplier.getDriver(driverType);
    }

    @AfterClass
    public void tearDown(){
        driver.quit();
    }

}
