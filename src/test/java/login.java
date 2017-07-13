import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;


public class login {

	public static WebDriver driver;
	
	@Test
	public void setup(){
		System.setProperty("webdriver.chrome.driver","D:\\Set ups\\Selenium\\Drivers\\chromedriver_2.29.exe");
		System.out.println("initialize Chrome driver");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);
		driver.get("http://www.way2automation.com/angularjs-protractor/banking/#/login");
		//wait = new WebDriverWait(driver,5);
		driver.findElement(By.cssSelector("div > div:nth-child(3) > .btn.btn-primary.btn-lg")).click();
	}
	
	@AfterTest
	public void teardown(){
		driver.quit();
	}
}
