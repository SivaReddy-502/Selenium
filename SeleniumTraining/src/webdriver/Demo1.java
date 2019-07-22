package webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo1 {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium classes\\drivers\\chromedriver.exe");
		
		//webdriver is a interface of seleniumwhich contains all the browser implementation
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://opensource-demo.orangehrmlive.com/");
		
		//this is to find the element and pass value to the element
		driver.findElement(By.xpath("//*[@id='txtUsername']")).sendKeys("Admin");
		driver.findElement(By.xpath("//*[@id='txtPassword']")).sendKeys("admin123");
		
		String ExpectedTitle="OrangeHRM";
		
		
		driver.findElement(By.cssSelector("input.button")).click();
		System.out.println("Login button clicked");
		
		String ActualTitle=driver.getTitle();
		System.out.println("The Actual Title is: "+ActualTitle);
		
		if(ExpectedTitle.contains(ActualTitle))	{
			
			Thread.sleep(3000);
			
			driver.findElement(By.cssSelector("a#welcome")).click();
			System.out.println("Clicking on welcome admin button");
			
			
			Thread.sleep(3000);
			
			driver.findElement(By.xpath("//*[@id='welcome-menu']/ul/li[2]/a")).click();	
			System.out.println("click on Logout button");
			
			System.out.println("The Actual Title and Expected Title both are same");
			
			//closing browser with 1 tab only
			driver.close();
			
			//Closing browser with all tabs
			driver.quit();
			
		}
		else
		{
			
			System.out.println("The Actual Title and Expected Title is differnt");
			driver.close();
			
		}
		
				
	}

}
