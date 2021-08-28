package chrome_driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CSS_select 
{
	public static void main(String args[]) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","E:\\thinkQ\\chrome_driver\\chromedriver.exe");	
		WebDriver driver=new ChromeDriver();
		driver.get("https://login.salesforce.com/");
		
		
		WebElement user = driver.findElement(By.cssSelector("input[id='username']"));
		user.sendKeys("Hello");
		
		WebElement pass = driver.findElement(By.cssSelector("input[id*='password']"));
		pass.sendKeys("Bye");
		
		
		
	}

}
