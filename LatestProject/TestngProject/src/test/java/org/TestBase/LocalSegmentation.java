package org.TestBase;

import static org.testng.Assert.assertEquals;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.baseclass.BaseClass;
import org.openqa.selenium.WebDriver;
import org.pageobjects.ExplorerPage_010_part;
import org.pageobjects.ExplorerPage_020_Segment;
import org.pageobjects.ExplorerPage_070_Local_Segment;
import org.pageobjects.ExplorerPage_110_ECC_Minor;
import org.pageobjects.HomePage;
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
public class LocalSegmentation extends BaseClass {
	
	ScrollByVisibleElement scroll;
	GetTextBoxValue textbox;
	GetTestData exceldata;
	Login_TC login = new Login_TC();
	Segmentation segmentation;
	ExplorerPage_070_Local_Segment localsegment;
	writeBack writeResult = new writeBack();
	WebDriver driver;
	String partNumberFromExcel;
	

	@Test
	public void localSegmentation() throws EncryptedDocumentException, IOException, InterruptedException {

		localsegment = new ExplorerPage_070_Local_Segment();
		scroll = new ScrollByVisibleElement();
		HomePage hp = new HomePage();
		textbox = new GetTextBoxValue();
		hp.EnterDataExplorer();
		exceldata = new GetTestData();
		textbox=new GetTextBoxValue();
		
		
		partNumberFromExcel=exceldata.getTestDataLocalSegment(1, 0);
		// Select Model
		localsegment.enterModelname();
		localsegment.searcModelname();
		localsegment.clickModelname();
		
		Thread.sleep(10000);

		// Select Entity
		localsegment.enterEntityname();
		localsegment.searchEntityname();
		localsegment.clickEntityname();

				
		localsegment.filterBtn();
		localsegment.ruleFilter();
	//	localsegment.filterDropDown();
		localsegment.clickDropdown();
		localsegment.filterDropDownSearch();
		localsegment.partNumberFilter();
		localsegment.filterTextBox().sendKeys(partNumberFromExcel);
		localsegment.FilterApply();
		
		Thread.sleep(10000);
		
		String regionalPricingFlagValue=localsegment.regionalPricingFlag().getText();
		System.out.println("RegionalPricingFlag is: "+regionalPricingFlagValue);
		
		String partOwner=localsegment.partOwner().getText();
		System.out.println("PartOwner is: "+partOwner);
		
		String readyForSegmentation=localsegment.readyForSegmentation().getText();
		System.out.println("ReadyForSegmentation is: "+readyForSegmentation);
		
		String saleable=textbox.getvalue_textbox(localsegment.saleable());
		System.out.println("Saleable is: "+saleable);
		
		String ecc=localsegment.ecc().getText();
		System.out.println("Ecc is: "+ecc);
		
		String brand=localsegment.brand().getText();
		System.out.println("Brand is: "+brand);
		
		String segmentType=localsegment.segmentType().getText();
		System.out.println("SegmentType is: "+segmentType);
		
		String futureSalesStatusCode=localsegment.futureSalesStatusCode().getText();
		System.out.println("FutureSalesStatusCode is: "+futureSalesStatusCode);
		
		if(!partOwner.equalsIgnoreCase("Global")||(regionalPricingFlagValue.equals("1 {Yes}"))) {
			if(readyForSegmentation.equalsIgnoreCase("1 {Yes}")&&(saleable.equalsIgnoreCase("Y")||(futureSalesStatusCode.equals("Y")))&&(!ecc.isEmpty())&&(!brand.isEmpty()&&(!segmentType.isEmpty()))) {
				
				
				
				localsegment.saveButton();
				
				Thread.sleep(3000);
				localsegment.refresh();
				
				
				String localSegmentCode=localsegment.localsegment().getText();
				System.out.println("segmentCode is"+localSegmentCode);
				if(!localSegmentCode.isEmpty()) {
					writeResult.writeToExcelResultLocalSegemnt(1,localSegmentCode);
					System.out.println("Local segment created");
					
				}
				else {
					String result="Local segment is not created";
					writeResult.writeToExcelResultLocalSegemnt(1,result);
					System.out.println("Local segment is not created");
					assertEquals(result, "Local segment is created");
				}
				
				
			}
			else
			
		//	String resultLocalSegment="Local segment is not created";
		//	writeResult.writeToExcelResultLocalSegemnt(1,resultLocalSegment);
			System.out.println("Local segment is not created");
		 //   assertEquals(resultLocalSegment, "Local segment is created");
				
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