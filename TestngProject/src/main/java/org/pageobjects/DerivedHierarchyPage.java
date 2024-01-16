package org.pageobjects;

import org.baseclass.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DerivedHierarchyPage extends BaseClass {

    
	public DerivedHierarchyPage() {
	
    
    PageFactory.initElements(driver,this);
	}
	
	
	@FindBy(xpath="/html/body/sp-root/div/div/sp-body/div/sp-app/app-hierarchy-definition/mat-tab-group/div/mat-tab-body[1]/div/app-hierarchy-view-tab/div/sp-data-grid/div/div/sp-header-component-wrapper/div/sp-select-search/mat-form-field/div[1]/div[2]/div/mat-select/div/div[1]")
	private WebElement modelname;
	
	@FindBy(xpath="//input[@placeholder='Search']")
	private WebElement searchModelName;
	
	@FindBy(xpath="(//span[@class='mdc-list-item__primary-text'])[2]")
	private WebElement clickModelName;
	
	@FindBy(xpath="(//div[@class='datatable-body-cell-label'])[2]")
	private WebElement clickGrid;
	
	@FindBy(xpath="(//mat-icon[@role='img'])[7]")
	private WebElement clickEdit;
	@FindBy(xpath="(//mat-icon[@role='img'])[8]")
	private WebElement clickDelete;
	
	@FindBy(xpath="/html/body/sp-root/div/div/sp-body/div/sp-app/app-hierarchy-definition/mat-tab-group/div/mat-tab-body[1]/div/app-hierarchy-view-tab/div/sp-data-grid/ngx-datatable/div/datatable-body/datatable-selection/datatable-scroller/datatable-row-wrapper/datatable-body-row/div[2]/datatable-body-cell[5]/div/img")
	private WebElement clickView;

	@FindBy(xpath="/html/body/sp-root/div/div/sp-body/div/sp-app/sp-derived-hierarchy/sp-three-col/div/div[1]/div/mat-accordion/mat-expansion-panel/div/div/div/sp-hierarchy-treeview/ngx-datatable/div/datatable-body/datatable-selection/datatable-scroller/datatable-row-wrapper[2]/datatable-body-row/div[2]/datatable-body-cell/div/button/span/i")
	private WebElement clickExpand;
	
	@FindBy(xpath="/html/body/sp-root/div/div/sp-body/div/sp-app/sp-derived-hierarchy/sp-three-col/div/div[1]/div/mat-accordion/mat-expansion-panel/div/div/div/sp-hierarchy-treeview/ngx-datatable/div/datatable-body/datatable-selection/datatable-scroller/datatable-row-wrapper[4]/datatable-body-row/div[2]/datatable-body-cell/div/button/span/i")
	private WebElement clickExpand1;
	
	@FindBy(xpath="/html/body/sp-root/div/div/sp-body/div/sp-app/sp-derived-hierarchy/sp-three-col/div/div[1]/div/mat-accordion/mat-expansion-panel/div/div/div/sp-hierarchy-treeview/ngx-datatable/div/datatable-body/datatable-selection/datatable-scroller/datatable-row-wrapper[3]/datatable-body-row/div[2]/datatable-body-cell/div/span/mat-checkbox/div/div/input")
	private WebElement clickCheckBox;
	

	@FindBy(xpath="/html/body/sp-root/div/div/sp-body/div/sp-app/sp-derived-hierarchy/sp-three-col/div/div[1]/div/mat-accordion/mat-expansion-panel/div/div/div/sp-hierarchy-treeview/ngx-datatable/div/datatable-body/datatable-selection/datatable-scroller/datatable-row-wrapper[4]/datatable-body-row/div[2]/datatable-body-cell/div/span/mat-checkbox/div/div/input")
	private WebElement clickCheckBox1;
	
	
	
	@FindBy(xpath="(//span[@class='mat-mdc-focus-indicator'])[4]")
	private WebElement cutButton;
	@FindBy(xpath="(//span[@class='mat-mdc-focus-indicator'])[5]")
	private WebElement pasteButton;
	
	
	@FindBy(xpath="(/html/body/sp-root/div/div/sp-body/div/sp-app/app-hierarchy-definition/mat-tab-group/div/mat-tab-body[2]/div/app-hierarchy-new-tab/div/form/div[1]/mat-form-field[1]/div[1]/div/div[2]/input")
	private WebElement editName;
	
	@FindBy(xpath="(//span[@class='mdc-button__label'])[2]")
	private WebElement clickSave;
	
	///html/body/sp-root/div/div/sp-body/div/sp-app/app-hierarchy-definition/mat-tab-group/div/mat-tab-body[2]/div/app-hierarchy-new-tab/div/form/div[1]/button[2]/span[2]
	
	public void clickSave() {
		clickSave.click();
			 
		 }
	
	
	public void editName() {
		editName.click();
		editName.sendKeys("SanityTestingDH");
			 
		 }
	
	 
	public void enterModelname() {
    modelname.click();
		 
	 }
	public void searchModelName() {
		searchModelName.sendKeys("sanitytestingDH");
			 
	}
	public void clickModelName() {
		clickModelName.click();
			 
	}
	public void clickGrid() {
		clickGrid.click();
			 
	}
	public void clickEdit() {
		clickEdit.click();
			 
	}
	public void clickDelete() {
		clickDelete.click();
			 
	}
	public void clickView() {
		clickView.click();
			 
	}
	public void clickExpand() {
		clickExpand.click();
			 
	}
	public void clickExpand1() {
		clickExpand1.click();
			 
	}

	public void clickCheckBox() {
		clickCheckBox.click();
			 
	}
	public void clickCheckBox1() {
		clickCheckBox1.click();
			 
	}
	public void cutButton() {
		cutButton.click();
			 
	}
	public void pasteButton() {
		pasteButton.click();
			 
	}
   
    @FindBy(xpath="//span[@class='mdc-tab__text-label' and contains(text(), 'Add/Edit')]")
    private WebElement addEditBtn;

    @FindBy(xpath="(//span[@class='mdc-list-item__primary-text'])[2]")
    private WebElement clickEntity;
    
            
    @FindBy(xpath="//div[@class='mat-mdc-select-value ng-tns-c3393473648-8']")
    private WebElement selectModel;
    
    @FindBy(xpath="//input[@placeholder='Search']")
    private WebElement searchModel;
    
    @FindBy(xpath="//input[@placeholder='Search']")
    private WebElement searchEntity;
    
    @FindBy(xpath="//div[@class='mat-mdc-select-value ng-tns-c3393473648-10']")
    private WebElement selectEntity;
    
    @FindBy(xpath="//input[@class='mat-mdc-input-element ng-tns-c1205077789-5 ng-untouched ng-pristine ng-invalid mat-mdc-form-field-input-control mdc-text-field__input cdk-text-field-autofill-monitored']")
    private WebElement addName;
    
    @FindBy(xpath="//input[@class='mat-mdc-input-element ng-tns-c1205077789-6 ng-untouched ng-pristine ng-valid mat-mdc-form-field-input-control mdc-text-field__input cdk-text-field-autofill-monitored']")
    private WebElement addDescription;
    
    @FindBy(xpath="(//span[@class='mdc-list-item__primary-text'])[2]")
    private WebElement clickModel;
    
    @FindBy(xpath="(//button[@color='primary'])[6]")
    private WebElement AddBtnPartOwner;
    
    @FindBy(xpath="//span[@class='mdc-button__label' and contains(text(), 'Save')]")
    private WebElement saveBtn;
    
    
    public void saveBtn() {
        
        saveBtn.click();
    }
    
    public void AddBtnPartOwner() {
        
        AddBtnPartOwner.click();
    }
    


    public void clickEntity() {
        
        clickEntity.click();
    }
    public void clickModel() {
        
        clickModel.click();
    }
    
    public void selectEntity() {
        
        selectEntity.click();
    }
    
    
    public void searchEntity() {
        
        searchEntity.click();
        searchEntity.sendKeys("035 - Base Price");
    }
    
    public void searchModel() {
        
        searchModel.click();
        searchModel.sendKeys("nrp");
    }
    public WebElement addDescription() {
        
        return addDescription;
    }
    
    

    public WebElement addName() {
        
        return addName;
    }
    
    
    
    public void selectModel() {
        
        selectModel.click();
    }
    
    public void clickAddEditBtn() {
        
        addEditBtn.click();
    }
    
}