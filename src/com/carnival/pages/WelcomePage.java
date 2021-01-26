package com.carnival.pages;

import java.util.ResourceBundle;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import com.carnival.base.CreateDriver;

public class WelcomePage extends CreateDriver {
	
	public WelcomePage(WebDriver driver) {
		CreateDriver.driver=driver;
	
		
	}

	public void ExploreLink() {
		act.moveToElement(driver.findElement(rb.getString("Explore"))).build().perform();
	}
	public void DestinationLink(){
		driver.findElement(By.xpath("//span[text()='Destinations']")).click();
	}
	public void CarribeanLink()
{
		act.moveToElement(driver.findElement(rb.getString("Caribbean"))).build().perform();
	}
	public void StartExploring()
	{
			driver.findElement(rb.getString("StartExploring")).click();
		}
	public void Sailings() {

		driver.findElement(rb.getString("Sailings")).click();
	}
	public void SailingsClick() {

		act.moveToElement(driver.findElement("//div[@class='menu-wrap']/ul/li[3]/a")).click().perform();
	}
		
		
	}

  
