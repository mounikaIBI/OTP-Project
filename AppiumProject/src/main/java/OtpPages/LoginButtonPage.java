package OtpPages;
import org.openqa.selenium.support.PageFactory;

import Utilities.GenericFunctions;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class LoginButtonPage {
	
	protected AppiumDriver<MobileElement> driver;
	GenericFunctions gf;
	
	
	@AndroidFindBy (id="com.ibigroup.mobile.otp.android:id/tv_user_name")
	private MobileElement singin;
	

  
 public LoginButtonPage (AppiumDriver<MobileElement> driver) {
	 PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	 this.driver = driver;
	 gf = new GenericFunctions(driver);
 }

public boolean validysingin () {  
	return gf.IsElementVisible(singin); 	 
 }

public String StringValidation () {  
	return gf.getText(singin); 	 
 }

}
