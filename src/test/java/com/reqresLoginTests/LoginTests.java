package com.reqresLoginTests;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class LoginTests {
	
	
	String browserType = null;
	@Parameters({"browserType"})
	@BeforeClass
	public void beforeClass(String browsertype) {
		
		
		if(browsertype.equalsIgnoreCase("Chrome")) {
			//get chrome driver
		}else if(browsertype.equalsIgnoreCase("IE")) {
			//get ie driver
		}
			
		browserType = browsertype;
		
	}
	
	@Test(priority = 1)
	public void successfulLogin() {
		
		
		
		System.out.println("run theses tests in "+browserType);

		System.out.println("---------1");
		
	}
	
	
	@Test(priority = 2)
	public void invalidUsername()	{
		System.out.println("---------2");
		System.out.println("run theses tests in "+browserType);

		
		
	}
	
	@Test(priority = 3)
	public void invalidPassword_butValidUsername() {
		System.out.println("---------3");

		System.out.println("run theses tests in "+browserType);

	}

}
