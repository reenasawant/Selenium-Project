package getTitle;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Class_Title {

	public static void main(String[] args)  {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\reena\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://en.wikipedia.org/wiki/Main_Page");
		driver.manage().window().fullscreen();
		//ttile of the web page
		
		String title = driver.getTitle();
		
		if(title.contains("Wikipedia")) {
			
			System.out.println("Test case pass");
			System.out.println("Title page name is : "+ title);
			
		}

		else {
			System.out.println("Test case fail");
		}
	
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.close();
	}
}
