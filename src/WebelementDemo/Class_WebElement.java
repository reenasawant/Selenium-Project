package WebelementDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Class_WebElement {

	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\reena\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://en.wikipedia.org/w/index.php?title=Special:CreateAccount&returnto=Selenium+%28software%29");
		String N =driver.getTitle();
		//WebElement is object in Selenium which store location of the element
		
		WebElement e = driver.findElement(By.id("wpName2"));
		
		//isEnabled() is to determine if this will allow us to enter data or not
		//if it is disable it will give output as false
		//isDisplayed() is to determine if the element is displayed or not
		//this two Webelment  method are use for sanity testing or before testing start to determine if 
		// we can enter data
		
		Boolean s = e.isDisplayed();
		System.out.println(e);
		
		Boolean m =e.isEnabled();
		
		if (m == true) {
			e.sendKeys("nbviogr");
			e.clear();
			e.sendKeys("Sonal");
		}
				
				

	}

}
