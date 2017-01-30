package Xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.MarionetteDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

public class ContainsID {

	public static void main(String[] args) 
	{
		//System.setProperty("webdriver.gecko.driver",System.getProperty("user.dir")+"//lib//geckodriver.exe");
		 
		  WebDriver driver=new FirefoxDriver();
	      driver.get("http://www.google.com");
	      driver.manage().window().maximize();
	      
	      //driver.findElement(By.xpath("//*[@id='gb_70']")).click();
	      //driver.findElement(By.xpath("//a[@id='gb_70']")).click();
	      //driver.findElement(By.xpath("//a[contains(@id,'b_7')]")).click();  // if any id contains this value it will run 
	}

}


//see "15 - Advance concept startsWith image1" to understand easy
