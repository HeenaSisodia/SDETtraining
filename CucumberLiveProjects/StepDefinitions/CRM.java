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

}
