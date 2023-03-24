package samples;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class sample2 {
	
	public static void main(String []args) throws MalformedURLException {
		
		WebDriverManager.chromedriver().setup();
		ChromeOptions op = new ChromeOptions();
		
		WebDriver driver = new RemoteWebDriver(new URL("http://localhost:4444"),op);
		driver.get("https:eenadu.net");
	}

}
