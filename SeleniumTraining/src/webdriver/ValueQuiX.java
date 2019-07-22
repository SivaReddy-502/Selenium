package webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class ValueQuiX {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium classes\\drivers\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.navigate().to("http://vqxtstapp-1.apps.mc.xerox.com/VQX_QA/US/UV1334/Default_LinuxQC5_UV1334.aspx");
		
		driver.findElement(By.xpath("//*[@alt='Click here for install']")).click();
		
//		Actions vqx=new Actions(driver);
//		vqx.sendKeys(Keys.TAB,Keys.TAB,Keys.TAB,Keys.TAB,Keys.TAB,Keys.TAB,Keys.ENTER).perform();
//		
//		driver.manage().window().maximize();
//		
//		Thread.sleep(3000);
		
//		WebElement link = driver.findElement(By.xpath("//*[@alt='Click here for install']"));
//		
//		Action MO=vqx.moveToElement(link).build();
//		
//		
//		vqx.sendKeys(link,(Keys.ENTER)).perform();
//		

	}

}
