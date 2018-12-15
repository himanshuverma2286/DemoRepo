package com.qa.SeleniumFunctions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PracticeWait {
	
	static WebDriver driver ;
	public static void main(String args[])
	{
		System.setProperty("webdriver.chrome.driver","C:\\AUTOMATION_WORKSPACE\\FreeCRMTest\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.get("http://toolsqa.wpengine.com/automation-practice-switch-windows/");
		driver.findElement(By.xpath("//button[@id ='timingAlert']")).click();
		WebDriverWait wait = new WebDriverWait(driver, 30);
		Alert alert = wait.until(ExpectedConditions.alertIsPresent());
		alert.accept();
		driver.close();
		
		
		
	}

}