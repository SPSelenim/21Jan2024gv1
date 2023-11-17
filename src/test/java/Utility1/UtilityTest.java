package Utility1;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class UtilityTest {
	public static Logger logger = null;
	public File F = null;
	public File Fx = null;
	public FileInputStream FISx = null;
	public XSSFWorkbook wb = null;
	public XSSFSheet sh1 = null;
	public int row1 = 0;
	public Short col1 = 0;
	public int totalR = 0;
	public short totalC = 0;

	public String[][] myD = null;

	public UtilityTest() {
		PropertyConfigurator.configure("D:\\Satish\\03Eclipse_Workspace\\21Jan2024\\e2e\\log4j.properties");
		logger = Logger.getLogger("e2e");

	}

	public static void debug(String message) {
		try {
			logger.debug("My Debug : " + message);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	public static void info(String message) {
		try {
			logger.info("MyInfo : " + message);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}

	public void takesscreen(WebDriver driver, String aa) {
		try {
			TakesScreenshot Takescreen = (TakesScreenshot) driver;
			F = Takescreen.getScreenshotAs(OutputType.FILE);

			File F1 = new File("D:\\Satish\\03Eclipse_Workspace\\21Jan2024\\e2e\\Screenshots\\" + aa + ".png");
			FileUtils.copyFile(F, F1);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	public int getRowCount(String excelName, String sheetName) throws IOException {
		try {
			Fx = new File("./" + "\\src\\test\\java\\P21Jan2024\\e2e\\Dev1\\" + excelName);
			FISx = new FileInputStream(Fx);
			wb = new XSSFWorkbook(FISx);
			sh1 = wb.getSheet(sheetName);
			row1 = sh1.getLastRowNum();
			System.out.println(row1);
			return row1;
		}

		catch (Exception e) {
			System.out.println(e.getMessage());
		} finally {
			FISx.close();
		}
		return row1;
	}

	public Short getColCoumnt(String excelName, String sheetName) throws IOException {
		try {
			Fx = new File("./" + "\\src\\test\\java\\P21Jan2024\\e2e\\Dev1\\" + excelName);
			FISx = new FileInputStream(Fx);
			wb = new XSSFWorkbook(FISx);
			sh1 = wb.getSheet(sheetName);
			col1 = sh1.getRow(0).getLastCellNum();
			System.out.println(col1);
			return col1;
		}

		catch (Exception e) {
			System.out.println(e.getMessage());
		} finally {
			FISx.close();
		}
		return col1;
	}

	public String[][] ReadExcelData(String ExcelName, String sheetName) {
		try {
			totalR = getRowCount("dev.xlsx", "Sheet1");
			totalC = getColCoumnt("dev.xlsx", "Sheet1");
			myD = new String[totalR][totalC];

			for (int i = 0; i <totalR; i++) {
				for (int j = 0; j < totalC; j++) {
					String aa1 = sh1.getRow(i).getCell(j).getStringCellValue();
					System.out.println(aa1);
					myD[i][j] = aa1;
				}
			}

		}

		catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return myD;

	}

}