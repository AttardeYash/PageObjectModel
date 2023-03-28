package pageObjMod;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class RegistrationPage2 {            //Page Object Model Second Method

	WebDriver driver;
	
	@FindBy(how = How.LINK_TEXT, using = "REGISTER")
	WebElement RegLink;
	
//	@FindBy(how = How.NAME, using = "firstName")       //Syntax 1
//	WebElement firstName;
	
	@FindBy(name = "firstName")       //Syntax 1
	WebElement firstName;
	
	@FindBy(name = "lastName")       
	WebElement lastName;
	
	@FindBy(name = "phone")      
	WebElement phone;
	
	@FindBy(name = "userName")       
	WebElement email;
	
	@FindBy(name = "address1")       
	WebElement address;
	
	@FindBy(name = "city")       
	WebElement city;
	
	@FindBy(name = "state")       
	WebElement state;
	
	@FindBy(name = "postalCode")      
	WebElement postCode;
	
	@FindBy(name = "country")      
	WebElement country;
	
	@FindBy(name = "email")       
	WebElement userName;
	
	@FindBy(name = "password")       
	WebElement pass;
	
	@FindBy(name = "confirmPassword")       
	WebElement confirmpass;
	
	@FindBy(name = "submit")       
	WebElement submitBtn;
	
	@FindBy(xpath = "/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[3]/td/p[2]/font")       
	WebElement actResult;
	

	public RegistrationPage2(WebDriver d) {    //constructor
		driver = d;
		PageFactory.initElements(d, this);     //additional method
	}
	
	public void clickRegLink() {
		RegLink.click();
	}
	
	public void setFirstName(String fname) {
		firstName.sendKeys(fname);
	}
	
	public void setLastName(String lname) {
		lastName.sendKeys(lname);
	}
	
	public void setPhone(String ph) {
		phone.sendKeys(ph);
	}
	
	public void setEmail(String mail) {
		email.sendKeys(mail);
	}
	
	public void setAddress(String addrs) {
		address.sendKeys(addrs);    
		
	}
	
	public void setCity(String cit) {
		city.sendKeys(cit);
	}
	
	public void setState(String st) {
		state.sendKeys(st);
	}
	
	public void setPostCode(String pcode) {
		postCode.sendKeys(pcode);
	}
	
	public void setCountry(String cntry) {             
		WebElement con = country;             //Dropdown Handling
		Select drpdown = new Select(con);
		drpdown.selectByVisibleText(cntry);
	}
	
	public void setUserName(String uname) {
		userName.sendKeys(uname);
	}
	
	public void setPassword(String passwrd) {
		pass.sendKeys(passwrd);
	}
	
	public void setConfirmPass(String passwrd) {
		confirmpass.sendKeys(passwrd);
	}
	
	public void clickSubmitBut() {
		submitBtn.click();
	}
	
	public void getVerify() {
		String text = actResult.getText();
		
//		System.out.println(text);
		
		String expResult = "Thank you for registering. You may now sign-in using the user name and password you've just entered."; 
        
		if(text.equals(expResult)) {
			System.out.println("REGISTRATION DONE SUCCESSFULLY...");
		}else {
			System.out.println("REGISTRATION FAILED...");
		}
	}
	
	
	
}
