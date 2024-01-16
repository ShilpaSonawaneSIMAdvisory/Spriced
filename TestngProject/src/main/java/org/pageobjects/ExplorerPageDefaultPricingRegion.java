package org.pageobjects;
import java.util.List;

import org.baseclass.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ExplorerPageDefaultPricingRegion extends BaseClass {
	
	
	public ExplorerPageDefaultPricingRegion() {
		
		
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(xpath = "//span[@class='mdc-list-item__primary-text' and contains(text(), ' s_Default Pricing Region ')]")
    private WebElement clickentity;
	
	
	 @FindBy(xpath="/html/body/sp-root/div/div/sp-body/div/sp-app/sp-entity-data/sp-two-col-three-forth/div/div[1]/div/div/sp-data-grid/div/div/sp-header-component-wrapper/div/sp-entity-select/div/mat-form-field[2]/div[1]/div[2]/div/mat-select/div/div[1]")
	 private WebElement enterEntityname;
	 
	 @FindBy(xpath = "//input[@placeholder='Search']")
	 private WebElement searchentityname;
	 
	 @FindBy(xpath = "(//mat-select[@role='combobox'])[5]")
	 private WebElement filterDropDown;
	 
	 @FindBy(xpath = "(//mat-select[@role='combobox'])[7]")
	 private WebElement inputTextBoxFilter;
	 
	 @FindBy(xpath = " (//mat-select[@role='combobox'])[4]")
	 private WebElement region;
	 
	 public WebElement region() {
			
			return region;
				
			}
	
	 
	
	 public WebElement inputTextBoxFilter() {
			
		return inputTextBoxFilter;
			
		}
	 public void filterDropDown() {
			
		 filterDropDown.click();
			
		}
	
	 public void searchentityname() {
		 
		 searchentityname.click();
		 searchentityname.sendKeys("s_Default Pricing Region");
	 }

	 public void enterEntityname() {
			
		 enterEntityname.click();
			
		}
	
	public void clickentity() {
		
		clickentity.click();
		
	}
	
	
	
	
	
}