package org.pageobjects;

import org.baseclass.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ExplorerPage_030_Dn_Pricing extends BaseClass{
	
	public ExplorerPage_030_Dn_Pricing() {
		
		
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(xpath = "/html/body/sp-root/div/div/sp-body/div/sp-app/sp-entity-data/sp-two-col-three-forth/div/div[1]/div/div/sp-data-grid/div/div/sp-header-component-wrapper/div/sp-entity-select/div/mat-form-field[1]/div[1]/div[2]/div/mat-select/div/div[1]")
	 private WebElement modelname;
	
	@FindBy(xpath = "//input[@placeholder='Search']")
	 private WebElement searchmodelname;
	
	@FindBy(xpath="(//span[@class='mdc-list-item__primary-text'])[3]")
	 private WebElement clickmodelname;
	
	 
	 @FindBy(xpath="(//mat-select[@role='combobox'])[2]")
	 private WebElement entityname;
	 
	//
	 @FindBy(xpath = "//input[@placeholder='Search']")
	 private WebElement searchentityname;
	 
	 //
	 
	 @FindBy(xpath="(//span[@class='mdc-list-item__primary-text'])[3]")
	 private WebElement clickentityname;
	 

	 @FindBy(xpath="(//div[@class='datatable-row-center datatable-row-group ng-star-inserted'])[1]")
	 private WebElement checkfirstgrid;
	 
	 @FindBy(xpath="/html/body/sp-root/div/div/sp-body/div/sp-app/sp-entity-data/sp-two-col-three-forth/div/div[2]/div/mat-accordion/mat-expansion-panel[1]/div/div/div/sp-dynamic-form-container/div/sp-dynamic-form/form/div/div/sp-input[2]/div[1]/div[2]/mat-form-field/div[1]/div/div[2]/input")
	 private WebElement code;
	 
	 
	 @FindBy(xpath="/html/body/sp-root/div/div/sp-body/div/sp-app/sp-entity-data/sp-two-col-three-forth/div/div[2]/div/mat-accordion/mat-expansion-panel[1]/div/div/div/sp-dynamic-form-container/div/sp-dynamic-form/form/div/div/sp-input[1]/div[1]/div[2]/mat-form-field/div[1]/div/div[2]/input")
	 private WebElement name;
	 

	 @FindBy(xpath="/html/body/sp-root/div/div/sp-body/div/sp-app/sp-entity-data/sp-two-col-three-forth/div/div[2]/div/mat-accordion/mat-expansion-panel[1]/div/div/div/sp-dynamic-form-container/div/sp-dynamic-form/form/div/div/sp-lookup-select[25]/div/div/div[2]/mat-form-field/div[1]/div/div[2]/mat-select/div/div[1]")
	 private WebElement accenturePart;
	 
	 @FindBy(xpath="/html/body/sp-root/div/div/sp-body/div/sp-app/sp-entity-data/sp-two-col-three-forth/div/div[2]/div/mat-accordion/mat-expansion-panel[1]/div/div/div/sp-dynamic-form-container/div/sp-dynamic-form/form/div/div/sp-lookup-select[4]/div/div/div[2]/mat-form-field/div[1]/div/div[2]/mat-select")
	 private WebElement associatedFixedPrice;
	 
	 @FindBy(xpath="/html/body/sp-root/div/div/sp-body/div/sp-app/sp-entity-data/sp-two-col-three-forth/div/div[2]/div/mat-accordion/mat-expansion-panel[1]/div/div/div/sp-dynamic-form-container/div/sp-dynamic-form/form/div/div/sp-input[16]/div[1]/div[2]/mat-form-field/div[1]/div/div[2]/input")
	 private WebElement brand;
	 
	 @FindBy(xpath="//span[contains(text(),'Cost Change {Cost Change}')]")
	 private WebElement changeReason;
	 
	 @FindBy(xpath="/html/body/sp-root/div/div/sp-body/div/sp-app/sp-entity-data/sp-two-col-three-forth/div/div[2]/div/mat-accordion/mat-expansion-panel[1]/div/div/div/sp-dynamic-form-container/div/sp-dynamic-form/form/div/div/sp-lookup-select[20]/div/div/div[2]/mat-form-field/div[1]/div/div[2]/mat-select/div/div[1]")
	 private WebElement coreMgrApproval;
	 
	 @FindBy(xpath="/html/body/sp-root/div/div/sp-body/div/sp-app/sp-entity-data/sp-two-col-three-forth/div/div[2]/div/mat-accordion/mat-expansion-panel[1]/div/div/div/sp-dynamic-form-container/div/sp-dynamic-form/form/div/div/sp-lookup-select[11]/div/div/div[2]/mat-form-field/div[1]/div/div[2]/mat-select/div/div[1]")
	 private WebElement cpm;
	 
	 @FindBy(xpath="/html/body/sp-root/div/div/sp-body/div/sp-app/sp-entity-data/sp-two-col-three-forth/div/div[2]/div/mat-accordion/mat-expansion-panel[1]/div/div/div/sp-dynamic-form-container/div/sp-dynamic-form/form/div/div/sp-lookup-select[15]/div/div/div[2]/mat-form-field/div[1]/div/div[2]/mat-select")
	 private WebElement cpmLeadApproval;
	 
	 @FindBy(xpath="/html[1]/body[1]/sp-root[1]/div[1]/div[1]/sp-body[1]/div[1]/sp-app[1]/sp-entity-data[1]/sp-two-col-three-forth[1]/div[1]/div[2]/div[1]/mat-accordion[1]/mat-expansion-panel[1]/div[1]/div[1]/div[1]/sp-dynamic-form-container[1]/div[1]/sp-dynamic-form[1]/form[1]/div[1]/div[1]/sp-lookup-select[8]/div[1]/div[1]/div[2]/mat-form-field[1]/div[1]/div[1]/div[2]/mat-select[1]/div[1]/div[1]/span[1]/span[1]")
	 private WebElement dirOfPm1Approval;
	 
	 @FindBy(xpath="/html[1]/body[1]/sp-root[1]/div[1]/div[1]/sp-body[1]/div[1]/sp-app[1]/sp-entity-data[1]/sp-two-col-three-forth[1]/div[1]/div[2]/div[1]/mat-accordion[1]/mat-expansion-panel[1]/div[1]/div[1]/div[1]/sp-dynamic-form-container[1]/div[1]/sp-dynamic-form[1]/form[1]/div[1]/div[1]/sp-lookup-select[9]/div[1]/div[1]/div[2]/mat-form-field[1]/div[1]/div[1]/div[2]/mat-select[1]/div[1]/div[1]/span[1]/span[1]")
	 private WebElement dirOfPm2Approval;
	 
	 @FindBy(xpath="/html[1]/body[1]/sp-root[1]/div[1]/div[1]/sp-body[1]/div[1]/sp-app[1]/sp-entity-data[1]/sp-two-col-three-forth[1]/div[1]/div[2]/div[1]/mat-accordion[1]/mat-expansion-panel[1]/div[1]/div[1]/div[1]/sp-dynamic-form-container[1]/div[1]/sp-dynamic-form[1]/form[1]/div[1]/div[1]/sp-lookup-select[10]/div[1]/div[1]/div[2]/mat-form-field[1]/div[1]/div[1]/div[2]/mat-select[1]/div[1]/div[1]/span[1]/span[1]")
	 private WebElement displacementLiters;
	 
	 @FindBy(xpath="/html[1]/body[1]/sp-root[1]/div[1]/div[1]/sp-body[1]/div[1]/sp-app[1]/sp-entity-data[1]/sp-two-col-three-forth[1]/div[1]/div[2]/div[1]/mat-accordion[1]/mat-expansion-panel[1]/div[1]/div[1]/div[1]/sp-dynamic-form-container[1]/div[1]/sp-dynamic-form[1]/form[1]/div[1]/div[1]/sp-lookup-select[11]/div[1]/div[1]/div[2]/mat-form-field[1]/div[1]/div[1]/div[2]/mat-select[1]/div[1]/div[1]/span[1]/span[1]")
	 private WebElement ecc;
	 
	 @FindBy(xpath="/html[1]/body[1]/sp-root[1]/div[1]/div[1]/sp-body[1]/div[1]/sp-app[1]/sp-entity-data[1]/sp-two-col-three-forth[1]/div[1]/div[2]/div[1]/mat-accordion[1]/mat-expansion-panel[1]/div[1]/div[1]/div[1]/sp-dynamic-form-container[1]/div[1]/sp-dynamic-form[1]/form[1]/div[1]/div[1]/sp-lookup-select[12]/div[1]/div[1]/div[2]/mat-form-field[1]/div[1]/div[1]/div[2]/mat-select[1]/div[1]/div[1]/span[1]/span[1]")
	 private WebElement engineModel;
	 
	 @FindBy(xpath="//div[@id='mat-select-value-63']")
	 private WebElement execDirectorApproval;
	 
	 @FindBy(xpath="/html[1]/body[1]/sp-root[1]/div[1]/div[1]/sp-body[1]/div[1]/sp-app[1]/sp-entity-data[1]/sp-two-col-three-forth[1]/div[1]/div[2]/div[1]/mat-accordion[1]/mat-expansion-panel[1]/div[1]/div[1]/div[1]/sp-dynamic-form-container[1]/div[1]/sp-dynamic-form[1]/form[1]/div[1]/div[1]/sp-lookup-select[14]/div[1]/div[1]/div[2]/mat-form-field[1]/div[1]/div[1]/div[2]/mat-select[1]/div[1]/div[1]/span[1]/span[1]")
	 private WebElement information;
	 
	 @FindBy(xpath="/html[1]/body[1]/sp-root[1]/div[1]/div[1]/sp-body[1]/div[1]/sp-app[1]/sp-entity-data[1]/sp-two-col-three-forth[1]/div[1]/div[2]/div[1]/mat-accordion[1]/mat-expansion-panel[1]/div[1]/div[1]/div[1]/sp-dynamic-form-container[1]/div[1]/sp-dynamic-form[1]/form[1]/div[1]/div[1]/sp-lookup-select[15]/div[1]/div[1]/div[2]/mat-form-field[1]/div[1]/div[1]/div[2]/mat-select[1]/div[1]/div[1]/span[1]/span[1]")
	 private WebElement priceBelowCost;
	 
	 @FindBy(xpath="(//mat-select[@role='combobox'])[27]")
	 private WebElement pricingAction;
	 
	 @FindBy(xpath="/html/body/sp-root/div/div/sp-body/div/sp-app/sp-entity-data/sp-two-col-three-forth/div/div[2]/div/mat-accordion/mat-expansion-panel[1]/div/div/div/sp-dynamic-form-container/div/sp-dynamic-form/form/div/div/sp-lookup-select[19]/div/div/div[2]/mat-form-field/div[1]/div/div[2]/mat-select/div/div[1]")
	 private WebElement pricingMgrApproval;
	 
	 @FindBy(xpath="/html/body/sp-root/div/div/sp-body/div/sp-app/sp-entity-data/sp-two-col-three-forth/div/div[2]/div/mat-accordion/mat-expansion-panel[1]/div/div/div/sp-dynamic-form-container/div/sp-dynamic-form/form/div/div/sp-lookup-select[8]/div/div/div[2]/mat-form-field/div[1]/div/div[2]/mat-select/div/div[1]")
	 private WebElement publishFlag;
	 
	 @FindBy(xpath="/html/body/sp-root/div/div/sp-body/div/sp-app/sp-entity-data/sp-two-col-three-forth/div/div[2]/div/mat-accordion/mat-expansion-panel[1]/div/div/div/sp-dynamic-form-container/div/sp-dynamic-form/form/div/div/sp-lookup-select[1]/div/div/div[2]/mat-form-field/div[1]/div/div[2]/mat-select/div/div[1]")
	 private WebElement region;
	 
	 @FindBy(xpath="/html/body/sp-root/div/div/sp-body/div/sp-app/sp-entity-data/sp-two-col-three-forth/div/div[2]/div/mat-accordion/mat-expansion-panel[1]/div/div/div/sp-dynamic-form-container/div/sp-dynamic-form/form/div/div/sp-lookup-select[26]/div/div/div[2]/mat-form-field/div[1]/div/div[2]/mat-select/div/div[1]")
	 private WebElement regionalLowVolume;
	 
	 @FindBy(xpath="//div[@id='mat-select-value-79']")
	 private WebElement regionalPricingFlag;
	 
	 @FindBy(xpath="//div[@id='mat-select-value-81']")
	 private WebElement restrictedPricing;
	 
	 @FindBy(xpath="/html[1]/body[1]/sp-root[1]/div[1]/div[1]/sp-body[1]/div[1]/sp-app[1]/sp-entity-data[1]/sp-two-col-three-forth[1]/div[1]/div[2]/div[1]/mat-accordion[1]/mat-expansion-panel[1]/div[1]/div[1]/div[1]/sp-dynamic-form-container[1]/div[1]/sp-dynamic-form[1]/form[1]/div[1]/div[1]/sp-lookup-select[23]/div[1]/div[1]/div[2]/mat-form-field[1]/div[1]/div[1]/div[2]/mat-select[1]/div[1]/div[1]/span[1]/span[1]")
	 private WebElement segment;
	 
	 @FindBy(xpath="/html[1]/body[1]/sp-root[1]/div[1]/div[1]/sp-body[1]/div[1]/sp-app[1]/sp-entity-data[1]/sp-two-col-three-forth[1]/div[1]/div[2]/div[1]/mat-accordion[1]/mat-expansion-panel[1]/div[1]/div[1]/div[1]/sp-dynamic-form-container[1]/div[1]/sp-dynamic-form[1]/form[1]/div[1]/div[1]/sp-lookup-select[24]/div[1]/div[1]/div[2]/mat-form-field[1]/div[1]/div[1]/div[2]/mat-select[1]/div[1]/div[1]/span[1]/span[1]")
	 private WebElement segmentType;
	 
	 @FindBy(xpath="(//mat-select[@role='combobox'])[7]")
	 private WebElement selectPricingAction;
	 
	 @FindBy(xpath="//input[@placeholder='Search']")
	 private WebElement searchSelectPricingAction;
	 
	
	 @FindBy(xpath="//div[@id='mat-select-value-89']")
	 private WebElement swapp;
	 
	 @FindBy(xpath="/html[1]/body[1]/sp-root[1]/div[1]/div[1]/sp-body[1]/div[1]/sp-app[1]/sp-entity-data[1]/sp-two-col-three-forth[1]/div[1]/div[2]/div[1]/mat-accordion[1]/mat-expansion-panel[1]/div[1]/div[1]/div[1]/sp-dynamic-form-container[1]/div[1]/sp-dynamic-form[1]/form[1]/div[1]/div[1]/sp-lookup-select[27]/div[1]/div[1]/div[2]/mat-form-field[1]/div[1]/div[1]/div[2]/mat-select[1]/div[1]/div[1]/span[1]/span[1]")
	 private WebElement swappProgramAnalysisCode;
	 
	 
	 @FindBy(xpath="//input[@placeholder='Annual Volume']")
	 private WebElement annualVolume;
	 //
	 
	 @FindBy(xpath="//input[@id='mat-input-22']")
	 private WebElement avgCurrentPrice;
	 
	 @FindBy(xpath="//input[@id='mat-input-23']")
	 private WebElement avgResultingCost;
	 
	 
	 @FindBy(xpath="//input[@placeholder='Future Effective Date']")
	 private WebElement futureEffectiveDate;
	 
	 @FindBy(xpath="//input[@id='mat-input-240']")
	 private WebElement currentDate;

	 @FindBy(xpath="//input[@placeholder='Pricing Admin Owner']")
	 private WebElement pricingAdminOwner;
	 
	 @FindBy(xpath="//input[@placeholder='Product BU']")
	 private WebElement productBU;
	 
	 
	 @FindBy(xpath="//input[@placeholder='Business Owner']")
	 private WebElement businessOwner;
	 
	 @FindBy(xpath="(//span[@class='mdc-button__label'])[54]")
	 private WebElement saveButton;
	 
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
     
     @FindBy(xpath="/html/body/div[2]/div[103]/div/div/mat-option[3]/span")
	  private WebElement clickSearchSelectPricing;
     
     @FindBy(xpath="//input[@placeholder='Search']")
	  private WebElement searchChangeReason;
     
     @FindBy(xpath="(//span[@class='mdc-list-item__primary-text'])[3]")
  	  private WebElement selectElement;
          
     @FindBy(xpath="")
  	  private WebElement apmCode;
     
     @FindBy(xpath="")
  	  private WebElement salesStatusCode;
     
     @FindBy(xpath="")
 	  private WebElement futureSalesStatusCode;
     
     @FindBy(xpath="")
	  private WebElement uniqueCommon;
     
     @FindBy(xpath="")
	  private WebElement certificationLevel;
     
     @FindBy(xpath="")
 	  private WebElement jvIdentifier;
     
     @FindBy(xpath="")
	  private WebElement  pricingActionhistory;
    
     @FindBy(xpath="")
	  private WebElement resultingCostHistory;
     
     @FindBy(xpath="")
	  private WebElement saleable;
     
     @FindBy(xpath="")
	  private WebElement brandMinor;
     
     @FindBy(xpath="//input[@placeholder='Current Price']")
	  private WebElement currentPrice;
     
     @FindBy(xpath="")
	  private WebElement currentEffectiveDate;
     
     @FindBy(xpath="")
	  private WebElement corexRefReport;
     
     @FindBy(xpath="")
	  private WebElement resultingCost;
     
     @FindBy(xpath="")
	  private WebElement finResponsibilityCode ;
     
     @FindBy(xpath="")
	  private WebElement forecastMultiplier;   
     
     @FindBy(xpath="/html/body/sp-root/div/div/sp-body/div/sp-app/sp-entity-data/sp-two-col-three-forth/div/div[2]/div/mat-accordion/mat-expansion-panel[1]/div/div/div/sp-dynamic-form-container/div/sp-dynamic-form/form/div/div/sp-numeric[7]/div/div[2]/mat-form-field/div[1]/div/div[2]/input")
	 private WebElement futurePrice;
     
     @FindBy(xpath="//input[@placeholder='Calculated Price']")
	 private WebElement calculatedPrice;
     
     @FindBy(xpath="//input[@placeholder='Publish Price']")
	 private WebElement publishPrice;
     
     @FindBy(xpath = "//input[@placeholder='xPricing Admin Owner']")
 	private WebElement globalImpact;
     
     @FindBy(xpath = " //input[@placeholder='Part Owner']")
  	private WebElement partOwner;
     
     @FindBy(xpath="/html/body/sp-root/div/div/sp-body/div/sp-app/sp-entity-data/sp-two-col-three-forth/div/div[2]/div/mat-accordion/mat-expansion-panel[1]/div/div/div/sp-dynamic-form-container/div/sp-dynamic-form/form/div/div/sp-lookup-select[1]/div/div/div[2]/mat-form-field/div[1]/div/div[2]/mat-select/div/div[1]" )
	 private WebElement pricingActionMethod;
     
     

	 public WebElement pricingActionMethodValue() {
		 return  pricingActionMethod;
    }
	
	 
@FindBy(xpath="//input[@placeholder='Search']")
     private WebElement searchPricingMethod;
     
     

     
@FindBy(xpath="(//span[@class='mdc-list-item__primary-text'])[3]")
     private WebElement clickPricingMethod;
     
    


@FindBy(xpath="/html/body/sp-root/div/div/sp-body/div/sp-app/sp-entity-data/sp-two-col-three-forth/div/div[2]/div/mat-accordion/mat-expansion-panel[1]/div/div/div/sp-dynamic-form-container/div/sp-dynamic-form/form/div/div/sp-lookup-select[1]/div/div/div[2]/mat-form-field/div[1]/div/div[2]/mat-select/div/div[1]" )
	 private WebElement increaseLimit;

	

@FindBy(xpath="/html/body/sp-root/div/div/sp-body/div/sp-app/sp-entity-data/sp-two-col-three-forth/div/div[2]/div/mat-accordion/mat-expansion-panel[1]/div/div/div/sp-dynamic-form-container/div/sp-dynamic-form/form/div/div/sp-lookup-select[1]/div/div/div[2]/mat-form-field/div[1]/div/div[2]/mat-select/div/div[1]" )
	 private WebElement pricingActionIncreaseLimit;

	

 @FindBy(xpath="/html/body/sp-root/div/div/sp-body/div/sp-app/sp-entity-data/sp-two-col-three-forth/div/div[2]/div/mat-accordion/mat-expansion-panel[1]/div/div/div/sp-dynamic-form-container/div/sp-dynamic-form/form/div/div/sp-numeric[2]/div/div[2]/mat-form-field/div[1]/div/div[2]/input")
     private WebElement clickNewPartPricingMethod;
 

 
 @FindBy(xpath="//input[@placeholder='Global Total Impact']" )
 private WebElement globalTotalImpact;
 
 
		 @FindBy(xpath=" (//mat-select[@role='combobox'])[17]" )
		 private WebElement cpmLeadApprovalField;
		 
		 @FindBy(xpath=" (//mat-select[@role='combobox'])[18]" )
		 private WebElement dirOfPM1Approval;
		 
		 @FindBy(xpath=" (//mat-select[@role='combobox'])[19]" )
		 private WebElement dirOfPM2Approval;
		 
		 @FindBy(xpath=" (//mat-select[@role='combobox'])[20]" )
		 private WebElement execDirApproval;
		 
		 @FindBy(xpath=" (//mat-select[@role='combobox'])[21]" )
		 private WebElement pricingManagerApproval;
		 
		 @FindBy(xpath=" (//mat-select[@role='combobox'])[21]" )
		 private WebElement coreManagerApproval;
		 
		 @FindBy(xpath=" (//mat-select[@role='combobox'])[21]" )
		 private WebElement previousPartPrice;
		 
		 public WebElement previousPartPrice() {
			 return  previousPartPrice;
		}
		 
	
		 public WebElement globalTotalImpact() {
			 return  globalTotalImpact;
		}

		 public WebElement coreManagerApproval() {
			 return  coreManagerApproval;
		}
		 
		 public WebElement pricingManagerApproval() {
			 return  pricingManagerApproval;
		}
		 
		 public WebElement execDirApproval() {
			 return  execDirApproval;
		}
		 
		 public WebElement dirOfPM2Approval() {
			 return  dirOfPM2Approval;
		}

		 
		 public WebElement dirOfPM1Approval() {
			 return  dirOfPM1Approval;
		}

		 
		 public WebElement cpmLeadApprovalField() {
			 return  cpmLeadApprovalField;
		}

 public WebElement pricingActionIncreaseLimit() {
	 return  pricingActionIncreaseLimit;
}
 
     public WebElement forecastMultiplier() {
    	 return forecastMultiplier;
     }
     
     public WebElement pricingActionMethod() {
		 return  pricingActionMethod;
    }
     
     public WebElement clickPricingMethod() {
    	 return clickPricingMethod;
                 
             }
     
     public WebElement finResponsibilityCode() {
    	 return finResponsibilityCode;
     }
     
     public WebElement resultingCost() {
    	 return resultingCost;
     }
     
     public WebElement corexRefReport() {
    	 return corexRefReport;
     }
     
     public WebElement currentEffectiveDate() {
    	 return currentEffectiveDate;
     }
     
     
     public WebElement currentPrice() {
    	 return currentPrice;
     }
     
     public WebElement resultingCostHistory() {
    	 return resultingCostHistory;
     }

     
     public WebElement brandMinor() {
    	 return brandMinor;
     }
    		
     public WebElement saleable() {
    	 return saleable;
    		 
    	 }
     
     public WebElement partOwner() {
   		
   		return partOwner;
   	}
   
  	
  	public WebElement globalImpact() {
  		
  		return globalImpact;
  	}
      
      public WebElement publishPrice() {
     	 return publishPrice;
     		 
     	 }
    
      public WebElement calculatedPrice() {
     	 return futurePrice;
     		 
     	 }
      
      public WebElement futurePrice() {
     	 return futurePrice;
     		 
     	 }
      
     

  public WebElement searchPricingMethod() {
     	 return searchPricingMethod;
                  
              }
     
     public WebElement pricingActionhistory() {
    	 return jvIdentifier;
    		 
    	 }

     public WebElement jvIdentifier() {
    	 return jvIdentifier;
    		 
    	 }
     
     public WebElement certificationLevel() {
    	 return uniqueCommon;
    		 
    	 }
     
     public WebElement uniqueCommon() {
    	 return uniqueCommon;
    		 
    	 }
     
     public WebElement futureSalesStatusCode() {
    	 return futureSalesStatusCode;
    		 
    	 }
     
     public WebElement salesStatusCode() {
    	 return salesStatusCode;
    		 
    	 }
     
     public WebElement apmCode() {
    	 return selectElement;
    		 
    	 }
     
     public WebElement selectElement() {
    	 return selectElement;
    		 
    	 }
     
     public WebElement searchChangeReason() {
    	 return searchChangeReason;
    		 
    	 }
     
     public void clickSearchSelectPricing() {
    	 clickSearchSelectPricing.click();
    		 
    	 }
     
     public WebElement searchSelectPricingAction() {
      	  return searchSelectPricingAction;
    		 
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
		
	 
	 
	 public WebElement saveButton() { 
		 return saveButton;
		
	 }
	 
	 public WebElement dnPricingEntity() { 
		 return entityname;
		
	 } 
	 
	

	 public WebElement businessOwner() { 
		 return businessOwner;
		
	 } 
	 
	
	 public WebElement productBU() { 
		 return productBU;
		
	 } 
	
	 public WebElement pricingAdminOwner() { 
		 return pricingAdminOwner;
		
	 } 
	 
	
	 
	 public void enterEntityname() {
		 entityname.click();
		 
	 }
	 
	 public void searchEntityname() {
		 searchentityname.click();
		 searchentityname.sendKeys("030 - DN Pricing");
	 }
	 public void clickEntityname() {
		 clickentityname.click();
	 }
	 
	 public void  checkFirstGridOption() {
		 checkfirstgrid.click();
	 }
	 
		 public WebElement codeValue () { 
			 return code;
			
		 } 
		 
		 public WebElement nameValue () { 
			 return name;
			
		 } 
		 
		 public WebElement accenturePartValue () { 
			 return accenturePart;
			
		 } 
		 
		 public WebElement associatedFixedPriceValue () { 
			 return associatedFixedPrice;
			
		 } 
		 
		 public WebElement brandValue () { 
			 return brand;
			
		 } 
		 
		 public WebElement changeReasonValue () { 
			 return changeReason;
			
		 } 
		 
		 public WebElement coreMgrApprovalValue () { 
			 return coreMgrApproval;
			
		 } 
		 
		 public WebElement cpmValue() { 
			 return cpm;
			
		 } 
		 
		 public WebElement cpmLeadApprovalValue() { 
			 return cpmLeadApproval;
			
		 } 
		 
		 public WebElement dirOfPm1ApprovalValue() { 
			 return dirOfPm1Approval;
			
		 } 
		 
		 public WebElement dirOfPm2ApprovalValue() { 
			 return dirOfPm2Approval;
			
		 } 
		 
		 public WebElement displacementLitersValue() { 
			 return displacementLiters;
			
		 } 
		 
		 public WebElement eccValue() { 
			 return ecc;
			
		 } 
		 
		 public WebElement engineModelValue() { 
			 return engineModel;
			
		 }
		 
		 public WebElement execDirectorApprovalValue() { 
			 return execDirectorApproval;
			
		 }
		 
		 public WebElement informationValue() { 
			 return information;
			
		 }
		 
		 public WebElement priceBelowCostValue() { 
			 return priceBelowCost;
			
		 }
		 
		 public WebElement pricingActionValue() { 
			 return pricingAction;
			
		 }
		 
		 public WebElement pricingMgrApprovalValue() { 
			 return pricingMgrApproval;
			
		 }
		 
		 public WebElement publishFlag() { 
			 return publishFlag;
			
		 }
		 
		 public WebElement regionValue() { 
			 return region;
			
		 }
		 
		 public WebElement regionalLowVolumeValue() { 
			 return regionalLowVolume;
			
		 }
		 public WebElement regionalPricingFlagValue() { 
			 return regionalPricingFlag;
			
		 }
		 public WebElement restrictedPricingValue() { 
			 return restrictedPricing ;
			
		 }
		 
		 public WebElement segmentTypeValue() { 
			 return segmentType ;
			
		 }
		 
		 public WebElement selectPricingActionValue() { 
			 return selectPricingAction ;
			
		 }
		 public WebElement swappValue() { 
			 return swapp ;
			
		 }
		 
		 public WebElement swappProgramAnalysisCodeValue() { 
			 return swappProgramAnalysisCode ;
			
		 }
		 
		 public WebElement annualVolumeValue() { 
			 return annualVolume ;
			
		 }
		 
		 public WebElement avgCurrentPriceValue() { 
			 return avgCurrentPrice ;
			
		 }
		 public WebElement avgResultingCostValue() { 
			 return avgResultingCost ;
			
		 }
		 
		 public WebElement futureEffectiveDateValue() { 
			 return futureEffectiveDate ;
			
		 }
		 public WebElement currentDateValue() { 
			 return currentDate ;
			
		 }
		 
		
		
	 
}