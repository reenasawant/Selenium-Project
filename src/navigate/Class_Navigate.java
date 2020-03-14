package navigate;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.concurrent.TimeUnit;

public class Class_Navigate {

	public static void main(String[] args) throws InterruptedException  {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		System.setProperty("Webdriver.Chrome.driver", "C:\\Users\\reena\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		driver.get("https://www.google.com/");
		
		Thread.sleep(1500);
		driver.navigate().to("https://selenium.dev/");
		Thread.sleep(1500);
		//back to google page
		driver.navigate().back();
		Thread.sleep(1500);
		driver.close();
	}

}
