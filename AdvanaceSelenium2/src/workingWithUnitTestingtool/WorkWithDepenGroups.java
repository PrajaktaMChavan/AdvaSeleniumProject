package workingWithUnitTestingtool;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class WorkWithDepenGroups {
	@Test(groups="mobile")
	public void motorola() throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.motorola.in/");
		Thread.sleep(3000);
		driver.quit();
	}
	@Test(groups="mobile")
	public void vivo() throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.vivo.com/in/");
		Thread.sleep(3000);
		driver.quit();
	}
	@Test(groups="mobile")
	public void oppo() throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.oppo.com/in/");
		Thread.sleep(3000);
		driver.quit();
	}
	
	

}
