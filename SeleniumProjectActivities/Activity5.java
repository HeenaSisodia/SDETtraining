package seleniumProject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Activity5 {
	
	    WebDriver driver;
	    
	    @BeforeMethod
	    public void beforeMethod() {
	        //Create a new instance of the Firefox driver
	        driver = new FirefoxDriver();
	        Reporter.log("Activity5 Test Started");
	        
	        //Open browser
	        driver.get("https://alchemy.hguy.co/lms");
	    }

	    @Test
	    public void exampleTestCase() {
	        
	        driver.findElement(By.xpath("//li[@id='menu-item-1507']/a[1]")).click();
	    	String title = driver.getTitle();	        
	        System.out.println("Title is " + title);
	            
	            //Assertion
	        Assert.assertEquals("My Account – Alchemy LMS", title);
	        Reporter.log("Title is " + title);          
	        
	    }

	    @AfterMethod
	    public void afterMethod() {
	        //Close the browser
	        driver.quit();
	        Reporter.log("Activity5 Test Completed");
	    }

	

}
