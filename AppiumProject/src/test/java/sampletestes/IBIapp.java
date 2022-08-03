package sampletestes;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class IBIapp {

	public static AppiumDriver<MobileElement> driver;
	public static void main (String[] args) throws MalformedURLException, InterruptedException {
		
		DesiredCapabilities caps = new DesiredCapabilities();
		
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
		
		AndroidDriver<WebElement> driver = new AndroidDriver<WebElement>(url,caps);
		
		Thread.sleep(5000);
		
		//driver.findElementById("com.android.permissioncontroller:id/permission_allow_foreground_only_button").click();
		
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
	
	}
	

}
