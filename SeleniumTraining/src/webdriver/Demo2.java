package webdriver;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Demo2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium classes\\drivers\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("http://newtours.demoaut.com/");
		
		String ActualUsername="sunil";
		
		WebElement username=driver.findElement(By.name("userName"));
		
		
		if(username.isEnabled()) {
			
			username.sendKeys("sunil");
			Thread.sleep(3000);
			username.clear();
			Thread.sleep(3000);
			username.sendKeys("sunil");
			System.out.println("The Username field should be enabled");
		}
		if(username.isDisplayed()) {
			String name=driver.findElement(By.xpath("//tbody/tr[2]/td[1][@align='right']/font[1]")).getText();
			System.out.println(name);
			
			//gettext - label,dropdown,links
			String UnameLabel=driver.findElement(By.xpath("//*[contains(text(),'Name:')]")).getText();
			System.out.println(UnameLabel);
			
			//getattribute - Edit box where we pass value and if  any element attribute is dynamic in nature
			String Unamevalue=username.getAttribute("value");
			System.out.println(Unamevalue);
			String Unamename=username.getAttribute("name");
			System.out.println(Unamename);
			
			System.out.println("The Username field should be displayed");
		}
		
		String Password="sunil";
		
		driver.findElement(By.name("password")).sendKeys(Password);
		
		String Passwordvalue=driver.findElement(By.name("password")).getAttribute("name");
		System.out.println(Passwordvalue);
		
		String PasswordLabel=driver.findElement(By.xpath("//*[contains(text(),'Password:')]")).getText();
		System.out.println(PasswordLabel);
		
		driver.findElement(By.xpath("//input[@name='login']")).click();
		//Thread.sleep(7000);
		
		//Signoff
		//driver.findElement(By.xpath("//tr/td[1][@class='mouseOut']/a[1]")).click();
		
		//radio click my way
		//driver.findElement(By.xpath("//input[@value='oneway']")).click();
		
		if(driver.findElement(By.xpath("//*[@name='tripType' and @value='roundtrip']")).isSelected()) {
			
			//radio button
			driver.findElement(By.xpath("//*[@name='tripType' and @value='oneway']")).click();
			System.out.println("oneway radio button clicked");
		}
		
		//storing an element which is dropdown in a varible
		WebElement DD=driver.findElement(By.name("passCount"));
		
		//Select is going to click on dropdown
		Select sel=new Select(DD);
		
		//get all the values from drop down
		List<WebElement> options=sel.getOptions();
		
		//size of the dropdown
		System.out.println(options.size());
		
		for(int i=0;i<options.size();i++) {
			
			System.out.println(options.get(i).getText());
		}
		
		//select the value from the dropdown
		sel.selectByIndex(1);
		
		WebElement first = sel.getFirstSelectedOption();
		System.out.println(first.getAttribute("value"));
		
		String option1=driver.findElement(By.name("passCount")).getAttribute("value");
		System.out.println(option1);
		
		sel.selectByValue("3");
		sel.selectByVisibleText("1");
		
		driver.findElement(By.xpath("//*[@name='servClass' and @value='Business']")).click();
		driver.findElement(By.name("findFlights")).click();
		
		driver.findElement(By.name("reserveFlights")).click();
		
		driver.findElement(By.name("passFirst0")).sendKeys("Siva Reddy");
		driver.findElement(By.name("passLast0")).sendKeys("Kottapalli");
		driver.findElement(By.name("creditnumber")).sendKeys("1030302020202");
		
	
		
		List<WebElement>checkbox=driver.findElements(By.xpath("//*[@name='ticketLess' and @value='checkbox']"));
		/*//both the check box is checked
		for(int i=0;i<checkbox.size();i++) {
			checkbox.get(i).click();
		}
		
		//only first check box is checked but not for second checkbox
		for(int i=0;i<1;i++) {
			checkbox.get(i).click();
		}*/
		
		//only second check box is checked but not for first checkbox
		for(int i=1;i<checkbox.size();i++) {
			checkbox.get(i).click();
		}
		
		
		/*for(WebElement e:checkbox)
		{
			e.click();
		}*/
		
		//driver.findElement(By.xpath("//*[contains(text(),'Same as Billing Address')]")).click();
		
		driver.findElement(By.name("buyFlights")).click();
		
		
	
		driver.close();
			
	}

}