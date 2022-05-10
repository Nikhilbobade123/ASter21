package com.reresonance.keywods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.opera.OperaDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class UIKeywords {
	public static RemoteWebDriver driver = null;

	public static void openBrowser(String browserName) {
		if (browserName.equalsIgnoreCase("Chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		} else if (browserName.equalsIgnoreCase("ie")) {
			WebDriverManager.iedriver().setup();
			driver = new InternetExplorerDriver();

		} else if (browserName.equalsIgnoreCase("Firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();

		} else {
			System.err.println("Invalid browser name");

		}
	}

	public static void lonchUrl(String url) {
		driver.get(url);
		System.out.println("Url is lonch");
	}

	public static String getTitle() {
		System.out.println("Title of page: " + driver.getTitle());
		return driver.getTitle();

	}

	/**
	 * This is method can be used to enter provid text in specfic {"code webelement}
	 * 
	 * @param element     in which you want to enter text
	 * @param textToEnter this is text that you want to enter This is method
	 *                    deprecated and no loger in use. Insted you can
	 *                    enterText(String loca)
	 */

	@Deprecated
	public static void enterText(WebElement element, String textToEnter) {
		element.sendKeys(textToEnter);

	}

	public static void enterText(By by, String textToenter) {
		driver.findElement(by).sendKeys(textToenter);
	}

	public static void enterText(String locatoreValue, String textToenter) {
		driver.findElement(By.xpath(locatoreValue)).sendKeys(textToenter);

	}

	public static void quitBrowser() {
		driver.quit();
		System.out.println("Browser windows quit");

	}

	public static void click(String locator) {
	//	driver.findElement(By.cssSelector(locator)).click();
	

		String locatorType =locator.split("##")[0];
		System.out.println("Locator:"+locator);
		String locatorValue =locator.split("##")[1];
		switch (locatorType) {
		case "XPATH":
			driver.findElement(By.xpath(locatorValue)).click();
			break;
			case "CSS":
				driver.findElement(By.cssSelector(locatorValue)).click();
		break;
			case "ID":
				driver.findElement(By.id(locatorValue)).click();
				break;
		default:
			System.out.println("invalid locator type: "+locatorType);
			break;
	}

}

//	public static String gitTitle() {
//		// TODO Auto-generated method stub
//		return null;
	}


