package chrome_driver;

import java.awt.Toolkit;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class task_rediff 
{
	public static void main(String args[]) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","E:\\thinkQ\\chrome_driver\\chromedriver.exe");	
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.rediff.com/");
		driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
		
		WebElement movi = driver.findElement(By.cssSelector(".secstorybox.movies"));
		List<WebElement> links = movi.findElements(By.tagName("a"));
		for (int i = 0; i < links.size(); i++)
		{
			    System.out.println(links.get(i).getText());
		}
		movi.getText();		
		
		WebElement spot = driver.findElement(By.cssSelector(".secstorybox.sports"));
		List<WebElement> links2 = spot.findElements(By.tagName("a"));
		for (int i = 0; i < links2.size(); i++)
		{
			    System.out.println(links2.get(i).getText());
		}
		movi.getText();	
		
		
		
		
		
		Toolkit.getDefaultToolkit().beep();
		System.out.println("End Of code");
		driver.close();
	}

}
