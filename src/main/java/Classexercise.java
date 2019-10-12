import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Classexercise 
{

@Test
	public static void login() 
	{
	
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://acme-test.uipath.com/account/login");
		driver.findElementById("email").sendKeys("kumar.testleaf@gmail.com");
		driver.findElementById("password").sendKeys("leaf@12");
		driver.findElementById("buttonLogin").click();
		WebElement vendorbtn = driver.findElement(By.xpath("//button[text()[normalize-space()='Vendors']]"));
		Actions builder=new Actions(driver);
		builder.moveToElement(vendorbtn).perform();
		driver.findElementByLinkText("Search for Vendor").click();
		driver.findElementById("vendorName").sendKeys("Blue Lagoon");
		driver.findElementById("buttonSearch").click();
		String text = driver.findElementByXPath("//td[text()='France']").getText();
		System.out.println(text);
		driver.findElementByLinkText("Log Out").click();
		driver.close();
		
		
		
		
	
	
	}

}
