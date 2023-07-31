package testng4;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class GroupintestNG2a {
	@Test(groups={"regression"})
	public void openWebTables() {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.leafground.com/table.xhtml");
		driver.manage().window().maximize();
		
	}
	@Test
	public void openWindow() {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.leafground.com/window.xhtml");
		driver.manage().window().maximize();
		
	}	

}
