package selenium.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;


public class SampleDataTest {
	WebDriver driver;
	@BeforeMethod
	public void driver() {
	    driver = new ChromeDriver();
		driver.get("https://form-bot-anvsystems.pages.dev/");
		
	}
	
	@test(DataProvider = user_data)
	public void outputTest (String name, String second) {
		driver.findElement(By.name("firstname")).sendKeys("name");
		driver.findElement(By.name("lastname")).sendKeys("second");
	}
	@DataProvider(name = "user_data")
	public Object[][] loginDataProvider(){
		String[][] loginData= {
				{"alok","alok@gmail"}
				
		
	    };
		return loginData;
	}

}
