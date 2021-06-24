package com.mobile.testbase;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.remote.MobilePlatform;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.URL;

public class TestBase {

    public void getAppiumDriver(){
        DesiredCapabilities cap = new DesiredCapabilities();
        cap.setCapability(MobileCapabilityType.DEVICE_NAME,"R58N35NNPGA");
        cap.setCapability(MobileCapabilityType.PLATFORM_NAME, MobilePlatform.ANDROID);
        cap.setCapability(MobileCapabilityType.PLATFORM_VERSION,"10");
        cap.setCapability(MobileCapabilityType.APP_PACKAGE,"com.tdbank");
        cap.setCapability(MobileCapabilityType.APP_ACTIVITY,"com.td.dcts.android.us.app.SplashScreenActivity");

    }
}
