package org.com;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;



public class DataPro {
	static WebDriver driver;
	@Test(dataProvider="login", dataProviderClass=DataUtils.class)
	public void tc0(String email, String pass) {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("http://adactinhotelapp.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		WebElement user = driver.findElement(By.id("username"));
		user.sendKeys(email);
		String ur = user.getAttribute("value");
//		System.out.println(pass);
		WebElement pas = driver.findElement(By.id("password"));
		pas.sendKeys(pass);
//		String pa = pass.getAttribute("value");
//		System.out.println(pa);
		String title = driver.getTitle();
		System.out.println(title);

	}
	
/*	public static String datafromEcxel(int rownum, int colum) throws FileNotFoundException, IOException {
		Workbook wb = new XSSFWorkbook(new FileInputStream(new File("D:\\JavaClassProjectsEclipse\\DataProvider\\Excel\\vijay.xlsx")));
		return wb.getSheet("Sheet0").getRow(rownum).getCell(colum).getStringCellValue();

	}*/
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
