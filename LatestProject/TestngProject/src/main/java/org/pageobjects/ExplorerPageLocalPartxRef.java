package org.pageobjects;

import org.baseclass.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ExplorerPageLocalPartxRef extends BaseClass {
	
	
	public ExplorerPageLocalPartxRef() {
		
		
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(xpath = "(//span[@class='mdc-list-item__primary-text'])[3]")
    private WebElement localpart;
	
	
	@FindBy(xpath = "(//mat-select[@role='combobox'])[5]")
    private WebElement jvCode;
	
	@FindBy(xpath = "(//mat-select[@role='combobox'])[6]")
    private WebElement uniqueCommonCode;
	
	@FindBy(xpath = "(//mat-select[@role='combobox'])[7]")
    private WebElement activeFlag;
	
	@FindBy(xpath = "//input[@placeholder='Search']")
    private WebElement searchentity;
	
	@FindBy(xpath = "//span[@class='mdc-list-item__primary-text' and contains(text(),' 080 - Local Part xRef ')]")
    private WebElement clickentity;
	
	@FindBy(xpath = "//button[@title='Filter']")
    private WebElement filterBtn;
	
	@FindBy(xpath = "(//span[@class='mdc-button__label'])[21]")
    private WebElement rule;
	
	@FindBy(xpath = "(//mat-select[@role='combobox'])[12]")
    private WebElement filterDropDown;
	
	@FindBy(xpath = "//input[@placeholder='Search']")
    private WebElement filterSearchBox;
	
	//@FindBy(xpath = "//span[@class='mdc-list-item__primary-text' and contains(text(), 'Local Part')]")
    //private WebElement localPart;
	
	@FindBy(xpath = "(//input[@type='text'])[11]")
    private WebElement inputTextBox;
	
	@FindBy(xpath = "//span[@class='mdc-button__label' and contains(text(), 'Apply')]")
    private WebElement applyBtn;
	
	@FindBy(xpath = "//button[@title='selectItem']")
    private WebElement pencilIcon;
	
	@FindBy(xpath = "//button[@title='Add Filter']")
    private WebElement localPartFilter;
	
	@FindBy(xpath = "(//mat-select[@role='combobox'])[14]")
    private WebElement localPartDropDown;
	
	@FindBy(xpath = "//span[@class='mdc-list-item__primary-text' and contains(text(), 'Code')]")
    private WebElement localPartCode;
	
	@FindBy(xpath = "(//input[@type='text'])[11]")
    private WebElement localPartInputBox;
	
	@FindBy(xpath = "(//input[@type='text'])[10]")
    private WebElement jvCodeSearchBox;
	
	@FindBy(xpath = "(//span[@class='mdc-list-item__primary-text'])[3]")
    private WebElement jvCodeExcelValue;
	
	@FindBy(xpath = "//input[@placeholder='Search']")
    private WebElement uniqueCommonCodeSearchBox;
	
	@FindBy(xpath = "(//span[@class='mdc-list-item__primary-text'])[3]")
    private WebElement uniqueCommonCodeExcelvalue;
	
	@FindBy(xpath = "//span[@class='mdc-list-item__primary-text' and contains(text(), 'Local Part')]")
    private WebElement filterLocalPartElement;
	
	@FindBy(xpath = "(//span[@class='mdc-button__label'])[31]")
    private WebElement localPartFilterRule;
	
	@FindBy(xpath = "(//span[@class='mdc-button__label'])[35]")
    private WebElement localPartFilterApply;
	
	@FindBy(xpath = "(//div[@class='datatable-body-cell-label'])[953]")
    private WebElement selectLocalPart;
	
	@FindBy(xpath = "(//span[@class='mdc-button__label'])[29]")
    private WebElement submitBtn;
	
	@FindBy(xpath = "(//span[@class='mdc-button__label'])[26]")
    private WebElement applyButton;
	
	@FindBy(xpath = "//input[@placeholder='Search']")
    private WebElement searchJvCode;
	
	@FindBy(xpath = "//input[@placeholder='Search']")
    private WebElement searchField;
	
	@FindBy(xpath = "(//span[@class='mdc-list-item__primary-text'])[3]")
    private WebElement selectElement;
	
	
	 @FindBy(xpath="//button[@type='submit']")
	 private WebElement save;
	
	 public void saveOption() {
		 save.click();
				 
		 }
	 
	public void selectElement() {
		selectElement.click();
			 
	 }
	
	public WebElement searchField() {
		return searchField;
		
			 
	 }
	
	public void searchJvCode() {
		searchJvCode.click();
			 
	 }
	
	public void applyButton() {
		applyBtn.click();
			 
	 }
	
	public void submitBtn() {
		submitBtn.click();
			 
	 }
	
	
	public void selectLocalPart() {
		selectLocalPart.click();
			 
	 }
	
	public void localPartFilterApply() {
		localPartFilterApply.click();
			 
	 }
	
	public void localPartFilterRule() {
		localPartFilterRule.click();
			 
	 }
	
	public void filterLocalPartElement() {
		filterLocalPartElement.click();
			 
	 }
	
	public WebElement uniqueCommonCodeExcelvalue() {
		 return uniqueCommonCodeExcelvalue;
			 
	 }
	
	
	public WebElement uniqueCommonCodeSearchBox() {
		 return uniqueCommonCodeSearchBox;
			 
	 }
	
	
	 public WebElement jvCodeExcelValue() {
		 return jvCodeExcelValue;
			 
	 }
	
	 public WebElement jvCodeSearchBox() {
		 return jvCodeSearchBox;
			 
	 }
	
	 public WebElement localPartInputBox() {
		 return localPartInputBox;
	 }
	 
	 public void localPartCode() {
		 localPartCode.click();
	 }
	
	 public void localPartDropDown() {
		 localPartDropDown.click();
	 }
	
	 public void localPartFilter() {
		 localPartFilter.click();
	 }
	 public void pencilIcon() {
		 pencilIcon.click();
	 }
	
	
	 public void applyBtn() {
		 applyBtn.click();
	 }
	
	 public void inputTextBox() {
		 inputTextBox.click();
	 }
	
	
	 public void localPart() {
		 localpart.click();
	 }
	
	
	 public void filterSearchBox() {
		 filterSearchBox.click();
		 filterSearchBox.sendKeys("Local Part");
	 }
	
	 
	
	
	 public void filterDropDown() {
		 filterDropDown.click();
	 }
	
	 public void rule() {
		 rule.click();
	 }
	
	 public void filterBtn() {
		 filterBtn.click();
	 }
	
	 public void clickentity() {
		 clickentity.click();
	 }
	
	 public void searchentity() {
		 searchentity.click();
		 searchentity.sendKeys("Local Part xRef");
	 }
	
	public WebElement activeFlag() {
		
		return activeFlag;
	}
	public WebElement uniqueCommonCode() {
		
		return uniqueCommonCode;
	}
	
	public WebElement jvCode() {
		
		return jvCode;
	}
	public WebElement localpart() {
		
		return localpart;
	}
	
}