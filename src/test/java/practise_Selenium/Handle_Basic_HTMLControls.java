package practise_Selenium;

import org.apache.hc.core5.util.Asserts;
import org.asynchttpclient.util.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import dev.failsafe.internal.util.Assert;

public class Handle_Basic_HTMLControls {
public static void main(String[] args) throws InterruptedException {
		
		io.github.bonigarcia.wdm.WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.hyrtutorials.com/p/basic-controls.html");
		Thread.sleep(2000);
		WebElement firstName = driver.findElement(By.xpath("//input[@id='firstName']"));
		firstName.clear();
		Thread.sleep(1000);
		firstName.sendKeys("Jp");
		WebElement lastName = driver.findElement(By.xpath("//input[@id='lastName']"));
		lastName.clear();		
		Thread.sleep(1000);

		lastName.sendKeys("Reddy");
		Thread.sleep(1000);

		WebElement femaleRadio = driver.findElement(By.xpath("//input[@id='femalerb']"));
		femaleRadio.click();
		
		WebElement englishBox = driver.findElement(By.xpath("//input[@id='englishchbx']"));
//		englishBox.click();
		Thread.sleep(1000);
		WebElement hindBox = driver.findElement(By.xpath("//input[@id='hindichbx']"));
//		hindBox.click();
		Thread.sleep(1000);
		WebElement chineseBox = driver.findElement(By.xpath("//input[@id='chinesechbx']"));
//		chineseBox.click();
		Thread.sleep(1000);
		WebElement spanishBox = driver.findElement(By.xpath("//input[@id='spanishchbx']"));
//		spanishBox.click();
		Thread.sleep(1000);
		WebElement latinBox = driver.findElement(By.xpath("//input[@id='latinchbx']"));
//		latinBox.click();
		Thread.sleep(1000);
		WebElement frenchBox = driver.findElement(By.xpath("//input[@id='frenchchbx']"));
//		frenchBox.click();
		Thread.sleep(1000);
		
		if(englishBox.isSelected()) {
			englishBox.click();
			
		}else {
			hindBox.click();
		}

		WebElement enterEmail = driver.findElement(By.xpath("//input[@id='email']"));
		enterEmail.clear();
		Thread.sleep(1000);
		enterEmail.sendKeys("jpreddy@gmail");
		Thread.sleep(1000);
		WebElement enterPassword = driver.findElement(By.xpath("//input[@id='password']"));
		enterPassword.clear();
		Thread.sleep(1000);
		enterPassword.sendKeys("password");
		Thread.sleep(2000);
		
		
			
			
		
		
		WebElement registerBtn = driver.findElement(By.xpath("//button[contains(text(),'Register')]"));
		registerBtn.click();
		Thread.sleep(3000);
		String msg = driver.findElement(By.xpath("//label[@id='msg']")).getText();
		System.out.println(msg);
		Thread.sleep(2000);
		
		if(msg.equals("Registration is Successful")) {
			System.out.println("Registration is Successfull, navigating back to Home Page");
			driver.findElement(By.linkText("Click here to navigate to the home page")).click();
		}else {
			System.out.println("Registration is Not Successfull please check the Application");

		}
		Thread.sleep(2000);
		driver.close();
		driver.quit();
		
	}
	
	public static void highlight(WebDriver driver, WebElement element) {
		JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
		jsExecutor.executeScript("arguments[0].setAttribute('style', 'border:2px solid red; background:yellow')", element);
		
	}

}
