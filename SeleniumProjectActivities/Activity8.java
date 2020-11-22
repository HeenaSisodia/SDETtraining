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

public class Activity8 {
	
	    WebDriver driver;
	    
	    @BeforeMethod
	    public void beforeMethod() {
	        //Create a new instance of the Firefox driver
	        driver = new FirefoxDriver();
	        Reporter.log("Activity8 Test Started");
	        
	        //Open browser
	        driver.get("https://alchemy.hguy.co/lms");
	    }

	    @Test
	    public void contactPage() {
	    	
	    	//Go to contact page
	    	driver.findElement(By.xpath("//a[contains(text(),'Contact')]")).click();
	    	
	    	//fill form
	    	driver.findElement(By.xpath("//input[@id='wpforms-8-field_0']")).sendKeys("test");
	    	driver.findElement(By.xpath("//input[@id='wpforms-8-field_1']")).sendKeys("test@test.com");
	    	driver.findElement(By.xpath("//input[@id='wpforms-8-field_3']")).sendKeys("test");
	    	driver.findElement(By.xpath("//textarea[@id='wpforms-8-field_2']")).sendKeys("test");
	    	driver.findElement(By.xpath("//button[@id='wpforms-submit-8']")).click();
	    	
	    	driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	    
	    	//print message
	    	System.out.println("Message after submit:" + driver.findElement(By.xpath("//body/div[@id='page']/div[@id='content']/div[1]/div[1]/main[1]/article[1]/div[1]/section[4]/div[2]/div[2]/div[2]/div[2]/p[1]")).getText());
	    	Reporter.log("Message after submit:" + driver.findElement(By.xpath("//body/div[@id='page']/div[@id='content']/div[1]/div[1]/main[1]/article[1]/div[1]/section[4]/div[2]/div[2]/div[2]/div[2]/p[1]")).getText());
	    }

	    @AfterMethod
	    public void afterMethod() {
	        //Close the browser
	        driver.quit();
	        Reporter.log("Activity8 Test Completed");
	    }

	

}
