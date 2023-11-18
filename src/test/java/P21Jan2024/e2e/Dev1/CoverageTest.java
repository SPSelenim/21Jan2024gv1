package P21Jan2024.e2e.Dev1;

import org.testng.annotations.Test;

public class CoverageTest {
  @Test
  public void f() {
	  try
	  {
	  System.out.println("Hello");
	 // int a=1/0;
	  }
	  catch(Exception e)
	  {
		  System.out.println("NOT covered");
	  }
	  
  }
}
