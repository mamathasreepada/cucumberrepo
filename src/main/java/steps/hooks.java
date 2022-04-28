package steps;

import java.util.concurrent.TimeUnit;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import Baseactions.baseclass;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class hooks extends baseclass{
	//public static WebDriver driver;
	public baseclass base1;
	public hooks()
	{
		
	}
	public hooks(baseclass base) {
		this.base1 = base;
	}
	@Before
	public void initDriver() 
	{	
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\pavan\\OneDrive\\Desktop\\chromedriver_win32\\chromedriver.exe");
		System.out.println(base1.baseURL);
		base1.driver= new ChromeDriver();
		base1.driver.get("https://demoqa.com/login");
		base1.driver.manage().window().maximize();
		//base1.driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
	}
	@After
	public void teardown()
	{
		base1.driver.close();	
	}
}



