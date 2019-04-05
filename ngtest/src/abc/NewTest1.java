package abc;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class NewTest1 {
  
	
	
	@Test
  public void f() {
	  
	  System.out.println("hello");
	  
	  System.setProperty("webdriver.firefox.marionette","C:\\Users\\a610477\\Downloads\\geckodriver-v0.19.1-win64\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		
  	
      String baseUrl = "http://demo.guru99.com/test/newtours/";
      
      driver.get(baseUrl);
      
      String actualTitle = "";
      String expectedTitle = "Welcome: Mercury Tours";
      
     
      actualTitle = driver.getTitle();
     
      if (actualTitle.contentEquals(expectedTitle)){
          System.out.println("Test Passed!");
      } else
      {
          System.out.println("Test Failed");
      }
      
      driver.close();
  }
	

	@BeforeTest 
	public void g()
	{
		
		System.out.println("This is before test");
	}

  

	@AfterTest 
	public void h()
	{
		
		System.out.println("This is After test");
	}
	
	@BeforeClass
	public void k()
	{
		
		System.out.println("This is beforeclass ");
	}

  @AfterClass
  
  public void d()
  {
	  System.out.println("This is after class");
  }
  
	
}
