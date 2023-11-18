package P21Jan2024.e2e.Dev1;


import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import Utility1.UtilityTest;

public class Dev1 extends DevBaseClass{
	public SoftAssert aa=null;
	
	@Test
  public void f() {
	  System.out.println("FIRST PROGRAM");
	  Assert.assertEquals(false, true);
	DevPOM dp=new DevPOM(driver);
 aa=new SoftAssert();
	try
	{
		UtilityTest utdev1=new UtilityTest();
	
		String ExcelPath = System.getProperty("user.dir")+"\\src\\test\\java\\P21Jan2024\\e2e\\Dev1\\devw.xlsx";
		System.out.println(ExcelPath);
		utdev1.WriteExcelData(ExcelPath, "Sheet1", "Passed", 0);
		
dp.getdevUserName(myDev.getProperty("First")).sendKeys("myDev");;
		Thread.sleep(2000);
		
	dp.getdevUserPwd(myDev.getProperty("Last")).sendKeys("myDevpws");;
	Thread.sleep(2000);
	
	String strAcdevelopment=driver.getCurrentUrl();
	System.out.println(strAcdevelopment	+ ": ::::::::::::::::::::: Dev1");
	Thread.sleep(2000);
	String expected="file:///D:/Satish/05DemoApps/Development.html";
	System.out.println("EXEUTED----------------------------------------------------");
Assert.assertEquals(strAcdevelopment, expected);
	aa.assertEquals(strAcdevelopment, expected);
	System.out.println("EXEUTED+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
	aa.assertAll();

	}
	
	catch(Exception e)
	{
		System.out.println(e.getMessage() + " : Login1");
	}
  }
  
  @AfterTest
	public void teradown()
	{
		driver.quit();
		
	}
}
