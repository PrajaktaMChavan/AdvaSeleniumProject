package workingWithUnitTestingtool;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Basic {
	@Test
	public void run() {
	//	System.out.println("hello testng");
		Reporter.log("Hello testng",true);
		
	}

}
