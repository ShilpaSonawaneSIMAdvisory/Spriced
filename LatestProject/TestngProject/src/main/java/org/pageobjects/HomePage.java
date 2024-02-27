package org.pageobjects;

import org.baseclass.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends BaseClass{
	
public HomePage() {
		
		
		PageFactory.initElements(driver,this);
	}
 @FindBy(xpath = "(//mat-icon[contains(@role,'img')])[3]")
 private WebElement DataExplorer;
 
 @FindBy(xpath = "(//mat-icon[contains(@role,'img')])[4]")
 private WebElement Reports;
 
 @FindBy(xpath = "(//mat-icon[contains(@role,'img')])[5]")
 private WebElement SystemAdministrator;
 
 @FindBy(xpath="/html/body/sp-root/div/div/sp-header/nav/sp-top-menu/nav/div/div/ul/li[2]/div")
 private WebElement EntityManagement;

 public void EntityManagement() {
	 EntityManagement.click();;
	 	 
 }
 
 public void EnterDataExplorer() {
	 DataExplorer.click();
	 
 }
 
 public void EnterReports() {
	 Reports.click();
	 	 
 }
 
 public void EnterSystemAdministrator() {
	 SystemAdministrator.click();;
	 	 
 }
 
}
