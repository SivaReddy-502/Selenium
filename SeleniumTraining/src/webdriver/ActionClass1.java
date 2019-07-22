package webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionClass1 {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\Selenium classes\\drivers\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.navigate().to("http://newtours.demoaut.com/");
		
		driver.findElement(By.name("userName")).sendKeys("sunil");
		
		driver.findElement(By.name("password")).sendKeys("sunil");
		
		//driver.findElement(By.xpath("//input[@name='login']")).click();
		
		
		
		Actions MO=new Actions(driver);
		
		MO.sendKeys(Keys.TAB,Keys.ENTER).perform();
		
		Thread.sleep(3000);
		
		MO.sendKeys(Keys.TAB,Keys.TAB,Keys.TAB,Keys.TAB,Keys.TAB,Keys.RETURN).perform();
		
		
		//MO.sendKeys(Keys.TAB,Keys.TAB,Keys.TAB,Keys.ENTER).perform();
		
		
		
		
	}

}
