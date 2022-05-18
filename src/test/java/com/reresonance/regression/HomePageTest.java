package com.reresonance.regression;

import org.testng.annotations.Test;

import com.resonance.pagse.HomePageThreeObject;

import junit.framework.Assert;

public class HomePageTest {
	 @Test
	 
	public void verifyTitleOfThehomePage() {
		HomePageThreeObject home =new HomePageThreeObject();
	   String title=home.getTitle();
     	Assert.assertEquals("HomePage",title,"title didnt match");
	
	}

}
