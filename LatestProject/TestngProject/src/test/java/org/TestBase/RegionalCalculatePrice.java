package org.TestBase;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;

import org.apache.poi.EncryptedDocumentException;
import org.baseclass.BaseClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
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
import org.testng.annotations.DataProvider;
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
		
		
		 @DataProvider(name="DataProvider")
		    public Object[][] getDataFromDataprovider(){
		    return new Object[][] 
		    	{
		            { "328243000", "288" }
		           
		         
		        };

		    }
		
		@Test(dataProvider ="DataProvider")
		public void regionalCalculatePrice(String partNumber, String localSegment) throws InterruptedException, EncryptedDocumentException, IOException, ParseException {
			
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
			double calculatedPriceNumeric=0.0;
			double resultingCostNumericfromUI=0.0;
			double localCostNumericfromUI=0.0;
			double currentPriceNumericfromUI=0.0;
			double calculatedPriceNumericfromUI=0.0;
			String result="";
			costRangeMultiplier = new ExplorerPageCostRangeMultiplier(); 
			
			
			Thread.sleep(5000);
			partentity.enterModelname();
			partentity.searcModelname();
			partentity.clickModelname();
			
			// Select Entity
			partentity.enterEntityname();
			localPartPricing.searchentityname();
			localPartPricing.clickentityname();
			
			//String partNumberfromExcel = exceldata.getTestDataRegionalCalculatePrice(1,0);
			
			localPartPricing.filterBtn();
			localPartPricing.ruleFilter().click();
			localPartPricing.filterDropDown();
			localPartPricing.filterSearchBox().sendKeys("Part number");
			localPartPricing.selectPartNumber().click();
			localPartPricing.filterInputBox().sendKeys(partNumber);
			localPartPricing.filterApplyBtn();
			
			String currentPrice;
			String calculatedPrice;
			String futureEffectiveDateValue;
			String locallySourcedCode;
		
			Thread.sleep(5000);
				scroll.ByVisibleElement(localPartPricing.code());
				String codeValue = textbox.getvalue_textbox(localPartPricing.code());
				//	int resultingCostNumericfromUI = Integer.parseInt(codeValue);
				//	System.out.println("resultingCostNumericfromUI:" +resultingCostNumericfromUI);
				System.out.println("codeValue:"+codeValue);
				
				scroll.ByVisibleElement(localPartPricing.resultingCost());
				String resultingCostValue = textbox.getvalue_textbox(localPartPricing.resultingCost());
				resultingCostNumericfromUI = Integer.parseInt(resultingCostValue);
				System.out.println("resultingCostNumericfromUI:" +resultingCostNumericfromUI);
				
				System.out.println("resultingCost:"+resultingCostValue);
				
				scroll.ByVisibleElement(localPartPricing.localCost());
				String localCost = textbox.getvalue_textbox(localPartPricing.localCost());
				localCostNumericfromUI = Integer.parseInt(localCost);
				System.out.println("localCost :"+ localCost);
				
				scroll.ByVisibleElement(localPartPricing.currentPrice());
				currentPrice = textbox.getvalue_textbox(localPartPricing.currentPrice());
				currentPriceNumericfromUI = Integer.parseInt(currentPrice);
				System.out.println("currentPrice :"+ currentPrice);
				
				scroll.ByVisibleElement(localPartPricing.calculatedPrice());
				calculatedPrice = textbox.getvalue_textbox(localPartPricing.calculatedPrice());
				calculatedPriceNumericfromUI = Integer.parseInt(calculatedPrice);
				
				System.out.println("calculatedPrice:" +calculatedPrice);
				
				scroll.ByVisibleElement(localPartPricing.futureEffectiveDate());
				futureEffectiveDateValue = textbox.getvalue_textbox(localPartPricing.futureEffectiveDate());
				System.out.println("futureEffectiveDateValue:" +futureEffectiveDateValue);
				
				scroll.ByVisibleElement(localPartPricing.locallySourcedCode());
				locallySourcedCode = localPartPricing.locallySourcedCode().getText();
				//	double locallySourcedCodeNumericfromUI = Integer.parseInt(locallySourcedCode);
				System.out.println("locallySourcedCode:" +locallySourcedCode);
			
			
			partentity.enterEntityname();
			localsegment.searchEntity();
			localsegment.clickEntityname();
	 	
			explorerCommonElements.filterBtn();
			explorerCommonElements.ruleFilter();
			localsegment.filterDropDown();
			
			explorerCommonElements.search().sendKeys("code");
			explorerCommonElements.selectElement();
			//localsegment.filterInputBox().click();
			localsegment.filterInputBox().sendKeys(localSegment);
			explorerCommonElements.filterApply();
	 	
			String pricingActionMethod = localsegment.pricingActionMethod().getText();
			System.out.println("pricingActionMethod:"+pricingActionMethod);
		
			String pricingActionValue = textbox.getvalue_textbox(localsegment.pricingActionValue());
			
			System.out.println("pricingActionValue:"+pricingActionValue);
			double pricingActionValueNumericfromUI = Integer.parseInt(pricingActionValue);
			
				
			/*partentity.enterEntityname();
			costRangeMultiplier.searchCostRangeMultiplier();
			explorerCommonElements.selectElement();
		
			String code = costRangeMultiplier.code().getText();
			String multiplier = costRangeMultiplier.multiplier().getText();
			double multiplierNumericfromUI = Integer.parseInt(multiplier);*/
			
			 //	SimpleDateFormat df = new SimpleDateFormat("MM/dd/yyyy"); 
			//	Date futureEffectiveDate = df.parse(futureEffectiveDateValue);
				
			
				//String dateInString = "10-Jan-2024";
			  Thread.sleep(5000);
				SimpleDateFormat formatter = new SimpleDateFormat("mm-dd-yyyy");
			
			    Date futureEffectiveDate = formatter.parse(futureEffectiveDateValue);
		
			    System.out.println(formatter.format(futureEffectiveDate));
				Date today = new Date();                      
				System.out.println("Today Date is"+today);
				
				  if(today.compareTo(futureEffectiveDate)<0) {
					   System.out.println("date is greater than today");
					  
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
						
						/*else if(!code.isEmpty() && locallySourcedCode.equals("1{Yes}")) {
							
							calculatedPriceNumeric = localCostNumericfromUI * multiplierNumericfromUI;
							
							if(calculatedPriceNumeric == calculatedPriceNumericfromUI) {
								
								result = "Pass";
							}*/else result = "Fail";
						}
						
						System.out.println("Result:"+result);
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
