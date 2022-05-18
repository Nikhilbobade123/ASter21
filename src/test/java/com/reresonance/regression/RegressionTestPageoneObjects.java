package com.reresonance.regression;

import java.io.FileNotFoundException;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.reresonance.config.BaseTest;
import com.reresonance.keywods.UIKeywords;
import com.reresonance.util.PropertiesFile;
import com.resonance.pagse.HomePageoneObject;


public class RegressionTestPageoneObjects extends BaseTest {
	@Test
	public void verifyTitleOfHomePage() throws FileNotFoundException {      
        String actualTitle = UIKeywords.getTitle();
        WebElement element =null;

}
	@Test
	public void verifyConfoirmationAlertIsOpened() {
		PropertiesFile prop = new PropertiesFile();
		HomePageoneObject home=new HomePageoneObject();
		home.clickOnAssigments();
		
	}
}
