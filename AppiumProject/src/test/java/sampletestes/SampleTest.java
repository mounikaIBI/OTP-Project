package sampletestes;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;

public class SampleTest {

	public static AppiumDriver<MobileElement> driver;
	public static void main(String[] args) throws MalformedURLException {
		DesiredCapabilities caps = new DesiredCapabilities();
		caps.setCapability(MobileCapabilityType.DEVICE_NAME, "Galaxy A8(2018)");
		caps.setCapability(CapabilityType.PLATFORM_NAME, "Android");
		caps.setCapability(MobileCapabilityType.PLATFORM_VERSION, "9");
		caps.setCapability("autoGrantPermissions", "true");
		caps.setCapability(MobileCapabilityType.APP,"app.getAbsolutePath()");
		caps.setCapability(CapabilityType.ACCEPT_INSECURE_CERTS, "true");
		//caps.setCapability(MobileCapabilityType.BROWSER_NAME, "chrome");
		caps.setCapability(MobileCapabilityType.UDID, "5200592b431db5bf");
		
		caps.setCapability("appPackage", "com.swaglabsmobileapp"); 
		caps.setCapability("appActivity", "com.swaglabsmobileapp.MainActivity");			
		driver = new AppiumDriver<MobileElement>(new URL("http://localhost:4725/wd/hub"), caps);
	//driver.quit();

	}

}