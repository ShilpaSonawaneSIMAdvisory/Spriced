package org.TestBase;

import static org.testng.Assert.assertEquals;



import java.io.IOException;
import java.sql.Date;
import java.text.DateFormat;

import org.apache.poi.EncryptedDocumentException;
import org.baseclass.BaseClass;
import org.openqa.selenium.WebElement;
import org.pageobjects.ExplorerPageBasePrice;
import org.pageobjects.ExplorerPageProductPanning;
import org.pageobjects.ExplorerPageSanityCreateRecord;
import org.pageobjects.ExplorerPage_010_part;
import org.pageobjects.ExplorerPage_020_Segment;
import org.pageobjects.ExplorerPage_030_Dn_Pricing;
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
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
@Listeners(TestListener.class)
public class ExplorerPageTest extends BaseClass {
	
			Login_TC login = new Login_TC();
			ScrollByVisibleElement scroll;
			GetTextBoxValue textbox;
			GetTestData exceldata;
			Segmentation segmentation;
			PreSegmentation preSegmentation;
			ExplorerPage_010_part partentity;
			ExplorerPage_020_Segment segmententity;
			writeBack writeResult = new writeBack();
			ExplorerPage_110_ECC_Minor eccminor;
			ExplorerPage_030_Dn_Pricing dnpricingentity;
			ExplorerPageBasePrice basepriceentity;
			ExplorerPageProductPanning productplanninentity;
			ExplorerPageSanityCreateRecord sanityCreateRecord;
			//ExtentReports extent = new ExtentReports();
			//ExtentSparkReporter spark = new ExtentSparkReporter("ExtentReport.html");
			
	
	@Test
	public void updatePart() throws InterruptedException, IOException {
		
		//ExtentTest test = extent.createTest("Verify update part entity");
		//test.pass("part entity updated");
		
		partentity = new ExplorerPage_010_part();
		segmententity = new ExplorerPage_020_Segment();
		scroll = new ScrollByVisibleElement();
		HomePage hp = new HomePage();
		textbox = new GetTextBoxValue();
		hp.EnterDataExplorer();
		exceldata = new GetTestData();
		segmentation = new Segmentation();
		preSegmentation = new PreSegmentation();

		// Select Model dropdown
		partentity.enterModelname();
		partentity.searcModelname();
		partentity.clickModelname();

		// Select Entity dropdown 
		partentity.enterEntityname();
		partentity.searchEntityname();
		partentity.clickEntityname();
		
		//update partOwner 
		String entitySelected= partentity.entityname().getText();
		assertEquals(entitySelected, "010 - Part", "User nevigated to Part entity");	
	 
		//update businessOwner
		WebElement businessOwner = partentity.businessOwner();
		businessOwner.click();
		businessOwner.sendKeys("EBU");
		
		
		//update readyForSegmentation
		WebElement readyForSegmentation = partentity.readyForSegmentationValue();
		scroll.ByVisibleElement(readyForSegmentation);
		partentity.readyForSegmentationCloseBtn();
		System.out.println("Removed value of ready for segmentation");
		readyForSegmentation.click();
		partentity.SearchReadyForSegmentation();
		partentity.clickReadyForSegmentationValue();
		System.out.println("Added new value for ready for segmentation");
		
		//update saleable
		WebElement saleable = partentity.saleableValue();
		scroll.ByVisibleElement(saleable);
		saleable.clear();
		saleable.sendKeys("N");
		
		//click on save button
		partentity.saveOption().click();
		Screenshots.ScreenCapture();
		System.out.println("Clicked on save option");
		
	}

	
	@Test
	public void updateSegment() throws IOException {
	
		partentity = new ExplorerPage_010_part();
		segmententity = new ExplorerPage_020_Segment();
		scroll = new ScrollByVisibleElement();
		HomePage hp = new HomePage();
		textbox = new GetTextBoxValue();
		hp.EnterDataExplorer();
		
		//click model dropdown
		partentity.enterModelname();
		partentity.searcModelname();
		partentity.clickModelname();
		
		// Select Entity dropdown
		partentity.enterEntityname();
		segmententity.searchEntityname();
		segmententity.clickEntityname();
		
		String entitySelected= segmententity.segmentEntityname().getText();
		assertEquals(entitySelected, "Segment", "User is not nevigated to Segment entity");	
		System.out.println("User nevigated to segment entity");
		
		//update segmentSalesVolume
		WebElement segmentSalesVolume = segmententity.segmentSalesVolumeValue();
		scroll.ByVisibleElement(segmentSalesVolume);
		segmentSalesVolume.clear();
		segmentSalesVolume.sendKeys("500");
		System.out.println("New value of segmentSalesVolume is 500 ");
		
		//update segmentPartMinimumPrice
		WebElement segmentPartMinimumPrice = segmententity.segmentPartMinimumPricevalue();
		scroll.ByVisibleElement(segmentPartMinimumPrice);
		segmentPartMinimumPrice.clear();
		segmentPartMinimumPrice.sendKeys("20000");
		System.out.println("New Value of segmentPartMinimumPrice is 20000");

		//update segmentPartMaximumPrice
		WebElement segmentPartMaximumPrice = segmententity.segmentPartMaximumPriceValue();
		scroll.ByVisibleElement(segmentPartMaximumPrice);
		segmentPartMaximumPrice.clear();
		segmentPartMaximumPrice.sendKeys("40000");
		System.out.println("New Value of segmentPartMaximumPrice is 40000");
		
		//update segmentPartMeanPrice
		WebElement segmentPartMeanPrice = segmententity.segmentPartMeanPriceValue();
		scroll.ByVisibleElement(segmentPartMeanPrice);
		segmentPartMeanPrice.clear();
		segmentPartMeanPrice.sendKeys("40000");
		System.out.println("New Value of segmentPartMinPrice is 40000");
		
		partentity.saveOption().click();
		Screenshots.ScreenCapture();
		System.out.println("Clicked on save option");
		
	}
	
	
	@Test
	public void updateDNPricing() throws InterruptedException, IOException { //change to update
		
		
		partentity = new ExplorerPage_010_part();
		segmententity = new ExplorerPage_020_Segment();
		scroll = new ScrollByVisibleElement();
		HomePage hp = new HomePage();
		dnpricingentity = new ExplorerPage_030_Dn_Pricing();
		textbox = new GetTextBoxValue();
		hp.EnterDataExplorer();
		
		// Select Model dropdown
		partentity.enterModelname();
		partentity.searcModelname();
		partentity.clickModelname();
		
		// Select Entity dropdown
		partentity.enterEntityname();
		dnpricingentity.searchEntityname();
		dnpricingentity.clickEntityname();
		
		
		String entitySelected= partentity.entityname().getText();
		assertEquals(entitySelected, "030-DN Pricing", "User is not nevigated to DN Pricing entity");	
		System.out.println("User nevigated to DN Pricing entity");
		
		//update pricingAdminOwner
		WebElement pricingAdminOwner = dnpricingentity.pricingAdminOwner();	
		pricingAdminOwner.clear();
		pricingAdminOwner.sendKeys("HHP");
		System.out.println("New value of pricingAdminOwner is HHP ");
		
		//update productBU
		WebElement productBU = dnpricingentity.productBU();
		productBU.clear();
		productBU.sendKeys("HHP");
		System.out.println("New value of pricingAdminOwner is HHP ");
		
		//update businessOwner
		WebElement businessOwner = dnpricingentity.businessOwner();
		businessOwner.clear();
		businessOwner.sendKeys("EBU");
		System.out.println("New value of businessOwner is EBU ");
		
		partentity.saveOption().click();
		Screenshots.ScreenCapture();
		System.out.println("Clicked on save option");
		
	}
	
	
	
	
	@Test
	public void updateBasePrice() throws IOException {
		
		
		partentity = new ExplorerPage_010_part();
		segmententity = new ExplorerPage_020_Segment();
		scroll = new ScrollByVisibleElement();
		HomePage hp = new HomePage();
		dnpricingentity = new ExplorerPage_030_Dn_Pricing();
		textbox = new GetTextBoxValue();
		basepriceentity = new ExplorerPageBasePrice();
		hp.EnterDataExplorer();	
		
		//Select Model dropdown
		partentity.enterModelname();
		partentity.searcModelname();
		partentity.clickModelname();
		
		// Select Entity dropdown
		partentity.enterEntityname();
		basepriceentity.searchentitynameBasePrice();
		basepriceentity.clickBasePrice();
		
		String entitySelected= partentity.entityname().getText();
		assertEquals(entitySelected, "035-Base Price", "User is not nevigated to Base Price entity");	
		System.out.println("User nevigated to Base Price entity");
		
		//update currency
		WebElement currency = basepriceentity.currency();
		currency.clear();
		currency.sendKeys("USD");
		System.out.println("New value of currency is USD ");
		
		//update current price
		WebElement currentPrice = basepriceentity.currentPrice();
		currentPrice.clear();
		currentPrice.sendKeys("70000");
		System.out.println("New value of currentPrice is 70000 ");
		
		//update publishPrice
		WebElement publishPrice = basepriceentity.publishPrice();
		publishPrice.clear();
		publishPrice.sendKeys("60000");
		System.out.println("New value of currentPrice is 60000 ");

		partentity.saveOption().click();
		Screenshots.ScreenCapture();
		System.out.println("Clicked on save option");
		
		
		
	}
	
	

