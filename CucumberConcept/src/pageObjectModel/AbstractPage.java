package pageObjectModel;

import org.openqa.selenium.WebDriver;

public class AbstractPage {
	
	protected WebDriver dr;
	
	public AbstractPage(WebDriver dr)
	{
		this.dr=dr;
	}

	public LandingPage navigateToMainSite()
	{
		dr.navigate().to("http://www.priceline.com");
		return new LandingPage(dr);
	}
}
