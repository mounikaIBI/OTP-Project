package OtpPages;

import org.openqa.selenium.support.PageFactory;

import Utilities.GenericFunctions;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class StopTripViewerPage {

	AppiumDriver<MobileElement> driver;
	GenericFunctions gf;

	
	@AndroidFindBy (id="com.ibigroup.mobile.otp.android:id/map_view")
	private MobileElement mapview ;
	
	@AndroidFindBy (id="com.ibigroup.mobile.otp.android:id/tv_marker_from_here")
	private MobileElement fromherebutton ;
	
	@AndroidFindBy (xpath ="//android.widget.FrameLayout[@content-desc=\"Showing a Map created with Mapbox. Scroll by dragging two fingers. Zoom by pinching two fingers.\"]/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.LinearLayout[2]/android.widget.LinearLayout")
	private MobileElement tohere;
	
	@AndroidFindBy (id ="com.ibigroup.mobile.otp.android:id/ll_plan_trip_search")
	private MobileElement plantrip;
	
	@AndroidFindBy (id="android:id/text1")
	private MobileElement bestoption;
	
	@AndroidFindBy (xpath="/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.CheckedTextView[5]")
	private MobileElement walktime;
	
	@AndroidFindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.ListView/android.widget.LinearLayout[4]")
	private MobileElement Itinerary;
	
	@AndroidFindBy (id="com.ibigroup.mobile.otp.android:id/tv_itinerary_leg_stop_viewer")
	private MobileElement stopviewer;
	
	@AndroidFindBy(id="com.ibigroup.mobile.otp.android:id/ll_next_arrival_times_controller")
	private MobileElement nextarriavel;
	
	@AndroidFindBy(id="com.ibigroup.mobile.otp.android:id/tv_schedule")
	private MobileElement schedule;
	
	@AndroidFindBy(id="com.ibigroup.mobile.otp.android:id/iv_stop_viewer_back")
	private MobileElement back;
	
	@AndroidFindBy(id="com.ibigroup.mobile.otp.android:id/tv_itinerary_leg_trip_viewer")
	private MobileElement tripviewer;
	
	@AndroidFindBy(id="com.ibigroup.mobile.otp.android:id/iv_trip_viewer_back")
	private MobileElement backbutton;
	
	@AndroidFindBy (id="com.ibigroup.mobile.otp.android:id/iv_route_search_address_collapsed_back")
	private MobileElement backpage;
	
	@AndroidFindBy (accessibility ="exit search bar")
	private MobileElement backbutton2;
	
	@AndroidFindBy (accessibility ="Reset")
	private MobileElement Reset;
	
	
	public void clickmapview() {
		gf.Click(mapview);
	}
	public void clickfrom() {
	    gf.tapByCoordinates(657,1331);
	}
	public void clickfromhere() {
		gf.Click(fromherebutton);
	}
	public void clickto() {
		gf.tapByCoordinates(133, 967);
	}
	public void clicktohere() {
		gf.Click(tohere);
	}
	public void clickplantrip() {
		gf.Click(plantrip);
	}
	public void clickbestoption() {
		gf.Click(bestoption);
	}
	public void clickwalktime() {
		gf.Click(walktime);
		gf.verticalSwipeByPercentages(0.9, 0.2,0.2);
		gf.verticalSwipeByPercentages(0.9, 0.2,0.2);
	}
	public void clickItinerary() {
		gf.Click(Itinerary);
	}
	public void dragAndDrop() {
		gf.dragAndDrop();
	}
	public void clickstopviewer() {
		gf.Click(stopviewer);
	}
	public void clicknextarriaval() {
		gf.Click(nextarriavel);
	}
	public void clickschedual() {
		gf.Click(schedule);
	}
	public void clickback() {
		gf.Click(back);
		gf.verticalSwipeByPercentages(0.8, 0.2, 0.1);
	}
	public void clicktripviewer() {
		gf.Click(tripviewer);
	}
	public void clickbackbutton() {
		gf.Click(backbutton);
	}
	 public void clickbackpage() {
	    	gf.Click(backpage);
	    }
	    public void clickbackbutton2() {
	    	gf.Click(backbutton2);
	    }
	    public void clickreset() {
			gf.Click(Reset);
		}
	
	
	public StopTripViewerPage(AppiumDriver<MobileElement> driver) {
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
		this.driver = driver;
		gf = new GenericFunctions(driver);
	}
}


