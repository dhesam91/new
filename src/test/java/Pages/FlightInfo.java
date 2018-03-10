package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class FlightInfo {
	WebDriver driver;
	

	
	@FindBy(linkText="Flights")
	WebElement flightlink;
	@FindBy(name="tripType")
	WebElement typeradiobutton;
	@FindBy(name="passCount")
	WebElement passengerdrp;
	@FindBy(name="fromPort")
	WebElement fromportdrp;
	@FindBy(name="fromMonth")
	WebElement frommonthdrp;	
	@FindBy(name="fromDay") 
	WebElement fromdaydrp;	
	@FindBy(name="toPort")
	WebElement toportdrp; 	 	 	
	@FindBy(name="toMonth")
	WebElement tomonthdrp; 	 	  	  
	@FindBy(name="toDay")
	WebElement todaydrp; 		  
	@FindBy(name="servClass")
	WebElement classradiobutton; 
	@FindBy(name="airline")
	WebElement airlinedrp;   	
	@FindBy(name="findFlights")
	WebElement continuebutton;  	 
	 	  
	
	public FlightInfo(WebDriver driver){
		this.driver = driver;
		//This initElements method will create  all WebElements
		PageFactory.initElements(driver, this);
		
		
	}
	
	
	
	public void flightInfo() throws InterruptedException 
	{
		
		flightlink.click();
		typeradiobutton.click();
		Select drppass = new Select(passengerdrp);
		drppass.selectByVisibleText("1");
		Select drpcity = new Select(fromportdrp);
		drpcity.selectByVisibleText("New York");
		Select drpmonth = new Select(frommonthdrp);
		drpmonth.selectByVisibleText("November");
		Select drpday = new Select(fromdaydrp);
		drpday.selectByVisibleText("10");
		Select drptocity = new Select(toportdrp);
		drptocity.selectByVisibleText("London");
		Select drptomonth = new Select(frommonthdrp);
		drptomonth.selectByVisibleText("November");
		Select drptoday = new Select(fromdaydrp);
		drptoday.selectByVisibleText("15");
		classradiobutton.click();
		Select drpairline = new Select(airlinedrp);
		drpairline.selectByVisibleText("Unified Airlines");
		continuebutton.click();
	
	 	
	 	
		
	}}
