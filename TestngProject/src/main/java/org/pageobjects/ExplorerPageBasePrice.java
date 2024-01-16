package org.pageobjects;

import org.baseclass.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ExplorerPageBasePrice extends BaseClass {
	
	
	public ExplorerPageBasePrice() {
		
		
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(xpath = "//input[@placeholder='Search']")
    private WebElement searchentityname;
	
	@FindBy(xpath = "(//span[@class='mdc-list-item__primary-text'])[3]")
    private WebElement clickBasePrice;
	
	@FindBy(xpath = "//input[@placeholder='Currency']")
    private WebElement currency;
	
	@FindBy(xpath = "//input[@placeholder='Current Price']")
    private WebElement currentPrice;
	
	@FindBy(xpath = "//input[@placeholder='Publish Price']")
    private WebElement publishPrice;
	
    public WebElement publishPrice() {
		return publishPrice;	
      
    }
	
    public WebElement currentPrice() {
		return currentPrice;	
      
    }
	
    public WebElement currency() {
		return currency;	
      
    }
	 
	
    public void searchentitynameBasePrice() {
    	searchentityname.click();
    	searchentityname.sendKeys("035-Base Price");
      
    }
    
    public void clickBasePrice() {
    	clickBasePrice.click();
    	
    }
    

}
