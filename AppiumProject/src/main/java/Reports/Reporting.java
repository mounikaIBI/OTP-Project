package Reports;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.ITestResult;
import org.testng.TestListenerAdapter;
//Listener class used to generate Extent reports
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;

public class Reporting extends TestListenerAdapter {
	public ExtentHtmlReporter htmlReporter; //reference variable
	public ExtentReports extent;
	public ExtentTest logger;
	public AppiumDriver driver;

	public void onStart(ITestContext testContext)
	{
		String timeStamp = new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new Date());//time stamp
		String repName="TestReport-"+timeStamp+".html";
		htmlReporter=new ExtentHtmlReporter("./test-output/"+repName);//specify location of the report
		htmlReporter.loadXMLConfig("src\\main\\resources\\extent-config.xml");
		extent=new ExtentReports();
		extent.attachReporter(htmlReporter);
		extent.setSystemInfo("Host name","K monika");
		extent.setSystemInfo("Environemnt","Android");
		extent.setSystemInfo("user","QA tester");
		htmlReporter.config().setDocumentTitle("Mobile Automation Test Project"); // Tile of report
		htmlReporter.config().setReportName("Functional Test Automation Report"); // name of the report
		htmlReporter.config().setTheme(Theme.STANDARD);
	}
	public void onTestSuccess(ITestResult tr)
	{
		logger=extent.createTest("I am in onStart method " +tr.getName()); // create new entry in the report
		logger.log(Status.PASS,MarkupHelper.createLabel(tr.getName(),ExtentColor.GREEN)); // send the passed information to the report with GREEN color highlighted
	}
	
	public void onTestFailure(ITestResult tr)
	{
		if (tr.getStatus() == ITestResult.FAILURE)
        {
			logger=extent.createTest(tr.getName()); // create new entry in th report
			logger.log(Status.FAIL,MarkupHelper.createLabel(tr.getName(),ExtentColor.RED)); // send the passed information to the report with GREEN color highlighted
			String screenshotPath="./test-output/Screenshots/"+tr.getName()+".png";
			File f = new File(screenshotPath); 	
			if(f.exists())
			{
				try {
					 logger.fail("Screenshot is below:" + logger.addScreenCaptureFromPath(screenshotPath));
				} 
				catch (IOException e) 
				{
					e.printStackTrace();
				}
			}	
        }	
	}

	public void onTestSkipped(ITestResult tr)
	{
		logger=extent.createTest(tr.getName()); // create new entry in the report
		logger.log(Status.SKIP,MarkupHelper.createLabel(tr.getName(),ExtentColor.YELLOW));
	}

	public void onFinish(ITestContext testContext)
	{
		extent.flush();
	}
}
