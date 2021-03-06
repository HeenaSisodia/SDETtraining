package cucumberActivitiesTest;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src\\test\\java\\cucumberActivitiesTest\\Feature",
	    glue = {"cucumberActivitiesStepDefinitions"},
	    tags = "@activity",
	    strict = true,
	    plugin = {"html: test-reports/cucumber"},
	    monochrome = true
)

public class ActivitiesRunner {
    //empty
}