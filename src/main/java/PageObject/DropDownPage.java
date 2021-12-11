package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class DropDownPage {

	public WebDriver gapDriver;

	// Defining all the objects in the page

	By drp_DropDown = By.id("dropdown");

	public DropDownPage(WebDriver gapDriver) {
		this.gapDriver = gapDriver;
		// TODO Auto-generated constructor stub
	}

	public WebElement drp_DropDown() {
		return gapDriver.findElement(drp_DropDown);
	}
}
