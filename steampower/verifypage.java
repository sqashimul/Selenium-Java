package steampower;

import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebElement;

public class verifypage {
	public static String actualtext;
	public By YEAR = By.xpath("//*[@id='newsColumn']/i[3]");

	
	
	
	public void verifydata() {
		
		
		By driver = null;
		WebElement year = driver.findElement((SearchContext) YEAR);
		String actualtext = year.getText();
		if (actualtext.contains("2023")) {
			actualtext = "2023";
		}
	}

}
