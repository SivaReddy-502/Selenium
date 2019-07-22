package webdriver;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium classes\\drivers\\chromedriver.exe");
		
		//webdriver is a interface of seleniumwhich contains all the browser implementation
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://opensource-demo.orangehrmlive.com/");
		
		//this is to find the element and pass value to the element
		driver.findElement(By.xpath("//*[@id='txtUsername']")).sendKeys("Admin");
		String Value1=driver.findElement(By.xpath("//*[@id='txtUsername']")).getAttribute("value");
		System.out.println(Value1);
		
		driver.findElement(By.xpath("//*[@id='txtPassword']")).sendKeys("admin123");
		
		driver.findElement(By.id("btnLogin")).click();
		driver.findElement(By.linkText("Performance")).click();
		
		//get all links in webpage
		List<WebElement> links=driver.findElements(By.tagName("a"));
		System.out.println("The no of links are: "+links.size());
		
		for(WebElement E:links) {
			String alllinks=E.getText();
			String href=E.getAttribute("href");
			System.out.println(alllinks);
			System.out.println(href);
			
		}
		

	}

}
