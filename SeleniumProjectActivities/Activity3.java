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

public class Activity3 {
	
	    WebDriver driver;
	    
	    @BeforeMethod
	    public void beforeMethod() {
	        //Create a new instance of the Firefox driver
	        driver = new FirefoxDriver();
	        Reporter.log("Activity3 Test Started");
	        
	        //Open browser
	        driver.get("https://alchemy.hguy.co/lms");
	    }

	    @Test
	    public void exampleTestCase() {
	        
	        WebElement text = driver.findElement(By.xpath("//h3[contains(text(),'Actionable Training')]"));

	        
	        System.out.println("First info box text is: " + text.getText());
	            
	            //Assertion
	        Assert.assertEquals("Actionable Training", text.getText());
	        Reporter.log("First info box text is: " + text.getText());    
	        
	    }

	    @AfterMethod
	    public void afterMethod() {
	        //Close the browser
	        driver.quit();
	        Reporter.log("Activity3 Test Completed");
	    }

	

}
