package com.phoenix.tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SeleniumTest {

	    public static void main(String[] args) {
	        // declaration and instantiation of objects/variables
	    	System.setProperty("webdriver.firefox.marionette","C:\\geckodriver.exe");
			WebDriver driver = new FirefoxDriver();
			driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS) ;
			
			//comment the above 2 lines and uncomment below 2 lines to use Chrome
			//System.setProperty("webdriver.chrome.driver" ,"G:\\chromedriver.exe");
			//WebDriver driver = new ChromeDriver();
	    	
	        String baseUrl = "https://github.com/mozilla/geckodriver/releases/tag/v0.26.0";
	        String expectedTitle = "Google";
	        String actualTitle = "";

	        // launch Fire fox and direct it to the Base URL
	        driver.get(baseUrl);

	        // get the actual value of the title
	        actualTitle = driver.getTitle();

	        /*
	         * compare the actual title of the page with the expected one and print
	         * the result as "Passed" or "Failed"
	         */
	        if (actualTitle.contentEquals(expectedTitle)){
	            System.out.println("Test Passed!");
	        } else {
	            System.out.println("Test Failed");
	        }
	       
	        //close Fire fox
	        driver.close();
	       
	    }

	}

