//package StepDefinition;
//
//import java.util.concurrent.TimeUnit;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;
//import org.openqa.selenium.interactions.Actions;
//
//import cucumber.api.PendingException;
//import cucumber.api.java.en.Given;
//import cucumber.api.java.en.Then;
//import cucumber.api.java.en.When;
//import pages.RegisterPage;
//
//public class RegisterStep_Tocsport {
//WebDriver Driver=null; 
//RegisterPage register; 
//
//@Given("^user browser is opened$")
//public void user_browser_is_opened() throws Throwable {
//   
//	System.out.println("Inside step-Browser is open");
//	String projectpath=System.getProperty("user.dir ");
//	 System.out.println("Project path is:"+projectpath);	
//	 System.setProperty("webdriver.gecko.driver","D:\\SELENIUM\\geckodriver.exe");	 	  	  
//		Driver=new FirefoxDriver();
//	 
//	  System.setProperty("webdriver.chrome.driver", "D:\\SELENIUM\\chromedriver.exe");		 
//	 Driver=new ChromeDriver();
//	 Driver.manage().window().maximize();
//     Driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
//	
//	
//}
//
//@When("^user is on register page of tocsport$")
//public void user_is_on_register_page_of_tocsport() throws Throwable {
//	Driver.navigate().to("https://tocsport.com/");	
//}
//
//@When("^user click form register$")
//public void user_click_form_register() throws Throwable {
//	 //Click form register
//	  WebElement btnlogin=Driver.findElement(By.xpath("/html/body/div[4]/header/div/div[2]/div[1]/div[4]/ul/li[1]/a/span"));
//	  Actions builder = new Actions(Driver);
//    org.openqa.selenium.interactions.Action mouseOverHome = builder.moveToElement(btnlogin).build();
//    mouseOverHome.perform();
//	  btnlogin.click();
//	  
//}
//
//@Then("^user see output result success or not$")
//public void user_see_output_result_success_or_not() throws Throwable {
//   
//}
//
//}
