package workingWithUnitTestingtool;

import org.testng.annotations.Test;

public class WorkingWithDataProvider {
	public String[][] getData(){
		String[][] data=new String[2][5];
		data[0][0]="Prajakta";
		data[0][1]="Patil";
		data[0][2]="Prajakta@gmail.com";
		data[0][3]="Praju123";
		data[0][4]="123abc";
		
		data[1][0]="Patil";
		data[1][1]="Prajakta";
		data[1][2]="Prajakta@gmail.com";
		data[1][3]="chavan123";
		data[1][4]="123abcd";
		
		return data;
		
	}
	
	@Test(dataProvider="testData")
	public void detaDemo(String Firstname, String Lastname, String emailId, String password, String cnfimpwd) {
	System.out.println(Firstname);
	System.out.println(Lastname);
	System.out.println(emailId);
	System.out.println(password);
	System.out.println(cnfimpwd);

}
}
