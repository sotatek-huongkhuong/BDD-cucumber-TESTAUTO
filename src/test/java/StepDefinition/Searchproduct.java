package StepDefinition;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Searchproduct {
WebDriver Driver=null; 

@Given("^user browser is opened and tocsport homepage$")
public void user_browser_is_opened_and_tocsport_homepage() throws Throwable {
   
	System.out.println("Inside step-Browser is open");
	String projectpath=System.getProperty("user.dir ");
	 System.out.println("Project By Phuong Nam:"+projectpath);
	 System.setProperty("webdriver.chrome.driver", "D:\\SELENIUM\\chromedriver.exe");		 
	 Driver=new ChromeDriver();
	 Driver.manage().window().maximize();
     Driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	  //Driver.navigate().to("https://tocsport.com/");
	  
}

@When("^user in the texbox search$")
public void user_in_the_texbox_search() throws Throwable {	
	WebElement txtFind=Driver.findElement(By.xpath("/html/body/div[4]/header/div/div[2]/div[1]/div[3]/ul/li/div/div/form/div[1]/div[1]/input[1]"));
	 
	 Actions builder = new Actions(Driver);
       Action mouseOverHome = builder.moveToElement(txtFind).build();
       mouseOverHome.perform();		 		 
	txtFind.click();
}
@When("^user enter(.*)$")
public void user_enter_product(String product) throws Throwable {
 Driver.findElement
 (By.xpath("//header/div[1]/div[2]/div[1]/div[3]/ul[1]/li[1]/div[1]/div[1]/form[1]/div[1]/div[1]/input[1]")).sendKeys(product);   

 Driver.findElement(By.xpath
		 ("//header/div[1]/div[2]/div[1]/div[3]/ul[1]/li[1]/div[1]/div[1]/form[1]/div[1]/div[1]/input[1]")).sendKeys(Keys.ENTER);
}
 
@Then("^user can see list product searched$")
public void user_can_see_list_product_searched() throws Throwable {
	System.out.println("You search to");
	Driver.close();
	Driver.quit();
}
	
	public void Search(WebDriver Driver) {
		 this.Driver=Driver; 	 
		 
		if(!Driver.getTitle().equals("You searched for Tốc Sport")){
			throw new IllegalStateException("This is not toc sport.the current page is"
		+Driver.getCurrentUrl());
		}
					
	  }
  }

