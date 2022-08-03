package OtpTest;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import OtpPages.AccountSettingsAddressPage;
import OtpPages.LaunchPages;
import OtpPages.LoginPage;
import Utilities.GenericFunctions;
import Utilities.ServerManager;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;

public class TestAddress extends ServerManager {
	
	public AppiumDriver<MobileElement> driver;
	public GenericFunctions gf;
    public AccountSettingsAddressPage ashp;
    public LoginPage loginpage;
    public LaunchPages lp;
    
    @BeforeMethod
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
		
		
		loginpage = new LoginPage(driver);
		loginpage.clicksinginbutton();
		loginpage.enterusername("k.mounika18@gmail.com");
		loginpage.enterpassword("Mounika185@");
		loginpage.clickloginbutton();
		System.out.println("Login Successfully done");
   
    } //app launch   
  
    @Test (priority = 0)
    public void address() {
    	ashp = new AccountSettingsAddressPage(driver);
    	ashp.clickloginbutton1();
    	ashp.clickaccountsetting();
    	ashp.clicksms();
    	ashp.clickdont();
    	ashp.clickemail();
    	ashp.clicksaveprefencesbutton();
    	ashp.clickok();
    	ashp.clickbackbutton();
    /*	ashp.clickhometext();
    	ashp.clickedithometext();
    	ashp.enteraddress("Lakewood Ave SE At Richmond Ave SE (MARTA Stop ID 139044)");
    	ashp.selectaddress();
    	boolean actual = ashp.displaysame();
		String s = ashp.homeValidation();
		Assert.assertEquals(actual, true);
		Assert.assertEquals(s, "Lakewood Ave SE At Richmond Ave SE (MARTA Stop ID 139044)");
    	Utilities.Log.info("Address have saved successfully");
    	Assert.assertTrue(true);
    	ashp.clicksavebutton();
    	ashp.clickworktext();
    	ashp.clickeditworktext();
    	ashp.enterworkaddress("1605 S Ponce de Leon Ave NE, Atlanta, GA 30307, United States");
    	ashp.selectworkaddress();
    	boolean actual1 = ashp.displaysamework();
		String s1 = ashp.workValidation();
		Assert.assertEquals(actual1, true);
		Assert.assertEquals(s1, "1605 S Ponce de Leon Ave NE, Atlanta, GA 30307, United States");
    	ashp.clicksaveworkbutton();
    	Utilities.Log.info("Work Address have saved successfully");
    	Assert.assertTrue(true);
    	ashp.clickaddantheraddress();
    	ashp.newlocationplace();
    	ashp.enterlocationplace("Office");
    	ashp.clickaddaddressbar();
    	ashp.clicklocation();
    	ashp.enterlocation("265 Hill St SE, Atlanta, GA 30312-21ND, United States");
    	ashp.selectaddaddress();
    	boolean actual2 = ashp.findaddlocation();
		String s2 = ashp.addlocationValidation();
		Assert.assertEquals(actual2, true);
		Assert.assertEquals(s2, "265 Hill St SE, Atlanta, GA 30312-21ND, United States");
    	ashp.clickaddsave();
    	Assert.assertTrue(true);
		Utilities.Log.info("Anther Address have saved successfully");
		ashp.clickdelectoffice();
    	ashp.clicksaveprefencesbutton();
    	ashp.clickok();
    	ashp.clickbackbutton();  */
    }
}