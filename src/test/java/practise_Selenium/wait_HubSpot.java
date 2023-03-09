package practise_Selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import util.Read_Excel;
import util.ScreenShot;

public class wait_HubSpot {
	public static String filelocation = System.getProperty("user.dir") + "/TestData/DataDrivenExcel.xlsx";
	public String sheetName = "TestSheet";

	WebDriver driver;
	ScreenShot takeScreenshot = new ScreenShot();
	Read_Excel readExcelData = new Read_Excel(filelocation);

	String testCaseName = "HubSpot";

	@DataProvider
	public Object[][] getData() {

		return readExcelData.retrieveTestData(sheetName, testCaseName);

	}

	@Test(dataProvider = "getData")
	public void hubSpot_login(String Execute, String textFirstName, String textLastName) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeOptions options = new ChromeOptions();
		options.setExperimentalOption("excludeSwitches", new String[] { "enable-automation" });
		options.addArguments("start-maximized");
		driver = new ChromeDriver(options);
//		driver.manage().window().setSize(new Dimension(1000, 1000));

		driver.get("https://www.hyrtutorials.com/p/waits-demo.html");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));

		By addText1 = By.id("btn1");
		By textBox1 = By.id("txt1");

		By addText2 = By.id("btn2");
		By textBox2 = By.id("txt2");

		wait.until(ExpectedConditions.visibilityOfElementLocated(addText1));
		driver.findElement(addText1).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(textBox1));
		driver.findElement(textBox1).sendKeys(textFirstName);

		wait.until(ExpectedConditions.visibilityOfElementLocated(addText2));
		driver.findElement(addText2).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(textBox2));
		driver.findElement(textBox2).sendKeys(textLastName);

		ScreenShot ts = new ScreenShot();
		ts.takePageScreenShot(driver, "waits");
		driver.quit();

	}

}
