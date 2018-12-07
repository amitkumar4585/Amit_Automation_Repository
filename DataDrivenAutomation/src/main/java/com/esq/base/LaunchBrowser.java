package com.esq.base;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class LaunchBrowser
{
	public ChromeDriver driver;

	@BeforeMethod
	public void startBrowser() 
	{
       
        System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.thetestingworld.com/testings");
		driver.manage().window().maximize();
	   
		
	}
	
	
	@AfterMethod
	public void stopBrowser()
	{
		
		driver.quit();
		
	}
	
	
}
