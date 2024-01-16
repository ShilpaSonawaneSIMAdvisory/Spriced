package org.TestBase;

import static org.testng.Assert.assertEquals;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.baseclass.BaseClass;
import org.openqa.selenium.WebDriver;
import org.pageobjects.ExplorerPage070LocalPartPricing;
import org.pageobjects.ExplorerPage_030_Dn_Pricing;
import org.pageobjects.ExplorerPage_070_Local_Segment;
import org.pageobjects.HomePage;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.utils.GetTestData;
import org.utils.GetTextBoxValue;
import org.utils.Screenshots;
import org.utils.ScrollByVisibleElement;
import org.utils.Segmentation;
import org.utils.writeBack;

public class DnPricingUpdate extends BaseClass {
		
		ScrollByVisibleElement scroll;
		GetTextBoxValue textbox;
		GetTestData exceldata;
		Login_TC login = new Login_TC();
		ExplorerPage_030_Dn_Pricing dnpricing;
		writeBack writeResult = new writeBack();
		WebDriver driver;
		String partNumberFromExcel;
		ExplorerPage070LocalPartPricing LocalPartPricing;
		

		@Test
		public void DnPricingSetPricing() throws EncryptedDocumentException, IOException, InterruptedException {

			dnpricing = new ExplorerPage_030_Dn_Pricing();
			scroll = new ScrollByVisibleElement();
			HomePage hp = new HomePage();
			textbox = new GetTextBoxValue();
			hp.EnterDataExplorer();
			exceldata = new GetTestData();
			textbox=new GetTextBoxValue();
			LocalPartPricing = new ExplorerPage070LocalPartPricing();
			
			hp.EnterDataExplorer();
			dnpricing.enterModelname();
			dnpricing.searcModelname();
			dnpricing.clickModelname();
			
			dnpricing.enterEntityname();
			dnpricing.searchEntityname();
			dnpricing.clickEntityname();
			
			partNumberFromExcel=exceldata.getTestDataDnPricingAction(1, 0);
			dnpricing.filterBtn();
			dnpricing.ruleFilter();
			dnpricing.clickDropdown();
			dnpricing.filterDropDownSearch();
			dnpricing.partNumberFilter();
			dnpricing.filterTextBox().sendKeys(partNumberFromExcel);
			dnpricing.FilterApply();
			
			Thread.sleep(10000);
		
			scroll.ByVisibleElement(dnpricing.regionValue());
			String region= dnpricing.regionValue().getText();
			
			if(region.equals("India {24}")) {
				
				scroll.ByVisibleElement(dnpricing.annualVolumeValue());
				String annualVolumeValueFromExcel = exceldata.getTestDataDnPricingUpdate(1, 4);
				dnpricing.annualVolumeValue().clear();
				dnpricing.annualVolumeValue().sendKeys(annualVolumeValueFromExcel);
	
			}
			
			
			scroll.ByVisibleElement(dnpricing.pricingActionValue());
			dnpricing.pricingActionValue().click();
			String PricingActionValueFromExcel = exceldata.getTestDataDnPricingUpdate(1, 1);
			dnpricing.searchChangeReason().sendKeys(PricingActionValueFromExcel);
			dnpricing.selectElement().click();
			
			scroll.ByVisibleElement(dnpricing.changeReasonValue());
			dnpricing.changeReasonValue().click();
			String selectChangeReasonFromExcel = exceldata.getTestDataDnPricingUpdate(1, 2);
			dnpricing.changeReasonValue().sendKeys(selectChangeReasonFromExcel);	
			dnpricing.selectElement().click();
			
			dnpricing.saveButton().click();
			
			dnpricing.enterEntityname();
			LocalPartPricing.searchentityname();
			LocalPartPricing.clickentityname();
			
			LocalPartPricing.filterBtn();
			LocalPartPricing.ruleFilter();
			LocalPartPricing.filterDropDown();
			LocalPartPricing.filterSearchBox();
			LocalPartPricing.selectPartNumber();
			LocalPartPricing.filterInputBox();
			LocalPartPricing.filterApplyBtn();
			
			LocalPartPricing.regionalPricingFlag().click();
			String regionalPricingFlagFromExcel = exceldata.getTestDataDnPricingUpdate(1, 3);
			LocalPartPricing.regionalPricingFlagSearch().sendKeys(regionalPricingFlagFromExcel);
			dnpricing.selectElement().click();
			LocalPartPricing.saveOption();
			
			
			
			
	      
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
//	quit();

	}

}
