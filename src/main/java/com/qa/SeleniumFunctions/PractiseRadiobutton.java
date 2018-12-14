package com.qa.SeleniumFunctions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PractiseRadiobutton {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\AUTOMATION_WORKSPACE\\FreeCRMTest\\Drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://toolsqa.wpengine.com/automation-practice-form/");
       Boolean flag =  driver.findElement(By.xpath("//input[@id='sex-1']")).isSelected();
       if(flag.equals(false)){
    	   driver.findElement(By.xpath("//input[@id='sex-1']")).click();
       }
       
       driver.findElement(By.xpath("//input[@id='exp-3']")).click();
      List<WebElement> list= driver.findElements(By.name("profession"));
       System.out.println(list);
      for(int i=0;i<list.size();i++)
       {
    	  String str= list.get(i).getAttribute("value");
    	  
    	  if (str.equalsIgnoreCase("Automation Tester"))
    	  {
    		  list.get(i).click();
    		  break;
    	  }
       }
       
        
	}

}
