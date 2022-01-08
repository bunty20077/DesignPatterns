import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import utils.DriverEnum;
import utils.DriverSupplier;

public class BaseTest {

    protected WebDriver driver;

    @BeforeTest
    public void setup(){
        DriverEnum driverType = DriverEnum.SAFARI;
        driver = DriverSupplier.getValue(driverType);
    }

    @AfterTest
    public void tearDown(){
        driver.quit();
    }

}
