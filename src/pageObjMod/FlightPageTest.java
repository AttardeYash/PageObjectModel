package pageObjMod;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class FlightPageTest {
	
  @Test
  public void reservationDetails() {
	  
	  System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
	  WebDriver driver = new ChromeDriver();
	  driver.get("https://demo.guru99.com/test/newtours/reservation.php");
	  driver.manage().window().maximize();
	  
	  FlightPage fp = new FlightPage(driver);
	  
	  fp.findFlightType("2");
	  fp.departureSchedule("Sydney", "November", "29");
	  fp.returnSchedule("Paris", "December", "20");
	  fp.journeyCompany("Blue Skies Airlines");
	  
  }
  
}
