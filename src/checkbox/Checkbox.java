package checkbox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

//All the method in TestNG will be void
public class Checkbox {
 
	//Test will executed in alphabetical order
	//@Test
	public void method1() {
		System.out.println("Hi");
		
	}
	
	//@Test
	public void handleCheckbox() throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		System.setProperty("Webdriver.Chrome.driver", "C:\\Users\\reena\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver.manage().window().maximize();
		driver.get("https://ironspider.ca/forms/checkradio.htm");
		boolean sel=driver.findElement(By.xpath("//*[@value='red']")).isSelected();
		System.out.println("checkbox is selected?" +" "+ sel);
		driver.findElement(By.xpath("//input[@value='red']")).click();
		  
		 boolean select1= driver.findElement(By.xpath("//input[@value='red']")).isSelected(); // True
		 
		 System.out.println("checkbox is selected?" +" "+ select1);
		 
		 driver.findElement(By.xpath("//input[@value='blue']")).click();
		 
		boolean select2= driver.findElement(By.xpath("//input[@value='blue']")).isSelected(); // True
		 
		 System.out.println("checkbox is selected?" +" "+ select2);
		 
		 Thread.sleep(2500);
		 driver.close();
	}
	

@Test
		 public void dropDownsMenu() throws InterruptedException
		 {
		  
		  
			 WebDriver driver= new ChromeDriver();
			  
			  driver.manage().window().maximize();
		  
		  driver.get("https://ironspider.ca/forms/dropdowns.htm");
		  
		  // While creating the object of Select class, we will have pas element location as parameter
		  
		  Select dd= new Select(driver.findElement(By.xpath("//*[@id=\"Content\"]/div[1]/center[1]/div/form/select")));
		  
		  dd.selectByIndex(4
				  );
		  
		  
		  Thread.sleep(3000);
		  
		  
		  dd.selectByVisibleText("Black");
		  
		 }

}
		
		
		
	

