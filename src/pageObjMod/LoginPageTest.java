package pageObjMod;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class LoginPageTest {
	
  @Test
  public void logCheck() {
	  
	  System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
	  WebDriver driver = new ChromeDriver();
	  driver.get("https://demo.guru99.com/test/newtours/");
	  driver.manage().window().maximize();
	  
	  LoginPage lPage = new LoginPage(driver);
	  
	  driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
	 
//	  lPage.loginUserName("yash");
//	  lPage.loginUserPass("yash1234");
//	  lPage.loginSubmit();
	  
	  lPage.login("yash", "yash1234");
	  
  }
  
}
