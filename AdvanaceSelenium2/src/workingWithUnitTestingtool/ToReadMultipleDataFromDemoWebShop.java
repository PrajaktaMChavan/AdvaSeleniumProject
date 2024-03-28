package workingWithUnitTestingtool;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ToReadMultipleDataFromDemoWebShop {
	@DataProvider(name="registerdata")
	public String[][] registerData() throws EncryptedDocumentException, IOException {
//step1
		File file = new File("./testData/Excel.xlsx");
//step2
		FileInputStream fis=new FileInputStream(file);
//step3
		Workbook workBook= WorkbookFactory.create(fis);
//step4
		int numOfRows=workBook.getSheet("Sheet7").getPhysicalNumberOfRows();
//step5
		int numOfclm= workBook.getSheet("Sheet7").getRow(0).getPhysicalNumberOfCells();
		System.out.println(numOfRows);
		System.out.println(numOfclm);
		
		
		String[][]data=new String[numOfRows][numOfclm];
		for(int i=0; i< numOfRows; i++) {
			for(int j=0; j< numOfclm; j++) {
				data[i][j]= workBook.getSheet("Sheet7").getRow(i).getCell(j).toString();
				
			}
		}
		return data;
		
	}
	@Test(dataProvider ="registerdata")
	public void registerUser(String[] datareg) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		driver.findElement(By.linkText("Register")).click();
		
		
		if(datareg[0].equalsIgnoreCase("male")) {
			driver.findElement(By.id("gender-male")).click();
			
			}
	}

}
