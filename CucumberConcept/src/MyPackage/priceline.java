package MyPackage;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;


public class priceline {
	
	

	public static void main(String args[]) throws InterruptedException
	{
		WebDriver dr;
		System.setProperty("webdriver.gecko.driver", "C:\\geckodriver-v0.10.0-win64\\geckodriver.exe");
		dr =new FirefoxDriver();
		dr.manage().timeouts().implicitlyWait(55, TimeUnit.SECONDS);
		dr.get("http://www.priceline.com");
		Thread.sleep(12000);
		//dr.findElement(By.xpath(".//*[@id='global-header-nav-section']/ul/li[3]/a")).click();
		
		dr.findElement(By.xpath(".//*[@data-ga-label='header_nav_flights']")).click();
				
		
		/*List<WebElement> rad1=dr.findElements(By.xpath("//input[@type='radio' and @name='TripType']"));
		System.out.println(rad1.size());
		rad1.get(1).click();*/
		
		
		dr.findElement(By.xpath(".//*[@id='AirTripTypeOW']")).click();
		dr.findElement(By.id("air-loc-from")).sendKeys("msp");
		dr.findElement(By.cssSelector("input[name='ArrCity']")).sendKeys("ccu");
		Select AdultDropdown= new Select(dr.findElement(By.xpath(".//*[@id='adult-passengers']")));
		AdultDropdown.selectByValue("3");
		Select childDropdown= new Select(dr.findElement(By.xpath("//select[@name='numChildren']")));
		childDropdown.selectByValue("2");
		//dr.findElement(By.xpath("//input[@name='flights-option' and @type='checkbox']")).click();
		
		/*
		 
		 int m=0;
		dr.findElement(By.id("departure-from")).click();
				
		
		while(m==0)
		{
			String TravelMonth1=dr.findElement(By.xpath(".//*[@id='ui-datepicker-div']/div[1]/div/div/span[1]")).getText();
			String TravelMonth2=dr.findElement(By.xpath(".//*[@id='ui-datepicker-div']/div[2]/div/div/span[1]")).getText();
				
			if(TravelMonth1.equals("December"))
				m=1;
			else if(TravelMonth2.equals("December"))
				m=2;
			else
				dr.findElement(By.xpath(".//*[@id='ui-datepicker-div']/div[2]/div/a/span")).click();
										
		}
						
		for(int i=1;i<7;i++)
			for(int j=1;j<8;j++)
			{
				String x1=".//*[@id='ui-datepicker-div']/div[2]/table/tbody/tr["+i+"]/td["+j+"]";
				if(dr.findElement(By.xpath(x1)).getText().equals("7"))
					dr.findElement(By.xpath(x1)).click();
			}
				
			

		
		
	
	
	dr.findElement(By.id("return-date")).click();
	m=0;
	while(m==0)
	{
		String TravelMonth1=dr.findElement(By.xpath(".//*[@id='ui-datepicker-div']/div[1]/div/div/span[1]")).getText();
		String TravelMonth2=dr.findElement(By.xpath(".//*[@id='ui-datepicker-div']/div[2]/div/div/span[1]")).getText();
			
		if(TravelMonth1.equals("December"))
			m=1;
		else if(TravelMonth2.equals("December"))
			m=2;
		else
			dr.findElement(By.xpath(".//*[@id='ui-datepicker-div']/div[2]/div/a/span")).click();
									
	}
					
	for(int i=1;i<7;i++)
		for(int j=1;j<8;j++)
		{
			String x1=".//*[@id='ui-datepicker-div']/div[2]/table/tbody/tr["+i+"]/td["+j+"]";
			if(dr.findElement(By.xpath(x1)).getText().equals("21"))
				dr.findElement(By.xpath(x1)).click();
		}
	

	
	dr.findElement(By.id("air-submit-btn")).click();  */
	
	}
}
