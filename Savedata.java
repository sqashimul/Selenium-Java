package locator;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class Savedata {
	@Test
	public static void name() throws IOException {
		WebDriver driver = new ChromeDriver();
	    driver.get("https://www.premierleague.com/tables");

	    //Wait is addeded for the Page Load completion 
	    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	    wait.until(ExpectedConditions.titleContains("Premier"));


	    WebElement table;

	    table = driver.findElement(By.xpath("//*[@id=\"mainContent\"]/div/div[1]/div[3]/div/div"));

	    String dataoutput = table.getText();
	    System.out.println(dataoutput);


	    File filedata = new File("src/main/table.csv");

	    //Not Equal condition is modified
	    if (filedata.exists() && filedata.isFile()) {
	        FileWriter writecsv = new FileWriter(filedata);
	        String datas = dataoutput;
	        writecsv.append(dataoutput);
	        writecsv.close();
	}
	}

}
