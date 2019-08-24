package com.reqresLoginTests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class LoginTests {
	
	WebDriver driver;
	
	String browserType = null;
	@Parameters({"browserType"})
	@BeforeClass
	public void beforeClass(String browsertype) {
		
		
		if(browsertype.equalsIgnoreCase("Chrome")) {
			
			System.setProperty("webdriver.chrome.driver", "src/test/resources/drivers/chromedriver_v76");
//			WebDriverManager.chromedriver().setup();

			driver= new ChromeDriver();
			driver.get("https://stackoverflow.com/");
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		}
			
		browserType = browsertype;
		
	}
	
	@Test(priority = 1)
	public void successfulLogin() {
		
		
		System.out.println(driver.getTitle());
		System.out.println("run theses tests in "+browserType);

		System.out.println("---------1");
		
	}
	
	
	@Test(priority = 2)
	public void invalidUsername()	{
		System.out.println("---------2");
		System.out.println("run theses tests in "+browserType);

		String currentURl = driver.getCurrentUrl();
		System.out.println(currentURl);
	}
	
	@Test(priority = 3)
	public void invalidPassword_butValidUsername() {
		System.out.println("---------3");

		System.out.println("run theses tests in "+browserType);
		driver.get("https://google.com");
		
	}
	
	@AfterClass
	public void afterClass() {
		
		driver.close();
		driver.quit();
		
	}

}