	@Test
	public void updateProductPlanning() throws IOException {
		
				

		partentity = new ExplorerPage_010_part();
		segmententity = new ExplorerPage_020_Segment();
		scroll = new ScrollByVisibleElement();
		HomePage hp = new HomePage();
		dnpricingentity = new ExplorerPage_030_Dn_Pricing();
		textbox = new GetTextBoxValue();
		basepriceentity = new ExplorerPageBasePrice();
		productplanninentity =new ExplorerPageProductPanning();
		hp.EnterDataExplorer();
		
		//Select Model dropdown
		partentity.enterModelname();
		partentity.searcModelname();
		partentity.clickModelname();
		
		// Select Entity dropdown
		partentity.enterEntityname();
		productplanninentity.searchentityname();
		productplanninentity.clickProductPlanning();
		
		String entitySelected= partentity.entityname().getText();
		assertEquals(entitySelected, "200-Product Planning", "User is not nevigated to 200-Product Planning entity");	
		System.out.println("User nevigated to Product Planning entity");
		
		//update cPartNumber
		WebElement cPartNumber = productplanninentity.cPartNumber();
		cPartNumber.clear();
		cPartNumber.sendKeys("343556");
		System.out.println("New value of cPartNumber is 343556 ");
		
		//update dPartNumber
		WebElement dPartNumber = productplanninentity.dPartNumber();
		dPartNumber.clear();
		dPartNumber.sendKeys("2367433232");
		System.out.println("New value of dPartNumber is 2367433232 ");
		
		//update currentPartNumber
		WebElement currentPartNumber = productplanninentity.currentPartNumber();
		currentPartNumber.clear();
		currentPartNumber.sendKeys("1213435465");
		System.out.println("New value of currentPartNumber is 1213435465 ");
		
		partentity.saveOption().click();
		Screenshots.ScreenCapture();
		System.out.println("Clicked on save option");
		
	}
	
	
	
	
	@Test
	public void updatePartWithoutChange() throws InterruptedException, IOException {
		
		
		partentity = new ExplorerPage_010_part();
		segmententity = new ExplorerPage_020_Segment();
		scroll = new ScrollByVisibleElement();
		HomePage hp = new HomePage();
		textbox = new GetTextBoxValue();
		hp.EnterDataExplorer();
		exceldata = new GetTestData();
		segmentation = new Segmentation();
		preSegmentation = new PreSegmentation();

		// Select Model dropdown
		partentity.enterModelname();
		partentity.searcModelname();
		partentity.clickModelname();

		// Select Entity dropdown 
		partentity.enterEntityname();
		partentity.searchEntityname();
		partentity.clickEntityname();
		
		//update partOwner 
		String entitySelected= partentity.entityname().getText();
		assertEquals(entitySelected, "010 - Part", "User nevigated to Part entity");	
		
		Screenshots.ScreenCapture();
		
		partentity.saveOption().click();
		Screenshots.ScreenCapture();
		System.out.println("Clicked on save option");
		
	}

	
	
