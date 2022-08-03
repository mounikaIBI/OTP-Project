package OtpPages;

import org.openqa.selenium.support.PageFactory;

import Utilities.GenericFunctions;
import Utilities.ServerManager;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class LayerMenuPage extends ServerManager{

	protected AppiumDriver<MobileElement> driver;
	public GenericFunctions gf;
	
	public LayerMenuPage(AppiumDriver<MobileElement> driver) {
		this.driver = driver;
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
		gf = new GenericFunctions(driver);
	}
	
	@AndroidFindBy (id="com.ibigroup.mobile.otp.android:id/iv_layer")
	private MobileElement layermenu;
	
	@AndroidFindBy (id ="com.ibigroup.mobile.otp.android:id/ll_park_and_ride_locations")
	private MobileElement selectpark;
	
	@AndroidFindBy (id="com.ibigroup.mobile.otp.android:id/tv_satellite")
	private MobileElement selectsatellite;
	
	@AndroidFindBy (id="com.ibigroup.mobile.otp.android:id/iv_transit_stops")
	private MobileElement selecttransit;
	
	@AndroidFindBy (xpath ="//android.widget.RelativeLayout[@content-desc=\"Layer control\"]/android.widget.ImageView[2]")
	private MobileElement layerclose;
	
	@AndroidFindBy (id ="com.ibigroup.mobile.otp.android:id/iv_layer")
	private MobileElement layeropen;
	
	@AndroidFindBy (id="com.ibigroup.mobile.otp.android:id/iv_transit_stops")
	private MobileElement selecttransit2;
	
	@AndroidFindBy (id="com.ibigroup.mobile.otp.android:id/tv_streets")
	private MobileElement selectstreet;
	
	@AndroidFindBy (xpath ="//android.widget.RelativeLayout[@content-desc=\"Layer control\"]/android.widget.ImageView[2]")
	private MobileElement layerclose2;
	
	
	public void clicklayermenu() {
		gf.Click(layermenu);
	}
	public void clickselectpark() {
		gf.Click(selectpark);
	}
	public void clickselectsatellite() {
		gf.Click(selectsatellite);
	}
	public void clickslecttransit() {
		gf.Click(selecttransit);
	}
	public void clicklayerclose() {
		gf.Click(layerclose);
	}
	public void clicklayeropen() {
		gf.Click(layeropen);
	}
	public void clickselecttransit2() {
		gf.Click(selecttransit2);
	}
	public void clickselectstreet() {
		gf.Click(selectstreet);
	}
	public void clicklayerclose2() {
		gf.Click(layerclose2);
	}
}
