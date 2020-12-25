package Generic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Base 
{
	public static WebDriver driver;
	static 
	{
		System.setProperty("webdriver.chrome.driver","./Driver/chromedriver.exe");
	}
	
    @BeforeMethod
    public void openBrowser()
    {
    	driver= new ChromeDriver();
    	driver.manage().window().maximize();
    	driver.get("https://dy-ts5-qa.egatesoln.com/#/login");
    }
    
    @AfterMethod
    public void closeBrowser()
    {
    	driver.close();
    }
}
