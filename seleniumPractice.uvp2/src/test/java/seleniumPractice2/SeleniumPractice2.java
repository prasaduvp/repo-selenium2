package seleniumPractice2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SeleniumPractice2 {

	public static void main(String[] args) throws InterruptedException {
		
		//WebDriverManager.chromedriver().setup();
			System.setProperty("webdriver.gecko.driver", "geckodriver.exe");
			
			
			
		WebDriver driver = new FirefoxDriver();
		driver.navigate().to("https://www.saucedemo.com/v1/");
		
		Thread.sleep(3000);
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		Thread.sleep(3000);
		driver.findElement(By.name("password")).sendKeys("secret_sauce");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"login-button\"]")).click();
		driver.quit();
		
		
	}

}
