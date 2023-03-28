package pageObjMod;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

	WebDriver driver;
	
	public LoginPage(WebDriver d) {         //constructor
		this.driver = d;
	}
	
	By usName = By.xpath("//*[@name='userName']");
	By pass = By.xpath("//*[@name='password']");
	By subBtn = By.xpath("//*[@name='submit']");
	   
	             // FIRST METHOD
//	public void loginUserName(String user) {
//		driver.findElement(usName).sendKeys(user);
//	}
//	
//	public void loginUserPass(String password) {
//		driver.findElement(pass).sendKeys(password);
//	}
//	
//	public void loginSubmit() {
//		driver.findElement(subBtn).click();
//	}
	
	
	            // SECOND METHOD
	public void login(String user, String password) {
		driver.findElement(usName).sendKeys(user);
		driver.findElement(pass).sendKeys(password);
		driver.findElement(subBtn).click();
	}
	
}
