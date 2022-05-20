package com.reresonance.regression;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.reresonance.config.BaseTest;
import com.reresonance.keywods.UIKeywords;
import com.reresonance.util.PropertiesFile;

public class RegressionTesttwo  extends BaseTest {	
	@Test
	public void verifyTitleOfHomePage() throws FileNotFoundException {      
        String actualTitle = UIKeywords.getTitle();
        WebElement element =null;
}
	@Test
	public void verifyConfoirmationAlertIsOpened() throws IOException {
		PropertiesFile prop = new PropertiesFile();
		
    	 String assignments1=prop.getValue("\\src\\main\\resources\\OR.properties","assignments");
		UIKeywords.click(assignments1);
	    String confAlert=prop.getValue("\\src\\main\\resources\\OR.properties","confirmation-alert");
		UIKeywords.click(confAlert);
	}

	}
	
