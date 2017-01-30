package Xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Text 
{

	public static void main(String[] args)
	{
		  WebDriver driver=new FirefoxDriver();
	      driver.get("http://www.w3schools.com");
	      driver.manage().window().maximize();
	      
	      driver.findElement(By.xpath("//div[@class='sidemenu hidden-sm hidden-xs']/a[text()='Learn JavaScript']")).click();
	      
	      driver.findElement(By.xpath("//*[@id='menyen']/a[text()='JS Introduction']")).click();
	      
	}

}


//see image "15 -Advance concept text image 1"  to understand easy.