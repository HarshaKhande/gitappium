package collabera;

import java.net.MalformedURLException;
import utils.AndroidActions;
import org.testng.annotations.Test;

public class LongPressGesture extends BaseClass {
	@Test
	public void longPress() throws MalformedURLException {
		test.info("Clicked on Views");
		formPage.clickOnElement(formPage.Views);
		test.info("Clicked on ExpandableLists");
		formPage.clickOnElement(formPage.ExpandableLists);
		test.info("Clicked on CustomAdapter");
		formPage.clickOnElement(formPage.CustomAdapter);
		test.info("Long Press on PeopleNames");
		AndroidActions.longPressAction(formPage.PeopleNames);
		String val=formPage.getText(formPage.SampleMenu);
		
		formPage.validateIfCorrectText(val,"Sample menu");
		formPage.validateIfDisplayedTrue(formPage.SampleMenu);
	}
}
