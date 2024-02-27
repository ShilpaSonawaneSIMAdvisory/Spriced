package org.pageobjects;//rename to lowercase

import java.util.List;

import org.baseclass.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ExplorerPage_010_part extends BaseClass {//rename Explorer_010_Part
	
	public ExplorerPage_010_part() {
		
		
		PageFactory.initElements(driver,this);
	}
    
 @FindBy(xpath = "/html[1]/body[1]/sp-root[1]/div[1]/div[1]/sp-body[1]/div[1]/sp-app[1]/sp-entity-data[1]/sp-two-col-three-forth[1]/div[1]/div[1]/div[1]/div[1]/sp-data-grid[1]/div[1]/div[1]/sp-header-component-wrapper[1]/div[1]/sp-entity-select[1]/div[1]/mat-form-field[1]/div[1]/div[2]/div[1]/mat-select[1]/div[1]/div[1]")
 private WebElement modelname;

//div[@id='cdk-overlay-1']
 

@FindBy(xpath = " /html[1]/body[1]/div[2]/div[3]/div[1]/div[1]/mat-option[2]/span[1]")
private WebElement selectTagEntity;
 //
 @FindBy(xpath = "//input[@placeholder='Search']")
 private WebElement searchmodelname;
 
 @FindBy(xpath="(//span[@class='mdc-list-item__primary-text'])[3]")
 private WebElement clickmodelname;
 
 //@FindBy(xpath="/html[1]/body[1]/sp-root[1]/div[1]/div[1]/sp-body[1]/div[1]/sp-app[1]/sp-entity-data[1]/sp-two-col-three-forth[1]/div[1]/div[1]/div[1]/div[1]/sp-data-grid[1]/div[1]/div[1]/sp-header-component-wrapper[1]/div[1]/sp-entity-select[1]/div[1]/mat-form-field[2]/div[1]/div[2]/div[1]/mat-select[1]/div[1]/div[1]/span[1]/span[1]")
 @FindBy(xpath="/html/body/sp-root/div/div/sp-body/div/sp-app/sp-entity-data/sp-two-col-three-forth/div/div[1]/div/div/sp-data-grid/div/div/sp-header-component-wrapper/div/sp-entity-select/div/mat-form-field[2]/div[1]/div[2]/div/mat-select/div/div[1]")
 private WebElement entityname;
 
 ///html/body/sp-root/div/div/sp-body/div/sp-app/sp-entity-data/sp-two-col-three-forth/div/div[1]/div/div/sp-data-grid/div/div/sp-header-component-wrapper/div/sp-entity-select/div/mat-form-field[2]/div[1]/div[2]/div/mat-select/div/div[1]
 
//(//span[@class='mdc-list-item__primary-text'])[6]
 @FindBy(xpath = "//input[@placeholder='Search']")
 private WebElement searchentityname;
 
 //
 @FindBy(xpath="/html/body/div[2]/div[3]/div/div/mat-option[4]")
 private WebElement scrollentityname;
 @FindBy(xpath="(//span[@class='mdc-list-item__primary-text'])[3]")
 private WebElement clickentityname;
 
 //(//span[@class='mdc-list-item__primary-text'])[6]
 //@FindBy(xpath="/html/body/div[2]/div[3]/div/div/mat-option[4]")
 //private WebElement clickentitynameP;
 
// (//span[@class='mdc-list-item__primary-text' and contains(text(),'Part')])[4]
 //html[1]/body[1]/div[2]/div[3]/div[1]/div[1]/mat-option[3]/span[1]
 //html/body/div[2]/div[3]/div/div/mat-option[6]/span
 //
 
 @FindBy(xpath=" /html/body/div[2]/div[3]/div/div/mat-option[3]")
 private WebElement partOwnerGlobal;
 
 

 @FindBy(xpath="(//div[@class='datatable-row-center datatable-row-group ng-star-inserted'])[9]")
 private WebElement clickgrid;
 
 
 @FindBy(xpath="/html[1]/body[1]/sp-root[1]/div[1]/div[1]/sp-body[1]/div[1]/sp-app[1]/sp-entity-data[1]/sp-two-col-three-forth[1]/div[1]/div[1]/div[1]/div[1]/sp-data-grid[1]/ngx-datatable[1]/div[1]/datatable-body[1]/datatable-selection[1]/datatable-scroller[1]/datatable-row-wrapper[1]/datatable-body-row[1]/div[2]/datatable-body-cell[2]/div[1]")
 private WebElement checkfirstgrid;
 
 
 //(//div[@class='datatable-row-center datatable-row-group ng-star-inserted'])[1]
 @FindBy(xpath="//input[@id='mat-input-19']")
 private WebElement name;
 
 @FindBy(xpath="//input[@placeholder='Code']")
 private WebElement codePartNumber;

 @FindBy(xpath="//input[@id='mat-input-22']")
 private WebElement pricingAdminOwner;
 
 @FindBy(xpath="//input[@id='mat-input-23']")
 private WebElement productBu;
 

 
 @FindBy(xpath="/html/body/sp-root/div/div/sp-body/div/sp-app/sp-entity-data/sp-two-col-three-forth/div/div[2]/div/mat-accordion/mat-expansion-panel[1]/div/div/div/sp-dynamic-form-container/div/sp-dynamic-form/form/div/div/sp-lookup-select[1]/div/div/div[2]/mat-form-field/div[1]/div/div[2]/mat-select/div/div[1]")
 private WebElement partOwner;
 
 @FindBy(xpath="//input[@placeholder='Search']")
 private WebElement part_owner_search;
 //(//span[contains(text(),'Global')])[2]
 @FindBy(xpath=" //span[contains(text(),' {Global} ')]")
 private WebElement clickGlobal;
 
 @FindBy(xpath="//div[@id='mat-select-value-45']")
 private WebElement wpt;
 
 @FindBy(xpath="/html/body/sp-root/div/div/sp-body/div/sp-app/sp-entity-data/sp-two-col-three-forth/div/div[2]/div/mat-accordion/mat-expansion-panel[1]/div/div/div/sp-dynamic-form-container/div/sp-dynamic-form/form/div/div/sp-lookup-select[60]/div/div/div[2]/mat-form-field/div[1]/div/div[2]/mat-select")
 private WebElement priority;
 
 @FindBy(xpath="/html/body/sp-root/div/div/sp-body/div/sp-app/sp-entity-data/sp-two-col-three-forth/div/div[2]/div/mat-accordion/mat-expansion-panel[1]/div/div/div/sp-dynamic-form-container/div/sp-dynamic-form/form/div/div/sp-input[26]/div[1]/div[2]/mat-form-field/div[1]/div/div[2]/input")
 private WebElement saleable;
 
 @FindBy(xpath="/html/body/sp-root/div/div/sp-body/div/sp-app/sp-entity-data/sp-two-col-three-forth/div/div[2]/div/mat-accordion/mat-expansion-panel[1]/div/div/div/sp-dynamic-form-container/div/sp-dynamic-form/form/div/div/sp-input[56]/div[1]/div[2]/mat-form-field/div[1]/div/div[2]/input")
 private WebElement basePart;

 //
 @FindBy(xpath="/html/body/sp-root/div/div/sp-body/div/sp-app/sp-entity-data/sp-two-col-three-forth/div/div[2]/div/mat-accordion/mat-expansion-panel[1]/div/div/div/sp-dynamic-form-container/div/sp-dynamic-form/form/div/div/sp-lookup-select[52]/div/div/div[2]/mat-form-field/div[1]/div/div[2]/mat-select/div/div[1]")
 private WebElement futureSalesStatusCode;
 
 @FindBy(xpath="//div[@id='mat-select-value-133']")
 private WebElement transmissionModel;
 
 @FindBy(xpath="/html/body/sp-root/div/div/sp-body/div/sp-app/sp-entity-data/sp-two-col-three-forth/div/div[2]/div/mat-accordion/mat-expansion-panel[1]/div/div/div/sp-dynamic-form-container/div/sp-dynamic-form/form/div/div/sp-lookup-select[7]/div/div/div[2]/mat-form-field/div[1]/div/div[2]/mat-select/div/div[1]")
 private WebElement SegmentType010part;
 

 @FindBy(xpath="/html/body/sp-root/div/div/sp-body/div/sp-app/sp-entity-data/sp-two-col-three-forth/div/div[2]/div/mat-accordion/mat-expansion-panel[1]/div/div/div/sp-dynamic-form-container/div/sp-dynamic-form/form/div/div/sp-lookup-select[49]/div/div/div[2]/mat-form-field/div[1]/div/div[2]/mat-select")
 private WebElement readyForSegmentation;
 
 //
 @FindBy(xpath="/html/body/sp-root/div/div/sp-body/div/sp-app/sp-entity-data/sp-two-col-three-forth/div/div[2]/div/mat-accordion/mat-expansion-panel[1]/div/div/div/sp-dynamic-form-container/div/sp-dynamic-form/form/div/div/sp-lookup-select[28]/div/div/div[2]/mat-form-field")
 private WebElement information;
 

 @FindBy(xpath="//input[@placeholder='Search']")
 private WebElement searchReadyForSegmentation;
 
 @FindBy(xpath="(//span[@class='mdc-list-item__primary-text'])[3]")
 private WebElement clickReadyForSegmentation;
 
 @FindBy(xpath="//span[contains(text(),'1 {Yes}')]")
 private WebElement clickReadyForSegmentationYes;
 

 
 @FindBy(xpath="//(//span[@class='mat-mdc-focus-indicator'])[58]]")
 private WebElement clickPencilIcon;
 
 
 @FindBy(xpath="/html/body/sp-root/div/div/sp-body/div/sp-app/sp-entity-data/sp-two-col-three-forth/div/div[2]/div/mat-accordion/mat-expansion-panel[1]/div/div/div/sp-dynamic-form-container/div/sp-dynamic-form/form/div/div/sp-lookup-select[8]/div/div/div[2]/mat-form-field/div[1]/div/div[2]/mat-select")
 private WebElement brand;

 @FindBy(xpath="/html/body/sp-root/div/div/sp-body/div/sp-app/sp-entity-data/sp-two-col-three-forth/div/div[2]/div/mat-accordion/mat-expansion-panel[1]/div/div/div/sp-dynamic-form-container/div/sp-dynamic-form/form/div/div/sp-lookup-select[9]/div/div/div[2]/mat-form-field/div[1]/div/div[2]/mat-select")
 private WebElement ecc;
 
 @FindBy(xpath="//div[@id='mat-select-value-65']")
 private WebElement engineType;
 
 //@FindBy(xpath="/html[1]/body[1]/sp-root[1]/div[1]/div[1]/sp-body[1]/div[1]/sp-app[1]/sp-entity-data[1]/sp-two-col-three-forth[1]/div[1]/div[2]/div[1]/mat-accordion[1]/mat-expansion-panel[1]/div[1]/div[1]/div[1]/sp-dynamic-form-container[1]/div[1]/sp-dynamic-form[1]/form[1]/div[1]/div[1]/sp-lookup-select[6]/div[1]/div[1]/div[2]/mat-form-field[1]/div[1]/div[1]/div[2]/mat-select[1]/div[1]/div[1]/span[1]/span[1]\r\n")
 //private WebElement segment;
 @FindBy(xpath="/html/body/sp-root/div/div/sp-body/div/sp-app/sp-entity-data/sp-two-col-three-forth/div/div[2]/div/mat-accordion/mat-expansion-panel[1]/div/div/div/sp-dynamic-form-container/div/sp-dynamic-form/form/div/div/sp-lookup-select[6]/div/div/div[2]/mat-form-field/div[1]/div/div[2]/mat-select/div/div[1]")
 private WebElement segment;
 
 
 @FindBy(xpath="(//span[@class='mdc-list-item__primary-text'])[3]")
 private WebElement readyForSegmentationNo;
 
 //@FindBy(xpath="//span[contains(text(),' 0 {No} ')]")
 //private WebElement readyForSegmentationNo;
 
//mat-option[@id='mat-option-1152']
 @FindBy(xpath="(//span[@class='mdc-list-item__primary-text'])[3]")
 private WebElement readyForSegmentationYes;
 
 

@FindBy(xpath="/html/body/div[2]/div[3]/div/div/mat-option[4]")
private WebElement partOwnerNotGlobal;


  @FindBy(xpath="//mat-option[@id='mat-option-1252']")
 private WebElement clickReadyForSegmentationDropdown;
 
 //(//span[@class='mat-mdc-focus-indicator'])[58]]
 //(//datatable-body-row[@role='row'])[1]

  
  @FindBy(xpath="//span[contains(text(),'--Select--')]")
 private WebElement segementSelect;
  


  
  
  
  @FindBy(xpath="//button[@type='submit']")
 private WebElement save;
  
  //@FindBy(xpath="/html/body/div[2]/div[3]/div/div/mat-option[3]")
  
  @FindBy(xpath="/html/body/div[2]/div[3]/div/div/mat-option[5]/span")
  
 //html/body/div[2]/div[3]/div/div/mat-option[6]/span
 private WebElement Segment;
  
 
		  
		  @FindBy(xpath="/html/body/div[2]/div[3]/div/div/mat-option[0]")
  			private WebElement partOwnerSelect;

  @FindBy(xpath="//mat-option[@id='mat-option-1344']")
 private WebElement selectPartOwnwerGlobal;
  
  @FindBy(xpath="//input[@placeholder='Search']")
  private WebElement searchPartOwnwerGlobal;
  
  @FindBy(xpath="/html/body/div[2]/div[3]/div/mat-dialog-container/div/div/sp-lookup-dialog/div[1]/ngx-datatable/div/datatable-body/datatable-selection/datatable-scroller/datatable-row-wrapper[35]/datatable-body-row/div[2]")
  private WebElement selectOEMUnique;
  
  @FindBy(xpath="(//button[@class='border-r-primary-light border-solid cursor-pointer flex flex-row h-full pl-2 pr-1 text-white ng-star-inserted'])[4]")
  private WebElement filterBtn;
  
  @FindBy(xpath="(//button[@class='ml-2 mdc-button mdc-button--raised mat-mdc-raised-button mat-primary _mat-animation-noopable mat-mdc-button-base ng-star-inserted'])[1]")
  private WebElement ruleTab;
  
  
		  
		  @FindBy(xpath="/html/body/div[2]/div[3]/div/mat-dialog-container/div/div/sp-lookup-dialog/div[2]/button[1]")
  private WebElement informationPopupSubmitBtn;
  
@FindBy(xpath="/html/body/sp-root/div/div/sp-body/div/sp-app/sp-entity-data/sp-two-col-three-forth/div/div[2]/div/mat-accordion/mat-expansion-panel[1]/div/div/div/sp-dynamic-form-container/div/sp-dynamic-form/form/div/div/sp-lookup-select[28]/div/div/div[2]/button[1]")
private WebElement informationPencilIcon;
		  
	@FindBy(xpath="/html[1]/body[1]/sp-root[1]/div[1]/div[1]/sp-body[1]/div[1]/sp-app[1]/sp-entity-data[1]/sp-two-col-three-forth[1]/div[1]/div[2]/div[1]/mat-accordion[1]/mat-expansion-panel[1]/div[1]/div[1]/div[1]/sp-dynamic-form-container[1]/div[1]/sp-dynamic-form[1]/form[1]/div[1]/div[1]/sp-lookup-select[6]/div[1]/div[1]/div[2]/button[2]")
	private WebElement relatedEntitysegment;
	

	  @FindBy(xpath="(//span[@class='mat-mdc-focus-indicator'])[14]")
private WebElement clearSegment;
	

	  @FindBy(xpath="(//span[@class='mdc-button__label' and contains(text(), 'Rule')])[1]")
private WebElement ruleFilter;
	  
	  @FindBy(xpath="(//mat-select[@role='combobox'])[68]")
	  private WebElement filterDropDown; 
	  
	  
	  @FindBy(xpath="/html[1]/body[1]/div[2]/div[35]/div[1]/div[1]/mat-option[1]/span[1]/ngx-mat-select-search[1]/div[1]/div[1]/input[1]")
	  private WebElement filterDropDownSearch;
	  
	  @FindBy(xpath="//button[@title='Add Filter']")
	  private WebElement filterSegment;
	  
	  @FindBy(xpath="//button[@class='edit-button ml-2 mdc-button mdc-button--raised mat-mdc-raised-button mat-primary _mat-animation-noopable mat-mdc-button-base ng-star-inserted']")
	  private WebElement filterPencilIcon;
	  
	  @FindBy(xpath="(//mat-select[@role='combobox'])[70]")
	  private WebElement SegmentFilterDropDown;
	  
	  @FindBy(xpath="(//span[@class='mdc-list-item__primary-text'])[4]")
	  private WebElement SegmentFilterCode;
	  

	  @FindBy(xpath="(//mat-icon[@role='img'])[17]")
	  private WebElement refreshButton;
	  

	  @FindBy(xpath="(//span[@class='mat-mdc-focus-indicator'])[100]")
	  private WebElement readyForSegmentationCloseBtn;
	  

	  @FindBy(xpath="/html/body/div[2]/div[6]/div/mat-dialog-container/div/div/sp-filter/div/div[2]/form/query-builder/div[2]/ul/li/div[2]/input")
	  private WebElement SegmentFilterTextBox;
	  
	  @FindBy(xpath="(//span[@class='mdc-button__label' and contains(text(), 'Apply')])[2]")
	  private WebElement segmentFilterApply;
	  
	  @FindBy(xpath="(//span[@class='mdc-button__label' and contains(text(), 'Apply')])[1]")
	  private WebElement FilterApply;
	  
	  @FindBy(xpath="//span[@class='mdc-button__label' and contains(text(),'Submit')]")
	  private WebElement segmentSubmit;
	  
	  @FindBy(xpath="(//span[@class='mdc-button__label' and 'Rule'])[142]")
	  private WebElement segmentRule;
	  
	  @FindBy(xpath="(//input[@type='text'])[63]")
	  private WebElement codeTextBox;
	  
	  @FindBy(xpath="(//div[@class='datatable-row-center datatable-row-group ng-star-inserted'])[51]")
	  private WebElement segmentFirstGrid;
	  
	  @FindBy(xpath="(//span[@class='mat-mdc-button-persistent-ripple mdc-button__ripple'])[140]")
	  private WebElement segmentSubmitBtn;
	  
	  @FindBy(xpath="(//button[@class='border-r-primary-light border-solid cursor-pointer flex flex-row h-full pl-2 pr-1 text-white ng-star-inserted'])[4]")
	  private WebElement removeFilterBtn;
	  
	  @FindBy(xpath="(//mat-icon[@class='mat-icon notranslate material-icons mat-ligature-font mat-icon-no-color'])[1]")
	  private WebElement partOwnerCloseBtn;
	  
	  @FindBy(xpath="(//span[@class='mdc-list-item__primary-text'])[4]")
	  private WebElement partOwnerChinaLocal;
	  
	  @FindBy(xpath="(//span[@class='mdc-list-item__primary-text'])[4]")
	  private WebElement filterCode;
	  
	  @FindBy(xpath="(//input[@type='text'])[63]")
	  private WebElement filterTextBox;
	  
	  @FindBy(xpath="//input[@placeholder='Business Owner']")
	  private WebElement businessOwner;
	  
	  @FindBy(xpath="(//span[@class='mdc-list-item__primary-text'])[3]")
	  private WebElement sanityModelCreateRecord;
	  
		 @FindBy(xpath="/html/body/sp-root/div/div/sp-body/div/sp-app/sp-entity-data/sp-two-col-three-forth/div/div[2]/div/mat-accordion/mat-expansion-panel[1]/div/div/div/sp-dynamic-form-container/div/sp-dynamic-form/form/div/div/sp-lookup-select[16]/div/div/div[2]/mat-form-field/div[1]/div/div[2]/mat-select/div/div[1]")
		 private WebElement jvIdentifierPart;
		 
		 @FindBy(xpath="/html/body/sp-root/div/div/sp-body/div/sp-app/sp-entity-data/sp-two-col-three-forth/div/div[2]/div/mat-accordion/mat-expansion-panel[1]/div/div/div/sp-dynamic-form-container/div/sp-dynamic-form/form/div/div/sp-lookup-select[2]/div/div/div[2]/mat-form-field/div[1]/div/div[2]/mat-select/div/div[1]")
		 private WebElement uniqueCommomPart;
		 
		  @FindBy(xpath="/html/body/sp-root/div/div/sp-body/div/sp-app/sp-entity-data/sp-two-col-three-forth/div/div[2]/div/mat-accordion/mat-expansion-panel[1]/div/div/div/sp-dynamic-form-container/div/sp-dynamic-form/form/div/div/sp-lookup-select[11]/div/div/div[2]/mat-form-field/div[1]/div/div[2]/mat-select/div/div[1]")
		  private WebElement engineModel;
		  
		  @FindBy(xpath="/html/body/sp-root/div/div/sp-body/div/sp-app/sp-entity-data/sp-two-col-three-forth/div/div[2]/div/mat-accordion/mat-expansion-panel[1]/div/div/div/sp-dynamic-form-container/div/sp-dynamic-form/form/div/div/sp-lookup-select[12]/div/div/div[2]/mat-form-field/div[1]/div/div[2]/mat-select/div/div[1]/span/span")
		  private WebElement certificationLevel;
		  
		  @FindBy(xpath="/html/body/sp-root/div/div/sp-body/div/sp-app/sp-entity-data/sp-two-col-three-forth/div/div[2]/div/mat-accordion/mat-expansion-panel[1]/div/div/div/sp-dynamic-form-container/div/sp-dynamic-form/form/div/div/sp-lookup-select[13]/div/div/div[2]/mat-form-field/div[1]/div/div[2]/mat-select/div/div[1]")
		  private WebElement displacementLitre;
		  
		  
		  @FindBy(xpath="/html/body/sp-root/div/div/sp-body/div/sp-app/sp-entity-data/sp-two-col-three-forth/div/div[2]/div/mat-accordion/mat-expansion-panel[1]/div/div/div/sp-dynamic-form-container/div/sp-dynamic-form/form/div/div/sp-lookup-select[14]/div/div/div[2]/mat-form-field/div[1]/div/div[2]/mat-select/div/div[1]")
		  private WebElement marketApplication;
		  
		  @FindBy(xpath="/html/body/sp-root/div/div/sp-body/div/sp-app/sp-entity-data/sp-two-col-three-forth/div/div[2]/div/mat-accordion/mat-expansion-panel[1]/div/div/div/sp-dynamic-form-container/div/sp-dynamic-form/form/div/div/sp-lookup-select[15]/div/div/div[2]/mat-form-field/div[1]/div/div[2]/mat-select/div/div[1]/span/span")
		  private WebElement engineType1; 
		  
		  
		  @FindBy(xpath="/html/body/sp-root/div/div/sp-body/div/sp-app/sp-entity-data/sp-two-col-three-forth/div/div[2]/div/mat-accordion/mat-expansion-panel[1]/div/div/div/sp-dynamic-form-container/div/sp-dynamic-form/form/div/div/sp-lookup-select[34]/div/div/div[2]/mat-form-field/div[1]/div/div[2]/mat-select/div/div[1]")
		  private WebElement electricVoltage;
		  
		  @FindBy(xpath="/html/body/sp-root/div/div/sp-body/div/sp-app/sp-entity-data/sp-two-col-three-forth/div/div[2]/div/mat-accordion/mat-expansion-panel[1]/div/div/div/sp-dynamic-form-container/div/sp-dynamic-form/form/div/div/sp-lookup-select[32]/div/div/div[2]/mat-form-field/div[1]/div/div[2]/mat-select/div/div[1]")
		  private WebElement electricOutput;
		  
		  @FindBy(xpath="/html/body/sp-root/div/div/sp-body/div/sp-app/sp-entity-data/sp-two-col-three-forth/div/div[2]/div/mat-accordion/mat-expansion-panel[1]/div/div/div/sp-dynamic-form-container/div/sp-dynamic-form/form/div/div/sp-lookup-select[33]/div/div/div[2]/mat-form-field/div[1]/div/div[2]/mat-select/div/div[1]")
		  private WebElement electricTechnology;
		  
		 
		  
		  @FindBy(xpath="/html/body/sp-root/div/div/sp-body/div/sp-app/sp-entity-data/sp-two-col-three-forth/div/div[2]/div/mat-accordion/mat-expansion-panel[1]/div/div/div/sp-dynamic-form-container/div/sp-dynamic-form/form/div/div/sp-lookup-select[35]/div/div/div[2]/mat-form-field/div[1]/div/div[2]/mat-select/div/div[1]/span/span")
		  private WebElement electricInterface;
		  
		  @FindBy(xpath="/html/body/sp-root/div/div/sp-body/div/sp-app/sp-entity-data/sp-two-col-three-forth/div/div[2]/div/mat-accordion/mat-expansion-panel[1]/div/div/div/sp-dynamic-form-container/div/sp-dynamic-form/form/div/div/sp-lookup-select[36]/div/div/div[2]/mat-form-field/div[1]/div/div[2]/mat-select/div/div[1]")
		  private WebElement noOfChargePorts;
		  
		  @FindBy(xpath="/html/body/sp-root/div/div/sp-body/div/sp-app/sp-entity-data/sp-two-col-three-forth/div/div[2]/div/mat-accordion/mat-expansion-panel[1]/div/div/div/sp-dynamic-form-container/div/sp-dynamic-form/form/div/div/sp-lookup-select[37]/div/div/div[2]/mat-form-field/div[1]/div/div[2]/mat-select/div/div[1]/span/span")
		  private WebElement pantograph;
		  
		  
		  @FindBy(xpath="/html/body/sp-root/div/div/sp-body/div/sp-app/sp-entity-data/sp-two-col-three-forth/div/div[2]/div/mat-accordion/mat-expansion-panel[1]/div/div/div/sp-dynamic-form-container/div/sp-dynamic-form/form/div/div/sp-lookup-select[38]/div/div/div[2]/mat-form-field/div[1]/div/div[2]/mat-select/div/div[1]")
		  private WebElement acChargePort;
		  
		  @FindBy(xpath="/html/body/sp-root/div/div/sp-body/div/sp-app/sp-entity-data/sp-two-col-three-forth/div/div[2]/div/mat-accordion/mat-expansion-panel[1]/div/div/div/sp-dynamic-form-container/div/sp-dynamic-form/form/div/div/sp-lookup-select[39]/div/div/div[2]/mat-form-field/div[1]/div/div[2]/mat-select/div/div[1]")
		  private WebElement energy;
		  
		  @FindBy(xpath="/html/body/sp-root/div/div/sp-body/div/sp-app/sp-entity-data/sp-two-col-three-forth/div/div[2]/div/mat-accordion/mat-expansion-panel[1]/div/div/div/sp-dynamic-form-container/div/sp-dynamic-form/form/div/div/sp-lookup-select[40]/div/div/div[2]/mat-form-field/div[1]/div/div[2]/mat-select/div/div[1]/span/span")
		  private WebElement capacity;
		  
		  @FindBy(xpath="/html/body/sp-root/div/div/sp-body/div/sp-app/sp-entity-data/sp-two-col-three-forth/div/div[2]/div/mat-accordion/mat-expansion-panel[1]/div/div/div/sp-dynamic-form-container/div/sp-dynamic-form/form/div/div/sp-lookup-select[41]/div/div/div[2]/mat-form-field/div[1]/div/div[2]/mat-select/div/div[1]/span/span")
		  private WebElement electrificationProgram;
		  
		  @FindBy(xpath="/html/body/sp-root/div/div/sp-body/div/sp-app/sp-entity-data/sp-two-col-three-forth/div/div[2]/div/mat-accordion/mat-expansion-panel[1]/div/div/div/sp-dynamic-form-container/div/sp-dynamic-form/form/div/div/sp-lookup-select[47]/div/div/div[2]/mat-form-field/div[1]/div/div[2]/mat-select/div/div[1]/span/span")
		  private WebElement manufacture;
		  
		  @FindBy(xpath="//span[@class='mdc-list-item__primary-text' and contains(text(),'Code')]")
		  private WebElement filterCodeOption;
		  

		  @FindBy(xpath="//input[@placeholder='Resulting Cost']")
		  private WebElement resultingCostField;

		  @FindBy(xpath="")
		  private WebElement locallySourcedCode;
		  
		  public WebElement locallySourcedCode() { 
			return locallySourcedCode;
				
			 }
		  
		  public void filterCodeOption() { 
				filterCode.click();;
				
			 }
		
		  
		  
		  public WebElement electrificationProgram() { 
				return electrificationProgram;
				
			 }
		  
		  public WebElement electricTechnology() { 
				return electricTechnology;
				
			 }
		  
		  
		  public WebElement electricOutput() { 
				return electricOutput;
				
			 }
		  
		  public WebElement manufacture() { 
				return manufacture;
				
			 }
		  
		  
		  
		  public WebElement capacity() { 
				return capacity;
				
			 }
		  public WebElement energy() { 
				return energy;
				
			 }
		  
		  
		  public WebElement acChargePort() { 
				return acChargePort;
				
			 }
		  
		  
		  
		  public WebElement pantograph() { 
				return pantograph;
				
			 }
		  
		  public WebElement noOfChargePorts() { 
				return noOfChargePorts;
				
			 }
		  
		  
		  public WebElement electricInterface() { 
				return electricInterface;
				
			 }
		  
		  
		  public WebElement electricVoltage() { 
				return electricVoltage;
				
			 }
		  
		  public WebElement engineType1() { 
				return engineType1;
				
			 }
		  
		  
		  
		  
		  public WebElement marketApplication() { 
				return marketApplication;
				
			 }
		  
		  
		  
		  public WebElement displacementLitre() { 
				return displacementLitre;
				
			 }
		  
		  
		  
		  
		  
		  public WebElement certificationLevel() { 
				return certificationLevel;
				
			 }
		  
 
		 	  
		  public WebElement engineModel() { 
				return engineModel;
				
			 }
		 
		 
		 
		 
	  
		 public WebElement jvIdentifierPart() { 
				return jvIdentifierPart;
				
			 }
		 public WebElement uniqueCommomPart() { 
				return uniqueCommomPart;
				
			 }
		 	 
		 
	  
	  public void  sanityModelCreateRecord() {
		  sanityModelCreateRecord.click();;
			     
		}
	  
	
	  public WebElement  businessOwner() {
		 return businessOwner;
		     
	}
	  
	
	  public WebElement  filterTextBox() {
		 return filterTextBox;
		     
	}
	  
	  public void  filterCode() {
		  filterCode.click();
			     
		}
	  
	  public void  partOwnerChinaLocal() {
		  partOwnerChinaLocal.click();
			     
		}
	 
	  
	  
	  public void  partOwnerCloseBtn() {
		  partOwnerCloseBtn.click();
			     
		}
	  
	  public void  removeFilterBtn() {
		  removeFilterBtn.click();
			     
		}
	  
	  public void  readyForSegmentationCloseBtn() {
		  readyForSegmentationCloseBtn.click();
			     
		}
	  
	  
	  
	  public void  refreshButton() {
		  refreshButton.click();
			     
		}
	  
	  public void  segmentSubmitBtn() {
		  segmentSubmitBtn.click();
			     
		}
	  
	  
	  public void  segmentFirstGrid() {
			 segmentFirstGrid.click();
			     
		}
	  
	  
	  public WebElement  codeTextBox() {
		 return codeTextBox;
		     
	}
	  
	
	  
	  public void  segmentRule() {
		  segmentRule.click();
		     
	}
	  
	  
	  public void  segmentSubmit() {
		  segmentSubmit.click();
		     
	}
	
	  
	  public void  segmentFilterApply() {
		  segmentFilterApply.click();
		     
	}
	  
	  public void  FilterApply() {
		  FilterApply.click();
		     
	}
	  
	  
	  public void  SegmentFilterTextBox() {
		  SegmentFilterTextBox.click();
		     
	}
	  
	  public void  SegmentFilterDropDown() {
		  SegmentFilterDropDown.click();
		     
	}
	  
	  public void  filterPencilIcon() {
		  filterPencilIcon.click();
		     
	}
	  
	  
	  public WebElement  filterSegment() {
		 
		  return filterSegment;
		     
	}
	  
	  public void  filterDropDownSearch() {
		  filterDropDownSearch.click();
		  filterDropDownSearch.sendKeys("Segment");
		     
	}
	  public void  filterDropDown() {
		  filterDropDown.click();
		     
	}
	  
	  
	  public void  ruleFilter() {
		  ruleFilter.click();
		     
	}
	  
	
	  public void  relatedEntitysegment() {
		     relatedEntitysegment.click();
		     
	}
	  
	  public void  SegmentFilterCode() {
		  SegmentFilterCode.click();
		     
	}
	  
	  
	  
	  
	  
	
public void informationPopupSubmitBtn() {
		  
	informationPopupSubmitBtn.click();
	  }
	  

	  
 public void selectOEMUnique() {
		  
		  selectOEMUnique.click();
	  }
	  

	  public WebElement firstgrid() {
		  
		  return checkfirstgrid;
	  }
	  
	  
 public WebElement partOwnwerSelect() {
		  
		  return partOwnerSelect;
	  }
	
	
	  public void selectTagEntity() {// enterModelname
		  selectTagEntity.click();
			 
		 }

	  
	  public void partOwnerNotGlobal() {
		  
		  partOwnerNotGlobal.click();
	  }
	  
	  
	  public WebElement priorityValue() {
		  
		  return priority;
	  } 
	  
 
 public void enterModelname() {// enterModelname
	 modelname.click();
	 
 }
 public void searcModelname() {
	 searchmodelname.click();
	 searchmodelname.sendKeys("nrp");

}
 
 public void searchSanityModel() {
	 searchmodelname.click();
	 searchmodelname.sendKeys("SanityModelCreateRecord");

}
 
 
 public void partOwnerGlobal() {
	 
	 partOwnerGlobal.click();
 }
 
 public void clickLocalSegment() {
	// localSegment.click();
 }
 
 public void clickModelname() {
	 clickmodelname.click();
 }
 
 public void enterEntityname() {
	 entityname.click();
	 
 }
 

 public WebElement entityname() { 
	return entityname;
	
 } 
 public void searchEntityname() {
	 searchentityname.click();
	 searchentityname.sendKeys("010 - Part");
 }
 
 //-------------------------
 public void clickEntityname() {
	 clickentityname.click();
	
	 
 }
 
 public void clickGrid() {
	 clickgrid.click();
 
}
 public void  checkFirstGridOption() {
	 checkfirstgrid.click();
 
}
 
 

 
 public WebElement basePartValue() { 
	return basePart;
	
 } 
 
 public WebElement nameValue() { 
	return name;
	
 } 
 
 public WebElement partElemnt() {
	return clickentityname;
 }

 public WebElement partNumberValue() { //partNumberValue
	 return codePartNumber; //partNumber
 }
 
 public WebElement pricingAdminOwnerValue () { //pricingAdminOwnerValue 
	 return pricingAdminOwner;
	
 } 
 
 public WebElement productBuValue() {
	 return productBu;
	
 } 
 
 public WebElement businessOwneValue() {
	 return businessOwner;
	
 } 
 
 /*public WebElement Part() {
	 return clickentityname;
	
 } */
 
 
 public WebElement partOwnerValue() {
	 return partOwner;
	
 } 
 
 public void partOwnerSearch() {
	 part_owner_search.click();
	 part_owner_search.sendKeys("Global");
	 
 }
 public WebElement clickGlobalValue() {
	 return clickGlobal;
 }
 
 public WebElement wPTValue() {
	 return wpt;
 }
 
 
 public void transmissionModel() {
	 transmissionModel.click();
	 
 }
 
 public WebElement readyForSegmentationValue() {
	 	return readyForSegmentation;
	 
	 	
 } 
 public WebElement segmentType010PartValue() {
	 return  SegmentType010part;
 }
 
//futureSalestatusCode
 public WebElement futureSalesStatusCodeValue() {
	 return  futureSalesStatusCode;
 }
 
 public WebElement informationValue() {
		 return  information;
 }

 
 //search_ready_for_segmentation
 
 public void SearchReadyForSegmentation() {
	       searchReadyForSegmentation.click();
	       searchReadyForSegmentation.sendKeys("No");
	 
	
 }
 public void SearchReadyForSegmentation1() {
     searchReadyForSegmentation.click();
     searchReadyForSegmentation.sendKeys("Yes");


}
 //click_ready_for_segmentation_dropdown
 
 public void clickReadyForSegmentationDropdown() {
	 clickReadyForSegmentationDropdown.click();
	 	
	 
	
}
 
 public void clickpencilIcon() {
	 clickPencilIcon.click();
	 	
	 
	
}
 public WebElement saleableValue() {
	return saleable;
   
 }
 
 
 public WebElement brandValue() {
		return brand;
	   
	 }
 
 public WebElement eccValue() {
		return ecc;
	   
	 }
 
 public WebElement engineTypeValue() {
		return engineType;
	   
	 }
 
 public WebElement segmentValue() {
		return segment;
	   
	 }
 
 public WebElement readyForSegmentationNoValue() {
		return readyForSegmentationNo;
	   
	 }
 
 public WebElement segementSelectValue() {
		return segementSelect;
	   
	 }
 public WebElement saveOption() {
		return save;
	   
	 }
 
 //segementSelect
 
//
 public WebElement selectPartOwnerOption() {
		return selectPartOwnwerGlobal ;
	   
	 }
 
 public void readyForSegmentationYesOption() {
		readyForSegmentationYes.click(); ;
	   
	 }
 
 public void searchPartOwnwerGlobalValue() {
		searchPartOwnwerGlobal.click();
		searchPartOwnwerGlobal.sendKeys("Global");	
 
	 }
 
 public void clickReadyForSegmentationValue() {
	 clickReadyForSegmentation.click();
		

	 }
 public void clickReadyForSegmentationYesValue() {
	 clickReadyForSegmentationYes.click();
	 

	 }
 public void informationPencilIcon() {
	 informationPencilIcon.click();
	 }
 
 
 public void filterBtnOption() {
	 filterBtn.click();
	 }
 
 public void ruleTabOption() {
	 ruleTab.click();
	 }
 
 public void clearSegment() {
	 clearSegment.click();
	 }



      
      public WebElement resultingCost() { 
          return resultingCostField;
          
       }
 
 
 
 //clearSegment
 

 //filterBtn
 
 
 
 //readyForSegmentationYes
 /*public WebElement fieldname() {
	 return partnumber;
 }*/




 
 



}