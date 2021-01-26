package com.carnival.base;

import java.util.ResourceBundle;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.*;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.ChartLocation;
import com.aventstack.extentreports.reporter.configuration.Theme;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateDriver {
public static Actions act;
public static ResourceBundle rb;
public static ExtentReports extent;
public static ExtentTest logger;	
public static ExtentHtmlReporter reporter;
public WebDriver driver;

@BeforeMethod


public void initialization() {

	reporter = new ExtentHtmlReporter(System.getProperty("C:\\Users\\Himanshu Arora\\eclipse-workspace\\Practice Projects.zip_expanded\\AutomationPractice") +"/test-output/STMExtentReport.html");
	extent = new ExtentReports ();
	extent.attachReporter(reporter);
	extent.setSystemInfo("Host Name", "SoftwareTestingMaterial");
	extent.setSystemInfo("Environment", "Automation Testing");
	extent.setSystemInfo("User Name", "Rajkumar SM");
	
	reporter.config().setDocumentTitle("Title of the Report Comes here");
 	reporter.config().setReportName("Name of the Report Comes here");
	reporter.config().setTestViewChartLocation(ChartLocation.TOP);
	reporter.config().setTheme(Theme.STANDARD);
		WebDriverManager.chromedriver().setup();
		ChromeOptions opt=new ChromeOptions();
		opt.getBrowserName();
		opt.addArguments("--incognito");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		System.out.println(opt.getBrowserName());
		driver.manage().timeouts().pageLoadTimeout(15, TimeUnit.SECONDS);
		driver.get("https://google.co.in");
		
		this.driver= driver;
		
		
}

@AfterMethod
public void BrowserClose() {
	driver.close();




}}
