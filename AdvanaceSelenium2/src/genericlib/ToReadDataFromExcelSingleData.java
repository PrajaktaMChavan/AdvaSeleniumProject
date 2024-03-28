package genericlib;

import java.io.IOException;

import javax.swing.text.Utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ToReadDataFromExcelSingleData {
	@Test
	public void toOpenDemoWebshop() throws IOException {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		UtlitilyMethods um = new UtlitilyMethods();
		 String URL = um.readingTheDataFromPropFile("./testData/data.properties","url");
		 driver.get(URL);
		 
		 driver.findElement(By.linkText("Log in")).click();
		 String email= um.readingDataFromExcelSingleValue("./testData/Excel.xlsx","Sheet4",0,0);
		 
		 driver.findElement(By.id("Email")).sendKeys(email);
		 
		
	}

}
