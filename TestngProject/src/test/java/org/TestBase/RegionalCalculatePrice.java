package org.TestBase;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.poi.EncryptedDocumentException;
import org.baseclass.BaseClass;
import org.openqa.selenium.WebDriver;
import org.pageobjects.ExplorerPage070LocalPartPricing;
import org.pageobjects.ExplorerPageCommonElements;
import org.pageobjects.ExplorerPageCostRangeMultiplier;
import org.pageobjects.ExplorerPageLocalSegment;
import org.pageobjects.ExplorerPage_010_part;
import org.pageobjects.ExplorerPage_020_Segment;
import org.pageobjects.ExplorerPage_110_ECC_Minor;
import org.pageobjects.HomePage;
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
import org.utils.writeBack;

public class RegionalCalculatePrice extends BaseClass {


		ScrollByVisibleElement scroll;
		GetTextBoxValue textbox;
		GetTestData exceldata;
		Login_TC login = new Login_TC();
		Segmentation segmentation;
		PreSegmentation preSegmentation;
		ExplorerPage_010_part partentity;
		ExplorerPage_020_Segment segmententity;
		writeBack writeResult = new writeBack();
		ExplorerPage_110_ECC_Minor eccminor;
		ExplorerPage070LocalPartPricing localPartPricing;
		ExplorerPageLocalSegment localsegment;
		ExplorerPageCommonElements explorerCommonElements;
		ExplorerPageCostRangeMultiplier costRangeMultiplier; 
		
