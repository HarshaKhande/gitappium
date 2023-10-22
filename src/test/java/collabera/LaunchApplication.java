package collabera;

import java.net.MalformedURLException;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;
import pageObjects.android.FormPage;
import utils.AndroidActions;

public class LaunchApplication extends BaseClass {
	
	AndroidDriver driver;
	@Test
	public void launchApp() throws MalformedURLException {
		
	//FormPage pg = new FormPage(driver);
		
	
	  formPage.clickOnElement(formPage.Preference);
	  test.info("Clicked on Preference"); formPage.navigateBack();
	  formPage.clickOnElement(formPage.Views); test.info("Clicked on Views");
	  test.info("Scroll to bottom WebViews");
	  AndroidActions.scollToText("WebView"); test.pass("Clicked on WebView");
	 
		
	}
}
