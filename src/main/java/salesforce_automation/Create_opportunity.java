package salesforce_automation;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;


public class Create_opportunity extends Base_class{

	@Test
	public void create_Opportunity() throws InterruptedException{
	
//negative scenario
		  driver.findElement(By.xpath("//ul[@class='slds-global-actions']//child::li[3]")).click();
		  driver.findElement(By.linkText("New Opportunity")).click();
		  driver.findElement(By.xpath("(//input[@class=' input'])[1]")).sendKeys("New Opportunity");
		  driver.findElement(By.xpath("//a[@class='datePicker-openIcon display']")).click();
		  WebElement closedate = driver.findElement(By.xpath("//table/tbody/tr[3]/td[6]/span"));
		  Actions builder = new Actions(driver);
	      builder.moveToElement(closedate).click().perform();
	      Thread.sleep(1000);
	      driver.findElement(By.xpath("//div[@class='bottomBarRight slds-col--bump-left']/button/span")).click();
	      //Assert.assertEquals(driver.findElement(By.xpath("//ul[@class='errorsList']/li")).getText(),"These required fields must be completed: Stage"); 
		  System.out.println(driver.findElement(By.xpath("//ul[@class='errorsList']/li")).getText());
		  
		  driver.findElement(By.xpath("//button[@title='Close']/lightning-primitive-icon")).click();//close window
		
//positive scenario
		  driver.findElement(By.xpath("//ul[@class='slds-global-actions']//child::li[3]")).click();
		  driver.findElement(By.linkText("New Opportunity")).click();
		  Thread.sleep(2000);
		  driver.findElement(By.xpath("(//input[@class=' input'])[1]")).sendKeys("New2");
		  driver.findElement(By.xpath("//a[@class='datePicker-openIcon display']")).click();
		  WebElement closedate1 = driver.findElement(By.xpath("//table/tbody/tr[3]/td[6]/span"));
		  Actions builder1 = new Actions(driver);
	      builder1.moveToElement(closedate1).click().perform();
	      Thread.sleep(1000);
		  WebElement dd = driver.findElement(By.xpath("//a[text()='--None--']"));
		  dd.click();
		  Thread.sleep(2000);
		  driver.findElement(By.xpath("//a[text()='Qualification']")).click();
		  Thread.sleep(2000);
		  
		  driver.findElement(By.xpath("//div[@class='bottomBarRight slds-col--bump-left']/button/span")).click();
		  driver.findElement(By.xpath("//button[@title='Close']/lightning-primitive-icon")).click();
		  
		
		
		    driver.findElement(By.xpath("//div[@class='slds-icon-waffle']")).click();

			driver.findElement(By.xpath("//button[text()='View All']")).click();

			driver.findElement(By.xpath("//p[text()='Sales']")).click();
			WebElement findElement = driver.findElement(By.xpath("//a[@title='Opportunities']"));
			Actions builder3 = new Actions(driver);
			builder3.moveToElement(findElement).click().perform();
			
			driver.findElement(By.xpath("//input[@class='slds-input']")).sendKeys("New2");
			driver.findElement(By.xpath("//div[@class='slds-grid ']")).click();
			
			String text = driver.findElement(By.xpath("//table/tbody/tr/th/span/a")).getText();
			if (text.equals("New2")) {
				System.out.println("New2 is created");
				
			}
			else {
				System.out.println("New2 is not created");
			}
				
	
	
		
		
		
		
		
	}

}
