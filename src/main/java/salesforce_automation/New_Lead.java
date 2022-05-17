package salesforce_automation;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class New_Lead extends Base_class {
@Test
	public void new_Lead() throws InterruptedException {
		// TODO Auto-generated method stub
        
		
//Negative scenario
		  driver.findElement(By.xpath("//ul[@class='slds-global-actions']//child::li[3]")).click();
		  driver.findElement(By.xpath("(//span[@class='actionLabel'])[7]")).click();
			
		  WebElement none = driver.findElement(By.xpath("//a[text()='--None--']"));
		  none.click();
			 
		  Thread.sleep(2000);
		  driver.findElement(By.xpath("//a[text()='Ms.']")).click();
		  Thread.sleep(2000);
		  
		  driver.findElement(By.xpath("//input[@class='lastName compoundBLRadius compoundBRRadius form-element__row input']")).sendKeys("B");
		  
		  driver.findElement(By.xpath("//div[@class='bottomBarRight slds-col--bump-left']/button/span")).click();
		  
		  System.out.println(driver.findElement(By.xpath("//ul[@class='errorsList']/li")).getText());
		  driver.findElement(By.xpath("//button[@title='Close']/lightning-primitive-icon")).click();//close window
		  
		  
//Positive scenario
		  
		  driver.findElement(By.xpath("//ul[@class='slds-global-actions']//child::li[3]")).click();
		  driver.findElement(By.xpath("(//span[@class='actionLabel'])[7]")).click();
			
		  driver.findElement(By.xpath("//a[text()='--None--']")).click();
		  
			 
		  Thread.sleep(2000);
		  driver.findElement(By.xpath("//a[text()='Ms.']")).click();
		  Thread.sleep(2000);
		  
		  driver.findElement(By.xpath("//input[@class='lastName compoundBLRadius compoundBRRadius form-element__row input']")).sendKeys("Newlead");
		  
		  driver.findElement(By.xpath("(//input[@class=' input'])[3]")).sendKeys("EY");
		  
		  driver.findElement(By.xpath("//div[@class='bottomBarRight slds-col--bump-left']/button/span")).click();
		  driver.findElement(By.xpath("//button[@title='Close']/lightning-primitive-icon")).click();//close window
		  
		  driver.findElement(By.xpath("//div[@class='slds-icon-waffle']")).click();

		  driver.findElement(By.xpath("//button[text()='View All']")).click();

	      driver.findElement(By.xpath("//p[text()='Sales']")).click();
		  WebElement findElement = driver.findElement(By.xpath("//a[@title='Leads']"));
		  Actions builder3 = new Actions(driver);
		  builder3.moveToElement(findElement).click().perform();
		  
		  
		  driver.findElement(By.xpath("//input[@class='slds-input']")).sendKeys("Newlead");
		  driver.findElement(By.xpath("//div[@class='slds-grid ']")).click();
			
			String text = driver.findElement(By.xpath("//table/tbody/tr/th/span/a")).getText();
			if (text.equals("Newlead")) {
				System.out.println("Newlead is created");
				
			}
			else {
				System.out.println("Newlead is not created");
			}
				
		  
		  
		
		
	}

}
