package org.TestBase;

import static org.testng.Assert.assertEquals;

import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.apache.poi.EncryptedDocumentException;
import org.baseclass.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.pageobjects.ExplorerPage_010_part;
import org.pageobjects.ExplorerPage_020_Segment;
import org.pageobjects.ExplorerPage_100_ECC;
import org.pageobjects.ExplorerPage_110_ECC_Minor;
import org.pageobjects.ExplorerPage_xSales_Status_Code;
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

public class GlobalSegmentation extends BaseClass {

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
	WebDriver driver;
	Screenshots screenshot=new Screenshots();
	int row7 = 1;
	String partNumberFromExcel;
	String segmentTypeEccMinorValue;
	String segmentTypePartValue;
	String segmentTypeEccValue;

	String futureSalesStatusCode010part;
	String existingSegmentCodeValue;
	String existingPriorityValue;
	String existingbasePartValue;
	String existingPricingActionMethodValue;
	String existingnewPricingActionMethodValue;
	String existingPartsInSegmentValue;
	String existingSegmentSalesVolumeValue;
	String existingSegmentPartMinimumPriceValue;
	String existingSegmentPartMaximumPriceValue;
	String existingSegmentPartMeanPriceValue;
	String existingSegmentPartStandDeviationPriceValue;
	String existingSegmentPartWeightedMeanPriceValue;
	String existingCpmValue;

	String newSegmentCodeValue;
	String newPriorityValue;
	String newBasePartValue;
	String newPricingActionMethodValue;
	String newNewPricingActionMethodValue;
	String newPartsInSegmentValue;
	String newSegmentSalesVolumeValue;
	String newSegmentPartMinimumPriceValue;
	String newSegmentPartMaximumPriceValue;
	String newSegmentPartMeanPriceValue;
	String newSegmentPartStandDeviationPriceValue;
	String newSegmentPartWeightedMeanPriceValue;
	String newCpmValue;

	String futureSalesStatusCodeValue;
	String nameValuexsalesStatusCode;
	String xSalesSaleableValue;

	ExplorerPage_xSales_Status_Code xsalesStatusCode;
	ArrayList<String> listOfUnsegmentElements = new ArrayList<String>();
	ArrayList<String> listOfSegmentedElements = new ArrayList<String>();
	ArrayList<String> listOfInputElements = new ArrayList<String>();
	
