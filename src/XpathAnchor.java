import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.gargoylesoftware.htmlunit.javascript.host.file.File;

public class XpathAnchor {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://demowebshop.tricentis.com/");
		// TODO Auto-generated method stub
		
		//driver.findElement(By.xpath("//a[text()='Register']")).click();
		//driver.findElement(By.xpath("//span[contains(text(),'Shopping')]")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("(//a[@href='/141-inch-laptop'])[2]/../../..//input[@class='button-2 product-box-add-to-cart-button']")).click();
		
		//driver.navigate().back();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//a[@href='/build-your-cheap-own-computer'])[2]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='add-to-cart-button-72']")).click();
		driver.findElement(By.xpath("(//a[@href='/build-your-own-computer'])[2]/../../..//input[@type='button']")).click();
		File ScreenshotFile=((TakeScreenshot)driver).getScreenshotAs((Outputtype.File));
		FileUtils.copyFile(ScreenshotFile, new File("./screenshot/screen.png"));
		

	}

}
