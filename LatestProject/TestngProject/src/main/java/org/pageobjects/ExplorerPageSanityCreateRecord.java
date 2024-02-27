package org.pageobjects;

import org.baseclass.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ExplorerPageSanityCreateRecord extends BaseClass {
	
	
public ExplorerPageSanityCreateRecord() {
		
		
		PageFactory.initElements(driver,this);
	}
 

		@FindBy(xpath = "//input[@placeholder='Name']")
		private WebElement name;
		
		@FindBy(xpath = "//input[@placeholder='Code']")
		private WebElement code;
		
		@FindBy(xpath = "//input[@placeholder='TextAt']")
		private WebElement textAt;
		
		@FindBy(xpath = "//input[@placeholder='numAt']")
		private WebElement numAt;
		
		@FindBy(xpath = "//input[@placeholder='Annotation']")
		private WebElement annotation;
		
		@FindBy(xpath = "//button[@title='Add']")
		private WebElement addBtn;
		
		@FindBy(xpath = "//div[@class='w-80 font-light pl-2 pr-2' and contains(text(), 'Record created successfully.')]")
		private WebElement recordCreatedSucessfullyValidationMessage;
		
		@FindBy(xpath = "//button[@title='Delete Member']")
		private WebElement deleteButton;
		
		@FindBy(xpath = "//div[@class='w-80 font-light pl-2 pr-2' and contains(text(),'Record deleted successfully.')]")
		private WebElement recordDeletedSucessfullyValidationMessage;
		
		@FindBy(xpath = "//div[@class='w-80 font-light pl-2 pr-2' and contains(text(),'Record updated successfully.')]")
		private WebElement recordUpdatedSucessfullyValidationMessage;
		
		
		@FindBy(xpath = "(//span[@class='mdc-button__label'])[4]")
		private WebElement deletePopupYesButton;
		
		public void deletePopupYesButton() {
			
			deletePopupYesButton.click();;
		}
		
		public WebElement recordDeletedSucessfullyValidationMessage() {
			
			return recordDeletedSucessfullyValidationMessage;
		}
		
		
		
		public WebElement recordUpdatedSucessfullyValidationMessage() {
			
			return recordUpdatedSucessfullyValidationMessage;
		}
		

		
		public void deleteButton() {
			
			deleteButton.click();
		}
		
		
		
		public WebElement recordCreatedSucessfullyValidationMessage() {
			
			return recordCreatedSucessfullyValidationMessage;
		}
		public void addBtn() {
			
			addBtn.click();
		}
			
	
		public WebElement name() {
			
			return name;
		}
			
		public WebElement code() {
			
			return code;
		}
		
		public WebElement textAt() {
			
			return textAt;
		}
		
		public WebElement numAt() {
			
			return numAt;
		}
		
		public WebElement annotation() {
			
			return annotation;
		}
		


}
