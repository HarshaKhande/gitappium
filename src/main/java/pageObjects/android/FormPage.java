package pageObjects.android;

import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import utils.AndroidActions;

public class FormPage extends AndroidActions{
	AndroidDriver driver;
	public FormPage(AndroidDriver driver) {
		super(driver);
		this.driver=driver;
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}
	@AndroidFindBy(accessibility="Preference")
	public WebElement Preference;
	
	@AndroidFindBy(accessibility="Views")
	public WebElement Views;
	
	@AndroidFindBy(accessibility="Gallery")
	public WebElement Gallery;
	
	@AndroidFindBy(xpath="//android.widget.TextView[@text='1. Photos']")
	public WebElement Photos;
	
	@AndroidFindBy(xpath="(//android.widget.ImageView)[1]")
	public WebElement firstImage;
	
	@AndroidFindBy(xpath="//android.widget.TextView[@content-desc=\"Expandable Lists\"]")
	public WebElement ExpandableLists;
	@AndroidFindBy(accessibility = "1. Custom Adapter")
	public WebElement CustomAdapter;
		
	@AndroidFindBy(xpath="//android.widget.TextView[@text='People Names']")
	public WebElement PeopleNames;
	
	@AndroidFindBy(xpath="//android.widget.TextView[@text='Sample menu']")
	public WebElement SampleMenu;
	 
	

		
	public void clickOnElement(WebElement ele) {
		ele.click();
	}
	
	public void navigateBack() {
		driver.pressKey(new KeyEvent(AndroidKey.BACK));
	}
	public String getText(WebElement ele) {
		return ele.getText();
	}
	
	public void validateIfFocusableisTrue() {
		Assert.assertEquals(firstImage.getAttribute("focusable"),"true");
	}
	public void validateIfFocusableisFalse() {
		Assert.assertEquals(firstImage.getAttribute("focusable"),"false");
	}
	public void validateIfCorrectText(String str1, String str2) {
		
		Assert.assertEquals(str1,str2);
	
	}
	public void validateIfDisplayedTrue(WebElement ele) {
		Assert.assertTrue(ele.isDisplayed());
		System.out.println("Element is displayed");
	}
	public void validateIfDisplayedFalse(WebElement ele) {
		Assert.assertFalse(ele.isDisplayed());
		System.out.println("Element is not displayed");
	}
	
	
}
