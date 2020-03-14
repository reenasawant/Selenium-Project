package searchgoogle;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Class_Search {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\reena\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.google.com/");
		driver.findElement(By.name("q")).sendKeys("Selenium");
		driver.findElement(By.name("q")).submit();
		driver.findElement(By.name("btnk")).click();
	}

}
