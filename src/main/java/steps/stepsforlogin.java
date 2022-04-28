package steps;

import org.junit.runner.RunWith;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import Baseactions.Basicactions;
import Baseactions.baseclass;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.junit.Cucumber;
@RunWith(Cucumber.class)
public class stepsforlogin extends baseclass {
	
public baseclass base1;
	
	public stepsforlogin(baseclass base) 
	{
		this.base1 = base;
	}
	public static By usernamexpath = By.xpath("//input[@id='userName']");
	public static By passwordxpath = By.xpath("//input[@id='password']");
	public static By loginbuttonxpath = By.xpath("//button[@id='login']");
	public static By logoutbuttonxpath = By.xpath("//div[@class='text-right col-md-5 col-sm-12']//button[@id='submit']");
	
	@Given("^user is on Login Page$")
	public void user_is_on_Login_Page() throws Throwable 
	{
		WebDriver driver2 = base1.driver;
		base1.driver.get(base1.baseURL+"/login");
	}
	  
	   @And("^User enters \"([^\"]*)\" and \"([^\"]*)\"$")
	    public void user_enters_something_and_something(String strArg1, String strArg2) throws Throwable 
	   {
		  base1.driver.findElement(usernamexpath).sendKeys(strArg1);
		  base1.driver.findElement(passwordxpath).sendKeys(strArg2);
	    	Thread.sleep(5000);
	    }
	   @And("^click loginbutton$")
	    public void click_loginbutton() throws Throwable 
	   {
		base1.driver.findElement(loginbuttonxpath).click();
		   Thread.sleep(2000);
	   }
	   @Then("^Logout$")
	    public void logout() throws Throwable 
	   {
		   base1.driver.findElement(logoutbuttonxpath).click();
		   Thread.sleep(2000);
	    }
}
