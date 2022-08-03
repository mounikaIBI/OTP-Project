package OtpPages;

import org.openqa.selenium.support.PageFactory;

import Utilities.GenericFunctions;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class StopviewerPage {
	
	AppiumDriver<MobileElement> driver;
	GenericFunctions gf;

	
	@AndroidFindBy (id="com.ibigroup.mobile.otp.android:id/map_view")
	private MobileElement mapview ;
	
	@AndroidFindBy (id="com.ibigroup.mobile.otp.android:id/tv_marker_from_here")
	private MobileElement fromherebutton ;
	
	@AndroidFindBy (id="com.ibigroup.mobile.otp.android:id/at_search_destination")
	private MobileElement  destinactionbar;
	
	@AndroidFindBy (id ="com.ibigroup.mobile.otp.android:id/at_search_origin")
	private MobileElement address ;
	
	@AndroidFindBy (id ="com.ibigroup.mobile.otp.android:id/tv_address")
	private MobileElement addresspick;
	
	@AndroidFindBy (id ="com.ibigroup.mobile.otp.android:id/ll_plan_trip_search")
	private MobileElement plantrip;
	
	public void clickmapview() {
		gf.Click(mapview);
	}
	public void clickforpopup() {
	    gf.tapByCoordinates(500,692);
	}
	public void clickfromhere() {
		gf.Click(fromherebutton);
	}
	public void clickdestinactionbar() {
		gf.Click(destinactionbar);
	}
	public void clicktext() {
		gf.Click(address);
	}
	public void sendaddress (String destinaction) {
		gf.Sendkeys(destinaction, address);
	}
	public void clickaddresspick() {
		gf.Click(addresspick);
	}
	public void clickplantrip() {
		gf.Click(plantrip);
	}
	
	public StopviewerPage(AppiumDriver<MobileElement> driver) {
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
		this.driver = driver;
		gf = new GenericFunctions(driver);
	
}
}
