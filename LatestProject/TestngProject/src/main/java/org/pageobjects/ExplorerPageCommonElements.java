package org.pageobjects;

import org.baseclass.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ExplorerPageCommonElements extends BaseClass {

	
	public ExplorerPageCommonElements() {
		
		
		PageFactory.initElements(driver,this);
	}
	
	  @FindBy(xpath="//sp-header-action[@icon='filter_list']")
	  private WebElement filterBtn;
	  
	  @FindBy(xpath="(//span[@class='mdc-button__label'])[97]")
	  private WebElement ruleFilter;
	  
	  @FindBy(xpath="//input[@placeholder='Search']")
	  private WebElement search;
	  
	  @FindBy(xpath="(//span[@class='mdc-list-item__primary-text'])[3]")
	  private WebElement selectElement;
	  
	  @FindBy(xpath="(//span[@class='mdc-button__label' and contains(text(), 'Apply')])[1]")
	  private WebElement FilterApply;
	  
	  @FindBy(xpath="")
	  private WebElement saveBtn;
	  
	  @FindBy(xpath="(//span[@class='mdc-list-item__primary-text'])[2]")
	  private WebElement clickSelect;
	  
	  public void clickSelect() {
		  
		  clickSelect.click();
	  }
 
	  public void saveBtn() {
		  
		  saveBtn.click();
	  }
	  
	  public void filterApply() {
		  
		  FilterApply.click();
	  }
	  
	  public void selectElement() {
		  
		  selectElement.click();
	  }
	  
	  public WebElement getElement() {
		  
		  return  selectElement;
	  }
	  
	  
	  public WebElement search() {
		  
		  return search;
	  }
	  
	  public void ruleFilter() {
		  
		  ruleFilter.click();
	  }
	  
	  public void filterBtn() {
		  
		  filterBtn.click();
	  }
	
}
