package com.reresonance.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.reresonance.keywods.UIKeywords;

public class HomePage {
	UIKeywords keywords = new UIKeywords();
	@FindBy(css = "a[ href=\"/assignments\"]")
	public WebElement assignmentsLnk;
	
	@FindBy(css = "")//"a[href=\"/assignments/confirmation-alert\"]")
	
	public WebElement coursesLnk;
	public WebElement videoLnk;
	public WebElement NotesLnk;
	public WebElement recentplacmentsLnk; //page object modul find @Find annotation method uuse
	
//	public By assignementLnk = By.cssSelector("a[ href=\"/assignments\"]"); //without @find
	
	
//	public HomePage() {
//		UIKeywords keyword =new UIKeywords();//IT is driver instance object use constructor
//		PageFactory.initElements(keyword.driver,this);
//	}

	public void clickOnAssigment() {
		assignmentsLnk.click();

	}
	public void clickOnAssigMent() {//This method not use @Find
	//	keywords.driver.findElement(assignementLnk).click();

	}

}