	@Test(enabled=false)
	public void unSegmentation() throws InterruptedException, EncryptedDocumentException, IOException {
		
		partentity = new ExplorerPage_010_part();
		segmententity = new ExplorerPage_020_Segment();
		scroll = new ScrollByVisibleElement();
		HomePage hp = new HomePage();
		textbox = new GetTextBoxValue();
		hp.EnterDataExplorer();
		exceldata = new GetTestData();
		segmentation = new Segmentation();
		preSegmentation = new PreSegmentation();

		// Select Model
		partentity.enterModelname();
		partentity.searcModelname();
		partentity.clickModelname();

		// Select Entity
		partentity.enterEntityname();
		partentity.searchEntityname();
		partentity.clickEntityname();

		Thread.sleep(10000);
		
		WebElement partnumber = partentity.partNumberValue();
		String partNumberValueUI = textbox.getvalue_textbox(partnumber);
		System.out.println("Value of part number from UI is:" + partNumberValueUI);

		
			WebElement segmentCode = partentity.segmentValue();	
			String segmentCodeValue = gettext(segmentCode);
			System.out.println("print the segmentCodeValue from UI" +segmentCodeValue);
			Screenshots.ScreenCapture();
			existingSegmentCodeValue = segmentCodeValue;
			listOfUnsegmentElements.add(existingSegmentCodeValue);

			/*WebElement priority = partentity.priorityValue();
			scroll.ByVisibleElement(priority);
			String priorityValue = gettext(priority);
			System.out.println("print the priority from UI" +priorityValue);
			existingPriorityValue = priorityValue;
			listOfUnsegmentElements.add(existingPriorityValue);
			// saleable
			Thread.sleep(5000);
			WebElement basePart = partentity.basePartValue();
			scroll.ByVisibleElement(basePart);
			String basePartValue = textbox.getvalue_textbox(basePart);
			System.out.println("print the existing basePart from UI" +basePartValue);
			existingbasePartValue = basePartValue;
			listOfUnsegmentElements.add(existingbasePartValue);

			segment020();*/
		
		

		Thread.sleep(10000);
		/*WebElement segment = partentity.segmentValue();
		scroll.ByVisibleElement(segment);
		String segmentValue = gettext(segment);
		System.out.println("Segment value on UI before removing..." + segmentValue);*/
		
		 String segmentCodeValueDigits= segmentCodeValue.replaceAll("[^0-9]", "");

		//partentity.clearSegment();

		//partentity.saveOption().click();
		/*Thread.sleep(20000);
		
		partentity.enterEntityname();
		partentity.searchEntityname();
		partentity.clickEntityname();

		Thread.sleep(3000);

		WebElement segment1 = partentity.segmentValue();
		scroll.ByVisibleElement(segment1);
		String segmentValue1 = gettext(segment);
		System.out.println("Segment value on UI after removing..." + segmentValue1);*/
		
		partentity.filterBtnOption();
		partentity.ruleFilter();
		partentity.filterDropDown();
		
		clickSegmentOnFilterPopup();
		
		partentity.filterPencilIcon();
		partentity.filterSegment().click();
		partentity.segmentRule();
		Thread.sleep(3000);
		partentity.SegmentFilterDropDown();
        partentity.SegmentFilterCode();
       partentity.codeTextBox().click();
        
        WebElement codeTextBoxSegment =  partentity.codeTextBox();
		
        asendKeys(codeTextBoxSegment,segmentCodeValueDigits);
        partentity.segmentFilterApply();
        partentity.segmentFirstGrid();
        partentity.segmentSubmit();
        partentity.FilterApply();
        Thread.sleep(5000);
        removeSegmentAllGrid();
      
        partentity.removeFilterBtn();
        Thread.sleep(10000);
        partentity.enterEntityname();
		segmententity.searchEntityname();
		segmententity.clickEntityname();

		partentity.filterBtnOption();
		partentity.ruleFilter();
		segmententity.segmentEntityFilterDropDown();
		segmententity.segmentEntityCodeOption();
		asendKeys(codeTextBoxSegment,segmentCodeValueDigits);
		
		partentity.FilterApply();
		
		//segmententity.segmentEntityDeleteSegment();
		
		
     /*   System.out.println("New Values After Segmentation:\n");
        
        partentity.enterEntityname();
		partentity.searchEntityname();
		partentity.clickEntityname();

			Thread.sleep(10000);           		
			segmentCode = partentity.segmentValue();
			segmentCodeValue = gettext(segmentCode);
			// System.out.println("print the partowner from UI" +partOwnerValue);
			newSegmentCodeValue = segmentCodeValue;
			listOfSegmentedElements.add(newSegmentCodeValue);

			priority = partentity.priorityValue();
			scroll.ByVisibleElement(priority);
			priorityValue = gettext(priority);
			// System.out.println("print the information from UI" +informationValue);
			newPriorityValue = priorityValue;
			listOfSegmentedElements.add(newPriorityValue);

			// saleable

			basePart = partentity.basePartValue();
			scroll.ByVisibleElement(basePart);
			basePartValue = textbox.getvalue_textbox(basePart);
			System.out.println("print the new basePartValue from UI" +basePartValue);
			newBasePartValue = basePartValue;
			listOfSegmentedElements.add(newBasePartValue);

			segment020SegmentedElements();

			existingUnsegmentedElements();*/
       
        
	}
	

