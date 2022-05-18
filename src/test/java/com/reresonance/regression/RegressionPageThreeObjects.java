package com.reresonance.regression;

import java.io.FileNotFoundException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.reresonance.keywods.UIKeywords;
import com.reresonance.util.PropertiesFile;
import com.resonance.pagse.HomePageThreeObject;
import com.resonance.pagse.HomePagetwoObject;

public class RegressionPageThreeObjects {
	UIKeywords keyword =new UIKeywords();


	@Test
	public void verifyTitleOfHomePage() throws FileNotFoundException {      
        String actualTitle = UIKeywords.getTitle();
        WebElement element =null;

}
	@Test
	public void verifyConfoirmationAlertIsOpened() {
		PropertiesFile prop = new PropertiesFile();
		HomePageThreeObject home= new HomePageThreeObject();
		home.clickOnAssigments();
	

	}
}
	