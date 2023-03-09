package practise_Selenium;

import java.awt.Window;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Handle_Window {
	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		String parentWindow = driver.getWindowHandle();
		System.out.println("parent window: "+parentWindow+" :" +driver.getTitle());
		
//		single window
		
		driver.findElement(By.id("newWindowBtn")).click();
		Thread.sleep(2000);
		Set<String> windowHandles =	driver.getWindowHandles();
		for (String windowHandle : windowHandles) {
			if(!windowHandle.equals(parentWindow)) {
				driver.switchTo().window(windowHandle);
				driver.manage().window().maximize();
				Thread.sleep(2000);
				driver.findElement(By.id("firstName")).sendKeys("Reddy");
				Thread.sleep(2000);
				System.out.println("Child Windows: "+windowHandle+" :" +driver.getTitle());
				driver.close();

			}			
		}
		
		driver.switchTo().window(parentWindow);
		Thread.sleep(2000);

		driver.findElement(By.id("name")).sendKeys("Reddy");
		Thread.sleep(3000);
		driver.quit();
		
		
		
		
		

	}
}
