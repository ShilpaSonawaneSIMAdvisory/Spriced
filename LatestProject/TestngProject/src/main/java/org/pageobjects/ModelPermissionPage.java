package org.pageobjects;

import org.baseclass.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ModelPermissionPage extends BaseClass {
    
    
            
            public ModelPermissionPage() {
        
                    PageFactory.initElements(driver,this);
            }
            
             @FindBy(xpath = "(//mat-select[@role='combobox'])[1]")
             private WebElement userRoleDropDown;
             

             @FindBy(xpath = "(//span[@class='mdc-list-item__primary-text'])[3]")
             private WebElement johnRole;
             
             @FindBy(xpath = "(//mat-select[@role='combobox'])[2]")
             private WebElement modelDropDown;
             
             @FindBy(xpath = "//input[@placeholder='Search']")
             private WebElement modelSearchBox;
             
             @FindBy(xpath = "//span[@class='mdc-list-item__primary-text' and contains(text(),'Model2112')]")
             private WebElement clickModel2112;
            
             @FindBy(xpath = "(//div[@class='datatable-body-cell-label'])[1]")
             private WebElement clickModelDisplayName;
             
             @FindBy(xpath = "(//div[@class='datatable-body-cell-label'])[2]")
             private WebElement clickPermissionDropDown;
             
             @FindBy(xpath = "//span[@class='mdc-list-item__primary-text' and contains(text(),'READ')]")
             private WebElement clickReadPermission;
             
             @FindBy(xpath = "(//span[@class='mdc-button__label'])[2]")
             private WebElement savePermission;
             
             @FindBy(xpath = "//div[@class='w-80 font-light pl-2 pr-2' and contains(text(),'Succesfully Saved')]")
             private WebElement validationMessageSucessfullySaved;


             public WebElement validationMessageSucessfullySaved() {

                return validationMessageSucessfullySaved;
                 
             }
            
             public void savePermission() {

                 savePermission.click();
                 
             }
            
             public void clickReadPermission() {

                 clickReadPermission.click();
                 
             }
             public void clickPermissionDropDown() {

                 clickPermissionDropDown.click();
                 
             }

             public void clickModelDisplayName() {

                 clickModelDisplayName.click();
                 
             }

             public void clickModel2112() {

                 clickModel2112.click();
                 
             }
            
             public void modelSearchBox() {
                 modelSearchBox.click();
                 modelSearchBox.sendKeys("Model2112");
                 
             }
             
             public void modelDropDown() {
                 modelDropDown.click();
                 
             }
             
             public void clickJohnRole() {
                 johnRole.click();
                 
             }
             
            
             public void userRoleDropDown() {
                 userRoleDropDown.click();
                 
             }
            
            

}
