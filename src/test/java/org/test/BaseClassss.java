package org.test;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClassss {
	
	public static WebDriver driver;
	
	 public static WebDriver  launchBrowser(String browserName) {
		 
		 switch(browserName) {
		 
		 case "chrome":
			 WebDriverManager.chromedriver().setup();
		     driver=new ChromeDriver();
		     driver.manage().window().maximize();
		     break;
		     
		 case"firefox":
			 WebDriverManager.firefoxdriver().setup();
		     driver=new FirefoxDriver();
		     driver.manage().window().maximize();

             break;
		 case "edge":
			 WebDriverManager.edgedriver().setup();
		     driver=new EdgeDriver();
		     driver.manage().window().maximize();

		     break;

		 }
		  
		return driver;

	}
	 public static  void launchUrl(String url) {
driver.get(url);
	}

     
	//return title;    
	//}
	
	//getCurrentUrl
	public static String getCurrentUrl() {
	String currentUrl = driver.getCurrentUrl();
	return currentUrl;	

	}
	//close
	public static void close() {
    driver.close();
	}
	
	//quit
	public static void quit() {
    driver.quit();
	}
	
	//sendKeys
	public static void sendKeys(WebElement e,String name) {
    e.sendKeys(name);
	}
	
//	//click
	public static void click(WebElement e) {
		e.click();

	}
//	//getText
	public static String getText(WebElement e) {
    String text = e.getText();
	return text;
	}
	//getAttribute
	public static String getAttribute(WebElement e) {
    String attribute = e.getAttribute("value");
	return attribute;
	}
	//Actions
	//movetoElement
	public static void movetoElement(WebElement e) {
    Actions a=new Actions(driver);
    a.moveToElement(e).perform();

	}
	
//	//drag and drop
	public static void dragAndDrop(WebElement src,WebElement des) {
	    Actions a=new Actions(driver);
	    a.dragAndDrop(src, des).perform();
	

	}
	
//	//select
//	//selectByIndex
	public static  void selectByIndex(WebElement e,int index) {
		Select s=new Select(e);
		s.selectByIndex(index);

	}
	
	//selectbyValue
	public static  void selectByValue(WebElement e) {
	Select s=new Select(e);
     s.selectByValue("value");
	}
	//selectByVisibleText
	public static void selectByVisibleText(WebElement e) {
		Select s=new Select(e);
     s.selectByVisibleText("value");
	}
	// get option
	public static void getOptions(WebElement e) {
	Select s=new Select(e);
    List<WebElement> options = s.getOptions();
	}
	//doubleClick
	public static void doubleClick(WebElement e) {
	    Actions a=new Actions(driver);
     a.doubleClick(e).perform();

	}
	//context click or rightClick
	
	public static void contextClick(WebElement e) {
	    Actions a=new Actions(driver);
     a.contextClick().perform();

	}
	//Alert and accept
	public static void acceptAlert() {
		Alert a1 = driver.switchTo().alert();
        a1.accept();
	}
	
//	//Alert dismiss
	
	  public static void dismissAlert() {
      Alert a1 = driver.switchTo().alert();
      a1.dismiss();
	}
	
//	//findElement
	
  public static WebElement  findElement( String locatorName,String value) {
  WebElement values=null;
  
      if(locatorName.equals("id")) {
	  values=driver.findElement(By.id(value));
      } 
	  else if(locatorName.equals("name")) {  
	  values=driver.findElement(By.name(value));
	  }
	  
	  else if (locatorName.equals("xpath")) {
	  values=driver.findElement(By.xpath(value));
	  }
	 return values;	  
  }
  
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	


