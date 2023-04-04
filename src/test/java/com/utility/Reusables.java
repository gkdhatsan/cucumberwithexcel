package com.utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Reusables {
	public static WebDriver driver;

	public static void getDriver() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
	}

	public String getDataFromExcel( String sheetName, int rowNumber, int cellNumber) throws IOException {

		String res = null;
		File file = new File("C:\\Users\\User\\eclipse-workspace\\CucumberWithExcel\\Ganesh.xlsx");
		FileInputStream inputStream = new FileInputStream(file);
		Workbook book = new XSSFWorkbook(inputStream);
		Sheet sheet = book.getSheet(sheetName);
		Row row = sheet.getRow(rowNumber);
		Cell cell = row.getCell(cellNumber);
		CellType cellType = cell.getCellType();
		switch (cellType) {
		case STRING:
			res = cell.getStringCellValue();

			break;
		case NUMERIC:
			if (DateUtil.isCellDateFormatted(cell)) {
				Date dateCellValue = cell.getDateCellValue();
				SimpleDateFormat sdf = new SimpleDateFormat("dd/mm/yyyy");
				res = sdf.format(dateCellValue);

			} else {
				double numericCellValue = cell.getNumericCellValue();
				long l = (long) numericCellValue;
				Long val = Long.valueOf(l);
				res = val.toString();

			}
			break;
		default:
			break;
		}
		return res;
	}

	public static void getUrl(String url) {

		driver.get(url);
	}

	public WebElement findElementById(String idText) {
		WebElement element = driver.findElement(By.id(idText));
		return element;
	}

}
