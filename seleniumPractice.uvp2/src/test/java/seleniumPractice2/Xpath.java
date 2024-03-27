package seleniumPractice2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Xpath {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		//relative xpath
		
//		driver.get("https://www.saucedemo.com/v1/");
//		driver.findElement(By.xpath("//input[@placeholder='Username']")).click();
		
		
		//absolute xpath
		
//		driver.get("https://www.w3schools.com/");
//		driver.findElement(By.xpath("/html/body/div[2]/div/div[3]")).click();
		
		//operators
		
//		driver.get("https://www.w3schools.com/");
//		driver.findElement(By.xpath("//a[@class='user-anonymous tnb-login-btn w3-bar-item w3-btn bar-item-hover w3-right ws-light-green ga-top ga-top-login']")).click();
		
//		driver.get("https://www.hyrtutorials.com/p/add-padding-to-containers.html");
//		driver.findElement(By.xpath("//input[@maxlength>10]")).click();		

//		driver.get("https://www.hyrtutorials.com/p/add-padding-to-containers.html");
//		List<WebElement> elements =driver.findElements(By.xpath("//input[@maxlength>=10]"));
//		for(WebElement element : elements) {
//			element.sendKeys("Hello");
//		}
//		
		//Conditons
		
//		driver.get("https://www.hyrtutorials.com/p/add-padding-to-containers.html");
//		driver.findElement(By.xpath("//input[@maxlength=10 and @ name='name']")).sendKeys("prasad");
//		
//		driver.get("https://www.hyrtutorials.com/p/add-padding-to-containers.html");
//		driver.findElement(By.xpath("//input[@maxlength=10 or @ name='name']")).sendKeys("Jyo");		
//
//		driver.get("https://www.hyrtutorials.com/p/add-padding-to-containers.html");
//		driver.findElement(By.xpath("//input[@maxlength!=16]")).sendKeys("Jyothirmaye");
		
		//Index
		
//		driver.get("https://www.hyrtutorials.com/p/add-padding-to-containers.html");
//		driver.findElement(By.xpath("(//table[@id='contactList']/tbody/tr/td)[5]"));
		
//		driver.get("https://www.hyrtutorials.com/p/add-padding-to-containers.html");
//		driver.findElement(By.xpath("(//table[@id='contactList']/tbody/tr/td)[18]"));
		
		//Functions
		
//		driver.get("https://www.hyrtutorials.com/p/add-padding-to-containers.html");
//		driver.findElements(By.xpath("//label[text()='Email']"));
//		driver.findElement(By.xpath("//a[contains(text(),'into account')]"));
//		driver.findElement(By.xpath("//a[starts-with(text(),'Sign in into')]"));
//		driver.findElement(By.xpath("//label[normalize-space(text()='First Name ')]"));
//		driver.findElement(By.xpath("(//table[@id='contactList']/tbody/tr)[last()]"));
//		driver.findElement(By.xpath("(//table[@id='contactList']/tbody/tr)[position()>2]"));
		
		//Axes
		
//		driver.get("https://www.hyrtutorials.com/p/add-padding-to-containers.html");
//		driver.findElement(By.xpath("//table[@id='contactList']/preceding-sibling::form"));
//		driver.findElement(By.xpath("//td[text()='Maria Anders']/following-sibling::td"));
//		driver.findElement(By.xpath("//div[@class='container']/parent::form/following-sibling::table"));
//		driver.findElement(By.xpath("//label[text()='First Name ']/parent::div"));
//		driver.findElement(By.xpath("//div[@class='container']/child::h1"));
//		driver.findElement(By.xpath("//td[text()='Maria Anders']/ancestor::tr"));
//		driver.findElement(By.xpath("//td[text()='Canada']/ancestor-or-self::tr"));
//		driver.findElement(By.xpath("//table[@id='contactList']/descendant::tr[3]"));
//		driver.findElement(By.xpath("//table[@id='contactList']/descendant-or-self::tr[5]"));
//		driver.findElement(By.xpath("//button[@class='btn']/following::div"));
//		driver.findElement(By.xpath("//button[@class='btn']/preceding::div[1]"));
//		
		
		
		
		
		
		
		
		
		}
		
	}


