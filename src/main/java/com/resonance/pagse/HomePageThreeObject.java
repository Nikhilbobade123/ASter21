package com.resonance.pagse;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.reresonance.keywods.UIKeywords;

public class HomePageThreeObject {
	UIKeywords keywords =new UIKeywords();
	@FindBy(css="a[ href=\"/assignments\"]")
	public WebElement assignmentsLnk;
	@FindBy(css="")
	public WebElement coursesLnk;
	@FindBy(css="")
	public WebElement videoLnk;
	
	public WebElement NotesLnk;
	public WebElement recentPlacementsLnk;
	
	public HomePageThreeObject() { //using constructor
		UIKeywords keyword =new UIKeywords();
		PageFactory.initElements(keyword.driver,this);
	}
	public void clickOnAssigments() {
         assignmentsLnk.click();
	}

}
