package sampletestes;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class InstallApp {

	@SuppressWarnings("unlikely-arg-type")
	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		
		DesiredCapabilities caps= new DesiredCapabilities();
		caps.setCapability(MobileCapabilityType.AUTOMATION_NAME,"Appium");
		caps.setCapability(MobileCapabilityType.DEVICE_NAME, "Piexl3");
		caps.setCapability(CapabilityType.PLATFORM_NAME, "Android");
		caps.setCapability(MobileCapabilityType.PLATFORM_VERSION, "11.0");
		//caps.setCapability(MobileCapabilityType.APP, "C:\\IBI\\Appium Server GUI\\app-otp-releaseV1.1(47).apk");
		
		caps.setCapability("autoGrantPermissions", "true");
		caps.setCapability("appPackage", "com.ibigroup.mobile.otp.android"); 
		caps.setCapability("appActivity", "com.ibigroup.mobile.otp.android.ScreenSplashActivity");		
		caps.setCapability("autoAcceptAlerts", "true");
		
		URL url = new URL("http:\\127.0.0.1:8200/wd/hub");
		
		AndroidDriver<MobileElement> driver = new AndroidDriver<MobileElement>(url,caps);
		
		Thread.sleep(5000);
	
		//singIn
		
	      driver.findElementById("com.ibigroup.mobile.otp.android:id/iv_tab_sign_in").click();
	      System.out.println("open the application");
	      Thread.sleep(4000);
	      
		WebElement username = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.RelativeLayout[2]/android.widget.LinearLayout[2]/android.widget.RelativeLayout/android.widget.RelativeLayout/android.widget.LinearLayout[1]/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.EditText"));
		username.click();
		username.sendKeys("chengling.huang@ibigroup.com");
	    
		WebElement password = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.RelativeLayout[2]/android.widget.LinearLayout[2]/android.widget.RelativeLayout/android.widget.RelativeLayout/android.widget.LinearLayout[2]/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.EditText"));
		password.click();
		password.sendKeys("Aa12345678!");
		
		WebElement login = driver.findElement(By.id("com.ibigroup.mobile.otp.android:id/com_auth0_lock_title"));
		login.click();
		
		Thread.sleep(5000);
		
		WebElement afterloginbutton = driver.findElementById("com.ibigroup.mobile.otp.android:id/tv_user_name");
		boolean visiblity = afterloginbutton.isDisplayed();
		
		System.out.println(visiblity);
		Thread.sleep(5000);
		if(afterloginbutton.isDisplayed())
		{
			System.out.println(afterloginbutton.getText()+": singin sucessfully");
			
		}
		else
			{
				System.out.println("Not displayed");
				
			}
		
	    Thread.sleep(5000);
	    
	   WebElement mytrips = driver.findElement(By.id("com.ibigroup.mobile.otp.android:id/iv_tab_my_trips"));
	   mytrips.click();
	   Thread.sleep(5000);
	   // saved trip page
	  
	   // pause Button
	   
	   WebElement pausebutton = driver.findElement(By.id("com.ibigroup.mobile.otp.android:id/iv_pause_resume"));
	   pausebutton.click();
	  
	   Thread.sleep(2000);
	   // Edit Button
	  
	  WebElement editbutton = driver.findElement(By.id("com.ibigroup.mobile.otp.android:id/ll_edit"));
	   editbutton.click();
	  
	   Thread.sleep(2000);
	   //Edit Saved trip
	   
	  WebElement backarrow =driver.findElement(By.id("com.ibigroup.mobile.otp.android:id/iv_back"));
	  backarrow.click();
	  
	   //Resume button
	  
	  WebElement resumebutton = driver.findElement(By.id("com.ibigroup.mobile.otp.android:id/iv_pause_resume"));
	  resumebutton.click();
	  
	   Thread.sleep(2000);
	   //Account
	   
	   WebElement accountbutton = driver.findElement(By.id("com.ibigroup.mobile.otp.android:id/tv_user_name"));
	   accountbutton.click();
	    
	   //Account settings button
	   
	   WebElement accountsettings = driver.findElement(By.id("com.ibigroup.mobile.otp.android:id/tv_my_account"));
	   accountsettings.click();
	   
	   Thread.sleep(5000);
	   
	   WebElement homeaddress = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.ScrollView/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.LinearLayout/android.widget.LinearLayout"));
	   homeaddress.click();
	   // edit home , home address
	   
	   WebElement edithomeaddress = driver.findElement(By.id("com.ibigroup.mobile.otp.android:id/tv_new_location"));
	   edithomeaddress.click();
	   Thread.sleep(2000);
	   
	   WebElement homeaddress1 = driver.findElement(By.id("com.ibigroup.mobile.otp.android:id/at_search"));
	   homeaddress1.click();
	   homeaddress1.sendKeys("Lakewood Ave SE At Richmond Ave SE (MARTA Stop ID 139044)");
	   Thread.sleep(4000);
	   WebElement selecthomeaddress = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.ListView/android.widget.LinearLayout[1]/android.widget.TextView"));
	   selecthomeaddress.click();
	   Thread.sleep(2000);
	   WebElement samehomeaddress = driver.findElement(By.id("com.ibigroup.mobile.otp.android:id/tv_new_location"));
	   samehomeaddress.equals(homeaddress1);
	    boolean visiblity1 = samehomeaddress.isDisplayed();
	   System.out.println(visiblity1);
	  
	   if(samehomeaddress.isDisplayed())
	   {
	   System.out.println(samehomeaddress.getText());
	   }
	   else {
		   System.out.println("Invalid address");
	   }
	   
	   WebElement savehomeaddress = driver.findElement(By.id("com.ibigroup.mobile.otp.android:id/tv_save"));
	   savehomeaddress.click();
	   
	   //work address
	   Thread.sleep(3000);
	   
	   WebElement clickworkaddress = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.ScrollView/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.LinearLayout/android.widget.LinearLayout"));
	   clickworkaddress.click();
	   
	   WebElement editwork =driver.findElement(By.id("com.ibigroup.mobile.otp.android:id/tv_new_location"));
	   editwork.click();
	   Thread.sleep(2000);
	   
	   WebElement workaddress = driver.findElement(By.id("com.ibigroup.mobile.otp.android:id/at_search"));
	   workaddress.click();
	   workaddress.sendKeys("1605 S Ponce de Leon Ave NE,Atlanta,GA 30307,United States");
	   
	   Thread.sleep(4000);
	   
	   WebElement selectworkaddress = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.ListView[1]/android.widget.LinearLayout[1]/android.widget.TextView"));
	   selectworkaddress.click();
	   Thread.sleep(2000);
	   
	   WebElement displayaddress = driver.findElement(By.id("com.ibigroup.mobile.otp.android:id/tv_new_location"));
	   displayaddress.equals(workaddress);
	   boolean visibilty2 = displayaddress.isDisplayed();
	   System.out.println(visibilty2);
	   
	   if(displayaddress.isDisplayed()) {
		   System.out.println(displayaddress.getText());
	   }
	   else
	   {
		   System.out.println("Text not matched");
		  
	   }
	   
	   WebElement saveworkaddress = driver.findElement(By.id("com.ibigroup.mobile.otp.android:id/tv_save"));
	   saveworkaddress.click();
	   
	   driver.quit();
	   
	   // Add anther address
	   
	   WebElement clickAddotheraddress = driver.findElement(By.id("com.ibigroup.mobile.otp.android:id/ll_add_another_place"));
	   clickAddotheraddress.click();
	   
	   WebElement titlematch = driver.findElement(By.id("com.ibigroup.mobile.otp.android:id/tv_title"));
	   titlematch.equals("Account Settings");
	   boolean display = titlematch.isDisplayed();
	   System.out.println(display);
	   
	   if (titlematch.isDisplayed()) {
		   System.out.println(titlematch.getText()+": Title matched");
	   }
	   else
	   {
		   System.out.println("Title dose not match");
		   
	   }
	   
	   WebElement subtitle = driver.findElement(By.id("com.ibigroup.mobile.otp.android:id/tv_new_location_title"));
	   subtitle.equals("Add a new place");
	   boolean displaytext = subtitle.isDisplayed();
	   System.out.println(displaytext);
	    if (subtitle.isDisplayed()) {
	    	System.out.println(subtitle.getText()+": Subtitle matched");
	    }
	    else
	    {
	    	System.out.println("Subtitle dose not match");
	    }
	    
	   WebElement addplace = driver.findElement(By.id("com.ibigroup.mobile.otp.android:id/et_add_new_location"));
	   addplace.click();
	   addplace.sendKeys("Office Address");
	   
	   
	   
	 	}

}
