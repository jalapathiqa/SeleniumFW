package util;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Calendar;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;

import com.github.dockerjava.api.model.Driver;

public class ScreenShot {
	WebDriver driver;
	public void takePageScreenShot(WebDriver driver, String fileName) {
		
	File srcFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File destFile = new File("./Screenshots_Pass/"+fileName+"_"+timeStamp() +".png");
		try {
			FileUtils.copyFile(srcFile, destFile);
		} catch (IOException e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
		
		
	}
	
	public void takeElementScreenShot(WebElement element, String fileName) {
		
		File srcFile = ((TakesScreenshot)element).getScreenshotAs(OutputType.FILE);
			File destFile = new File("./Screenshots_Pass/"+fileName+" "+timeStamp()+".png");
			try {
				FileUtils.copyFile(srcFile, destFile);
			} catch (IOException e) {
				e.printStackTrace();
				System.out.println(e.getMessage());
			}
			
			
		}
	
	public String timeStamp() {
		return new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new Date());
	}
	
//	public java.sql.Date timeStamp() {
//		// create a java calendar instance
//		Calendar calendar = Calendar.getInstance();
//
//		// get a java date (java.util.Date) from the Calendar instance.
//		// this java date will represent the current date, or "now".
//		java.util.Date currentDate = calendar.getTime();
//
//		// now, create a java.sql.Date from the java.util.Date
//		java.sql.Date date = new java.sql.Date(currentDate.getTime());
//		return date;
//	}

}
