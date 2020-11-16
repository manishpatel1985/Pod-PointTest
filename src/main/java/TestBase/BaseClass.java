package TestBase;

import TestListeners.WebEventListener;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.openqa.selenium.support.events.WebDriverEventListener;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

public class BaseClass {

    public static WebDriver driver;
    public static Properties properties;
    public static String browser;
    public static EventFiringWebDriver e_driver;
    public static WebDriverEventListener eventListener;


    public BaseClass() {
    	try {
			properties = new Properties();
			FileInputStream inputStream = new FileInputStream(System.getProperty("user.dir")+"\\src\\main\\java\\config.properties");
			properties.load(inputStream);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
			
		}
		
	}


    public static void setup() {

        browser = System.getProperty("browser");

        System.out.println(" browser "+System.getProperty("browser"));

        /*
         * To Run the Test suite in the IDE please uncomment Line number 56.
         */
        String browser = properties.getProperty("browser");

        if (browser.equalsIgnoreCase("chrome")) {

            System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir") + "\\" + properties.getProperty("chrome_driver"));
            driver = new ChromeDriver();
        } else if (browser.equalsIgnoreCase("firefox")) {
            System.setProperty("webdriver.gecko.driver",System.getProperty("user.dir") + "\\" + properties.getProperty("firefox_driver"));
            driver = new FirefoxDriver();
        }
        
        e_driver = new EventFiringWebDriver(driver);
        eventListener = new WebEventListener();
        e_driver.register(eventListener);
        driver=e_driver;

        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait (10, TimeUnit.SECONDS);
        driver.get(properties.getProperty("url"));
    }

    public static void failedScreenShots(String methodname) {
        String datename = new SimpleDateFormat("yyyyMMDD").format(new Date());

        File screenshot=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        try {
            FileUtils.copyFile(screenshot, new File(System.getProperty("user.dir")+"\\target\\"
                    +methodname+datename+".png"));
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public String verifyTitle(String pagetitle) {
        String title= driver.getTitle();
        Assert.assertEquals(title, pagetitle);
        return title;
    }

    

}
