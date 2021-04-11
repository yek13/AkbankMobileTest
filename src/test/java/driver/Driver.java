package driver;

import com.thoughtworks.gauge.AfterSuite;
import com.thoughtworks.gauge.BeforeSuite;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.remote.MobilePlatform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.URL;
import java.util.concurrent.TimeUnit;

public class Driver {

    // Holds the WebDriver instance
    public static AppiumDriver appiumDriver;


    // Initialize a webDriver instance of required browser
    // Since this does not have a significance in the application's business domain, the BeforeSuite hook is used to instantiate the webDriver
    @BeforeSuite
    public void initializeDriver() throws Exception {
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, MobilePlatform.ANDROID);
        capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "Android");
        //capabilities.setCapability(MobileCapabilityType.VERSION, "1.0");
        capabilities.setCapability(MobileCapabilityType.UDID, "76d6fc15");
        capabilities.setCapability(AndroidMobileCapabilityType.APP_PACKAGE, "com.akbank.android.apps.akbank_direkt");
        capabilities.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY, "com.akbank.akbankdirekt.ui.dashboard.DashBoardActivity");
        capabilities.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, 250);

        URL url = new URL("http://localhost:4723/wd/hub");
        appiumDriver = new AppiumDriver(url, capabilities);
        appiumDriver.manage().timeouts().implicitlyWait(60L, TimeUnit.SECONDS);
    }

    // Close the webDriver instance
    @AfterSuite
    public void closeDriver(){
        appiumDriver.quit();
    }

}
