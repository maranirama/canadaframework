import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IFrame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.globalsqa.com/demo-site/frames-and-windows");
		
		driver.findElement(By.xpath("//li[@id='iFrame']")).click();
		
		driver.findElement(By.xpath("//span[@id='current_filter']"));
		
	}

}
