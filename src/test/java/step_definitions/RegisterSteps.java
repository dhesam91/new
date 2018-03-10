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

import Pages.Home;
import Pages.Register;

public class RegisterSteps {

	 WebDriver driver; 

	public RegisterSteps()
	{
		driver= Hooks.driver;
		
	}
	@And("^Enter details in Registeration page$")
public void createUserRegistration() throws InterruptedException 
	{
	Register reobj=new Register(driver);
	reobj.createUserRegistration();
	}
    
@Then("^user registration successful$")
public void userregisterconfirmation() throws InterruptedException, Throwable
{
	Register reobj=new Register(driver);
	String sActualValue=reobj.getText();
	String expectedresult= "Your user name is Test@test.com.";
	org.testng.Assert.assertTrue(sActualValue.contains(expectedresult));
}
}