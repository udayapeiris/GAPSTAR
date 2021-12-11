package GAPSTAR;

import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;
import java.io.IOException;
import org.testng.annotations.Test;
import PageObject.CheckBoxPage;
import PageObject.HomePage;
import Resources.BaseClass;

@Test
public class TestCheckBox extends BaseClass {

	public void loadUrl() throws IOException {
		gapDriver = initializeWebDriver();

	}

	public void testCheckBoxPage() {
		HomePage gapHomePage = new HomePage(gapDriver);
		gapHomePage.openPageCheckboxes().click();
		
		CheckBoxPage gapCheckBoxPage = new CheckBoxPage(gapDriver);
		gapCheckBoxPage.chk_Option1().click();
		gapCheckBoxPage.chk_Option2().click();

		// Specify check box values
		boolean chk1_Actual  = gapCheckBoxPage.chk_Option1().isSelected();
		boolean chk2_Actual = gapCheckBoxPage.chk_Option2().isSelected();
		
		System.out.println("Check Box-1 Value is :" +chk1_Actual);
		System.out.println("Check Box-2 Value is :" +chk2_Actual);
		
		// Verify values
		assertTrue(chk1_Actual, "Invalid check box value");
		assertFalse(chk2_Actual, "Invalid check box value");
		gapDriver.quit();
	}
	

}
