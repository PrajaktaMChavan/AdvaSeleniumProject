package TestScript;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class nykaa{
	@Test
	public void run() throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.nykaafashion.com/");
		Thread.sleep(4000);
		driver.quit();
		
	}
	
	}


