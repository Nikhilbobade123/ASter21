package com.reresonance.regression;

import java.io.FileNotFoundException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.reresonance.config.BaseTest;
import com.reresonance.keywods.UIKeywords;
import com.reresonance.util.PropertiesFile;
import com.resonance.pagse.HomePagetwoObject;

public class RegressionPagetwoObjects extends BaseTest   {
	UIKeywords keywords=new UIKeywords();

	@Test
	public void verifyTitleOfHomePage() throws FileNotFoundException {      
        String actualTitle = UIKeywords.getTitle();
        WebElement element =null;

}
	@Test
	public void verifyConfoirmationAlertIsOpened() {
		PropertiesFile prop = new PropertiesFile();
		HomePagetwoObject home=PageFactory.initElements(keywords.driver,HomePagetwoObject.class);
		home.clickOnAssigments();
	

	}
}
