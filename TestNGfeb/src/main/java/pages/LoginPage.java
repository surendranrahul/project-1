package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.SendKeysAction;

import basetestng5.PageObject4;

public class LoginPage extends PageObject4 {
	public LoginPage(ChromeDriver driver) {
		this.driver=driver;
		
	}
	public LoginPage enterUsername(String user) throws InterruptedException {	
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='USERNAME']")).sendKeys(user);
		return new LoginPage(driver);
	}
	public LoginPage enterPassword(String pass) throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='PASSWORD']")).sendKeys(pass);
		return new LoginPage(driver);
	}
    public HomePage clickButton() throws InterruptedException {
    	Thread.sleep(2000);
    	driver.findElement(By.xpath("//input[@value='Login']")).click();
    	return new HomePage(driver);
	
}
}
