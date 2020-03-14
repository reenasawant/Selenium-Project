package radiobutton;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class radioButton {
	
	@Test
	public void radioButton() throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		System.setProperty("Webdriver.Chrome.driver", "C:\\Users\\reena\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		driver.get("https://ironspider.ca/forms/checkradio.htm");
		//IE
		boolean s1 = driver.findElement(By.xpath("//*[@id=\"Content\"]/div[1]/blockquote[2]/form/input[1]")).isSelected();
		 System.out.println("The option selected  IE "+s1);
		 
		 //Mozilla
		driver.findElement(By.xpath("//*[@id=\"Content\"]/div[1]/blockquote[2]/form/input[2]")).click();
		 boolean s2 = driver.findElement(By.xpath("//*[@id=\"Content\"]/div[1]/blockquote[2]/form/input[2]")).isSelected();
		 System.out.println("The option selected  Mozilla "+s2);
		 
		 boolean s3 = driver.findElement(By.xpath("//*[@id=\"Content\"]/div[1]/blockquote[2]/form/input[3]")).isSelected();
		 System.out.println("The option selected  Opera "+s3);	
		 
		 Thread.sleep(2500);
		 driver.close();
	}
	
}
