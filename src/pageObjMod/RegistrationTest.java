package pageObjMod;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class RegistrationTest {

	@Test
	public void verifyFlightReg() {

		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		
//		RegistrationPage rgPage = new RegistrationPage(driver);
		RegistrationPage2 rgPage = new RegistrationPage2(driver);

		driver.get("https://demo.guru99.com/test/newtours/");

		driver.manage().window().maximize();
		
		rgPage.clickRegLink();
		rgPage.setFirstName("yash");
		rgPage.setLastName("attarde");
		rgPage.setPhone("9899226588");
		rgPage.setEmail("yash@gmail.com");
		rgPage.setAddress("akurdi");
		rgPage.setCity("pune");
		rgPage.setState("maharashtra");
		rgPage.setPostCode("411088");
		rgPage.setCountry("INDIA");
		rgPage.setUserName("yashattarde");
		rgPage.setPassword("yash1234");
		rgPage.setConfirmPass("yash1234");
		rgPage.clickSubmitBut();
	    rgPage.getVerify();

	}

}
