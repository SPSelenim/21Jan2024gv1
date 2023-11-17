package P21Jan2024.e2e.Dev1;

import org.testng.annotations.AfterTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Utility1.UtilityTest;

public class Dev3 extends DevBaseClass  {

	@Test(dataProvider = "myData1")
	public void f(String UserName,String Password1) {

		System.out.println("Third PROGRAM");

		DevPOM dp=new DevPOM(driver);
		try
		{
	dp.getdevUserName(myDev.getProperty("First")).sendKeys(UserName);;
			Thread.sleep(2000);
			
		dp.getdevUserPwd(myDev.getProperty("Last")).sendKeys(Password1);;
		Thread.sleep(2000);
		
		String strAcdevelopment=driver.getCurrentUrl();
		System.out.println(strAcdevelopment);
		Thread.sleep(2000);
		
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage() + " : ::::::::::::::::::::: Dev");
		}
	}

	@DataProvider (name="myData1")
	public String [][] myData1()
	{
		String [][]mydata=null;
		UtilityTest ut = new UtilityTest();
	mydata=	ut.ReadExcelData("dev.xlsx", "Sheet1");
return mydata;
		
	}

	
	@AfterTest
	public void teradown()
	{
		driver.quit();
	}
}
