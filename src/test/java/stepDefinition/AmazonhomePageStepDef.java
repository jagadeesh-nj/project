package stepDefinition;

import java.io.IOException;

import org.openqa.selenium.WebDriver;

import basePageinit.BasePage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;
import pageObjects.AmazonHomePageObjects;

public class AmazonhomePageStepDef extends BasePage { 
	
	AmazonHomePageObjects ahpo = new AmazonHomePageObjects(driver);
	
	@Given("user is on amazon login Page")
	public void user_is_on_amazon_login_page() throws IOException {
		InitializeDriver();
		System.out.println("user is on Amazon HomePage");
		
	}

	@When("user clicks on Signin button")
	public void user_clicks_on_signin_button() {
		ahpo = new AmazonHomePageObjects(driver);
	    ahpo.clickOnSignin().click();
	    
	}

	@When("User enters the {string} and {string}")
	public void user_enters_the_and(String usernam, String passwor) {
	   ahpo.enterUserName(usernam);
	   ahpo.clickOnctnbtn().click();
	   ahpo.enterpassword(passwor);
	   System.out.println("User Succesfully Enters the valid Credentials");
	}

	@When("User cliks on Enter button")
	public void user_cliks_on_enter_button() {
		ahpo.clickOnLogin().click();
	 
	}

	@Then("User validates the Amazon HomePage")
	public void user_validates_the_amazon_home_page() {
		String Title = driver.getTitle();
		Assert.assertEquals("Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in" , Title);
	    
	}
	
	
	@When("user enters the {string} in search feild")
	public void user_enters_the_in_search_feild(String searchitem) {
		ahpo.enterSearchcriteria(searchitem);
	   
	}

	@When("User click the respective item")
	public void user_click_the_search_button() {
		ahpo.clickOnsearch().click();
	   
	}
	
	@When("User selects the item")
	public void user_selects_the_item() {
		ahpo.clickOnitem().click();
	  
	}

	@When("User place the order")
	public void user_place_the_order() {
		ahpo.clickOnbuy().click();
	  
	}
	
	

}
