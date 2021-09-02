package com.qa.testscript;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class popup_3 {
	@Test
	public  void main ()throws InterruptedException {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Meghana\\Desktop\\selenium software\\chromedriver.exe");
		 
		//Open Browser
		WebDriver driver = new ChromeDriver();

		//Launch the URL --> popup2.html
		driver.get("C:/Users/Meghana/Documents/popup3.html");
		
		//Click on �Click on me� Button.
		WebElement btn=driver.findElement(By.xpath("/html/body/button"));
		btn.click();
		
		//Enter the text in the Text box
		Alert alert=driver.switchTo().alert();
		alert.sendKeys("Harry poter");
		Thread.sleep(3000);
		alert.accept();
		
		//Get the confirmation message & print in console.

	}
}
