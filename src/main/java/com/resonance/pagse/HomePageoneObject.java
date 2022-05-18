package com.resonance.pagse;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.reresonance.keywods.UIKeywords;

public class HomePageoneObject {
	UIKeywords keywords =new UIKeywords();
	
	public WebElement assignmentsLnk=keywords.driver.findElement(By.cssSelector("a[ href=\"/assignments\"]"));
	public WebElement coursesLnk;
	public WebElement sideossLnk;
	public WebElement NotesLnk;
	public WebElement recentPlacementsLnk;
	
	
	public void clickOnAssigments() {
         assignmentsLnk.click();
	}
}
