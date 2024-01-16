package org.pageobjects;

import org.baseclass.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ExplorerPage_xSales_Status_Code extends BaseClass {
	
	public ExplorerPage_xSales_Status_Code() {
		
		
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(xpath = "//input[@placeholder='Search']")
    private WebElement searchentityname;
    
    
    @FindBy(xpath="(//span[@class='mdc-list-item__primary-text'])[3]")
    private WebElement clickentityname;
    
    
    @FindBy(xpath="/html[1]/body[1]/sp-root[1]/div[1]/div[1]/sp-body[1]/div[1]/sp-app[1]/sp-entity-data[1]/sp-two-col-three-forth[1]/div[1]/div[2]/div[1]/mat-accordion[1]/mat-expansion-panel[1]/div[1]/div[1]/div[1]/sp-dynamic-form-container[1]/div[1]/sp-dynamic-form[1]/form[1]/div[1]/div[1]/sp-input[2]/div[1]/div[2]/mat-form-field[1]/div[1]/div[1]/div[2]/input[1]")
    private WebElement name;
    
    @FindBy(xpath="/html[1]/body[1]/sp-root[1]/div[1]/div[1]/sp-body[1]/div[1]/sp-app[1]/sp-entity-data[1]/sp-two-col-three-forth[1]/div[1]/div[2]/div[1]/mat-accordion[1]/mat-expansion-panel[1]/div[1]/div[1]/div[1]/sp-dynamic-form-container[1]/div[1]/sp-dynamic-form[1]/form[1]/div[1]/div[1]/sp-input[4]/div[1]/div[2]/mat-form-field[1]/div[1]/div[1]/div[2]/input[1]")
    private WebElement xSalesSaleable;
    
    
    
    @FindBy(xpath="(//mat-icon[@role='img'])[10]")
    private WebElement xSalesStatusCodeFilterBtn;
    
    @FindBy(xpath="(//span[@class='mdc-button__label'])[3]")
    private WebElement xSalesStatusCodeRule;
    
    @FindBy(xpath="(//mat-select[@role='combobox'])[3]")
    private WebElement xSalesStatusFilterDropDown;
    
    @FindBy(xpath="(//span[@class='mdc-list-item__primary-text'])[4]")
    private WebElement xSalesStatusFilterCode;
    
    @FindBy(xpath="(//input[@type='text'])[5]")
    private WebElement xSalesStatusFilterTextBox;
 
    @FindBy(xpath="(//span[@class='mdc-button__label'])[7]")
    private WebElement xSalesStatusFilterApply;
    
  
    public WebElement xSalesStatusFilterTextBox() {
    	return xSalesStatusFilterTextBox;
        
        
    }
    
    public void xSalesStatusFilterApply() {
    	xSalesStatusFilterApply.click();
        
        
    }
    public void xSalesStatusFilterCode() {
    	xSalesStatusFilterCode.click();
        
        
    }
  
    public void xSalesStatusFilterDropDown() {
    	xSalesStatusFilterDropDown.click();
        
        
    }
    
    
    public void xSalesStatusCodeRule() {
    	xSalesStatusCodeRule.click();
        
        
    }
    
    
    
    public void xSalesStatusCodeFilterBtn() {
    	xSalesStatusCodeFilterBtn.click();
        
        
    }
    
    
    public void searchEntityname() {
        searchentityname.click();
        searchentityname.sendKeys("xSales Status Code");
    }
    
    //-------------------------
    public void clickEntityname() {
        clickentityname.click();
        
        
    }
   
      
    public WebElement nameValue() {
            return name;
    }
    public WebElement xSalesSaleableValue() {
            return xSalesSaleable;
    }
	 
}