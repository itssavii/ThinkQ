package chrome_driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class action_perfrom 
{
	public static void main(String args[]) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","E:\\thinkQ\\chrome_driver\\chromedriver.exe");	
		WebDriver driver=new ChromeDriver();
		driver.get("https://jqueryui.com/resources/demos/droppable/default.html");
		Actions act =new Actions(driver);
		
		WebElement src = driver.findElement(By.xpath("//p[contains(text(),'Drag me to my target')]"));
		WebElement trg = driver.findElement(By.xpath("//div[@id='droppable']"));
		Thread.sleep(2000);
		WebElement droptext = driver.findElement(By.xpath("//p[contains(text(),'Drop here')]"));
		
		act.doubleClick(droptext).build().perform();
		Thread.sleep(2000);
		
		act.dragAndDrop(src, trg).build().perform();
		Thread.sleep(2000);
		
	
		act.contextClick(src).build().perform();
		System.out.println("End Of code");
		
	}
		
}
