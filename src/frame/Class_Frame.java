package frame;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Class_Frame {

	WebDriver driver;
	 
	 // beforeMethod annotation represents that this particular method will be executed before every @Test method in this class
	 // this method is like a prerequiste method
	 @BeforeMethod
	 public void setupmethod()
	 {
		 System.setProperty("Webdriver.Chrome.driver", "C:\\Users\\reena\\Downloads\\chromedriver_win32\\chromedriver.exe");
			
	  
	   driver = new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.get("https://selenium.dev/selenium/docs/api/java/index.html");
	 }
	 


	@Test
	 public void frames() throws InterruptedException
	 {
	  driver.switchTo().frame("packageListFrame");
	  
	  driver.findElement(By.linkText("com.thoughtworks.selenium.condition")).click();
	   
	// driver.navigate().back();
	//  driver.switchTo().defaultContent();
	  driver.switchTo().frame("packageFrame");
	  Thread.sleep(3000);
	   driver.findElement(By.linkText("AbstractHttpCommandCodec")).click();
	/*  driver.navigate().back();
	  Thread.sleep(3000);
	  driver.switchTo().defaultContent();
	  driver.switchTo().frame("classFrame");
	  driver.findElement(By.linkText("org.openqa.selenium.firefox")).click();
	 }
	 



	@AfterMethod
	 public void closebrowser()
	 {
	  driver.close();
	 }*/
	 
}
}
