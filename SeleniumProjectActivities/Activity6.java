package seleniumProject;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Activity6 {
	
	    WebDriver driver;
	    
	    @BeforeMethod
	    public void beforeMethod() {
	        //Create a new instance of the Firefox driver
	        driver = new FirefoxDriver();
	        Reporter.log("Activity6 Test Started");

	        
	        
	        //Open browser
	        driver.get("https://alchemy.hguy.co/lms");
	    }

	    @Test
	    public void Login() {
	        
	        driver.findElement(By.xpath("//li[@id='menu-item-1507']/a[1]")).click();
	    	String title = driver.getTitle();	        
	        System.out.println("Title is " + title);
	      //Assertion
	        Assert.assertEquals("My Account – Alchemy LMS", title);
	        
	        //login using credentials
	        driver.findElement(By.linkText("Login")).click();;
	        
	        driver.findElement(By.xpath("//input[@id='user_login']")).sendKeys("root");
	        driver.findElement(By.xpath("//input[@id='user_pass']")).sendKeys("pa$$w0rd");
	        driver.findElement(By.xpath("//input[@id='wp-submit']")).click();
	      
	        //verify logged in
	        String title2 = driver.getTitle();
	        System.out.println("Title after login is " + title2);
	      //Assertion
	        Assert.assertEquals("My Account – Alchemy LMS", title2);
	            
	        Reporter.log("Title after login is " + title2);
	                    
	        
	    }

	    @AfterMethod
	    public void afterMethod() {
	        //Close the browser
	        driver.quit();
	        Reporter.log("Activity6 Test Completed");
	    }

	

}
