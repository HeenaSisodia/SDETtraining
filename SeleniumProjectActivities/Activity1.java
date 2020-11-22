package seleniumProject;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Activity1 {
	
	    static WebDriver driver;
	    
	    @BeforeMethod
	    public void beforeMethod() {
	        //Create a new instance of the Firefox driver
	        driver = new FirefoxDriver();
	        Reporter.log("Activity1 Test Started");
	        //Open browser
	        driver.get("https://alchemy.hguy.co/lms");
	    }

	    @Test
	    public void exampleTestCase() throws Exception {
	        // Check the title of the page
	        String title = driver.getTitle();
	            
	        //Print the title of the page
	        System.out.println("Page title is: " + title);
	            
	            //Assertion for page title
	        Assert.assertEquals("Alchemy LMS – An LMS Application", title);
	            //take screenshot
	        takeScreenshot();
	        
	    }

	    @AfterMethod
	    public void afterMethod() {
	        //Close the browser
	        driver.quit();
	        Reporter.log("Activity1 Test Completed");
	    }
	    public static void takeScreenshot() throws Exception {
	        String timeStamp;
	        File screenShotName;

	        //Take screenshot
	        File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);

	        //The below method will save the screen shot in with name "yyyyMMdd_HHmmss.jpg"
	        timeStamp = new SimpleDateFormat("yyyyMMdd_HHmmss").format(Calendar.getInstance().getTime());

	        //This specifies the location the screenshot will be saved
	        screenShotName = new File("src/test/resources/"+timeStamp+".jpg");
	        
	        //This will copy the screenshot to the file created
	        FileUtils.copyFile(scrFile, screenShotName);

	        //Set filepath for image
	        String filePath = "../"+screenShotName.toString();
	        //Set image HTML in the report
	        String path = "<img src='"+ filePath +"'/>";
	        //Show image in report
	        Reporter.log(path);
	    }
	

}
