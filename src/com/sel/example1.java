package com.sel;


import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class example1 
{

		public static void main(String[] arg) throws InterruptedException
		{
			System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
			WebDriver driver= new ChromeDriver();
			
			
			driver.get("https://www.indiainxga.com/member/index.aspx?memberCode=100059");
			
			String oldWindow=driver.getWindowHandle();
			WebElement button =driver.findElement(By.id("linkSingup"));
			button.click();
			
			Thread.sleep(3000);
			
			Set<String> newWindows	=driver.getWindowHandles();
		
				for (String nw : newWindows) 
				{
			
					driver.switchTo().window(nw);
			
			
				}
			WebElement  email = driver.findElement(By.id("emailAddress"));
			email.sendKeys("marani1@gmail.com");
				
			WebElement fName=driver.findElement(By.id("username"));
			fName.sendKeys("rama");
			
		
			
			
			WebElement passWord = driver.findElement(By.id("password"));
			passWord.sendKeys("devi123");
			
			WebElement  confirmPassword = driver.findElement(By.id("password2"));
			confirmPassword.sendKeys("devi123");
			
			driver.close();
			//driver.switchTo().defaultContent();
			driver.switchTo().window(oldWindow);
			
			// WebElement regButton =driver.findElement(By.id("accountCreationButton"));
			 
			 //regButton.click();
			
			
				
			
			
			
			
			
					
		}
		
}
