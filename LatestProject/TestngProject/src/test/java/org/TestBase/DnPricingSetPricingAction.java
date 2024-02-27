package org.TestBase;

import static org.testng.Assert.assertEquals;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.baseclass.BaseClass;
import org.openqa.selenium.WebDriver;
import org.pageobjects.ExplorerPage_030_Dn_Pricing;
import org.pageobjects.ExplorerPage_070_Local_Segment;
import org.pageobjects.HomePage;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import org.utils.GetTestData;
import org.utils.GetTextBoxValue;
import org.utils.Screenshots;
import org.utils.ScrollByVisibleElement;
import org.utils.Segmentation;
import org.utils.writeBack;

import com.Report.TestListener;
@Listeners(TestListener.class)
public class DnPricingSetPricingAction extends BaseClass {
		
		ScrollByVisibleElement scroll;
		GetTextBoxValue textbox;
		GetTestData exceldata;
		Login_TC login = new Login_TC();
		ExplorerPage_030_Dn_Pricing dnpricing;
		writeBack writeResult = new writeBack();
		WebDriver driver;
		String partNumberFromExcel;
		
		 @DataProvider(name="DataProvider")
		    public Object[][] getDataFromDataprovider(){
		    return new Object[][] 
		    	{
		            { "328243000", "Emergency Global Change-Require PPC" },
		            { "432687300RX" , "Clear Pricing Action" },
		            {"394852700" , "Reprice prior to salability- initial sale"}
		           
		         
		        };

		    }


		@Test(dataProvider ="DataProvider")
		public void DnPricingSetPricing(String partNumber, String PricingActionMethod) throws EncryptedDocumentException, IOException, InterruptedException {

			dnpricing = new ExplorerPage_030_Dn_Pricing();
			scroll = new ScrollByVisibleElement();
			HomePage hp = new HomePage();
			textbox = new GetTextBoxValue();
			hp.EnterDataExplorer();
			exceldata = new GetTestData();
			textbox=new GetTextBoxValue();
		
			dnpricing.enterModelname();
			dnpricing.searcModelname();
			dnpricing.clickModelname();
			
			dnpricing.enterEntityname();
			dnpricing.searchEntityname();
			dnpricing.clickEntityname();
			
			Thread.sleep(10000);
			//partNumberFromExcel=exceldata.getTestDataDnPricingAction(1, 0);
			dnpricing.filterBtn();
			dnpricing.ruleFilter();
			dnpricing.clickDropdown();
			dnpricing.filterDropDownSearch();
			dnpricing.partNumberFilter();
			dnpricing.filterTextBox().sendKeys(partNumber);
			dnpricing.FilterApply();
			
			Thread.sleep(10000);
			
			
			//String selectPricingActionExcel=exceldata.getTestDataDnPricingAction(1, 1);
			String selectPricingActionValue=dnpricing.selectPricingActionValue().getText();
			//System.out.println("selectPricingActionValue is: "+selectPricingActionValue);
			
			Thread.sleep(3000);
			scroll.ByVisibleElement(dnpricing.selectPricingActionValue());
			dnpricing.selectPricingActionValue().click();
			dnpricing.searchSelectPricingAction().sendKeys(PricingActionMethod);	
			System.out.println("Select Pricing Action Value before save"+selectPricingActionValue);
			dnpricing.clickSearchSelectPricing();
			
			dnpricing.saveButton().click();
			
			System.out.println("Select Pricing Action Value after save "+selectPricingActionValue);
			
					
			scroll.ByVisibleElement(dnpricing.pricingActionValue());
			String pricingActionValue=dnpricing.pricingActionValue().getText();
			System.out.println("pricingActionValue is: "+pricingActionValue);
			
			String futureEffectiveDateValue=dnpricing.futureEffectiveDateValue().getText();
			System.out.println("futureEffectiveDateValue is: "+futureEffectiveDateValue);
			
		    if(selectPricingActionValue.equalsIgnoreCase(pricingActionValue)&&(futureEffectiveDateValue.isEmpty())) {
				writeResult.writeToExcelResultDnPricingAction(1,pricingActionValue);
				writeResult.writeToExcelResultDnFutureEffectiveDate(1,futureEffectiveDateValue);
				System.out.println("Result is Pass");
			}
			else {
				  System.out.println("Result is fail");
				  assertEquals(pricingActionValue,PricingActionMethod);
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
