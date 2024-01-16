package org.pageobjects;

import org.baseclass.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ExplorerPageProductPanning extends BaseClass {

	
public ExplorerPageProductPanning() {
		
		
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(xpath = "//input[@placeholder='Search']")
    private WebElement searchentityname;
	
	
	@FindBy(xpath = "(//span[@class='mdc-list-item__primary-text'])[3]")
    private WebElement clickProductPlanning;
	
	@FindBy(xpath = "//input[@placeholder='C Part Number']")
    private WebElement cPartNumber;
	
	
	@FindBy(xpath = "//input[@placeholder='Current Part Number']")
    private WebElement currentPartNumber;
	
	@FindBy(xpath = "	//input[@placeholder='D Part Number']")
    private WebElement dPartNumber;
	
	
	  public WebElement currentPartNumber() {
			
		  return currentPartNumber;
	
	    }
	
	
	  public WebElement dPartNumber() {
			
		  return dPartNumber;
	
	    }
	
	  public WebElement cPartNumber() {
			
		  return cPartNumber;
	
	    }
	  public void clickProductPlanning() {
			
		  clickProductPlanning.click();
	
	    }
	

	
	  public void searchentityname() {
			
		  searchentityname.click();
		  searchentityname.sendKeys("200-Product Planning");

			
	    }
	
}
