package org.pageobjects;

import org.baseclass.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ModelManagementPage extends BaseClass {

      
    	public ModelManagementPage() {
		
        
        PageFactory.initElements(driver,this);
    }
    
    @FindBy(xpath="/html/body/sp-root/div/div/sp-body/div/sp-app/sp-defnition-entity/sp-one-col/div/sp-data-grid/div/div/sp-header-action[1]/button/mat-icon")
    private WebElement modelCreation;
    
    @FindBy(xpath="//input[@placeholder='Name']")
    private WebElement modelName;
    
    @FindBy(xpath="//input[@placeholder='DisplayName']")
    private WebElement modelDisplayName;
    
    @FindBy(xpath="//input[@placeholder='Description']")
    private WebElement description;
    
    @FindBy(xpath="(//span[@class='mdc-button__label'])[2]")
    private WebElement save;
    
    @FindBy(xpath="(//span[@class='mdc-button__label'])[1]")
    private WebElement cancel;
    
    @FindBy(xpath="(//datatable-body-row[@role='row'])[2]")
    private WebElement clickGrid;
    
    @FindBy(xpath="(//mat-icon[@role='img'])[8]")
    private WebElement edit;
    
    @FindBy(xpath=" (//mat-icon[@role='img'])[9]")
    private WebElement delete;
    
    @FindBy(xpath="(//span[@class='mdc-button__label'])[3]")
    private WebElement no;
    
    @FindBy(xpath="(//span[@class='mdc-button__label'])[2]")
    private WebElement confirmdDeleteYes;
    @FindBy(xpath="//div[@class='w-80 font-light pl-2 pr-2']")
    private WebElement createdMessage;
    @FindBy(xpath="//div[@class='w-80 font-light pl-2 pr-2']")
    private WebElement deletedMessage;
    
   
    //w-80 font-light pl-2 pr-2
    
        
     public void  modelCreation() {
         modelCreation.click();
             
    }
     public WebElement  modelName() {
         return modelName;
             
    }
     public WebElement  modelDisplayName() {
         return modelDisplayName;
             
    }
     public WebElement  description() {
         return description;
             
    }
    
         
     public void  save() {
          save.click();
             
    }
     public void  cancel() {
        cancel.click();
             
    }
     
     public WebElement clickGrid() {
    	 return clickGrid;
              
     }
     
     public void  edit() {
    	 edit.click();
              
     }
     
     public void  delete() {
    	 delete.click();
              
     }
     
     public void  no() {
    	 no.click();
              
     }
     
     public void  confirmdDeleteYes() {
    	 confirmdDeleteYes.click();
              
     }
     public WebElement  createdMessage() {
    	 return createdMessage;
              
     }
     public WebElement  deletedMessage() {
    	 return deletedMessage;
              
     }
     
     
     
     
     //clickGrid
    
    //confirmdDeleteYes
     }
    
    
