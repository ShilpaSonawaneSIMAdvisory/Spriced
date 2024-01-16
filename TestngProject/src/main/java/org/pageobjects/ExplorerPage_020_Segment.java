package org.pageobjects;

import org.baseclass.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ExplorerPage_020_Segment extends BaseClass{
	
	public ExplorerPage_020_Segment() {
		
		
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(xpath = "//div[@id='mat-select-value-1']")
	 private WebElement modelname;
	 
	 //
	 @FindBy(xpath = "//input[@placeholder='Search']")
	 private WebElement searchmodelname;
	 
	 @FindBy(xpath="//span[contains(text(),'Demo 3 NRP Pricing')]")
	 private WebElement clickmodelname;
	 
	 @FindBy(xpath="/html/body/sp-root/div/div/sp-body/div/sp-app/sp-entity-data/sp-two-col-three-forth/div/div[1]/div/div/sp-data-grid/div/div/sp-header-component-wrapper/div/sp-entity-select/div/mat-form-field[2]/div[1]/div[2]/div/mat-select/div/div[1]")
	 private WebElement entityname;
	 
	////div[@id='mat-select-value-3']
	 @FindBy(xpath = "//input[@placeholder='Search']")
	 private WebElement searchentityname;
	 
	 //
	 
	 @FindBy(xpath="(//mat-option[@role='option'])[3]")
	 private WebElement clickentityname;
	 
	
	 	 
	 ///html[1]/body[1]/div[2]/div[3]/div[1]/div[1]/mat-option[4]/span[1]
	 
	 @FindBy(xpath="(//div[@class='datatable-row-center datatable-row-group ng-star-inserted'])[9]")
	 private WebElement clickgrid;
	 
	 //
	 @FindBy(xpath="/html/body/sp-root/div/div/sp-body/div/sp-app/sp-entity-data/sp-two-col-three-forth/div/div[2]/div/mat-accordion/mat-expansion-panel[1]/div/div/div/sp-dynamic-form-container/div/sp-dynamic-form/form/div/div/sp-lookup-select[1]/div/div/div[2]/mat-form-field/div[1]/div/div[2]/mat-select/div/div[1]" )
	 private WebElement pricingActionMethod;
	 
	 //
	 
	 @FindBy(xpath="/html/body/sp-root/div/div/sp-body/div/sp-app/sp-entity-data/sp-two-col-three-forth/div/div[2]/div/mat-accordion/mat-expansion-panel[1]/div/div/div/sp-dynamic-form-container/div/sp-dynamic-form/form/div/div/sp-lookup-select[2]/div/div/div[2]/mat-form-field/div[1]/div/div[2]/mat-select/div/div[1]")
	 private WebElement newPricingActionMethod;
	 
	 //
	 
	 @FindBy(xpath="/html/body/sp-root/div/div/sp-body/div/sp-app/sp-entity-data/sp-two-col-three-forth/div/div[2]/div/mat-accordion/mat-expansion-panel[1]/div/div/div/sp-dynamic-form-container/div/sp-dynamic-form/form/div/div/sp-numeric[10]/div/div[2]/mat-form-field/div[1]/div/div[2]/input")
	 private WebElement partsInSegment;
	 
	 ////input[@id='mat-input-254']
	 
	 @FindBy(xpath="/html[1]/body[1]/sp-root[1]/div[1]/div[1]/sp-body[1]/div[1]/sp-app[1]/sp-entity-data[1]/sp-two-col-three-forth[1]/div[1]/div[2]/div[1]/mat-accordion[1]/mat-expansion-panel[1]/div[1]/div[1]/div[1]/sp-dynamic-form-container[1]/div[1]/sp-dynamic-form[1]/form[1]/div[1]/div[1]/sp-numeric[11]/div[1]/div[2]/mat-form-field[1]/div[1]/div[1]/div[2]/input[1]")
	 private WebElement segmentSalesVolume;
	 
	 //
	 @FindBy(xpath="/html[1]/body[1]/sp-root[1]/div[1]/div[1]/sp-body[1]/div[1]/sp-app[1]/sp-entity-data[1]/sp-two-col-three-forth[1]/div[1]/div[2]/div[1]/mat-accordion[1]/mat-expansion-panel[1]/div[1]/div[1]/div[1]/sp-dynamic-form-container[1]/div[1]/sp-dynamic-form[1]/form[1]/div[1]/div[1]/sp-numeric[5]/div[1]/div[2]/mat-form-field[1]/div[1]/div[1]/div[2]/input[1]")
	 private WebElement segmentPartMinimumPrice;
	 
	 //
	 @FindBy(xpath="/html[1]/body[1]/sp-root[1]/div[1]/div[1]/sp-body[1]/div[1]/sp-app[1]/sp-entity-data[1]/sp-two-col-three-forth[1]/div[1]/div[2]/div[1]/mat-accordion[1]/mat-expansion-panel[1]/div[1]/div[1]/div[1]/sp-dynamic-form-container[1]/div[1]/sp-dynamic-form[1]/form[1]/div[1]/div[1]/sp-numeric[6]/div[1]/div[2]/mat-form-field[1]/div[1]/div[1]/div[2]/input[1]")
	 private WebElement segmentPartMaximumPrice;
	 
	 @FindBy(xpath="/html[1]/body[1]/sp-root[1]/div[1]/div[1]/sp-body[1]/div[1]/sp-app[1]/sp-entity-data[1]/sp-two-col-three-forth[1]/div[1]/div[2]/div[1]/mat-accordion[1]/mat-expansion-panel[1]/div[1]/div[1]/div[1]/sp-dynamic-form-container[1]/div[1]/sp-dynamic-form[1]/form[1]/div[1]/div[1]/sp-numeric[7]/div[1]/div[2]/mat-form-field[1]/div[1]/div[1]/div[2]/input[1]")
	 private WebElement segmentPartMeanPrice;
	 
	 @FindBy(xpath="/html[1]/body[1]/sp-root[1]/div[1]/div[1]/sp-body[1]/div[1]/sp-app[1]/sp-entity-data[1]/sp-two-col-three-forth[1]/div[1]/div[2]/div[1]/mat-accordion[1]/mat-expansion-panel[1]/div[1]/div[1]/div[1]/sp-dynamic-form-container[1]/div[1]/sp-dynamic-form[1]/form[1]/div[1]/div[1]/sp-numeric[8]/div[1]/div[2]/mat-form-field[1]/div[1]/div[1]/div[2]/input[1]")
	 private WebElement segmentPartStandDeviationPrice;
	 
	 @FindBy(xpath="/html[1]/body[1]/sp-root[1]/div[1]/div[1]/sp-body[1]/div[1]/sp-app[1]/sp-entity-data[1]/sp-two-col-three-forth[1]/div[1]/div[2]/div[1]/mat-accordion[1]/mat-expansion-panel[1]/div[1]/div[1]/div[1]/sp-dynamic-form-container[1]/div[1]/sp-dynamic-form[1]/form[1]/div[1]/div[1]/sp-numeric[9]/div[1]/div[2]/mat-form-field[1]/div[1]/div[1]/div[2]/input[1]")
	 private WebElement segmentPartWeightedMeanPrice;
	 
	 @FindBy(xpath="/html/body/sp-root/div/div/sp-body/div/sp-app/sp-entity-data/sp-two-col-three-forth/div/div[2]/div/mat-accordion/mat-expansion-panel[1]/div/div/div/sp-dynamic-form-container/div/sp-dynamic-form/form/div/div/sp-lookup-select[48]/div/div/div[2]/mat-form-field/div[1]/div/div[2]/mat-select/div/div[1]")
	 private WebElement cpm;
	 
	 @FindBy(xpath="//mat-select[@class='mat-mdc-select flex items-center select-dropdown ng-tns-c3393473648-31 ng-tns-c1205077789-30 ng-pristine ng-valid ng-star-inserted ng-touched']")
	 private WebElement pricingMethod;
	 
	 @FindBy(xpath="(//mat-select[@role='combobox'])[52]")
	 private WebElement segmentEntityFilterDropDown;
	 
	 
	 @FindBy(xpath="(//span[@class='mdc-list-item__primary-text'])[4]")
	 private WebElement segmentEntityCodeOption;
	 
	
	 
			 @FindBy(xpath=" (//button[@class='border-r-primary-light border-solid cursor-pointer flex flex-row h-full pl-2 pr-1 text-white ng-star-inserted'])[1]")
			 private WebElement segmentEntityDeleteSegment;

	 @FindBy(xpath="(//span[@class='mdc-button__label'])[101]")
	 private WebElement segmentEntityFilterRule;
	 
	 
	 @FindBy(xpath="(//mat-select[@role='combobox'])[12]")
     private WebElement engineModel;
    
     @FindBy(xpath="/html/body/sp-root/div/div/sp-body/div/sp-app/sp-entity-data/sp-two-col-three-forth/div/div[2]/div/mat-accordion/mat-expansion-panel[1]/div/div/div/sp-dynamic-form-container/div/sp-dynamic-form/form/div/div/sp-lookup-select[11]/div/div/div[2]/mat-form-field/div[1]/div/div[2]/mat-select/div/div[1]/span/span")
     private WebElement certificationLevel;
     
     @FindBy(xpath="/html/body/sp-root/div/div/sp-body/div/sp-app/sp-entity-data/sp-two-col-three-forth/div/div[2]/div/mat-accordion/mat-expansion-panel[1]/div/div/div/sp-dynamic-form-container/div/sp-dynamic-form/form/div/div/sp-lookup-select[12]/div/div/div[2]/mat-form-field/div[1]/div/div[2]/mat-select/div/div[1]/span/span")
     private WebElement displacementLiters;
     
     @FindBy(xpath="/html/body/sp-root/div/div/sp-body/div/sp-app/sp-entity-data/sp-two-col-three-forth/div/div[2]/div/mat-accordion/mat-expansion-panel[1]/div/div/div/sp-dynamic-form-container/div/sp-dynamic-form/form/div/div/sp-lookup-select[13]/div/div/div[2]/mat-form-field/div[1]/div/div[2]/mat-select/div/div[1]/span/span")
     private WebElement marketapplication;
     
     @FindBy(xpath="/html/body/sp-root/div/div/sp-body/div/sp-app/sp-entity-data/sp-two-col-three-forth/div/div[2]/div/mat-accordion/mat-expansion-panel[1]/div/div/div/sp-dynamic-form-container/div/sp-dynamic-form/form/div/div/sp-lookup-select[14]/div/div/div[2]/mat-form-field/div[1]/div/div[2]/mat-select/div/div[1]")
     private WebElement enginetype;
     
     @FindBy(xpath="/html/body/sp-root/div/div/sp-body/div/sp-app/sp-entity-data/sp-two-col-three-forth/div/div[2]/div/mat-accordion/mat-expansion-panel[1]/div/div/div/sp-dynamic-form-container/div/sp-dynamic-form/form/div/div/sp-lookup-select[30]/div/div/div[2]/mat-form-field/div[1]/div/div[2]/mat-select/div/div[1]")
     private WebElement electricvoltage;
     
     @FindBy(xpath="/html/body/sp-root/div/div/sp-body/div/sp-app/sp-entity-data/sp-two-col-three-forth/div/div[2]/div/mat-accordion/mat-expansion-panel[1]/div/div/div/sp-dynamic-form-container/div/sp-dynamic-form/form/div/div/sp-lookup-select[31]/div/div/div[2]/mat-form-field/div[1]/div/div[2]/mat-select/div/div[1]/span/span")
     private WebElement electricoutput;
     
     @FindBy(xpath="/html/body/sp-root/div/div/sp-body/div/sp-app/sp-entity-data/sp-two-col-three-forth/div/div[2]/div/mat-accordion/mat-expansion-panel[1]/div/div/div/sp-dynamic-form-container/div/sp-dynamic-form/form/div/div/sp-lookup-select[32]/div/div/div[2]/mat-form-field/div[1]/div/div[2]/mat-select/div/div[1]/span/span")
     private WebElement electrictechnology;
     
     @FindBy(xpath="/html/body/sp-root/div/div/sp-body/div/sp-app/sp-entity-data/sp-two-col-three-forth/div/div[2]/div/mat-accordion/mat-expansion-panel[1]/div/div/div/sp-dynamic-form-container/div/sp-dynamic-form/form/div/div/sp-lookup-select[33]/div/div/div[2]/mat-form-field/div[1]/div/div[2]/mat-select/div/div[1]/span/span")
     private WebElement electricinterface;
     
     @FindBy(xpath="(//mat-select[@role='combobox'])[36]")
     private WebElement noOfChargedPorts;
     
     @FindBy(xpath="(//mat-select[@role='combobox'])[37]")
     private WebElement pantograph;
     
     @FindBy(xpath="(//mat-select[@role='combobox'])[38]")
     private WebElement acChargePorts;
     
     
     @FindBy(xpath="(//mat-select[@role='combobox'])[39]")
     private WebElement energy;
     
     @FindBy(xpath="(//mat-select[@role='combobox'])[40]")
     private WebElement capacity;
     
     @FindBy(xpath="(//mat-select[@role='combobox'])[41]")
     private WebElement electrificationProgram;
     
     @FindBy(xpath="(//mat-select[@role='combobox'])[49]")
     private WebElement manufacturer;
     
     @FindBy(xpath="//button[@title='Filter']")
     private WebElement filterButton;
     
     @FindBy(xpath="//button[@title='Rule']")
     private WebElement ruleTab;
     
     @FindBy(xpath="(//mat-select[@role='combobox'])[52]")
     private WebElement filterDropdown;
     

     @FindBy(xpath="//input[@placeholder='Search']")
     private WebElement filterSearchBox;
     
     @FindBy(xpath="//span[@class='mdc-list-item__primary-text'  and contains(text(), 'Code')]")
     private WebElement codeOption;
     
     @FindBy(xpath="(//input[@type='text'])[17]")
     private WebElement inputTextBox;
     
     @FindBy(xpath="(//span[@class='mdc-button__label' and contains(text(), 'Apply')])[1]")
     private WebElement applyFilterButton;
     
     @FindBy(xpath="(//input[@type ='text'])[3]")
     private WebElement pricingActionValue;
     
     @FindBy(xpath="//input[@placeholder='Pricing Action Increase Limit']")
     private WebElement pricingActionIncreaselimit;
     
     @FindBy(xpath="//input[@placeholder='Pricing Action Increase Limit']")
     private WebElement pricingActionDecreaselimit;
     
     @FindBy(xpath="/html/body/sp-root/div/div/sp-body/div/sp-app/sp-entity-data/sp-two-col-three-forth/div/div[2]/div/mat-accordion/mat-expansion-panel[1]/div/div/div/sp-dynamic-form-container/div/sp-dynamic-form/form/div/div/sp-lookup-select[2]/div/div/div[2]/mat-form-field/div[1]/div/div[2]/mat-select/div")
     private WebElement newPartPricingMethod;
     
     @FindBy(xpath="/html/body/sp-root/div/div/sp-body/div/sp-app/sp-entity-data/sp-two-col-three-forth/div/div[2]/div/mat-accordion/mat-expansion-panel[1]/div/div/div/sp-dynamic-form-container/div/sp-dynamic-form/form/div/div/sp-numeric[4]/div/div[2]/mat-form-field/div[1]/div/div[2]/input")
     private WebElement newPartPricingValue;
     
     public WebElement newPartPricingValue() {// enterModelname
     	
 		return newPartPricingValue;
                  
              }
     
     public WebElement newPartPricingMethod() {// enterModelname
    	
		return newPartPricingMethod;
                 
             }
     
     
     public WebElement pricingActionDecreaselimit() {// enterModelname
    	 return pricingActionDecreaselimit;
                 
             }
     
     public WebElement pricingActionIncreaselimit() {// enterModelname
    	 return pricingActionIncreaselimit;
                 
             }
     
     
     public WebElement pricingActionValue() {// enterModelname
    	 return pricingActionValue;
                 
             }
     
     void applyFilterButton() {// enterModelname
    	 applyFilterButton.click();
                 
             }
    
     
     public void filterButton() {// enterModelname
    	 filterButton.click();
                 
             }
     
     public void ruleTab() {// enterModelname
    	 ruleTab.click();
                 
             }
     public void filterDropdown() {// enterModelname
    	 filterDropdown.click();
                 
             }
     public void filterSearchBox() {// enterModelname
    	 filterSearchBox.click();
    	 filterSearchBox.sendKeys("Code");
                 
             }
     public void codeOption() {// enterModelname
    	 codeOption.click();
                 
             }
     public WebElement inputTextBox() {// enterModelname
    	 return inputTextBox;
                 
             }
     
     public WebElement acChargePorts() {// enterModelname
         return acChargePorts;
                 
             }
     
     
     public WebElement electrificationProgram() {// enterModelname
         return electrificationProgram;
                 
             }
     
     public WebElement manufacturer() {// enterModelname
         return manufacturer;
                 
             }
     public WebElement capacity() {// enterModelname
         return capacity;
                 
             }
     public WebElement energy() {// enterModelname
         return energy;
                 
             }
     
     public WebElement pantograph() {// enterModelname
         return pantograph;
                 
             }

     public WebElement noOfChargedPorts() {// enterModelname
         return noOfChargedPorts;
                 
             }
     
     public WebElement electricinterface() {// enterModelname
         return electricinterface;
                 
             }
     
     public WebElement electrictechnology() {// enterModelname
         return electrictechnology;
                 
             }
     
     public WebElement electricoutput() {// enterModelname
         return electricoutput;
                 
             }
     
     public WebElement electricvoltage() {// enterModelname
         return electricvoltage;
                 
             }
     
     public WebElement enginetype() {// enterModelname
         return enginetype;
                 
             }
     
     public WebElement marketapplication() {// enterModelname
         return marketapplication;
                 
             }
     
     public WebElement displacementLiters() {// enterModelname
         return displacementLiters;
                 
             }
     
     public WebElement certificationLevel() {// enterModelname
         return certificationLevel;
                 
             }
     
     public WebElement engineModel() {// enterModelname
         return engineModel;
                 
             }
	 
	 
	 public void segmentEntityCodeOption() {// enterModelname
		 segmentEntityCodeOption.click();
				 
			 }
	 public void segmentEntityFilterRule() {// enterModelname
		 segmentEntityFilterRule.click();
				 
			 }

	 	 
	 public void segmentEntityFilterDropDown() {// enterModelname
		 segmentEntityFilterDropDown.click();
				 
			 }

	 public WebElement segmentEntityDeleteSegment() {// enterModelname
			return segmentEntityDeleteSegment;
				 
			 }
	 
	 public WebElement pricingMethod() {// enterModelname
		return pricingMethod;
			 
		 }
	 
	 public void enterModelname() {// enterModelname
	 modelname.click();
		 
	 }
	 public void searcModelname() {
		 searchmodelname.click();
		 searchmodelname.sendKeys("demo 3 NRP Pricing");

	}
	 
	 public void clickModelname() {
		 clickmodelname.click();
	 }
	 
	 public void enterEntityname() {
		 entityname.click();
		 
	 }
	 
	 public void searchEntityname() {
		 searchentityname.click();
		 searchentityname.sendKeys("020 - Segment");
	 }
	 
	 public void searchEntityname010Part() {
		 searchentityname.click();
		 searchentityname.sendKeys("010-Part");
	 }
	
	 public void clickEntityname() {
		 clickentityname.click();
	 }
	 
	 public WebElement segmentEntityname() {
		 return  entityname;
    }
	 
	 
	 public void clickGrid() {
		 clickgrid.click();
	 
	}
	 
	 public WebElement pricingActionMethodValue() {
		 return  pricingActionMethod;
    }
	 
	 public WebElement newPricingActionMethodValue() {
		 return  newPricingActionMethod;
    }
	 public WebElement partsInSegmentValue() {
		 return  partsInSegment;
    }
	 
	 public WebElement segmentSalesVolumeValue() {
		 return  segmentSalesVolume;
    }
	 
	 public WebElement segmentPartMinimumPricevalue() {
		 return  segmentPartMinimumPrice;
    }
	 
	 public WebElement segmentPartMaximumPriceValue() {
		 return  segmentPartMaximumPrice;
    }
	 public WebElement segmentPartMeanPriceValue() {
		 return  segmentPartMeanPrice;
    }
	 public WebElement segmentPartStandDeviationPriceValue() {
		 return  segmentPartStandDeviationPrice;
    } 
	 
	 public WebElement segmentPartWeightedMeanPriceValue() {
		 return  segmentPartWeightedMeanPrice;
    } 
	 
	 public WebElement cpmValue() {
		 return  cpm;
    } 
	 	 
	 //
	
//segmentPartStandDeviationPrice
}
