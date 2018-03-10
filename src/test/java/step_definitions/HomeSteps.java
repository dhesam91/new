package step_definitions;

import org.testng.Assert;
//import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.And;

import Pages.Home;
import Pages.Register;

public class HomeSteps {

	 WebDriver driver; 
	 String url = "http://newtours.demoaut.com/";
	public HomeSteps()
	{
		driver= Hooks.driver;
	}
	
	
	@Given("^I Open Mercury Flight Application$")
	public void openFlightApplication() throws InterruptedException, Throwable
	{
	System.out.println( "openFlightApplication method in hoemsteps");
	driver.get(url);
	Thread.sleep(2000);
	}
	
	@When("^Click on the Register link in the Home page$")
	public void navigatetoregisterpage() throws InterruptedException, Throwable
	{
		Home hmobj=new Home(driver);
		hmobj.clickonRegisterlink();
	}
  

	@Then("^Register page should displayed$")
	public void registerpagedisplayed() throws InterruptedException, Throwable
	{
	
	 String ExpectedValue = "Register: Mercury Tours";
	Register reobj= new Register(driver);
	String ActualValue= reobj.getRegistrationTitle();
	Assert.assertEquals(ExpectedValue, ActualValue);
	}

  	  
}
