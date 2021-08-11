package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Learning {

	public static void main(String[]args) {
		// System Property for Chrome Driver   
	    System.setProperty("webdriver.chrome.driver","D:\\Automation\\Chromedriver\\chromedriver.exe");  
	      
	       // Instantiate a ChromeDriver class.       
	    WebDriver driver=new ChromeDriver(); 
	    
	    driver.get("https://google.com");
	    driver.manage().window().maximize();
	}
	
	
}
