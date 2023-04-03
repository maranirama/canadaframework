//import org.apache.commons.io.FileUtils;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
//import org.openqa.selenium.OutputType;
//import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.gargoylesoftware.htmlunit.javascript.host.file.File;
import com.sel.JavaScriptExcecutor;

public class TstOne {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.functionize.com/h/test-automation?utm_source=google&utm_medium=paid%20search&utm_campaign=automated%20web%20testing&utm_term=automated%20web%20application%20testing&utm_campaign=Z+-+India+-+Automated+Web+Testing&utm_source=adwords&utm_medium=ppc&hsa_acc=5488573823&hsa_cam=16375912712&hsa_grp=133300773506&hsa_ad=583785827758&hsa_src=g&hsa_tgt=kwd-298529757341&hsa_kw=automated%20web%20application%20testing&hsa_mt=p&hsa_net=adwords&hsa_ver=3&gclid=Cj0KCQiAmaibBhCAARIsAKUlaKR66myHFR47MwQP4Zox8lOL9pXWTgT90yZXXgav8ib_xSLILQRYA74aAvPsEALw_wcB\r\n"
				+ "\r\n"
				+ "");
		
		driver.findElement(By.name("firstname")).sendKeys("rama");
		
		driver.findElement(By.name("lastname")).sendKeys("deva");
		
		driver.findElement(By.name("email")).sendKeys("ramasreemd@gmail.com");
		driver.findElement(By.name("phone")).sendKeys("9791008077");
		
		driver.findElement(By.name("company")).sendKeys("xxxx");
		
		driver.findElement(By.name("job_role")).sendKeys("QA");
		
		driver.findElement(By.name("total_size_of_test_suite")).sendKeys("0-500");
		driver.findElement(By.name("do_you_have_any_hands_on_experience_with_selenium_or_other_scripted_automation_")).click();
		
		
		driver.findElement(By.cssSelector("Input#terms_and_conditions-e65821c3-a1ec-4b15-9767-25c917c9afc1")).click();
		
		driver.findElement(By.cssSelector("input[type='submit']")).click();
		
		//File ScreenshotFile =((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		//FileUtils.copyFile(ScreenshotFile, new File("./screenshot/screen.png"));
		
		//File ScreenshotFile =((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		//FileUtils.copyFile(ScreenshotFile, new File("./screenshot/screen.png"));
		
		// TODO Auto-generated method stub

	}

}
