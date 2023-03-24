package PageObject;

	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.support.FindBy;
	import org.openqa.selenium.support.PageFactory;

	public class Login_TestPageObject {
		public WebDriver ldriver;
		public void LoginPage(WebDriver rdriver) {
			ldriver = rdriver;
			PageFactory.initElements(rdriver, this);
		}
		
		@FindBy(xpath= "//input[@id='input-username']")
		
		WebElement txt_Username ;
		
		@FindBy(xpath="//input[@id='input-password']")
	
		WebElement txt_Password;
		
		@FindBy(xpath = "//button[@type='submit']")
		
		WebElement btnLogin;
		
		
		@FindBy(xpath = "//span[@class='d-none d-md-inline']")
	
		WebElement lnkLogout;
		
		public void setUserName(String username) {
			txt_Username.clear();
			txt_Username.sendKeys("demo");
		}
		
		public void setPassword(String password ) {
			txt_Password.clear();
			txt_Password.sendKeys("demo");
		}
		
		public void clcickLogin() {
			btnLogin.click();
		}
		
		public void clickLogout() {
			lnkLogout.click();
		}
		

	}
