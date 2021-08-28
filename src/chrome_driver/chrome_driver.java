package chrome_driver;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
public class chrome_driver 
{
	public static void main(String args[]) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","E:\\thinkQ\\chrome_driver\\chromedriver.exe");	
		WebDriver driver=new ChromeDriver();
		driver.get("https://login.salesforce.com/");
		String title = driver.getTitle();
		System.out.println("Title of Chrome is: "+title);
		System.out.println("URL of Page is: "+driver.getCurrentUrl());
		//driver.manage().window().maximize();
		//System.out.println("Maximized Window");
	
		/*Thread.sleep(1000);
		driver.navigate().to("https://yatra.com");
		System.out.println("navigate to: "+driver.getTitle());
		Thread.sleep(2000);
		driver.navigate().back();
		System.out.println("Navigate back: "+driver.getTitle());
		driver.navigate().forward();
		Thread.sleep(3000);
		System.out.println("Navigate Forword : "+driver.getTitle());
		//driver.close();*/
		//driver.findElement(By.xpath("//input[@id='username']")).sendKeys("test user");
		
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("savi");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("savi1234");
		driver.findElement(By.xpath("//input[@id='Login']")).sendKeys("Login");
		System.out.println("End of code:");
		
		
		
	}

}
