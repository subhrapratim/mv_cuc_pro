package features;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import cucumber.api.DataTable;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefination {
	
	WebDriver dr;
	
	@Before
	public void test_Setup()
	{
		System.setProperty("webdriver.gecko.driver", "C:\\geckodriver-v0.10.0-win64\\geckodriver.exe");
		dr =new FirefoxDriver();
		dr.manage().timeouts().implicitlyWait(55, TimeUnit.SECONDS);	
		
	}
	
	@After
	public void test_Closure() throws InterruptedException
	{
		Thread.sleep(6000);
		dr.quit();
	}
	
	
	@Given("^I open priceline$")
	public void i_open_priceline() throws Throwable {
		
		
		dr.get("http://www.priceline.com");
	   
	}

	@Then("^I click on \"([^\"]*)\"$")
	public void i_click_on(String arg1) throws Throwable {
		System.out.println("Clicked on Flights");
		String s1=".//*[@data-ga-label='header_nav_"+arg1+"']";
		dr.findElement(By.xpath(s1)).click();
	    
	}

	@Then("^fill search criteria$")
	public void fill_search_criteria(DataTable table ) throws Throwable {
		
		List<List<String>> data=table.raw();
			
		
		dr.findElement(By.xpath(".//*[@id='AirTripTypeOW']")).click();
		dr.findElement(By.id("air-loc-from")).sendKeys(data.get(1).get(1));
		dr.findElement(By.cssSelector("input[name='ArrCity']")).sendKeys(data.get(2).get(1));
		Select AdultDropdown= new Select(dr.findElement(By.xpath(".//*[@id='adult-passengers']")));
		AdultDropdown.selectByValue(data.get(3).get(1));
		Select childDropdown= new Select(dr.findElement(By.xpath("//select[@name='numChildren']")));
		childDropdown.selectByValue(data.get(4).get(1));
	}
	    
	    
	@Then("^check if flight search page opens$")
	public void check_if_flight_search_page_opens() throws Throwable {
		System.out.println("Flights search page opens");
	    
	}

	@Then("^I open cars$")
	public void i_open_cars() throws Throwable {
		System.out.println("Clicked on Cars");
	}

	@Then("^check if car search page opens$")
	public void check_if_car_search_page_opens() throws Throwable {
		System.out.println("Cars search page opens");
	}
	
	
	@When("^I open subsite ([^\"]*)$")
	public void i_click_on_flights(String Link) throws Throwable {
		System.out.println("Clicked on "+Link);
		String s1=".//*[@data-ga-label='header_nav_"+Link+"']";
		dr.findElement(By.xpath(s1)).click();
	}

	@Then("^I close the subsite$")
	public void i_close_the_subsite() throws Throwable {
		System.out.println("Closing subsite");
	    dr.close();
	}



}