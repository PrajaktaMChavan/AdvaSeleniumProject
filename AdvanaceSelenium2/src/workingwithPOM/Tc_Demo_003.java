package workingwithPOM;

import org.testng.annotations.Test;

public class Tc_Demo_003 extends BaseClass {
	@Test
	public void searchProduct() throws InterruptedException {
		BasePage bp= new BasePage(driver);
		bp.getSearchBar().sendKeys("Simple Computer");
		Thread.sleep(4000);
		bp.getSearchButton().click();
	}
	

}
