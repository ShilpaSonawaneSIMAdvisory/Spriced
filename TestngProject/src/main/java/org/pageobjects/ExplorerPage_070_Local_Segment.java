package org.pageobjects;

import org.baseclass.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ExplorerPage_070_Local_Segment extends BaseClass{
	
	public ExplorerPage_070_Local_Segment() {
		
		
		PageFactory.initElements(driver,this);
	}
	
	 
	@FindBy(xpath = "/html[1]/body[1]/sp-root[1]/div[1]/div[1]/sp-body[1]/div[1]/sp-app[1]/sp-entity-data[1]/sp-two-col-three-forth[1]/div[1]/div[1]/div[1]/div[1]/sp-data-grid[1]/div[1]/div[1]/sp-header-component-wrapper[1]/div[1]/sp-entity-select[1]/div[1]/mat-form-field[1]/div[1]/div[2]/div[1]/mat-select[1]/div[1]/div[1]")
	 private WebElement modelname;
	
	@FindBy(xpath = "//input[@placeholder='Search']")
	 private WebElement searchmodelname;
	
	@FindBy(xpath="(//span[@class='mdc-list-item__primary-text'])[3]")
	 private WebElement clickmodelname;
	
	@FindBy(xpath="/html/body/sp-root/div/div/sp-body/div/sp-app/sp-entity-data/sp-two-col-three-forth/div/div[1]/div/div/sp-data-grid/div/div/sp-header-component-wrapper/div/sp-entity-select/div/mat-form-field[2]/div[1]/div[2]/div/mat-select/div/div[1]")
	 private WebElement entityname;
	
	@FindBy(xpath = "//input[@placeholder='Search']")
	 private WebElement searchentityname;
	
	@FindBy(xpath="(//span[@class='mdc-list-item__primary-text'])[3]")
	 private WebElement clickentityname;

	
	@FindBy(xpath="(//mat-select[@role='combobox'])[5]")
	 private WebElement regionalPricingFlag;
	
	@FindBy(xpath="/html/body/sp-root/div/div/sp-body/div/sp-app/sp-entity-data/sp-two-col-three-forth/div/div[2]/div/mat-accordion/mat-expansion-panel[1]/div/div/div/sp-dynamic-form-container/div/sp-dynamic-form/form/div/div/sp-lookup-select[4]/div/div/div[2]/mat-form-field/div[1]/div/div[2]/mat-select/div/div[1]")
	 private WebElement partOwner;
	
	@FindBy(xpath="/html/body/sp-root/div/div/sp-body/div/sp-app/sp-entity-data/sp-two-col-three-forth/div/div[2]/div/mat-accordion/mat-expansion-panel[1]/div/div/div/sp-dynamic-form-container/div/sp-dynamic-form/form/div/div/sp-lookup-select[58]/div/div/div[2]/mat-form-field/div[1]/div/div[2]/mat-select/div/div[1]")
	 private WebElement readyForSegmentation;
	
	@FindBy(xpath="(//input[@type='text'])[22]")
	 private WebElement saleable;
	@FindBy(xpath="/html/body/sp-root/div/div/sp-body/div/sp-app/sp-entity-data/sp-two-col-three-forth/div/div[2]/div/mat-accordion/mat-expansion-panel[1]/div/div/div/sp-dynamic-form-container/div/sp-dynamic-form/form/div/div/sp-lookup-select[18]/div/div/div[2]/mat-form-field/div[1]/div/div[2]/mat-select/div/div[1]")
	 private WebElement ecc;
	@FindBy(xpath="/html/body/sp-root/div/div/sp-body/div/sp-app/sp-entity-data/sp-two-col-three-forth/div/div[2]/div/mat-accordion/mat-expansion-panel[1]/div/div/div/sp-dynamic-form-container/div/sp-dynamic-form/form/div/div/sp-lookup-select[17]/div/div/div[2]/mat-form-field/div[1]/div/div[2]/mat-select/div/div[1]")
	 private WebElement brand;

	@FindBy(xpath="/html/body/sp-root/div/div/sp-body/div/sp-app/sp-entity-data/sp-two-col-three-forth/div/div[2]/div/mat-accordion/mat-expansion-panel[1]/div/div/div/sp-dynamic-form-container/div/sp-dynamic-form/form/div/div/sp-lookup-select[16]/div/div/div[2]/mat-form-field/div[1]/div/div[2]/mat-select/div/div[1]")
	 private WebElement segmentType;
	
	@FindBy(xpath="/html/body/sp-root/div/div/sp-body/div/sp-app/sp-entity-data/sp-two-col-three-forth/div/div[2]/div/mat-accordion/mat-expansion-panel[1]/div/div/div/sp-dynamic-form-container/div/sp-dynamic-form/form/div/div/sp-lookup-select[12]/div/div/div[2]/mat-form-field/div[1]/div/div[2]/mat-select/div/div[1]")
	 private WebElement localsegmentCode;
	
	@FindBy(xpath="/html/body/sp-root/div/div/sp-body/div/sp-app/sp-entity-data/sp-two-col-three-forth/div/div[2]/div/mat-accordion/mat-expansion-panel[1]/div/div/div/sp-dynamic-form-container/div/sp-dynamic-form/form/div/div/sp-input[9]/div[1]/div[2]/mat-form-field/div[1]/div/div[2]/input")
	 private WebElement futureSalesStatusCode;
	
	@FindBy(xpath="//button[@title='Filter']")
	  private WebElement filterBtn;

	  @FindBy(xpath="(//span[@class='mdc-button__label' and contains(text(), 'Rule')])[1]")
	private WebElement ruleFilter;

	 @FindBy(xpath="(//mat-select[@role='combobox'])[68]")
		  private WebElement filterDropDown; 
	 
	  @FindBy(xpath="/html/body/div[2]/div[105]/div/div/mat-option[1]/span/ngx-mat-select-search/div/div/input")
	  private WebElement filterDropDownSearch;

	  @FindBy(xpath="/html/body/div[2]/div[103]/div/mat-dialog-container/div/div/sp-filter/div/div[2]/form/query-builder/div[2]/ul/li/mat-form-field[1]/div[1]/div/div[2]/mat-select/div/div[1]")
		  private WebElement clickDropdown;

	  @FindBy(xpath="/html/body/div[2]/div[103]/div/mat-dialog-container/div/div/sp-filter/div/div[2]/form/query-builder/div[2]/ul/li/div[2]/input")
	  private WebElement filterTextBox;

      @FindBy(xpath="(//span[@class='mdc-button__label' and contains(text(), 'Apply')])[1]")
	  private WebElement FilterApply;
      
      //
      
      @FindBy(xpath="/html/body/div[2]/div[105]/div/div/mat-option[3]/span")
	  private WebElement partNumberFilter;
      
      @FindBy(xpath="(//span[@class='mdc-button__label'])[122]")
	  private WebElement saveButton;
      
      @FindBy(xpath="//button[@title='Refresh']")
	  private WebElement refresh;
      
      public void refresh() {
    	  refresh.click();
  		 
  	 }
     
    
      public void saveButton() {
    	  saveButton.click();
  		 
  	 }
      
      public void clickDropdown() {
    	  clickDropdown.click();
  		 
  	 }
      
      public void partNumberFilter() {
    	  partNumberFilter.click();
  		 
  	 }
      
  	public void filterBtn() {
  		filterBtn.click();
		 
	 }
  	public void ruleFilter() {
  		ruleFilter.click();
		 
	 }
  	public void filterDropDown() {
  		filterDropDown.click();
		 
	 }
  	public void filterDropDownSearch() {
  		filterDropDownSearch.click();
  		filterDropDownSearch.sendKeys("Part Number");
		 
	 }
  	public WebElement filterTextBox() {
  		return filterTextBox;
		 
	 }
  	public void FilterApply() {
  		FilterApply.click();
		 
	 }
	
	
	
	public void enterModelname() {
		 modelname.click();
		 
	 }
	 public void searcModelname() {
		 searchmodelname.click();
		 searchmodelname.sendKeys("nrp");

	}
	 public void clickModelname() {
		 clickmodelname.click();
	 }
	 
	 public void enterEntityname() {
		 entityname.click();
		 
	 }
	 
	 public void searchEntityname() {
		 searchentityname.click();
		 searchentityname.sendKeys("070 - Local Part Pricing");
	 }
	 
	 public void clickEntityname() {
		 clickentityname.click();
		
		 
	 }
	 
	 public WebElement regionalPricingFlag() { 
		 return regionalPricingFlag;
		
	 } 
	 
	 public WebElement partOwner() { 
		 return partOwner;
		
	 } 
	 
	 
	 public WebElement readyForSegmentation() { 
		 return readyForSegmentation;
		
	 } 
	 public WebElement ecc() { 
		 return ecc;
		
	 } 
	 public WebElement brand() { 
		 return brand;
		
	 } 
	 public WebElement saleable() { 
		 return saleable;
		
	 } 
	 public WebElement segmentType() { 
		 return segmentType;
		
	 } 
	 public WebElement localsegment() { 
		 return localsegmentCode;
		
	 } 
	 public WebElement futureSalesStatusCode() { 
		 return futureSalesStatusCode;
		
	 } 
	 
	 
	 
	 
	 
}



