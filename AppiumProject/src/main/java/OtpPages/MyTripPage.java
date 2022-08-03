package OtpPages;

import org.openqa.selenium.support.PageFactory;

import Utilities.GenericFunctions;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class MyTripPage {
	
	AppiumDriver<MobileElement> driver;
	GenericFunctions gf;
	
	
	public MyTripPage(AppiumDriver<MobileElement> driver) {
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
		this.driver = driver;
		gf = new GenericFunctions(driver);
	}

	@AndroidFindBy (id = "com.ibigroup.mobile.otp.android:id/ll_tab_my_trips")
	private MobileElement mytripbutton ;
	
	@AndroidFindBy (id = "com.ibigroup.mobile.otp.android:id/tv_title")
	private MobileElement title ;
	
	@AndroidFindBy (xpath ="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.RelativeLayout[2]/android.widget.ListView/android.widget.LinearLayout[1]")
	private MobileElement selecttrip ;
	
	@AndroidFindBy (id="com.ibigroup.mobile.otp.android:id/iv_pause_resume")
	private MobileElement pausebutton ;
	
	@AndroidFindBy (id ="com.ibigroup.mobile.otp.android:id/ll_edit")
	private MobileElement editbutton ;
	
	@AndroidFindBy (id ="com.ibigroup.mobile.otp.android:id/tv_title")
	private MobileElement titlevalidaction ;
	
	@AndroidFindBy (id="com.ibigroup.mobile.otp.android:id/ll_pause_resume")
	private MobileElement  resumebutton;
	
	@AndroidFindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.RelativeLayout[2]/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.RelativeLayout/android.widget.Spinner/android.widget.LinearLayout")
	private MobileElement myjourney;
	
	@AndroidFindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.LinearLayout[1]")
	private MobileElement selectjourney;
	
	@AndroidFindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.RelativeLayout[2]/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[3]/android.widget.RelativeLayout/android.widget.Spinner/android.widget.LinearLayout")
	private MobileElement transfer;
	
	@AndroidFindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.LinearLayout[1]/android.widget.TextView")
	private MobileElement selecttransfer;
	
	@AndroidFindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.RelativeLayout[2]/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[4]/android.widget.RelativeLayout/android.widget.Spinner/android.widget.LinearLayout")
	private MobileElement time1;
	
	@AndroidFindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.LinearLayout[1]/android.widget.TextView")
	private MobileElement selecttime1;
	
	@AndroidFindBy (xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.RelativeLayout[2]/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[5]/android.widget.TextView")
	private MobileElement advsetting ;
	
	@AndroidFindBy (xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.RelativeLayout[2]/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[6]/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.Spinner/android.widget.LinearLayout")
	private MobileElement monitortrip;
	
	@AndroidFindBy (xpath="/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.LinearLayout[2]")
	private MobileElement selecttime2;
	
	@AndroidFindBy (id ="com.ibigroup.mobile.otp.android:id/tv_save_trip")
	private MobileElement save;
	
	@AndroidFindBy (id ="android:id/button1")
	private MobileElement okbutton;
	
	@AndroidFindBy (id ="com.ibigroup.mobile.otp.android:id/ll_delete")
	private MobileElement delete;
	
	@AndroidFindBy (id ="android:id/button1")
	private MobileElement deleteok;
	
	@AndroidFindBy (id ="com.ibigroup.mobile.otp.android:id/iv_tab_pan_trip")
	private MobileElement plan;
	
	public void clicktrip() {
		gf.Click(mytripbutton);
	}
	public boolean Titlecheck() {
		return gf.IsElementVisible(title);
	}
	public String text() {
		return gf.getText(title);
	}
	public void clickselect() {
		gf.Click(selecttrip);
	}
	public void clickpause() {
		gf.Click(pausebutton);
	}
	public void clickedit() {
		gf.Click(editbutton);
	}
	public boolean checktitle() {
		return gf.IsElementVisible(titlevalidaction);
	}
	public String titletext() {
		return gf.getText(titlevalidaction);
	}
	public void clickresume() {
		gf.Click(resumebutton);
		 gf.verticalSwipeByPercentages(0.7, 0.1, 0.3);
	}
	public void clickmyjourney() {
		gf.Click(myjourney);
	}
	public void clickselectjourney() {
		gf.Click(selectjourney);
	}
	public void clicktransfer() {
		gf.Click(transfer);
	}
	public void clickselecttransfer() {
		gf.Click(selecttransfer);
	}
	public void clicktime1() {
		gf.Click(time1);
	}
	public void clickselecttime1() {
		gf.Click(selecttime1);
	}
	public void clickadv() {
		gf.Click(advsetting);
		gf.verticalSwipeByPercentages(0.6, 0.1, 0.3);
	}
	public void clickmonitor() {
		gf.Click(monitortrip);
	}
	public void clicktime2() {
		gf.Click(selecttime2);
	}
	public void clicksave() {
		gf.Click(save);
	}
	public void clickok() {
		gf.Click(okbutton);
	}
	public void clickdelete() {
		gf.Click(delete);
	}
	public void clickdeleteok() {
		gf.Click(deleteok);
	}
	public void clickplan() {
		gf.Click(plan);
	}
}
