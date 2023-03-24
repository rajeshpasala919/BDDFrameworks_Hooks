package stepDefinitions;

import org.openqa.selenium.WebDriver;

import Factory.DriverFactory;
import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class BDD_Hooks{
	
	public  WebDriver driver;
	
	@SuppressWarnings("deprecation")
	@Before
	public void doSomethingBefore(Scenario scenario) {
        System.out.println("BEFORE THREAD ID---->" + Thread.currentThread().getId() + "," + "SCENARIO NAME--->" + scenario.getName());

        String nameofbrowser = System.getProperty("browser", "firefox");
        driver = DriverFactory.InitializeDriver(nameofbrowser);
    }
	
	@AfterStep
//	public void addScreenshot(Scenario scenario) {
//        if (scenario.isFailed()) {
//            final byte[] failedscreenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
//            scenario.attach(failedscreenshot, "image/png", "image");
//        }
//	}
	public void takeScreenshort() {
		System.out.println("Capture Screenshot..");
	}
        
	@After
//	public void doSomethingAfter(Scenario scenario) {
//        System.out.println("AFTER THREAD ID--->" + Thread.currentThread().getId() + "," + "SCENARIO NAME--->" + scenario.getName());
//        //driver.quit();
	public void tearDown() {
		
		driver.quit();

    }
         
	
	}




	

