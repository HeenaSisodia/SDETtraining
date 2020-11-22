package seleniumProject;
import java.util.List;
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

public class Activity9 {
	
	    WebDriver driver;
	    
	    @BeforeMethod
	    public void beforeMethod() {
	        //Create a new instance of the Firefox driver
	        driver = new FirefoxDriver();
	        Reporter.log("Activity9 Test Started");

	        //Open browser
	        driver.get("https://alchemy.hguy.co/lms");
	    }

	    @Test
	    public void CompleteLesson() {
	    	
	    	//Go to All Courses
	        driver.findElement(By.xpath("//li[@id='menu-item-1508']/a[1]")).click();
	        driver.findElement(By.xpath("//article[@id='post-71']/div[2]/p[2]/a[1]")).click();
	        String title = driver.getTitle();
	        Assert.assertEquals("Email Marketing Strategies – Alchemy LMS", title);
	        
	    }

	    @AfterMethod
	    public void afterMethod() {
	        //Close the browser
	        driver.quit();
	        Reporter.log("Activity9 Test Completed");
	    }

	

}
