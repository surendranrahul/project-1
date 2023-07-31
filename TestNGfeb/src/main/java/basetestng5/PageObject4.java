package basetestng5;

import java.io.IOException;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;

import excel_01.ReadExcel;

public class PageObject4 {
	public ChromeDriver driver;//declaration 
    public String excelFilename; 
	@BeforeMethod	
	public void StartApp() {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://www.leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
	}
    @AfterMethod
	public void CloseApp() {
		driver.close();
	}
    
    @DataProvider(name="fetchdata")
    public String [][] sendData() throws IOException{
    	ReadExcel rel=new ReadExcel();
    	String[][] data = rel.readData(excelFilename);
		return data;
     
    }

}
