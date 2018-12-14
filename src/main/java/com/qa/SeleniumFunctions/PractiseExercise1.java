package com.qa.SeleniumFunctions;

import javax.swing.plaf.synth.SynthOptionPaneUI;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class PractiseExercise1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\AUTOMATION_WORKSPACE\\FreeCRMTest\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.Store.DemoQA.com");
		String title = driver.getTitle();
		System.out.println("title" +title);
		System.out.println("size" +title.length());
		String url = driver.getCurrentUrl();
		Assert.assertEquals(url,"http://www.store.demoqa.com/");
		String pages = driver.getPageSource();
		System.out.println("pagesource" +pages);
		System.out.println(" page source length" +pages.length());
		driver.close();
		
		
	}

}
