package OtpPages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.support.PageFactory;

import Utilities.GenericFunctions;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class AccountSettingsAddressPage  {
	public AppiumDriver<MobileElement> driver;
	public GenericFunctions gf;
	
	 public AccountSettingsAddressPage(AppiumDriver<MobileElement> driver) {
		 PageFactory.initElements(new AppiumFieldDecorator(driver), this);
		 this.driver = driver;
		gf = new GenericFunctions(driver);
	}
	
	@AndroidFindBy (id = "com.ibigroup.mobile.otp.android:id/tv_user_name")
	private MobileElement loginaction;
	
	@AndroidFindBy (id = "com.ibigroup.mobile.otp.android:id/tv_my_account")
	private MobileElement accountsettings;
	
	@AndroidFindBy (id ="com.ibigroup.mobile.otp.android:id/tv_preference_sms")
	private MobileElement sms;
	
	@AndroidFindBy (id ="com.ibigroup.mobile.otp.android:id/tv_preference_opt_out")
	private MobileElement dont;
	
	@AndroidFindBy (id ="com.ibigroup.mobile.otp.android:id/tv_preference_email")
	private MobileElement Email;
	
	@AndroidFindBy (id = "com.ibigroup.mobile.otp.android:id/tv_save_preferences")
	private MobileElement saveprefencesbutton;
	
	@AndroidFindBy (id = "android:id/button1")
	private MobileElement sucessbutton;
	
	@AndroidFindBy (id = "com.ibigroup.mobile.otp.android:id/iv_back")
	private MobileElement backbutton;
	
	public void clickloginbutton1() {
		gf.Click(loginaction);
	}
	public void clickaccountsetting () {
		gf.Click(accountsettings);
	}
	public void clicksms() {
		gf.Click(sms);
	}
	public void clickdont() {
		gf.Click(dont);
	}
	public void clickemail() {
		gf.Click(Email);
		gf.verticalSwipeByPercentages(0.9, 0.3, 0.3);
	}
	public void clicksaveprefencesbutton() {
    	gf.Click(saveprefencesbutton);
    }
    public void clickok () {
    	gf.Click(sucessbutton);
    	gf.verticalSwipeByPercentages(0.4, 0.9, 0.3);
    }
    public void clickbackbutton () {
    	gf.Click(backbutton);    	
    }
	
	// Home Address 
	 
	@AndroidFindBy (xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.ScrollView/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.LinearLayout/android.widget.LinearLayout")
    private MobileElement hometext;
	
	@AndroidFindBy (id = "com.ibigroup.mobile.otp.android:id/tv_new_location")
	private MobileElement edithometext;
	
	@AndroidFindBy (id = "com.ibigroup.mobile.otp.android:id/at_search")
	private MobileElement sendaddress;
	
	@AndroidFindBy (xpath ="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.ListView/android.widget.LinearLayout[1]/android.widget.TextView")
	private MobileElement addressfromlist;
	
	@AndroidFindBy (id = "com.ibigroup.mobile.otp.android:id/tv_new_location")
	private MobileElement samesendaddress;
	
	@AndroidFindBy (id = "com.ibigroup.mobile.otp.android:id/tv_save")
	private MobileElement savebutton;
	

	public void clickhometext () {
		gf.Click(hometext);
	}
	public void clickedithometext () {
		gf.Click(edithometext);
	}
    public void enteraddress (String address) {
    	gf.Sendkeys(address, sendaddress);
    }
    public void selectaddress () {
    	gf.Click(addressfromlist);
    }
    public boolean displaysame () {
    	return gf.IsElementVisible(samesendaddress);
    }
    public String homeValidation () {  
    	return gf.getText(samesendaddress); 	 
     }
    public void clicksavebutton () {
    	gf.Click(savebutton);
    }
    
    
    // Work Address
	
	@AndroidFindBy (xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.ScrollView/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.LinearLayout/android.widget.LinearLayout")
    private MobileElement worktext;
	
	@AndroidFindBy (id = "com.ibigroup.mobile.otp.android:id/tv_new_location")
	private MobileElement editworktext;
	
	@AndroidFindBy (id = "com.ibigroup.mobile.otp.android:id/at_search")
	private MobileElement sendworkaddress;
	
	@AndroidFindBy (id ="com.ibigroup.mobile.otp.android:id/tv_address")
	private MobileElement workaddressfromlist;
	
	@AndroidFindBy (id = "com.ibigroup.mobile.otp.android:id/tv_new_location")
	private MobileElement samesendworkaddress;
	
	@AndroidFindBy (id = "com.ibigroup.mobile.otp.android:id/tv_save")
	private MobileElement worksavebutton;
	
	
	public void clickworktext () {
		gf.Click(worktext);
	}
	public void clickeditworktext () {
		gf.Click(edithometext);
	}
    public void enterworkaddress (String address1) {
    	gf.Sendkeys(address1, sendworkaddress);
    }
    public void selectworkaddress () {
    	gf.Click(workaddressfromlist);
    }
    public boolean displaysamework () {
    	return gf.IsElementVisible(samesendworkaddress);
    }
    public String workValidation () {  
    	return gf.getText(samesendworkaddress); 	 
     }
    public void clicksaveworkbutton () {
    	gf.Click(worksavebutton);
    }
    
    // Add Anther Address
    
    @AndroidFindBy (id = "com.ibigroup.mobile.otp.android:id/ll_add_another_place")
	private MobileElement addantheraddress;
	
	@AndroidFindBy (id = "com.ibigroup.mobile.otp.android:id/et_add_new_location")
    private MobileElement AddPlace;
	
	@AndroidFindBy (id = "com.ibigroup.mobile.otp.android:id/et_add_new_location")
	private MobileElement sendAddplace;
	
	@AndroidFindBy (id = "com.ibigroup.mobile.otp.android:id/tv_new_location")
	private MobileElement addaddressbar;
	
	@AndroidFindBy (id = "com.ibigroup.mobile.otp.android:id/at_search")
	private MobileElement enterlocation;
	
	@AndroidFindBy (id = "com.ibigroup.mobile.otp.android:id/at_search")
	private MobileElement sendlocation;
	
	@AndroidFindBy (id ="com.ibigroup.mobile.otp.android:id/tv_address")
	private MobileElement selectaddlocation;
	
	@AndroidFindBy (id = "com.ibigroup.mobile.otp.android:id/tv_new_location")
	private MobileElement sameaddlocation;
	
	@AndroidFindBy (id = "com.ibigroup.mobile.otp.android:id/tv_save")
	private MobileElement addlocationsave;
	
	@AndroidFindBy (xpath ="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.ScrollView/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.ListView/android.widget.LinearLayout[1]/android.widget.RelativeLayout/android.widget.ImageView")
	private MobileElement deleteoffice;
	
	public void clickaddantheraddress() {
		gf.Click(addantheraddress);
	}
	public void newlocationplace () {
		gf.Click(AddPlace);
	}
	public void enterlocationplace (String placename) {
		gf.Sendkeys(placename,sendAddplace);
	}
	public void clickaddaddressbar () {
		gf.Click(addaddressbar);
	}
	public void clicklocation () {
		gf.Click(enterlocation);
	}
	public void enterlocation (String locationaddress) {
		gf.Sendkeys(locationaddress, sendlocation);
	}
	public void selectaddaddress() {
		gf.Click(selectaddlocation);
	}
	public boolean findaddlocation () {
		return gf.IsElementVisible(sameaddlocation);
	}
	public String addlocationValidation () {  
		return gf.getText(sameaddlocation); 	 
	 }
	public void clickaddsave() {
		gf.Click(addlocationsave);
		
	}
	public void clickdelectoffice() {
		gf.Click(deleteoffice);
		gf.verticalSwipeByPercentages(0.9, 0.3, 0.3);
	}
	

}
