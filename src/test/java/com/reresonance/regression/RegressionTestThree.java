package com.reresonance.regression;

import java.io.FileNotFoundException;

import org.checkerframework.common.util.report.qual.ReportCall;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.reresonance.config.BaseTest;
import com.reresonance.keywods.UIKeywords;
import com.reresonance.util.PropertiesFile;

public class RegressionTestThree extends BaseTest{
	@Test
	public void verifyTitleOfHomePage() throws FileNotFoundException {      
        String actualTitle = UIKeywords.getTitle();
        WebElement element =null;

}
	@Test
	public void verifyConfoirmationAlertIsOpened() {
		PropertiesFile prop = new PropertiesFile();
		UIKeywords.click(repo.assignmentsLocator());	
		UIKeywords.click(repo.confirmationAlertLocator());
		System.out.println(repo.assignmentsLocator()+"Hello");
	}

}
