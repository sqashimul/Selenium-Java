package handle_web_element;

import java.awt.Desktop.Action;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import utilities.DriverSetupFirst;

public class TC06_Allert extends DriverSetupFirst{
	
	@Test
	public void TesAllert() throws InterruptedException {

		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		driver.findElement(By.xpath("//button[normalize-space()='Click for JS Alert']")).click();
//		driver.switchTo().alert().accept();
		Alert alert = driver.switchTo().alert();
		alert.accept();
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//button[normalize-space()='Click for JS Confirm']")).click();
		Alert alert2 = driver.switchTo().alert();
		Thread.sleep(2000);
		alert2.dismiss();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//button[normalize-space()='Click for JS Prompt']")).click();
		Alert alert3 = driver.switchTo().alert();
		Thread.sleep(2000);
		System.out.println(alert.getText());
		alert3.sendKeys("hello");
		alert3.accept();
		Thread.sleep(4000);
	
	}
//	@Test
//	public void TesMultiSelectUsingAction() throws InterruptedException {
//		driver.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml_select_multiple");
//		Actions actions = new Actions(driver);
//		driver.switchTo().frame("iframeResult");
//		Select select = new Select(driver.findElement(By.id("cars")));
//		
//		actions.keyDown(Keys.CONTROL).click(select.getOptions().get(0)).click(select.getOptions().get(2)).keyUp(Keys.CONTROL).build().perform();
//		Thread.sleep(3000);
//		
//	}
//	

}
