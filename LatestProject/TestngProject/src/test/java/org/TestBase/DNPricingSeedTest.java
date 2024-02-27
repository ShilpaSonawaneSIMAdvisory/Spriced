package org.TestBase;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.apache.poi.EncryptedDocumentException;
import org.baseclass.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.pageobjects.ExplorerPageCommonElements;
import org.pageobjects.ExplorerPageDefaultPricingRegion;
import org.pageobjects.ExplorerPage_010_part;
import org.pageobjects.ExplorerPage_030_Dn_Pricing;
import org.pageobjects.ExplorerPage_xSales_Status_Code;
import org.pageobjects.HomePage;
import org.pageobjects.LoginPage;
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
import org.utils.writeBack;

public class DNPricingSeedTest extends BaseClass {

	ExplorerPage_xSales_Status_Code xsalesStatusCode;
	HomePage hp;
	ExplorerPageDefaultPricingRegion defaultPricingRegion;
	GetTestData exceldata;
	ExplorerPageCommonElements explorerCommonElements;
	ExplorerPage_010_part partentity;
	ScrollByVisibleElement scroll;
	GetTextBoxValue textbox;
	writeBack writeResult;
	ExplorerPage_030_Dn_Pricing dnpricing;
	Login_TC login = new Login_TC();
	
