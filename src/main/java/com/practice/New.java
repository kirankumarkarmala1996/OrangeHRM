package com.practice;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class New {
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
		driver.manage().timeouts().pageLoadTimeout(25, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
		
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.xpath("//div[text()='Login '] ")).click();
		
		 driver.findElement(By.xpath("//a[@class='content tasks']")).click();
		 driver.findElement(By.xpath("//div[@class='title ellipsis']")).click();
		 driver.findElement(By.xpath("//div[@class='item createNewCustomer']")).click();
		 driver.findElement(By.xpath("(//input[@placeholder='Enter Customer Name'])[2]")).sendKeys("anuu");
		 driver.findElement(By.xpath("//textarea[@placeholder='Enter Customer Description']")).sendKeys("this is test description");
		 driver.findElement(By.cssSelector("div.commitButtonPlaceHolder")).click();
		 Thread.sleep(3000);
		 driver.findElement(By.id("logoutLink")).click();
	}

}
