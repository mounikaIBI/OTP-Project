package OtpPages;

import java.util.List;

import org.openqa.selenium.support.PageFactory;

import Utilities.GenericFunctions;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import jdk.internal.org.jline.utils.Log;

public class RoutesPage {
	
	private static final String Uitilies = null;
	AppiumDriver<MobileElement> driver;
	GenericFunctions gf;
	
	public RoutesPage(AppiumDriver<MobileElement> driver) {
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
		this.driver = driver;
		gf = new GenericFunctions(driver);
	}
	
	@AndroidFindBy (id = "com.ibigroup.mobile.otp.android:id/ll_tab_routes")
	private MobileElement  routesbutton;
	
	@AndroidFindBy (id="com.ibigroup.mobile.otp.android:id/iv_route_type")
	private List<MobileElement> routeslist;
	
	@AndroidFindBy (uiAutomator="com.ibigroup.mobile.otp.android:id/ll_route_viewer")
	private List<MobileElement> countlist;
	
	
	
	
	public void clickroutesbutton() {
		gf.Click(routesbutton);
		
	}
	public void drag() {
		gf.dragAndDrop();
	}
	/*public void getroutescount() throws InterruptedException {
		int count = routeslist.size();
		Thread.sleep(3000);
		count = count + routeslist.size();
		Utilities.Log.info("Total Route count: "+count);
	} */
	public  void scroll() {
		drag();
		int count = routeslist.size();
		for(int i=0;i<=15;i++) {
		gf.verticalSwipeByPercentages(0.9, 0.3, 0.2);
		count = count + routeslist.size();
		if(i==15) {
			break;
		}
		}
		Utilities.Log.info("Total Route count: "+count);
	}
	
	
	//driver.findElement(MobileBy
    //        .AndroidUIAutomator("new UiScrollable(new UiSelector().resourceIdMatches(".*id/your_scrolling_container_id")).scrollIntoView("
    //                + "new UiSelector().text(\""+text+"\"));"))
	public void scrollToText(String text) {
		MobileElement scroll = driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(" + "new UiSelector().description(" + "" + text + ""+ "))"));
		}

	
//	public int getRouteCount() {
//				int count = routeslist.size();
//				for(int i=0;i<=12;i++) {
//					scroll();
//					count = count+ routeslist.size();
//					if(i==12) {
//						break;
//					}
//				}
//				Utilities.Log.info("Total Route count: "+count);
//				return count;
//	}
	
	 public int getroutes() {
		drag();
		int count1 = countlist.size();
		Utilities.Log.info("Total routes count: "+count1);
		return count1; 
	}
}

	

