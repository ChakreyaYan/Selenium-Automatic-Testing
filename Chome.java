import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Chome {
	public static void main(String args[]){
		
		WebDriver driver=new ChromeDriver();
		SetProperty.set("webdriver.chome.driver").
		driver.get("http://www.google.com");
	}

}
