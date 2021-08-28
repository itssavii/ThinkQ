package Firefox_driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class fox_driver 
{
	public static void main(String args[]) throws InterruptedException
	{
		System.setProperty("webdriver.gecko.driver","E:\\thinkQ\\firefox_driver\\geckodriver.exe");	
		WebDriver driver = new FirefoxDriver(); 
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		driver.findElement(By.name("q")).sendKeys("Welcome To FireFox"); 
		System.out.println("End Code");
		
		
	}

}
