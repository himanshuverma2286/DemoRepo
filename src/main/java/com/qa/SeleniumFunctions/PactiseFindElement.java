package com.qa.SeleniumFunctions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PactiseFindElement {

	public static void main(String[] args) {
	   System.setProperty("webdriver.chrome.driver","C:\\AUTOMATION_WORKSPACE\\FreeCRMTest\\Drivers\\chromedriver.exe");
	   WebDriver driver = new ChromeDriver();
	   driver.get("http://toolsqa.wpengine.com/automation-practice-form/");
	   driver.findElement(By.xpath("//input[@name='firstname']"));
	   driver.findElement(By.xpath("//input[@name='lastname']"));
	   driver.findElement(By.xpath("//button[@id='submit']")).submit();
	   driver.findElement(By.xpath("//a/strong[contains(text(),'Partial Link Test')]")).click();
	  String str= driver.findElement(By.xpath("//button[@id='submit']")).toString();
	  System.out.println("String name is" +str);
	  driver.findElement(By.xpath("//a/strong[contains(text(),'Link Test')]")).click();
	  
	  
	}

}
