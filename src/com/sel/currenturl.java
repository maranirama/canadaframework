package com.sel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class currenturl {

	public static void main(String[] args) throws InterruptedException {
		//System.setProperty("webdriver.chrome.driver","/")
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.com/");
	 System.out.println(driver.getCurrentUrl());
	 System.out.print(driver.getPageSource());
	 Thread.sleep(3000);
		
		driver.get("https://www.flipkart.com/");
		 System.out.println(driver.getCurrentUrl());
		 System.out.print(driver.getPageSource());
		 
		 driver.navigate().back();
		 driver.navigate().forward();
			
		 
		 driver.close();
		
		
			

	}

}
