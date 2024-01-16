package org.pageobjects;

import org.baseclass.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HierarchyPermissionPage extends BaseClass {
    
    
        public HierarchyPermissionPage() {
        
        
        PageFactory.initElements(driver,this);
    }
        
         @FindBy(xpath = "(//mat-select[@role='combobox'])[1]")
         private WebElement modelDropDown;

         @FindBy(xpath = "(//mat-select[@role='combobox'])[2]")
         private WebElement entityDropDown;

         @FindBy(xpath = "(//mat-select[@role='combobox'])[3]")
         private WebElement hierarchyDropDown;

         @FindBy(xpath = "(//mat-select[@role='combobox'])[4]")
         private WebElement roleDropDown;
         
         @FindBy(xpath = "//input[@placeholder='Search']")
         private WebElement modelSearchBox;
         
         @FindBy(xpath = "//span[@class='mdc-list-item__primary-text' and contains(text(),' nrp ')]")
         private WebElement nrp;
         
         @FindBy(xpath = "//input[@placeholder='Search']")
         private WebElement entitySearchBox;
         
         @FindBy(xpath = "//span[@class='mdc-list-item__primary-text' and contains(text(),' 035 - Base Price ')]")
         private WebElement basePrice;
         
         @FindBy(xpath = "//input[@placeholder='Search']")
         private WebElement hierarchySearchBox;
         
         @FindBy(xpath = "//span[@class='mdc-list-item__primary-text' and contains(text(),  'Base Price Owner' )]")
         private WebElement hierarchyBasePriceOwner;
         
         @FindBy(xpath = "//span[@class='mdc-list-item__primary-text' and contains(text(),' John ')]")
         private WebElement johnUser;
         
         @FindBy(xpath = "//i[@class='icon datatable-icon-up ng-star-inserted']")
         private WebElement root;
         
         @FindBy(xpath = "//span[@class='mat-mdc-menu-trigger ml-4' and contains(text(), ' Brazil Local{}')]")
         private WebElement brazilLocal;
         

         @FindBy(xpath = "//span[@class='mat-mdc-menu-item-text' and contains(text(), 'Read-only')]")
         private WebElement readonly;
         
         public void root() {

             root.click(); 
         }
         
         public void brazilLocal() {

             brazilLocal.click(); 
         }
         
         public void readonly() {

             readonly.click(); 
         }
        
        
         public void johnUser() {

             johnUser.click(); 
         }
         
         public void hierarchyBasePriceOwner() {

             hierarchyBasePriceOwner.click(); 
         }
         
         public void hierarchySearchBox() {

             hierarchySearchBox.click(); 
         }
         public void clickShilpaTest12() {

             basePrice.click();
             
         }
         
         public void entitySearchBox() {

             entitySearchBox.click();
             entitySearchBox.sendKeys("035 - Base Price");
             
         }
         
         public void clickModel2112() {

             nrp.click();;
             
         }

        
         public void modelSearchBox() {

             modelSearchBox.click();
             modelSearchBox.sendKeys("nrp");
             
         }

         public void clickRoleDrop() {

             roleDropDown.click();;
             
         }

         public void clickHierarchyDropDown() {

             hierarchyDropDown.click();;
             
         }

         public void clickEntityDropDown() {

             entityDropDown.click();
             
         }

         public void clickModelDropDown() {

             modelDropDown.click();;
             
         }

}