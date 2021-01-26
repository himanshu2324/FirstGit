package com.carnival.Testcases;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import java.io.IOException;
import java.time.Duration;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import org.testng.asserts.SoftAssert;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.carnival.base.CreateDriver;
import com.carnival.pages.WelcomePage;
import com.carnival.validations.Assertions;


public class TC_001_Carnival extends CreateDriver {
	


	WelcomePage wp;
	SoftAssert as;
	Assertions a;
	

	public void setup() throws IOException{
		
		wp=new WelcomePage(driver);
		as=new SoftAssert();
		a=new Assertions(driver);
	}
	
@Test(threadPoolSize=4,invocationCount=3 )
private void xyz() {
System.out.println(Thread.currentThread().getId());

}

@Test
public void switchWindow() {
	
	
	 String main_handle=driver.getWindowHandle();
	Set<String> s1=driver.getWindowHandles();
	/*for(String s2:s1) {
		driver.switchTo().window(s2);
		System.out.println(driver.getCurrentUrl());
	}*/
	
	Iterator<String> itr=s1.iterator();
	while(itr.hasNext()) {
		String str=(String) itr.next();
		if(str.equals(main_handle)) {
		}
		else {
			driver.switchTo().window(str);
			driver.close();
		}
		
		
	}
	driver.switchTo().window(main_handle);
	WebDriverWait wait=new WebDriverWait(driver,20);
	wait.until(ExpectedConditions.urlContains("times"));
	Wait w1=new FluentWait(driver).withTimeout(Duration.ofSeconds(20)).pollingEvery(Duration.ofSeconds(5)).ignoring(NoSuchElementException.class);
	w1.until(ExpectedConditions.urlContains("times"));
	Actions act=new Actions(driver);
	act.keyDown(Keys.CONTROL).sendKeys(Keys.END).build().perform();
	act.keyDown(Keys.CONTROL).sendKeys(Keys.HOME).perform();
	JavascriptExecutor js = (JavascriptExecutor) driver;
	//js.executeScript("window.scrollBy(0,200)");
	//js.executeScript("alert('Welcome to Guru99');");
	//js.executeScript("argument[0].click();",element);
	
	
	
	
	
	
}





}
