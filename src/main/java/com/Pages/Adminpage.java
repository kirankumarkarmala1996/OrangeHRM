package com.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.Base.BasePage;
import com.utlities.ElementUtlities;

public class Adminpage extends BasePage {

	private WebDriver driver;
	private ElementUtlities utlies;

	public Adminpage(WebDriver driver) {
		this.driver = driver;
		utlies = new ElementUtlities(driver);

	}

	private By Admin = By.xpath("//b[text()='Admin']");
	private By username = By.name("//input[@name='searchSystemUser[userName]']");
	private By employeename = By.cssSelector("input[id=searchSystemUser_employeeName_empName]");
	private By Searchbutton = By.cssSelector("input[id=searchBtn]");
	private By ResetButton = By.cssSelector("input[id=resetBtn]");
	private By AddButton = By.cssSelector("input[id=btnAdd]");
	private By DeleteButton = By.cssSelector("input[id=btnDelete]");
	private By ToselectAllcheckBoxes = By.cssSelector("input#ohrmList_chkSelectAll");


	public String getTitle() {
		 return utlies.doGetTitle();
	}
	public boolean verifyAdmin() {
		 return utlies.isDisplayed(Admin);
		 
	}
	public boolean  verifyUserName() {
		 return utlies.isDisplayed(username);
		 
	}
	
	public boolean verifyEmployeeName() {
		 return utlies.isDisplayed(employeename);	
	}
	
	public void doClickOnAddButton() {
		utlies.doclick(AddButton);
	}
	public void doclickOnDeleteButton() {
		utlies.doclick(DeleteButton);
	}
	public void doClickWithaction() {
		
	}
	

	
	
}
