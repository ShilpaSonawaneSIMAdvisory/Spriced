package org.pageobjects;

import org.baseclass.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ExplorerPageLocalSegment extends BaseClass{
	
public ExplorerPageLocalSegment() {
		
		
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(xpath = "//input[@placeholder='Search']")
	 private WebElement searchEntity;
	
	@FindBy(xpath = "(//span[@class='mdc-list-item__primary-text'])[3]")
	 private WebElement clickEntity;
	
	@FindBy(xpath = "//input[@type='number']")
	 private WebElement filterInputBox;
	
	@FindBy(xpath = "(//mat-select[@role='combobox'])[50]")
	 private WebElement filterDropDown;
	
	@FindBy(xpath = "(//mat-select[@role='combobox'])[4]")
	 private WebElement pricingActionMethod;
	
	@FindBy(xpath = "//input[@placeholder='Pricing Action Value']")
	 private WebElement pricingActionValue;
	
	public WebElement pricingActionValue() {
		
		return pricingActionValue;
	}
	
	public WebElement filterInputBox() {
		
		return filterInputBox;
	}
	
	
	
	public WebElement pricingActionMethod() {
		
		return pricingActionMethod;
	}
	
	
	
	public void filterDropDown() {
		
		filterDropDown.click();
	}
	
	
	public void searchEntity() {
		
		searchEntity.click();
		searchEntity.sendKeys("Local Segment");
		
	}
	
	public void clickEntityname() {
		
		clickEntity.click();
	}

}
