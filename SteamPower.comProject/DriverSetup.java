package a1qatask2practice.copy;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class DriverSetup {
	
	public WebDriver driver;
	public By SCROLLPRIVACYPOLICY = By.xpath("(//a[contains(text(),'Privacy Policy')])[2]");
	public By PRIVACYPOLICY = By.linkText("Privacy Policy");
	public By SUPPORTEDLANGUAGE = By.id("languages");
	public By TAGNAME = By.tagName("a");
	public By YEAR = By.xpath("//*[@id='newsColumn']/i[3]");
	public By SEARCHBOX = By.id("store_nav_search_term");
	public By SEARCHBUTTON = By.xpath("//img[@src='https://store.cloudflare.steamstatic.com/public/images/blank.gif']");
	public By FIRSTRESULT = By.xpath("//span[normalize-space()='Dota 2']");
	public By SECONDRESULT = By.xpath("//*[@id='search_resultsRows']/a[2]");
	public By FIRSTRESULDATE = By.xpath("//div[normalize-space()='9 Jul, 2013']");
	public By DOTAPRICE = By.xpath("//*[@id='search_resultsRows']/a[1]/div[2]/div[4]/div[2]");
	public By REVIEW1 = By.xpath("//*[@id='search_resultsRows']/a[2]/div[2]/div[3]/span");
	public By PRICE = By.xpath("//*[@id='search_resultsRows']/a[2]/div[2]/div[4]/div[2]");
	public By REVIEW2 = By.xpath("//*[@id='search_resultsRows']/a[1]/div[2]/div[3]/span");
	
	@BeforeTest
	public void setDriver() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	
	
		
	}
	@AfterTest
	public void teardown() {
		driver.quit();
	}
}
