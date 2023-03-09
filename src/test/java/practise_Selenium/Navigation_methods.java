package practise_Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Navigation_methods {
	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.ca/");
		Thread.sleep(2000);
		
		driver.findElement(By.name("q")).sendKeys("hello");
		driver.findElement(By.name("q")).submit();
		Thread.sleep(2000);
		
		driver.navigate().to("https://www.facebook.com/login.php/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("jp@gmail.com");
		Thread.sleep(2000);
		driver.navigate().refresh();
		Thread.sleep(2000);
		
		driver.navigate().back();
		Thread.sleep(2000);
		driver.navigate().forward();
		Thread.sleep(2000);
		String enteredEmail ; driver.findElement(By.xpath("//input[@id='email']")).getAttribute("value");
		System.out.println("enteredEmail: ");
		
		Thread.sleep(2000);
		driver.close();
		driver.quit();
	}

}
