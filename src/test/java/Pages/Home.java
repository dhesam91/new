package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Home {
	WebDriver driver;
	
	@FindBy(linkText="REGISTER")
	WebElement registerlink;
	@FindBy(linkText="SIGN-ON")
	WebElement signonlink;
	@FindBy(name="userName")
	WebElement usernametextfield;
	
	
	
	public Home(WebDriver driver){
		this.driver = driver;
		//This initElements method will create  all WebElements
		PageFactory.initElements(driver, this);
		
		
	}
	
	
	public void clickonRegisterlink(){
		System.out.println("clickonRegisterlink method");
	// driver.findElement(By.linkText("REGISTER")).click();		   
		registerlink.click();
		System.out.println("after register link method");		
	}
	
	public void clickonSignonlink()
	{
	
		signonlink.click();
	}
}
