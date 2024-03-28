package workingWithUnitTestingtool;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Basic2 {
	@Test(invocationCount=5,threadPoolSize=5)
	public void run() throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.mercedes-benz.co.in/");
		Thread.sleep(4000);
		driver.quit();
		
	}
	
	

}
