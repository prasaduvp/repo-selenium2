package seleniumPractice2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Calendars {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		int day = 25;
		driver.get("https://www.hyrtutorials.com/p/calendar-practice.html");
//		driver.findElement(By.id("first_date_picker")).click();
//		driver.findElement(By.xpath("//table[@class='ui-datepicker-calendar']/descendant::a[text()="+day+"]")).click();
		
		driver.findElement(By.id("second_date_picker")).click();
		driver.findElement(By.xpath("//table[@class='ui-datepicker-calendar']/descendant::td[not(contains(@class,'ui-datepicker-other-month'))]/a[text()=17]")).click();
	}

}
