package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class KeyPressPage {

	public WebDriver gapDriver;

	// Defining all the objects in the page

	By txt_Target = By.id("target");
	By lbl_Label = By.id("result");

	public KeyPressPage(WebDriver gapDriver) {
		// TODO Auto-generated constructor stub
		this.gapDriver = gapDriver;
	}

	public WebElement txt_Target() {
		return gapDriver.findElement(txt_Target);
	}

	public WebElement lbl_Label() {
		return gapDriver.findElement(lbl_Label);
	}

}
