package MyPackage;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;


public class mulWin {

	public static void main(String[] args) throws InterruptedException {
		WebDriver dr;
		System.setProperty("webdriver.gecko.driver", "C:\\geckodriver-v0.10.0-win64\\geckodriver.exe");
		dr =new FirefoxDriver();
		dr.get("https://www.hdfcbank.com");
		dr.manage().window().maximize();
		Thread.sleep(12000);
		dr.findElement(By.xpath(".//*[@id='cee_closeBtn']/img"));
		Thread.sleep(6000);
		dr.manage().window().maximize();
		/*Actions act=new Actions();
		act.moveToElement(toElement)*/
		dr.findElement(By.xpath(".//*[@id='loginsubmit']")).sendKeys(Keys.ENTER);
		System.out.println(dr.findElement(By.xpath(".//*[@id='loginsubmit']")).getText());
		Thread.sleep(6000);
		String Parent_Window = dr.getWindowHandle();
		for (String Current_Window : dr.getWindowHandles())  
	     	     dr.switchTo().window(Current_Window); 
	           
	     String Child_Window=dr.getWindowHandle(); 
		 dr.manage().window().maximize();
	     dr.findElement(By.xpath(".//*[@id='wrapper']/div[6]/a/img")).click(); 
		 dr.switchTo().window(Parent_Window); 
		 dr.close();
		 dr.switchTo().window(Child_Window); 
		 System.out.println(dr.getPageSource());
		 dr.switchTo().frame("login_page");
		 dr.findElement(By.xpath("//input[@name='fldLoginUserId' and @class='input_password']")).sendKeys("20525611");
	}
	}
	
	 
	      

