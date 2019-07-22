package webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionClass2 {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\Selenium classes\\drivers\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.navigate().to("http://retail.upskills.in/admin/");
		
		driver.findElement(By.id("input-username")).sendKeys("admin");
		driver.findElement(By.id("input-password")).sendKeys("admin@123");
		
		driver.findElement(By.xpath("//*[@class='btn btn-primary' and @type='submit']")).click();
		
		WebElement link=driver.findElement(By.id("menu-catalog"));
		
		Actions act=new Actions(driver);
		act.moveToElement(link).click().perform();
		
	}

}
