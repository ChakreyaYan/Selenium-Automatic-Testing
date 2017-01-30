package Xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class StartsWithID {

	public static void main(String[] args) 
	{

		  WebDriver driver=new FirefoxDriver();
	      driver.get("http://www.google.com");
	      driver.manage().window().maximize();
	      
	      //driver.findElement(By.xpath("//*[@id='gb_70']")).click();
	      //driver.findElement(By.xpath("//a[@id='gb_70']")).click();
	      driver.findElement(By.xpath("//a[starts-with(@id,'gb_7')]")).click();
	     
	}

}


//see "15 - Advance concept startsWith image1" to understand easy
