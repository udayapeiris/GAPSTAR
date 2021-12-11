package GAPSTAR;

import static org.testng.Assert.assertTrue;

import java.io.IOException;

import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import PageObject.HomePage;
import PageObject.HoversPage;
import Resources.BaseClass;

@Test
public class TestHovers extends BaseClass{
	
	public void loadUrl() throws IOException {
		gapDriver=initializeWebDriver();
	}
	
	public void testHoverPage() {
		HomePage gapHomePage=new HomePage(gapDriver);
		gapHomePage.openHover().click();
		HoversPage gapHoverPage=new HoversPage(gapDriver);
		Actions gapAction = new Actions(gapDriver);
		int img_User=gapHoverPage.img_User().size();
				
		for (int i=0;i<img_User;i++) {
		gapAction.moveToElement(gapHoverPage.img_User().get(i)).build().perform();
		String userName= gapHoverPage.lbl_UserName().get(i).getText();
		System.out.println("User name is : " +userName);
		
		//Verify User names 
		assertTrue(userName.contains("user"+Integer.toString(i+1)), "User name is invalid.");
		}
		
		gapDriver.quit();
		}

}

