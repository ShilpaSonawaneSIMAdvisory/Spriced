package org.pageobjects;

import org.baseclass.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SystemAdministrator extends BaseClass{
     
    public SystemAdministrator() {
        
        
        PageFactory.initElements(driver,this);
    }
    
    @FindBy(xpath="(//div[contains(@tabindex,'0')])[1]")
    public WebElement Model_Management;
    
    @FindBy(xpath="(//div[contains(@tabindex,'0')])[2]")
    public WebElement Entity_Management;
    
    @FindBy(xpath="//div[contains(text(),' Rules')]")
    public WebElement Rules;
    
    @FindBy(xpath="(//div[contains(@tabindex,'0')])[4]")
    public WebElement modelPermission;
    
    @FindBy(xpath="(//div[contains(@tabindex,'0')])[5]")
    public WebElement functionPermission;
    
    @FindBy(xpath="(//div[contains(@tabindex,'0')])[6]")
    public WebElement Transaction;
    
    @FindBy(xpath="(//div[contains(@tabindex,'0')])[7]")
    public WebElement derivedHierarchy;
    
    @FindBy(xpath="(//div[contains(@tabindex,'0')])[8]")
    public WebElement hierarchyPermission;
    
    public void clickHierarchyPermission() {
        hierarchyPermission.click();
        
    }
    public void EnterModelmanagement() {
        Model_Management.click();
        
    }
    
    public void EnterEntity_Management() {
        Entity_Management.click();
        
    }
    public void EnterRules() {
        Rules.click();
        
    }
    
    public void clickModelPermission() {
        modelPermission.click();
        
    }
    public void clickFunctionPermission() {
        functionPermission.click();
        
    }
    public void EnterTransaction() {
        Transaction.click();
        
    }
    public void clickDerivedHierarchy() {
        derivedHierarchy.click();
        
    }

    

        
    
    

}