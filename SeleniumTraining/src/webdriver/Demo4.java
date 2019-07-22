package webdriver;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo4 {

	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium classes\\drivers\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("http://newtours.demoaut.com/");
		
		String underconsTitle="Under Construction: Mercury Tours";
	
		// i am trying click on all links
		List<WebElement> links=driver.findElements(By.tagName("a"));
		
		// i am storing the size of the links in a link text
		String[] linktext=new String[links.size()];
		
		int i=0;
		
		//Extract the links text of each link element
		for(WebElement e:links)
		{
			linktext[i]=e.getText();
			i++;
		}
		
		//Test Weather each link is working or not working
		for(String t:linktext)
		{
			driver.findElement(By.linkText(t)).click();
			if(driver.getTitle().contains(underconsTitle))
			{
				System.out.println("\"" + t + "\" is under construction");
				
			}
			else
			{
				System.out.println("\"" +t+ "\" is working");
			}
			driver.navigate().back();
			
		}

		driver.close();
		
		
		
		
		
		
		
		
		

	}

}
