package Baseactions;

import java.awt.AWTException;



import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;


import steps.hooks;



public class Basicactions extends baseclass {
	public baseclass base;
	
	public Basicactions(baseclass base) {
		this.base = base;
	}

	public void scrolldown()
	{
		Actions Act = new Actions(base.driver);
		Act.sendKeys(Keys.DOWN).build().perform();
	}
	
	public void pagedown()
	{
		Actions Act = new Actions(base.driver);
		Act.sendKeys(Keys.END).build().perform();
	}
	
	public void keydown()
	{
		Actions Act = new Actions(base.driver);
		Act.sendKeys(Keys.DOWN).build().perform();
	}
	
	public void keyenter()
	{
		Actions Act = new Actions(base.driver);
		Act.sendKeys(Keys.ENTER).build().perform();
	}
	
	public void explicitwait(By EWait)
	{
		WebDriverWait wait = new WebDriverWait(base.driver,30);
		wait.until(ExpectedConditions.elementToBeClickable(EWait));
	}
	
	public  String getheadertext(By Header)
	{
		String HeaderText = base.driver.findElement(Header).getText();
		System.out.println(HeaderText);
		return HeaderText;
	}
	
	public  void click(By element)
	{
		base.driver.findElement(element).click();
	}
	
	public  void EnterText(By element, String text)
	{
		base.driver.findElement(element).sendKeys(text);
	}
	
	public  void select(By element, String Text)
	{
		WebElement dropdown = base.driver.findElement(element);
		Select obj = new Select(dropdown);
		obj.selectByVisibleText(Text);
	}
	
	public  void upload(By element, String pathoffile) throws AWTException
	{
		base.driver.findElement(element).click();
		StringSelection SS = new StringSelection(pathoffile); 
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(SS, null); 
		
        //native key strokes for CTRL, V and ENTER keys
        Robot robot = new Robot();
        robot.delay(1000);
       
        robot.keyPress(KeyEvent.VK_CONTROL);
        robot.keyPress(KeyEvent.VK_V);
        robot.keyRelease(KeyEvent.VK_V);
        robot.keyRelease(KeyEvent.VK_CONTROL);
        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER);
	}
}
