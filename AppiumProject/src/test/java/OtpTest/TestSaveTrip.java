package OtpTest;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import OtpPages.LaunchPages;
import OtpPages.LoginPage;
import OtpPages.SaveTripPage;
import Utilities.GenericFunctions;
import Utilities.ServerManager;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class TestSaveTrip extends ServerManager {
	public static AppiumDriver<MobileElement> driver;

	public SaveTripPage stp;
	public GenericFunctions gf;
	public LoginPage loginpage;
	public LaunchPages lp;
	
	@BeforeMethod

	public void LaunchApp() throws MalformedURLException, InterruptedException {
		StartServer();
		
		DesiredCapabilities caps= new DesiredCapabilities();
		caps.setCapability(MobileCapabilityType.AUTOMATION_NAME,"UiAutomator2");
		caps.setCapability(MobileCapabilityType.DEVICE_NAME, "Piexl 3");
		caps.setCapability(CapabilityType.PLATFORM_NAME, "Android");
		caps.setCapability(MobileCapabilityType.PLATFORM_VERSION, "12.0");
    //	caps.setCapability(MobileCapabilityType.APP, "C:\\IBI\\Appium Server GUI\\app-otp-releaseV1.1(47).apk");
	//	caps.setCapability("autoGrantPermissions", "true");
		caps.setCapability("appPackage", "com.ibigroup.mobile.otp.android"); 
		caps.setCapability("appActivity", "com.ibigroup.mobile.otp.android.ScreenSplashActivity");		
		caps.setCapability("autoAcceptAlerts", "true");
		URL url = new URL("http:\\127.0.0.1:4723/wd/hub");
		driver = new AndroidDriver<MobileElement>(url,caps);
		Thread.sleep(6000);	
		
		lp = new LaunchPages(driver);
		lp.clicklocationwhile();
		Utilities.Log.info("App Launch successfull");
	
		loginpage = new LoginPage(driver);
		loginpage.clicksinginbutton();
		loginpage.enterusername("k.mounika18@gmail.com");
		loginpage.enterpassword("Mounika185@");
		loginpage.clickloginbutton();
		System.out.println("Login Successfully done");
	}
	
	@Test
	public void SaveTrip () throws InterruptedException {
	stp = new SaveTripPage(driver);
	stp.clickmapview();
	stp.clickfrom();
	stp.clickfromhere();
	stp.clickto();
	stp.clicktohere();
	stp.clickplantrip();
	Thread.sleep(9000);
	stp.clickonselecteditinerary();
	Thread.sleep(2000);
	stp.dragAnddrop();
	Thread.sleep(2000);
	stp.clickstaricon();
	stp.clicktripname();
	stp.entername("Testsample");
	boolean actual = stp.readtext();
	String s = stp.stringvalidation();
	Assert.assertEquals(actual, true);
	Assert.assertEquals(s,"What days do you take this trip?");
	System.out.println(s +":What days do you take this trip?");
	stp.clickday1();
	stp.clickday2();
	stp.clickday3();
    stp.clickday4();
	stp.clickday5();
//	stp.clickday6();
//	stp.clickday7();
	stp.clicksavebutton();
	Thread.sleep(4000);
	stp.selectpopup();
	stp.clickback();
	stp.backarrow();
	stp.referesh();
	stopServer();
		
}
}
