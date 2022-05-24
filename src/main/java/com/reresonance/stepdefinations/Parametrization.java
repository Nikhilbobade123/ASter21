package com.reresonance.stepdefinations;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.testng.Assert;

import com.google.common.collect.Multiset.Entry;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Parametrization {

	int x, y, r = 0;
	String fruitName;

	@Given("I have {int} and {int}")
	public void m1(int x, int y) {
		this.x = x;
		this.y = y;

	}

	@When("I add them")
	public void add() {
		r = x + y;

	}

	@Then("result must even")
	public void ResultsEven() {
	//	Assert.assertTrue("Addition result is not even:" + r, r % 2 == 0);

	}

	@Given("I have {word} fruit")
	public void m2(String fruitName) {
		this.fruitName = fruitName;
		System.out.println("Fruit is: " + fruitName);
	}

	@Then("display its color")
	public void m3() {
		if (fruitName.equalsIgnoreCase("orange")) {
			System.out.println("Orange in color");
		} else if (fruitName.equalsIgnoreCase("apple")) {
			System.out.println("red in colar");
		} else
			System.out.println("Invalid fruit name:" + fruitName);

	}
    @Given("I have {string} space") 
	public void m4(String sentence) {
    	System.out.println("Sentence:"+sentence);

//	}
  //  @Given("I have following rto codes and city names:")
  //  public void rtocodeAndCityName(DataTable dt) {
  //  	Map hm= dt.asMap();
  //  	Set<Map.Entry> enteries =hm.entrySet();
  //  	for (Map.Entry entry : enteries) {
 //   		System.out.println(entry.getKey()+"\t"+entry.getValue());
			
//		}
    

//	}
  //  @Given("I have following capital city names:")
//    public void capatipList(DataTable capitals) {
  //  	 List<String> is=capitals.asList();
 //   	System.out.println("capital of diffrnt states: ");
 //   	for (String capital1 : is) {
 //   		System.out.println(capitals);
			
		}
    	
    	

	}
//}
