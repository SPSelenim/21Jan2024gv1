package P21Jan2024.e2e.Dev1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class DevPOM {

WebDriver ldriver=null;

	public DevPOM(WebDriver rdriver) {

		ldriver=rdriver;
}
	
	WebElement getdevUserName(String First) {
		WebElement devUserName1;

		devUserName1 = ldriver.findElement(By.id(First));
		return devUserName1;
	}

	WebElement getdevUserPwd(String Last) {
		WebElement devUserPwd1 = null;
try
{
		devUserPwd1 = ldriver.findElement(By.xpath(Last));
}
catch(Exception e)
{
	System.out.println(e.getMessage());
}
return devUserPwd1;
}

	
		
}