package com.qa.SeleniumFunctions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class practisedropdown {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\AUTOMATION_WORKSPACE\\FreeCRMTest\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://toolsqa.wpengine.com/automation-practice-form/");
		/*WebElement ele = driver.findElement(By.xpath("//select[@id='continents']"));
		Select sel = new Select(ele);
       sel.selectByIndex(1);
       Thread.sleep(3000);
       sel.selectByVisibleText("Africa");*/
		
		WebElement ele = driver.findElement(By.xpath("//select[@id='selenium_commands']"));
		Select sel = new Select(ele);
		sel.selectByIndex(0);
		sel.deselectByIndex(0);
		sel.selectByVisibleText("Navigation Commands");
		sel.deselectByVisibleText("Navigation Commands");
		List<WebElement> list = sel.getOptions();
		for( int i=0;i<list.size();i++)
		{
			sel.selectByIndex(i);
			
		}
		
		
		
	}

}
