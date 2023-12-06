package org.xyz.automation.fb;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserControl 
{
	
	WebDriver driver;

	@Test
	public void launchBrowser() throws Exception
	{
		//WebDriverManager.chromedriver().setup();
		
		driver= new ChromeDriver();   //launch a chrome browser
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		
		//driver.get("https://www.facebook.com/");
		driver.navigate().to("https://www.facebook.com/");
		
		driver.navigate().back();
		Thread.sleep(5000);
		driver.navigate().forward();
		Thread.sleep(5000);
		driver.navigate().refresh();
		Thread.sleep(5000);
		
		driver.close();  //this method will close one window/tab
		
		driver.quit();  //wil close multiple window/tab
		
	}
		
}
