package PageObject;

import java.time.Duration;

import steampower.ConfigData;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class PrivacyPage {
	
	public WebDriver driver;
	public By SCROLLPRIVACYPOLICY = By.xpath("(//a[contains(text(),'Privacy Policy')])[2]");
	public By PRIVACYPOLICY = By.linkText("Privacy Policy");
	public By SUPPORTEDLANGUAGE = By.id("languages");
	public By TAGNAME = By.tagName("a");
	
	
	public void mainpage() {
		
		driver.get(ConfigData.url);
		
		Actions actions = new Actions(driver);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		actions.scrollToElement(driver.findElement(SCROLLPRIVACYPOLICY)).build().perform();
		WebElement privacyPolicyLink = driver.findElement(PRIVACYPOLICY);
		privacyPolicyLink.click();
		
		List<String> windowhandleList = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(windowhandleList.get(1));
		System.out.println(driver.getCurrentUrl());
		
		WebElement supportedlanguage = driver.findElement(SUPPORTEDLANGUAGE);
		List<WebElement>languageitems = supportedlanguage.findElements(TAGNAME);
		System.out.println(languageitems.size());
		
		
		Assert.assertEquals(steampower.verifypage.actualtext, "2023", "Result Failed: Year not match");
		
		
	}
	
	

}
