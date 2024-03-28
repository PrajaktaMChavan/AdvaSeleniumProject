package workingWithUnitTestingtool;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class WorkinngwithPriority {
	
	@Test
	public void run() {
	//	System.out.println("hello testng");
		Reporter.log("Hello testng",true);
		
	}
	@Test(priority=1)
	public void register() {
		System.out.println("User is able to register");
		
	}
	@Test(priority=2)
	public void login() {
		System.out.println("User is able to login");
		
	}
	@Test(priority=3)
	public void searchProduct() {
		System.out.println("User is able to search product");
		
	}
	@Test(priority=2)
	public void addtocart() {
		System.out.println("User is able to Add to cart");
		
	}
	@Test(priority=4)
	public void Payment() {
		System.out.println("User is able to payment");
		
	}
	@Test(priority=5)
	public void closeTheApp() {
		System.out.println("User is able to close the app");
		
	}

}
