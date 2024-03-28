package workingWithUnitTestingtool;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class WorkWithTimeout {
	@Test(timeOut=3000)
	public void payment() {
	WebDriver driver= new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.phonepe.com/");
	//Thread.sleep(3000);
	driver.quit();
}
}
