package org.pageobjects;

import org.baseclass.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ExplorerPagexPricingAdminOwner extends BaseClass {
	

	public ExplorerPagexPricingAdminOwner() {
	
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(xpath = "//input[@placeholder='xPricing Admin Owner']")
	private WebElement searchEntity;
	
	@FindBy(xpath = "//input[@placeholder='xPricing Admin Owner']")
	private WebElement cpmLeadThreshold;
	
	@FindBy(xpath = "//input[@placeholder='Dir PM1 Threshold']")
	private WebElement dirOfPM1Threshold;
	
	@FindBy(xpath = "//input[@placeholder='Dir PM2 Threshold']")
	private WebElement dirOfPM2Threshold;
	
	@FindBy(xpath = "//input[@placeholder='Exec Director Threshold']")
	private WebElement execDirectorThreshold;
	
	@FindBy(xpath = "//input[@placeholder='Brand']")
	private WebElement brand;
	
	public WebElement brand() {
		
		return brand;
	}
	
	public WebElement execDirectorThreshold() {
		
		return execDirectorThreshold;
	}

	public WebElement dirOfPM2Threshold() {
		
		return dirOfPM2Threshold;
	}
	
	public WebElement dirOfPM1Threshold() {
		
		return dirOfPM1Threshold;
	}
	

	public void searchEntity() {
		
		searchEntity.click();
		searchEntity.sendKeys("xPricing Admin Owner");
		
	}
	
	public WebElement cpmLeadThreshold() {
		
		return cpmLeadThreshold;
	}
}
