package OtpTest;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import OtpPages.AccountSettingsAddressPage;
import OtpPages.IconenblePage;
import OtpPages.LaunchPages;
import OtpPages.LoginButtonPage;
import OtpPages.LoginPage;
import OtpPages.MyTripPage;
import OtpPages.SaveTripPage;
import OtpPages.RoutesPage;
import OtpPages.StopTripPage;
import OtpPages.StopTripViewerPage;
import OtpPages.TripPage;
import Utilities.ServerManager;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.remote.MobileCapabilityType;

public class RunTests2 extends ServerManager {

	AppiumDriver<MobileElement> driver;

	public LoginPage loginpage;
	public LoginButtonPage lbp;
	public AccountSettingsAddressPage ashp;
	public SaveTripPage ptp; 
	public TripPage tp;
	public MyTripPage mtp;
	public StopTripPage stp;
	public LaunchPages lp;
	public StopTripViewerPage stvp;
	public IconenblePage ip;
	public RoutesPage rp;



	@BeforeClass
	public void LaunchApp() throws MalformedURLException, InterruptedException {

		StartServer();

		DesiredCapabilities caps= new DesiredCapabilities();

		caps.setCapability(MobileCapabilityType.AUTOMATION_NAME,"UiAutomator2");

		//caps.setCapability(MobileCapabilityType.DEVICE_NAME, "Galaxy A8(2018)");
		//caps.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
		//caps.setCapability(MobileCapabilityType.PLATFORM_VERSION, "9");
		//caps.setCapability(MobileCapabilityType.UDID, "5200592b431db5bf");
		caps.setCapability(MobileCapabilityType.APP, "C:\\IBI\\Appium Server GUI\\app-otp-releaseV1.1(47).apk");
		caps.setCapability(MobileCapabilityType.DEVICE_NAME, "Piexl3");
		caps.setCapability(CapabilityType.PLATFORM_NAME, "Android");
		caps.setCapability(MobileCapabilityType.PLATFORM_VERSION, "12.0");
		caps.setCapability("autoGrantPermissions", "true");
		caps.setCapability("appPackage", "com.ibigroup.mobile.otp.android"); 
		caps.setCapability("appActivity", "com.ibigroup.mobile.otp.android.ScreenSplashActivity");		
		caps.setCapability("autoAcceptAlerts", "true");
		URL url = new URL("http:\\127.0.0.1:4723/wd/hub");
		driver=new AppiumDriver<MobileElement> (url,caps);
		Thread.sleep(6000);	
		
	}

	
	@Test (priority = 0)
	public void Icons() throws InterruptedException {
		Thread.sleep(3000);
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
		Thread.sleep(3000);
		ip.validateItenaryList();
		ip.clickback();
		ip.clickenablebus();
		ip.clickenabledrive();
		ip.clickenablerental();
		ip.clickenablewalk();
		ip.clickenablebike();
		ip.clickreset();
		Utilities.Log.info("Icons disable and enable has successfully completed");
		stopServer();
	}
	@Test (priority = 1)
	public void routes() {
		rp = new RoutesPage(driver);
		rp.clickroutesbutton();
		rp.drag();
	//	rp.getroutescount();
		rp.scroll();
     // rp.getRouteCount();
}
}
