package practise_Selenium;

import java.awt.Window;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Handle_Frames {
	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.hyrtutorials.com/p/frames-practice.html");
		driver.manage().window().maximize();
		Thread.sleep(2000);

		driver.findElement(By.id("name")).sendKeys("Reddy");
		Thread.sleep(2000);
		
		driver.switchTo().frame(driver.findElement(By.id("frm1")));
		Thread.sleep(2000);

		Select courseId = new Select(driver.findElement(By.id("course")));
		List<WebElement> courses =  courseId.getOptions();
		for (WebElement courseList : courses) {
			System.out.println("List of course :"+courseList.getText());
		}
		courseId.selectByVisibleText("Java");
		for (String string : args) {
			
		}
		
		Thread.sleep(2000);
//		driver.switchTo().parentFrame();
		driver.switchTo().defaultContent();
		Thread.sleep(2000);
		driver.findElement(By.id("name")).clear();
		driver.findElement(By.id("name")).sendKeys("Reddy1");
		
		Thread.sleep(3000);
		driver.quit();
		
		
		
		
		

	}
}
