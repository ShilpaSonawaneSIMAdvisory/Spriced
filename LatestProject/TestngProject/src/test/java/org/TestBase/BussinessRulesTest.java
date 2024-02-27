package org.TestBase;


import static org.testng.Assert.assertEquals;

import java.io.IOException;
import java.util.Date;

import org.apache.poi.EncryptedDocumentException;
import org.baseclass.BaseClass;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.pageobjects.*;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import org.utils.GetTestData;
import org.utils.GetTextBoxValue;
import org.utils.ScrollByVisibleElement;

import com.Report.TestListener;

@Listeners(TestListener.class)

public class BussinessRulesTest extends BaseClass {
	HomePage hp;
	SystemAdministrator sp;
	RulesPage rulespage;
	ScrollByVisibleElement scroll;
	GetTextBoxValue textbox;
	GetTestData exceldata;
	Login_TC login = new Login_TC();
	JavascriptExecutor jse;
	RulesPage rule;
	

	@Test(priority=0)
	private void creatRule() throws InterruptedException, EncryptedDocumentException, IOException {

		hp = new HomePage();
		hp.EnterSystemAdministrator();

		sp = new SystemAdministrator();
		sp.EnterRules();

		Thread.sleep(2000);
		exceldata =new GetTestData();
		scroll=new ScrollByVisibleElement();
		textbox=new GetTextBoxValue();
		rule=new RulesPage();
		
		
		rule.modelName();
		rule.searchModelName();
		Thread.sleep(2000);
		rule.clickModelName();
		
		rule.entityName();
		rule.searchEntityName();
		Thread.sleep(2000);
		rule.clickEntityName();
		
		
		rule.attributeName();
		rule.searchAttributeName();
		rule.clickAttributeName();
		
		Thread.sleep(2000);
		
		rule.addField();
		
		Thread.sleep(5000);
		
			
		String businessRuleName = exceldata.getTestDataRules(1, 0);
		System.out.println("Business rule name: "+businessRuleName);
		rule.businessRuleName().sendKeys(businessRuleName);
		Thread.sleep(2000);
		
		
		/*rule.priority().click();
		String priorityNumber = exceldata.getTestDataRules(1, 1);
		System.out.println("priority: "+priorityNumber);
		rule.priority().sendKeys(priorityNumber);*/
		
		
		
	    WebElement priority = rule.priority();
	    String priorityNumber = exceldata.getTestDataRules(1, 1);
		rule.priority().sendKeys(priorityNumber);
		System.out.println("Priority is : "+priorityNumber);
		
		
	    rule.type();
	    Thread.sleep(2000);
		rule.changeValue().click();
		
		String descriptionName = exceldata.getTestDataRules(1, 3);
		System.out.println("description: "+descriptionName);
		rule.description().sendKeys(descriptionName);
		
	
		
	/*	WebElement description = rule.description();
		rule.description().sendKeys("Business rule name-Validation Type");
		System.out.println("Description is : "+description);*/
		
		rule.ifAddNew();
		
		Thread.sleep(3000);
		
		rule.ifAttribute();
		
		
	//	rule.searchIfAttribute().sendKeys("attribute1");
		String searchIfAttribute = exceldata.getTestDataRules(1, 4);
		System.out.println("searchIfAttribute: "+searchIfAttribute);
		rule.searchIfAttribute().sendKeys(searchIfAttribute);
		
		rule.clickSearchIfAttribute().click();
		
		
		rule.ifOperator();
		rule.lessThan().click();
		
		boolean selectState = rule.radioValue().isSelected();
		
		//performing click operation only if element is not selected
		if(selectState == false) {
			rule.radioValue().click();
		}
		
		
		rule.ifAttributeValue().click();
	//	rule.ifAttributeValue().sendKeys("100");
		String ifAttributeValueExcel = exceldata.getTestDataRules(1, 5);
		System.out.println("ifAttributeValue: "+ifAttributeValueExcel);
		rule.ifAttributeValue().sendKeys(ifAttributeValueExcel);
		
		Thread.sleep(5000);
		rule.thenAddNew();
		
		rule.thenAttribute().click();
	//	rule.searchThenAttribute().sendKeys("attribute2");
		String searchThenAttributeExcel = exceldata.getTestDataRules(1, 6);
		System.out.println("searchThenAttribute: "+searchThenAttributeExcel);
		rule.searchThenAttribute().sendKeys(searchThenAttributeExcel);
		rule.clickThenAttribute().click();
		
				
		rule.thenAction();
		rule.Equals().click();
		

		rule.thenRadioValue().click();
		
		rule.thenAttributeValue().click();
		//rule.thenAttributeValue().sendKeys("200");
		String thenAttributeValueExcel = exceldata.getTestDataRules(1, 7);
		System.out.println("thenAttributeValue: "+thenAttributeValueExcel);
		rule.thenAttributeValue().sendKeys(thenAttributeValueExcel);

		Thread.sleep(5000);
		
		
		rule.save();
		
		String message=rule.ruleCreated().getText();
		assertEquals(message,"Rule is created successfully!", "Rule is created successfully!");
		
		
	}
		
		
		@Test(priority=1)
		private void ruleView() throws InterruptedException, EncryptedDocumentException, IOException {

			hp = new HomePage();
			hp.EnterSystemAdministrator();

			sp = new SystemAdministrator();
			sp.EnterRules();

			Thread.sleep(2000);
			exceldata =new GetTestData();
			scroll=new ScrollByVisibleElement();
			textbox=new GetTextBoxValue();
			rule=new RulesPage();
			
			
			rule.modelName();
			rule.searchModelName();
			Thread.sleep(2000);
			rule.clickModelName();
			
			rule.entityName();
			rule.searchEntityName();
			Thread.sleep(2000);
			rule.clickEntityNameEdit();
			
			
			rule.attributeName();
			rule.searchAttributeName();
			rule.clickAttributeName();
			
			Thread.sleep(2000);
			
    	rule.clickRefresh().click();
    	Thread.sleep(2000);
    	
    	rule.clickGrid().click();
		rule.clickEdit().click();
		Thread.sleep(2000);
		rule.publish();
		Thread.sleep(5000);
		rule.confirmYes().click();
		Thread.sleep(5000);
		
		String message=rule.ruleUpdated().getText();
		assertEquals(message,"Rule is Updated successfully!", "Rule is Updated successfully!");
		

	}
		
