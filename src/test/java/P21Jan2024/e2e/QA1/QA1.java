package P21Jan2024.e2e.QA1;

import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class QA1 extends QABaseClass{
  @Test
  public void f() {
	  System.out.println("FIRST PROGRAM");
	QAPOM qp=new QAPOM(driver);
	try
	{
qp.getQAUserName().sendKeys("myQA");;
		Thread.sleep(2000);
		
	qp.getQAUserPwd().sendKeys("myQAPwd");;
	Thread.sleep(2000);
	
	String strAcdevelopment=driver.getCurrentUrl();
	System.out.println(strAcdevelopment + " :: ::::::::::::::::::::: QA");
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
