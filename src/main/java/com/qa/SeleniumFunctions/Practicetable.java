package com.qa.SeleniumFunctions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practicetable {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\AUTOMATION_WORKSPACE\\FreeCRMTest\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://toolsqa.com/automation-practice-table/");
		String Str = driver.findElement(By.xpath("//table//tbody/tr[1]/td[2]")).getText();
		System.out.println(Str);
		driver.findElement(By.xpath("//table//tbody/tr[1]/td[6]/a")).click();
	}

}
