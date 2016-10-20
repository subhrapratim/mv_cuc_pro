package MyPackage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class frame {


		public static void main(String[] args) throws InterruptedException {
			WebDriver dr;
			System.setProperty("webdriver.gecko.driver", "C:\\geckodriver-v0.10.0-win64\\geckodriver.exe");
			dr =new FirefoxDriver();
			dr.get("https://netbanking.hdfcbank.com/netbanking/");
			Thread.sleep(6000);
			System.out.println(dr.getTitle());
			System.out.println(dr.getPageSource());
			dr.switchTo().frame("login_page");
			dr.findElement(By.xpath("//input[@name='fldLoginUserId']")).sendKeys("20525611");
	}

}
