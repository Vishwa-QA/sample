package project.base;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

import org.openqa.selenium.remote.DesiredCapabilities;
import java.io.InputStream;
import java.net.URL;

import java.util.Properties;
import java.util.concurrent.TimeUnit;

public class BaseClass {

    public AndroidDriver<MobileElement> androidDriver;

    public void prerequisite() throws Exception {
        InputStream inputStream = Thread.currentThread()
                .getContextClassLoader()
                .getResourceAsStream("capabilities.properties");
        Properties desiredCapabilitiesProp = new Properties();
        desiredCapabilitiesProp.load(inputStream);
        if (androidDriver == null) {
            // Override
            if (System.getProperty("device.name") != null)
                desiredCapabilitiesProp.setProperty("device.name", System.getProperty("device.name"));
            if (System.getProperty("device.udid") != null)
                desiredCapabilitiesProp.setProperty("device.udid", System.getProperty("device.udid"));
            if (System.getProperty("appium.address") != null)
                desiredCapabilitiesProp.setProperty("appium.address", System.getProperty("appium.address"));
            if (System.getProperty("appium.system.port") != null)
                desiredCapabilitiesProp.setProperty("appium.system.port", System.getProperty("appium.system.port"));

            DesiredCapabilities capabilities = new DesiredCapabilities();
            capabilities.setCapability("deviceName", desiredCapabilitiesProp.getProperty("device.name"));
            capabilities.setCapability("udid", desiredCapabilitiesProp.getProperty("device.udid"));
            capabilities.setCapability("systemPort", desiredCapabilitiesProp.getProperty("appium.system.port"));
            capabilities.setCapability("deviceOrientation", "portrait");
            capabilities.setCapability("automationName", "uiautomator2");
            capabilities.setCapability("appPackage", "blibli.mobile.commerce");
            capabilities.setCapability("appActivity", "blibli.mobile.ng.commerce.core.init.view.SplashActivity");
            capabilities.setCapability("platformName", "Android");
            capabilities.setCapability("noReset", "true");
            androidDriver = new AndroidDriver<>(new URL(desiredCapabilitiesProp.get("appium.address").toString()), capabilities);
            androidDriver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        }
    }
    void postrequisite() {
        androidDriver = null;
    }

    public AndroidDriver<MobileElement> getDriver()
    {


        return androidDriver;
    }
}
