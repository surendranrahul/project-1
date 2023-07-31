package testng4;

import org.junit.runners.Parameterized.Parameters;
import org.testng.annotations.Test;

@Test
public class Parameters3 {
	@Parameters({"Location", "amazon"})
	public void openAmazon(String location, String amazon) {
		System.setProperty("webdriver.chrome.driver", Location);
		ChromeDriver driver = new ChromeDriver();
		driver.get(amazon);
		driver.manage().window().maximize();
		
	}
	@Parameters({"Location", "alert"})
	public void openAlert() {
		System.setProperty("webdriver.chrome.driver", Location);
		ChromeDriver driver = new ChromeDriver();
		driver.get(alert);
		driver.manage().window().maximize();


}
}