	@Test
	public void allValuePairList() throws EncryptedDocumentException, IOException, InterruptedException {

		partentity = new ExplorerPage_010_part();
		scroll = new ScrollByVisibleElement();
		HomePage hp = new HomePage();
		textbox = new GetTextBoxValue();
		hp.EnterDataExplorer();
		exceldata = new GetTestData();
		segmentation = new Segmentation();
		preSegmentation = new PreSegmentation();

		partNumberFromExcel=exceldata.getTestData(4, 0);
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
		WebElement partOwner = partentity.partOwnerValue();
		scroll.ByVisibleElement(partOwner);
		String partOwnerValue = gettext(partOwner);
		//System.out.println("Value of partOwner from UI is:" + partOwnerValue);
		listOfInputElements.add(partOwnerValue);
		

		WebElement segmentType010Part = partentity.segmentType010PartValue();
		scroll.ByVisibleElement(segmentType010Part);
		String segmentType010PartValue = gettext(segmentType010Part);
		//System.out.println("Value of segmentType010Part from UI is:" + segmentType010PartValue);
		listOfInputElements.add(segmentType010PartValue);
		

		WebElement brand = partentity.brandValue();
		scroll.ByVisibleElement(brand);
		String brandValue = gettext(brand);
		//System.out.println("Value of brand from UI is:" + brandValue);
		listOfInputElements.add(brandValue);

		WebElement ecc = partentity.eccValue();
		scroll.ByVisibleElement(ecc);
		String eccValue = gettext(ecc);
		//System.out.println("Value of ecc from UI is:" + eccValue);
		listOfInputElements.add(brandValue);
		
		WebElement information = partentity.informationValue();
		scroll.ByVisibleElement(information);
		String informationValue = gettext(information);
		//System.out.println("Value of information from UI is:" + informationValue);
		listOfInputElements.add(informationValue);
		
		WebElement futureSalesStatusCode = partentity.futureSalesStatusCodeValue();
		futureSalesStatusCodeValue = gettext(futureSalesStatusCode);
		System.out.println("futureSalesStatusCodeValue: " + futureSalesStatusCodeValue);
		
		WebElement saleable = partentity.saleableValue();
		scroll.ByVisibleElement(saleable);
		String saleableValue = textbox.getvalue_textbox(saleable);
	//	System.out.println("Value of saleable from UI is:" + saleableValue);
		listOfInputElements.add(saleableValue);

		
		


		futureSaleCode();

		String inputElements = "";
		for (String s : listOfInputElements) {
			inputElements += s + ", \t";

		}
		writeResult.writeToExcel(1, inputElements);
		System.out.println("InputElements from Excel" + inputElements);

		String testCaseId = exceldata.getTestData(1, 0);
		System.out.println("Testcase id = " + testCaseId);

		System.out.print("InputElements from UI:" + partOwnerValue + " " + saleableValue + " " + informationValue + " "
				+ xSalesSaleableValue + "\n");
		
		/*preSegmentationValue();
    	if(segmentTypePartValue.equalsIgnoreCase(segmentTypeEccMinorValue) || segmentTypePartValue.equalsIgnoreCase(segmentTypeEccValue)) {*/

		if (partOwnerValue.equals("{Global}") && (!informationValue.equals("OEM Unique")
				&& (saleableValue.equals("Y") && (xSalesSaleableValue.equals("Y") && !segmentType010PartValue.isEmpty() &&  !eccValue.isEmpty() && !brandValue.isEmpty())))) {
			System.out.println("Eligible for segmentation.");
		

		    partentity.enterEntityname();
			partentity.searchEntityname();
			partentity.clickEntityname();
			Thread.sleep(20000);
			partentity.filterBtnOption();
			partentity.ruleFilter();
			partentity.filterDropDown();
			partentity.filterCode();
			//partentity.filterTextBox().click();
			partentity.filterTextBox().sendKeys(partNumberFromExcel);
			partentity.FilterApply();
			Thread.sleep(10000);
			/*WebElement segmentCode = partentity.segmentValue();
			
			partentity.clearSegment();

			WebElement readyForSegmentation = partentity.readyForSegmentationValue();
			scroll.ByVisibleElement(readyForSegmentation);
		//	moveToReadyForSegmentation();
			readyForSegmentation.click();
			partentity.SearchReadyForSegmentation();
			partentity.clickReadyForSegmentationValue();
			
			partentity.saveOption().click();
			
			Thread.sleep(7000);
			
			System.out.println("clicked save");

			//WebElement segmentCode = partentity.segmentValue();
			
			//partentity.clearSegment();*/
			Screenshots.ScreenCapture();

			WebElement segmentCode = partentity.segmentValue();	
			String segmentCodeValue = gettext(segmentCode);
			// System.out.println("print the partowner from UI" +partOwnerValue);
			existingSegmentCodeValue = segmentCodeValue;
			listOfUnsegmentElements.add(existingSegmentCodeValue);

			WebElement priority = partentity.priorityValue();
			scroll.ByVisibleElement(priority);
			String priorityValue = gettext(priority);
			// System.out.println("print the information from UI" +informationValue);
			existingPriorityValue = priorityValue;
			listOfUnsegmentElements.add(existingPriorityValue);
			// saleable
			Thread.sleep(5000);
			WebElement basePart = partentity.basePartValue();
			scroll.ByVisibleElement(basePart);
			String basePartValue = textbox.getvalue_textbox(basePart);
			System.out.println("print the existing basePart from UI" +basePartValue);
			existingbasePartValue = basePartValue;
			listOfUnsegmentElements.add(existingbasePartValue);

			segment020();

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
		  //partentity.checkFirstGridOption();
			
            segmentCode = partentity.segmentValue();
			
			partentity.clearSegment();

			WebElement readyForSegmentation = partentity.readyForSegmentationValue();
			scroll.ByVisibleElement(readyForSegmentation);
		//	moveToReadyForSegmentation();
			//readyForSegmentation.click();
			//partentity.SearchReadyForSegmentation();
			//partentity.clickReadyForSegmentationValue();
			
			partentity.readyForSegmentationCloseBtn();
			Screenshots.ScreenCapture();
			partentity.saveOption().click();
			
			Thread.sleep(7000);
			
			System.out.println("clicked save");

			//WebElement segmentCode = partentity.segmentValue();
			
			//partentity.clearSegment();
			 
			 

			 scroll.ByVisibleElement(readyForSegmentation);
			readyForSegmentation.click();

			partentity.SearchReadyForSegmentation1();
			partentity.readyForSegmentationYesOption();
			partentity.saveOption().click();
			Screenshots.ScreenCapture();
			Thread.sleep(10000);
			
			partentity.refreshButton();
			
			System.out.println("Clicked on refresh");
			
			Thread.sleep(5000);
			
			
			System.out.println("New Values After Segmentation:\n");
//            		
			segmentCode = partentity.segmentValue();
			segmentCodeValue = gettext(segmentCode);
			// System.out.println("print the partowner from UI" +partOwnerValue);
			newSegmentCodeValue = segmentCodeValue;
			listOfSegmentedElements.add(newSegmentCodeValue);

			priority = partentity.priorityValue();
			scroll.ByVisibleElement(priority);
			priorityValue = gettext(priority);
			// System.out.println("print the information from UI" +informationValue);
			newPriorityValue = priorityValue;
			listOfSegmentedElements.add(newPriorityValue);

			// saleable

			basePart = partentity.basePartValue();
			scroll.ByVisibleElement(basePart);
			basePartValue = textbox.getvalue_textbox(basePart);
			System.out.println("print the new basePartValue from UI" +basePartValue);
			newBasePartValue = basePartValue;
			listOfSegmentedElements.add(newBasePartValue);

			segment020SegmentedElements();

			existingUnsegmentedElements();
			
			//assertEquals(listOfUnsegmentElements, listOfSegmentedElements, "Values are matching");

		/*	segmententity.enterEntityname();
			segmententity.searchEntityname010Part();
			partentity.clickEntityname();*/

			// partentity.checkFirstGridOption();

			// boolean result1=preSegmentation.comparePartNumber(partNumberValueUI);

			// assertEquals(result1, true, "Value of partNumber from UI and excel same");
		//	String result = "Pass";
		//	writeResult.writeToExcelActualResult(1, result);

		}

		else {

			// System.out.println("Testcase id is..."+testCaseId);
			System.out.println("Not Eligible for segmentation\n");
			String result = "Fail";
			writeResult.writeToExcelActualResult(1, result);
			
			System.out.println("Excel result printed");

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
			WebElement segmentCode = partentity.segmentValue();
			String segmentCodeValue = gettext(segmentCode);
			// System.out.println("print the partowner from UI" +partOwnerValue);
			existingSegmentCodeValue = segmentCodeValue;
			listOfUnsegmentElements.add(existingSegmentCodeValue);

			WebElement priority = partentity.priorityValue();
			scroll.ByVisibleElement(priority);
			String priorityValue = gettext(priority);
			// System.out.println("print the information from UI" +informationValue);
			existingPriorityValue = priorityValue;
			listOfUnsegmentElements.add(existingPriorityValue);
			// saleable
			WebElement basePart = partentity.basePartValue();
			scroll.ByVisibleElement(basePart);
			String basePartValue = textbox.getvalue_textbox(basePart);
			// System.out.println("print the saleable from UI" +saleableValue);
			existingbasePartValue = basePartValue;
			listOfUnsegmentElements.add(existingbasePartValue);

			segmentCode = partentity.segmentValue();
			segmentCodeValue = gettext(segmentCode);
			// System.out.println("print the partowner from UI" +partOwnerValue);
			newSegmentCodeValue = segmentCodeValue;
			listOfSegmentedElements.add(newSegmentCodeValue);

			priority = partentity.priorityValue();
			scroll.ByVisibleElement(priority);
			priorityValue = gettext(priority);
			// System.out.println("print the information from UI" +informationValue);
			newPriorityValue = priorityValue;
			listOfSegmentedElements.add(newPriorityValue);

			// saleable

			basePart = partentity.basePartValue();
			scroll.ByVisibleElement(basePart);
			basePartValue = textbox.getvalue_textbox(basePart);
			// System.out.println("print the saleable from UI" +saleableValue);
			newBasePartValue = basePartValue;
			listOfSegmentedElements.add(newBasePartValue);
			
			System.out.println("Element printed");

			segment020();
			segment020SegmentedElements();
			existingUnsegmentedElements();

		}
		
    /*	}
		
		else {
			System.out.println("Testcase id is..."+testCaseId);
            System.out.println("Not Eligible for Segmentation because ecc and ecc minor values are not matching");
            String result = "Fail";
            writeResult.writeToExcelActualResult(1, result);
		
		
		}*/

	}
	

