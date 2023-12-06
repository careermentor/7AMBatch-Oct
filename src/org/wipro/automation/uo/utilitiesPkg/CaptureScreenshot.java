package org.wipro.automation.uo.utilitiesPkg;

import java.io.File;


import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class CaptureScreenshot 
{

	public static void screenshotresults(WebDriver driver, String name) throws Exception
	{
		TakesScreenshot scr = (TakesScreenshot) driver;     //take screenshot
		File f = scr.getScreenshotAs(OutputType.FILE);
		
		File fd = new File("./TestResults/" + name  + ".png");
		
		FileUtils.copyFile(f, fd);
	}
	
}
