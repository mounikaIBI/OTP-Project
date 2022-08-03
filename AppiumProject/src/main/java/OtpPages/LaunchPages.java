package OtpPages;

import org.openqa.selenium.support.PageFactory;

import Utilities.GenericFunctions;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class LaunchPages {

	protected AppiumDriver<MobileElement> driver;
	public GenericFunctions gf;
	
	public LaunchPages(AppiumDriver<MobileElement> driver) {
		this.driver = driver;
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
		gf = new GenericFunctions(driver);
	}
	
	@AndroidFindBy (id = "com.android.permissioncontroller:id/permission_allow_foreground_only_button")
	private MobileElement locationwhile;
	
	@AndroidFindBy (id ="com.android.permissioncontroller:id/permission_allow_one_time_button")
	private MobileElement locationonly ;
	
	@AndroidFindBy (id ="com.android.permissioncontroller:id/permission_deny_button")
	private MobileElement locationdont;
	
    public void clicklocationwhile() {
    	gf.Click(locationwhile);
    }
    public void clicklocationonly() {
    	gf.Click(locationonly);
    }
    public void clicklocationdont() {
    	gf.Click(locationdont);
    }
}