	public void futureSaleCode() throws InterruptedException {

		xsalesStatusCode = new ExplorerPage_xSales_Status_Code();

	/*	partentity.enterModelname();
		partentity.searcModelname();
		partentity.clickModelname();
		partentity.enterEntityname();
		partentity.searchEntityname();
		partentity.clickEntityname();
		Thread.sleep(20000);
		
		partentity.filterBtnOption();
		partentity.ruleFilter();
		partentity.filterDropDown();
		partentity.filterCode();
		//partentity.filterTextBox().click();
		partentity.filterTextBox().sendKeys(partNumberFromExcel);
		partentity.FilterApply();*/
		
		

		/*WebElement futureSalesStatusCode = partentity.futureSalesStatusCodeValue();
		futureSalesStatusCodeValue = gettext(futureSalesStatusCode);
		System.out.println("futureSalesStatusCodeValue: " + futureSalesStatusCodeValue);*/
		Thread.sleep(20000);
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
		nameValuexsalesStatusCode = textbox.getvalue_textbox(name);
		System.out.println("nameValue: " + nameValuexsalesStatusCode);

		WebElement xSalesSaleable = xsalesStatusCode.xSalesSaleableValue();
		xSalesSaleableValue = textbox.getvalue_textbox(xSalesSaleable);
		listOfInputElements.add(xSalesSaleableValue);

	}

