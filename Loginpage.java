package Login_TestPOM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
	protected WebDriver driver;

	private By txt_Username = By.xpath("//form[@id='form-login']/descendant::input[@id='input-username']");

	private By txt_password = By.xpath("//form[@id='form-login']/descendant::input[@id='input-password']");

	private By btn_login = By.xpath("//button[@type='submit']");

	private By btn_logout = By.xpath("//*[@id=\"header-logout\"]/a/span");

	public LoginPage(WebDriver driver) {

		this.driver = driver;
		String title=driver.getTitle();

		if (!title.equals("Administration")) {

			throw new IllegalStateException("This Page not a Login page.The Current page is" + driver.getCurrentUrl());
		}

	}

	public void enterUsername(String username) {
		driver.findElement(txt_Username).sendKeys(username);
	}

	public void enterPassword(String password) {
		driver.findElement(txt_password).sendKeys(password);
	}

	public void clickLogin() {
		driver.findElement(btn_login).click();
	}

	public void checklogOutIsDisplayed() {

		driver.findElement(btn_logout).isDisplayed();
	}

	public void loginValidUser(String username, String password) {

		driver.findElement(txt_Username	).sendKeys(username);
		driver.findElement(txt_password).sendKeys(password);
		driver.findElement(btn_login).click();
	}

	public By getTxt_Username() {
		return txt_Username;
	}

	public void setTxt_Usernme(By txt_Username) {
		this.txt_Username = txt_Username;
	}

}
