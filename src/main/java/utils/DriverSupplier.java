package utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.safari.SafariDriver;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Supplier;

public class DriverSupplier extends FooClass{

    protected static WebDriver driver;
    // Declare a Map with Integer as Key and Supplier as Value. Supplier is of String type.
    private static final Map<DriverEnum, Supplier<WebDriver>> driverMap = new HashMap<DriverEnum, Supplier<WebDriver>>();

    // Suppliers can be CHROMEDriver FIREFOXDrivers
    private static final Supplier<WebDriver> supplierChromeDriver = () -> {
        String message = "Hi I am Sayantan";
        System.out.println(message);
        System.setProperty("webdriver.chrome.driver", "/Users/sayantan_tarafdar/IdeaProjects/SeleniumDesignPatterns/src/main/resources/chromedriver");
        driver = new ChromeDriver();
        System.out.println(driver);
        return driver;
    };

    private static final Supplier<WebDriver> supplierSafariDriver = () -> {
        String message = "Hi I am Neon";
        System.out.println(message);
        driver = new SafariDriver();
        System.out.println(driver);
        return driver;
    };

    // Put on Suppliers in Map in static block so that no class instantiations are required.
    // Once the class in loaded into memory , this block of code will automatically called.
    static {
        driverMap.put(DriverEnum.CHROME, supplierChromeDriver);
        driverMap.put(DriverEnum.SAFARI, supplierSafariDriver);
    }

    public static final WebDriver getDriver(DriverEnum i) {
        if(driver==null){
            System.out.println("Driver is set to New Value");
            return driverMap.get(i).get();
        }
        System.out.println("Old Driver is Returned");
        return driverMap.get(i).get();
    }

    public WebDriver getInstance(){
        getInfo();
        return driver;
    }
}
