package PageObject;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CheckBoxPage {

	public WebDriver gapDriver;

	// Defining all the objects in the page
	By chk_Option = By.xpath("//input[@type='checkbox']");

	public CheckBoxPage(WebDriver gapDriver) {
		// TODO Auto-generated constructor stub
		this.gapDriver = gapDriver;
	}

	public List<WebElement> chk_Option() {
		List<WebElement> chk_Option = gapDriver.findElements(By.xpath("//input[@type='checkbox']"));
		return chk_Option;

	}
}
