

package abc;

import java.io.File;
import java.util.Set;

import javax.swing.text.html.HTMLDocument.Iterator;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.Alert;


public class testakk

{
	
	


	public static void main(String args[]) throws InterruptedException
	
	{
		
	
	System.out.println("This is test program");
	
	  
	  System.setProperty("webdriver.firefox.marionette","C:\\Users\\a610477\\Downloads\\geckodriver-v0.19.1-win64\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		
		//driver.get("https://www.joecolantonio.com/SeleniumTestPage.html?fname=rthr&lname=rhrh");
		
		//driver.findElement(By.xpath("//*[@id=\'printButton\']")).click();
		
		//String myWindowHandle = driver.getWindowHandle();
		//WebDriver wind = driver.switchTo().window(myWindowHandle);
		
		//wind.close();
		
		
	
		driver.get("https://www.incometaxindiaefiling.gov.in/home");
		
	    //Set s = driver.getWindowHandles();
	    
		 //java.util.Iterator ite = s.iterator();
		 
		
		//String popupHandle=ite.next().toString();
		 
	     //driver.switchTo().window(popupHandle);
	   
		    
		
		
	    //WebElement ele = driver.findElement(By.xpath("//*[@id=\'pmgky\']/div/div/span/button"));
	     
	    
		 
			//highLighterMethod(driver,ele);
			
			//WebElement popup = driver.findElement(By.id("//*[@id=\'pmgky\']/div/div/span/button"));
			
			WebElement popup1 = driver.findElement(By.cssSelector("body > div.ui-dialog.ui-widget.ui-widget-content.ui-corner-all.ui-front.ui-draggable.ui-resizable"));
			
			
		  popup1.findElement(By.xpath("//*[@id=\'pmgky\']/div/div/span/button")).click();
		  
		  
		  
			
			//WebElement popup = driver.findElement(By.id("//*[@id=\'ui-id-1\']"));
			
			highLighterMethod(driver,popup1);
			
		//Alert aa = driver.switchTo().alert();
		  //    aa.dismiss();
		
	
		
		
		
		//driver.findElement(By.xpath("//*[@id='signin_info']/a[1]")).click();
		
		//driver.findElement(By.xpath("//*[@id='login1']")).sendKeys("123");
		//*[@id="signin_info"]/a[1]
		
		
		//driver.findElement(By.xpath("//*[@name='cusid']")).sendKeys("123");
		
		//driver.findElement(By.xpath("//*[@name='submit']")).click();
		
		
	

		     //  Alert aa = driver.switchTo().alert();
		      //aa.dismiss();
		      // aa.accept();
		      // aa.accept();
		       
		      // driver.findElement(By.xpath("//*[@name='submit']")).click();
		       
		   	  //driver.findElement(By.xpath("//input[@name='res']")).click();
		   	  
		   	  //driver.findElement(By.linkText("Telecom Project")).click();
		   	  
	
		   	//driver.navigate().back();
		   
				 
				 
				 
	  
		//*[@id="printButton"]
		
		
		 //driver.findElement(By.name("userName")).sendKeys("Ajay");
	
		 //driver.findElement(By.name("password")).sendKeys("Ajay");
		 
		 //WebElement ele = driver.findElement(By.name("password"));
		 
		// highLighterMethod(driver,ele);
		 
		 //Thread.sleep(8000L);
		 
		// ele.sendKeys("SoftwareTestingMaterial.com");
		 
	   // Thread.sleep(5000L);
	    

	    
	
	//driver.findElement(By.xpath("//a[@ href='login.php']")).click();
		 
		//*[@id="pmgky"]/div/div/span/button
		//*[@id="pmgky"]/div/div/span/button
	
	
 //driver.close();
 //driver.quit();
	
}

public static void highLighterMethod(WebDriver driver, WebElement element){
	 JavascriptExecutor js = (JavascriptExecutor) driver;
	 js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 4px solid red;');", element);
	 }

}
