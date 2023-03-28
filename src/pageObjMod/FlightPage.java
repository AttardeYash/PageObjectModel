package pageObjMod;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class FlightPage {

	WebDriver driver;
	
	public FlightPage(WebDriver driver) {      //constructor
		this.driver = driver;
	}
	
	By wayType = By.xpath("/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[2]/td[2]/b/font/input[2]");
	By passangers = By.xpath("//*[@name='passCount']");
	By DeptFrom = By.xpath("//*[@name='fromPort']");   
	By monthOfJourney = By.xpath("//*[@name='fromMonth']");   
	By dateOfJourney = By.xpath("//*[@name='fromDay']");   
	By arrivingIn = By.xpath("//*[@name='toPort']");    
	By monthOfReturnJourney = By.xpath("//*[@name='toMonth']");   
	By dateOfReturnJourney = By.xpath("//*[@name='toDay']");   
	By serviceClass = By.xpath("/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[9]/td[2]/font/font/input[2]");
	By airLine = By.xpath("//*[@name='airline']");     
	By contBtn = By.xpath("//*[@name='findFlights']");
	
	
	
	public void findFlightType(String pasngr) {
		driver.findElement(wayType).click();
		
		WebElement c = driver.findElement(passangers);             //Dropdown Handling
		Select drpdown = new Select(c);
		drpdown.selectByVisibleText(pasngr);
	}
	
    public void departureSchedule(String from, String month, String date) {
    	WebElement c1 = driver.findElement(DeptFrom);             //Dropdown Handling
    	Select drpdown1 = new Select(c1);
    	drpdown1.selectByVisibleText(from);
    	
    	WebElement c2 = driver.findElement(monthOfJourney);             //Dropdown Handling
    	Select drpdown2 = new Select(c2);
    	drpdown2.selectByVisibleText(month);
    	
    	WebElement c3 = driver.findElement(dateOfJourney);             //Dropdown Handling
    	Select drpdown3 = new Select(c3);
    	drpdown3.selectByVisibleText(date);
	}
    
    public void returnSchedule(String retfrom, String retmonth, String retdate) {
    	WebElement c4 = driver.findElement(arrivingIn);             //Dropdown Handling
    	Select drpdown4 = new Select(c4);
    	drpdown4.selectByVisibleText(retfrom);
    	
    	WebElement c5 = driver.findElement(monthOfReturnJourney);             //Dropdown Handling
    	Select drpdown5 = new Select(c5);
    	drpdown5.selectByVisibleText(retmonth);
    	
    	WebElement c6 = driver.findElement(dateOfReturnJourney);             //Dropdown Handling
    	Select drpdown6 = new Select(c6);
    	drpdown6.selectByVisibleText(retdate);
	}
	
    public void journeyCompany(String airlineComp) {
		
    	driver.findElement(serviceClass).click();
    	
    	WebElement c7 = driver.findElement(airLine);             //Dropdown Handling
    	Select drpdown7 = new Select(c7);
    	drpdown7.selectByVisibleText(airlineComp);
    	
    	driver.findElement(contBtn).click();
	}
    
    
	
}
