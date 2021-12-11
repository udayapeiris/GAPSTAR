//We are assigning browser and url through the external property file 
//File path: "C:\\Users\\UPeiris\\eclipse-workspace\\GAPSTAR\\src\\main\\java\\Resources\\globalData.properties")
package Resources;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BaseClass {

	// Defining Global level driver variable
	public WebDriver gapDriver;

	// This method use to initialize the driver and return driver to the test cases.
	public WebDriver initializeWebDriver() throws IOException {
		
		// Use property file to read golbal data
		Properties gapPropFile = new Properties();
		
		// You may need to change the property file path
		FileInputStream gapInputStream = new FileInputStream(
				"C:\\Users\\UPeiris\\eclipse-workspace\\GAPSTAR\\src\\main\\java\\Resources\\globalData.properties");
		// Loading the property file
		gapPropFile.load(gapInputStream);

		// Get the Browser value from property file
		String gapBrowser = gapPropFile.getProperty("browser");
		String gapUrl = gapPropFile.getProperty("url");
		
		// Initialize Chrome Driver
		if (gapBrowser.equals("Chrome")) {
			System.setProperty("webdriver.chrome.driver", "C:\\webdriver\\chromedriver.exe");
			gapDriver = new ChromeDriver();
			gapDriver.manage().window().maximize();
			System.out.println("Browser initialize successfully : " + gapDriver);
			gapDriver.get(gapUrl);
			System.out.println("URl is  : " + gapUrl);

		}

		// Initialize FF Driver
		else if (gapBrowser.equals("FF")) {
			System.setProperty("webdriver.gecko.driver", "C:\\webdriver\\gekodriver.exe");
			gapDriver = new FirefoxDriver();
			gapDriver.manage().window().maximize();
			System.out.println("Browser initialize successfully : " + gapDriver);
			gapDriver.get(gapUrl);
			System.out.println("URl is  : " + gapUrl);
		}

		// Initialize IE/Edge Driver
		else if (gapBrowser.equals("IE")) {
			System.setProperty("webdriver.edge.driver", "C:\\webdriver\\msedgedriver.exe");
			gapDriver = new EdgeDriver();
			System.out.println("Browser initialize successfully : " + gapDriver);
			gapDriver.get(gapUrl);
			System.out.println("URl is  : " + gapUrl);
		}

		// This 6 second implicit wait will apply all the test cases in this project
		gapDriver.manage().timeouts().implicitlyWait(6, TimeUnit.SECONDS);
		return gapDriver;
	}

	

}
