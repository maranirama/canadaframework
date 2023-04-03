import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertPrompt {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","./ndrivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoqa.com/alerts");
		WebElement c= driver.findElement(By.xpath("//button[@id='promtButton']"));
				c.click();
		Alert ele =driver.switchTo().alert();
		Thread.sleep(1000);
		String s=ele.getText();
		System.out.print("Alert:"+s);
		ele.accept();
		
		
		}

}
