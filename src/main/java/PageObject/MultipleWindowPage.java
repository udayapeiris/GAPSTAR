package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MultipleWindowPage {

	public WebDriver gapDriver;

	// Defining all the objects in the page
	By link_ClickHere = By.linkText("Click Here");
	By header_h3 = By.xpath("//h3");

	public MultipleWindowPage(WebDriver gapDriver) {
		// TODO Auto-generated constructor stub
		this.gapDriver = gapDriver;
	}

	public WebElement link_ClickHere() {
		return gapDriver.findElement(link_ClickHere);

	}

	public WebElement header_h3() {
		return gapDriver.findElement(header_h3);
	}

}
