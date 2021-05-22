package StepDefinition;
import java.awt.Desktop.Action;
import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.LoginPage;

public class LoginStep_Tocsport {

	WebDriver Driver=null; 
	LoginPage login;

@Given("^User Browser open, homepage of tocsport$")
public void user_Browser_open_homepage_of_tocsport() throws Throwable {
	System.out.println("Inside step-Browser is open");
	String projectpath=System.getProperty("user.dir ");
	 System.out.println("Project path is:"+projectpath);		 
	  System.setProperty("webdriver.chrome.driver", "D:\\SELENIUM\\chromedriver.exe");		 
	 Driver=new ChromeDriver();
	 Driver.manage().window().maximize();
     Driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
    
}

@When("^User is on form login$")
public void user_is_on_form_login() throws Throwable {
		
	Driver.navigate().to("https://tocsport.com/");	
}

@When("^User enters (.*) and (.*)$")
public void user_enters_username_and_passworld(String username,String passworld) throws InterruptedException {
	LoginPage login=new LoginPage(Driver);
		
	 //Click form Login1
	  WebElement btnlogin=Driver.findElement(By.xpath("/html/body/div[4]/header/div/div[2]/div[1]/div[4]/ul/li[1]/a/span"));
	  Actions builder = new Actions(Driver);
      org.openqa.selenium.interactions.Action mouseOverHome = builder.moveToElement(btnlogin).build();
      mouseOverHome.perform();
	  btnlogin.click();
	  	 		
		login.enterUsername(username);
		login.enterPassworld(passworld);
		Thread.sleep(2000);	 		 
}
       
@When("^User click button login$")
public void user_click_button_login() throws Throwable {
	WebElement btnLog=Driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div/div/div[2]/div/div[1]/div/form/p[3]/input[3]"));
	btnLog.click();	
	
}

@Then("^User can navigated to hompage$")
public void user_can_navigated_to_hompage() throws Throwable { 
	
	String Tocsporttile = Driver.getPageSource();
	System.out.println(Tocsporttile);
	
	  Driver.close();
	  Driver.quit();
}
}