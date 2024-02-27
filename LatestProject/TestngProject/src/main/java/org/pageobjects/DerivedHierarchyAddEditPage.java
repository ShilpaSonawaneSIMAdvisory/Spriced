package org.pageobjects;

import org.baseclass.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DerivedHierarchyAddEditPage extends BaseClass {

	public DerivedHierarchyAddEditPage() {
		
		
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(xpath="//span[@class='mdc-tab__text-label' and contains(text(), 'Add/Edit')]")
	private WebElement addEditBtn;

	@FindBy(xpath="(//span[@class='mdc-list-item__primary-text'])[2]")
	private WebElement clickEntity;
	
			
	@FindBy(xpath="//div[@class='mat-mdc-select-value ng-tns-c3393473648-8']")
	private WebElement selectModel;
	
	@FindBy(xpath="//input[@placeholder='Search']")
	private WebElement searchModel;
	
	@FindBy(xpath="//input[@placeholder='Search']")
	private WebElement searchEntity;
	
	@FindBy(xpath="//div[@class='mat-mdc-select-value ng-tns-c3393473648-10']")
	private WebElement selectEntity;
	
	@FindBy(xpath="//input[@class='mat-mdc-input-element ng-tns-c1205077789-5 ng-untouched ng-pristine ng-invalid mat-mdc-form-field-input-control mdc-text-field__input cdk-text-field-autofill-monitored']")
	private WebElement addName;
	
	@FindBy(xpath="//input[@class='mat-mdc-input-element ng-tns-c1205077789-6 ng-untouched ng-pristine ng-valid mat-mdc-form-field-input-control mdc-text-field__input cdk-text-field-autofill-monitored']")
	private WebElement addDescription;
	
	@FindBy(xpath="(//span[@class='mdc-list-item__primary-text'])[2]")
	private WebElement clickModel;
	
	@FindBy(xpath="(//button[@color='primary'])[6]")
	private WebElement AddBtnPartOwner;
	
	@FindBy(xpath="//span[@class='mdc-button__label' and contains(text(), 'Save')]")
	private WebElement saveBtn;
	
	
	public void saveBtn() {
		
		saveBtn.click();
	}
	
	public void AddBtnPartOwner() {
		
		AddBtnPartOwner.click();
	}
	


	public void clickEntity() {
		
		clickEntity.click();
	}
	public void clickModel() {
		
		clickModel.click();
	}
	
	public void selectEntity() {
		
		selectEntity.click();
	}
	
	
	public void searchEntity() {
		
		searchEntity.click();
		searchEntity.sendKeys("035 - Base Price");
	}
	
	public void searchModel() {
		
		searchModel.click();
		searchModel.sendKeys("nrp");
	}
	public WebElement addDescription() {
		
		return addDescription;
	}
	
	

	public WebElement addName() {
		
		return addName;
	}
	
	
	
	public void selectModel() {
		
		selectModel.click();
	}
	
	public void clickAddEditBtn() {
		
		addEditBtn.click();
	}
	
}