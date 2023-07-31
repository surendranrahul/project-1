package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import basetestng5.PageObject4;

public class HomePage extends PageObject4 {
	public HomePage(ChromeDriver driver) {
		this.driver=driver;
		}
	public WelcomePage clickLink() throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@id='label']/a")).click();
		return new WelcomePage(driver);
	}
	
	
	

}
