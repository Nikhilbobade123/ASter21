package com.resonance.pagse;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.reresonance.keywods.UIKeywords;

public class HomePagetwoObject {
UIKeywords keywords =new UIKeywords();
	@FindBy(css="a[ href=\"/assignments\"]")
	public WebElement assignmentsLnk;
	@FindBy(css="")
	public WebElement coursesLnk;
	@FindBy(css="")
	public WebElement videoLnk;
	public WebElement NotesLnk;
	public WebElement recentPlacementsLnk;
	
	
	public void clickOnAssigments() {
         assignmentsLnk.click();
	}

}