	@Test
	public void dnPricingSeed() throws EncryptedDocumentException, IOException, InterruptedException {
		
		scroll = new ScrollByVisibleElement();
		exceldata =new GetTestData();
		String partNumberFromExcel=exceldata.getTestDataDnPricingSeed(1, 0);
		ExplorerPage_030_Dn_Pricing dnpricing;
		xsalesStatusCode = new ExplorerPage_xSales_Status_Code();
		defaultPricingRegion = new ExplorerPageDefaultPricingRegion();
		partentity = new ExplorerPage_010_part();
		textbox = new GetTextBoxValue();
		ArrayList<String> listOfregion =new ArrayList<String>();
		ArrayList<String> listOfElements =new ArrayList<String>();
		dnpricing = new ExplorerPage_030_Dn_Pricing();
		writeResult = new writeBack();
		
		 
		hp= new HomePage();
		hp.EnterDataExplorer();
		Thread.sleep(20000);
		exceldata =new GetTestData();
		explorerCommonElements = new ExplorerPageCommonElements();
		partentity= new ExplorerPage_010_part();
		partentity.enterModelname();
		partentity.searcModelname();
		partentity.clickModelname();

		// Select Entity
		partentity.enterEntityname();
		partentity.searchEntityname();
		partentity.clickEntityname();
		Thread.sleep(20000);
		
		partentity.filterBtnOption();
		partentity.ruleFilter();
		partentity.filterDropDown();
		partentity.filterCodeOption();
		
		partentity.codeTextBox().sendKeys(partNumberFromExcel);
        partentity.FilterApply();
        Thread.sleep(5000);
        
        WebElement partOwner = partentity.partOwnerValue();
        scroll.ByVisibleElement(partOwner);
		String partOwnerValue = gettext(partOwner);
		System.out.println("Value of partOwner from UI is:" + partOwnerValue);
        
        WebElement segmentCode = partentity.segmentValue();	
		String segmentCodeValue = gettext(segmentCode);
		System.out.println("Value of segmentCodeValue from UI is:" + segmentCodeValue);
	
		String futureSalesStatusCodeValue = gettext(partentity.futureSalesStatusCodeValue());
		System.out.println("futureSalesStatusCodeValue: " + futureSalesStatusCodeValue);
		
		String futureSalesStatusCodeValueDigits= futureSalesStatusCodeValue.replaceAll("[^0-9]", "");

		// Select Entity
		partentity.enterEntityname();
		xsalesStatusCode.searchEntityname();
		xsalesStatusCode.clickEntityname();
		Thread.sleep(10000);
		xsalesStatusCode.xSalesStatusCodeFilterBtn();
		xsalesStatusCode.xSalesStatusCodeRule();
		xsalesStatusCode.xSalesStatusFilterDropDown();
		xsalesStatusCode.xSalesStatusFilterCode();
		xsalesStatusCode.xSalesStatusFilterTextBox().sendKeys(futureSalesStatusCodeValueDigits);	
		xsalesStatusCode.xSalesStatusFilterApply();
		
		Thread.sleep(10000);

		WebElement name = xsalesStatusCode.nameValue();
		String nameValuexsalesStatusCode = textbox.getvalue_textbox(name);
		System.out.println("nameValue: " + nameValuexsalesStatusCode);

		WebElement xSalesSaleable = xsalesStatusCode.xSalesSaleableValue();
		String futureSalesSaleableValue = textbox.getvalue_textbox(xSalesSaleable);
		
		
		if(!segmentCodeValue.isEmpty() && futureSalesSaleableValue.equals("Y") &&  partOwner.equals("{Global}") ) { 
			
			Thread.sleep(10000);
			partentity.enterEntityname();
			defaultPricingRegion.searchentityname();
			defaultPricingRegion.clickentity();
			
			Thread.sleep(10000);
			explorerCommonElements.filterBtn();
			explorerCommonElements.ruleFilter();
			defaultPricingRegion.filterDropDown();
			explorerCommonElements.search().sendKeys("Pricing admin owner");
			explorerCommonElements.selectElement();
			
			defaultPricingRegion.inputTextBoxFilter().click();
			explorerCommonElements.search().sendKeys("EBU");
			explorerCommonElements.selectElement();
			explorerCommonElements.filterApply();
			
			//regionAttribute();
			
				List<WebElement> gridrow =driver.findElements(By.xpath("//datatable-body-row[@role='row']"));
			
				for(WebElement ele : gridrow ) {
				
				ele.click();
				String region = defaultPricingRegion.region().getText();
				System.out.println("region:" +region);
				listOfregion.add(region);
				
				String listOfRegionAttribute = "";
				for (String s : listOfregion) {
					listOfRegionAttribute += s + ", \t";
				}
				int row1=1;
				writeResult.writeToExcelRegion(row1, listOfRegionAttribute);
				row1++;
	
				} 
			
			listOfregion.add("Russia {46}");
			listOfregion.add("Latin America {42}");
			
			Thread.sleep(10000);
			System.out.println("abc");
			dnpricing.enterEntityname();
			dnpricing.searchEntityname();
			dnpricing.clickEntityname();
			
			for(String region: listOfregion) {
			
			explorerCommonElements.filterBtn();
			explorerCommonElements.ruleFilter();
			dnpricing.clickDropdown();
			explorerCommonElements.search().sendKeys(region);
			explorerCommonElements.selectElement();
			dnpricing.filterTextBox().sendKeys("regionfromlist");
			explorerCommonElements.ruleFilter();
			dnpricing.clickDropdown();
			explorerCommonElements.search().sendKeys("PartNumber");
			explorerCommonElements.selectElement();
			dnpricing.filterTextBox().sendKeys(partNumberFromExcel);
			explorerCommonElements.filterApply();
			Thread.sleep(10000);
			
			String codeValue=dnpricing.codeValue().getText();
			listOfElements.add(codeValue);
			
			String nameValue=dnpricing.codeValue().getText();
			listOfElements.add(codeValue);
			
			//String partNumberValue=dnpricing.part
			//listOfElements.add(codeValue);
			
			String regionValue=dnpricing.regionValue().getText();
			listOfElements.add(codeValue);
			
			String publishFlagValue=dnpricing.publishFlag().getText();
			listOfElements.add(publishFlagValue);
			
			String cpmValue=dnpricing.cpmValue().getText();
			listOfElements.add(cpmValue);
			
			String apmValue=dnpricing.apmCode().getText();
			listOfElements.add(cpmValue);
			
			String salesStatusCode=dnpricing.salesStatusCode().getText();
			listOfElements.add(salesStatusCode);
			
			String futureSalesStatusCode=dnpricing.futureSalesStatusCode().getText();
			listOfElements.add(futureSalesStatusCode);
			
			String swappValue=dnpricing.swappValue().getText();
			listOfElements.add(swappValue);
			
			String regionalPricingValue=dnpricing.regionalPricingFlagValue().getText();
			listOfElements.add(regionalPricingValue);
			
			String pricingActionValue=dnpricing.pricingActionValue().getText();
			listOfElements.add(regionalPricingValue);
			
			//String pricingActionValue=dnpricing.partOwner
			//listOfElements.add(regionalPricingValue);
			
			String informationValue=dnpricing.informationValue().getText();
			listOfElements.add(informationValue);
			
			String information=dnpricing.informationValue().getText();
			listOfElements.add(informationValue);
			
			String uniqueCommon=dnpricing.uniqueCommon().getText();
			listOfElements.add(uniqueCommon);
			
			String certificationLevel=dnpricing.certificationLevel().getText();
			listOfElements.add(certificationLevel);
			
			String jvIdentifier=dnpricing.jvIdentifier().getText();
			listOfElements.add(jvIdentifier);
			
			String eccValue=dnpricing.eccValue().getText();
			listOfElements.add(eccValue);
			
			String ecc=dnpricing.eccValue().getText();
			listOfElements.add(eccValue);
			
			String pricingActionHistory =dnpricing.pricingActionhistory().getText();
			listOfElements.add(pricingActionHistory);
			
			String resultingCostHistory =dnpricing.resultingCostHistory().getText();
			listOfElements.add(resultingCostHistory);
			
			String resultingCostHistoryValue =dnpricing.resultingCostHistory().getText();
			listOfElements.add(resultingCostHistoryValue);
			
			String currentPriceValue =dnpricing.currentPrice().getText();
			listOfElements.add(currentPriceValue);
			
			String currentEffectiveDateValue =dnpricing.currentEffectiveDate().getText();
			listOfElements.add(currentEffectiveDateValue);
			
			String saleableValue =dnpricing.saleable().getText();
			listOfElements.add(saleableValue);
			
			String brandValue =dnpricing.brandValue().getText();
			listOfElements.add(brandValue);
			
			String brandMinorValue =dnpricing.brandMinor().getText();
			listOfElements.add(brandMinorValue);
			
			String corexRefReportValue =dnpricing.corexRefReport().getText();
			listOfElements.add(corexRefReportValue);
			
			String pricingAdminOwnerValue =dnpricing.pricingAdminOwner().getText();
			listOfElements.add(pricingAdminOwnerValue);
			
			String resultingCostValue =dnpricing.resultingCost().getText();
			listOfElements.add(resultingCostValue);
			
			String forecastMultiplierValue =dnpricing.forecastMultiplier().getText();
			listOfElements.add(forecastMultiplierValue);
			
		
			String listOfElementsfromDnPricing= "";

			for (String s : listOfElements) {
				listOfElementsfromDnPricing += s + ", \t";
			}
			
			int row = 1;
			writeResult.writeToExcelDnPricingElements(row, listOfElementsfromDnPricing);
			row++;
			}
			
			
			
			
		}
		else {
			System.out.println("Program ends");
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
//	quit();

	}
	
	
}
