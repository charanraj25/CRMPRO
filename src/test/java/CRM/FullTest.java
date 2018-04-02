package CRM;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class FullTest extends Logintest{ 
	 
	@Test(priority=4)
	
	public void py() throws InterruptedException {
		driver.switchTo().frame("mainpanel");
		Actions te=new Actions(driver);
		WebElement tt=driver.findElement(By.xpath("//a[text()='Companies']"));
		 te.moveToElement(tt).build().perform();
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("(//a[text()='Full Search Form'])[1]")).click();
		 Thread.sleep(1000);
		 driver.findElement(By.xpath("//input[@id='cs_name']")).sendKeys("wexos");
		 
	driver.findElement(By.xpath("(//input[@value='?'])[2]")).click();
	Set<String> toy=driver.getWindowHandles();
	Iterator<String> roy=toy.iterator();
	String parentId=roy.next();
	String childId=roy.next();
	driver.switchTo().window(childId);
	Thread.sleep(1000);
	driver.close();
	Thread.sleep(1000);
	driver.findElement(By.xpath(("(//input[@value='Search Companies'])[2]"))).click();
	
	
				 
		 
		
	}

}
