package pageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class FlightsPage extends AbstractPage {

	public FlightsPage(WebDriver dr) {
		super(dr);
		
	}
	
	//dr.findElement(By.xpath(".//*[@id='AirTripTypeOW']")).click();
	
	public FlightsPage setOrigin(String origin)
	{
		
		dr.findElement(By.id("air-loc-from")).sendKeys(origin);
		return new FlightsPage(dr);
	}

	public FlightsPage setDestination(String destination)
	{
		dr.findElement(By.id("air-loc-from")).sendKeys(destination);
		return new FlightsPage(dr);	
	}
	
	public FlightsPage setAdultPassengers(String Adults)
	{
		Select AdultDropdown= new Select(dr.findElement(By.xpath(".//*[@id='adult-passengers']")));
		AdultDropdown.selectByValue(Adults);
		return new FlightsPage(dr);
	}
	public FlightsPage setChildPassengers(String Children)
	{
		Select ChildDropdown= new Select(dr.findElement(By.xpath(".//*[@id='adult-passengers']")));
		ChildDropdown.selectByValue(Children);
		return new FlightsPage(dr);
	}
	
	
}
