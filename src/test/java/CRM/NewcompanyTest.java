package CRM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class NewcompanyTest extends Logintest {
    @Test(priority=2)
    public void sy() throws InterruptedException {
    	driver.switchTo().frame("mainpanel");
    	Actions rt=new Actions(driver);
    	WebElement re=driver.findElement(By.xpath("//a[text()='Companies']"));
        rt.moveToElement(re).build().perform();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//a[text()='New Company']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id='company_name']")).sendKeys("wexos");
        driver.findElement(By.xpath("//*[@id='phone']")).sendKeys("123456987");
        Thread.sleep(3000);
        driver.findElement(By.xpath(("(//input[@value='Save'])[1]"))).click();
        
    
    

    
    	
    	
    }
}
