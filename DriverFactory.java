package Factory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DriverFactory {
	public static WebDriver driver;

	public static WebDriver InitializeDriver(String browser) {
		if (browser == "firefox") {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		} else if (browser == "chrome") {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		}
		return driver;

	}


}
