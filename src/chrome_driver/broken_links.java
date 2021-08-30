package chrome_driver;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class broken_links 
{
	public static void main(String args[])
	{
		System.setProperty("webdriver.chrome.driver","E:\\thinkQ\\chrome_driver\\chromedriver.exe");	
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		//driver.get("https://demoqa.com/broken");
	    driver.get("https://login.salesforce.com/");
	    //driver.get("https://www.amazon.in/");
	    List<WebElement> links = driver.findElements(By.tagName("a"));
	    System.out.println("No of links are "+ links.size());  
	    
	    for(int i=0;i<links.size();i++)
        {
            WebElement E1= links.get(i);
            String url= E1.getAttribute("href");
            verifyLinks(url);
        }
	    System.out.println("Progarm End*****No broken links");
        driver.quit();
    }
    
    
    public static void verifyLinks(String linkUrl)
    {
        try
        {
            URL url = new URL(linkUrl);
            HttpURLConnection httpURLConnect=(HttpURLConnection)url.openConnection();
            httpURLConnect.setConnectTimeout(5000);
            httpURLConnect.connect();
            if(httpURLConnect.getResponseCode()>=400)
            {
            	System.out.println(linkUrl+" - "+httpURLConnect.getResponseMessage()+"is a broken link");
            }    
            else
            {
                System.out.println(linkUrl+" - "+httpURLConnect.getResponseMessage());
            }
        }
        catch (Exception e) 
        {
        	
        }
    }
}

