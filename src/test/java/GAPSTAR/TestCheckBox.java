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

		// Click First check box
		gapCheckBoxPage.chk_Option().get(0).click();
		// Click First check box
		gapCheckBoxPage.chk_Option().get(1).click();

		// Get check box values
		boolean chk1_Actual = gapCheckBoxPage.chk_Option().get(0).isEnabled();
		boolean chk2_Actual = gapCheckBoxPage.chk_Option().get(1).isSelected();

		System.out.println("Check Box-1 Value is :" + chk1_Actual);
		System.out.println("Check Box-2 Value is :" + chk2_Actual);

		// Verify check box values
		assertTrue(chk1_Actual, "Invalid check box value");
		assertFalse(chk2_Actual, "Invalid check box value");
		gapDriver.quit();
	}

}
