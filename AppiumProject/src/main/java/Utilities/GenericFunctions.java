package Utilities;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.NoSuchElementException;
import static io.appium.java_client.touch.WaitOptions.waitOptions;
import static io.appium.java_client.touch.offset.PointOption.point;
import static java.time.Duration.ofMillis;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.ElementOption;
import io.appium.java_client.touch.offset.PointOption;

public class GenericFunctions {
	
	public AppiumDriver driver;

public GenericFunctions(AppiumDriver driver) {
	this.driver = driver;
}

public MobileElement WaitForElementVisible(MobileElement e)
{
    WebDriverWait wait = new WebDriverWait(driver, 30);
    MobileElement element= (MobileElement) wait.until(ExpectedConditions.visibilityOf(e));
	return element;		
}

public void Sendkeys(String text, MobileElement e) {
	WaitForElementVisible(e);
	e.sendKeys(text);
	Log.info("Entered Text: "+text+ "on"+ e);
}

public boolean isDisplayed(MobileElement e) {
	WaitForElementVisible(e);
	return e.isDisplayed();
}

public boolean Click(MobileElement e) {
	boolean IsElementClicked = false;
	try {
		Thread.sleep(3500);
		WaitForElementVisible(e);
		e.click();
		Log.info("Clicked on :"+ e);
		IsElementClicked = true;
	}catch(NoSuchElementException e1) {
		Log.info("Element" + e1 + "not found on page" + driver.getTitle());
		IsElementClicked = false;
	}catch(Exception e1) {
		Log.info("Unknown Error" + e1.getMessage() +"occurred on page"+ driver.getTitle());
		IsElementClicked = false;
	}
	return IsElementClicked;
}
public boolean IsElementVisible(MobileElement e){
	boolean isElementVisible = false;
	try {
		Thread.sleep(3500);
		isElementVisible = WaitForElementVisible(e).isDisplayed(); // 
	}catch(NoSuchElementException e1) {
		System.out.println("Element" + e1 + "not found on page" + driver.getTitle());
	isElementVisible = false;
	}catch(Exception e1){
		System.out.println("Unknown Error" + e1.getMessage() +"Occured on page" + driver.getTitle());
		isElementVisible = false;
	}
	return isElementVisible;
}	
public String getText(MobileElement e) {
	WaitForElementVisible(e);
	return e.getText();	
}
public void verticalSwipeByPercentages(double startPercentage, double endPercentage, double anchorPercentage) {
    Dimension size = driver.manage().window().getSize();
    int anchor = (int) (size.width * anchorPercentage);
    int startPoint = (int) (size.height * startPercentage);
    int endPoint = (int) (size.height * endPercentage);
    new TouchAction(driver)
        .press(point(anchor, startPoint))
        .waitAction(waitOptions(ofMillis(1000)))
        .moveTo(point(anchor, endPoint))
        .release().perform();
}
public void horizontalSwipeByPercentage (double startPercentage, double endPercentage, double anchorPercentage) {
    Dimension size = driver.manage().window().getSize();
    int anchor = (int) (size.height * anchorPercentage); 
    int startPoint = (int) (size.width * startPercentage);
    int endPoint = (int) (size.width * endPercentage);
    new TouchAction(driver)
        .press(point(startPoint, anchor))
        .waitAction(waitOptions(ofMillis(1000)))
        .moveTo(point(endPoint, anchor))
        .release().perform();
}
public void dragAndDrop() {
	new TouchAction(driver)
    .press(PointOption.point(527, 1258))
    .waitAction(WaitOptions.waitOptions(Duration.ofMillis(2000)))
    .perform()
    .moveTo(PointOption.point(28, 175))
    .release()
    .perform();
}
public void tapByCoordinates(double start, double end) {
	int newStart = (int) start;
	int newEnd = (int) end;
	TouchAction touchAction = new TouchAction(driver);
	touchAction.tap(new PointOption().withCoordinates(newStart, newEnd)).perform();

}
}
