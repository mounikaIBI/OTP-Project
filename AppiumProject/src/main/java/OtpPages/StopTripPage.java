package OtpPages;

import org.openqa.selenium.support.PageFactory;

import Utilities.GenericFunctions;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class StopTripPage {

	AppiumDriver<MobileElement> driver;
	
	GenericFunctions gf;
	
	public StopTripPage(AppiumDriver<MobileElement> driver) {
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
		this.driver = driver;
		gf = new GenericFunctions(driver);
	}
	
	@AndroidFindBy (id = "com.ibigroup.mobile.otp.android:id/map_view")
	private MobileElement mapview;
	
	@AndroidFindBy (xpath = "//android.widget.FrameLayout[@content-desc=\"Showing a Map created with Mapbox. Scroll by dragging two fingers. Zoom by pinching two fingers.\"]/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.LinearLayout[1]/android.widget.LinearLayout")
	private MobileElement fromhere;
	
	@AndroidFindBy (xpath ="//android.widget.FrameLayout[@content-desc=\"Showing a Map created with Mapbox. Scroll by dragging two fingers. Zoom by pinching two fingers.\"]/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.LinearLayout[2]/android.widget.LinearLayout")
	private MobileElement tohere;
	
	@AndroidFindBy (id = "com.ibigroup.mobile.otp.android:id/iv_search_mode_drive")
	private MobileElement car;
	
	@AndroidFindBy (id = "com.ibigroup.mobile.otp.android:id/iv_search_mode_bike")
	private MobileElement bike;
	
	@AndroidFindBy (accessibility = "Setting")
	private MobileElement setting;
	
	@AndroidFindBy (id = "com.ibigroup.mobile.otp.android:id/ll_home_setting_marta_rail")
	private MobileElement unselectrail ;
	
	@AndroidFindBy (xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.Spinner/android.widget.LinearLayout/android.widget.TextView")
	private MobileElement maxwalk;
	
	@AndroidFindBy (xpath = "/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.LinearLayout[5]/android.widget.TextView")
	private MobileElement waltdis;
	
	@AndroidFindBy (xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.LinearLayout[4]/android.widget.Spinner/android.widget.LinearLayout/android.widget.TextView")
	private MobileElement speed;
	
	@AndroidFindBy (xpath = "/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.LinearLayout[2]/android.widget.TextView")
	private MobileElement speedselect;
	
	@AndroidFindBy (id = "com.ibigroup.mobile.otp.android:id/tv_home_setting_ok")
	private MobileElement settingok;
	
	@AndroidFindBy (id = "com.ibigroup.mobile.otp.android:id/ll_search_date_time")
	private MobileElement searchdatetime;
	
	@AndroidFindBy (id = "com.ibigroup.mobile.otp.android:id/rl_arrive_by")
	private MobileElement arrived;
	
	@AndroidFindBy (id = "com.ibigroup.mobile.otp.android:id/tv_arrive_by_option_date")
	private MobileElement date;
	
	@AndroidFindBy (xpath = "//android.view.View[@content-desc=\"29 July 2022\"]")
	private MobileElement selectdate;
	
	@AndroidFindBy (id = "android:id/button1")
	private MobileElement ok;
	
	@AndroidFindBy (id = "com.ibigroup.mobile.otp.android:id/tv_arrive_by_option_time")
	private MobileElement time;
	
	@AndroidFindBy (xpath = "//android.widget.RadialTimePickerView.RadialPickerTouchHelper[@content-desc=\"1\"]")
	private MobileElement timehr;
	
	@AndroidFindBy (xpath = "//android.widget.RadialTimePickerView.RadialPickerTouchHelper[@content-desc=\"35\"]")
	private MobileElement timemin;
	
	@AndroidFindBy (xpath = "/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.TimePicker/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.Button[2]")
	private MobileElement setok;
	
	@AndroidFindBy (id = "com.ibigroup.mobile.otp.android:id/tv_home_date_time_save")
	private MobileElement timesave;
	
	@AndroidFindBy (id ="com.ibigroup.mobile.otp.android:id/ll_plan_trip_search")
	private MobileElement plantrip;
	
	@AndroidFindBy (xpath ="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.ListView/android.widget.LinearLayout[3]")
	private MobileElement selecttrip;
	//drag 
	@AndroidFindBy (id ="com.ibigroup.mobile.otp.android:id/tv_itinerary_leg_stop_viewer")
	private MobileElement stopview;
	
	@AndroidFindBy (id ="com.ibigroup.mobile.otp.android:id/tv_schedule")
	private MobileElement schedual;
	
	@AndroidFindBy (xpath ="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.LinearLayout[1]/android.widget.ListView/android.widget.LinearLayout[1]/android.widget.LinearLayout")
	private MobileElement selectone;
	
	@AndroidFindBy (id="com.ibigroup.mobile.otp.android:id/iv_stop_viewer_back")
	private MobileElement back; //swip
	
	@AndroidFindBy (xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.ListView/android.widget.LinearLayout[2]/android.widget.FrameLayout/android.widget.LinearLayout[1]/android.widget.LinearLayout[3]/android.widget.ImageView")
	private MobileElement downarrow ;
	
	@AndroidFindBy (id="com.ibigroup.mobile.otp.android:id/iv_route_search_address_collapsed_back")
	private MobileElement backpage;
	
	@AndroidFindBy (accessibility ="exit search bar")
	private MobileElement backbutton;
	
	@AndroidFindBy(xpath ="//android.widget.RelativeLayout[@content-desc=\"Drive search mode\"]/android.widget.ImageView[1]")
	private MobileElement enabledrive;
	
	@AndroidFindBy(xpath ="//android.widget.RelativeLayout[@content-desc=\"Bike search mode\"]/android.widget.ImageView[1]")
	private MobileElement enablebike ;
	
	@AndroidFindBy (accessibility ="Reset")
	private MobileElement Reset;
	
	public void clickmap() {
		gf.Click(mapview);
	}
	public void from() {
	gf.tapByCoordinates(193, 1032);
	}
	public void clickfrom() {
		gf.Click(fromhere);
	}
	public void to() {
		gf.tapByCoordinates(532, 979);
	}
	public void clickto() {
		gf.Click(tohere);
	}
    public void clickcar() {
    	gf.Click(car);
    }
    public void clickbike() {
    	gf.Click(bike);
    }
    public void clicksetting() {
    	gf.Click(setting);
    }
    public void clickrailbutton() {
    	gf.Click(unselectrail);
    }
    public void clickmax() {
    	gf.Click(maxwalk);
    }
    public void clickdist() {
    	gf.Click(waltdis);
    }
    public void clickspeed() {
    	gf.Click(speed);
    }
    public void clickselect() {
    	gf.Click(speedselect);
    }
    public void clicksettingok() {
    	gf.Click(settingok);
    }
    public void clicksearchdatetime() {
    	gf.Click(searchdatetime);
    }
    public void clickarrived() {
    	gf.Click(arrived);
    }
    public void clickdate() {
    	gf.Click(date);
    }
    public void clickselectdate() {
    	gf.Click(selectdate);
    }
    public void clickok() {
    	gf.Click(ok);
    }
    public void clicktime() {
    	gf.Click(time);
    }
    public void clicktimehr() {
    	gf.Click(timehr);
    }
    public void clicktimemin() {
    	gf.Click(timemin);
    }
    public void clicksetok() {
    	gf.Click(setok);
    }
    public void clicktimesave() {
    	gf.Click(timesave);
    }
    public void clickplantrip() {
    	gf.Click(plantrip);
    }
    public void clickselecttrip() {
    	gf.Click(selecttrip);
    }
    public void draganddrop() {
    	gf.dragAndDrop();
    	gf.verticalSwipeByPercentages(0.9, 0.1, 0.2);
    }
    public void clickstopview() {
    	gf.Click(stopview);
    }
    public void clickschedual() {
    	gf.Click(schedual);
    }
    public void clickselectone() {
    	gf.Click(selectone);
    }
    public void clickback() {
    	gf.Click(back);
    	gf.verticalSwipeByPercentages(0.9, 0.1, 0.2);
    }
    public void clickdownarrow() {
    	gf.Click(downarrow);
    }
    public void clickbackpage() {
    	gf.Click(backpage);
    }
    public void clickbackbutton() {
    	gf.Click(backbutton);
    }
    public void clickenabledrive() {
    	gf.Click(enabledrive);
    }
    public void clickenablebike() {
    	gf.Click(enablebike);
    }
    public void clickreset() {
		gf.Click(Reset);
	}
   
    
    
    








}



