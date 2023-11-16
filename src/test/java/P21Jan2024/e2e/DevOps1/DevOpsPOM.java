package P21Jan2024.e2e.DevOps1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class DevOpsPOM {

	WebDriver ldriver = null;

	public DevOpsPOM(WebDriver rdriver) {

		ldriver = rdriver;
	}

	WebElement getdevOpsUserName() {
		WebElement devOpsUserName1;

		devOpsUserName1 = ldriver.findElement(By.id("Dofname"));
		return devOpsUserName1;
	}

	WebElement getdevOpsUserPwd() {
		WebElement devOpsUserpwd1 = null;
		try {
			devOpsUserpwd1 = ldriver.findElement(By.xpath("//input[@id='Dolname']"));
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return devOpsUserpwd1;
	}

}