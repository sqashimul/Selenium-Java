package PageObject;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import steampower.ConfigData;

public class SearchPage {
	
	
	public By SEARCHBOX = By.id("store_nav_search_term");
	public By SEARCHBUTTON = By.xpath("//a[@id='store_search_link']//img");
	public By FIRSTRESULT = By.xpath("//span[normalize-space()='Dota 2']");
	public By SECONDRESULT = By.xpath("//*[@id='search_resultsRows']/a[2]");
	public By FIRSTRESULDATE = By.xpath("//div[normalize-space()='9 Jul, 2013']");
	
	
	public By DOTAPRICE = By.xpath("(//div[@class='col search_price  responsive_secondrow'])[1]");
	public By REVIEW1 = By.xpath("//*[@id='search_resultsRows']/a[2]/div[2]/div[3]/span");
	public By PRICE = By.xpath("(//div[@class='col search_price  responsive_secondrow'])[2]");
	public By REVIEW2 = By.xpath("//*[@id='search_resultsRows']/a[1]/div[2]/div[3]/span");
	
	
	public void testSearch() {
		
		WebDriver driver = null;
		driver.get(ConfigData.url);
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
