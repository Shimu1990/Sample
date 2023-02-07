package Com.bit.Test;

import java.io.IOException;
import java.util.Properties;

import org.junit.Before;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import Utility.Helper;

public class BaseTest {
	Properties prop;
	WebDriver driver;
	
	@Before
	public void openBrowser() throws IOException {
		prop = Helper.readProfile("/Users/ajharulislam/eclipse-workspace/Maven_Project/Project.properties");
		
		String b=prop.getProperty("browser");
		
		if (b.equals("Chrome")){
		driver = new ChromeDriver();
		System.out.println("open chrome broser");
		
	}
	else if (b.equals("firefox")) {
	driver = new FirefoxDriver();
	System.out.println("open fire fox broser");
}
	
}

}
