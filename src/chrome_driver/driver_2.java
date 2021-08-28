package chrome_driver;

import java.awt.List.*;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class driver_2 
{
		public static void main(String[] args) throws InterruptedException
		{
			System.setProperty("webdriver.chrome.driver","E:\\\\thinkQ\\\\chrome_driver\\chromedriver.exe");	
			WebDriver driver=new ChromeDriver();
			driver.get("https://www.salesforce.com/form/signup/elf-v2-login/?d=70130000000Enus");
			
			/*
			String title=driver.getTitle();
			System.out.println("Title is: "+title);
			System.out.println("Page URL is :"+driver.getCurrentUrl());
			
			driver.manage().window().maximize();
			System.out.println("Browser Maximized");
		
						*/
				//driver.get("")	;
			/**/
			
			driver.findElement(By.xpath("//input[@name='UserFirstName']")).sendKeys("Savita");
			driver.findElement(By.xpath("//input[@name='UserLastName']")).sendKeys("Yadav");
			driver.findElement(By.xpath("//input[@name='UserTitle']")).sendKeys("Analyst");
			driver.findElement(By.xpath("//input[@name='UserEmail']")).sendKeys("savi@abc.com");
			driver.findElement(By.xpath("//input[@name='CompanyName']")).sendKeys("MyComapany");
			driver.findElement(By.xpath("//input[@name='UserPhone']")).sendKeys("0123456789");
			
			WebElement jt= driver.findElement(By.xpath("//select[@name='CompanyEmployees']"));
			Select jobtitle = new Select(jt);
			//jobtitle.selectByValue("1-20 employees");
			jobtitle.selectByIndex(2);
			
			
			WebElement CCon= driver.findElement(By.xpath("//select[@name='CompanyCountry']"));
			Select compcountry = new Select(CCon);
			WebElement selectedop = compcountry.getFirstSelectedOption();
			System.out.println(selectedop.getText());
			List<WebElement> CCon2 =compcountry.getOptions();
			System.out.println("Dropaown list");
			for(WebElement titlename:CCon2)
				System.out.println(titlename.getText());
			driver.findElement(By.xpath("//select[@name='CompanyCountry']")).sendKeys("India");
			
			
			
			
				
				
			
				System.out.println("e n d c o d e");
			//driver.close();
		}
}



