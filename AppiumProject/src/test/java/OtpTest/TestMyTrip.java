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
import OtpPages.MyTripPage;
import Utilities.ServerManager;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class TestMyTrip extends ServerManager {

	public static AppiumDriver driver;
	public MyTripPage mtp;
	public LoginPage loginpage;
	public LaunchPages lp;
	
	@BeforeMethod

	public void LaunchApp() throws MalformedURLException, InterruptedException {
		
		StartServer();
		
		DesiredCapabilities caps= new DesiredCapabilities();
		caps.setCapability(MobileCapabilityType.AUTOMATION_NAME,"UiAutomator2");
		caps.setCapability(MobileCapabilityType.DEVICE_NAME, "Piexl3");
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
	public void mytrip() throws InterruptedException {
		mtp = new MyTripPage(driver);
		mtp.clicktrip();
		boolean actual = mtp.Titlecheck();
		String s =mtp.text();
		Assert.assertEquals(actual, true);
		Assert.assertEquals(s, "Saved Trips");
		System.out.println(s + ":Saved Trips");
		mtp.clickselect();
		mtp.clickpause();
		mtp.clickedit();
		boolean actual1 = mtp.checktitle();
		String s1 =mtp.titletext();
		Assert.assertEquals(actual1, true);
		Assert.assertEquals(s1, "Edit saved trip");
		System.out.println(s1 + ":Edit saved trip");
		mtp.clickresume();
		mtp.clickmyjourney();
		mtp.clickselectjourney();
		mtp.clicktransfer();
		mtp.clickselecttransfer();
		mtp.clicktime1();
		mtp.clickselecttime1();
		Thread.sleep(2000);
		mtp.clickadv();
		mtp.clickmonitor();
		mtp.clicktime2();
		mtp.clicksave();
		mtp.clickok();
		mtp.clickdelete();
		mtp.clickdeleteok();
		mtp.clickplan();
		stopServer();
		
	}
}
