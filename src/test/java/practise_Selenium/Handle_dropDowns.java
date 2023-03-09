package practise_Selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Handle_dropDowns {
	public static void main(String[] args) throws InterruptedException {

		io.github.bonigarcia.wdm.WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.hyrtutorials.com/p/html-dropdown-elements-practice.html");
		Thread.sleep(2000);
		
//// 		Single selection dropdown:
//		WebElement courseElement = driver.findElement(By.xpath("//select[@id='course']"));
//
//		Select courseNameDropDown = new Select(courseElement);
//		List<WebElement> courses = courseNameDropDown.getOptions();
//
//		for (WebElement courseName : courses) {
//			System.out.println(courseName.getText());
//		}
//
//		courseNameDropDown.selectByIndex(1);
//		Thread.sleep(2000);
//		courseNameDropDown.selectByVisibleText("Javascript");
//		Thread.sleep(2000);
//		courseNameDropDown.selectByValue("net");
//		Thread.sleep(2000);
//		
//		String selectedText = courseNameDropDown.getFirstSelectedOption().getText();
//		System.out.println("Selected visible text: "+selectedText);
//		Thread.sleep(3000);
		
// 		Multi selection dropdown:
		WebElement courseElement1 = driver.findElement(By.xpath("//select[@id='ide']"));

		Select ideName = new Select(courseElement1);
		List<WebElement> ideList = ideName.getOptions();
		
		for (WebElement ideListOfNames : ideList) {
			System.out.println("Multi Ide names: " +ideListOfNames.getText());
		}
		
		ideName.selectByIndex(1);
		Thread.sleep(2000);
		ideName.selectByValue("ec");
		Thread.sleep(2000);
		ideName.selectByVisibleText("Visual Studio");
		Thread.sleep(2000);
		WebElement eclipse = driver.findElement(By.xpath("//option[@value='ec']"));
		if (eclipse.isSelected()){
			ideName.deselectByIndex(1);
			
		}
		Thread.sleep(2000);

		ideName.selectByIndex(3);
		List<WebElement> multitSelectedIdeName = ideName.getAllSelectedOptions();
		for (WebElement multiSelected : multitSelectedIdeName) {
			System.out.println("Multi selected ide names: "+multiSelected.getText());
		}

		Thread.sleep(2000);
		driver.close();
		driver.quit();

	}

	public static void highlight(WebDriver driver, WebElement element) {
		JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
		jsExecutor.executeScript("arguments[0].setAttribute('style', 'border:2px solid red; background:yellow')",
				element);

	}

}
