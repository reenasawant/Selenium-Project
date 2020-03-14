package dropdownbox;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class dropdownbox {
	
	 WebDriver driver;
	@Test
	public void dropDownsMenu() throws InterruptedException
	{
	 
	 
	 driver= new ChromeDriver();
	 
	 driver.manage().window().maximize();
	 
	 driver.get("https://ironspider.ca/forms/dropdowns.htm");
	 
	 // While creating the object of Select class, we will have pas element location as parameter
	 
	 Select dd= new Select(driver.findElement(By.xpath("//*[@id=\"Content\"]/div[1]/center[1]/div/form/select")));
	 
	 dd.selectByIndex(1);
	 
	 
	 Thread.sleep(3000);
	 
	 
	 dd.selectByVisibleText("Black");
	 
	}


	@Test(priority ='2')
	public void dropDownsMenu1() throws InterruptedException
	{

	 driver= new ChromeDriver();
	 
	 driver.manage().window().maximize();
	 
	 driver.get("https://ironspider.ca/forms/dropdowns.htm");
	 
	 // While creating the object of Select class, we will have pas element location as parameter
	 
	 
	 Select dd= new Select(driver.findElement(By.xpath("//*[@id=\"Content\"]/div[1]/center[1]/div/form/select")));
	 
	 Thread.sleep(3000);
	 
	 
	 //dd.selectByIndex(4);
	 
	 //dd.selectByVisibleText("Black");
	 
	 // store the entire drop down options in an Object of type List
	 // Object is going to store multiple web element
	 
	 List<WebElement> obj= dd.getOptions();
	 
	 // it will provide number of values in the list
	 
	 int s=obj.size();
	 
	 System.out.println("Number of Values in dropdown: " + s);
	 
	 //printing all the values of dropdown
	 
	 // fetching all the options of the dropdown one by one and clicking on crisp
	 Thread.sleep(3000);
	 
	 
	 for(WebElement temp:obj)
	 {
	  System.out.println(temp.getText());
	  
	  
	if(temp.getText().contains("With sugar"))
	  {
	   temp.click();
	   break;
	  }
	 }
	}

}

