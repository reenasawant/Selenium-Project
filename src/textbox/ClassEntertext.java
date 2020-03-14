package textbox;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClassEntertext {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\reena\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://en.wikipedia.org/w/index.php?title=Special:CreateAccount&returnto=Selenium+%28software%29");
		String N =driver.getTitle();
		
		
		
		if (N.contains("Create account")) {
			
			System.out.println("Test case pass");
			System.out.println(N);
			
			driver.findElement(By.id("wpName2")).sendKeys("nbviogr");
			driver.findElement(By.id("wpPassword2")).sendKeys("kjdfbvuirthiug");
			driver.findElement(By.id("wpRetype")).sendKeys("kjdfbvuirthiug");
//			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	        Thread.sleep(30000);

			
		//	driver.findElement(By.xpath("//*[@id='mw-input-captchaWord']")).sendKeys("yoursdocks");
			                             
			driver.findElement(By.id("wpCreateaccount")).click();
		}
		else
		{
			System.out.println("Test case fail");
		}
		
		
	}

}
