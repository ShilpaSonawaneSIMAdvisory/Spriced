package org.pageobjects;

import org.baseclass.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ExplorerPageCostRangeMultiplier extends BaseClass {

	
	public ExplorerPageCostRangeMultiplier() {
		
		
		PageFactory.initElements(driver,this);
	}
	
	  @FindBy(xpath="/html/body/sp-root/div/div/sp-body/div/sp-app/sp-entity-data/sp-two-col-three-forth/div/div[2]/div/mat-accordion/mat-expansion-panel[1]/div/div/div/sp-dynamic-form-container/div/sp-dynamic-form/form/div/div/sp-input[3]/div[1]/div[2]/mat-form-field/div[1]/div/div[2]/input")
	  private WebElement code;
	  
	  @FindBy(xpath="/html/body/sp-root/div/div/sp-body/div/sp-app/sp-entity-data/sp-two-col-three-forth/div/div[2]/div/mat-accordion/mat-expansion-panel[1]/div/div/div/sp-dynamic-form-container/div/sp-dynamic-form/form/div/div/sp-numeric[3]/div/div[2]/mat-form-field/div[1]/div/div[2]/input")
	  private WebElement multiplier;
	  
	  @FindBy(xpath="//input[@placeholder='Search']")
	  private WebElement searchCostRangeMultiplier;
	  
	  public void searchCostRangeMultiplier() {
		  
		  searchCostRangeMultiplier.click();
		  searchCostRangeMultiplier.sendKeys("p_Cost Range Multiplier");
		  
	  }
	  
	  public WebElement code() {
		  
		  return code;
	  }
	  
	  
	  public WebElement multiplier() {
		  
		  return multiplier;
	  }
	  
	 
}


