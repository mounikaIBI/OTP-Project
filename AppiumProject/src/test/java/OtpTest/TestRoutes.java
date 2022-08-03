package OtpTest;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import OtpPages.LaunchPages;
import OtpPages.LoginPage;
import OtpPages.SaveTripPage;
import OtpPages.RoutesPage;
import OtpPages.TripPage;
import Utilities.GenericFunctions;
import Utilities.ServerManager;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class TestRoutes extends ServerManager {

	public static AppiumDriver<MobileElement> driver;
	public GenericFunctions gf;
	public LoginPage loginpage;
	public LaunchPages lp;
	public RoutesPage rp;
	
	
	
	@BeforeMethod
	public void LaunchApp() throws MalformedURLException, InterruptedException {
		StartServer();
		DesiredCapabilities caps= new DesiredCapabilities();
		caps.setCapability(MobileCapabilityType.AUTOMATION_NAME,"UiAutomator2");
		caps.setCapability(MobileCapabilityType.DEVICE_NAME, "Piexl3");
		caps.setCapability(CapabilityType.PLATFORM_NAME, "Android");
		caps.setCapability(MobileCapabilityType.PLATFORM_VERSION, "12.0");
    //	caps.setCapability(MobileCapabilityType.APP, "C:\\IBI\\Appium Server GUI\\app-otp-releaseV1.1(47).apk");
		caps.setCapability("autoGrantPermissions", "true");
		caps.setCapability("appPackage", "com.ibigroup.mobile.otp.android"); 
		caps.setCapability("appActivity", "com.ibigroup.mobile.otp.android.ScreenSplashActivity");		
		caps.setCapability("autoAcceptAlerts", "true");
		URL url = new URL("http:\\127.0.0.1:4723/wd/hub");
		driver = new AndroidDriver<MobileElement>(url,caps);
		Thread.sleep(6000);	
	}
	
	@Test
	public void routes() {
		rp = new RoutesPage(driver);
		rp.clickroutesbutton();
		rp.drag();
	//	rp.getroutescount();
		rp.scroll();
     // rp.getRouteCount();
		stopServer();
	}
	
}
