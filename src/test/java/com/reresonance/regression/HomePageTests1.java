package com.reresonance.regression;


import org.testng.Assert;
import org.testng.annotations.Test;

import com.resonance.pagse.HomePageThreeObject;

public class HomePageTests {
	
	@Test
	public void verifyTitleOfTheHomePage() {
		HomePageThreeObject home = new HomePageThreeObject();
		String title=home.getTitle();
		Assert.assertEquals("Home Page", title);
		

	}
}
