package tryme;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class trytoupload {
	WebDriver driver;
	String url="https://www.google.co.in/";
	@BeforeMethod
	public void setup() {
		ChromeOptions chro = new ChromeOptions();
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver(chro);
		
	}
	@Test
	public void gitimpl() {
		driver.get(url);
		
	}
	
	@AfterMethod
	public void closewin() {
		driver.close();
	
}

}
