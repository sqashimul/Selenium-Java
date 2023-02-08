package locator;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TaskTwo {	
	
	@Test
	public void testWebPageTitle() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://store.steampowered.com/");
		driver.manage().window().maximize();
		System.out.println(driver.getTitle());
		Thread.sleep(4000);
		
		driver.findElement(By.linkText("login")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//input[@type='text'][1]")).sendKeys("abcdabcd@gmail.com");
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("admin@abc123");
		driver.findElement(By.xpath("//button[normalize-space()='Sign in']")).click();
		Thread.sleep(3000);
		driver.quit();
	}
}
	

