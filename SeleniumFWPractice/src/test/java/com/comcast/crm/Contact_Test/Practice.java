package com.comcast.crm.Contact_Test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class Practice {
	
public static void main(String[] args) throws InterruptedException {
		
		
		
		WebDriver driver = new EdgeDriver();
		driver.get("https://www.flipkart.com");
		
		
		
		
		//Thread.sleep(2000);
		
		Actions act = new Actions(driver);
		act.moveToElement(driver.findElement(By.xpath("//div[text()='ABOUT']/../a")));
		List<WebElement>ele=driver.findElements(By.xpath("//div[text()='ABOUT']/../a"));
		System.out.println(ele);
	//System.out.println( ele.indexOf("About Us"));
		for(WebElement i: ele) {
			
			
			System.out.println(i.getText());
			
		
		}
		
		
		
	}
	

}
