package org.pageobjects;

import org.baseclass.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EntityManagementPage extends BaseClass {

      
    	public EntityManagementPage() {
		
        
        PageFactory.initElements(driver,this);
    	}
    	
@FindBy(xpath="/html/body/sp-root/div/div/sp-body/div/sp-app/sp-entity/sp-one-col/div/sp-data-grid/div/div/sp-header-component-wrapper/div/mat-form-field/div[1]/div[2]/div/mat-select/div/div[1]")
private WebElement clickModel;

@FindBy(xpath="//input[@placeholder='Search']")
private WebElement searchModel;

@FindBy(xpath="(//mat-option[@role='option'])[3]")
private WebElement selectModel;


@FindBy(xpath="(//mat-icon[@aria-hidden='true'])[7]")
private WebElement addEntity;

@FindBy(xpath="/html/body/div[2]/div[2]/div/mat-dialog-container/div/div/sp-entity-add/div/div[1]/div[1]/div[1]/form/div/mat-form-field/div[1]/div/div[2]/input")
private WebElement entityName;

@FindBy(xpath="/html/body/div[2]/div[2]/div/mat-dialog-container/div/div/sp-entity-add/div/div[1]/div[1]/div[2]/mat-form-field/div[1]/div/div[2]/input")
private WebElement entityDisplayName;

@FindBy(xpath="/html/body/div[2]/div[2]/div/mat-dialog-container/div/div/sp-entity-add/div/div[1]/div[1]/div[3]/mat-form-field/div[1]/div/div[2]/input")
private WebElement entityDescription;


@FindBy(xpath="/html/body/div[2]/div[2]/div/mat-dialog-container/div/div/sp-entity-add/div/div[1]/mat-card/div/div[2]/mat-form-field[1]/div[1]/div/div[2]/input")
private WebElement attributeName;


@FindBy(xpath="/html/body/div[2]/div[2]/div/mat-dialog-container/div/div/sp-entity-add/div/div[1]/mat-card/div/div[2]/mat-form-field[2]/div[1]/div/div[2]/input")
private WebElement attributeDisplayName;

@FindBy(xpath="/html/body/div[2]/div[2]/div/mat-dialog-container/div/div/sp-entity-add/div/div[1]/mat-card/div/div[2]/mat-form-field[3]/div[1]/div/div[2]/input")
private WebElement attributeDescription;

@FindBy(xpath="/html/body/div[2]/div[2]/div/mat-dialog-container/div/div/sp-entity-add/div/div[1]/mat-card/div/div[2]/mat-form-field[5]/div[1]/div/div[2]/input")
private WebElement length;
@FindBy(xpath="(//span[@class='mdc-button__label'])[2]")
private WebElement addAttributeOption;

@FindBy(xpath="(//span[@class='mdc-button__label'])[4]")
private WebElement saveOption;

@FindBy(xpath="/html/body/div[2]/div[2]/div/mat-dialog-container/div/div/sp-entity-add/div/div[1]/mat-card/div/div[2]/mat-form-field[4]/div[1]/div/div[2]/mat-select")
private WebElement clickDatatype;


@FindBy(xpath="/html/body/div[2]/div[4]/div/div/mat-option[2]")
private WebElement chooseTextDatatype;

@FindBy(xpath="/html/body/div[2]/div[4]/div/div/mat-option[3]")
private WebElement chooseNumberDatatype;

@FindBy(xpath="/html/body/div[2]/div[4]/div/div/mat-option[4]")
private WebElement chooseLinkDatatype;

@FindBy(xpath="/html/body/div[2]/div[4]/div/div/mat-option[5]")
private WebElement chooseDateDatatype;

@FindBy(xpath="/html/body/div[2]/div[4]/div/div/mat-option[6]")
private WebElement chooseBooleanDatatype;

@FindBy(xpath="/html/body/div[2]/div[2]/div/mat-dialog-container/div/div/sp-entity-add/div/div[1]/mat-card/div/div[2]/div[2]/mat-form-field/div[1]/div/div[2]/input")
private WebElement clickDecimal;


@FindBy(xpath="(//div[@class='datatable-body-cell-label'])[1]")
private WebElement clickGrid;

@FindBy(xpath="/html/body/sp-root/div/div/sp-body/div/sp-app/sp-entity/sp-one-col/div/sp-data-grid/div/div/sp-header-action[2]/button/mat-icon")
private WebElement clickEditOption;

@FindBy(xpath="/html/body/div[2]/div[2]/div/mat-dialog-container/div/div/sp-entity-add/div/div[1]/mat-card/div/div[1]/sp-data-grid/ngx-datatable/div/datatable-body/datatable-selection/datatable-scroller/datatable-row-wrapper[3]/datatable-body-row/div[2]")
private WebElement clickInnerGrid;

@FindBy(xpath="/html/body/div[2]/div[2]/div/mat-dialog-container/div/div/sp-entity-add/div/div[1]/mat-card/div/div[1]/sp-data-grid/div/div/sp-header-action[1]/button/mat-icon")
private WebElement clickInnerGridEditOption;


@FindBy(xpath="/html/body/div[2]/div[2]/div/mat-dialog-container/div/div/sp-entity-add/div/div[1]/div[2]/button[1]/span[2]")
private WebElement innerGridClear;

@FindBy(xpath="/html/body/div[2]/div[185]/div/mat-dialog-container/div/div/sp-entity-add/div/div[1]/mat-card/div/div[1]/sp-data-grid/div/div/sp-header-action[1]/button/mat-icon")
private WebElement innerGridDeleteOption;



@FindBy(xpath="/html/body/sp-root/div/div/sp-body/div/sp-app/sp-entity/sp-one-col/div/sp-data-grid/div/div/sp-header-action[3]/button/mat-icon")
private WebElement deleteOption;



@FindBy(xpath="/html/body/div[2]/div[2]/div/mat-dialog-container/div/div/sp-confirm-dialog/div/div[2]/button[2]/span[2]")
private WebElement confirmYes;

@FindBy(xpath="/html/body/div[2]/div/div/mat-snack-bar-container/div/div/div/div/sp-snackbar-success/div/div[1]")
private WebElement sucessfullyAddedMessage;


@FindBy(xpath="/html/body/div[2]/div/div/mat-snack-bar-container/div/div/div/div/sp-snackbar-success/div/div[1]")
private WebElement updatedSucessfullyMessage;


@FindBy(xpath="/html/body/div[2]/div/div/mat-snack-bar-container/div/div/div/div/sp-snackbar-success/div/div[1]")
private WebElement deletedSucessfullyMessage;


@FindBy(xpath="/html/body/div[2]/div[2]/div/mat-dialog-container/div/div/sp-entity-add/div/div[1]/mat-card/div/div[1]/sp-data-grid/ngx-datatable/div/datatable-body/datatable-selection/datatable-scroller/datatable-row-wrapper[9]/datatable-body-row/div[2]/datatable-body-cell[3]/div")
private WebElement selectInnerGrid;

//

public void clickModel() {
	clickModel.click();
         
}


public void searchModel() {
	 searchModel.click();
     searchModel.sendKeys("NewModel");         
}

public void selectModel() {
	selectModel.click();
         
}

public void addEntity() {
	addEntity.click();
         
}

public WebElement entityName() {
	return entityName;
         
}
public WebElement entityDisplayName() {
	return entityDisplayName;
         
}
public WebElement entityDescription() {
	return entityDescription;
         
}

public WebElement attributeName() {
	return attributeName;
         
}

public WebElement attributeDisplayName() {
	return attributeDisplayName;
         
}
public WebElement attributeDescription() {
	return attributeDescription;
         
}

public WebElement length() {
	return length;
         
}
public void addAttributeOption() {
	 addAttributeOption.click();
         
}
public void saveOption() {
	saveOption.click();
        
}

public void clickDatatype() {
	clickDatatype.click();
        
}

public void chooseTextDatetype() {
	chooseTextDatatype.click();
        
}

public void chooseNumberDatatype() {
	chooseNumberDatatype.click();
        
}

public void chooseLinkDatatype() {
	chooseLinkDatatype.click();
        
}

public void chooseBooleanDatatype() {
	chooseBooleanDatatype.click();
        
}
public WebElement clickDecimal() {
	return clickDecimal;
        
}

public void clickGrid() {
	clickGrid.click();
        
}

public void clickEditOption() {
	clickEditOption.click();
        
}

public void clickInnerGrid() {
	clickInnerGrid.click();
        
}

public void clickInnerGridEditOption() {
	clickInnerGridEditOption.click();
        
}

public void innerGridClear() {
	innerGridClear.click();
        
}

public void innerGridDeleteOption() {
	innerGridDeleteOption.click();
        
}

public void deleteOption() {
	deleteOption.click();
        
}


public void confirmYes() {
	confirmYes.click();
        
}

public WebElement sucessfullyAddedMessage() {
	return sucessfullyAddedMessage;
         
}
public WebElement updatedSucessfullyMessage() {
	return updatedSucessfullyMessage;
         
}

public WebElement deletedSucessfullyMessage() {
	return deletedSucessfullyMessage;
         
}
public void selectInnerGrid() {
	 selectInnerGrid.click();
         
}


//

}