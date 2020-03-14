package Parameterization;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class parameterization {
	
		 
		 static WebDriver driver;
		 
		 public static void wikipagedata(String name, String password, String retype, String email)
		 {
		  driver.findElement(By.id("wpName2")).clear();
		  driver.findElement(By.id("wpName2")).sendKeys(name);
		  
		  driver.findElement(By.id("wpPassword2")).clear();
		  driver.findElement(By.id("wpPassword2")).sendKeys(password);
		  driver.findElement(By.id("wpRetype")).clear();
		  driver.findElement(By.id("wpRetype")).sendKeys(retype);
		  driver.findElement(By.id("wpEmail")).clear();
		  driver.findElement(By.id("wpEmail")).sendKeys(email);
		 }



		@BeforeClass

		public void startbrowser()
		{
		 System.setProperty("webdriver.chrome.driver",
		   "C:\\Users\\reena\\Downloads\\chromedriver_win32\\chromedriver.exe");
		 
		 driver = new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.get("https://en.wikipedia.org/w/index.php?title=Special:CreateAccount&returnto=Selenium+%28software%29");
		 
		}



		 @Test
		 public void methodcall()
		 {
		  wikipagedata("abc","abc@123","abc@123","abc@gmail.com");
		  //driver.close();
		  wikipagedata("abc1","abc@1234","abc@1234","abc1@gmail.com");
		  
		  wikipagedata("abc2","abc@12345","abc@12345","abc2@gmail.com");
		  
		 }

		}
