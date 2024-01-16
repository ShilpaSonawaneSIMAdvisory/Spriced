package org.pageobjects;

import org.baseclass.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ExplorerPage_110_ECC_Minor extends BaseClass {//rename Explorer_010_Part
	
	public  ExplorerPage_110_ECC_Minor() {
		
		
		PageFactory.initElements(driver,this);
	}
	 
   

	 
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

	 @FindBy(xpath = "/html/body/sp-root/div/div/sp-body/div/sp-app/sp-entity-data/sp-two-col-three-forth/div/div[2]/div/mat-accordion/mat-expansion-panel[1]/div/div/div/sp-dynamic-form-container/div/sp-dynamic-form/form/div/div/sp-lookup-select[2]/div/div/div[2]/mat-form-field/div[1]/div/div[2]/mat-select/div/div[1]")
	 private WebElement segmenttype;
	 
	//
	 



	public void enterEntityname() {
		 entityname.click();
		 
	}

	public void searchEntityname() {
		 searchentityname.click();
		 searchentityname.sendKeys("110-ECC Minor");
	}


	public void clickEntityname() {
		 clickentityname.click();
	}

	public void clickGrid() {
		 clickgrid.click();

	}
	public WebElement segmentType110_ECC() {
	 	return segmenttype;
	 

	}
	
	
	}
	 