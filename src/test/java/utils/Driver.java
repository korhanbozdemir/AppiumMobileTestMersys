package utils;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeTest;

import java.net.MalformedURLException;
import java.net.URL;

public class Driver {

    public static AndroidDriver<AndroidElement> androidDriver;
    DesiredCapabilities capabilities = new DesiredCapabilities();//


    @BeforeTest
    public void setUpApplication()  {
        try{
            capabilities.setCapability("deviceName", ConfigReader.getProperty("deviceName"));
            capabilities.setCapability("platformName", ConfigReader.getProperty("platformName"));
            capabilities.setCapability("platformVersion", ConfigReader.getProperty("platformVersion"));
            capabilities.setCapability("automationName",ConfigReader.getProperty("UiAutomator2"));
            capabilities.setCapability("app",System.getProperty("user.dir")+ConfigReader.getProperty("app"));

            androidDriver = new AndroidDriver<AndroidElement>(new URL("http://127.0.0.1:4723"),capabilities);

        }catch (MalformedURLException e){
            System.out.println("URL Exception: "+ e.getMessage());
        }
    }

}
