package a1qatask2practice.copy;

import static org.testng.Assert.assertEquals;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

public class PrivacyPage extends DriverSetup{
	
	public String base_url = "https://store.steampowered.com/";
	


	public void mainpage() throws InterruptedException {
		driver.get(base_url);
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
		
		WebElement year = driver.findElement(YEAR);
		String actualtext = year.getText();
		if (actualtext.contains("2023")) {
			actualtext = "2023";
		}
		Assert.assertEquals(actualtext, "2023", "Result Failed: Year not match");
		

	}

}

//private static final List<String> LANGUAGES = new ArrayList<String>(Arrays.asList("English", "Spanish", "French",
//		"German", "Italian", "Russian", "Japanese", "Portuguese", "Brazilian"));
