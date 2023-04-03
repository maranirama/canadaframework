import java.awt.Desktop.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Monster {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.monsterindia.com/");
		WebElement mutiSelect=driver.findElement(By.xpath("//a[text()='Job search'"));
		
		Actions action =new Actions(driver);
		action.moveToElement(mutiSelect).click().build().perform();
		
		
		//action.sendKeys(Keys.PAGE_DOWN).perform();
		//action.sendKeys(Keys.PAGE_UP).perform();
		
		
		
		
		
		// TODO Auto-generated method stub

	}

}
