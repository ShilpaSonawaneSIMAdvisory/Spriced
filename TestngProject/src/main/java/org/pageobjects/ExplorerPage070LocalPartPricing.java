package org.pageobjects;

import org.baseclass.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ExplorerPage070LocalPartPricing extends BaseClass {
	
	
		
		public ExplorerPage070LocalPartPricing() {
			
			
			PageFactory.initElements(driver,this);
		}
		
		@FindBy(xpath = "//span[@class='mdc-list-item__primary-text' and contains(text(),' 070 - Local Part Pricing ')]")
	    private WebElement clickentityname;

		
		
		@FindBy(xpath = "//input[@placeholder='Search']")
	    private WebElement searchentityname;
		
		@FindBy(xpath = "(//mat-icon[@role='img'])[10]")
	    private WebElement filterBtn;
		
		@FindBy(xpath = "(//mat-select[@role='combobox'])[63]")
	    private WebElement filterDropDown;
		
		@FindBy(xpath = "//input[@placeholder='Search']")
	    private WebElement filterSearchBox;
		
		@FindBy(xpath = "(//mat-select[@role='combobox'])[65]")
	    private WebElement filterInputBox;
		
		
		@FindBy(xpath = "(//mat-select[@role='combobox'])[5]")
	    private WebElement regionalPricingFlag;
		
		@FindBy(xpath = "//span[@class='mdc-button__label' and contains(text(), 'Rule')]")
	    private WebElement ruleFilter;
		
		@FindBy(xpath = "(//span[@class='mdc-list-item__primary-text' ])[3]")
	    private WebElement selectPartNumber;
		
		@FindBy(xpath = "//span[@class='mdc-button__label' and contains(text(), 'Apply')]")
	    private WebElement filterApplyBtn;
		
		@FindBy(xpath = "//input[@placeholder='Search']")
	    private WebElement regionalPricingFlagSearch;
		
		  @FindBy(xpath="(//span[@class='mdc-button__label'])[132]")
		  private WebElement save;
		  
		  @FindBy(xpath="(//mat-select[@role ='combobox'])[15]")
		  private WebElement locallySourcedCode;
		  
		  @FindBy(xpath="//input[@placeholder='Calculated Price']")
		  private WebElement calculatedPrice;
		
		  @FindBy(xpath="//input[@placeholder='Local Cost']")
		  private WebElement localCost;
		  
		  @FindBy(xpath="//input[@placeholder='Resulting Cost']")
		  private WebElement resultingCost;
		  
		  @FindBy(xpath="//input[@placeholder='Current Price']")
		  private WebElement currentPrice;
		  
		  @FindBy(xpath="//input[@placeholder='Publish Price']")
		  private WebElement publishPrice;
		  
		  @FindBy(xpath="//input[@placeholder='Future Effective Date']")
		  private WebElement futureEffectiveDate;
		  
		  @FindBy(xpath="(//mat-select[@role='combobox'])[15]")
		  private WebElement locallySourceCode;
		  
		  @FindBy(xpath="(//mat-select[@role='combobox'])[14]")
		  private WebElement localSegment;
		  
		  public WebElement localSegment() {
				 return localSegment;
					
				}
		  
		  public WebElement locallySourceCode() {
				 return locallySourceCode;
					
				}
		
		  public WebElement futureEffectiveDate() {
				 return futureEffectiveDate;
					
				}
		
		  public WebElement publishPrice() {
				 return publishPrice;
					
				}
		  
		  public WebElement currentPrice() {
				 return currentPrice;
					
				}
		  
		  public WebElement resultingCost() {
				 return resultingCost;
					
				}
		  
		  
		  public WebElement localCost() {
				 return localCost;
					
				}
		  
		  public WebElement calculatedPrice() {
			 return calculatedPrice;
				
			}
		  
		  public WebElement locallySourcedCode() {
				 return locallySourcedCode;
					
				}
		
		  public void saveOption() {
			  save.click();
				
			}
		public WebElement regionalPricingFlagSearch() {
			return regionalPricingFlagSearch;
			
		}
		
		
		public void filterApplyBtn() {
			filterApplyBtn.click();
			
		}
		
		
		
		public WebElement selectPartNumber() {
			return selectPartNumber;
			
		}
		
		
		public WebElement ruleFilter() {
			return ruleFilter;
			
		}

		public WebElement regionalPricingFlag() {
			return regionalPricingFlag;
			
		}
		
		
		public WebElement filterInputBox() {
			return filterInputBox;
			
		}
		
		public WebElement filterSearchBox() {
			return filterSearchBox;
			
		}
		
		public void filterDropDown() {
			filterDropDown.click();
		}
		
		public void filterBtn() {
			filterBtn.click();
		}

		
		
		public void clickentityname() {
			clickentityname.click();
		}
		
		public void searchentityname() {
			
			searchentityname.click();
			searchentityname.sendKeys("070 - Local Part Pricing");
			
		}
}
