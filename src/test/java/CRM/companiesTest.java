package CRM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class companiesTest extends Logintest {
	@Test(priority=1)
	public void fy() throws InterruptedException {
		driver.switchTo().frame("mainpanel");
		driver.findElement(By.xpath("//a[@title='Companies']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//td[text()='U']//following::td[2]")).click();
	    Thread.sleep(2000);
		WebElement cc=driver.findElement(By.xpath("//select[@name='cs_status']"));
		cc.click();
		Select tej=new Select(cc);
		tej.selectByIndex(2);
		Thread.sleep(2000);
		//driver.findElement(By.xpath("//select[@name='cs_category']")).click();
		//tej.selectByValue("Client");
		driver.findElement(By.xpath("//input[@name='cs_name']")).sendKeys("wexos");
		Thread.sleep(3000);
		driver.findElement(By.xpath(("(//input[@type='submit'])[1]"))).click();
		
		
	}

}
