package com.sms.GenericUtility;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebDriverUtility extends JavaUtility {
	/**
	 * thsi method is used to maximize the window
	 * @param driver
	 */
	public void maximize(WebDriver driver)
	{
		driver.manage().window().maximize();
	}
	public void pageLoadwait(WebDriver driver)
	{
	    driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	}
	public void waitUntilWebElemetVisible(WebDriver driver,WebElement element)
	{
		WebDriverWait wait=new WebDriverWait(driver, null);
		wait.until(ExpectedConditions.visibilityOf(element));
	}
	public void selectIndex(WebElement element,int index)
	{
		Select se=new Select(element);
		      se.selectByIndex(index);
	}
	public void select(WebElement elemnt,String value)
	{
		Select se=new Select(elemnt);
		   se.selectByValue(value);
	}
	public void selectByvisible(WebElement element,String text)
	{
		Select se=new Select(element);
		   se.selectByVisibleText(text);
	}
	public void mousehover(WebDriver driver,WebElement element)
	{
		Actions act=new Actions(driver);
		    act.moveToElement(element).click().perform();
	}
	public void moveoffset(WebDriver driver)
	{
		Actions act=new Actions(driver);
		        act.moveByOffset(40,40).click().perform();
	}
	public void dragAndDrop(WebDriver driver,WebElement src,WebElement dst)
	{
		Actions act=new Actions(driver);
		act.dragAndDrop(src,dst).perform();
	}
	public void doubleClick(WebDriver driver,WebElement element)
	{
		Actions act=new Actions(driver);
		act.doubleClick(element).perform();
	}
	public void rightClick(WebDriver driver,WebElement element)
	{
		Actions act=new Actions(driver);
		act.contextClick(element);
	}
	public void entryKeyPress() throws Throwable 
	{
		Robot r=new Robot();
		r.keyPress(KeyEvent.VK_ENTER);
		
	}
	public void keyrelease() throws Throwable
	{
		Robot r=new Robot();
		r.keyRelease(KeyEvent.VK_ENTER);
	}
	public void pressTab() throws Throwable
	{
		Robot r=new Robot();
		 r.keyPress(KeyEvent.VK_TAB);
	}
	public void releaseTab() throws Throwable
	{
		Robot r=new Robot();
		r.keyRelease(KeyEvent.VK_TAB);
	}
	public void switchToFrame(WebDriver driver, int index)
	{
		driver.switchTo().frame(index);
	}
	public void switchToFrame(WebDriver driver, String nameOrID)
	{
		driver.switchTo().frame(nameOrID);
	}
	public void switchToFrame(WebDriver driver, WebElement address)
	{
		driver.switchTo().frame(address);
	}
	public void acceptAlert(WebDriver driver)
	{
		driver.switchTo().alert().accept();
	}
	public void cancelAlert(WebDriver driver)
	{
		driver.switchTo().alert().dismiss();
	}
	public void switchToWindow(WebDriver driver, String partialTitle)
	{
		//step1: use getWindowHandes to capture all window id's
		Set<String> windows = driver.getWindowHandles();
		
		//step2: iterate through the windows
		Iterator<String> it = windows.iterator();
		
		//step3: check whether there is next window
		while(it.hasNext())
		{
			//step4: capture current window id
			String winId = it.next();
			
			//step5: switch to current window and capture title 
			String currentWinTitle = driver.switchTo().window(winId).getTitle();
			
			//step6: check whether current window is expected
			if(currentWinTitle.contains(partialTitle))
			{
				break;
			}
		}
	}
	public static String getScreenShot(WebDriver driver, String screenShotName) throws Throwable
	{     JavaUtility ja=new JavaUtility();
	                   String bd = ja.getSystemDateInFormat();
		TakesScreenshot ts = (TakesScreenshot) driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		String path = ".\\screenshot\\"+screenShotName+bd+".png";
		File dst = new File(path);
		FileUtils.copyFile(src, dst);
		return path;
		
	}
	public void scrollBarAction(WebDriver driver)
	{
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,1000)","");
	}
	public void scrollAction(WebDriver driver, WebElement element)
	{
		JavascriptExecutor js = (JavascriptExecutor) driver;
		int y = element.getLocation().getY();
		js.executeScript("window.scrollBy(0,"+y+")", element);
		//js.executeScript("argument[0].scrollIntoView()", element);
	}
	

}
