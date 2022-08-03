package OtpTest;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Assert;

import OtpPages.LaunchPages;
import OtpPages.LoginButtonPage;
import Utilities.ServerManager;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.remote.MobileCapabilityType;

public class TestLoginButton extends ServerManager {
	
	public static AppiumDriver<MobileElement> driver;
	public LoginButtonPage lbp = new LoginButtonPage(driver);;
	public LaunchPages lp;

/*	@BeforeTest
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
		
	}     */
	
	@BeforeMethod
	public void before() {
		
	}
	@BeforeClass
	public void before1() {
		
	}
	
	@Test
	public void loginbuttonValidation() {
		lbp = new LoginButtonPage(driver);
		boolean actual = lbp.validysingin();
		String s = lbp.StringValidation();
		Assert.assertEquals(actual, true);
		Assert.assertEquals(s, "CH");
	}
	@AfterClass
	public void after() {
		
	}
	@AfterMethod
	public void after1() {
	
			}
		
}
