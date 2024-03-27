package seleniumPractice2;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandleTextBoxes {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		String url="https://github.com/login";
		driver.navigate().to(url);
		driver.manage().window().maximize();
		
		WebElement username = driver.findElement(By.id("login_field"));
		username.click();
		Thread.sleep(1000);
		if(username.isDisplayed()) {
		   if(username.isEnabled()){
				username.sendKeys("U.Vara prasad");
				String name = username.getAttribute("value");
				System.out.println(name);
				Thread.sleep(2000);
				username.clear();
				
			}
		   else {
			   System.out.println("Enabled is not working");
		   }
		}
		else {
			System.out.println("Displayed is not working");
		}
		
		driver.quit();
	}

}
