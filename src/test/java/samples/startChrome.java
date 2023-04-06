package samples;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class startChrome {

	public static void main(String[] args) throws InterruptedException {


//		WebDriver driver=new ChromeDriver();
		WebDriver driver = new EdgeDriver();
		driver.get("https://www.google.ca");
		Thread.sleep(2000);
		driver.quit();
	}

}