	@Test
	public void updateSegmentWithoutChange() throws IOException {
	
		partentity = new ExplorerPage_010_part();
		segmententity = new ExplorerPage_020_Segment();
		scroll = new ScrollByVisibleElement();
		HomePage hp = new HomePage();
		textbox = new GetTextBoxValue();
		hp.EnterDataExplorer();
		// Select Model dropdown
		partentity.enterModelname();
		partentity.searcModelname();
		partentity.clickModelname();
		// Select Entity
		partentity.enterEntityname();
		segmententity.searchEntityname();
		segmententity.clickEntityname();
		// Click on Grid
		
		String entitySelected= segmententity.segmentEntityname().getText();
		assertEquals(entitySelected, "Segment", "User is not nevigated to Segment entity");	
		
		System.out.println("User nevigated to segment entity");

		Screenshots.ScreenCapture();
		partentity.saveOption().click();
		Screenshots.ScreenCapture();
		System.out.println("Clicked on save option");
		
	}
	
	@Test
	public void updateDNPricingWithoutChange() throws InterruptedException, IOException { //change to update
		
		
		partentity = new ExplorerPage_010_part();
		segmententity = new ExplorerPage_020_Segment();
		scroll = new ScrollByVisibleElement();
		HomePage hp = new HomePage();
		dnpricingentity = new ExplorerPage_030_Dn_Pricing();
		textbox = new GetTextBoxValue();
		
		hp.EnterDataExplorer();
		// Select Model dropdown
		partentity.enterModelname();
		partentity.searcModelname();
		partentity.clickModelname();
		
		// Select Entity dropdown
		partentity.enterEntityname();
		dnpricingentity.searchEntityname();
		dnpricingentity.clickEntityname();
		
		
		String entitySelected= partentity.entityname().getText();
		assertEquals(entitySelected, "030-DN Pricing", "User is not nevigated to DN Pricing entity");	
		System.out.println("User nevigated to DN Pricing entity");

		
		partentity.saveOption().click();
		Screenshots.ScreenCapture();
		System.out.println("Clicked on save option");
		
	}
	
