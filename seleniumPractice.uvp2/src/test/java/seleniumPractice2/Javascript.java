package seleniumPractice2;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Javascript {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		
		
		JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
//		WebElement element = (WebElement) jsExecutor.executeScript("return document.getElementById('email')");
//		element.sendKeys("Jyo");
//		jsExecutor.executeScript("document.getElementsByName('email')[0].value='Name';");
//		Thread.sleep(3000);
//		jsExecutor.executeScript("document.getElementById('email').value='Id';");
//		Thread.sleep(3000);
//		jsExecutor.executeScript("document.getElementsByClassName('inputtext _55r1 _6luy')[0].value='ClassName';");
//		Thread.sleep(3000);
//		jsExecutor.executeScript("document.getElementsByTagName('input')[2].value='TagName';");
//		Thread.sleep(3000);
//		jsExecutor.executeScript("document.querySelector('#email').value='QuerySelector';");
//		Thread.sleep(3000);
		
//		jsExecutor.executeScript("document.getElementsByName('login')[0].click();");
		
//		jsExecutor.executeScript("document.getElementById('pass').style.border='5px purple solid'");
//		Thread.sleep(3000);
//		jsExecutor.executeAsyncScript("document.getElementById('pass').style.background='yellow';");
//		Thread.sleep(3000);
		
		jsExecutor.executeScript("document.getElementById('pass').setAttribute('style','border:5px red solid;background:yellow;')");
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
