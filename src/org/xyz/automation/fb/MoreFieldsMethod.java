package org.xyz.automation.fb;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MoreFieldsMethod 
{
	
	WebDriver driver;

	@Test
	public void launchBrowser() throws Exception
	{
		WebDriverManager.chromedriver().setup();
		
		driver= new ChromeDriver();   //launch a chrome browser
		driver.get("https://thetestingworld.com/testings/");   //60 secs
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(300));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		driver.manage().window().maximize();
		
		driver.findElement(By.name("fld_username")).sendKeys("user1");
		
		driver.findElement(By.name("fld_username")).clear();
		
		driver.findElement(By.name("fld_username")).sendKeys("user2");
		
		driver.findElement(By.cssSelector("[value='home']")).click();
		
		Select gen = new Select(driver.findElement(By.name("sex")));
		//gen.selectByIndex(1)  //Male
		//gen.selectByValue("2");;  //Female
		gen.selectByVisibleText("Male");
		
		Select con = new Select(driver.findElement(By.name("country")));
		con.selectByVisibleText("United States");
		//con.selectByVisibleText("India");
		//con.selectByVisibleText("United Kingdom");
		
		//con.deselectAll();
		//con.deselectByVisibleText("India");
		
		Select st = new Select(driver.findElement(By.name("state")));
		
		//WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		//wait.until(ExpectedConditions.textToBePresentInElement(driver.findElement(By.id("stateId")), "Florida"));
		
		
		st.selectByVisibleText("Arizona");
		
		Select ct = new Select(driver.findElement(By.name("city")));
		ct.selectByVisibleText("Bouse");
		
		WebElement t = driver.findElement(By.name("terms"));
		
		System.out.println(t.isSelected()); //false
		t.click();
		System.out.println(t.isSelected());  //true
		
		//driver.findElement(By.className("displayPopup")).click();
		
	}
		
}
