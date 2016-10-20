package MyPackage;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;


public class Grids {

	public static void main(String[] args) {
		WebDriver dr;
		System.setProperty("webdriver.gecko.driver", "C:\\geckodriver-v0.10.0-win64\\geckodriver.exe");
		dr =new FirefoxDriver();
		
	
		
		dr.get("http://www.espncricinfo.com/india-v-new-zealand-2016-17/engine/match/1054769.html");
		WebElement table = dr.findElement(By.xpath(".//*[@id='full-scorecard']/div[2]/div"));
		List<WebElement> rownum = table.findElements(By.tagName("tr"));
		System.out.println(rownum.size());
	}

}
