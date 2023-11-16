package P21Jan2024.e2e.Dev1;


import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class Dev1 extends DevBaseClass{
  @Test
  public void f() {
	  System.out.println("FIRST PROGRAM");
	DevPOM dp=new DevPOM(driver);
	try
	{
dp.getdevUserName(myDev.getProperty("First")).sendKeys("myDev");;
		Thread.sleep(2000);
		
	dp.getdevUserPwd(myDev.getProperty("Last")).sendKeys("myDevpws");;
	Thread.sleep(2000);
	
	String strAcdevelopment=driver.getCurrentUrl();
	System.out.println(strAcdevelopment	+ ": ::::::::::::::::::::: Dev1");
	Thread.sleep(2000);
	
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