	public void existingUnsegmentedElements() throws IOException {

		System.out.println("-------------------Comparison of Existing & new Element................");

		System.out.println("List of unsegmented part:" + listOfUnsegmentElements);
		System.out.println("List of segmented part:" + listOfSegmentedElements);

		String listOfUnsegmentElementsString = "";

		for (String s : listOfUnsegmentElements) {
			listOfUnsegmentElementsString += s + ", \t";
		}

		writeResult.writeToExcelListOfElements(row7, listOfUnsegmentElementsString);

		String listOfSegmentedElementsString = "";

		for (String s : listOfSegmentedElements) {
			listOfSegmentedElementsString += s + ", \t";
		}

		writeResult.writeToExcelListOfSegmentedElements(row7, listOfSegmentedElementsString);

		if (listOfUnsegmentElements.equals(listOfSegmentedElements) == true) {
			System.out.println("Segmented and Unsegmented element are equal");
			
			String result = "Values are matching. Result:Pass";
			writeResult.writeToExcelActualResult(1, result);
		} else {
			System.out.println("Segmented and Unsegmented element are not equal");
			
			String result = "Values are not matching. result:Fail";
			writeResult.writeToExcelActualResult(1, result);
		}

		
	//	assertEquals(listOfUnsegmentElements, listOfSegmentedElements, "Values are matching");
		
		System.out.println("------------------------------------------------------------------------------------");
	}

