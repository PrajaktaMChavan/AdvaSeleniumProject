package workingwithTestingProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class BaseClass {
	public WebDriver driver;
	
	String actualURL="https://demowebshop.tricentis.com/";
	
	@BeforeSuite
	public void beforeSuite() {
		System.out.println("I am before suite");
		Reporter.log("Data base connetion start",true);
		
	}
	@AfterSuite
	public void afterSuite() {
		System.out.println("I am after suite");
		Reporter.log("Data base connetion stop",true);
	}
	@BeforeClass
	public void browserSetUp() throws InterruptedException {
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		Reporter.log("User is able to open empty browser",true);
		driver.get("https://demowebshop.tricentis.com/");
		Reporter.log("User is able to open DemoWebShop",true);
		String url=driver.getCurrentUrl();
		if(url.equals(actualURL)) {
			Reporter.log("user is able to land on DemoWebShop home page",true);
			
		}else {
			Reporter.log("user is not able to  open DemoWebShop");
			
			}
		Thread.sleep(6000);
		
	}
	@AfterClass
	public void toQuitBrowser() {
		driver.quit();
		Reporter.log("user is able to close the demowebshop",true);
	}
	@BeforeMethod
	public void login() throws InterruptedException {
		driver.findElement(By.linkText("Log in")).click();
//		driver.findElement(By.id("Email")).sendKeys(emailId);
//		driver.findElement(By.id("Password")).sendKeys(password);
		driver.findElement(By.id("RememberMe")).click();
		driver.findElement(By.xpath("//input[@value='Log in']")).click();
		Reporter.log("user is able to login for demowebshop",true);
		Thread.sleep(6000);
		}
	@AfterMethod
	public void logout() throws InterruptedException {
		driver.findElement(By.linkText("Log out")).click();
		Reporter.log("user is able to logout from demowebshop",true);
		Thread.sleep(6000);
	}
	

}
