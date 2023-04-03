import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FaceBook {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		driver.findElement(By.partialLinkText("Create")).click();
		
		Thread.sleep(5000);
		
		
	driver.findElement(By.xpath("(//input[@type='text'])[2]")).sendKeys("rama");
	driver.findElement(By.xpath("(//input[@type='text'])[3]")).sendKeys("devi");
	driver.findElement(By.xpath("(//input[@type='text'])[4]")).sendKeys("6147076086");
	driver.findElement(By.xpath("//input[@name='reg_passwd__']")).sendKeys("reieie");
	WebElement dropdown=driver.findElement(By.xpath("//select[@name='birthday_month']"));
	Select s1=new Select(dropdown);
	s1.selectByIndex(8);
	
	
	WebElement dropdown2=driver.findElement(By.xpath("//select[@id='day']"));
	Select s2=new Select(dropdown2);
	s2.selectByValue("19");
	
	WebElement dropdown3=driver.findElement(By.xpath("//select[@id='year']"));
	Select s3=new Select(dropdown3);
	s3.selectByVisibleText("1984");
	
		
		
	}

}
