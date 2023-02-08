package handle_web_element;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import utilities.DriverSetupFirst;

public class TC03_iFrameCheckBoxRadioButon extends DriverSetupFirst{
	@Test
	public void testRadioButton() throws InterruptedException {
		driver.get("https://jqueryui.com/checkboxradio/");
		
		driver.switchTo().frame(0);
		WebElement radiobutton1  = driver.findElement(By.cssSelector("label[for='radio-1']"));
		radiobutton1.click();
		Thread.sleep(4000);
		
		driver.switchTo().defaultContent();
		WebElement title = driver.findElement(By.xpath("//h1[normalize-space()='Checkboxradio']"));
		System.out.println(title.getText());
		
		WebElement iframe = driver.findElement(By.xpath("//iframe[@class='demo-frame']"));
		driver.switchTo().frame(iframe);
		
		WebElement radiobutton2  = driver.findElement(By.cssSelector("label[for='radio-2']"));
		radiobutton2.click();
		Thread.sleep(4000);
		
		driver.findElement(By.cssSelector("label[for='checkbox-4']")).click();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("label[for='checkbox-3']")).click();
		Thread.sleep(2000);
		
		driver.switchTo().defaultContent();

	}
	
	

}
