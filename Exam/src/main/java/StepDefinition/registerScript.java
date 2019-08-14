package StepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import util.driverutil;

public class registerScript {
	
	WebDriver driver;
	
	
	@Given("^launch application$")
	public void launch_application() throws Throwable {
		driver = driverutil.getDriver("chrome");
		driver.navigate().to("https://demowebshop.tricentis.com");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		  driver.findElement(By.className("ico-register")).click();
		  Thread.sleep(2000);
	}

	@When("^Select the gender as male$")
	public void select_the_gender_as_male() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		 driver.findElement(By.id("gender-male")).click();
	}

	@When("^enter first name as \"(.*?)\"$")
	public void enter_first_name_as(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.id("FirstName")).sendKeys(arg1);
	    	}

	@When("^enter last name as \"(.*?)\"$")
	public void enter_last_name_as(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.id("LastName")).sendKeys(arg1);
	    
	}

	@Then("^enter email as \"(.*?)\"$")
	public void enter_email_as(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		 driver.findElement(By.id("Email")).sendKeys(arg1);
	
	}

	@Then("^enter password as \"(.*?)\"$")
	public void enter_password_as(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		 driver.findElement(By.id("Password")).sendKeys(arg1);
	 
	}

	@Then("^confirm password as\"(.*?)\"$")
	public void confirm_password_as(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.id("ConfirmPassword")).sendKeys(arg1);
	}

	@Then("^click on Register button$")
	public void click_on_Register_button() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.id("register-button")).click();
	}

	@Then("^Alex registered successfully$")
	public void alex_registered_successfully() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Alex is successfully registered");
	}



}
