package utils;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebElement;

import com.google.common.collect.ImmutableMap;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;

public class AndroidActions {
	static AndroidDriver driver;
	public AndroidActions(AndroidDriver driver) {
		AndroidActions.driver=driver;
	}
	public static void longPressAction(WebElement e) {
		((JavascriptExecutor)driver).executeScript("mobile: longClickGesture", ImmutableMap.of("elementId",((RemoteWebElement)e).getId(),"duration",2000));
		
	}
	public static void scollToText(String text) {
		driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\""+text+"\"))"));
		
	}
	public static void androidScrollGesture() {
		boolean canScrollMore;
		do {
			canScrollMore=(Boolean)((JavascriptExecutor)driver).executeScript("mobile:scrollGesture", ImmutableMap.of(
					"left",100,
					"top",100,
					"width",200,
					"height",200,
					"direction","down",
					"percent",3.0
					));
		}while(canScrollMore);
	}

	
	public static void swipeGesture(WebElement webEle) {
		((JavascriptExecutor)driver).executeScript("mobile:swipeGesture", ImmutableMap.of(
				"elementId",((RemoteWebElement)webEle).getId(),
				"direction","left",
				"percent",0.75));
	}
}
