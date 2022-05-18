package com.reresonance.regression;

import java.io.FileNotFoundException;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.reresonance.keywods.UIKeywords;
import com.reresonance.util.Enviroment;

public class RegressionTestone {
	Enviroment env= new Enviroment();
	@Test
	public void verifyTitleOfHomePage() throws FileNotFoundException {
        UIKeywords.openBrowser("chrome");
        UIKeywords.lonchUrl(env.getAppUrl());
        
        String actualTitle = UIKeywords.getTitle();
        WebElement element =null;
	}

}
