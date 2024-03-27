package seleniumPractice2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Mouse {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		Actions actions = new Actions(driver);
		driver.manage().window().maximize();
		
//		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
//		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");
//		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("admin123");
//		driver.findElement(By.className("oxd-button oxd-button--medium oxd-button--main orangehrm-login-button")).click();
//		
		driver.get("https://www.hyrtutorials.com/p/add-padding-to-containers.html");
		driver.findElement(By.xpath("//input[@maxlength=10]")).sendKeys("Hyr");
		
//		actions.moveToElement(driver.findElement(By.xpath("//span[@class='oxd-text oxd-text--span oxd-main-menu-item--name']")));
//		actions.moveToElement(driver.findElement(By.xpath("//span[text()='Qualifications ']")));
//		actions.moveToElement(driver.findElement(By.xpath("//a[text()='Languages']")));
//		actions.moveToElement(driver.findElement(By.className("oxd-icon bi-pencil-fill"))).click();
//		actions.moveToElement(driver.findElement(By.className("oxd-input oxd-input--active")));
//		actions.moveToElement(driver.findElement(By.className("oxd-input oxd-input--active"))).sendKeys("HYR");
//		actions.moveToElement(driver.findElement(By.className("oxd-button oxd-button--medium oxd-button--secondary orangehrm-left-space"))).click().perform();
	}

}
