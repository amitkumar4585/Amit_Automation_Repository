package com.esq.testcases;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import com.esq.base.LaunchBrowser;
import com.esq.pages.LoginPage;
import com.esq.utilities.Screenshot;

public class TC_001_ValidateLoginFunctionality extends  LaunchBrowser


{
	
	
	//@Test(dataProvider="dp")
	@Test
	public void checkLogin(String a, String b) throws IOException 
	    {
	     LoginPage lp =  new LoginPage(driver);
	     lp.navigate_loginOption();
	     lp.enter_UserName(a);
	     lp.enter_Password(b);
	     lp.click_login_Button();
	     lp.logout_Aplication();
	    
		
	  }	


	
	@DataProvider(name="dp")
	
	
	public Object[][] dataget()
	 {
		
		File f = new File("./Input/DataSheet.xlsx");
		FileInputStream fis = new FileInputStream(f);
	
		XSSFWorkbook wb =  new XSSFWorkbook();
		XSSFSheet sh = new XSSFSheet("");
		XSSFRow rw = sh.
				HssfWorkbook
		
		
		 
		

		
		Object [][] arr = {row-1}{2};
		return arr;          
		}


}
	
	
	}




