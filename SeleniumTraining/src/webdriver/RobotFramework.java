package webdriver;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class RobotFramework {

       public static void main(String[] args) throws AWTException, InterruptedException {
             // TODO Auto-generated method stub

       System.setProperty("webdriver.chrome.driver","C:\\\\Selenium classes\\\\drivers\\\\chromedriver.exe");
             
             ChromeDriver driver = new ChromeDriver();
             driver.manage().window().maximize();
             
           driver.navigate().to("http://realestate.upskills.in/wp-admin/");
           WebElement username = driver.findElement(By.id("user_login"));
           WebElement password = driver.findElement(By.id("user_pass"));

           username.sendKeys("admin");
           password.sendKeys("adminuser@12345");
             
         
            Actions ac =  new Actions(driver); 
           ac.sendKeys(Keys.ENTER).perform();
           
           WebElement link = driver.findElement(By.xpath("//a[text()='Howdy, ']"));
           
         ac.contextClick(link).sendKeys(Keys.ARROW_DOWN).build().perform();
          Robot rob =  new Robot();
          rob.keyPress(KeyEvent.VK_DOWN);
          Thread.sleep(2000);
          rob.keyPress(KeyEvent.VK_ENTER);
          Thread.sleep(2000);
         rob.keyPress(KeyEvent.VK_CONTROL);
          Thread.sleep(2000);
          rob.keyPress(KeyEvent.VK_TAB);
          Thread.sleep(2000);
          String url = driver.getCurrentUrl();
          System.out.println(url);
          rob.keyPress(KeyEvent.VK_CONTROL);
          Thread.sleep(2000);
          rob.keyPress(KeyEvent.VK_TAB);
          
          
          
          
          String url1 = driver.getCurrentUrl();
          System.out.println(url1);
          
         
       
            
           
              
             
             
             
       }

}
