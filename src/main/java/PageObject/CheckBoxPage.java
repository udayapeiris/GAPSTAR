package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CheckBoxPage {

	public WebDriver gapDriver;

	// Defining all the objects in the page
	By chk_Option1 = By.xpath("(//input[@type='checkbox'])[1]");
	By chk_Option2 = By.xpath("(//input[@type='checkbox'])[2]");

	public CheckBoxPage(WebDriver gapDriver) {
		// TODO Auto-generated constructor stub
		this.gapDriver = gapDriver;
	}

	public WebElement chk_Option1() {
		return gapDriver.findElement(chk_Option1);
	}

	public WebElement chk_Option2() {
		return gapDriver.findElement(chk_Option2);
	}

}
