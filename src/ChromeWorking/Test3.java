package ChromeWorking;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;


public class Test3 {

	public static void main(String[] args) 
	{
						  
		  System.setProperty("webdriver.ie.driver","D:\\Softwares\\testing automatic\\eclipse\\AdvanceXpath15\\lib\\IEDriverServer.exe");
		  
		  //OR
		  
		  //System.setProperty("webdriver.ie.driver","C:\\Users\\kamalakannan\\WorkSpaceForSelenium\\WebDriverProject8\\lib\\IEDriverServer.exe");
		  WebDriver driver=new InternetExplorerDriver();
	      driver.get("http://wwww.w3schools.com");
	      driver.manage().window().maximize();
	      
	      driver.findElement(By.xpath("//*[@id='mySidenav']/a[9]")).click();
	      
	      driver.findElement(By.xpath("//*[@id='leftmenuinnerinner']/a[5]")).click();
	}

}


//see "15 - Advance concept startsWith image1" to understand easy
