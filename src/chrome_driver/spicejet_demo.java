package chrome_driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class spicejet_demo 
{
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","E:\\\\thinkQ\\\\chrome_driver\\chromedriver.exe");	
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.spicejet.com");
		
		Select FC= new Select (driver.findElement(By.id("ctl00_mainContent_ddl_originStation1")));
		FC.selectByVisibleText("Agra (AGR)");
		FC.selectByIndex(1);
		
		/*///driver.findElement(By.x
		 * path("//input[@id='ctl00_mainContent_ddl_destinationStation1']")).sendKeys("AIP");
		Select TC= new Select (driver.findElement(By.id("ctl00_mainContent_ddl_destinationStation1")));
		//TC.selectByVisibleText("Agra (AGR)");
		TC.selectByIndex(4);*/
		
		Select cur= new Select (driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency")));
		cur.selectByVisibleText("INR");
		cur.selectByIndex(4);
		
		
		
		System.out.println("END");
	}
}
