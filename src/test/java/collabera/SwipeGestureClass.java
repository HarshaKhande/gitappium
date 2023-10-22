package collabera;

import java.net.MalformedURLException;

import org.testng.annotations.Test;

import utils.AndroidActions;

public class SwipeGestureClass extends BaseClass {
	 @Test
	 public void swipe() throws MalformedURLException {
		 test.info("Swipe Gesture Class");
		 formPage.clickOnElement(formPage.Views);
		 formPage.clickOnElement(formPage.Gallery);
		 formPage.clickOnElement(formPage.Photos);
		 formPage.validateIfFocusableisTrue();
		 AndroidActions.swipeGesture(formPage.firstImage);
		 formPage.validateIfFocusableisFalse();			
	 }
}
