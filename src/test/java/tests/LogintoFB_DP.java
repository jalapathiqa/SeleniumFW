package tests;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import io.qameta.allure.Description;
import io.qameta.allure.Epic;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.Stories;
import io.qameta.allure.Story;
import listeners.TestAllureListener;
import pageObjects.FaceBookLogin_PageObjects;
@Epic("Epic 100: Design FB Login test")
@Story("CA101: FaceBook Login story with username & Password")
@Listeners(TestAllureListener.class)
public class LogintoFB extends BaseClass{

	String testCaseName = "FBLogin";

	@DataProvider(name = "FBLogin")
	public Object[][] getData() {
		return readExcelData.retrieveTestData(sheetName, testCaseName);
	}

	@Description("Login to FB test")
	@Severity(SeverityLevel.CRITICAL)
	@Test(dataProvider = "FBLogin")
	public void LoginFaceBook(String Execute, String email, String pWord) throws InterruptedException {

		FaceBookLogin_PageObjects fb = PageFactory.initElements(driver, FaceBookLogin_PageObjects.class);
//		fbLogin = new FaceBookLogin_PageObjects(driver);
		fb.loginToFB(email, pWord);
		Thread.sleep(2000);
	}

}
