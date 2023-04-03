import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class VivaOne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();

		driver.get("https://demowebshop.tricentis.com/");
		
		driver.findElement(By.partialLinkText("Books")).click();
		
		String s=driver.getTitle();
		System.out.println(s);
		
		WebElement v=driver.findElement(By.id("products-orderby"));
		Select sc=new Select(v);
		sc.selectByIndex(1);

	}

}
