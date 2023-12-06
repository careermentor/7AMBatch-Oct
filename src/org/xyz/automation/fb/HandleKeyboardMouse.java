package org.xyz.automation.fb;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class HandleKeyboardMouse 
{
	
	WebDriver driver;
	
	@Test
	public void handleFrames() throws Exception
	{
		//WebDriverManager.chromedriver().setup();
		
		driver= new ChromeDriver();   //launch a chrome browser
		driver.navigate().to("https://demoqa.com/frames");
		System.out.println(driver.findElement(By.xpath("//*[contains(text(),'Sample Iframe')]")).getText());
		
		driver.switchTo().frame("frame1");
		
		System.out.println(driver.findElement(By.xpath("//*[contains(text(),'This is a sample page')]")).getText());
		
		CaptureScreenshot.screenshotresults(driver,"handleFrames");
	}
	@Test
	public void handleAlerts() throws Exception
	{
		//WebDriverManager.chromedriver().setup();
		
		driver= new ChromeDriver();   //launch a chrome browser
		driver.navigate().to("https://mail.rediff.com/cgi-bin/login.cgi");
		
		CaptureScreenshot.screenshotresults(driver,"handleAlerts_1");
		
		driver.findElement(By.className("signinbtn")).click();
		driver.switchTo().alert().accept();
		
		CaptureScreenshot.screenshotresults(driver,"handleAlerts_2");
	}
	
	@Test(enabled=false)
	public void handleMouse() throws Exception
	{
		//WebDriverManager.chromedriver().setup();
		
		driver= new ChromeDriver();   //launch a chrome browser
		driver.navigate().to("https://www.mphasis.com/home.html");
		
		Actions act = new Actions(driver);
		//act.click(driver.findElement(By.xpath("//a[text()='Our Approach']"))).perform();
		
		//act.doubleClick(driver.findElement(By.xpath("//a[text()='Our Approach']"))).perform();
		
		//act.contextClick(driver.findElement(By.xpath("//a[text()='Our Approach']"))).perform();  //right click
		
		act.moveToElement(driver.findElement(By.xpath("//a[text()='Industries']"))).perform(); 
		
		//act.click(driver.findElement(By.xpath("//span[contains(text(),'Hi-Tech')]"))).perform();
		act.keyDown(Keys.CONTROL).click(driver.findElement(By.xpath("//span[contains(text(),'Hi-Tech')]"))).keyUp(Keys.CONTROL).perform();
		
		Set<String> winsid = driver.getWindowHandles();
		System.out.println(winsid);
		
		Iterator<String> itr = winsid.iterator();
		String win1 = itr.next();  // first window
		String win2 = itr.next();  //second wondow
		
		driver.switchTo().window(win2);
		driver.quit();
		
		
		
		
		
	}
	
	@Test(enabled=false)
	public void handleKeyboard() throws Exception
	{
		//WebDriverManager.chromedriver().setup();
		
		driver= new ChromeDriver();   //launch a chrome browser
		driver.navigate().to("https://www.facebook.com/");
		
		Actions act = new Actions(driver);
		act.sendKeys("user1").perform();
		
		act.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).sendKeys(Keys.BACK_SPACE).perform();
		
		act.sendKeys("user2").perform();
		
		act.sendKeys(Keys.TAB).perform();
		act.sendKeys("pass1").perform();
		act.sendKeys(Keys.ENTER).perform();
		
		
	}
		
}
