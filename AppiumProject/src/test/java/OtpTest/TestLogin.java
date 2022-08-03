package OtpTest;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import OtpPages.LaunchPages;
import OtpPages.LoginButtonPage;
import OtpPages.LoginPage;
import Utilities.ServerManager;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;

public class TestLogin extends ServerManager {
	
	public AppiumDriver<MobileElement> driver;
	LoginPage loginpage = new LoginPage(driver);
	public LoginButtonPage lbp;
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
		
	}   */  
	@BeforeMethod
	public void beforemethod() {
		
		
	}
	@BeforeClass
	public void beforemethod1() {
		
	}
	
		@Test (priority =0)
		public void login()  {
			
			loginpage.clicksinginbutton();
			loginpage.enterusername("k.mounika18@gmail");
			loginpage.enterpassword("Mounik185@");
			loginpage.clickloginbutton();
			System.out.println("Invalid username");
		}
			
			@Test (priority =1)
			public void login2()  {
			loginpage.enterusername("k.mounika18@gmail.com");
			loginpage.enterpassword("Mounik185");
			loginpage.clickloginbutton();
			System.out.println("Invalid password");
			}
		
			@Test (priority =2)
			public void login3()  {
			loginpage.enterusername("    ");
			loginpage.enterpassword("Mounik185@");
			loginpage.clickloginbutton();
			System.out.println("empty username");
			}
		
			@Test (priority =3)
			public void login4()  {
			loginpage.enterusername("k.mounika18@gmail.com");
			loginpage.enterpassword("     ");
			loginpage.clickloginbutton();
			System.out.println("empty password");
			}
		
	/*		@Test (priority =4)
			public void login5()  {
			
			loginpage.enterusername("k.mounika18@gmail");
			loginpage.enterpassword("Mounika");
			loginpage.clickloginbutton();
			System.out.println("both are invalid");
		
		@Test (priority =5)
		public void login6()  {
			
			loginpage.enterusername("      ");
			loginpage.enterpassword("   ");
			loginpage.clickloginbutton();
			System.out.println("both are empty");  
			} */
		
				@Test (priority =6)
				public void login7()  {
					
			loginpage.enterusername("k.mounika18@gmail.com");
			loginpage.enterpassword("Mounika185@");
			loginpage.clickloginbutton();
			System.out.println("Login successfull");
			
		}
	@AfterClass
	public void aftermethod1() {
	
	}
	@AfterMethod
	public void aftermethod() {	
		
	}
	
	}
	
