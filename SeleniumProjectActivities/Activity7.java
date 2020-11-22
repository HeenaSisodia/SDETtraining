package seleniumProject;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Activity7 {
	
	    WebDriver driver;
	    
	    @BeforeMethod
	    public void beforeMethod() {
	        //Create a new instance of the Firefox driver
	        driver = new FirefoxDriver();
	        Reporter.log("Activity7 Test Started");

	        //Open browser
	        driver.get("https://alchemy.hguy.co/lms");
	    }

	    @Test
	    public void countCourses() {
	    	
	    	int count=0;
	        //Go to All Courses
	        driver.findElement(By.xpath("//li[@id='menu-item-1508']/a[1]")).click();
	    	List<WebElement> links = driver.findElements(By.xpath("//h3[@class='entry-title']"));
	                    
	    	for (WebElement link :links) {
	    		count++;
	    	}
	    	
	    	System.out.println("No. of courses are :" + count);
	    	Reporter.log("No. of courses are :" + count);
	    }

	    @AfterMethod
	    public void afterMethod() {
	        //Close the browser
	        driver.quit();
	        Reporter.log("Activity7 Test Completed");
	    }

	

}
