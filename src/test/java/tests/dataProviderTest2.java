package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class dataProviderTest2 {
	WebDriver driver;
	
	@DataProvider
	public Object[][] searchData(){
	return new Object[][] {{"Selenium"}, {"WebDriver"}, {"Docker"}};
	}
	
	@Test(dataProvider = "searchData")
	public void searchGoogle(String value) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://ui.cogmento.com/");
		
		driver.findElement(By.xpath("//input[@placeholder='Email']"));
		Thread.sleep(2000);
		driver.quit();
	}

}
