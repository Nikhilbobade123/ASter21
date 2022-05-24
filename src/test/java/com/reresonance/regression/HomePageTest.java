package com.reresonance.regression;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.resonance.pagse.HomePageThreeObject;


public class HomePageTest {
	 @Test
	 
	public void verifyTitleOfThehomePage() {
		HomePageThreeObject home =new HomePageThreeObject();
	   String title=home.getTitle();
     	Assert.assertEquals("Home Page|Testing Shastra",title,"title didnt match");
	
	}

}
