package locator;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MyFirstWebTest {	
	
	@Test
	public void testWebPageTitle() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.instagram.com/");
		driver.manage().window().maximize();
		System.out.println(driver.getTitle());
		assertEquals(driver.getTitle(), "Instagram");
		Thread.sleep(4000);
		driver.quit();
	}
	
	@Test
	public void testDescription() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.instagram.com/");
		driver.manage().window().maximize();
		WebElement description =  driver.findElement(By.xpath("//div[contains(text(),'Instagram Lite')]"));
		System.out.println(description.getText());
		assertEquals(description.getText(), "Instagram Lite");
		Thread.sleep(3000);
		
		driver.quit();
		
	}

}
