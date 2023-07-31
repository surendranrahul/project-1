package testng4;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class GroupintestNG2 {
	@Test
	public void openAmazon() {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in");
		driver.manage().window().maximize();
		
	}
	@Test(groups={"regression"})
	public void openAlert() {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.leafground.com/alert.xhtml");
		driver.manage().window().maximize();
			}	

}
