package com.reresonance.config;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.reresonance.keywods.UIKeywords;
import com.reresonance.util.Enviroment;
import com.reresonance.util.OR;

public class BaseTest {
	public  Enviroment env = new Enviroment();
	public  OR repo = new OR();

	@BeforeMethod
	public void setUp() throws Exception {
		UIKeywords.openBrowser("chrome");
		UIKeywords.lonchUrl(env.getAppUrl());

	}

	@AfterMethod
	public void tearDown() throws Exception {
		UIKeywords.quitBrowser();

	}
}
