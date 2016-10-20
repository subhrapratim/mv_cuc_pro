package pageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LandingPage extends AbstractPage{

	public LandingPage(WebDriver dr) 
	{
		super(dr);
		
	}
	
	public FlightsPage navigateToFlightsPage(String link)
	{
		String s1=".//*[@data-ga-label='header_nav_"+link+"']";
		dr.findElement(By.xpath(s1)).click();
		return new FlightsPage(dr);
	}
	

}
