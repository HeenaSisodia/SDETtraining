package stepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CRM {
	WebDriver driver = new FirefoxDriver();
    WebDriverWait wait ;
    
    
    @Given("^User is on CRM page$")
    public void CRMPage() {
        //Setup instances
        //driver = new FirefoxDriver();
        wait = new WebDriverWait(driver, 10);
        
        //Open browser
        driver.get("https://alchemy.hguy.co/crm/index.php?action=Login&module=Users");
    }
    
    @When("^User enters \"(.*)\" and \"(.*)\"$")
    public void user_enters_and(String username, String password) throws Throwable {
        //Enter username from Feature file
        driver.findElement(By.id("user_name")).sendKeys(username);
        //Enter password from Feature file
        driver.findElement(By.id("username_password")).sendKeys(password);
        //Click Login
        driver.findElement(By.xpath("bigbutton")).click();
    }
    
    @Then("^Count number of dashlets$")
    public void NoOfDashlets() {
        
       
    }
    @And("^Print number and title of each dashlet$")
    public void Print() {
        
       
    }
    @Then("^Create leads using details$")
    public void CreateLeads() {
       
    	driver.findElement(By.xpath("//body/div[@id='ajaxHeader']/nav[1]/div[1]/div[3]/ul[1]/li[1]/a[1]")).click();
    	driver.findElement(By.xpath("//body/div[@id='ajaxHeader']/nav[1]/div[1]/div[3]/ul[1]/li[1]/ul[1]/li[4]/a[1]")).click();
    	driver.findElement(By.xpath("//input[@id='last_name']")).sendKeys("Sharma");
    	driver.findElement(By.xpath("//tbody/tr[1]/td[1]/div[1]/input[1]")).click();
       
    }
    @And("^Verify Results$")
    public void VerifyResults() {
        driver.findElement(By.xpath("//body/div[@id='bootstrap-container']/div[@id='content']/div[@id='pagecontent']/div[1]/h2[1]")).isDisplayed();
       
    }
    
    @Then("^Schedule a meeting for members$")
    public void ScheduleMeeting() {
       
    	driver.findElement(By.xpath("//body/div[@id='ajaxHeader']/nav[1]/div[1]/div[3]/ul[1]/li[1]/a[1]")).click();
    	driver.findElement(By.xpath("//body/div[@id='ajaxHeader']/nav[1]/div[1]/div[1]/ul[1]/li[13]/a[1]")).click();
    	driver.findElement(By.xpath("//body/div[@id='ajaxHeader']/nav[1]/div[1]/div[1]/div[1]/div[1]/span[1]/a[1]/span[1]")).click();
    	driver.findElement(By.xpath("//body/div[@id='ajaxHeader']/nav[1]/div[1]/div[1]/div[1]/div[1]/ul[1]/li[1]/ul[1]/li[1]/a[1]")).click();
    	driver.findElement(By.xpath("//input[@id='name']")).sendKeys("Test Meeting");
    	
       
    }
    
    @And("^Search members \"(.*)\" \"(.*)\" and create meeting$")
    public void SearchMembers(String fname, String lname) {
       
    	driver.findElement(By.xpath("//input[@id='search_first_name']")).sendKeys(fname);
    	driver.findElement(By.xpath("//input[@id='search_last_name']")).sendKeys(lname);
    	driver.findElement(By.xpath("//input[@id='invitees_search']")).click();
    	driver.findElement(By.xpath("//input[@id='name']")).sendKeys("Test Meeting");
    	
       
    }
    @And("^Verify creation of meetings$")
    public void VerifyMeeting() {
    	
    	driver.findElement(By.xpath("//body/div[@id='bootstrap-container']/div[@id='content']/form[@id='EditView']/div[4]/input[3]")).click();
        driver.findElement(By.xpath("//body/div[@id='bootstrap-container']/div[@id='content']/div[@id='pagecontent']/div[1]/h2[1]")).isDisplayed();
       
    }
    
    @And("^Create Products with details \"(.*)\" \"(.*)\"$")
    public void CreateProduct(String name, String price) {
    	
    	driver.findElement(By.xpath("//body/div[@id='ajaxHeader']/nav[1]/div[1]/div[1]/button[1]/span[2]")).click();
    	driver.findElement(By.xpath("//body/div[@id='ajaxHeader']/nav[1]/div[1]/div[1]/ul[1]/li[25]/a[1]")).click();
    	driver.findElement(By.xpath("//input[@id='name']")).sendKeys(name);
    	driver.findElement(By.xpath("//input[@id='price']")).sendKeys(price);
    	driver.findElement(By.xpath("//body/div[@id='bootstrap-container']/div[@id='content']/div[@id='pagecontent']/form[@id='EditView']/div[2]/input[1]")).click();
    	
    	
       
    }
    @Then("^Verify Products$")
    public void VerifyProduct() {
    	
        driver.findElement(By.xpath("//body/div[@id='bootstrap-container']/div[@id='content']/div[@id='pagecontent']/div[1]/h2[1]")).isDisplayed();
       
    }
    @And("^Close the Browser$")
    public void closeBrowser() {
        //Close browser
        driver.close();
    }

}
