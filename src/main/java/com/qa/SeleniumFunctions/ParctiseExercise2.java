package com.qa.SeleniumFunctions;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ParctiseExercise2 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\AUTOMATION_WORKSPACE\\FreeCRMTest\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://demoqa.com/frames-and-windows/");
		Actions action= new Actions(driver);
		WebElement product = driver.findElement(By.xpath("//footer/p[2]/a"));
		action.contextClick(product).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).build().perform();
		//driver.findElement(By.xpath(".//*[@id=’tabs-1′]/div/p/a")).click();
		driver.quit();
		

	}

}
