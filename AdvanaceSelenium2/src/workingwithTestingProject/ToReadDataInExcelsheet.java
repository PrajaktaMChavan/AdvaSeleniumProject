package workingwithTestingProject;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ToReadDataInExcelsheet {

	public static void main(String[] args) throws IOException {
//  Stetp1:create obj file
		File file=new File("./testData/Excel.xlsx");
		 
// Step2: FIS
		FileInputStream fis=new FileInputStream(file);
		
// step3:create obj for file
		XSSFWorkbook workbook=new XSSFWorkbook(fis);
		
// Step4: get the sheet name
		String sheet=workbook.getSheetName(0);
		System.out.println(sheet);
		
		String url=workbook.getSheet("sheet6").getRow(0).getCell(0).getStringCellValue();
		System.out.println(url);
		String url1=workbook.getSheet("sheet6").getRow(1).getCell(0).getStringCellValue();
		System.out.println(url1);
		String username=workbook.getSheet("sheet6").getRow(1).getCell(1).getStringCellValue();
		System.out.println(username);
		
		
		

	}

}
