package OtpPages;

import org.openqa.selenium.support.PageFactory;

import Utilities.GenericFunctions;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class SaveTripPage {

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
	
	@AndroidFindBy (xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.ListView/android.widget.LinearLayout[2]")
	private MobileElement selectitinerary;
	 
	@AndroidFindBy (accessibility = "Itinerary detail expander")
	private MobileElement startdrag;
	
	@AndroidFindBy (accessibility = "Itinerary detail expander")
	private MobileElement enddrag;
	
	@AndroidFindBy (id ="com.ibigroup.mobile.otp.android:id/iv_save_trip")
	private MobileElement staricon;
	
	@AndroidFindBy (id ="com.ibigroup.mobile.otp.android:id/et_trip_name")
	private MobileElement nametext;
	
	@AndroidFindBy (id ="com.ibigroup.mobile.otp.android:id/et_trip_name")
	private MobileElement sendtripname;
	
	@AndroidFindBy (xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.LinearLayout[1]/android.widget.ScrollView/android.widget.LinearLayout/android.widget.TextView[5]")
	private MobileElement textchecking;
	
	@AndroidFindBy (id ="com.ibigroup.mobile.otp.android:id/cb_monday")
	private MobileElement selectdaymon;
	
	@AndroidFindBy (id ="com.ibigroup.mobile.otp.android:id/cb_tuesday")
	private MobileElement selectdaytue;
	
	@AndroidFindBy (id ="com.ibigroup.mobile.otp.android:id/cb_wednesday")
	private MobileElement selectdaywed;
	
	@AndroidFindBy (id ="com.ibigroup.mobile.otp.android:id/cb_thursday")
	private MobileElement selectdaythus;
	
	@AndroidFindBy (id ="com.ibigroup.mobile.otp.android:id/cb_friday")
	private MobileElement selectdayfri;
	
	@AndroidFindBy (id ="com.ibigroup.mobile.otp.android:id/cb_saturday")
	private MobileElement selectdaysat;
	
	@AndroidFindBy (id ="com.ibigroup.mobile.otp.android:id/cb_sunday")
	private MobileElement selectdaysun;
	
	@AndroidFindBy (id = "com.ibigroup.mobile.otp.android:id/tv_save_trip")
	private MobileElement savepreferences;
	
	@AndroidFindBy (id = "android:id/button1")
	private MobileElement popupok;
	
	@AndroidFindBy (accessibility ="exit search bar")
	private MobileElement backbutton1;
 
	@AndroidFindBy (id ="com.ibigroup.mobile.otp.android:id/iv_route_search_address_collapsed_back")
	private MobileElement backbutton2;
	
	@AndroidFindBy (accessibility ="Reset")
	private MobileElement Reset;
	
	public void clickmapview() {
		gf.Click(mapview);
	}
	public void clickfrom() {
		gf.tapByCoordinates(193, 1032);
	}
     public void clickfromhere() {
    	 gf.Click(fromhere);
     }
   public void clickto () {
	   gf.tapByCoordinates(532, 979);
}
   public void clicktohere() {
	   	gf.Click(tohere);
}

   public void clickplantrip() {
	  gf.Click(plantripbutton);
	   gf.verticalSwipeByPercentages(0.9, 0.1, 0.3);
}
   public void clickonselecteditinerary() {
	   selectitinerary.click();
}
   public void dragAnddrop() {
	   gf.dragAndDrop();
   }
  
   public void clickstaricon() {
	   staricon.click();
}
   public void clicktripname() {
	   nametext.click();
}
   public void entername(String tripname) {
	   sendtripname.sendKeys(tripname);
	   driver.hideKeyboard();
	  // sendtripname.sendKeys(Keys.ENTER);
   }	 
   public boolean readtext() {
	   gf.IsElementVisible(textchecking);
	return true;
   }
   public String stringvalidation() {
	   return gf.getText(textchecking);
   }
   public void clickday1() {
	   selectdaymon.click();
}
   public void clickday2() {
   		selectdaytue.click();
}
   public void clickday3() {
   		selectdaywed.click();
}
   public void clickday4() {
	   selectdaythus.click();
}
   public void clickday5() {
	   gf.Click(selectdayfri);
	   gf.verticalSwipeByPercentages(0.9, 0.4, 0.3);
   }
   public void clickday6() {
	   gf.Click(selectdaysat);
   }
   public void clickday7() {
	   gf.Click(selectdaysun);
	   gf.verticalSwipeByPercentages(0.5, 0.1, 0.3);
   }
   public void clicksavebutton() {
	   savepreferences.click();
}
   public void selectpopup() {
	   popupok.click();
}
   public void clickback() {
		gf.Click(backbutton1);
	}
   public void backarrow() {
		gf.Click(backbutton2);
	}
   public void referesh() {
		gf.Click(Reset);
	}
public SaveTripPage(AppiumDriver<MobileElement> driver) {
	PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	this.driver = driver;
	gf = new GenericFunctions(driver);
}
}
