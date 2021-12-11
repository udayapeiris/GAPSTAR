package PageObject;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HoversPage {
	
public WebDriver gapDriver;
	
	//Defining all the objects in the page 
	
	By img_User=By.xpath("//div[@class='figure']");
	By lbl_UserName=By.xpath("//h5");
	
	public HoversPage(WebDriver gapDriver) {
		this.gapDriver=gapDriver;
		// TODO Auto-generated constructor stub
	}

	public List<WebElement> img_User() {
		List<WebElement> img_User=gapDriver.findElements(By.xpath("//div[@class='figure']"));
		return img_User;
		
	}
	
	public List<WebElement> lbl_UserName() {
		List<WebElement> lbl_UserName=gapDriver.findElements(By.xpath("//h5"));
		return lbl_UserName;
		
	}


	

}
