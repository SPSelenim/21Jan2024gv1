package P21Jan2024.e2e;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;

public class LoginBaseClass {
//This is a base class
	public static ExtentTest test;
	public static ExtentReports report;
	
	public WebDriver driver = null;
	public String myApplication = null;

	public File F = null;
	public FileInputStream fis = null;
	public Properties mylogin = null;


	
		@BeforeClass
	public void setUp() {

		//	report = new ExtentReports(System.getProperty("user.dir")+"\\Logs\\ExtentReportResults.html");
			//test = report.startTest("ExtentDemo");
			
			System.setProperty("webdriver.gecko.driver", "D:\\Satish\\05DemoApps\\ChromeDriver\\geckodriver.exe");

		driver = new FirefoxDriver();
		myApplication = "file:///D:/Satish/05DemoApps/demo.html";
		driver.get(myApplication);

		try {
			System.out.println(System.getProperty("user.dir"));
F = new File(System.getProperty("user.dir")+"\\src\\test\\java\\P21Jan2024\\e2e\\Login.properties");
fis = new FileInputStream(F);
mylogin = new Properties();
mylogin.load(fis);



		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	@AfterClass
	public void tearDown() {
		
		//report.endTest(test);
		//report.flush();
		driver.quit();

	}

	
}
