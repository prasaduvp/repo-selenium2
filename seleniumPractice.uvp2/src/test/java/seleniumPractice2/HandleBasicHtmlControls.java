package seleniumPractice2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandleBasicHtmlControls {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		String url="https://www.hyrtutorials.com/p/basic-controls.html";
		driver.navigate().to(url);
		driver.manage().window().maximize();

		WebElement radioButton = driver.findElement(By.id("malerb"));
		//		radioButton.click();
		if(radioButton.isSelected()) {
			System.out.println("Already selected");
		}
		else {
			System.out.println("Deselected");
		}

		driver.findElement(By.name("language")).click();
		Thread.sleep(3000);

		WebElement hindichk = driver.findElement(By.xpath("//*[@id=\"hindichbx\"]"));
		hindichk.click();
		Thread.sleep(3000);
		if(hindichk.isSelected()) {
			hindichk.click();
			Thread.sleep(3000);
		}else {
			System.out.println("Checkbox is not working");
		}

		driver.findElement(By.id("registerbtn")).click();

		System.out.println(driver.findElement(By.id("msg")).getText());
		driver.findElement(By.id("navigateHome")).click();


	}

}
