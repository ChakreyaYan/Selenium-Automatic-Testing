package ChromeWorking;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"//lib//chromedrive.exe");
		//System.setProperty("webdriver.chrome.driver","D:\\Softwares\\testing automatic\\eclipse\\AdvanceXpath15\\lib\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://www.google.com");
		driver.manage().window().maximize();

		driver.findElement(By.xpath("//*[@id='mySidenav']/a[9]")).click();

		driver.findElement(By.xpath("//*[@id='leftmenuinnerinner']/a[5]")).click();
	}

}

// see "15 - Advance concept startsWith image1" to understand easy
