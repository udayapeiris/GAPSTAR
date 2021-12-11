package GAPSTAR;

import static org.testng.Assert.assertTrue;

import java.io.IOException;

import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import PageObject.HomePage;
import PageObject.KeyPressPage;
import Resources.BaseClass;

@Test
public class TestKeyPress extends BaseClass {

	public void loadUrl() throws IOException {
		gapDriver = initializeWebDriver();

	}

	public void testCheckBoxPage() {
		HomePage gapHomePage = new HomePage(gapDriver);
		gapHomePage.openPageKeyPresses().click();

		KeyPressPage gapCheckBoxPage = new KeyPressPage(gapDriver);
		Actions gapAction = new Actions(gapDriver);
		gapAction.moveToElement(gapCheckBoxPage.txt_Target()).click().keyDown(Keys.SHIFT).build().perform();

		String gapResult = gapCheckBoxPage.lbl_Label().getText();
		System.out.println("Result value is :" +gapResult);
		assertTrue(gapResult.contains("SHIFT"), "String did not have the required key.");
		gapDriver.quit();
	}

}
