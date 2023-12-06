package org.xyz.automation.fb;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FirstAutomation 
{
	
	WebDriver driver;

	
	@BeforeMethod
	public void launchBrowser()
	{
		WebDriverManager.chromedriver().setup();
		
		driver= new ChromeDriver();   //launch a chrome browser
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(300));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		
	}
	
	
	@AfterMethod
	public void closeBrowser()
	{
		driver.close();
	}
	
	@Test
	public void signupFunc() throws Exception
	{
		driver.findElement(By.xpath("//a[text()='Create new account']")).click();
		
		//Thread.sleep(5000);
		
		driver.findElement(By.name("firstname")).sendKeys("Selenium");
	}
	
	
	@Test
	public void loginFunc()
	{
		driver.findElement(By.id("email")).sendKeys("user1");
		
		driver.findElement(By.name("pass")).sendKeys("Pass123");
		
		driver.findElement(By.cssSelector("[type='submit']")).click();
	}
	
	
}
