package webdriver;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetWindowHandls {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\\\Selenium classes\\\\drivers\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://www.toolsqa.com/automation-practice-switch-windows/");
		
		String ParentWindow=driver.getWindowHandle();
		//print the id of the parent window
		System.out.println("The Parent Window ---> "+ParentWindow);
		
		//Identify the button which opens the child browser and string it in a webelement
		WebElement Clickbutton=driver.findElement(By.id("button1"));
		
		//it will open the child window 3 times
		for(int i=0;i<3;i++) {
			Clickbutton.click();
		}
		//i am getting all window id's
		ArrayList<String> ChildWindow=new ArrayList<>(driver.getWindowHandles());
		System.out.println("The Child windiw--->"+ChildWindow);
		
		String LastWindow="";
		//switch between my child window
		for(int i=1;i<ChildWindow.size();i++) {
			
			driver.switchTo().window(ChildWindow.get(1));
			//driver.manage().window().maximize();
			driver.navigate().to("https://www.google.com/");
			//it will identify the my last window handle
			LastWindow=ChildWindow.get(i).toString();
		}
		
		driver.switchTo().window(ParentWindow);
		driver.navigate().to("http://www.newtours.demoaut.com/");
		String TitleParent=driver.getTitle();
		System.out.println(TitleParent);
		Thread.sleep(3000);
		driver.close();
		driver.switchTo().window(LastWindow);
		driver.navigate().to("https://opensource-demo.orangehrmlive.com/");
		String childTitle=driver.getTitle();
		System.out.println(childTitle);
		Thread.sleep(3000);
		driver.quit();
		
	}

}
