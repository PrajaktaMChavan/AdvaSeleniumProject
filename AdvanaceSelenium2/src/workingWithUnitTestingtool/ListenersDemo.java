package workingWithUnitTestingtool;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.io.FileHandler;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.google.common.io.Files;

public class ListenersDemo<TakeScreenshot> implements ITestListener {

	@Override
	public void onTestStart(ITestResult result) {
		System.out.println(result.getName() +"Test case is started");
		
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		System.out.println(result.getName() +"Test case is sucess");
		
	}

	@Override
	public void onTestFailure(ITestResult result) {
		System.out.println(result.getName()+"Test case is fail");
		
		
		LocalDateTime SystemTime=LocalDateTime.now();
		System.out.println(SystemTime);
		String scrnShtName=SystemTime.toString().replace(":","-");
		
		TakeScreenshot tks = (TakeScreenshot) DemoWebShop.driver;
		File src=  tks.getScreenshotAs(OutputType.FILE);
		File dest = new File("./errorShots/" + scrnShtName + ".png");
		try {
		//	Files.copy(src, dest);
			FileHandler.copy(src, dest);
		}catch(IOException e) {
			e.printStackTrace();
		}
		
	}

}
