package a1qatask2practice.copy;

import java.time.Duration;
import a1qatask2practice.copy.PrivacyPage;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class SearchPage extends DriverSetup {

	@Test
	public void testSearch() throws InterruptedException {
		driver.get("https://store.steampowered.com/");
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

		WebElement searchBox = driver.findElement(SEARCHBOX);
		searchBox.sendKeys("Dota 2");

		WebElement searchButton = driver.findElement(SEARCHBUTTON);
		searchButton.click();
		WebElement firstResult = driver.findElement(FIRSTRESULT);
		Assert.assertEquals(firstResult.getText(), "Dota 2");

		List<String> firstsearch = new ArrayList<String>();
		firstsearch.add(firstResult.getText());
		System.out.println(firstsearch);

		WebElement firstResultdate = driver.findElement(FIRSTRESULDATE);
		firstResultdate.isDisplayed();
		List<String> firstsearchdate = new ArrayList<String>();
		firstsearchdate.add(firstResultdate.getText());
		System.out.println(firstsearchdate);

		WebElement dota2price = driver.findElement(DOTAPRICE);
		dota2price.isDisplayed();
		List<String> price1 = new ArrayList<String>();
		price1.add(dota2price.getText());
		System.out.println(price1);

		WebElement reviewsummary1 = driver.findElement(REVIEW1);
		reviewsummary1.isDisplayed();
		List<String> dota2review = new ArrayList<String>();
		dota2review.add(reviewsummary1.getText());
		System.out.println(dota2review);

		// Get the second result from the list
		WebElement secondResult = driver.findElement(SECONDRESULT);
		String secondResultName = secondResult.getText();
		System.out.println(secondResultName);
		Assert.assertTrue(secondResult.isDisplayed());

		// Search for the second result in the header
		searchBox = driver.findElement(SEARCHBOX);
		searchBox.clear();

		searchBox.sendKeys(secondResultName);
		searchButton = driver.findElement(SEARCHBUTTON);
		searchButton.click();

		WebElement secondprice = driver.findElement(PRICE);
		secondprice.isDisplayed();

		List<String> price2 = new ArrayList<String>();
		price2.add(secondprice.getText());
		System.out.println(price2);

		WebElement reviewsummary2 = driver.findElement(REVIEW2);
		reviewsummary2.isDisplayed();
		List<String> seconditem = new ArrayList<String>();
		seconditem.add(reviewsummary2.getText());
		System.out.println(seconditem);

	}

}
