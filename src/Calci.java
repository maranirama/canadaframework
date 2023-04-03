import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Calci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("file:///C:/Users/ramas/OneDrive/Desktop/user.html");
		driver.findElement(By.xpath("/html/body/label/input[@type='text']")).sendKeys("rama");
		driver.findElement(By.xpath("/html/body/label/input[2]")).sendKeys("devi");
		
		
	}
		
	}