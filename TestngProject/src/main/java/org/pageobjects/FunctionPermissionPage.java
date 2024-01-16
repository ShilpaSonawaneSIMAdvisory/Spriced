package org.pageobjects;

import org.baseclass.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FunctionPermissionPage extends BaseClass {
    
    
    public FunctionPermissionPage() {
        
        
        PageFactory.initElements(driver,this);
    }
    
     @FindBy(xpath = "//mat-select[@role='combobox']")
     private WebElement clickUserRole;
     
     @FindBy(xpath = "(//span[@class='mdc-list-item__primary-text'])[3]")
     private WebElement clickJohnUser;
     
     @FindBy(xpath = "(//input[@type='checkbox'])[1]")
     private WebElement dataExplorerCheckBox;
     
     @FindBy(xpath = "(//input[@type='checkbox'])[1]")
     private WebElement reportsCheckBox;
     
     @FindBy(xpath = "(//input[@type='checkbox'])[1]")
     private WebElement systemAdminstrationCheckBox;
     
     @FindBy(xpath = "//button[@title='Save']")
     private WebElement saveButton;
     
     @FindBy(xpath = "//div[@class='w-80 font-light pl-2 pr-2' and contains(text(),'Succesfully Saved')]")
     private WebElement validationMessageSucessfullySaved;


     public WebElement validationMessageSucessfullySaved() {

        return validationMessageSucessfullySaved;
         
     }
    
     public void saveButton() {

         saveButton.click();
         
     }
     public void dataExplorerCheckBox() {

         dataExplorerCheckBox.click();
         
     }
     
     public void systemAdminstrationCheckBox() {

         systemAdminstrationCheckBox.click();
         
     }
     
     public void reportsCheckBox() {

         reportsCheckBox.click();
         
     }
     
     public void clickJohnUser() {

         clickJohnUser.click();
         
     }
     public void clickUserRole() {

         clickUserRole.click();
         
     }

}