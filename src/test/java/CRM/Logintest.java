package CRM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Logintest {
	WebDriver driver;
	@Test
	public void f() throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\Desktop\\chromedriver.exe");
	driver =new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.freecrm.com/index.html?e=2");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//input[@name='username']")).sendKeys("tejcharan");
	driver.findElement(By.xpath("//input[@name='password']")).sendKeys("wexos123");	
	driver.findElement(By.xpath("//input[@type='submit']")).click();
	
		
	}
	
	

}
