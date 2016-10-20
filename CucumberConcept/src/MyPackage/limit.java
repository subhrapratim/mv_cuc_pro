package MyPackage;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class limit {
	
	static void waitForLoad(WebDriver driver)
    {
        ExpectedCondition<Boolean> pageLoadCondition = new
            ExpectedCondition<Boolean>() {
                public Boolean apply(WebDriver driver) {
                    return ((JavascriptExecutor)driver).executeScript("return document.readyState").equals("complete");
                }
            };
        WebDriverWait wait = new WebDriverWait(driver, 30);
        wait.until(pageLoadCondition);
    }

	public static void main(String[] args) throws InterruptedException
	{
		WebDriver dr;
		System.setProperty("webdriver.gecko.driver", "C:\\geckodriver-v0.10.0-win64\\geckodriver.exe");
		dr=new FirefoxDriver();
		dr.get("https://www.ebay.com");
		dr.findElement(By.xpath(".//*[@id='gh-as-a']")).click();
		waitForLoad(dr); // Here you are calling the below method
		List<WebElement> linksize = dr.findElements(By.tagName("a"));
		System.out.println(linksize.size());
		
		
		/*
		System.out.println(dr.getTitle());
		Thread.sleep(6000);
		dr.switchTo().frame(0); 
		List<WebElement> linksize = dr.findElements(By.tagName("a"));
		System.out.println(linksize.size());
		WebElement footer=dr.findElement(By.xpath(".//*[@id='glbfooter']"));
		System.out.println(footer.findElements(By.tagName("a")).size());
		*/
		
		/*dr.manage().timeouts().pageLoadTimeout(120, TimeUnit.SECONDS);
	    WebDriverWait wait = new WebDriverWait(dr,120);
	    List<WebElement> linksize = wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.tagName("a")));//driver.findElements(By.tagName("a"));
	    System.out.println(linksize.size());*/
	    
	    
	    
	    
		
	}

}
