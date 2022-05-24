package com.reresonance.stepdefinations;

import static com.reresonance.keywods.UIKeywords.*;


import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeStep;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class second {
	String title = "";
/*
 *	@Before
 *	public void setUP() {
 *		openBrowser("chrome");
 *		launchUrl("https://testingshastra.com");
 *     }
 *		@After // 3
 *	public void tearDown() {
 *		closeBrowser();
 *	}
*/
	@Given("browser is launched and url is opened")
	public void setup() {
		openBrowser("chrome");
		launchUrl("https://testingshastra.com");
	}

	@When("we get title of home page")
	public void m2() {
		title = getTitle();

	}

	@Then("it must be equal to expected title") // 4
	public void m3() {
//		Assert.assertEquals("Testing Shastra | Training | Placement", title);
	}

	@Then("And title must contain bars") // 4
	public void m4() {
//		Assert.assertTrue(title.contains(""));

	}
}
