package StepDefinition;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class findproduct {
	WebDriver Driver=null; 
	
	@Given("^User in the homepage of tocsport$")
	public void user_in_the_homepage_of_tocsport() throws Throwable {
		System.out.println("Inside step-Browser is open");
		String projectpath=System.getProperty("user.dir ");
		 System.out.println("Project By Phuong Nam:"+projectpath);
		 System.setProperty("webdriver.chrome.driver", "D:\\SELENIUM\\chromedriver.exe");		 
		 Driver=new ChromeDriver();
		 Driver.manage().window().maximize();
	     Driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		  Driver.navigate().to("https://tocsport.com/");	
	}

	@When("^User CLick textboxt find product$")
	public void user_CLick_textboxt_find_product() throws Throwable {
	    
		 WebElement txtFind=Driver.findElement(By.xpath("/html/body/div[4]/header/div/div[2]/div[1]/div[3]/ul/li/div/div/form/div[1]/div[1]/input[1]"));
		 
		 Actions builder = new Actions(Driver);
	        Action mouseOverHome = builder.moveToElement(txtFind).build();
	        mouseOverHome.perform();		 		 
		txtFind.click();
	}
	
	@When("^User enters product want to find$")
	public void uer_enters_product_want_to_find() throws Throwable {
//find product:	        
try {
  // Navigate to Url
 
  // search prodruct 
  Driver.findElement(By.xpath("//header/div[1]/div[2]/div[1]/div[3]/ul[1]/li[1]/div[1]/div[1]/form[1]/div[1]/div[1]/input[1]")).sendKeys("Giay the thao" + Keys.ENTER);
} finally {
  //Driver.quit();
//}
	} 		  		  	
	}
			
	@Then("^User can see list product$")
	public void user_can_see_list_product() throws Throwable {
		System.out.println("Check Your List Product”");
	   	
//		WebElement Result = Driver.findElement(By.xpath("//div[@id='masthead']"));
//        Assert.assertEquals(Result.getText(), "You searched for - Tốc Sport");
		
	}
//	  public  findproduct(WebDriver Driver) {
//			 this.Driver=Driver; 	 
//			 
//			if(!Driver.getTitle().equals("Tốc Sport - Shop cửa hàng đồ thể thao chạy bộ ở Hà Nội")){
//				throw new IllegalStateException("This is not toc sport.the current page is"
//			+Driver.getCurrentUrl());
//				
//			}
//		  }

@Given("^user list product$")
public void user_list_product() throws Throwable {
	System.out.println("Func Choose Product-Created by Phuong Nam");
	String projectpath=System.getProperty("user.dir ");
	 System.out.println("Project By Phuong Nam:"+projectpath);
	 System.setProperty("webdriver.chrome.driver", "D:\\SELENIUM\\chromedriver.exe");		 
	 Driver=new ChromeDriver();
	 Driver.manage().window().maximize();
     Driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	  Driver.navigate().to("https://tocsport.com/san-pham/giay-chay-bo-do-win-mr9619");	
}

@Given("^user choose product$")
public void user_choose_product() throws Throwable {

	WebElement btnChoose=Driver.findElement(By.xpath("//body/div[@id='wrapper']/main[@id='main']/div[2]/div[1]/div[2]/div[1]/div[1]/div[2]/form[1]/button[1]"));		
	Actions builder = new Actions(Driver);
    Action mouseOverHome = builder.moveToElement(btnChoose).build();
    mouseOverHome.perform();		 		 
btnChoose.click();
			
}

@When("user click on product and user move to cart$")
public void user_click_on_product_and_user_move_to_cart() throws Throwable {
   
	//Move to bill
	WebElement btnMove=Driver.findElement(By.xpath("//header/div[1]/div[2]/div[1]/div[4]/ul[1]/li[3]/a[1]/span[1]"));		
	Actions builder = new Actions(Driver);
    Action mouseOverHome = builder.moveToElement(btnMove).build();
    mouseOverHome.perform();		 		 
btnMove.click();
		
}

@Then("^user can payment product or continue shopping$")
public void user_can_payment_product() throws Throwable {
	 System.out.println("Tien Hanh Thanh Toan");
	 
	// You can continue shopping 
		WebElement btnMove=Driver.findElement(By.xpath("//a[contains(text(),'← Continue Shopping')]"));		
		Actions builder = new Actions(Driver);
	    Action mouseOverHome = builder.moveToElement(btnMove).build();
	    mouseOverHome.perform();		 		 
	btnMove.click();	 	 
	Driver.close();
	Driver.quit();
}
@Given("^User List product new$")
public void user_List_product_new() throws Throwable {
	System.out.println("Func Choose New Product-Created by Phuong Nam");
	String projectpath=System.getProperty("user.dir ");
	 System.out.println("Project By Phuong Nam:"+projectpath);
	 System.setProperty("webdriver.chrome.driver", "D:\\SELENIUM\\chromedriver.exe");		 
	 Driver=new ChromeDriver();
	 Driver.manage().window().maximize();
     Driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	 	  
	  JavascriptExecutor js = (JavascriptExecutor) Driver;

      // Launch the application		    
      Driver.navigate().to("https://tocsport.com/shop");

      //To maximize the window. 		
      Driver.manage().window().maximize();

      // This  will scroll down the page by  1000 pixel vertical		
      js.executeScript("window.scrollBy(0,500)");  
}
	  

@Given("^user Choose new product$")
public void user_Choose_new_product() throws Throwable {
    
WebElement btnnew=Driver.findElement(By.xpath("//body/div[@id='wrapper']/main[@id='main']/div[2]/div[2]/div[4]/div[5]/div[1]/div[2]/div[1]/div[1]/a[1]/img[2]"));
Actions builder = new Actions(Driver);
Action mouseOverHome = builder.moveToElement(btnnew).build();
mouseOverHome.perform();		 		 
btnnew.click();	 	 			
	System.out.println("I Wanna choose more product");
	
}

@When("^add product to cart$")
public void user_click_on_new_product() throws Throwable {
	WebElement btnadd=Driver.findElement(By.xpath("//body/div[@id='wrapper']/main[@id='main']/div[2]/div[1]/div[2]/div[1]/div[1]/div[2]/form[1]/button[1]"));
	Actions builder = new Actions(Driver);
	Action mouseOverHome = builder.moveToElement(btnadd).build();
	mouseOverHome.perform();		 		 
	btnadd.click();	 	 		
	System.out.println("Going to bill");
}

@Then("^user add to cart and paying bill$")
public void user_Aadd_to_cat_and_paying_bill() throws Throwable {
	//Move to bill
		WebElement btnMove=Driver.findElement(By.xpath("//header/div[1]/div[2]/div[1]/div[4]/ul[1]/li[3]/a[1]/span[1]"));		
		Actions builder = new Actions(Driver);
	    Action mouseOverHome = builder.moveToElement(btnMove).build();
	    mouseOverHome.perform();		 		 
	btnMove.click();	
	
	WebElement Result = Driver.findElement(By.xpath("//a[contains(text(),'Áo chạy bộ iRanShao GEAR LAB G3AI3103')]"));
  Assert.assertEquals(Result.getText(), "Áo chạy bộ iRanShao GEAR LAB G3AI3103");

	
	Driver.close();
	Driver.quit();
		
}
}

	
	
	

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
