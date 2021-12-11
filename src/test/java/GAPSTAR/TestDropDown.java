//In this tc we are adding  drop-down value through the external property file 
//File path : C:\\Users\\UPeiris\\eclipse-workspace\\GAPSTAR\\src\\test\\java\\TestData\\TestDropDown.properties

package GAPSTAR;

import static org.testng.Assert.assertEquals;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
import PageObject.DropDownPage;
import PageObject.HomePage;
import Resources.BaseClass;

@Test()
public class TestDropDown extends BaseClass {

	public void loadUrl() throws IOException, InterruptedException {

		gapDriver = initializeWebDriver();
	}

	public void testDropDownPage() throws IOException {

		// Getting test input data form the external file
		Properties gapPropFile = new Properties();
		// You may change the property file path
		FileInputStream gapInputStream = new FileInputStream(
				"C:\\Users\\UPeiris\\eclipse-workspace\\GAPSTAR\\src\\test\\java\\TestData\\TestDropDown.properties");
		gapPropFile.load(gapInputStream);
		String gapOptionValue = gapPropFile.getProperty("value");
		System.out.println("Property file value :" + gapOptionValue);

		HomePage gapHomePage = new HomePage(gapDriver);
		gapHomePage.openPageDropdown().click();

		// Initialize DropDown page
		DropDownPage gapDropDownPage = new DropDownPage(gapDriver);
		Select gapSelect = new Select(gapDropDownPage.drp_DropDown());

		// Set dropdown value
		gapSelect.selectByVisibleText(gapOptionValue);
		// Get the text of the selected value
		String actValue = gapSelect.getFirstSelectedOption().getText();

		// Verify Values
		assertEquals(actValue, gapOptionValue, "Test fail since actual value not math with expected value");
		gapDriver.quit();
	}

}
