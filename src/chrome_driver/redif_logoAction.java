package chrome_driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class redif_logoAction 
{
	public static void main(String args[]) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","E:\\thinkQ\\chrome_driver\\chromedriver.exe");	
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.rediff.com/");
		Actions act =new Actions(driver);
		
		WebElement move = driver.findElement(By.xpath("//*[@class='hmsprite logo']"));
		//*[@class='hmsprite logo']
		
		act.contextClick(move).build().perform();
		Thread.sleep(2000);
		
		System.out.println("****E****N****D****");
		
		driver.close();
	}
		

}
