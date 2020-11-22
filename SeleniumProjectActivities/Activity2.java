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

public class Activity2 {
	
	    WebDriver driver;
	    
	    @BeforeMethod
	    public void beforeMethod() {
	        //Create a new instance of the Firefox driver
	        driver = new FirefoxDriver();
	        
	        Reporter.log("Activity2 Test Started");

	        
	        //Open browser
	        driver.get("https://alchemy.hguy.co/lms");
	        
	    }

	    @Test
	    public void exampleTestCase() {
	        
	        WebElement heading = driver.findElement(By.xpath("//h1[contains(text(),'Learn from Industry Experts')]"));
	      
	            
	        
	        System.out.println("Page heading is: " + heading.getText());
	        Reporter.log("Page heading is: " + heading.getText());
	           
	        Assert.assertEquals("Learn from Industry Experts", heading.getText());
	                    
	        
	    }

	    @AfterMethod
	    public void afterMethod() {
	        //Close the browser
	        driver.quit();
	        Reporter.log("Activity1 Test Completed");
	    }

	

}
