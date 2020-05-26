package com.inetbanking.testdata.qa;

import org.apache.log4j.PropertyConfigurator;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;


public class BaseClass {
	public String baseURL = "http://demo.guru99.com/V1/index.php";
	public String username = "mngr262565";
	public String password = "jUrydYh";
	public WebDriver driver;
	public static Logger logger ;
	
	
	@BeforeClass
	public void setUp() {
		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"//Driver//chromedriver.exe");
		driver = new ChromeDriver();
		
		logger = Logger.getLogger("ebanking");
		PropertyConfigurator.configure("log4j.properties");
	
	
	}
	
	@AfterClass
	public void tearDown() {
		driver.quit();
		
	}
	

}
