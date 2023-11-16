package P21Jan2024.e2e.Dev1;

import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class Dev2 extends DevBaseClass{
 
	@Test
  public void f() {
	  System.out.println("Second PROGRAM");
	DevPOM dp=new DevPOM(driver);
	try
	{
dp.getdevUserName(myDev.getProperty("First")).sendKeys("mySecondDev");;
		Thread.sleep(2000);
		
	dp.getdevUserPwd(myDev.getProperty("Last")).sendKeys("mySecondDevpws");;
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
	
	@AfterTest
	public void teradown()
	{
		driver.quit();
	}
}
