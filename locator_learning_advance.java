package locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import utilities.DriverSetupFirst;

public class locator_learning_advance extends DriverSetupFirst {
	
	@Test
	public void LocateRadioButton1ByCssSelector() throws InterruptedException {
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		WebElement radio_button_one =  driver.findElement(By.cssSelector("input[value='radio1']"));
		radio_button_one.click();
		Thread.sleep(4000);
	}
	@Test
	public void LocateRadioButton2ByXpath() throws InterruptedException {
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		WebElement radio_button_two =  driver.findElement(By.xpath("//input[@value='radio2']"));
		radio_button_two.click();
		Thread.sleep(4000);
	}
	
	@Test
	public void LocateHeadingByCssSelectorTagName() throws InterruptedException {
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		WebElement h1 =  driver.findElement(By.cssSelector("h1"));
		System.out.println(h1.getText());
		Thread.sleep(4000);
	}
	@Test
	public void LocateRadioButtonExampleByCcssSelectorDirectChild() throws InterruptedException {
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		WebElement radioButtonExample =  driver.findElement(By.cssSelector("fieldset > legend"));
		System.out.println(radioButtonExample.getText());
		Thread.sleep(4000);
	}
	@Test
	public void LocateRadioButtonExampleByXpathDirectChild() throws InterruptedException {
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		WebElement radioButtonExample =  driver.findElement(By.xpath("//fieldset /legend"));
		System.out.println(radioButtonExample.getText());
		Thread.sleep(4000);
	}
	@Test
	public void LocateCheckBoxBycssSelectorMultipleAtribute() throws InterruptedException {
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		WebElement checkbox1 =  driver.findElement(By.cssSelector("input[type='checkbox'][name='checkBoxOption1']"));
		checkbox1.click();
		Thread.sleep(4000);
	}
	@Test
	public void LocateCheckBoxBYXpathrMultipleAtribute() throws InterruptedException {
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		WebElement checkbox1 =  driver.findElement(By.xpath("//input[@type='checkbox' and @name='checkBoxOption1']"));
		checkbox1.click();
		Thread.sleep(4000);
	}
	@Test
	public void LocateSelectOptionBycssSelectorSubstring() throws InterruptedException {
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		WebElement selectoption =  driver.findElement(By.cssSelector("select[id *='dropdown-class']"));
		selectoption.click();
		Thread.sleep(4000);
	}
	@Test
	public void LocateSelectOptionByXpathSubstring() throws InterruptedException {
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		WebElement selectoption =  driver.findElement(By.xpath("//select[@id='dropdown-class-example']"));
		selectoption.click();
		Thread.sleep(4000);
	}
	@Test
	public void LocateSelectOptionByCssSelectorStartWith() throws InterruptedException {
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		WebElement selectoption =  driver.findElement(By.cssSelector("select[id ^='dropdown-class']"));
		selectoption.click();
		Thread.sleep(4000);
	}
	@Test
	public void LocateSelectOptionByXpathStartWith() throws InterruptedException {
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		WebElement selectoption =  driver.findElement(By.xpath("//select[starts-with(@id, 'dropdown-class')]"));
		selectoption.click();
		Thread.sleep(4000);
	}
	@Test
	public void LocateSelectOptionByCssSelectorEndWith() throws InterruptedException {
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		WebElement selectoption =  driver.findElement(By.cssSelector("select[id $='pdown-class-example']"));
		selectoption.click();
		Thread.sleep(4000);
	}


}
