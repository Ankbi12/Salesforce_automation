package salesforce_automation;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Delete_lead extends Base_class{
	@Test

	public void delete_lead()  throws InterruptedException {
		// TODO Auto-generated method stub
		

	
		
		driver.findElement(By.xpath("//input[@class='button r4 wide primary']")).click();
	//positive scenario	

	    driver.findElement(By.xpath("//div[@class='slds-icon-waffle']")).click();

		driver.findElement(By.xpath("//button[text()='View All']")).click();

		driver.findElement(By.xpath("//p[text()='Sales']")).click();
		
		WebElement findElement = driver.findElement(By.xpath("//a[@title='Opportunities']"));
		Actions builder1 = new Actions(driver);
		builder1.moveToElement(findElement).click().perform();
		
		
		driver.findElement(By.xpath("//input[@class='slds-input']")).sendKeys("New2");
		Thread.sleep(1000);
	
		driver.findElement(By.xpath("//div[@class='slds-grid ']")).click();
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("(//table/tbody/tr/td[8]/span/div/a/span/span)[1]")).click();

		driver.findElement(By.xpath("(//div[@class='forceActionLink']/parent::a)[2]")).click(); 
		
		
		
		
		

	}

}
