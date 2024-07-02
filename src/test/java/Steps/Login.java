package Steps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Login {
	//You can implement missing steps with the snippets below:
		WebDriver driver;
		@Given("open the browser")
		public void open_the_browser() throws InterruptedException {
			Thread.sleep(2000);

		    // Write code here that turns the phrase above into concrete actions
		    driver=new ChromeDriver();
		    
		}

		@Given("enter url")
		public void enter_url() throws InterruptedException {
		    // Write code here that turns the phrase above into concrete actions
		    driver.get("https://the-internet.herokuapp.com/login");
		    Thread.sleep(2000);
		}

		@When("enter username")
		public void enter_username() throws InterruptedException {
		    // Write code here that turns the phrase above into concrete actions
		    driver.findElement(By.id("username")).sendKeys("tomsmith");
		    Thread.sleep(2000);
		}

		@When("enter password")
		public void enter_password() throws InterruptedException {
		    // Write code here that turns the phrase above into concrete actions
		    driver.findElement(By.id("password")).sendKeys("SuperSecretPassword!");
		    Thread.sleep(2000);
		}

		@Then("click on login")
		public void click_on_login() throws InterruptedException {
			Thread.sleep(2000);
		    // Write code here that turns the phrase above into concrete actions
		    driver.findElement(By.cssSelector("button[type=\"submit\"]")).click();
		}



}
