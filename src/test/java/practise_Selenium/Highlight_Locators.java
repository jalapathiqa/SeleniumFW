package practise_Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Highlight_Locators {
	
	public static void main(String[] args) {
		
//		io.github.bonigarcia.wdm.WebDriverManager.chromedriver().proxy("testhost:8080").setup();
		io.github.bonigarcia.wdm.WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://google.ca");

	}

}
