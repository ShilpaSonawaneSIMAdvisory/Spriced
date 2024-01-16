package org.TestBase;

import java.io.IOException;
import java.util.ArrayList;

import org.apache.poi.EncryptedDocumentException;
import org.baseclass.BaseClass;
import org.openqa.selenium.WebElement;
import org.pageobjects.ExplorerPageLocalPartxRef;
import org.pageobjects.ExplorerPage_010_part;
import org.pageobjects.HomePage;
import org.pageobjects.ModelManagementPage;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.utils.GetTestData;
import org.utils.GetTextBoxValue;
import org.utils.PreSegmentation;
import org.utils.Screenshots;
import org.utils.ScrollByVisibleElement;
import org.utils.Segmentation;


public class copyxRefToPart extends BaseClass{
		ScrollByVisibleElement scroll;
		GetTextBoxValue textbox;
		GetTestData exceldata;
		Login_TC login = new Login_TC();
		ExplorerPage_010_part partentity;
		ExplorerPageLocalPartxRef localPartxref;
		int row1=1;
		int col1=1;
		int row2=1;
		int row3=1;
		int row4=1;
		int row5=1;
		int row6=1;
		int row7=1;
		int row8=1;
		int col2=1;
		int col3=1;
		int col4=1;
		int col5=1;
		
	
		
		@Test(priority=0)
		
		public void modelCreation() throws EncryptedDocumentException, IOException, InterruptedException {
			
			ArrayList<String> listOfElements = new ArrayList<String>();
						
			partentity = new ExplorerPage_010_part();
			localPartxref=new ExplorerPageLocalPartxRef();
			scroll = new ScrollByVisibleElement();
			HomePage hp = new HomePage();
			textbox = new GetTextBoxValue();
			hp.EnterDataExplorer();
			exceldata = new GetTestData();
			
			String partNumberFromExcel=exceldata.getTestDataXrefToPart(1, 0);
			System.out.println("partNumberFromExcel"+partNumberFromExcel);
			
			for(int i=0; i<7; i++)
			{
			// Select Model
			partentity.enterModelname();
			partentity.searcModelname();
			partentity.clickModelname();
			
			Thread.sleep(20000);

			// Select Entity
			partentity.enterEntityname();
			partentity.searchEntityname();
			partentity.clickEntityname();

			Thread.sleep(10000);
			
			partentity.filterBtnOption();
			partentity.ruleFilter();
			partentity.filterDropDown();
			partentity.filterCode();
			//partentity.filterTextBox().click();
			partentity.filterTextBox().sendKeys(partNumberFromExcel);
			partentity.FilterApply();
			Thread.sleep(10000);
			
			
			String jvIdentifier=partentity.jvIdentifierPart().getText();
			System.out.println("jvIdentifier is"+jvIdentifier);
		
			String uniqueCommonPart=partentity.uniqueCommomPart().getText();
			System.out.println("unique common is"+uniqueCommonPart);
			
			
			partentity.enterEntityname();
			localPartxref.searchentity();
			localPartxref.clickentity();
			
			localPartxref.filterBtn();
			localPartxref.rule();
			localPartxref.filterDropDown();
			localPartxref.filterSearchBox();
			localPartxref.localpart();
			localPartxref.pencilIcon();
			localPartxref.localPartFilter();
			localPartxref.localPartDropDown();
			localPartxref.localPartCode();
			localPartxref.localPartInputBox().sendKeys(partNumberFromExcel);
			localPartxref.applyBtn();
			Thread.sleep(10000);
			
			String activeFlag=localPartxref.activeFlag().getText();    //This value is from local part xRef entity
			System.out.println("activeFlag is"+activeFlag);
			
			String jvCode=localPartxref.jvCode().getText();   //This value is from local part xRef entity
			System.out.println("jvCode is"+jvCode);
			
			String uniqueCommonCodexRef=localPartxref.uniqueCommonCode().getText();    //This value is from local part xRef entity
			System.out.println("uniqueCommonCode is"+uniqueCommonCodexRef);
			
			//String activeflag =exceldata.getTestDataXrefToPart(row1, col1);
			
			if(activeFlag.equals("Yes")) {
				
				if(!jvIdentifier.equals(jvCode) || !uniqueCommonCodexRef.equals(uniqueCommonPart) ) {
					
					String jvCodeFromExcel=exceldata.getTestDataXrefToPart(row1, col3);
					localPartxref.jvCode().click();
					localPartxref.jvCodeSearchBox().sendKeys(jvCodeFromExcel);
					localPartxref.jvCodeExcelValue().click();
					row1++;
					col3++;
					
					String uniquecommonCodexRefFromExcel=exceldata.getTestDataXrefToPart(row1, col5);
					localPartxref.uniqueCommonCode().click();
					localPartxref.uniqueCommonCodeSearchBox().sendKeys(uniquecommonCodexRefFromExcel);
					localPartxref.uniqueCommonCodeExcelvalue().click();
					row1++;
					col5++;
					
					partentity.saveOption();
					String jvCodeValue = localPartxref.jvCode().getText();
					listOfElements.add(jvCodeValue);
					String uniquecommonCodeValuefromxRef= localPartxref.uniqueCommonCode().getText();
					listOfElements.add(uniquecommonCodeValuefromxRef);
					
					partentity.enterEntityname();
					partentity.searchEntityname();
					partentity.clickEntityname();

					Thread.sleep(10000);
					
					partentity.filterBtnOption();
					partentity.ruleFilter();
					partentity.filterDropDown();
					partentity.filterCode();
					//partentity.filterTextBox().click();
					partentity.filterTextBox().sendKeys(partNumberFromExcel);
					partentity.FilterApply();
					Thread.sleep(10000);
					
					String jvIdentifierPartValue = partentity.jvIdentifierPart().getText();
					listOfElements.add(jvIdentifierPartValue);
					String uniqueCommomPartValue = partentity.uniqueCommomPart().getText();
					listOfElements.add(uniqueCommomPartValue);
					
					
				}
				else {
					
					System.out.println("");
				}
				
				
			} else {
					System.out.println("Active flag value is no");
					}
		}
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
			  public void takeScreenshot(ITestResult result) throws IOException {
		        if (result.getStatus() == ITestResult.FAILURE) {
		            Screenshots.ScreenCapture();

		        }
		            
		    
			}

			@AfterClass
			public void closeBrowser() {
//			quit();

			}

			
			
}