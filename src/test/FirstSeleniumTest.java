package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirstSeleniumTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\reena\\Downloads\\chromedriver_win32\\chromedriver.exe");
 //opening and closing web driver
		 
		 WebDriver driver = new ChromeDriver();
		 driver.get("https://facebook.com/");
		 driver.manage().window().maximize();//maximize window size
		 //checking for text box
		 driver.findElement(By.xpath(".//*[@id=\"u_0_m\"]")).sendKeys("Reena");
		 driver.findElement(By.xpath(".//*[@id=\"u_0_o\"]")).sendKeys("Sawant");
		 driver.findElement(By.xpath(".//*[@id=\"u_0_r\"]")).sendKeys("reena_sawant@hotmail.com");
		 
         
		// driver.quit();
		 
		// WebDriver Driver = new FirefoxDriver();
		// Driver.get("https://www.google.com/");
	}
}
