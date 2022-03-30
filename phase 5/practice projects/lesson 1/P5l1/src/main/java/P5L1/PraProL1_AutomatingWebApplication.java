package P5L1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PraProL1_AutomatingWebApplication {

	public static void main(String[] args) throws InterruptedException {
		
		//initializing the Chrome driver(browser)
		 System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver.exe");
		    WebDriver driver= new ChromeDriver();
		  //opening the application in browser
		    driver.get("https://www.flipkart.com/");
		
		
		//maximizing the window of the browser
		driver.manage().window().maximize();
		
		
		
		
		
		Thread.sleep(20000);
		System.out.println("********************************************************************");
		System.out.println("Cheking Email TextBox.......");
		//finding the element email TextbBox using XPATH and storing it in WebElement
		WebElement email=driver.findElement(By.xpath("//input[@class='_2IX_2- VJZDxU']"));
		
		//Checking weather the Email textBox is displayed or not 
		
		boolean dis = email.isDisplayed();
		
		if (dis=true)
		{
			System.out.println("Login Email Text box is displayed on the Browser.....");	
		}else {
			System.out.println("Email Text Box not found!!!!!!");
		}
		
		//Checking weather the Email textBox is Enabled or not 

		boolean enab = email.isEnabled();
		
		if(enab=true)
		{
			System.out.println("Login Email text box is enabled to fill the data.......");
			email.sendKeys("sneha.karer@gmail.com");
		}else {
			System.out.println("Login Email TextBox is not Enabled to write!!!!");
		}
		
		
		System.out.println("********************************************************************");
		System.out.println("Cheking Password TextBox.......");
		//finding the element Password TextbBox using XPATH and storing it in WebElement
		WebElement password=driver.findElement(By.xpath("//input[@type='password']"));
		
		//Checking weather the Password textBox is displayed or not 
		
				boolean disp = password.isDisplayed();
				
				if (disp=true)
				{
					System.out.println("login Password Text box is displayed on the Browser.....");	
				}else {
					System.out.println("Password Text Box not found!!!!!!");
				}
				
				//Checking weather the Password textBox is Enabled or not 

				boolean enabl = password.isEnabled();
				
				if(enabl=true)
				{
					System.out.println("login Password text box is Enabled to fill the data.......");
					password.sendKeys("Sneha@1999");
				}else {
					System.out.println("Login Password TextBox is not Enabled to write!!!!");
				}
		System.out.println("********************************************************************");

		Thread.sleep(20000);
		System.out.println("Cheking Login Button.......");
		//finding the element login Button using XPATH and storing it in WebElement
		
		WebElement Login=driver.findElement(By.xpath("//button[@class='_2KpZ6l _2HKlqd _3AWRsL']"));
		
		//Checking weather the login button is displayed or not 
		
				boolean display = Login.isDisplayed();
				
				if (display=true)
				{
					System.out.println("login Button is displayed on the Browser.....");	
				}else {
					System.out.println("Login Button not found!!!!!!");
				}
				
				//Checking weather the Password textBox is Enabled or not 

				boolean enable = Login.isEnabled();
				
				if(enable=true)
				{
					System.out.println("Login Button is Enabled to Click.......");
					Login.click();
				}else {
					System.out.println("Login Button is not Enabled to Click!!!!");
				}
		
		System.out.println("********************************************************************");
		
		
		
		//input[@class='_2IX_2- VJZDxU']
		//input[@type='password']
		//button[@class='_2KpZ6l _2HKlqd _3AWRsL']
	}

}