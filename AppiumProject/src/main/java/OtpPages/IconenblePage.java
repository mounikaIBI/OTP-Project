package OtpPages;

import java.util.List;

import org.openqa.selenium.support.PageFactory;

import Utilities.GenericFunctions;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import jdk.internal.org.jline.utils.Log;

public class IconenblePage {

	AppiumDriver driver;
	GenericFunctions gf;

	@AndroidFindBy (xpath = "//android.widget.FrameLayout[@content-desc=\"Showing a Map created with Mapbox. Scroll by dragging two fingers. Zoom by pinching two fingers.\"]")
	private MobileElement mapview;

	@AndroidFindBy (xpath = "//android.widget.FrameLayout[@content-desc=\"Showing a Map created with Mapbox. Scroll by dragging two fingers. Zoom by pinching two fingers.\"]/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.LinearLayout[1]/android.widget.LinearLayout")
	private MobileElement fromhere;

	@AndroidFindBy (xpath ="//android.widget.FrameLayout[@content-desc=\"Showing a Map created with Mapbox. Scroll by dragging two fingers. Zoom by pinching two fingers.\"]/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.LinearLayout[2]/android.widget.LinearLayout")
	private MobileElement tohere;

	@AndroidFindBy(xpath ="//android.widget.RelativeLayout[@content-desc=\"Transit search mode\"]/android.widget.ImageView[1]")
	private MobileElement disablebus;

	@AndroidFindBy (id ="com.ibigroup.mobile.otp.android:id/ll_plan_trip_search")
	private MobileElement plantrip1;
	
	@AndroidFindBy (xpath ="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.RelativeLayout[1]/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.ImageView[1]")
    private MobileElement back;
	
	@AndroidFindBy(xpath ="//android.widget.RelativeLayout[@content-desc=\"Transit search mode\"]/android.widget.ImageView[1]")
	private MobileElement enablebus;

	@AndroidFindBy(xpath ="//android.widget.RelativeLayout[@content-desc=\"Walk search mode\"]/android.widget.ImageView[1]")
	private MobileElement disablewalk;

	@AndroidFindBy (id ="com.ibigroup.mobile.otp.android:id/ll_plan_trip_search")
	private MobileElement plantrip2;
	
	@AndroidFindBy (xpath ="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.RelativeLayout[1]/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.ImageView[1]")
    private MobileElement back2;

	@AndroidFindBy(xpath ="//android.widget.RelativeLayout[@content-desc=\"Walk search mode\"]/android.widget.ImageView[1]")
	private MobileElement enablewalk;

	@AndroidFindBy(xpath ="//android.widget.RelativeLayout[@content-desc=\"Drive search mode\"]/android.widget.ImageView[1]")
	private MobileElement disabledrive;

	@AndroidFindBy (id ="com.ibigroup.mobile.otp.android:id/ll_plan_trip_search")
	private MobileElement plantrip3;
	
	@AndroidFindBy (xpath ="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.RelativeLayout[1]/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.ImageView[1]")
    private MobileElement back3;

	@AndroidFindBy(xpath ="//android.widget.RelativeLayout[@content-desc=\"Drive search mode\"]/android.widget.ImageView[1]")
	private MobileElement enabledrive;

	@AndroidFindBy(xpath ="//android.widget.RelativeLayout[@content-desc=\"Bike search mode\"]/android.widget.ImageView[1]")
	private MobileElement disablebike;

	@AndroidFindBy (id ="com.ibigroup.mobile.otp.android:id/ll_plan_trip_search")
	private MobileElement plantrip4;
	
	@AndroidFindBy (xpath ="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.RelativeLayout[1]/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.ImageView[1]")
    private MobileElement back4;


	@AndroidFindBy(xpath ="//android.widget.RelativeLayout[@content-desc=\"Bike search mode\"]/android.widget.ImageView[1]")
	private MobileElement enablebike ;

	@AndroidFindBy (id ="com.ibigroup.mobile.otp.android:id/iv_search_mode_rental_checked")
    private MobileElement disabledrental;
	
	@AndroidFindBy (id ="com.ibigroup.mobile.otp.android:id/rl_search_mode_rental")
	private MobileElement enablerental;

	@AndroidFindBy (id ="com.ibigroup.mobile.otp.android:id/ll_plan_trip_search")
	private MobileElement plantrip5;
	
	@AndroidFindBy (accessibility ="Reset")
	private MobileElement Reset;

	@AndroidFindBy(id = "com.ibigroup.mobile.otp.android:id/tv_modes")
	private List<MobileElement> itenaryList;

	public IconenblePage(AppiumDriver<MobileElement> driver) {
		this.driver = driver;
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
		gf = new GenericFunctions(driver);
	}

	public void validateItenaryList() {
		for(MobileElement e : itenaryList) {
			Utilities.Log.info(gf.getText(e));
		}	
	}
	
	private String getText(MobileElement e) {
		// TODO Auto-generated method stub
		return null;
	}

	public void clickmapview() {
		gf.Click(mapview);
	}
	public void clickfrom() {
		gf.tapByCoordinates(435,841);
	}
	public void clickfromhere() {
		gf.Click(fromhere);
	}
	public void clickto() {
		gf.tapByCoordinates(208,1045);
	}
	public void clicktohere() {
		gf.Click(tohere);
	}
	public void clickdisablebus() {
		gf.Click(disablebus);
	}
	public void clickplantrip1() {
		gf.Click(plantrip1);
		
	}
	public void clickback() {
		gf.Click(back);
	}
	public void clickenablebus() {
		gf.Click(enablebus);
	}
	public void clickdisablewalk() {
		gf.Click(disablewalk);
	}
	public void clickplantrip2() {
		gf.Click(plantrip2);

	}
	public void clickback2() {
		gf.Click(back2);
	}
	public void clickenablewalk() {
		gf.Click(enablewalk);
	}
	public void clickdisabledrive() {
		gf.Click(disabledrive);
	}
	public void clickenablebike() {
		gf.Click(enablebike);
	}
	public void clickplantrip3() {
		gf.Click(plantrip3);
		
	}
	public void clickback3() {
		gf.Click(back3);
	}
	public void clickenabledrive() {
		gf.Click(enabledrive);
	}
	public void clickdisablebike() {
		gf.Click(disablebike);
	}
	public void clickplantrip4() {
		gf.Click(plantrip4);
		
	}
	public void clickback4() {
		
		gf.Click(back4);
	}
	public void clickdisablerental() {
		gf.Click(disabledrental);
	}
	public void clickenablerental() {
		gf.Click(enablerental);
	}
	public void clickreset() {
		gf.Click(Reset);
	}
	public void clickplantrip5() {
		gf.Click(plantrip5);
		gf.verticalSwipeByPercentages(0.6, 0.3, 0.2);
	}
}
