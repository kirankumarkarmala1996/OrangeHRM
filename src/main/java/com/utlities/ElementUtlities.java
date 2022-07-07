package com.utlities;

import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ElementUtlities {
	WebDriver driver;
	WebDriverWait wait;
	Actions act;
	Select sel;

	public ElementUtlities() {

	}

	public ElementUtlities(WebDriver driver) {
		this.driver = driver;

	}

	public WebElement getWebelement(By locater) {
		WebElement element = driver.findElement(locater);
		return element;
	}

	public void doSendKeys(By locaters, String value) {
		getWebelement(locaters).sendKeys(value);
	}

	public void doclick(By locaters) {
		getWebelement(locaters).click();

	}

	public void doubleClick(By locaters) {
		getWebelement(locaters).clear();
	}

	public String getText(By locaters) {
		return getWebelement(locaters).getText();

	}

	public String doGetTitle() {
		return driver.getTitle();
	}

	public void doSendKeysWithAction(By locaters, String value) {
		act = new Actions(driver);
		act.sendKeys(getWebelement(locaters), value).perform();
	}

	public void doClickWithAction(By locaters) {
		act = new Actions(driver);
		act.click(getWebelement(locaters)).perform();
	}

	public void doubleClickWithAction(By locaters) {
		act = new Actions(driver);
		act.doubleClick(getWebelement(locaters)).perform();
	}

	public boolean isDisplayed(By locaters) {
		return getWebelement(locaters).isDisplayed();
	}

	public boolean isEnable(By locaters) {
		return getWebelement(locaters).isEnabled();
	}

	public boolean isSelect(By locaters) {
		return getWebelement(locaters).isSelected();
	}

	public void selectDropDownByVisibleText(By locaters, String value) {
		sel = new Select(getWebelement(locaters));
		sel.selectByVisibleText(value);

	}

	public void selectDropDownByIndex(By locaters, int num) {
		sel = new Select(getWebelement(locaters));
		sel.selectByIndex(num);
	}

	public void selectdropDownByValue(By locaters, String value) {
		sel = new Select(getWebelement(locaters));
		sel.selectByValue(value);
	}

	public void getFirstSelectOption(By locaters) {
		sel = new Select(getWebelement(locaters));
		sel.getFirstSelectedOption();

	}

	public void deSelectDropDownAll(By locaters) {
		sel = new Select(getWebelement(locaters));
		sel.deselectAll();
	}

	public List<WebElement> getAllselectOptionFromDropDown(By locaters) {
		Select seAll = new Select(getWebelement(locaters));
		return seAll.getAllSelectedOptions();
	}

	public WebElement waitForElementpresent(By locaters, int time) {
		wait = new WebDriverWait(driver, time);
		return wait.until(ExpectedConditions.presenceOfElementLocated(locaters));
	}

	public WebElement waitforelement(By locaters, int timeout) {
		wait = new WebDriverWait(driver, timeout);
		return wait.until(ExpectedConditions.visibilityOfElementLocated(locaters));
	}

	public String getAttribute(By locaters, String name) {
		return getWebelement(locaters).getAttribute(name);
	}

	public void doAlertWithActions(By locaters) {
		Alert alt = (Alert) new Actions((WebDriver) driver.switchTo().alert());
		alt.accept();

	}

	public void dragAndDropWithActions(By locaters) {
		act = new Actions(driver);
		act.clickAndHold().moveToElement(getWebelement(locaters)).release().perform();
	}

}
