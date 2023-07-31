package pages;

import org.openqa.selenium.chrome.ChromeDriver;

import basetestng5.PageObject4;

public class WelcomePage extends PageObject4 {
	public WelcomePage(ChromeDriver driver) {
		this.driver=driver;
		
		
	}
	public void printTitle() throws InterruptedException {
		Thread.sleep(2000);
		System.out.println(driver.getTitle());
	}

}
