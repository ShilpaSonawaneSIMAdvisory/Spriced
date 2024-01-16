package org.pageobjects;

import org.baseclass.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ExplorerPage_100_ECC extends BaseClass {//rename Explorer_010_Part
	
	public ExplorerPage_100_ECC() {
		
		
		PageFactory.initElements(driver,this);
	}
    
 @FindBy(xpath = "//div[@id='mat-select-value-1']")
 private WebElement modelname;
 
 //
 @FindBy(xpath = "//input[@placeholder='Search']")
 private WebElement searchmodelname;
 
 @FindBy(xpath="//span[contains(text(),'Demo 3 NRP Pricing')]")
 private WebElement clickmodelname;
 
 @FindBy(xpath="//div[@id='mat-select-value-3']")
 private WebElement entityname;
 
//
 @FindBy(xpath = "//input[@placeholder='Search']")
 private WebElement searchentityname;

 @FindBy(xpath="(//span[@class='mdc-list-item__primary-text'])[3]")
 private WebElement clickentityname;
 
 @FindBy(xpath="(//div[@class='datatable-row-center datatable-row-group ng-star-inserted'])[6]")
 private WebElement clickgrid;
//

 @FindBy(xpath = "/html[1]/body[1]/sp-root[1]/div[1]/div[1]/sp-body[1]/div[1]/sp-app[1]/sp-entity-data[1]/sp-two-col-three-forth[1]/div[1]/div[2]/div[1]/mat-accordion[1]/mat-expansion-panel[1]/div[1]/div[1]/div[1]/sp-dynamic-form-container[1]/div[1]/sp-dynamic-form[1]/form[1]/div[1]/div[1]/sp-lookup-select[1]/div[1]/div[1]/div[2]/mat-form-field[1]/div[1]/div[1]/div[2]/mat-select[1]/div[1]/div[1]/span[1]/span[1]")
 private WebElement segmenttype;
 
//
 
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
	 searchentityname.sendKeys("100-ECC");
}


public void clickEntityname() {
	 clickentityname.click();
}

public void clickGrid() {
	 clickgrid.click();

}
public WebElement segmentType100_ECC() {
 	return segmenttype;
 
 	
} 
}
 