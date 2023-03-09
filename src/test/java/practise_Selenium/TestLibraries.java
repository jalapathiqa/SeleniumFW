package practise_Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestLibraries {
	
	public static void main(String[] args) {
		
		
		WebDriver driver = new ChromeDriver();
		System.setProperty("webdriver.chrome.driver", "./Resources/chromedriver.exe");
		driver.get("http:eenadu.net");
		
		WebDriver driver1 = new FirefoxDriver();
		System.setProperty("webdriver.gecko.driver", "./Resources/geckodriver.exe");
		driver1.get("http:eenadu.net");

		WebDriver driver2 = new EdgeDriver();
		System.setProperty("webdriver.Edge.driver", "./Resources/msedgedriver.exe");
		driver2.get("http:eenadu.net");
	}
	

}
