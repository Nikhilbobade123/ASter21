package com.reresonance.stepdefinations;

import org.junit.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Parametrization {
	
	 int x,y, r=0;

	@Given("I have {int} and {int}")
	public void m1(int x,int y) {
        this.x =x;
        this.y =y;
        
	}
@When("I add them")	
public void add() {
	r=x+y;

}
@Then("result must even")
public void ResultsEven() {
	Assert.assertTrue("Addition result is not even:"+r, r % 2 ==0 );

}
}
