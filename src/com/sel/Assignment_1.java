package com.sel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment_1 {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
	 	driver.get("https://www.calculator.net/");
	 	
	 	driver.manage().window().maximize();
		System.out.print(driver.getCurrentUrl());
		System.out.println(driver.getPageSource());
		driver.navigate().refresh();
		
		driver.get("https://www.youtube.com/");
		driver.manage().window().maximize();
		System.out.print(driver.getCurrentUrl());
		System.out.println(driver.getPageSource());
		
		driver.navigate().back();
		Thread.sleep(1000);
		driver.navigate().forward();
		driver.close();
		
		
		
	}

}