		@Test
		public void unSegmentation() throws InterruptedException, EncryptedDocumentException, IOException, ParseException {
			
			partentity = new ExplorerPage_010_part();
			segmententity = new ExplorerPage_020_Segment();
			scroll = new ScrollByVisibleElement();
			HomePage hp = new HomePage();
			textbox = new GetTextBoxValue();
			hp.EnterDataExplorer();
			exceldata = new GetTestData();
			segmentation = new Segmentation();
			preSegmentation = new PreSegmentation();
			localPartPricing = new ExplorerPage070LocalPartPricing();
			localsegment = new ExplorerPageLocalSegment();
			explorerCommonElements = new ExplorerPageCommonElements();
			int calculatedPriceNumeric;
			String result;
			costRangeMultiplier = new ExplorerPageCostRangeMultiplier(); 
			
			Thread.sleep(5000);
			partentity.enterModelname();
			partentity.searcModelname();
			partentity.clickModelname();

			// Select Entity
			partentity.enterEntityname();
			localPartPricing.searchentityname();
			localPartPricing.clickentityname();
			
			String partNumberfromExcel = exceldata.getTestDataRegionalCalculatePrice(1,0);
			
			localPartPricing.filterBtn();
			localPartPricing.ruleFilter().click();
			localPartPricing.filterDropDown();
			localPartPricing.filterSearchBox();
			localPartPricing.selectPartNumber();
			localPartPricing.filterInputBox().sendKeys(partNumberfromExcel);
			localPartPricing.filterApplyBtn();
			
			String resultingCost=  localPartPricing.resultingCost().getText();	
			int resultingCostNumericfromUI = Integer.parseInt(resultingCost);
			
			String localCost = localPartPricing.localCost().getText();
			int localCostNumericfromUI = Integer.parseInt(localCost);
			
			String currentPrice = localPartPricing.currentPrice().getText();
			int currentPriceNumericfromUI = Integer.parseInt(currentPrice);
			
			String calculatedPrice = localPartPricing.calculatedPrice().getText();
			int calculatedPriceNumericfromUI = Integer.parseInt(calculatedPrice);
			
			String futureEffectiveDateValue =  localPartPricing.futureEffectiveDate().getText();
			
			String locallySourcedCode =  localPartPricing.locallySourcedCode().getText();
			int locallySourcedCodeNumericfromUI = Integer.parseInt(locallySourcedCode);
			
			 	partentity.enterEntityname();
			 	localsegment.searchEntity();
			 	localsegment.clickEntityname();
			 	
			 	explorerCommonElements.filterBtn();
			 	explorerCommonElements.ruleFilter();
			 	localsegment.filterDropDown();
			 	explorerCommonElements.search().click();
			 	explorerCommonElements.selectElement();
			 	explorerCommonElements.filterApply();
			 	
			 	String pricingActionMethod = localsegment.pricingActionMethod().getText();
			 	
			 	String pricingActionValue = localsegment.pricingActionValue().getText();
			 	int pricingActionValueNumericfromUI = Integer.parseInt(pricingActionValue);
			
			 	SimpleDateFormat df = new SimpleDateFormat("MM/dd/yyyy"); 
				Date futureEffectiveDate = df.parse(futureEffectiveDateValue);
				
				partentity.enterEntityname();
				costRangeMultiplier.searchCostRangeMultiplier();
				explorerCommonElements.selectElement();
				
				String code = costRangeMultiplier.code().getText();
				
				String multiplier = costRangeMultiplier.multiplier().getText();
				int multiplierNumericfromUI = Integer.parseInt(multiplier);
				
		
				Date today = new Date();                      
				System.out.println("Today Date is"+today);
				  
				  if(today.compareTo(futureEffectiveDate)>0) {
					   
					  
					if(!currentPrice.isEmpty()) {
						
						//if pricing action method =1 and locally sourced = yes  And
						//calculated price = local cost from local part pricing  *  Pricing Action Value
						
						if(pricingActionMethod.equals("1.0{Cost Multiplier}") && locallySourcedCode.equals("1 {Yes}")) {
							
							calculatedPriceNumeric = localCostNumericfromUI  * pricingActionValueNumericfromUI;
							
							if(calculatedPriceNumeric == calculatedPriceNumericfromUI) {
								
								result = "Pass";
							}else result = "Fail";
							
						}
						
						//"if pricing action method =1 Calculated price = Resulting cost * pricing Action Value"
						else if(pricingActionMethod.equals("1.0{Cost Multiplier}")) {
							
							calculatedPriceNumeric = resultingCostNumericfromUI * pricingActionValueNumericfromUI;
							
							if(calculatedPriceNumeric == calculatedPriceNumericfromUI) {
								
								result = "Pass";
							}else result = "Fail";
							
						}
						
						//"if pricing action method =2 And locally sourced Code = Yes Calculated price = current price * pricing Action Value"
						else if(pricingActionMethod.equals("2.0{Cost Multiplier}") && locallySourcedCode.equals("1 {Yes}")) {
							
							calculatedPriceNumeric = currentPriceNumericfromUI * pricingActionValueNumericfromUI;
							
							if(calculatedPriceNumeric == calculatedPriceNumericfromUI) {
								
								result = "Pass";
							}else result = "Fail";
							
						}
						
					//	"if pricing action method =3 And pricing Action Value = is not Null Calculated price = pricing Action Value"
						else if(pricingActionMethod.equals("3.0{Segment Price}") && !pricingActionValue.isEmpty()) {
							
							if(calculatedPrice.equals(pricingActionValue)) {

								result = "Pass";
							}else result = "Fail";
							
						}
						
					//"if pricing action method =3 And pricing Action Value = Null Calculated price = null"
						else if(pricingActionMethod.equals("3.0{Segment Price}") && pricingActionValue.isEmpty()) {
							
							if(calculatedPrice.isEmpty()) {

								result = "Pass";
							}else result = "Fail";
							
						}
						
						//"if crms.code is not null And locally source code = Yes then calculated price = local cost * crms.multiplier"
						
						else if(pricingActionMethod.equals("3.0{Segment Price}") && pricingActionValue.isEmpty()) {
							
							if(calculatedPrice.isEmpty()) {

								result = "Pass";
							}else result = "Fail";
							
						}
						
						//"if crms.code is not null And locally source code = Yes then calculated price = local cost * crms.multiplier"
						
						else if(!code.isEmpty() && locallySourcedCode.equals("1{Yes}")) {
							
							calculatedPriceNumeric = localCostNumericfromUI * multiplierNumericfromUI;
							
							if(calculatedPriceNumeric == calculatedPriceNumericfromUI) {
								
								result = "Pass";
							}else result = "Fail";
						}
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
//		quit();

		}
		
}
