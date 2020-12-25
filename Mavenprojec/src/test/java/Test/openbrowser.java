package Test;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import Generic.Base;

public class openbrowser extends Base
{
    @Test
    public void login()
    {
    	driver.findElement(By.id("username")).sendKeys("dpotluri");
    	driver.findElement(By.id("password")).sendKeys("Cigniti@1");
    	driver.findElement(By.xpath("//button[text()='Login!']")).click();
    	
    	
    }
}
