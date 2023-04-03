import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.gargoylesoftware.htmlunit.javascript.host.file.File;

public class LocateElement {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demowebshop.tricentis.com/login");
		//driver.findElement(By.cssSelector("Input#Email")).sendKeys("rama@gmail.com");
		//driver.findElement(By.cssSelector("Input#Password")).sendKeys("rama123");
		
		
		//driver.findElement(By.id("Email")).sendKeys("ramasreemd@gmail.com");
		
		driver.findElement(By.cssSelector("Input.search-box-text")).sendKeys("mobile");
	//	driver.findElement(By.cssSelector("Input#")).click();
		File ScreenshotFile =((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(ScreenshotFile, new File("./screenshot/screen.png"));
		//JavascriptExecutor js =(JavascriptExecutor)driver;
		//js.executeScript("window.scrollBy(0,700)");
		
			}
	}

