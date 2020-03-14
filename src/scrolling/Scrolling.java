package scrolling;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scrolling {
	
	static WebDriver driver ;
	 public static void main(String[] args) throws Exception {
	  // TODO Auto-generated method stub

	  driver = new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.get("https://www.seleniumhq.org/downloads/");
	  Thread.sleep(3000);
	  
	   JavascriptExecutor js=((JavascriptExecutor)driver);
	   //Scrolling until the lement is visible
	   
	  
	      WebElement e=driver.findElement(By.linkText("3.141.59"));


}
}
