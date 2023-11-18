package P21Jan2024.e2e.Dev1;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class RetryAnalyzer implements IRetryAnalyzer {
	private int count = 0;
    private static int maxTry = 3;
    
	@Override
	public boolean retry(ITestResult result) {
	      if (count < maxTry) {                            //Check if maxtry count is reached
	            count++;    
	        	return true;                                 //Tells TestNG to re-run the test
	      }	
		return false;
	}

	
}
