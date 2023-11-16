package P21Jan2024.e2e.DevOps1;

import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class DevOps1 extends DevOpsBaseClass{
  @Test
  public void f() {
	  System.out.println("FIRST PROGRAM");
	DevOpsPOM dop=new DevOpsPOM(driver);
	try
	{
dop.getdevOpsUserName().sendKeys("myDevOps");;
		Thread.sleep(2000);
		
	dop.getdevOpsUserPwd().sendKeys("myDevopws");;
	Thread.sleep(2000);
	
	String strAcdevelopment=driver.getCurrentUrl();
	System.out.println(strAcdevelopment + " :: ::::::::::::::::::::: DevOps");
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
