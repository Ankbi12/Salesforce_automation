package stepdep;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.But;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Testcase_1 extends Baseclass {
	

	@When("Enter the username as {string}")
	public void enter_the_username_as(String string) {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.id("username")).sendKeys(string);
	}
	
	@When("Enter the password as {string}")
	public void enterPassword(String pwd) {
		driver.findElement(By.id("password")).sendKeys(pwd);
	}
	
	
	@When("Click the Login button")
	public void clickLogin() {
		driver.findElement(By.xpath("//input[@class='button r4 wide primary']")).click();
		
	}

	@Then ("Not redirected to home page")
	public void Homepage() throws InterruptedException {
		String title = driver.getTitle(); System.out.println(title);
		  if(title.contains("Home Page ~ Salesforce - Developer Edition")) {
		  System.out.println("Inside IF");
		  driver.findElement(By.xpath("//a[@title='Home Tab']")).click();
		  Thread.sleep(3000);
		  driver.findElement(By.xpath("//input[@value='No Thanks']")).click();
		  Thread.sleep(3000);
		  driver.findElement(By.xpath("//input[@value='Send to Salesforce']")).click();
		  } else { System.out.println("Inside else");
		  driver.findElement(By.xpath("(//span[@class='uiImage'])[1]")).click();
		  Thread.sleep(1000); driver.findElement(By.
		  xpath("//a[@class='profile-link-label switch-to-aloha uiOutputURL']")).click(
		  ); 
		  Thread.sleep(2000); 
		  }
	}
		@When("Click on Create New")
		 public void Create() {
			 driver.findElement(By.xpath("(//div[@class='menuButtonButton']/span)[3]")).click();
		
		}
		
		@Then("Click on Event")
		public void Event() {
			driver.findElement(By.xpath("//a[@class='menuButtonMenuLink firstMenuItem eventMru']")).click();
		}
		
		@Then("Fill Mandatory Information")
		public void Information() {
			Actions act = new Actions(driver);
			act.sendKeys(Keys.ESCAPE).build().perform();
			
			driver.findElement(By.xpath("//input[@spellcheck=\"true\"]")).sendKeys("Testnew");
		}
		
		@Then("Click on Attach")
		public void Attach() {
			 driver.findElement(By.xpath("//input[@name='attachFile']")).click();
			  String windowHandle = driver.getWindowHandle();
		        System.out.println(windowHandle);
		        Set<String> windowHandles = driver.getWindowHandles();
		        System.out.println(windowHandles.size());
		        List<String>windows=new ArrayList<String>(windowHandles);
		        driver.switchTo().window(windows.get(1));
		        String title1 = driver.getTitle();
		        System.out.println(title1);
		         driver.switchTo().window(windows.get(0));
		}
		
		@Then("Click on Done")
		public void Done() {
			driver.findElement(By.xpath("(//input[@class='btn'])[2]")).click();
		}
		
		@Then("Click on Save Event")
		public void Save_Event() throws InterruptedException {
			 driver.findElement(By.name("save")).click();
	         Thread.sleep(3000);
		}
		
		
		
		@Then("Click on the newly created event under Recent Items")
		public void Event_under_Recent_Items() throws InterruptedException {
			driver.findElement(By.xpath("(//span[@class='mruText'])[2]")).click();
			 Thread.sleep(3000);
		}
		
		
		@Then("Click on Edit")
		public void Edit() {
			 WebElement edit = driver.findElement(By.xpath("(//input[@title='Edit'])[1]"));
			 Actions builder = new Actions(driver);
		     builder.moveToElement(edit).click().perform();
		}
		
		
		@Then("Clear Date")
		public void Clear_Date() {
			driver.findElement(By.xpath("//input[@id='EndDateTime']")).clear();
		}
		
		
		
		@Then("Update the End Date as tomorrow's date")
		public void End_Date() {
			driver.findElement(By.xpath("//input[@id='EndDateTime']")).sendKeys("5/21/2022");
		}
		
		@And("Save the changes")
		public void Save() {
			driver.findElement(By.xpath("//input[@class='btn']")).click();
		}
		
		@When("Click on the newly created event under Recent Items and Delete the Event")
		public void Delete() {
			driver.findElement(By.xpath("(//input[@title='Delete'])[2]")).click();
		}
		
		
		@And("Verify the Event is removed from Recent Items")
		public void Verify() {
			String recent = driver.findElement(By.xpath("(//span[@class='mruText'])[2]")).getText();
		     if(!recent.contains("Testnew")) 
		     {
		     System.out.println("Successfully deleted");
		     }
		}

		
		
}
		
		
	
	

	



