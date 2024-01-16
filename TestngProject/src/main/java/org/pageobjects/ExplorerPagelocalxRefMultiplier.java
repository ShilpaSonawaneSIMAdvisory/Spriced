package org.pageobjects;

import org.baseclass.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ExplorerPagelocalxRefMultiplier extends BaseClass {

	
public ExplorerPagelocalxRefMultiplier() {
		
		
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(xpath = "//input[@placeholder='Search']")
	 private WebElement searchEntity;
	
	@FindBy(xpath = "(//mat-select[@role='combobox'])[4]")
	 private WebElement xRefJV;
	
	@FindBy(xpath = "(//mat-select[@role='combobox'])[4]")
	 private WebElement xRefMultiplier;
	
	public WebElement xRefMultiplier() {
		
		return xRefMultiplier;
		
	}
	
	public WebElement xRefJV() {
		
		return xRefJV;
		
	}
	
	public void searchEntity() {
		
		searchEntity.click();
		searchEntity.sendKeys("Local xRef Multiplier");
		
	}
}
