package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ChildWindowPage {

	public WebDriver gapDriver;

	// Defining all the objects in the page
	By header_h3 = By.xpath("//h3");

	public ChildWindowPage(WebDriver gapDriver) {
		// TODO Auto-generated constructor stub
		this.gapDriver = gapDriver;
	}

	public WebElement header_h3() {
		return gapDriver.findElement(header_h3);
	}
}
