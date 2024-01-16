package org.TestBase;

import java.io.IOException;
import java.util.ArrayList;

import org.apache.poi.EncryptedDocumentException;
import org.baseclass.BaseClass;
import org.openqa.selenium.WebElement;
import org.pageobjects.ExplorerPageLocalPartxRef;
import org.pageobjects.ExplorerPage_010_PartEntity;
import org.pageobjects.ExplorerPage_010_part;
import org.pageobjects.HomePage;
import org.pageobjects.ModelManagementPage;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import org.utils.GetTestData;
import org.utils.GetTextBoxValue;
import org.utils.PreSegmentation;
import org.utils.Screenshots;
import org.utils.ScrollByVisibleElement;
import org.utils.Segmentation;
import org.utils.writeBack;

import com.Report.TestListener;

@Listeners(TestListener.class)
public class xReftoPart extends BaseClass{
		ScrollByVisibleElement scroll;
		GetTextBoxValue textbox;
		GetTestData exceldata;
		Login_TC login = new Login_TC();
		ExplorerPage_010_PartEntity partentity;
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
		int col2=2;
		int col3=3;
		int col4=4;
		int col5=5;
		writeBack writeResult = new writeBack();
		int resultRow=1;
		int finalResultRow=1;
	
		
		@Test()
		
