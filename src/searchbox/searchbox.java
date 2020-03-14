package searchbox;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class searchbox {
	
	WebDriver driver;
	 
	 @Test
	 public void search() throws InterruptedException
	 {
	  
	  System.setProperty("webdriver.chrome.driver",
			  "C:\\Users\\reena\\Downloads\\chromedriver_win32\\chromedriver.exe");
	  
	   driver = new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.get("https://www.google.com/");
	  
	  driver.findElement(By.xpath("//input[@class='gLFyf gsfi']")).sendKeys("France");
	  
	  Thread.sleep(3000);
	  
	List<WebElement> lis =driver.findElements(By.xpath("//ul[@role='listbox']/child::*"));


	             System.out.println("size of list : " +     lis.size());
	             
	             
	for(int i=0;i<lis.size();i++)
	{
	 System.out.println(lis.get(i).getText());  // france, france map
	 
	 if(lis.get(i).getText().contains("map"))
	 {
	  lis.get(i).click();
	  break;
	 }
	 
	}
	}
}


