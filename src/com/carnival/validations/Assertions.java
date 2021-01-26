package com.carnival.validations;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assertions {
	public WebDriver Driver;
	public Assertions(WebDriver Driver) {
		this.Driver=Driver;
	
	}
	public boolean ValidateURL(String expurl) {
		boolean res = false;
		if(Driver.getCurrentUrl().equalsIgnoreCase(expurl)){
			res=true;
		}
		return res;
		
		
	}
	public boolean ValidateTitle(String title) {
		boolean res = false;
		if(Driver.getTitle().equalsIgnoreCase(title)){
			res=true;
		}
		return res;}
	public boolean ValidateTitletest(String title) {
		boolean res = false;
		if(Driver.getTitle().contains(title)){
			res=true;
		}
		return res;}
	public boolean ValidateURLtext(String text) {
		boolean res = false;
		if(Driver.getCurrentUrl().contains(text)){
			res=true;
		}
		return res;
	}
	public boolean IsDisplayed(String Xpath){
		boolean res=false;
		
		if(Driver.findElement(By.xpath(Xpath)).isDisplayed()){
			res=true;
			
		}return res;}
		public boolean IsEnabled(String Xpath){
			boolean res=false;
			
			if(Driver.findElement(By.xpath(Xpath)).isEnabled()){
				res=true;
				
			}return res;
		
	
	}
	
	

}
