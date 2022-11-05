package org.test;

import java.util.Date;

import org.base.BaseClassss;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.login.Login;

public class Facebook extends BaseClassss {

	@BeforeClass
	public static void beforeClass() {
	 launchBrowser("chrome");
     lanuchUrl("https://www.facebook.com/");	

	 maximize();
	 implicityWait(10);
	 System.out.println("Before Class");
	 
	}
	@AfterClass
	public static  void afterClass() {
   // quit();
    System.out.println("after class");
	}
	@Before
	public  void before() {
    Date d=new Date();
    System.out.println("Start time....."+d);
    System.out.println("before");
	}
	@After
	public  void after() {
	    Date d=new Date();
	    System.out.println("Start time....."+d);
	    System.out.println("after");
	}
	@Test
	public  void test() throws InterruptedException {
     lanuchUrl("https://www.facebook.com/");	
     Login l=new Login();
     sendKeys(l.getTxtUsername(),"purus");
     sendKeys(l.getTxtPassword(),"sdfg");
     click(l.getBtnLogin());
    // Thread.sleep(3000);
     System.out.println("test");
     
	}
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
}
