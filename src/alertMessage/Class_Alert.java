package alertMessage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Class_Alert {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\reena\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://login.live.com/login.srf?wa=wsignin1.0&rpsnv=13&ct=1581380861&rver=7.0.6737.0&wp=MBI_SSL&wreply=https%3a%2f%2foutlook.live.com%2fowa%2f%3fnlp%3d1%26RpsCsrfState%3d803fcbe2-662c-8ea2-f6aa-93034242593b&id=292841&aadredir=1&CBCXT=out&lw=1&fl=dob%2cflname%2cwld&cobrandid=90015");
		driver.manage().window().maximize();
		
		//without entering email id press submit
		driver.findElement(By.id("idSIButton9")).click();
		String message = driver.findElement(By.id("usernameError")).getText();
		Thread.sleep(1500);
		
		System.out.println(message);
		
		//Validating test case
		if (message.contains("Enter a valid email address")) {
			
			System.out.println("Test case passed");
		}
		else {
			System.out.println("Test case failed");
		}
		driver.close();
	}

}
