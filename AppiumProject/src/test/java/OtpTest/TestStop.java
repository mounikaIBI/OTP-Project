package OtpTest;

import java.net.MalformedURLException;
import java.net.URL;

import org.apache.commons.logging.Log;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import OtpPages.LaunchPages;
import OtpPages.LoginPage;
import OtpPages.StopTripPage;
import OtpPages.TripPage;
import Utilities.ServerManager;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class TestStop extends ServerManager {

	AppiumDriver<MobileElement> driver;
	LoginPage loginpage;
	StopTripPage stp;
	public LaunchPages lp;
	
	@BeforeClass
	public void LaunchApp() throws MalformedURLException, InterruptedException {

		StartServer();

		DesiredCapabilities caps= new DesiredCapabilities();

		caps.setCapability(MobileCapabilityType.AUTOMATION_NAME,"UiAutomator2");

		//caps.setCapability(MobileCapabilityType.DEVICE_NAME, "Galaxy A8(2018)");
		//caps.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
		//caps.setCapability(MobileCapabilityType.PLATFORM_VERSION, "9");
		//caps.setCapability(MobileCapabilityType.UDID, "5200592b431db5bf");
	//	caps.setCapability(MobileCapabilityType.APP, "C:\\IBI\\Appium Server GUI\\app-otp-releaseV1.1(52).apk");
		caps.setCapability(MobileCapabilityType.DEVICE_NAME, "Piexl 3");
		caps.setCapability(CapabilityType.PLATFORM_NAME, "Android");
		caps.setCapability(MobileCapabilityType.PLATFORM_VERSION, "12.0");
	//	caps.setCapability("autoGrantPermissions", "true");
		caps.setCapability("appPackage", "com.ibigroup.mobile.otp.android"); 
		caps.setCapability("appActivity", "com.ibigroup.mobile.otp.android.ScreenSplashActivity");		
		caps.setCapability("autoAcceptAlerts", "true");
		URL url = new URL("http:\\127.0.0.1:4723/wd/hub");
		driver=new AppiumDriver<MobileElement> (url,caps);
		Thread.sleep(6000);	
		
		lp = new LaunchPages(driver);
		lp.clicklocationwhile();
		Utilities.Log.info("App Launch successfull");

		loginpage = new LoginPage(driver);
		loginpage.clicksinginbutton();
		loginpage.enterusername("k.mounika18@gmail.com");
		loginpage.enterpassword("Mounika185@");
		loginpage.clickloginbutton();
		System.out.println("Login successfull");
	}   
	
	@Test
	public void stop () throws InterruptedException {
	stp = new StopTripPage(driver);
	stp.clickmap();
	Utilities.Log.info("Trip Test Cases");
	Thread.sleep(3000);
	stp.from();
	stp.clickfrom();
	Thread.sleep(2000);
	stp.to();
	stp.clickto();
	stp.clickcar();
	stp.clickbike();
	stp.clicksetting();
	stp.clickrailbutton();
	stp.clickmax();
	stp.clickdist();
	stp.clickspeed();
	stp.clickselect();
	stp.clicksettingok();
	stp.clicksearchdatetime();
	stp.clickarrived();
	stp.clickdate();
	stp.clickselectdate();
	stp.clickok();
	stp.clicktime();
	stp.clicktimehr();
	stp.clicktimemin();
	stp.clicksetok();
	stp.clicktimesave();
	stp.clickplantrip();
	stp.clickselecttrip();
	stp.draganddrop();
	stp.clickdownarrow();
	stp.clickbackpage();
	stp.clickbackbutton();
	stp.clickenabledrive();
	stp.clickenablebike();
	stp.clickreset();
	stopServer();
}
}
