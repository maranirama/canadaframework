package com.sel;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
//import org.openqa.selenium.support.ui.Select;

public class SeleniumTest2 {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.indiainxga.com/member/index.aspx?memberCode=100059");
		WebElement button =driver.findElement(By.id("linkSingup"));
		button.click();
		
		WebElement alertBox = driver.findElement(By.xpath(null));
		alertBox.click();
		
		Alert alert = driver.switchTo().alert();
		alert.accept();
		
		WebElement confirmBox = driver.findElement(By.xPath(null));
		confirmBox.clear();
		
		
	
		 */
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
