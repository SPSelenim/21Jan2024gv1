package P21Jan2024.e2e.QA1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class QAPOM {

	WebDriver ldriver = null;

	public QAPOM(WebDriver rdriver) {

		ldriver = rdriver;
	}

	WebElement getQAUserName() {
		WebElement QAUserName1;

		QAUserName1 = ldriver.findElement(By.id("QAfname"));
		return QAUserName1;
	}

	WebElement getQAUserPwd() {
		WebElement QAUserpwd1 = null;
		try {
			QAUserpwd1 = ldriver.findElement(By.xpath("//input[@id='QAlname']"));
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return QAUserpwd1;
	}

}