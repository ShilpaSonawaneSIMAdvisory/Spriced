package org.utils;


import org.baseclass.BaseClass;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.pageobjects.ExplorerPage_010_part;

public class ScrollByVisibleElement extends BaseClass {

    ExplorerPage_010_part rs;
   
    public void ByVisibleElement(WebElement e) {
    	
        JavascriptExecutor js = (JavascriptExecutor)driver;

             
       js.executeScript("arguments[0].scrollIntoView();", e);
		
    }
    
  public void clickElements(WebElement e) {
    	
        JavascriptExecutor jse = (JavascriptExecutor)driver;

             
        jse.executeScript("arguments[0].value='---your email id---';", e);
		
    }
}

