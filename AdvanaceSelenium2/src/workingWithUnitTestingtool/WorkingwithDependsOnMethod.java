package workingWithUnitTestingtool;

import org.testng.annotations.Test;

public class WorkingwithDependsOnMethod {
	@Test
	public void register() {
		System.out.println("Register");
	}
	@Test(dependsOnMethods = "register")
	public void login() {
		System.out.println("login");
	
	}
	@Test(dependsOnMethods= "login")
		public void Search() {
		System.out.println("Search");
	}
	@Test(dependsOnMethods= "Search")
	public void cart() {
	System.out.println("cart");
	}
	@Test(dependsOnMethods= "cart")
	public void payment() {
	System.out.println("payment");

}

}
