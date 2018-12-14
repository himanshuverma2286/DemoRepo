package com.qa.SeleniumFunctions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PractiseExecrcise_Navigation {

	public static void main(String[] args) throws InterruptedException {
		 System.setProperty("webdriver.chrome.driver", "C:\\AUTOMATION_WORKSPACE\\FreeCRMTest\\Drivers\\chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
		 driver.get("https://www.freecrm.com/index.html");
		 Thread.sleep(3000);
		 driver.findElement(By.xpath("//li/a[contains(text(),'Features')]")).click();
		 Thread.sleep(3000);
		 System.out.println("I am on feature");
		 Thread.sleep(3000);
		 driver.navigate().back();
		 Thread.sleep(3000);
		 System.out.println("I am on home");
		 Thread.sleep(3000);
		 driver.navigate().forward();
		 Thread.sleep(3000);
		 System.out.println("I am on feature");
		 Thread.sleep(3000);
		 driver.navigate().back();
		 Thread.sleep(3000);
		 System.out.println("I am on home");
		 Thread.sleep(3000);
		 driver.navigate().refresh();
		 Thread.sleep(3000);
		 driver.close();

	}

}
