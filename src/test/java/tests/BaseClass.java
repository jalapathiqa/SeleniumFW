package tests;

import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import driverFactory.DriverFactory;
import io.github.bonigarcia.wdm.WebDriverManager;
import pageObjects.AccountPageObject;
import pageObjects.FaceBookLogin_PageObjects;
import pageObjects.LoginPageObjects;
import pageObjects.LoginPageObjectsCogmento;
import pageObjects.NewContactObjects;
import util.Read_Excel;
import util.ScreenShot;

public class BaseClass {

	DriverFactory df;
	Properties prop;
	WebDriver driver;
	protected LoginPageObjects loginPage;
	AccountPageObject accountsPage;
	LoginPageObjectsCogmento loginCogmento;
	ScreenShot ts ;
	FaceBookLogin_PageObjects fbLogin;
	public static String filelocation = System.getProperty("user.dir") + "/TestData/DataDrivenExcel.xlsx";
	public String sheetName = "TestSheet";
	public Read_Excel readExcelData ;
	NewContactObjects newContacts;

	@BeforeTest
	public void setup() throws InterruptedException {
		df = new DriverFactory();
		prop = df.init_prop();
		driver = df.init_driver(prop);
		readExcelData= new Read_Excel(filelocation);
		ts = new ScreenShot();
		loginPage = new LoginPageObjects(driver);
		accountsPage = new AccountPageObject(driver);
		loginCogmento = new LoginPageObjectsCogmento(driver);		
		fbLogin = new FaceBookLogin_PageObjects(driver);
		newContacts = new NewContactObjects(driver);
	}

	@AfterTest
	public void tearDown() {
		driver.quit();
	}
	
	public void loginToCogmento() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://ui.cogmento.com/");
		
		driver.findElement(By.xpath("//input[@placeholder='Email']")).sendKeys("jpreddy911@gmail.com");
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("jpreddy911@gmail.com");
//		driver.findElement(By.xpath("//input[@placeholder='Email']")).sendKeys("jpreddy911@gmail.com");


	}

}
