package P21Jan2024.e2e;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPOM {

WebDriver ldriver=null;

	public LoginPOM(WebDriver rdriver) {

		ldriver=rdriver;
}
	
	WebElement getUserName(String First) {
		WebElement UserName1;

		UserName1 = ldriver.findElement(By.id(First));
		return UserName1;
	}

	WebElement getUserPwd(String Last) {
		WebElement UserPwd1;

		UserPwd1 = ldriver.findElement(By.id(Last));
		return UserPwd1;
	}

	WebElement getDev(String Devl2) {
WebElement dev1;
		dev1 = ldriver.findElement(By.xpath(Devl2));
		return dev1;
	}

		
}