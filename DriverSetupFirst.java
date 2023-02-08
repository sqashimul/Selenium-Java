package utilities;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class DriverSetupFirst {
	public WebDriver driver;
	
	@BeforeSuite
	public void setDriver() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
//		driver.get("");
		
	}
	@AfterSuite
	public void quitDriver() {
		driver.quit();
	}

}
