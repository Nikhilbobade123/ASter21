package com.reresonance.regression;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.reresonance.keywods.UIKeywords;


@Test


public class RegressionTest {
	public void verifyHomeTitlepage() {
		// WebDriverManager.chromedriver().setup();
		// RemoteWebDriver driver =new ChromeDriver();
		UIKeywords.openBrowser("chrome");
		UIKeywords.launchUrl("https://testingshastra.com/");
		// driver.get("");
		// String actualTitle =driver.getTitle();
		String actualTitle = UIKeywords.getTitle();
		By by = By.xpath("");

		UIKeywords.enterText(by, "Hello");
	//	Assert.assertEquals("Home Page", actualTitle);

	}

}
