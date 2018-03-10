package step_definitions;

import org.testng.Assert;
//import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.And;
import Pages.FlightInfo;
import Pages.Home;
import Pages.Register;

public class FlightInfoSteps {

	 WebDriver driver; 

	public FlightInfoSteps()
	{
		driver= Hooks.driver;
		
	}
	@And("^click on flight link, give all details about flight$")
	public void clickonFlightLink() throws InterruptedException 
	{
FlightInfo reobj=new FlightInfo(driver);
	reobj.flightInfo();
	}
	
	@Then("^user should able to see flight pricing$")
	public void flightconfiramtion() throws InterruptedException, Throwable
	
	{
	}
	}
