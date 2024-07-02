package TestRunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = "src/test/resources/Heroku/Login.feature",glue = "Steps")
public class LoginR extends AbstractTestNGCucumberTests {

}
