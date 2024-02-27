package org.pageobjects;

import org.baseclass.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Bulkupload extends BaseClass {//rename Explorer_010_Part
	
	public Bulkupload() {
		
		
		PageFactory.initElements(driver,this);
	}
	@FindBy(xpath = "/html[1]/body[1]/sp-root[1]/div[1]/div[1]/sp-body[1]/div[1]/sp-app[1]/sp-entity-data[1]/sp-two-col-three-forth[1]/div[1]/div[1]/div[1]/div[1]/sp-data-grid[1]/div[1]/div[1]/sp-header-component-wrapper[1]/div[1]/sp-entity-select[1]/div[1]/mat-form-field[1]/div[1]/div[2]/div[1]/mat-select[1]/div[1]/div[1]")
	 private WebElement modelname;

	 

	@FindBy(xpath = " /html[1]/body[1]/div[2]/div[3]/div[1]/div[1]/mat-option[2]/span[1]")
	private WebElement selectTagEntity;
	 //
	 @FindBy(xpath = "//input[@placeholder='Search']")
	 private WebElement searchmodelname;
	 
	 @FindBy(xpath="/html/body/div[2]/div[53]/div/div/mat-option[5]/span")
	 private WebElement clickmodelname;
	 
	 
	 @FindBy(xpath="/html/body/sp-root/div/div/sp-body/div/sp-app/sp-entity-data/sp-two-col-three-forth/div/div[1]/div/div/sp-data-grid/div/div/sp-header-component-wrapper/div/sp-entity-select/div/mat-form-field[2]/div[1]/div[2]/div/mat-select/div/div[1]")
	 private WebElement entityname;
	 

	 @FindBy(xpath = "//input[@placeholder='Search']")
	 private WebElement searchEntityName;
	 
	 //
	 @FindBy(xpath="/html/body/div[2]/div[3]/div/div/mat-option[4]")
	 private WebElement scrollentityname;
	 @FindBy(xpath="/html/body/div[2]/div[53]/div/div/mat-option[3]/span")
	 private WebElement clickentityname;
	 
	 @FindBy(xpath="/html/body/sp-root/div/div/sp-body/div/sp-app/sp-entity-data/sp-two-col-three-forth/div/div[1]/div/div/sp-data-grid/div/div/div[2]/sp-header-action[7]/button/mat-icon")
	 private WebElement bulkupload1;
	 
	 @FindBy(xpath="(//mat-icon[@role='img'])[12]")
	 private WebElement bulkupload;
	 
	 @FindBy(xpath="(//mat-icon[@role='img'])[13]")
	 private WebElement exportOption;
	 
	 @FindBy(xpath="//html/body/div[2]/div[53]/div/div/div/div/button	 ")
	 private WebElement exportDownload;
	 
	 
	 @FindBy(xpath="//input[@type='file']")
	 private WebElement chooseFile;
	 
	 @FindBy(xpath="(//span[@class='mdc-button__label'])[4]")
	 private WebElement uploadFile;
	 
	 @FindBy(xpath="/html/body/sp-root/div/div/sp-body/div/sp-app/sp-entity-data/sp-two-col-three-forth/div/div[1]/div/div/sp-data-grid/div/div/div[2]/sp-header-action[8]/button/mat-icon")
	 private WebElement clickDownload;
	 
	 @FindBy(xpath="//span[@class='text-xs self-end file-excel fontawesomeicon']")
	 private WebElement clickDownloadExcelFile;
	 
	 @FindBy(xpath="(//span[@class='mdc-button__label'])[4]")
	 private WebElement clickConfirmationYes;
	 

	 @FindBy(xpath="/html/body/sp-root/div/div/sp-body/div/sp-app/sp-entity-data/sp-two-col-three-forth/div/div[1]/div/div/sp-data-grid/div/div/div[2]/sp-header-action[9]/button/mat-icon")
	 private WebElement clickStatus;
	 
	 @FindBy(xpath="(//div[@class='datatable-body-cell-label'])[5]")
	 private WebElement clickDownloadExcelFromStatus;
	 	 
	 //
	 
	 public void enterModelname() {
		 modelname.click();
		 
	 }
	 public WebElement searcModelname() {
		 return searchmodelname;

	}
	 public void clickModelname() {
		 clickmodelname.click();
	 }
	 
	 public void enterEntityname() {
		 entityname.click();
		 
	 }
	 
	 public WebElement searchEntityname() {
		 return searchEntityName;
	 }
	 
	 public void clickEntityname() {
		 clickentityname.click();
		
		 
	 }
	 public void bulkUploadButton() {
		 bulkupload1.click();
		
		 
	 }
/*	 public void chooseFile() {
		// chooseFile.click();
		 chooseFile.sendKeys("C:\\Users\\nirmala.j_simadvisor\\Desktop\\bulkuploadyy.xlsx");
		
		 
	 }*/
	 
	 public WebElement chooseFile() {
			// chooseFile.click();
			 return chooseFile;
						 
		 }
	 
	 
	 public void exportOption() {
		 exportOption.click();
		
		 
	 }
	 public void exportDownload() {
		 exportDownload.click();
		
		 
	 }
	 
	 public void uploadFile() {
		 uploadFile.click();
		
		 
	 }
	 public void clickDownload() {
		 clickDownload.click();
		
		 
	 }
	 public void clickDownloadExcelFile() {
		 clickDownloadExcelFile.click();
		
		 
	 }
	 public void clickStatus() {
		 clickStatus.click();
		
		 
	 }
	 
	 public void clickDownloadExcelFromStatus() {
		 clickDownloadExcelFromStatus.click();
		
		 
	 }
	 
	 public void clickConfirmationYes() {
		 clickConfirmationYes.click();
		
		 
	 }
	 
	//
}
