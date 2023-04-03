import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CountLink {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.amazon.com/");
		List<WebElement> l1=driver.findElements(By.tagName("a"));
		
		for(WebElement objLink: l1)
		{
			String link=objLink.getText();
			System.out.println(link);
		}
		// TODO Auto-generated method stub

	}

}
