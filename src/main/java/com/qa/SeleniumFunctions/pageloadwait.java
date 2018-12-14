package com.qa.SeleniumFunctions;

import java.util.function.Function;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class pageloadwait {

	public static void main(String[] args) {
		
		 System.setProperty("webdriver.chrome.driver", "C:\\AUTOMATION_WORKSPACE\\FreeCRMTest\\Drivers\\chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
		 WebDriverWait wait = new WebDriverWait(driver,30);
		//boolean flag= ((JavascriptExecutor) driver).executeScript("return document.readyState").toString().equals("complete");
		 //wait.until(driver ->((JavascriptExecutor)driver).executeScript("return document.readyState").toString().equals("complete");
	
	}

}
