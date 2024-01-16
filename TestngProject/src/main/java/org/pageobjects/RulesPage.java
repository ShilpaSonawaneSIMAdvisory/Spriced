package org.pageobjects;

import org.baseclass.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RulesPage extends BaseClass{
	
	public RulesPage(){
		
		PageFactory.initElements(driver,this);
	}
	
		
	//Model
	
	@FindBy(xpath="/html/body/sp-root/div/div/sp-body/div/sp-app/sp-list/sp-one-col/div/div/mat-grid-list/div/form/div/mat-form-field[1]/div[1]/div/div[2]/mat-select/div/div[1]") 
	private WebElement modelName;
	
	@FindBy(xpath="//input[contains(@placeholder,'Search')]") 
	private WebElement searchModelName;
	
	@FindBy(xpath="/html/body/div[2]/div[2]/div/div/mat-option[3]/span")
	private WebElement clickModelName;
	
	//entity.......................................
	
	@FindBy(xpath="/html[1]/body[1]/sp-root[1]/div[1]/div[1]/sp-body[1]/div[1]/sp-app[1]/sp-list[1]/sp-one-col[1]/div[1]/div[1]/mat-grid-list[1]/div[1]/form[1]/div[1]/mat-form-field[2]/div[1]/div[1]/div[2]/mat-select[1]/div[1]/div[1]") 
	private WebElement entityName;
	
	@FindBy(xpath="//input[@placeholder='Search']")
	private WebElement searchEntityName;
	
	@FindBy(xpath="/html/body/div[2]/div[2]/div/div/mat-option[3]")
	private WebElement clickEntityName;
	
	@FindBy(xpath="/html/body/div[2]/div[3]/div/div/mat-option[3]")
	private WebElement clickEntityNameEdit;
	
	 @FindBy(xpath="//div[@class='w-80 font-light pl-2 pr-2']")
	    private WebElement ruleCreated;
	 @FindBy(xpath="//div[@class='w-80 font-light pl-2 pr-2']")
	    private WebElement ruleDeleted;
	 @FindBy(xpath="//div[@class='w-80 font-light pl-2 pr-2']")
	    private WebElement ruleUpdated;
	
	
	
	
	//entity.................Quote Details.................
	
	@FindBy(xpath="/html[1]/body[1]/sp-root[1]/div[1]/div[1]/sp-body[1]/div[1]/sp-app[1]/sp-list[1]/sp-one-col[1]/div[1]/div[1]/mat-grid-list[1]/div[1]/form[1]/div[1]/mat-form-field[2]/div[1]/div[1]/div[2]/mat-select[1]/div[1]/div[1]") 
	private WebElement entityNameQuoteDetails;
	
	@FindBy(xpath="//input[@placeholder='Search']")
	private WebElement searchEntityNameQuoteDetails;
	
	@FindBy(xpath="//span[@class='mdc-list-item__primary-text' and contains(text(),' Quote Detail ')]")
	private WebElement clickEntityNameQuoteDetails;
	
	
	//Search attribute	
	
	@FindBy(xpath="/html[1]/body[1]/sp-root[1]/div[1]/div[1]/sp-body[1]/div[1]/sp-app[1]/sp-list[1]/sp-one-col[1]/div[1]/div[1]/mat-grid-list[1]/div[1]/form[1]/div[1]/mat-form-field[3]/div[1]/div[1]/div[2]/mat-select[1]/div[1]/div[1]")
    private WebElement attributeName;
	
	//select attribute
	@FindBy(xpath="//input[@placeholder='Search']")
	private WebElement searchAttributeName;
	
	@FindBy(xpath="//span[@class='mdc-list-item__primary-text' and contains(text(),' All ')]")
	private WebElement clickAttributeName;
	
	//Select add rule
	
	@FindBy(xpath="(//mat-icon[@role='img'])[7]")
	private WebElement addField;	
	
	@FindBy(xpath="/html/body/sp-root/div/div/sp-body/div/sp-app/sp-business-rule-name/div/form/div[1]/div[1]/mat-form-field/div[1]/div/div[2]/input")
	private WebElement businessRuleName;	
	
	@FindBy(xpath="//input[@placeholder='Enter number in range 1-100']")
	private WebElement priority;
	
	@FindBy(xpath="//textarea[@placeholder='Add description']")
	private WebElement description;
	
	@FindBy(xpath="/html/body/sp-root/div/div/sp-body/div/sp-app/sp-business-rule-name/div/form/div[1]/div[3]/mat-form-field/div[1]/div/div[2]/mat-select")
	private WebElement type;
	
	//Type----------------------------------
	
	@FindBy(xpath="//(//mat-option[@role='option'])[1]")
	private WebElement defaultValue;
	
	@FindBy(xpath="//span[@class='capitalize' and contains(text(), 'change value')]")
	private WebElement changeValue;
	
	@FindBy(xpath="//span[@class='capitalize' and contains(text(), 'validation')]")
	
	private WebElement validationValue;
	
	//---------------------030-DN Pricing
	
	@FindBy(xpath="(//span[@class='mdc-button__label' and contains(text(),'Add new')])[1]")
	private WebElement ifAddNew;
	
	@FindBy(xpath="(//span[@class='mdc-button__label' and contains(text(),'Add new')])[2]")
	private WebElement thenAddNew;
	
	@FindBy(xpath="(//span[@class='mdc-button__label' and contains(text(),'Add new')])[3]")
	private WebElement elseAddNew;
	
	//--------------------if Attribute--------------------------//
	
	@FindBy(xpath="/html/body/sp-root/div/div/sp-body/div/sp-app/sp-business-rule-name/div/form/sp-business-rule-list/div/ul/li/sp-business-rule-list/div/div/form/div/div/div/div[1]/mat-form-field/div[1]/div/div[2]/div/input[2]")
	private WebElement ifAttribute;
	
	@FindBy(xpath="//input[@placeholder='Search...']")
	private WebElement searchIfAttribute;
	
	@FindBy(xpath="/html/body/div[2]/div[2]/div/div/div/button")
	private WebElement clickSearchIfAttribute;
	
	
			
	@FindBy(xpath="/html[1]/body[1]/sp-root[1]/div[1]/div[1]/sp-body[1]/div[1]/sp-app[1]/sp-business-rule-name[1]/div[1]/form[1]/sp-business-rule-list[1]/div[1]/ul[1]/li[1]/sp-business-rule-list[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[2]/mat-form-field[1]/div[1]/div[1]/div[2]/mat-select[1]/div[1]/div[1]/span[1]")
	private WebElement ifOperator;
	
	@FindBy(xpath="(//input[@placeholder='Add Value'])[3]")
	private WebElement ifAttributeValue;
	
	@FindBy(xpath="/html[1]/body[1]/sp-root[1]/div[1]/div[1]/sp-body[1]/div[1]/sp-app[1]/sp-business-rule-name[1]/div[1]/form[1]/sp-business-rule-list[1]/div[1]/ul[1]/li[1]/sp-business-rule-list[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[4]/mat-form-field[1]/div[1]/div[1]/div[2]/mat-select[1]/div[1]/div[1]")
	private WebElement condition;
	
	//-----------------------------then attribute------------------------//
	
	@FindBy(xpath="/html/body/sp-root/div/div/sp-body/div/sp-app/sp-business-rule-name/div/form/div[5]/div/spriced-frontend-businessactions/div/div[1]/mat-form-field/div[1]/div/div[2]/div/input[2]")
	private WebElement thenAttribute;
	
	@FindBy(xpath="//input[@placeholder='Search...']")
	private WebElement searchThenAttribute;
	
	@FindBy(xpath="/html/body/div[2]/div[2]/div/div/div/button")
	private WebElement clickThenAttribute;
	
		
	@FindBy(xpath="/html[1]/body[1]/sp-root[1]/div[1]/div[1]/sp-body[1]/div[1]/sp-app[1]/sp-business-rule-name[1]/div[1]/form[1]/div[5]/div[1]/spriced-frontend-businessactions[1]/div[1]/div[2]/mat-form-field[1]/div[1]/div[1]/div[2]/mat-select[1]/div[1]/div[1]/span[1]")
	private WebElement thenAction;
	
	@FindBy(xpath="(//input[@type='radio'])[4]")
	private WebElement thenRadioValue;

	@FindBy(xpath="/html/body/sp-root/div/div/sp-body/div/sp-app/sp-business-rule-name/div/form/div[5]/div/spriced-frontend-businessactions/div/div[3]/mat-form-field/div[1]/div/div[2]/input")
	private WebElement thenAttributeValue;
	
	@FindBy(xpath="//span[@class='mat-mdc-menu-item-text' and contains(text(),'Future Price' )]")
	private WebElement futurePrice;
	
	@FindBy(xpath="//p[text()='Less Than']")
	private WebElement lessThan;
	
	@FindBy(xpath="(//input[@type='radio'])[2]")
	private WebElement radioValue;
	
	@FindBy(xpath="//p[text()='Equals']")
	private WebElement Equals;
	
	
	//-----------------------160 Quote Details----------------------
	
	
	
	
	//--------------------save -----------------publish--------cancel-------------------
	
	
	@FindBy(xpath="//span[@class='mdc-button__label' and contains(text(),'Publish')]")
	private WebElement publish;
	
	@FindBy(xpath="//span[@class='mdc-button__label' and contains(text(),'Save')]")
	private WebElement save;
	
	@FindBy(xpath="(//span[@class='mat-mdc-focus-indicator'])[13]")
	private WebElement confirmYes;
	
	
	
	
	@FindBy(xpath="//span[@class='mdc-button__label' and contains(text(),'Cancel')]")
	private WebElement cancel;
	
	@FindBy(xpath="(//datatable-body-cell[@role='cell' and @class='datatable-body-cell sort-active ng-star-inserted'])[6]")
	private WebElement clickGrid;
	
	@FindBy(xpath="(//mat-icon[@role='img'])[8]")
	private WebElement clickRefresh;
	
	@FindBy(xpath="(//mat-icon[@role='img'])[9]")
	private WebElement clickEdit;
	
	@FindBy(xpath="(//mat-icon[@role='img'])[10]")
	private WebElement clickDelete;
	
	@FindBy(xpath="(//mat-icon[@role='img'])[11]")
	private WebElement clickView;
	
	@FindBy(xpath="//span[@class='mdc-button__label']")
	private WebElement clickBack;
	
	
	@FindBy(xpath="(//span[@class='mdc-button__label'])[2]")
	private WebElement confirmDelete;
	
	

	
	public void modelName() {
		 modelName.click();
	}
	
	public void searchModelName() {
		 searchModelName.click();
		 searchModelName.sendKeys("sanitytesting");
	}
	
	public void clickModelName() {
		clickModelName.click();
	}
	
	//-----------------------30 dn pricing
	
	public void entityName() {
		entityName.click();
	}
	public void searchEntityName() {
		searchEntityName.click();
		searchEntityName.sendKeys("RulesTesting");;
	}
	public void clickEntityName() {
		 clickEntityName.click();;
	}
	
	
	public void attributeName() {
		 attributeName.click();
	}
	public void searchAttributeName() {
		 searchAttributeName.click();
		 searchAttributeName.sendKeys("All");
	}
	public void clickAttributeName() {
		 clickAttributeName.click();
	}
	
	public void addField() {
		addField.click();
	}
	
	public WebElement businessRuleName() {
		return businessRuleName;
		
	}
	
	public WebElement priority() {
		return priority;
	}
	
	public WebElement description() {
		return description;
	}
	
	public void type() {
		type.click();
	}
	
	public void defaultValue() {
		defaultValue.click();
	}
	
	public WebElement changeValue() {
		return changeValue;
	}
	public WebElement validationValue() {
		return validationValue;
	}
	
	public void ifAddNew() {
		ifAddNew.click();
	}
	
	public void thenAddNew() {
		thenAddNew.click();
	}
	public void elseAddNew() {
	    elseAddNew.click();
	}
	public void ifAttribute() {
		ifAttribute.click();
	}
	public WebElement searchIfAttribute() {
		return searchIfAttribute;
	}
	public WebElement clickSearchIfAttribute() {
		return clickSearchIfAttribute;
	}
	
	public void ifOperator() {
		ifOperator.click();
	}
	
	public WebElement ifAttributeValue() {
		return ifAttributeValue;
	}
	public void condition() {
		condition.click();
	}
	
	public WebElement thenAttribute() {
		return thenAttribute;
	}
	public WebElement searchThenAttribute() {
		return searchThenAttribute;
	}
	public WebElement clickThenAttribute() {
		return clickThenAttribute;
	}
	
	public void thenAction() {
		thenAction.click();
	}
	
	public WebElement thenAttributeValue() {
		return thenAttributeValue;
	}
	
	public void publish() {
		publish.click();
	}
	
	public void save() {
		save.click();
	}
	
	public void cancel() {
		cancel.click();
	}
	
	public WebElement futurePrice() {
		return futurePrice;
	}
	
	public WebElement lessThan() {
		return lessThan;
	}
	
	public WebElement radioValue() {
		return radioValue;
	}
	public WebElement Equals() {
		return Equals;
	}
	
	public WebElement thenRadioValue() {
		return thenRadioValue;
	}
	
	public WebElement confirmYes() {
		return confirmYes;
	}
	
	public WebElement clickRefresh() {
		return clickRefresh;
	}
	public WebElement clickGrid() {
		return clickGrid;
	}
	
	public WebElement clickEdit() {
		return clickEdit;
	}
	public WebElement clickDelete() {
		return clickDelete;
	}

	public void clickEntityNameEdit() {
		clickEntityNameEdit.click();
	}
	
	public void clickView() {
		clickView.click();
	}
	
	public WebElement clickBack() {
		return clickBack;
	}
	
	public void confirmDelete() {
		confirmDelete.click();
	}
	
	public WebElement ruleCreated() {
		return ruleCreated;
	}
	public WebElement ruleDeleted() {
		return ruleDeleted;
	}
	public WebElement ruleUpdated() {
		return ruleUpdated;
	}
	
	
	
}


	
	

	
