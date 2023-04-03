import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import com.gargoylesoftware.htmlunit.javascript.SimpleScriptable;
import com.gargoylesoftware.htmlunit.javascript.host.Iterator;
import com.gargoylesoftware.htmlunit.javascript.host.Set;

public class TestTwo {

	public static void main(String[] args) throws InterruptedException {	System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		driver.findElement(By.id("autocomplete")).sendKeys("india");
		
		driver.findElement(By.className("radioButton")).click();
		
		WebElement dd1= driver.findElement(By.id("dropdown-class-example"));
		Select dropdown=new Select(dd1);
		dropdown.selectByIndex(1);
		
		driver.findElement(By.id("checkBoxOption1")).click();
		driver.findElement(By.id("checkBoxOption2")).click();
		
	
		
		List<WebElement> l1=driver.findElements(By.xpath("//*[@id=\'product\']"));
		
		for(WebElement listTd :l1)
		{

			String s=listTd.getText();
			System.out.println(s);
		}
		
		Thread.sleep(1000);
		
		driver.findElement(By.id("show-textbox")).click();
		driver.findElement(By.id("displayed-text")).sendKeys("hallo");
		
		Thread.sleep(2000);
		
		
		WebElement button=	driver.findElement(By.xpath("//button[@id='mousehover']"));
		Actions action=new Actions(driver);
		action.moveToElement(button).doubleClick().build().perform();
		
		Thread.sleep(2000);
	
		
		driver.findElement(By.id("name")).sendKeys("rama");
		driver.findElement(By.id("alertbtn")).click();
		Alert e=driver.switchTo().alert();
		Thread.sleep(1000);
		e.accept();
		
		
		
		driver.switchTo().frame(driver.findElement(By.id("courses-iframe")));
		driver.findElement(By.xpath("//a[@href='https://courses.rahulshettyacademy.com/courses']")).click();
		
		
		driver.switchTo().defaultContent();
		
		
		
		
	String ParentWindow=driver.getWindowHandle();
		
		
		driver.findElement(By.id("openwindow")).click();
		
		//handle window
		java.util.Set<String> w=driver.getWindowHandles();
		//window handle iterator
		 java.util.Iterator<String> t= w.iterator();
	      String ch = t.next();
	      
	      
	      driver.switchTo().window(ch);
	      driver.close();
	      
	      //switch to parent window
	      driver.switchTo().window(ParentWindow);
		
		
		
			/*
			 * //for(String window :cb) { driver.switchTo().window(window);
			 * 
			 * 
			 * // switching child window driver.switchTo().window(ch); //Alert
			 * e1=driver.switchTo().alert(); //e1.dismiss();
			 * if(driver.getTitle().contains("QA")); {
			 * 
			 * Thread.sleep(1000); driver.close(); } }
			 */
				
				
				driver.switchTo().window(ParentWindow);
				
				
				
				
				
				
				
				 driver.findElement(By.id("opentab")).click(); java.util.Set<String>
				 childbrowser=driver.getWindowHandles();
				 
				 for(String window1 :childbrowser) 
				 
				{ 
					 driver.switchTo().window(window1);
					 if(driver.getTitle().contains("rahulshettyacademy")); 
					 {
						 Thread.sleep(2000);
						 driver.close(); 
					 } 
				}
				 
				
		

	}

}
