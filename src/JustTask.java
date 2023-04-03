import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JustTask {

	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.selenium.dev/selenium/docs/api/java/index.html?overview-summary.html");
		driver.switchTo().frame(driver.findElement(By.tagName("iframe")));
		driver.findElement(By.xpath("//a[@href='org/openqa/selenium/package-frame.html']")).click();
		
		driver.switchTo().parentFrame();
		
		driver.switchTo().frame(1);
		driver.findElement(By.xpath("//span[@class='interfaceName']")).click();
		
		
		//driver.switchTo().frame("packageFrame");
		// TODO Auto-generated method stub

	}

}
