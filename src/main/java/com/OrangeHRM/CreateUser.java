package com.OrangeHRM;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.Base.BasePage;

public class CreateUser extends BasePage {
		@Test
	public void addUser() throws InterruptedException {

		driver.findElement(By.xpath("//a[@class='content tasks']")).click();
		driver.findElement(By.xpath("//div[@class='title ellipsis']")).click();
		driver.findElement(By.xpath("//div[@class='item createNewCustomer']")).click();
		driver.findElement(By.xpath("(//input[@placeholder='Enter Customer Name'])[2]")).sendKeys("krishna");
		driver.findElement(By.xpath("//textarea[@placeholder='Enter Customer Description']"))
				.sendKeys("this is test description");
		driver.findElement(By.cssSelector("div.commitButtonPlaceHolder")).click();
		Thread.sleep(2000);

	}

}
