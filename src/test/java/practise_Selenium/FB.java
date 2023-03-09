package practise_Selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import util.Read_Excel;

public class FB{
	public WebDriver driver;
	public String filelocation = System.getProperty("user.dir") + "/TestData/DataDrivenExcel.xlsx";
	public String sheetName = "TestSheet";
	public Read_Excel readExcelUtil ;
//	public Read_Excel getExcelData = new Read_Excel(filelocation);

	@Test(priority = 1, enabled = true)
	public void launch() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeOptions options = new ChromeOptions();
		options.addArguments("start-maximized");
		options.setExperimentalOption("excludeSwitches", new String[] { "enable-automation" });
		driver = new ChromeDriver(options);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
		driver.get("https://www.facebook.com");

		Thread.sleep(3000);
		

	}
	
	@Test(priority = 2, dataProvider = "FBLogin")
	public void Login(String ExecuteTestDataSet, String email, String pWord) throws InterruptedException {


		driver.findElement(By.xpath("//input[@id='email']")).sendKeys(email);
		Thread.sleep(1000);

		driver.findElement(By.xpath("//input[@id='pass']")).sendKeys(pWord);
		Thread.sleep(1000);

		WebElement ele=	driver.findElement(By.name("login"));

		driver.findElement(By.name("login")).click();
		
		Thread.sleep(5000);
		driver.quit();

	}
	
	String testCaseName = "FBLogin";
	@DataProvider(name= "FBLogin")
	public Object[][] getTestData() {
		return readExcelUtil.retrieveTestData(sheetName, testCaseName);
	}

}
