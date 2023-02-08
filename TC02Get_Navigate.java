package handle_web_element;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WindowType;
import org.testng.annotations.Test;

import utilities.DriverSetupFirst;

public class TC02Get_Navigate extends DriverSetupFirst{
	
	public String base_url = "https://rahulshettyacademy.com/AutomationPractice/";
	
	@Test
	private void navigateToWebPage() throws InterruptedException{
		driver.get(base_url);
		driver.navigate().to("https://rahulshettyacademy.com/documents-request");
		driver.navigate().back();
		driver.navigate().forward();
		Thread.sleep(5000);
		driver.navigate().refresh();
	}
	@Test
	public void handleBrowserWindow() throws InterruptedException {
		driver.get(base_url);
		Thread.sleep(5000);
//		System.out.println(); Sout to create print function
		driver.switchTo().newWindow(WindowType.TAB);
		Thread.sleep(5000);
		driver.navigate().to(base_url);
		Thread.sleep(5000);
		driver.switchTo().newWindow(WindowType.WINDOW);
		Thread.sleep(5000);
		driver.navigate().to(base_url);
		Thread.sleep(5000);
 		driver.close();
		driver.quit();
//		driver.findElement(By.id("openwindow")).click();
//		driver.findElement(By.id("opentab")).click();
//		System.out.println(driver.getTitle());
//		System.out.println(driver.getWindowHandle());
//		List<String> windowhandleList = new ArrayList<String>(driver.getWindowHandles());
//		System.out.println(windowhandleList.get(0));
//		System.out.println(windowhandleList.get(1));
//		System.out.println(windowhandleList.get(2));
//		
//		driver.switchTo().window(windowhandleList.get(1));
//		System.out.println(driver.getTitle());
//		System.out.println(driver.getWindowHandle());
//
//		driver.switchTo().window(windowhandleList.get(2));
//		System.out.println(driver.getTitle());
//		System.out.println(driver.getWindowHandle());
//		
//		driver.switchTo().window(windowhandleList.get(0));
//		System.out.println(driver.getTitle());
//		System.out.println(driver.getWindowHandle());

		
	}
	

}
