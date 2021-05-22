//package pages;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//
//public class RegisterPage {
//	protected WebDriver Driver; 
//	
//	 private By txt_username=By.xpath("//input[@id='reg_email']");
//	  
//	 private By txt_passworld=By.xpath("//input[@id='reg_password']");
//	  
//	 
//	  public  RegisterPage(WebDriver Driver) {
//		 this.Driver=Driver; 	 
//		 
//		if(!Driver.getTitle().equals("Tốc Sport - Shop cửa hàng đồ thể thao chạy bộ ở Hà Nội")){
//			throw new IllegalStateException("This is not toc sport.the current page is"
//		+Driver.getCurrentUrl());
//			
//		}
//	  }
//		     
//	  public void enterUsername(String username) {
//		  
//		  Driver.findElement(txt_username).sendKeys(username);
//	}
//	  public void enterPassworld(String passworld) {
//		  
//		  Driver.findElement(txt_passworld).sendKeys(passworld);
//	  }
//	  
//	  public void clickLogin() {
//	//Driver.findElement(btn_login).click();
//	  
//	}
//	  public void LoginValidUser(String username,String passworld) {
//		  Driver.findElement(txt_username).sendKeys(username);
//		  
//		  Driver.findElement(txt_passworld).sendKeys(passworld);
//		  
////		  Driver.findElement(btn_login).click();
//	  }  
//	}
//