	public void segment020() throws EncryptedDocumentException, InterruptedException, IOException {

		segmententity = new ExplorerPage_020_Segment();
		scroll = new ScrollByVisibleElement();
		HomePage hp = new HomePage();
		textbox = new GetTextBoxValue();

		// exceldata = new GetTestData();
		// segmentation =new Segmentation();

		// Select Entity
		Thread.sleep(15000);
		partentity.enterEntityname();
		segmententity.searchEntityname();
		Thread.sleep(2000);
		segmententity.clickEntityname();
		Thread.sleep(2000);
		Screenshots.ScreenCapture();
		// Click on Grid

		WebElement pricingActionMethod = segmententity.pricingActionMethodValue();
		String pricingActionMethodValue = gettext(pricingActionMethod);
		// System.out.println("Value of pricingActionMethod is:"
		// +pricingActionMethodValue);
		existingPricingActionMethodValue = pricingActionMethodValue;
		listOfUnsegmentElements.add(existingPricingActionMethodValue);

		WebElement newPricingActionMethod = segmententity.newPricingActionMethodValue();
		String newPricingActionMethodValue = gettext(newPricingActionMethod);
		// System.out.println("Value of
		// newPricingActionMethodis:"+newPricingActionMethodValue);
		existingnewPricingActionMethodValue = newPricingActionMethodValue;
		listOfUnsegmentElements.add(existingnewPricingActionMethodValue);

		WebElement segmentSalesVolume = segmententity.segmentSalesVolumeValue();
		scroll.ByVisibleElement(segmentSalesVolume);
		String segmentSalesVolumeValue = textbox.getvalue_textbox(segmentSalesVolume);
		// System.out.println("Value of segmentSalesVolume is:"
		// +segmentSalesVolumeValue);
		existingSegmentSalesVolumeValue = segmentSalesVolumeValue;
		listOfUnsegmentElements.add(existingSegmentSalesVolumeValue);

		WebElement segmentPartMinimumPrice = segmententity.segmentPartMinimumPricevalue();
		scroll.ByVisibleElement(segmentPartMinimumPrice);
		String segmentPartMinimumPriceValue = textbox.getvalue_textbox(segmentPartMinimumPrice);
		// System.out.println("Value of segmentPartMinimumPrice is:"
		// +segmentPartMinimumPriceValue);
		existingSegmentPartMinimumPriceValue = segmentPartMinimumPriceValue;
		listOfUnsegmentElements.add(existingSegmentPartMinimumPriceValue);
		Screenshots.ScreenCapture();
		WebElement segmentPartMaximumPrice = segmententity.segmentPartMaximumPriceValue();
		scroll.ByVisibleElement(segmentPartMaximumPrice);
		String segmentPartMaximumPriceValue = textbox.getvalue_textbox(segmentPartMaximumPrice);
		// System.out.println("Value of segmentPartMaximumPrice is:"
		// +segmentPartMaximumPriceValue);
		existingSegmentPartMaximumPriceValue = segmentPartMaximumPriceValue;
		listOfUnsegmentElements.add(existingSegmentPartMaximumPriceValue);
		Screenshots.ScreenCapture();
		WebElement segmentPartMeanPrice = segmententity.segmentPartMeanPriceValue();
		scroll.ByVisibleElement(segmentPartMeanPrice);
		String segmentPartMeanPriceValue = textbox.getvalue_textbox(segmentPartMeanPrice);
		// System.out.println("Value of segmentPartMeanPrice is:"
		// +segmentPartMeanPriceValue);
		existingSegmentPartMeanPriceValue = segmentPartMeanPriceValue;
		listOfUnsegmentElements.add(existingSegmentPartMeanPriceValue);

		WebElement segmentPartStandDeviationPrice = segmententity.segmentPartStandDeviationPriceValue();
		scroll.ByVisibleElement(segmentPartStandDeviationPrice);
		String segmentPartStandDeviationPriceValue = textbox.getvalue_textbox(segmentPartStandDeviationPrice);
		// System.out.println("Value of segmentPartStandDeviationPrice is:"
		// +segmentPartStandDeviationPriceValue);
		existingSegmentPartStandDeviationPriceValue = segmentPartStandDeviationPriceValue;
		listOfUnsegmentElements.add(existingSegmentPartStandDeviationPriceValue);
		Screenshots.ScreenCapture();
		WebElement segmentPartWeightedMeanPrice = segmententity.segmentPartWeightedMeanPriceValue();
		scroll.ByVisibleElement(segmentPartWeightedMeanPrice);
		String segmentPartWeightedMeanPriceValue = textbox.getvalue_textbox(segmentPartWeightedMeanPrice);
		// System.out.println("Value of segmentPartWeightedMeanPrice is:"
		// +segmentPartWeightedMeanPriceValue);
		existingSegmentPartWeightedMeanPriceValue = segmentPartWeightedMeanPriceValue;
		listOfUnsegmentElements.add(existingSegmentPartWeightedMeanPriceValue);

		WebElement cpm = segmententity.cpmValue();
		scroll.ByVisibleElement(cpm);
		String cpmValue = gettext(cpm);
		// System.out.println("Value of cpm is:" + cpmValue);
		existingCpmValue = cpmValue;
		listOfUnsegmentElements.add(existingCpmValue);

		WebElement partsInSegment = segmententity.partsInSegmentValue();
		scroll.ByVisibleElement(partsInSegment);
		String partsInSegmentValue = textbox.getvalue_textbox(partsInSegment);
		// System.out.println("Value of partsInSegment is:" + partsInSegmentValue);
		existingPartsInSegmentValue = partsInSegmentValue;
		listOfUnsegmentElements.add(existingPartsInSegmentValue);
		Screenshots.ScreenCapture();

	}

