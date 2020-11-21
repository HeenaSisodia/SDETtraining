package SeleniumTraining;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class Activity13_1 {
	
	public static void main(String[] args) {
		
		WebDriver driver = null;
	
		JavascriptExecutor js = (JavascriptExecutor) driver;

	//Domain name
	js.executeScript("return document.domain;").toString();

	//Page URL
	js.executeScript("return document.URL;").toString();

	//Page title
	js.executeScript("return document.title;").toString();

}
}