	@Test
	public void updateBasePriceWithoutChange() throws IOException {
		
		
		partentity = new ExplorerPage_010_part();
		segmententity = new ExplorerPage_020_Segment();
		scroll = new ScrollByVisibleElement();
		HomePage hp = new HomePage();
		dnpricingentity = new ExplorerPage_030_Dn_Pricing();
		textbox = new GetTextBoxValue();
		basepriceentity = new ExplorerPageBasePrice();
		
		
		hp.EnterDataExplorer();
		// Select Model dropdown
		partentity.enterModelname();
		partentity.searcModelname();
		partentity.clickModelname();
		
		// Select Entity dropdown
		partentity.enterEntityname();
		basepriceentity.searchentitynameBasePrice();
		basepriceentity.clickBasePrice();
		
		String entitySelected= partentity.entityname().getText();
		assertEquals(entitySelected, "035-Base Price", "User is not nevigated to Base Price entity");	
		System.out.println("User nevigated to Base Price entity");

		partentity.saveOption().click();
		Screenshots.ScreenCapture();
		System.out.println("Clicked on save option");
		
		
		
	}
	
	
	@Test
	public void updateProductPlanningWithoutChange() throws IOException {
		
				

		partentity = new ExplorerPage_010_part();
		segmententity = new ExplorerPage_020_Segment();
		scroll = new ScrollByVisibleElement();
		HomePage hp = new HomePage();
		dnpricingentity = new ExplorerPage_030_Dn_Pricing();
		textbox = new GetTextBoxValue();
		basepriceentity = new ExplorerPageBasePrice();
		productplanninentity =new ExplorerPageProductPanning();	
		hp.EnterDataExplorer();
		
		// Select Model dropdown
		partentity.enterModelname();
		partentity.searcModelname();
		partentity.clickModelname();
		
		// Select Entity dropdown
		partentity.enterEntityname();
		productplanninentity.searchentityname();
		productplanninentity.clickProductPlanning();
		
		String entitySelected= partentity.entityname().getText();
		assertEquals(entitySelected, "200-Product Planning", "User is not nevigated to 200-Product Planning entity");	
		System.out.println("User nevigated to Product Planning entity");
		
		partentity.saveOption().click();
		Screenshots.ScreenCapture();
		System.out.println("Clicked on save option");
		
	}
	
