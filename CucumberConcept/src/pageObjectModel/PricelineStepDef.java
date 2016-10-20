package pageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class PricelineStepDef {
	LandingPage lp;
	WebDriver dr;
	FlightsPage fp;
	
	
	
	@Given("^I open priceline$")
	public void i_open_priceline() throws Throwable 
	{
		System.setProperty("webdriver.gecko.driver", "C:\\geckodriver-v0.10.0-win64\\geckodriver.exe");
		dr=new FirefoxDriver();
	    lp=new LandingPage(dr);
	    lp.navigateToMainSite();
	    
	}
	
	@When("^I click on \"([^\"]*)\"$")
	public void i_click_on(String link) throws Throwable {
	   lp.navigateToFlightsPage(link);
	}
	
	
	@Then("^I enter \"([^\"]*)\" on Origin field$")
	public void i_enter_on_Origin_field(String origin) throws Throwable {
		fp.setOrigin(origin);
	   
	}

	@Then("^I enter \"([^\"]*)\" on Destination field$")
	public void i_enter_on_Destination_field(String destination) throws Throwable {
		
	  fp.setDestination(destination);
	}

	@Then("^I Enter \"([^\"]*)\" Adult Passenger Count field$")
	public void i_Enter_Adult_Passenger_Count_field(String Adults) throws Throwable 
	{
	 fp.setAdultPassengers(Adults);
	}

	@Then("^I Enter \"([^\"]*)\" Child Passenger Count field$")
	public void i_Enter_Child_Passenger_Count_field(String Children) throws Throwable 
	{
		
		fp.setChildPassengers(Children);
		
		
	}

	@Then("^I fill flights search data$")
	public void i_fill_flights_search_data() throws Throwable {
		fp.setOrigin("msp").setDestination("ccu").setAdultPassengers("3").setChildPassengers("4");
	    
	}

}
