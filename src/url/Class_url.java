package url;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Class_url {

	public static void main(String[] args) {
		
		System.setProperty("Webdriver.Chrome.driver", "C:\\Users\\reena\\Downloads\\chromedriver_win32\\chromedriver.exe");
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		String url = driver.getCurrentUrl();
		System.out.println(url);
		if (url.equals("https://www.google.com/"))
           {
			
			System.out.println("The test case pass");
			
		}
		else {
			
			System.out.println("The test case fail");
		}
		

		
		driver.close();
	}

}
