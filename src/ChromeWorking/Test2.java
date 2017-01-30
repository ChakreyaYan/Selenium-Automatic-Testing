package ChromeWorking;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class Test2 {

	public static void main(String[] args) throws InterruptedException 
	{
		
		// System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"//lib//geckodriver.exe");
		System.setProperty("webdriver.gecko.driver","D:\\Softwares\\testing automatic\\eclipse\\AdvanceXpath15\\lib\\geckodriver.exe");
		  WebDriver driver=new FirefoxDriver();	
	      driver.get("http://www.w3schools.com");
	      driver.manage().window().maximize();
	      
	      driver.findElement(By.xpath("//*[@id='mySidenav']/a[9]")).click();
	      Thread.sleep(2000);
	      driver.findElement(By.xpath("//*[@id='leftmenuinnerinner']/a[5]")).click();
	}

}


//see "15 - Advance concept startsWith image1" to understand easy
