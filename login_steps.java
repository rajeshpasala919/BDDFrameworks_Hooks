package stepDefinitions;

import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import Factory.DriverFactory;
import Login_TestPOM.LoginPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
public class Login_steps {
	WebDriver driver;
	LoginPage lp;

	@SuppressWarnings("unused")
	@Given("^User open browser$")
	public void user_open_browser() {

		DriverFactory driverfactory = new DriverFactory();

		driver = DriverFactory.InitializeDriver("firefox");

		driver.manage().window().maximize();
	}

	@When("^User opens URL \"([^\"]*)\"$")
	public void user_opens_url_something(String URL) {

		driver.get("https://demo.opencart.com/admin/");
	}

	@When("User enters username as {string} and Password as {string} Click on login")
	public void user_enters_username_as_and_password_as_click_on_login(String string, String string2)
			throws InterruptedException {
		lp = new LoginPage(driver);

		lp.enterUsername(string);
		lp.enterPassword(string2);

		lp.clickLogin();
		Thread.sleep(2000);
		// Write code here that turns the phrase above into concrete actions
	}
	    @And("^ User enters username as \"([^\"]*)\" and Password as \"([^\"]*)\" Click on login$")
	    public void user_enters_username_as_something_and_password_as_something_click_on_login(String username, String password) throws InterruptedException  {
	    	lp = new LoginPage(driver);
	    	
	    	lp.enterUsername(username);
	    	lp.enterPassword(password);
	    	
	    	lp.clickLogin();
	    	Thread.sleep(2000);
	    }
	    	
////	    	driver.findElement(By.xpath("//*[@id=\"input-username\"]")).sendKeys("demo");
////	    	driver.findElement(By.xpath("//*[@id=\"input-password\"]")).sendKeys("demo");
////	    	
////	    	driver.findElement(By.xpath("//*[@id=\"form-login\"]/div[3]/button")).click();
////	    	
////	    	Thread.sleep(5000);
////	    	
////	    }

	@Then("^User click on Log out link$")
	public void user_click_on_log_out_link() throws InterruptedException {

	    	//driver.findElement(By.xpath("//*[@id=\\\"header-logout\\\"]/a/span")).click();

		lp.checklogOutIsDisplayed();
		Thread.sleep(2000);
	}

	@And("^close browser$")
	public void close_browser() throws Throwable {

		driver.close();
	}

}


