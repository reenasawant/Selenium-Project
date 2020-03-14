package alertbox;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Class_AlertBox {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.diver", "C:\\Users\\reena\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		//driver.manage().window().maximize();
		
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		driver.findElement(By.name("proceed")).click();
		Alert a =driver.switchTo().alert();
		
		String mess = a.getText();
		
		System.out.println(mess);
		
		a.accept();
		Thread.sleep(500);
		driver.close();
		
	}

}
