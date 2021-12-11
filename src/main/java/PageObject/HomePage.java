package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {

	public WebDriver gapDriver;

	// Defining the home page menues
	By menu_StatusCodes = By.linkText("Status Codes");
	By menu_DragandDrop = By.linkText("Drag and Drop");
	By menu_Checkboxes = By.linkText("Checkboxes");
	By menu_BrokenImages = By.linkText("Broken Images");
	By menu_Dropdown = By.linkText("Dropdown");
	By menu_Geolocation = By.linkText("Geolocation");
	By menu_FormAuthentication = By.linkText("Form Authentication");
	By menu_MultipleWindows = By.linkText("Multiple Windows");
	By menu_KeyPresses = By.linkText("Key Presses");
	By menu_Hover = By.linkText("Hovers");

	public HomePage(WebDriver gapDriver) {
		// TODO Auto-generated constructor stub
		this.gapDriver = gapDriver;
	}

	// Open Menu StatusCodes
	public WebElement openPageStatusCodes() {
		return gapDriver.findElement(menu_StatusCodes);
	}

	// Open Menu StatusCodes
	public WebElement openPageDragandDrop() {
		return gapDriver.findElement(menu_DragandDrop);
	}

	// Open Menu Checkboxes
	public WebElement openPageCheckboxes() {
		return gapDriver.findElement(menu_Checkboxes);
	}

	// Open Menu BrokenImages
	public WebElement openPageBrokenImages() {
		return gapDriver.findElement(menu_BrokenImages);
	}

	// Open Menu Dropdown
	public WebElement openPageDropdown() {
		return gapDriver.findElement(menu_Dropdown);
	}

	// Open Menu Geolocation
	public WebElement openPageGeolocation() {
		return gapDriver.findElement(menu_Geolocation);
	}

	// Open Menu FormAuthentication
	public WebElement openPageFormAuthentication() {
		return gapDriver.findElement(menu_FormAuthentication);
	}

	// Open Menu KeyPresses
	public WebElement openPageKeyPresses() {
		return gapDriver.findElement(menu_KeyPresses);
	}

	// Open Menu MultiWindow
	public WebElement openMultipleWindows() {
		return gapDriver.findElement(menu_MultipleWindows);
	}

	// Open Menu KeyHover
	public WebElement openHover() {
		return gapDriver.findElement(menu_Hover);
	}
}
