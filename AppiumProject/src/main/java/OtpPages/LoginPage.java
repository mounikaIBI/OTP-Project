package OtpPages;

import org.openqa.selenium.support.PageFactory;
import Utilities.GenericFunctions;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class LoginPage  {

	protected AppiumDriver<MobileElement> driver;
	public GenericFunctions gf;

	@AndroidFindBy (id ="com.ibigroup.mobile.otp.android:id/iv_tab_sign_in")
	private MobileElement singinbutton;

	@AndroidFindBy (xpath ="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.RelativeLayout[2]/android.widget.LinearLayout[2]/android.widget.RelativeLayout/android.widget.RelativeLayout/android.widget.LinearLayout[1]/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.EditText")
	private MobileElement username;

	@AndroidFindBy (xpath ="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.RelativeLayout[2]/android.widget.LinearLayout[2]/android.widget.RelativeLayout/android.widget.RelativeLayout/android.widget.LinearLayout[2]/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.EditText")
	private MobileElement password;

	@AndroidFindBy (id ="com.ibigroup.mobile.otp.android:id/com_auth0_lock_title")
	private MobileElement loginbutton;

	public LoginPage(AppiumDriver<MobileElement> driver) {
		this.driver = driver;
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
		gf = new GenericFunctions(driver);
	}
	public void clicksinginbutton() {
		gf.Click(singinbutton);
	}

	public void enterusername(String uName) {
		gf.Sendkeys(uName, username);
	}

	public void enterpassword(String pwd) {
		gf.Sendkeys(pwd, password);
	}
	public void clickloginbutton() {
		gf.Click(loginbutton);
		
	}
}

