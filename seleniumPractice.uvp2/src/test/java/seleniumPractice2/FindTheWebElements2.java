package seleniumPractice2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FindTheWebElements2 {

	public static void main(String[] args) throws Exception {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		String url = "https://github.com/login";
		driver.navigate().to(url);
		Thread.sleep(3000);
		
		driver.findElement(By.id("login_field")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("password")).click();
		Thread.sleep(1000);
		driver.findElement(By.name("commit")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("forgot-password")).click();
		WebElement heading = driver.findElement(By.tagName("h1"));
		if(heading.isDisplayed()) {
			String head = heading.getText();
			System.out.println("This is the displayed heading in our web page--------"+head);
		}
		else {
			System.out.println("heading is not displayed");
		}
	}

}
