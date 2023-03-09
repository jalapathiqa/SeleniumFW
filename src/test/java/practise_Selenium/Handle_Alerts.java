package practise_Selenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Handle_Alerts {
	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://netbanking.hdfcbank.com/netbanking/");
		Thread.sleep(2000);		
//		driver.findElement(By.xpath("//a[@class='btn btn-primary login-btn']")).click();
//		Alert alert

//// Alert Box:
//		Thread.sleep(2000);
//		driver.navigate().to("https://www.hyrtutorials.com/p/alertsdemo.html");
//		Thread.sleep(2000);
//
//		driver.findElement(By.xpath("//button[@id='alertBox']")).click();
//		Thread.sleep(2000);		
//		System.out.println(driver.switchTo().alert().getText());
//		Thread.sleep(2000);
//		driver.switchTo().alert().accept();		
//		System.out.println(driver.findElement(By.xpath("//div[@id='output']")).getText());
//		Thread.sleep(3000);
		
//		// confirm  Box:
//				Thread.sleep(2000);
//				driver.navigate().to("https://www.hyrtutorials.com/p/alertsdemo.html");
//				Thread.sleep(2000);
//
//				driver.findElement(By.xpath("//button[@id='confirmBox']")).click();
//				Thread.sleep(2000);		
//				System.out.println(driver.switchTo().alert().getText());
//				Thread.sleep(2000);
//				driver.switchTo().alert().accept();		
//				System.out.println(driver.findElement(By.xpath("//div[@id='output']")).getText());
//				
//				Thread.sleep(2000);
//
//				driver.findElement(By.xpath("//button[@id='confirmBox']")).click();
//				Thread.sleep(2000);		
//				System.out.println(driver.switchTo().alert().getText());
//				Thread.sleep(2000);
//				driver.switchTo().alert().dismiss();		
//				System.out.println(driver.findElement(By.xpath("//div[@id='output']")).getText());
//				Thread.sleep(3000);
				
				// prompt  Box:
				Thread.sleep(2000);
				driver.navigate().to("https://www.hyrtutorials.com/p/alertsdemo.html");
				Thread.sleep(2000);

				driver.findElement(By.xpath("//button[@id='promptBox']")).click();
				Thread.sleep(2000);		
				System.out.println(driver.switchTo().alert().getText());
				Thread.sleep(2000);
				driver.switchTo().alert().sendKeys("Jpreddy");	
				Thread.sleep(2000);
				driver.switchTo().alert().accept();		
				System.out.println(driver.findElement(By.xpath("//div[@id='output']")).getText());
				
				Thread.sleep(2000);

				driver.findElement(By.xpath("//button[@id='promptBox']")).click();
				Thread.sleep(2000);		
				System.out.println(driver.switchTo().alert().getText());
				Thread.sleep(2000);
				driver.switchTo().alert().dismiss();		
				System.out.println(driver.findElement(By.xpath("//div[@id='output']")).getText());
				Thread.sleep(3000);
		
		driver.close();
		driver.quit();
	}

}
