package utils;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeMethod;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class DriverWeb {

    public static AndroidDriver androidDriver;
    DesiredCapabilities capabilities = new DesiredCapabilities();//


    @BeforeMethod
    public void setUpApplication()  {
        try{
            capabilities.setCapability("deviceName", ConfigReader.getProperty("deviceName"));
            capabilities.setCapability("platformName", ConfigReader.getProperty("platformName"));
            capabilities.setCapability("platformVersion", ConfigReader.getProperty("platformVersion"));
            capabilities.setCapability("automationName",ConfigReader.getProperty("UiAutomator2"));

            capabilities.setCapability("browserName","chrome");

            androidDriver = new AndroidDriver(new URL("http://127.0.0.1:4723"),capabilities);

            androidDriver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

        }catch (MalformedURLException e){
            System.out.println("URL Exception: "+ e.getMessage());
        }
    }

}

