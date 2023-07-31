package testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import basetestng5.PageObject4;
import pages.LoginPage;


public class TestCase_01 extends PageObject4 {
	
	@BeforeTest
	public void setFileName() {
		excelFilename="Book1";
		
	}
	
	@Test(dataProvider = "fetchdata")
	public void FirstTestCase(String user, String pass) throws InterruptedException {
		new LoginPage(driver).
		enterUsername(user).
		enterPassword(pass).
		clickButton().
		clickLink().
		printTitle();
		
		
		
	}

}
