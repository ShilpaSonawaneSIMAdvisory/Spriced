package org.TestBase;
import java.io.IOException;
import java.text.ParseException;

import org.apache.poi.EncryptedDocumentException;
import org.baseclass.BaseClass;
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
import org.testng.annotations.Test;
import org.utils.GetTestData;
import org.utils.GetTextBoxValue;
import org.utils.PreSegmentation;
import org.utils.Screenshots;
import org.utils.ScrollByVisibleElement;
import org.utils.Segmentation;
import org.utils.writeBack;

public class test extends BaseClass {


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
			
			String partNumberfromExcel = exceldata.getTestDataRegionalCalculatePrice(1,0);
			
			localPartPricing.filterBtn();
			localPartPricing.ruleFilter().click();
			localPartPricing.filterDropDown();
			localPartPricing.filterSearchBox().sendKeys("Part number");
			localPartPricing.selectPartNumber().click();
			localPartPricing.filterInputBox().sendKeys(partNumberfromExcel);
			localPartPricing.filterApplyBtn();
			
			
			WebElement resultingCost=  localPartPricing.resultingCost();
			scroll.ByVisibleElement(resultingCost);
			System.out.println("abc");
			String resultingCostValue = textbox.getvalue_textbox(resultingCost);
			System.out.println("def");
		//	int resultingCostNumericfromUI = Integer.parseInt(resultingCostValue);
		//  System.out.println("resultingCostNumericfromUI:" +resultingCostNumericfromUI);
			System.out.println("resultingCost:"+resultingCostValue);
			
			/*scroll.ByVisibleElement(localPartPricing.futureEffectiveDate());
			String futureEffectiveDateValue =  localPartPricing.futureEffectiveDate().getText();
			System.out.println("futureEffectiveDateValue:" +futureEffectiveDateValue);*/
			
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