		public void modelCreation() throws EncryptedDocumentException, IOException, InterruptedException {
			
			ArrayList<String> listOfActualElements = new ArrayList<String>();
			ArrayList<String> listOfExistingElements = new ArrayList<String>();
						
			partentity = new ExplorerPage_010_PartEntity();
			localPartxref=new ExplorerPageLocalPartxRef();
			scroll = new ScrollByVisibleElement();
			HomePage hp = new HomePage();
			textbox = new GetTextBoxValue();
			hp.EnterDataExplorer();
			exceldata = new GetTestData();
			
			String partNumberFromExcel=exceldata.getTestDataXrefToPart(1, 0);
			System.out.println("partNumberFromExcel"+partNumberFromExcel);
			
			for(int i=0; i<8; i++)
			{
			// Select Model
			partentity.enterModelname();
			partentity.searcModelname();
			partentity.clickModelname();
			
			Thread.sleep(2000);

			partentity.enterEntityname();
			localPartxref.searchentity();
			localPartxref.clickentity();
			
			localPartxref.filterBtn();
			localPartxref.rule();
			localPartxref.filterDropDown();
			localPartxref.filterSearchBox();
			localPartxref.filterLocalPartElement();
			localPartxref.pencilIcon();
		
			localPartxref.localPartFilter();
			Thread.sleep(5000);
			localPartxref.localPartFilterRule();
			Thread.sleep(5000);
			localPartxref.localPartDropDown();
			localPartxref.localPartCode();
			localPartxref.localPartInputBox().sendKeys(partNumberFromExcel);
			localPartxref.localPartFilterApply();
			localPartxref.selectLocalPart();
			localPartxref.submitBtn();
			localPartxref.applyButton();	
			Thread.sleep(10000);
			
			WebElement jvCode=localPartxref.jvCode();   //This value is from local part xRef entity
			System.out.println("jvCode is"+jvCode);
			String jvCodeFromExcel=exceldata.getTestDataXrefToPart(row1, col3);
			listOfExistingElements.add(jvCodeFromExcel);
			jvCode.click();
			localPartxref.searchField().sendKeys(jvCodeFromExcel);
			localPartxref.selectElement();
			
			
			WebElement uniqueCommonCodeXRef=localPartxref.uniqueCommonCode();   //This value is from local part xRef entity
			System.out.println("uniqueCommonCodeXRef is"+uniqueCommonCodeXRef);
			String uniqueCommonCodeFromExcel=exceldata.getTestDataXrefToPart(row1, col5);
			listOfExistingElements.add(uniqueCommonCodeFromExcel);
			uniqueCommonCodeXRef.click();
			localPartxref.searchField().sendKeys(uniqueCommonCodeFromExcel);
			localPartxref.selectElement();
		
			
			
			WebElement activeFlagXRef=localPartxref.activeFlag();  //This value is from local part xRef entity
			System.out.println("activeFlagXRef is"+activeFlagXRef);
			String activeFlagFromExcel=exceldata.getTestDataXrefToPart(row1, col1);
			listOfExistingElements.add(activeFlagFromExcel);
			activeFlagXRef.click();
			localPartxref.searchField().sendKeys(activeFlagFromExcel);
			localPartxref.selectElement();
			localPartxref.saveOption();
		
			
			
			Thread.sleep(5000);
			String jvCodeValue= jvCode.getText();
			String uniqueCommonCodeXRefValue= uniqueCommonCodeXRef.getText();
			String activeFlagXRefValue = activeFlagXRef.getText();
			
			listOfActualElements.add(jvCodeValue);
			listOfActualElements.add(uniqueCommonCodeXRefValue);
			listOfActualElements.add(activeFlagXRefValue);
			
		//  if(activeFlagXRefValue.equals("Yes")) {
			partentity.enterEntityname();
			partentity.searchEntityname();
			partentity.clickEntityname();
			
			partentity.filterBtnOption();
			partentity.ruleFilter();
			partentity.filterDropDown();
			partentity.filterCode();
			//partentity.filterTextBox().click();
			partentity.filterTextBox().sendKeys(partNumberFromExcel);
			partentity.FilterApply();
			Thread.sleep(10000);
			
			WebElement uniqueCommomPart=partentity.uniqueCommomPart(); //This value is from part entity
			System.out.println("uniqueCommom code from Part is"+uniqueCommomPart);
			String uniqueCommomPartFromExcel=exceldata.getTestDataXrefToPart(row1, col4);
			listOfExistingElements.add(uniqueCommomPartFromExcel);
			uniqueCommomPart.click();
			localPartxref.searchField().sendKeys(uniqueCommomPartFromExcel);
			localPartxref.selectElement();
			
			
			
			WebElement jvIdentifier=partentity.jvIdentifierPart(); //This value is from part entity
			System.out.println("jvIdentifier is"+jvIdentifier);
			String jvIdentifierFromExcel=exceldata.getTestDataXrefToPart(row1, col2);
			listOfExistingElements.add(jvIdentifierFromExcel);
			scroll.ByVisibleElement(jvIdentifier);
			jvIdentifier.click();
			localPartxref.searchField().sendKeys(jvIdentifierFromExcel);
			localPartxref.selectElement();
			
			
			partentity.saveOption().click();
			
			Thread.sleep(5000);
			
			String uniqueCommomPartValue= uniqueCommomPart.getText();
			scroll.ByVisibleElement(jvIdentifier);
			String jvIdentifierValue= jvIdentifier.getText();
			
			
			listOfActualElements.add(uniqueCommomPartValue);
			listOfActualElements.add(jvIdentifierValue);
			
			String outputElements = "";
			for (String s : listOfActualElements) {
				outputElements += s + ", \t";

			}
			
			
			writeResult.writeToExcelListOfActualElements(resultRow, outputElements);
			resultRow++;
			
			String ExistingElements = "";
			for (String s : listOfExistingElements) {
				ExistingElements += s + ", \t";

			}
			

			if (ExistingElements.equals(outputElements) == true) {
				
				String result = "Elements are matching. Result = Pass";
				
				writeResult.writeToExcelResult(finalResultRow,result);
				finalResultRow++;
			} 
			else {

				String result = "Elements are not matching. Result = Fail";
				
				writeResult.writeToExcelResult(finalResultRow,result);
				finalResultRow++;

			}
			listOfActualElements.clear();
			row1++;
			
			}
			
			
			
	}
		//}
		
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