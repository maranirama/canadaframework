import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropdownMulti {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("file:///C:/Users/ramas/OneDrive/Desktop/dropdown.html");
		WebElement mutiSelect=driver.findElement(By.xpath("//select[@id='dd2']"));
		
		Select s1= new Select(mutiSelect);
		s1.selectByValue("2");
		s1.selectByValue("4");
		s1.selectByValue("6");
		//s1.selectByValue("8");
		
		Thread.sleep(2000);
		//s1.deselectAll();
		s1.deselectByValue("4");
		s1.deselectByIndex(1);
		s1.selectByVisibleText("C++");
	
		
		

		//driver.findElement(By.xpath("//select[@id='dd1']"));

	}

}
