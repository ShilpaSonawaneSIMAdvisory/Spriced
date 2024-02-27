package org.TestBase;

import java.io.IOException;
import java.text.DateFormat;
import java.util.Date;

import org.apache.poi.EncryptedDocumentException;
import org.baseclass.BaseClass;
import org.openqa.selenium.JavascriptExecutor;
import org.pageobjects.DerivedHierarchyPage;
import org.pageobjects.HomePage;
import org.pageobjects.RulesPage;
import org.pageobjects.SystemAdministrator;
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

	public class DerivedHierarchy  extends BaseClass {
		HomePage hp;
		SystemAdministrator sp;
		ScrollByVisibleElement scroll;
		GetTextBoxValue textbox;
		GetTestData exceldata;
		Login_TC login = new Login_TC();
		DerivedHierarchyPage derived;
		DerivedHierarchyPage derivedHierarchyPage;
		
		
		

		@Test(priority=0)
		private void selectModelAndEdit() throws InterruptedException, EncryptedDocumentException, IOException {

			hp = new HomePage();
			hp.EnterSystemAdministrator();

			sp = new SystemAdministrator();
			sp.clickDerivedHierarchy();

			Thread.sleep(2000);
			exceldata =new GetTestData();
			scroll=new ScrollByVisibleElement();
			textbox=new GetTextBoxValue();
			DerivedHierarchyPage derived=new DerivedHierarchyPage();
			
			derived.enterModelname();
			derived.searchModelName();
			derived.clickModelName();
			derived.clickGrid();
			derived.clickEdit();
			derived.editName();
			derived.clickSave();
			
			
			
		}
		@Test(priority=2)
		private void ViewDerivedHierarchy() throws InterruptedException, EncryptedDocumentException, IOException {

			hp = new HomePage();
			hp.EnterSystemAdministrator();

			sp = new SystemAdministrator();
			sp.clickDerivedHierarchy();

			Thread.sleep(2000);
			exceldata =new GetTestData();
			scroll=new ScrollByVisibleElement();
			textbox=new GetTextBoxValue();
			DerivedHierarchyPage derived=new DerivedHierarchyPage();
			
			derived.enterModelname();
			derived.searchModelName();
			derived.clickModelName();
			derived.clickGrid();
			derived.clickView();
			
			
			
		}
		
		@Test(priority=3)
		private void derivedHierarcyViewPage() throws InterruptedException, EncryptedDocumentException, IOException {

			hp = new HomePage();
			hp.EnterSystemAdministrator();

			sp = new SystemAdministrator();
			sp.clickDerivedHierarchy();

			Thread.sleep(2000);
			exceldata =new GetTestData();
			scroll=new ScrollByVisibleElement();
			textbox=new GetTextBoxValue();
			DerivedHierarchyPage derived=new DerivedHierarchyPage();
			
			derived.enterModelname();
			derived.searchModelName();
			derived.clickModelName();
			derived.clickGrid();
			derived.clickView();
			Thread.sleep(3000);
			derived.clickExpand();
			derived.clickCheckBox();
			Thread.sleep(3000);
			derived.clickExpand1();
			Thread.sleep(3000);
			derived.cutButton();
			Thread.sleep(3000);
			derived.clickCheckBox1();
			Thread.sleep(3000);			
			derived.pasteButton();
			
			
			
		}
		
		@Test(priority=3,enabled=false)
		private void selectModelAndDelete() throws InterruptedException, EncryptedDocumentException, IOException {

			hp = new HomePage();
			hp.EnterSystemAdministrator();

			sp = new SystemAdministrator();
			sp.clickDerivedHierarchy();

			Thread.sleep(2000);
			exceldata =new GetTestData();
			scroll=new ScrollByVisibleElement();
			textbox=new GetTextBoxValue();
			DerivedHierarchyPage derived=new DerivedHierarchyPage();
			
			derived.enterModelname();
			derived.searchModelName();
			derived.clickModelName();
			derived.clickGrid();
			derived.clickEdit();
			derived.clickDelete();
			
			
			
		}
		
		@Test
	    public void updatePart() throws InterruptedException, IOException {
	        
			hp = new HomePage();
			hp.EnterSystemAdministrator();

			sp = new SystemAdministrator();
			sp.clickDerivedHierarchy();

			Thread.sleep(2000);
			exceldata =new GetTestData();
			scroll=new ScrollByVisibleElement();
			textbox=new GetTextBoxValue();
			DerivedHierarchyPage derivedhierarchy=new DerivedHierarchyPage();
	        derivedhierarchy.clickAddEditBtn();
	        
	        derivedhierarchy.selectModel();
	        derivedhierarchy.searchModel();
	        derivedhierarchy.clickModel();
	        
	        derivedhierarchy.selectEntity();
	        derivedhierarchy.searchEntity();
	        derivedhierarchy.clickEntity();
	        String name ="Base Price Owner";
	        Date d = new Date();
	        System.out.println(d.toString());
	        DateFormat dFormat = DateFormat.getDateInstance(DateFormat.SHORT);
	        String derivedhierarchyName =name += dFormat.format(d);
	        String result= derivedhierarchyName.replaceAll("\\W", "");
	      
	        
	        derivedhierarchy.addName().sendKeys(result);
	        
	        derivedhierarchy.addDescription().sendKeys("Base Price Owner");
	        Thread.sleep(5000);
	        derivedhierarchy.AddBtnPartOwner();
	        
	        derivedhierarchy.saveBtn();
	        
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
