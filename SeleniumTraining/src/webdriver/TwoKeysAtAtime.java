package webdriver;


import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class TwoKeysAtAtime {

	public static void main(String[] args) throws AWTException {
	
		System.setProperty("webdriver.chrome.driver", "C:\\\\Selenium classes\\\\drivers\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://www.google.com/");
		
		driver.findElement(By.linkText("Gmail")).sendKeys(Keys.chord(Keys.CONTROL,Keys.RETURN));
		
		/*Robot rc=new Robot();
		
		rc.keyPress(KeyEvent.VK_CONTROL);
		rc.keyPress(KeyEvent.VK_TAB);*/
		
		//I want to find out the how many tabs
		//getWindowHandles --> will fetch all the parent window/parent tab and child tabs
		//getWindowHandle --> will fetch the parent window/parent tab
		ArrayList<String> tabs=new ArrayList<>(driver.getWindowHandles());
		System.out.println("The Tabs are:"+tabs.size());
		
		//switch to 2nd tab and get the title
		driver.switchTo().window(tabs.get(1));
		String Title=driver.getTitle();
		System.out.println(Title);
		
		//switch to 1nd tab and get the title
		driver.switchTo().window(tabs.get(0));
		String Title1=driver.getTitle();
		System.out.println(Title1);
		
		
		
		
		/*Actions act=new Actions(driver);
		
	
		
		act.sendKeys(driver.findElement(By.linkText("Gmail")),(Keys.chord(Keys.CONTROL,Keys.TAB))).perform();
		*/
		

	}

}
