package CRM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Combinedformtest extends Logintest{
	

	@Test(priority=3)
	public void gy() throws InterruptedException
	{
		driver.switchTo().frame("mainpanel");
		Actions te=new Actions(driver);
		WebElement tt=driver.findElement(By.xpath("//a[text()='Companies']"));
		 te.moveToElement(tt).build().perform();
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("//a[text()='Combined Form']")).click();
		 Thread.sleep(1000);
		 driver.findElement(By.xpath("//input[@name='company_name']")).sendKeys("wexos");
		 Thread.sleep(3000);
		 driver.findElement(By.xpath("//input[@id='first_name']")).sendKeys("charan");
		 driver.findElement(By.xpath("//input[@id='surname']")).sendKeys("teja");
		 Thread.sleep(1000);
		 driver.findElement(By.xpath(("(//input[@value='Save'])[2]"))).click();
		 
		 
		

}
}