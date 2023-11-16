package P21Jan2024.e2e.DevOps1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class DevOpsBaseClass {
	public WebDriver driver = null;
	public String myApplication = null;

	@BeforeClass
	public void setUp() {
		try
		{
		System.setProperty("webdriver.gecko.driver", "D:\\Satish\\05DemoApps\\ChromeDriver\\geckodriver.exe");

		driver = new FirefoxDriver();
		myApplication = "file:///D:/Satish/05DemoApps/demo.html";
		driver.get(myApplication);
driver.findElement(By.partialLinkText("DevOps")).click();
	Thread.sleep(2000);
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
		}


	@AfterClass
	public void tearDown() {
		driver.quit();
		
	}

}
