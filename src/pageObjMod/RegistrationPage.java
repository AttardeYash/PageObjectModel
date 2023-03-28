package pageObjMod;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class RegistrationPage {               //Page Object Model Second Method

	WebDriver driver;
	
	public RegistrationPage(WebDriver d) {      //constructor
		driver=d;
	}
	
	By RegLink = By.linkText("REGISTER");
	By firstName = By.name("firstName");
	By lastName = By.name("lastName");
	By phone = By.name("phone");
	By email = By.name("userName");
	By address = By.name("address1");
	By city = By.name("city");
	By state = By.name("state");
	By postCode = By.name("postalCode");
	By country = By.name("country");
	By userName = By.name("email");
	By pass = By.name("password");
	By confirmpass = By.name("confirmPassword");
	By submitBtn = By.name("submit");
	By actResult = By.xpath("/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[3]/td/p[2]/font");
	
	public void clickRegLink() {
		driver.findElement(RegLink).click();
	}
	
	public void setFirstName(String fname) {
		driver.findElement(firstName).sendKeys(fname);
	}
	
	public void setLastName(String lname) {
		driver.findElement(lastName).sendKeys(lname);
	}
	
	public void setPhone(String ph) {
		driver.findElement(phone).sendKeys(ph);
	}
	
	public void setEmail(String mail) {
		driver.findElement(email).sendKeys(mail);
	}
	
	public void setAddress(String addrs) {
		driver.findElement(address).sendKeys(addrs);    
		
	}
	
	public void setCity(String cit) {
		driver.findElement(city).sendKeys(cit);
	}
	
	public void setState(String st) {
		driver.findElement(state).sendKeys(st);
	}
	
	public void setPostCode(String pcode) {
		driver.findElement(postCode).sendKeys(pcode);
	}
	
	public void setCountry(String cntry) {             
		WebElement con = driver.findElement(country);             //Dropdown Handling
		Select drpdown = new Select(con);
		drpdown.selectByVisibleText(cntry);
	}
	
	public void setUserName(String uname) {
		driver.findElement(userName).sendKeys(uname);
	}
	
	public void setPassword(String passwrd) {
		driver.findElement(pass).sendKeys(passwrd);
	}
	
	public void setConfirmPass(String passwrd) {
		driver.findElement(confirmpass).sendKeys(passwrd);
	}
	
	public void clickSubmitBut() {
		driver.findElement(submitBtn).click();
	}
	
	public void getVerify() {
		String text = driver.findElement(actResult).getText();
		
//		System.out.println(text);
		
		String expResult = "Thank you for registering. You may now sign-in using the user name and password you've just entered."; 
        
		if(text.equals(expResult)) {
			System.out.println("REGISTRATION DONE SUCCESSFULLY...");
		}else {
			System.out.println("REGISTRATION FAILED...");
		}
	}
	
	
}