	public void segment020SegmentedElements() throws EncryptedDocumentException, InterruptedException, IOException {

		segmententity = new ExplorerPage_020_Segment();
		scroll = new ScrollByVisibleElement();
		HomePage hp = new HomePage();
		textbox = new GetTextBoxValue();

		// exceldata = new GetTestData();
		// segmentation =new Segmentation();

		// Select Entity
		segmententity.enterEntityname();
		Thread.sleep(10000);
		segmententity.searchEntityname();
		Thread.sleep(10000);
		segmententity.clickEntityname();

		// Click on Grid
		Screenshots.ScreenCapture();
		WebElement pricingActionMethod = segmententity.pricingActionMethodValue();
		String pricingActionMethodValue = gettext(pricingActionMethod);
		System.out.println("Value of pricingActionMethod is:" + pricingActionMethodValue);
		newPricingActionMethodValue = pricingActionMethodValue;
		listOfSegmentedElements.add(newPricingActionMethodValue);

		WebElement newPricingActionMethod = segmententity.newPricingActionMethodValue();
		String newPricingActionMethodValue = gettext(newPricingActionMethod);
		System.out.println("Value of newPricingActionMethodis:" + newPricingActionMethodValue);
		newNewPricingActionMethodValue = newPricingActionMethodValue;
		listOfSegmentedElements.add(newNewPricingActionMethodValue);

		WebElement segmentSalesVolume = segmententity.segmentSalesVolumeValue();
		scroll.ByVisibleElement(segmentSalesVolume);
		String segmentSalesVolumeValue = textbox.getvalue_textbox(segmentSalesVolume);
		System.out.println("Value of segmentSalesVolume is:" + segmentSalesVolumeValue);
		newSegmentSalesVolumeValue = segmentSalesVolumeValue;
		listOfSegmentedElements.add(newSegmentSalesVolumeValue);

		WebElement segmentPartMinimumPrice = segmententity.segmentPartMinimumPricevalue();
		scroll.ByVisibleElement(segmentPartMinimumPrice);
		String segmentPartMinimumPriceValue = textbox.getvalue_textbox(segmentPartMinimumPrice);
		System.out.println("Value of segmentPartMinimumPrice is:" + segmentPartMinimumPriceValue);
		newSegmentPartMinimumPriceValue = segmentPartMinimumPriceValue;
		listOfSegmentedElements.add(newSegmentPartMinimumPriceValue);
		Screenshots.ScreenCapture();
		WebElement segmentPartMaximumPrice = segmententity.segmentPartMaximumPriceValue();
		scroll.ByVisibleElement(segmentPartMaximumPrice);
		String segmentPartMaximumPriceValue = textbox.getvalue_textbox(segmentPartMaximumPrice);
		System.out.println("Value of segmentPartMaximumPrice is:" + segmentPartMaximumPriceValue);
		newSegmentPartMaximumPriceValue = segmentPartMaximumPriceValue;
		listOfSegmentedElements.add(newSegmentPartMaximumPriceValue);

		WebElement segmentPartMeanPrice = segmententity.segmentPartMeanPriceValue();
		scroll.ByVisibleElement(segmentPartMeanPrice);
		String segmentPartMeanPriceValue = textbox.getvalue_textbox(segmentPartMeanPrice);
		System.out.println("Value of segmentPartMeanPrice is:" + segmentPartMeanPriceValue);
		newSegmentPartMeanPriceValue = segmentPartMeanPriceValue;
		listOfSegmentedElements.add(newSegmentPartMeanPriceValue);

		WebElement segmentPartStandDeviationPrice = segmententity.segmentPartStandDeviationPriceValue();
		scroll.ByVisibleElement(segmentPartStandDeviationPrice);
		String segmentPartStandDeviationPriceValue = textbox.getvalue_textbox(segmentPartStandDeviationPrice);
		System.out.println("Value of segmentPartStandDeviationPrice is:" + segmentPartStandDeviationPriceValue);
		newSegmentPartStandDeviationPriceValue = segmentPartStandDeviationPriceValue;
		listOfSegmentedElements.add(newSegmentPartStandDeviationPriceValue);
		Screenshots.ScreenCapture();
		WebElement segmentPartWeightedMeanPrice = segmententity.segmentPartWeightedMeanPriceValue();
		scroll.ByVisibleElement(segmentPartWeightedMeanPrice);
		String segmentPartWeightedMeanPriceValue = textbox.getvalue_textbox(segmentPartWeightedMeanPrice);
		System.out.println("Value of segmentPartWeightedMeanPrice is:" + segmentPartWeightedMeanPriceValue);
		newSegmentPartWeightedMeanPriceValue = segmentPartWeightedMeanPriceValue;
		listOfSegmentedElements.add(newSegmentPartWeightedMeanPriceValue);

		WebElement cpm = segmententity.cpmValue();
		scroll.ByVisibleElement(cpm);
		String cpmValue = gettext(cpm);
		System.out.println("Value of cpm is:" + cpmValue);
		newCpmValue = cpmValue;
		listOfSegmentedElements.add(newCpmValue);

		WebElement partsInSegment = segmententity.partsInSegmentValue();
		scroll.ByVisibleElement(partsInSegment);
		String partsInSegmentValue = textbox.getvalue_textbox(partsInSegment);
		// System.out.println("Value of partsInSegment is:" + partsInSegmentValue);
		existingPartsInSegmentValue = partsInSegmentValue;
		listOfSegmentedElements.add(existingPartsInSegmentValue);

	}

