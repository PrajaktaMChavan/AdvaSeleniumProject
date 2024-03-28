package workingWithUnitTestingtool;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.decorators.WebDriverDecorator;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class WorkingWithHardAssert {
	@Test
	public void login() throws InterruptedException {
		String expURL="https://www.bmw.in/en/index.html";
		String ExpmodelsUrl="https://www.bmw.in/en/all-models.html";
		WebDriver driver=new ChromeDriver();
		Reporter.log("user is able to open empty browser",true);
		driver.manage().window().maximize();
		Reporter.log("user is able to open mazimize browser",true);
		driver.get("https://www.bmw.in/");
		Reporter.log("user is able to Open BMW",true);
		
		Thread.sleep(3000);
		String actualUrl =driver.getCurrentUrl();
		System.out.println(actualUrl);
		Assert.assertEquals(actualUrl,expURL);
		
		driver.findElement(By.xpath("//span[text()='Models']")).click();
		String actualModelsUrl=driver.getCurrentUrl();
		System.out.println(actualModelsUrl);
		
		Assert.assertEquals(actualModelsUrl, ExpmodelsUrl);
		Thread.sleep(3000);
		driver.quit();
		
		
		
		
		
	}
	
	
	

}
