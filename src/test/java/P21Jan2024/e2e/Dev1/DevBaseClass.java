package P21Jan2024.e2e.Dev1;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class DevBaseClass {
	public WebDriver driver = null;
	public String myApplication = null;
	public File F = null;
	public FileInputStream fis = null;
	public Properties myDev = null;

	@BeforeClass
	public void setUp() {
		try
		{
		System.setProperty("webdriver.gecko.driver", "D:\\Satish\\05DemoApps\\ChromeDriver\\geckodriver.exe");

		driver = new FirefoxDriver();
		myApplication = "file:///D:/Satish/05DemoApps/demo.html";
		driver.get(myApplication);
driver.findElement(By.partialLinkText("Development")).click();
	Thread.sleep(2000);
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
		
		try {
			System.out.println(System.getProperty("user.dir"));
F = new File(System.getProperty("user.dir")+"\\src\\test\\java\\P21Jan2024\\e2e\\Dev1\\Dev1.properties");
fis = new FileInputStream(F);
myDev = new Properties();
myDev.load(fis);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

		}


	@AfterClass
	public void tearDown() {
		driver.quit();
		
	}

}
