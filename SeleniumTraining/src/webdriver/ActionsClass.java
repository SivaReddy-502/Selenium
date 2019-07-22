package webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;


public class ActionsClass {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium classes\\drivers\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://opensource-demo.orangehrmlive.com/");
		
		driver.findElement(By.xpath("//*[@id='txtUsername']")).sendKeys("Admin");
		String Value1=driver.findElement(By.xpath("//*[@id='txtUsername']")).getAttribute("value");
		System.out.println(Value1);
		
		driver.findElement(By.xpath("//*[@id='txtPassword']")).sendKeys("admin123");
		
		//WebElement link = driver.findElement(By.id("btnLogin"));
		
		Actions MO=new Actions(driver);
		//Action MouseOver=MO.moveToElement(driver.findElement(By.id("btnLogin"))).build();
		//MouseOver.perform();
		MO.sendKeys(driver.findElement(By.id("btnLogin")),(Keys.ENTER)).perform();
		
		/*MO.sendKeys(Keys.TAB).perform();
		MO.sendKeys(Keys.TAB).perform();
		MO.sendKeys(Keys.TAB).perform();
		
		MO.sendKeys(driver.findElement(By.id("MP_link")),(Keys.ENTER)).perform();*/
		MO.sendKeys(Keys.TAB,Keys.TAB,Keys.TAB,Keys.RETURN).perform();
		

		
		
		
		
		
		
		
		
		
		
		
	}

}
