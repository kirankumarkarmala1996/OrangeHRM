package com.Base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import io.github.bonigarcia.wdm.WebDriverManager;

public class BasePage {
	public  static WebDriver driver;
	public  static Properties prop;
	

	@BeforeClass
	public WebDriver initBrowser(String  browser){
		if(browser.equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver= new ChromeDriver();
		}else if(browser.equalsIgnoreCase("Firefox")) {
				WebDriverManager.firefoxdriver().setup();
				driver= new FirefoxDriver();
		}else if(browser.equalsIgnoreCase("edgebrowser")) {
			WebDriverManager.edgedriver().setup();
			driver= new EdgeDriver();
		}else {
			System.out.println("please pass the correct browser");
		}
		
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(25, TimeUnit.SECONDS);
		return driver;
	}

	@BeforeMethod
	public Properties initProperties() {
		String path="G:\\testing\\OrangeHRM2\\src\\main\\java\\configProperties";
		 prop = new Properties();
		try {
			FileInputStream  file = new FileInputStream(path);
			prop.load(file);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}catch (IOException e) {
			e.printStackTrace();
		}
		return prop;
	}

	@AfterMethod
	public void logoutHRM() {
		 driver.findElement(By.id("logoutLink")).click();
	}

	@AfterClass
	public void closeBrowser() {
		driver.close();
	}

}
