package seleniumPractice2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FindTheWebElements {

	public static void main(String[] args) throws Exception {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://www.saucedemo.com/v1/");
		
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		driver.findElement(By.id("user-name")).click();
		Thread.sleep(3000);
		driver.findElement(By.name("password")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("login-button")).click();
		driver.quit();
	}

}
