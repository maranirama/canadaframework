import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


import com.gargoylesoftware.htmlunit.javascript.host.Set;

public class GetWindowHandle1 {

	public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(2000);
		
		//String parentWindow	=driver.getWindowHandle();
		driver.findElement(By.xpath("//a[text()='Facebook']")).click();

		java.util.Set<String> childbrowser=driver.getWindowHandles();


			for(String window :childbrowser) 
			{
				driver.switchTo().window(window);
				if(driver.getTitle().contains("Facebook"))
				{
					Thread.sleep(2000);
					driver.close();
				}
				}

	
	
}}