	public void preSegmentationValue() throws InterruptedException {

		partentity = new ExplorerPage_010_part();
		eccminor = new ExplorerPage_110_ECC_Minor();
		textbox = new GetTextBoxValue();

		ExplorerPage_100_ECC ecc = new ExplorerPage_100_ECC();

		partentity.enterModelname();
		partentity.searcModelname();
		partentity.clickModelname();

		partentity.enterEntityname();
		eccminor.searchEntityname();
		eccminor.clickEntityname();
		Thread.sleep(10000);

		WebElement segmentTypeEccMinor = eccminor.segmentType110_ECC();
		segmentTypeEccMinorValue = gettext(segmentTypeEccMinor);
		System.out.println("Segment Type ECCMinor Value: " + segmentTypeEccMinorValue);

		partentity.enterEntityname();
		partentity.searchEntityname();
		partentity.clickEntityname();

		Thread.sleep(10000);

		WebElement segmentTypePart = partentity.segmentType010PartValue();
		segmentTypePartValue = gettext(segmentTypePart);
		System.out.println("Segment Type Part Value: " + segmentTypePartValue);

		partentity.enterEntityname();
		ecc.searchEntityname();
		ecc.clickEntityname();
		Thread.sleep(10000);

		WebElement segmentTypeEcc = ecc.segmentType100_ECC();
		scroll.ByVisibleElement(segmentTypeEcc);
		segmentTypeEccValue = gettext(segmentTypeEcc);
		System.out.println("segmentTypeEccValue: " + segmentTypeEccValue);
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
