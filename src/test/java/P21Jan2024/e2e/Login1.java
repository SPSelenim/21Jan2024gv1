package P21Jan2024.e2e;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

import Utility1.UtilityTest;

public class Login1 extends LoginBaseClass{
  @Test
  public void f() {
	  //Added Comments
	  System.out.println("FIRST PROGRAM ---- Hello Test + Added into giit thriugh ec + Date11");
	  UtilityTest ut=new UtilityTest();
	  ut.debug("Debug : Hello from Outside Pkg");
ut.info("Info: Helllo from Outside Pkg" );
	  LoginPOM lp=new LoginPOM(driver);
	try
	{
	lp.getUserName(mylogin.getProperty("First")).sendKeys("myLogin1");;
	lp.getUserPwd(mylogin.getProperty("Last")).sendKeys("myLoginpwd1");;
	Thread.sleep(2000);
	//test.log(LogStatus.PASS, "Extended Reports Finally here : ");
	lp.getDev(mylogin.getProperty("dev")).click();
	String strAcdevelopment=driver.getCurrentUrl();
	String strExpected="file:///D:/Satish/05DemoApps/Development.html";
	Assert.assertEquals(strAcdevelopment, strExpected);
	System.out.println(strAcdevelopment + ": : :::::::::::::::::::::Login1");
	System.out.println(strExpected);
//test.log(LogStatus.FAIL,"Test Dailed");;
	ut.takesscreen(driver,"Login2");
	ut.debug("Inside---------------- " + "Took Screen shot");
	}
	catch(Exception e)
	{
		System.out.println(e.getMessage() + " : Login1");
	}
  }
}
