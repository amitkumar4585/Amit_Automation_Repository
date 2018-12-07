package com.esq.utilities;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;

import com.esq.pages.LoginPage;




public class Screenshot 
{

	
	
     public void takeScreenshot(ChromeDriver driver2) throws IOException
     {
   
		   File f =  driver2.getScreenshotAs(OutputType.FILE);
		   File f1= new File("./Screenshots/"+"Name"+".png");
		   FileUtils.copyFile(f, f1);

        }
	 
}
