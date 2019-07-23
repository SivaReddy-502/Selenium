package webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo6 {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\\\Selenium classes\\\\drivers\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("http://elearning.upskills.in/");
		
		driver.findElement(By.id("login")).sendKeys("admin");
		driver.findElement(By.id("password")).sendKeys("admin@123");
		
		driver.findElement(By.id("form-login_submitAuth")).click();
		
		driver.findElement(By.xpath("//*[@class='block-items-admin']/ul/li[4]/a")).click();
		
		Thread.sleep(3000);
		
		driver.findElement(By.id("user_import_import_file")).sendKeys("C:\\Users\\KSivaReddy\\Desktop\\Data.csv");
		
		

	}

}
