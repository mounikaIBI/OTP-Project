package OtpTest;
import java.net.MalformedURLException;
import java.net.URL;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import OtpPages.AccountSettingsAddressPage;
import OtpPages.IconenblePage;
import OtpPages.LaunchPages;
import OtpPages.LayerMenuPage;
import OtpPages.LoginButtonPage;
import OtpPages.LoginPage;
import OtpPages.MyTripPage;
import OtpPages.SaveTripPage;
import OtpPages.StopTripPage;
import OtpPages.StopTripViewerPage;
import OtpPages.TripPage;
import Utilities.ServerManager;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.remote.MobileCapabilityType;

public class RunTests1 extends ServerManager{

	AppiumDriver<MobileElement> driver;

	public LoginPage loginpage;
	public LoginButtonPage lbp;
	public AccountSettingsAddressPage ashp;
	public SaveTripPage st; 
	public TripPage tp;
	public MyTripPage mtp;
	public StopTripPage stp;
	public LaunchPages lp;
	public StopTripViewerPage stvp;
	public IconenblePage ip;
	public LayerMenuPage lmp;



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

	}

/*	@Test (priority =0)
	public void login1()  {
		loginpage = new LoginPage(driver);
		loginpage.clicksinginbutton();
		loginpage.enterusername("k.mounika18@gmail");
		loginpage.enterpassword("Mounika185@");
		loginpage.clickloginbutton();
		Utilities.Log.info("Invalid username");
	}

		@Test (priority =1)
		public void login2()  {
		loginpage.enterusername("k.mounika18@gmail.com");
		loginpage.enterpassword("Mounika185");
		loginpage.clickloginbutton();
		Utilities.Log.info("Invalid password");
		}

		@Test (priority =2)
		public void login3()  {
		loginpage.enterusername("    ");
		loginpage.enterpassword("Mounika185@");
		loginpage.clickloginbutton();
		Utilities.Log.info("empty username");
		}

		@Test (priority =3)
		public void login4()  {
		loginpage.enterusername("k.mounika18@gmail.com");
		loginpage.enterpassword("     ");
		loginpage.clickloginbutton();
		Utilities.Log.info("empty password");
		} */

		@Test (priority =4)
		public void login5()  {
		loginpage = new LoginPage(driver);
		loginpage.clicksinginbutton();
		loginpage.enterusername("k.mounika18@gmail.com");
		loginpage.enterpassword("Mounika185@");
		loginpage.clickloginbutton();
		Utilities.Log.info("Login successfull");
	}
	@Test(priority =5)
	public void loginbuttonValidation() {
		lbp = new LoginButtonPage(driver);
		boolean actual = lbp.validysingin();
		String s = lbp.StringValidation();
		Assert.assertEquals(actual, true);
		Assert.assertEquals(s, "K.");
		Utilities.Log.info(s +":validation successfully");
	}
	
	@Test (priority =6)
	public void layermenu() throws InterruptedException {
		lmp = new LayerMenuPage(driver);
		lmp.clicklayermenu();
		lmp.clickselectpark();
		lmp.clickselectsatellite();
		lmp.clickslecttransit();
		lmp.clicklayerclose();
		Thread.sleep(3000);
		lmp.clicklayeropen();
		lmp.clickselectstreet();
		lmp.clickselecttransit2();
		lmp.clicklayerclose2();
	}
	
	@Test (priority = 7)
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
	
	@Test (priority = 8)
	public void trip () throws InterruptedException {
		tp = new TripPage(driver);
		Thread.sleep(3000);
		tp.clickmap();
		tp.clickmapfrom();
		tp.clickmapfrom();
		tp.clickfromhere();
		Thread.sleep(2000);
		tp.clickmapto();
		tp.clicktohere();
		tp.clickplantrip();
		Thread.sleep(9000);
		tp.clickonselecteditinerary();
		Thread.sleep(2000);
		tp.dragAnddrop();
		tp.clickback();
		tp.clickback();
		tp.clickreset();
		Utilities.Log.info("Plantrip has successfull"); 
		
	} 
	

	@Test(priority = 9)
	public void SaveTrip () throws InterruptedException {
		st = new SaveTripPage(driver);
		st.clickmapview();
		st.clickfrom();
		st.clickfromhere();
		st.clickto();
		st.clicktohere();
		st.clickplantrip();
		Thread.sleep(9000);
		st.clickonselecteditinerary();
		Thread.sleep(2000);
		st.dragAnddrop();
		Thread.sleep(2000);
		st.clickstaricon();
		st.clicktripname();
		st.entername("Testsample");
		boolean actual = st.readtext();
		String s = st.stringvalidation();
		Assert.assertEquals(actual, true);
		Assert.assertEquals(s,"What days do you take this trip?");
		System.out.println(s +":What days do you take this trip?");
		st.clickday1();
		st.clickday2();
		st.clickday3();
	    st.clickday4();
		st.clickday5();
//		st.clickday6();
//		st.clickday7();
		st.clicksavebutton();
		Thread.sleep(4000);
		st.selectpopup();
		st.clickback();
		st.backarrow();
		st.referesh();
		Utilities.Log.info("Plantrip and saving the trip has successfull");
	}   
	
	@Test (priority = 10)
	public void mytrip() throws InterruptedException {
		Thread.sleep(3000);
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
		Utilities.Log.info("Editing of the trip has success");
		
	}
/*	@Test (priority = 11)
	public void stoptrip() throws InterruptedException {
		stvp = new StopTripViewerPage(driver);
		stvp.clickmapview();
		stvp.clickfrom();
		stvp.clickfromhere();
		stvp.clickto();
		stvp.clicktohere();
		stvp.clickplantrip();
		Thread.sleep(3000);
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
	}        */
}