		@Test(priority=3)
		private void ruleEditDelete() throws InterruptedException, EncryptedDocumentException, IOException {

			hp = new HomePage();
			hp.EnterSystemAdministrator();

			sp = new SystemAdministrator();
			sp.EnterRules();

			Thread.sleep(2000);
			exceldata =new GetTestData();
			scroll=new ScrollByVisibleElement();
			textbox=new GetTextBoxValue();
			rule=new RulesPage();
			
			
			rule.modelName();
			rule.searchModelName();
			Thread.sleep(2000);
			rule.clickModelName();
			
			rule.entityName();
			rule.searchEntityName();
			Thread.sleep(2000);
			rule.clickEntityNameEdit();
			
			
			rule.attributeName();
			rule.searchAttributeName();
			rule.clickAttributeName();
			
			Thread.sleep(2000);
			
    	   rule.clickRefresh().click();
    	   Thread.sleep(2000);
    	
    	   rule.clickGrid().click();
    	   rule.clickView();
    	   Thread.sleep(2000);
    	   rule.clickBack().click();
    	   rule.clickRefresh().click();
    	   rule.clickGrid().click();
    	   rule.clickDelete().click();
    	   rule.confirmDelete();
    	   Thread.sleep(5000);
		   
    	   String message=rule.ruleDeleted().getText();
   		   assertEquals(message,"Rule is deleted successfully!", "Rule is deleted successfully!");

	}
	

	@BeforeMethod
	public void loginSpriced() throws EncryptedDocumentException, InterruptedException, IOException {
		launchBrowser();
		login.loginToSpriced();
		
		System.out.println("Test case execution started successfully");
		

	}

	@BeforeClass
	public void openBrowser() throws EncryptedDocumentException, InterruptedException, IOException {

	}

	@AfterMethod
	public void endTime() {
		Date d = new Date();
		System.out.println(d);
	}

	@AfterClass
	public void closeBrowser() {
//		quit();

	}

}
