package GAPSTAR;

import static org.testng.Assert.assertEquals;

import java.io.IOException;
import java.util.Iterator;
import java.util.Set;
import org.testng.annotations.Test;
import PageObject.ChildWindowPage;
import PageObject.HomePage;
import PageObject.MultipleWindowPage;
import Resources.BaseClass;

@Test
public class TestMultipleWindow extends BaseClass {

	public void loadUrl() throws IOException {
		gapDriver = initializeWebDriver();

	}

	public void testMultipleWindowPage() {
		HomePage gapHomePage = new HomePage(gapDriver);
		gapHomePage.openMultipleWindows().click();
		;

		MultipleWindowPage gapMultipleWindowPage = new MultipleWindowPage(gapDriver);
		ChildWindowPage gapChildWindowPage = new ChildWindowPage(gapDriver);
		gapMultipleWindowPage.link_ClickHere().click();

		Set<String> gapOpenWindows = gapDriver.getWindowHandles();
		Iterator<String> gapIterator = gapOpenWindows.iterator();

		// Get parent window ID
		String parentID = gapIterator.next();
		// Get child win ID
		String childID = gapIterator.next();

		gapDriver.switchTo().window(childID);
		String actualChildHeader = gapChildWindowPage.header_h3().getText();
		String expectedChildHeader = "New Window";

		gapDriver.switchTo().window(parentID);
		String actuaParentHeader = gapMultipleWindowPage.header_h3().getText();
		String expectedParentHeader = "Opening a new window";

		assertEquals(actualChildHeader, expectedChildHeader, "Child Window caption is not correct");
		assertEquals(actuaParentHeader, expectedParentHeader, "Parent Window caption is not correct");
		gapDriver.quit();
	}

}
