package practise_Java;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HashMap_userLogin {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

		Thread.sleep(2000);
		Map<String, String> userMap = new HashMap<String, String>();
		userMap.put("un", "admin_Admin");
		userMap.put("pwd", "admin_admin123");
		
		for (Map.Entry m : userMap.entrySet()) {
			System.out.println(m.getKey()+": "+m.getValue());
		}
		
		driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys(userMap.get("un").split("_")[0]);
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys(userMap.get("pwd").split("_")[0]);
		driver.findElement(By.xpath("//button[normalize-space()='Login']")).click();

		
		driver.quit();
	}

}
