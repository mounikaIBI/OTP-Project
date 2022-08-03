package OtpTest;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import OtpPages.IconenblePage;
import OtpPages.LaunchPages;
import OtpPages.LoginPage;
import Utilities.ServerManager;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class TestIcons extends ServerManager{

	AppiumDriver<MobileElement> driver;
	IconenblePage ip;
	LoginPage loginpage;
	LaunchPages lp;
	
	 @BeforeTest
	    public void LaunchApp() throws MalformedURLException, InterruptedException {
			StartServer();
			
			DesiredCapabilities caps= new DesiredCapabilities();
			
			caps.setCapability(MobileCapabilityType.AUTOMATION_NAME,"UiAutomator2");
			
		    //caps.setCapability(MobileCapabilityType.DEVICE_NAME, "Galaxy A8(2018)");
			//caps.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
			//caps.setCapability(MobileCapabilityType.PLATFORM_VERSION, "12");
			//caps.setCapability(MobileCapabilityType.UDID, "5200592b431db5bf");
			caps.setCapability(MobileCapabilityType.APP, "C:\\IBI\\Appium Server GUI\\app-otp-releaseV1.1(47).apk");
			caps.setCapability(MobileCapabilityType.DEVICE_NAME, "Piexl 3");
			caps.setCapability(CapabilityType.PLATFORM_NAME, "Android");
			caps.setCapability(MobileCapabilityType.PLATFORM_VERSION, "12.0");
			//caps.setCapability("autoGrantPermissions", "true");
			caps.setCapability("appPackage", "com.ibigroup.mobile.otp.android"); 
			caps.setCapability("appActivity", "com.ibigroup.mobile.otp.android.ScreenSplashActivity");		
			caps.setCapability("autoAcceptAlerts", "true");
			URL url = new URL("http:\\127.0.0.1:4723/wd/hub");
			driver=new AppiumDriver<MobileElement> (url,caps);
			Thread.sleep(6000);	
			
			lp = new LaunchPages(driver);
			lp.clicklocationwhile();
			Utilities.Log.info("App Launch successfull");
	 }
	
	
	@Test
	public void Icons() throws InterruptedException {
		ip = new IconenblePage(driver);
		ip.clickmapview();
		ip.clickfrom();
		ip.clickfrom();
		ip.clickfromhere();
		ip.clickto();
		ip.clicktohere();
		ip.clickdisablebus();
		ip.clickplantrip1();
		Thread.sleep(3000);
		ip.validateItenaryList();
		ip.clickback();
		ip.clickenablebus();
		ip.clickdisabledrive();
		ip.clickplantrip2();
		Thread.sleep(3000);
		ip.validateItenaryList();
		ip.clickback();
		ip.clickdisablebus();
		ip.clickdisablewalk();
		ip.clickdisablebike();
		ip.clickdisablerental();
		ip.clickplantrip3();
		ip.validateItenaryList();
		ip.clickback();
		ip.clickenablebus();
		ip.clickenabledrive();
		ip.clickenablerental();
		ip.clickenablewalk();
		ip.clickenablebike();
		ip.clickreset();
		stopServer();
	}
}
