import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class dropdown {

	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/books");
		

		WebElement dd1=driver.findElement(By.xpath("//select[@id='products-orderby']"));
		Select position=new Select(dd1);
		position.selectByIndex(2);
		
		WebElement dd2=driver.findElement(By.xpath("//select[@id='products-pagesize']"));
		Select dis=new Select(dd2);
		dis.selectByVisibleText("12");
		
		WebElement dd3=driver.findElement(By.xpath("//select[@id='products-viewmode']"));
		Select viewAs=new Select(dd3);
		viewAs.selectByValue("https://demowebshop.tricentis.com/books?viewmode=grid");
		// TODO Auto-generated method stub

	}

}
