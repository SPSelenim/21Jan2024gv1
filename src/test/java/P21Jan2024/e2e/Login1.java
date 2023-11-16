package P21Jan2024.e2e;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Login1 extends LoginBaseClass{
  @Test
  public void f() {
	  //Added Comments
	  System.out.println("FIRST PROGRAM");
	LoginPOM lp=new LoginPOM(driver);
	try
	{
	lp.getUserName(mylogin.getProperty("First")).sendKeys("myLogin1");;
	lp.getUserPwd(mylogin.getProperty("Last")).sendKeys("myLoginpwd1");;
	Thread.sleep(2000);
	
	lp.getDev(mylogin.getProperty("dev")).click();
	String strAcdevelopment=driver.getCurrentUrl();
	String strExpected="file:///D:/Satish/05DemoApps/Development.html";
	Assert.assertEquals(strAcdevelopment, strExpected);
	System.out.println(strAcdevelopment + ": : :::::::::::::::::::::Login1");
	System.out.println(strExpected);
	
	}
	catch(Exception e)
	{
		System.out.println(e.getMessage() + " : Login1");
	}
  }
}
