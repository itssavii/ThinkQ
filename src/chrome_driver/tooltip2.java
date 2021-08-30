package chrome_driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class tooltip2 
{
	public static void main(String args[]) throws InterruptedException
	{
		////div[@id='main']
		//https://www.salesforce.com/form/signup/elf-v2-login/?d=70130000000Enus
		System.setProperty("webdriver.chrome.driver","E:\\thinkQ\\chrome_driver\\chromedriver.exe");	
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.salesforce.com/form/signup/elf-v2-login/?d=70130000000Enus");
		driver.manage().window().maximize();	
		WebElement logo1 = driver.findElement(By.xpath("//h1[@id='start-your-free-trial-today']"));
		Thread.sleep(5000);
		
		Actions act = new Actions (driver);	
		act.moveToElement(logo1).build().perform();
		System.out.println("Toolkit header of page :: " +logo1.getText());
		Thread.sleep(3000);
		
		WebElement textmsg = driver.findElement(By.xpath("//input[@name='UserFirstName']"));
		act.moveToElement(textmsg).click().sendKeys("Hello Savita").build().perform();
		act.moveToElement(textmsg).build().perform();
		
		System.out.println("END");
		driver.close();
	}
}