	@Test(priority =2)
	public void addRecord() throws IOException {
		
		sanityCreateRecord = new ExplorerPageSanityCreateRecord();
		partentity = new ExplorerPage_010_part();
		segmententity = new ExplorerPage_020_Segment();
		scroll = new ScrollByVisibleElement();
		HomePage hp = new HomePage();
		dnpricingentity = new ExplorerPage_030_Dn_Pricing();
		textbox = new GetTextBoxValue();
		basepriceentity = new ExplorerPageBasePrice();
		productplanninentity =new ExplorerPageProductPanning();	
		hp.EnterDataExplorer();
		
		// Select Model dropdown
		partentity.enterModelname();
		partentity.searchSanityModel();
		partentity.sanityModelCreateRecord();
		
		WebElement name = sanityCreateRecord.name();
		name.click();
		name.sendKeys("SIM");
		
		Date d = new Date(0);
        System.out.println(d.toString());
        DateFormat dFormat = DateFormat.getDateInstance(DateFormat.SHORT);
        String inputCode=dFormat.format(d);
        String codeValue= inputCode.replaceAll("\\W", "");
     
		WebElement code = sanityCreateRecord.code();
		code.click();
		code.sendKeys(codeValue);
		
		WebElement numAt = sanityCreateRecord.numAt();
		numAt.click();
		numAt.sendKeys("5000");
		
		WebElement textAt = sanityCreateRecord.textAt();
		textAt.click();
		textAt.sendKeys("SimAdvisory");
		
		partentity.saveOption().click();
		
		String message = sanityCreateRecord.recordCreatedSucessfullyValidationMessage().getText();
		if(message.equals("Record created successfully.")) {
			
			System.out.println("Record Created successfully");
			Screenshots.ScreenCapture();
		}
		
	}
	
	
	@Test(priority=3)
	public void deleteRecord() throws IOException, InterruptedException{
		
		sanityCreateRecord = new ExplorerPageSanityCreateRecord();
		partentity = new ExplorerPage_010_part();
		segmententity = new ExplorerPage_020_Segment();
		scroll = new ScrollByVisibleElement();
		HomePage hp = new HomePage();
		dnpricingentity = new ExplorerPage_030_Dn_Pricing();
		textbox = new GetTextBoxValue();
		basepriceentity = new ExplorerPageBasePrice();
		productplanninentity =new ExplorerPageProductPanning();	
		hp.EnterDataExplorer();
		Thread.sleep(10000);
		// Select Model dropdown
		partentity.enterModelname();
		partentity.searchSanityModel();
		partentity.sanityModelCreateRecord();
		Thread.sleep(10000);
		sanityCreateRecord.deleteButton();
		sanityCreateRecord.deletePopupYesButton();
		String message = sanityCreateRecord.recordDeletedSucessfullyValidationMessage().getText();
		if(message.equals("Record deleted successfully.")) {
			
			System.out.println("Record Deleted successfully");
			Screenshots.ScreenCapture();
		}
		
		
		
		
		
	}
	
	@Test(enabled =false)
	public void editRecord() throws IOException, InterruptedException{
			
			sanityCreateRecord = new ExplorerPageSanityCreateRecord();
			partentity = new ExplorerPage_010_part();
			segmententity = new ExplorerPage_020_Segment();
			scroll = new ScrollByVisibleElement();
			HomePage hp = new HomePage();
			dnpricingentity = new ExplorerPage_030_Dn_Pricing();
			textbox = new GetTextBoxValue();
			basepriceentity = new ExplorerPageBasePrice();
			productplanninentity =new ExplorerPageProductPanning();	
			hp.EnterDataExplorer();
			Thread.sleep(10000);
			// Select Model dropdown
			partentity.enterModelname();
			partentity.searchSanityModel();
			partentity.sanityModelCreateRecord();
		
			WebElement textAt = sanityCreateRecord.textAt();
			textAt.clear();
			textAt.sendKeys("SimAdvisoryUpdated");

			partentity.saveOption().click();
			
			String message = sanityCreateRecord.recordUpdatedSucessfullyValidationMessage().getText();
			if(message.equals("Record updated successfully.")) {
				
				System.out.println("Record Updated successfully");
				Screenshots.ScreenCapture();
			}
			
			
			
			
		
	}
	
	
	@BeforeMethod
	public void loginSpriced() throws EncryptedDocumentException, InterruptedException, IOException {
		
	//	extent.attachReporter(spark);
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
            
       // extent.flush();
	}

	@AfterClass
	public void closeBrowser() {
		//driver.close();

	}
}
