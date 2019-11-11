package com.stepDefinition;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginPageSteps {
	    WebDriver driver;

	  @Given("User is on Adactin Website")
	  public void user_is_on_Adactin_Website() 
	  {
		  System.setProperty("webdriver.chrome.driver","C:\\Users\\MOHAN REDDY\\Downloads\\eclipse-committers-oxygen-3a-win32-x86_64\\eclipse\\Sowji\\CucumberTest\\driver\\chromedriver.exe");
		  driver=new ChromeDriver();
		  driver.get("https://adactin.com/HotelApp/");
		  driver.manage().window().maximize();
	  }
	  @When("User enters Username and password")
	  public void user_enters_Username_and_password()
	  {
         WebElement userName = driver.findElement(By.id("username"));
         userName.sendKeys("Gopikrishnasowji");
         WebElement password = driver.findElement(By.id("password"));
         password.sendKeys("Saibaba@528");
         
	  }
	   @Then("User click the login button")
	   public void user_click_the_login_button()
	   {
		   WebElement btnLogin = driver.findElement(By.id("login"));
	       btnLogin.click();
	       Assert.assertTrue(driver.getCurrentUrl().equals("https://adactin.com/HotelApp/SearchHotel.php"));
	       System.out.println("Validation done Sucessfully");
	       
	   }    
}








