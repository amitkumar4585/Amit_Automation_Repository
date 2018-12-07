package com.esq.pages;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.chrome.ChromeDriver;

import com.esq.utilities.Screenshot;



public class LoginPage
{
	ChromeDriver driver;

	
	public LoginPage(ChromeDriver driver) 
	
	{
		this.driver= driver;
	}


	public void navigate_loginOption() 
      {  
		 driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	     driver.findElementByXPath("//ul[@class='tabs blue']/li[2]").click(); 
	    
	     
	   
	  }

	
	public void enter_UserName(String Username)  
	  {
		
	   	 driver.findElementByName("_txtUserName").sendKeys(Username);
   	   	
	  }

	
	public void enter_Password(String Password) 
	  {
		
		  driver.findElementByName("_txtPassword").sendKeys(Password); 
	  }


	
	public void click_login_Button()
	   {
		
		   driver.findElementByXPath("//input[@value='Login']").click();
		  
	   }
	
	
	

	
    public void logout_Aplication() throws IOException 
       {
    	
    	   
	       driver.findElementByXPath("//a[@href='logout.php']").click();
	
	  }
	
	
}
