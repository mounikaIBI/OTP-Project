package OtpPages;

import org.openqa.selenium.support.PageFactory;

import Utilities.GenericFunctions;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class TripPage {
	AppiumDriver<MobileElement> driver;

	public GenericFunctions gf;
	
	//PlanTrip page
	
	@AndroidFindBy (id = "com.ibigroup.mobile.otp.android:id/map_view")
	private MobileElement mapview;
	
	@AndroidFindBy (id = "com.ibigroup.mobile.otp.android:id/tv_marker_from_here")
	private MobileElement fromhere;
	
	@AndroidFindBy (xpath ="//android.widget.FrameLayout[@content-desc=\"Showing a Map created with Mapbox. Scroll by dragging two fingers. Zoom by pinching two fingers.\"]/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.LinearLayout[2]/android.widget.LinearLayout")
	private MobileElement tohere;
	
	@AndroidFindBy (id ="com.ibigroup.mobile.otp.android:id/ll_plan_trip_search")
	private MobileElement plantripbutton;
	
	@AndroidFindBy (xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.ListView/android.widget.LinearLayout[3]")
	private MobileElement selectitinerary;
	
	@AndroidFindBy (className = "android.widget.RelativeLayout")
	private MobileElement startdrag;
	
	@AndroidFindBy (className = "android.widget.ImageView")
	private MobileElement enddrag;
	
	@AndroidFindBy (accessibility ="exit search bar")
	private MobileElement backbutton;

	@AndroidFindBy (accessibility ="Reset")
	private MobileElement Reset;
	
	public void clickmap() {
		gf.Click(mapview);
	}
	public void clickmapfrom() {
		gf.tapByCoordinates(599, 1120);
	}
	public void clickfromhere() {
		gf.Click(fromhere);
	}
	public void clickmapto () {
		gf.tapByCoordinates(370, 929);
}
	public void clicktohere() {
		gf.Click(tohere);
}
    public void clickplantrip() {
		plantripbutton.click();
}
	public void clickonselecteditinerary() {
		selectitinerary.click();
}
	public void dragAnddrop() {
		gf.dragAndDrop();
}
	public void clickback() {
		gf.Click(backbutton);
	}
	public void clickreset() {
		gf.Click(Reset);
	}
	public TripPage(AppiumDriver<MobileElement> driver) {
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
		this.driver = driver;
		gf = new GenericFunctions(driver);
	}
}