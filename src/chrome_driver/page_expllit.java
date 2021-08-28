package chrome_driver;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class page_expllit
{
	public static void main(String args[]) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","E:\\thinkQ\\chrome_driver\\chromedriver.exe");	
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("https://www.salesforce.com/form/signup/elf-v2-login/?d=70130000000Enus");
		WebDriverWait wait = new WebDriverWait(driver,20);
		WebElement tryagain;
		tryagain = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[contains(text(),'start my free trial')]")));
		tryagain.click();
		System.out.println("END");
		
	
	}
		
		////span[contains(text(),'Next')]
		
}
