package OtpTest;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import OtpPages.LaunchPages;
import OtpPages.LoginPage;
import OtpPages.StopTripViewerPage;
import OtpPages.StopviewerPage;
import Utilities.ServerManager;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class TestStopTrip extends ServerManager {
 
	public static AppiumDriver<MobileElement> driver;
	public LaunchPages lp;
	LoginPage loginpage;
	StopTripViewerPage stvp;
	
	@BeforeClass
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
	Utilities.Log.info("Login Successfully done");
	}     
	
	@Test
	public void stoptrip() throws InterruptedException {
		stvp = new StopTripViewerPage(driver);
		stvp.clickmapview();
		stvp.clickfrom();
		stvp.clickfromhere();
		stvp.clickto();
		stvp.clicktohere();
		stvp.clickplantrip();
		stvp.clickbestoption();
		stvp.clickwalktime();
		Thread.sleep(2000);
		stvp.clickItinerary();
		stvp.dragAndDrop();
		stvp.clickstopviewer();
		stvp.clicknextarriaval();
		stvp.clickschedual();
		stvp.clickback();
		stvp.clicktripviewer();
		stvp.clickbackbutton();
		stvp.clickbackpage();
		stvp.clickbackbutton2();
		stvp.clickreset();
		stopServer();
	}
	
}
