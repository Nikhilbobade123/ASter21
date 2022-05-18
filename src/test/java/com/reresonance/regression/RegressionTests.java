package com.reresonance.regression;

import java.io.FileNotFoundException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.reresonance.config.BaseTest;
import com.reresonance.keywods.UIKeywords;
//import com.reresonance.pages.HomePage;
import com.reresonance.util.PropertiesFile;

public class RegressionTests extends BaseTest {
//	Enviroment env = new Enviroment();
	UIKeywords keyword = new UIKeywords();

	@Test
	public void verifyTitlOfHomepage() throws FileNotFoundException {

	//	UIKeywords.openBrowser("chrome");
	//	UIKeywords.lonchUrl("https://www.testingshastra.com");
	//	UIKeywords.lonchUrl(env.getAppUrl());
 
		String actualTitle = UIKeywords.getTitle();
		WebElement element = null;
	}

    @Test
	public void verifyConformationAlertISOpened() {
		PropertiesFile prop = new PropertiesFile();
		
	//	HomePage home = new HomePage();
		
//		HomePage home = PageFactory.initElements(keyword.driver, HomePage.class);// Page object modul
//		home.clickOnAssigment();
		
	//	UIKeywords.click(repo.confirmationAlertLocator()); 
    //     HomePage home =new HomePage(); 
		
//		String assignments = prop.getValue("src/main/resources/OR.properties","assignments");
//		UIKeywords.click(assignments);
//		UIKeywords.click(repo.getassignmentsLocator());//keyword locator
		
	//	String confAlert = prop.getValue("src/main/resources/OR.properties", "confirmation-alert");
	//	UIKeywords.click(confAlert);
	//	UIKeywords.click(repo.confirmationAlertLocator());//keyword locator
	//	UIKeywords.click(repo.confirmationAlertLocator());
		
}
}


/*
 * }
 * 
 * @Test public void verifyConformationAlertISOpened() { PropertiesFile prop
 * =new PropertiesFile(); //HomePage home =new HomePage(); // HomePage home
 * =PageFactory.initElements(, home);
 * 
 * // home.clickOnAssigment(); UIKeywords.click(); } }
 */