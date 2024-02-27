package org.TestBase;

import static org.testng.Assert.assertEquals;

import java.io.IOException;

import org.apache.hc.client5.http.cookie.CommonCookieAttributeHandler;
import org.apache.poi.EncryptedDocumentException;
import org.baseclass.BaseClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.pageobjects.ExplorerPageCommonElements;
import org.pageobjects.ExplorerPage_010_part;
import org.pageobjects.ExplorerPage_030_Dn_Pricing;
import org.pageobjects.ExplorerPage_070_Local_Segment;
import org.pageobjects.ExplorerPagexPricingAdminOwner;
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

public class DNPricingSetApprovals extends BaseClass {
		
		ScrollByVisibleElement scroll;
		GetTextBoxValue textbox;
		GetTestData exceldata;
		Login_TC login = new Login_TC();
		ExplorerPage_030_Dn_Pricing dnpricing;
		writeBack writeResult = new writeBack();
		WebDriver driver;
		String partNumberFromExcel;
		ExplorerPageCommonElements explorerCommonElements;
		ExplorerPage_010_part partentity;
		ExplorerPagexPricingAdminOwner xPricingAdminOwner;
		String result;
		

		@Test
		public void DnPricingSetPricing() throws EncryptedDocumentException, IOException, InterruptedException {

			dnpricing = new ExplorerPage_030_Dn_Pricing();
			scroll = new ScrollByVisibleElement();
			HomePage hp = new HomePage();
			textbox = new GetTextBoxValue();
			hp.EnterDataExplorer();
			exceldata = new GetTestData();
			textbox=new GetTextBoxValue();
			xPricingAdminOwner = new ExplorerPagexPricingAdminOwner();
			 
			hp= new HomePage();
			hp.EnterDataExplorer();
			Thread.sleep(20000);
			exceldata =new GetTestData();
			explorerCommonElements = new ExplorerPageCommonElements();
			
			partentity= new ExplorerPage_010_part();
			partentity.enterModelname();
			partentity.searcModelname();
			partentity.clickModelname();

			Thread.sleep(10000);
			dnpricing.enterEntityname();
			dnpricing.searchEntityname();
			dnpricing.clickEntityname();
			
			partNumberFromExcel=exceldata.getTestDataDnPricingSetApproval(1, 0);
			dnpricing.filterBtn();
			dnpricing.ruleFilter();
			dnpricing.clickDropdown();
			dnpricing.filterDropDownSearch();
			dnpricing.partNumberFilter();
			dnpricing.filterTextBox().sendKeys(partNumberFromExcel);
			dnpricing.FilterApply();
			

			String partOwner = dnpricing.partOwner().getText();
			System.out.println("partOwnerValue:"+partOwner);
			
			String futurepriceValue = dnpricing.futurePrice().getText();
			System.out.println("futurepriceValue:"+futurepriceValue);
			double futurepriceValueNumeric = Integer.parseInt(futurepriceValue);
			
			String annualVolume = dnpricing.annualVolumeValue().getText();
			System.out.println("futureEffectiveDateValue:"+annualVolume);
			double annualVolumeNumeric = Integer.parseInt(annualVolume);
			
			String futureEffectiveDateValue = dnpricing.futureEffectiveDateValue().getText();
			System.out.println("futureEffectiveDateValue:"+futureEffectiveDateValue);
			
			String brandValue = dnpricing.brandValue().getText();
			System.out.println("brandValue:"+brandValue);
			
			String swapp = dnpricing.swappValue().getText();
			System.out.println("swapp:"+swapp);
			
			String previousPartPrice = dnpricing.previousPartPrice().getText();
			System.out.println("futurepriceValue:"+previousPartPrice);
			double previousPartPriceNumeric = Integer.parseInt(previousPartPrice);
			
			String pricingActionValue = dnpricing.pricingActionValue().getText();
			System.out.println("futurepriceValue:"+pricingActionValue);
			
			String changeReasonValue = dnpricing.changeReasonValue().getText();
			System.out.println("futurepriceValue:"+changeReasonValue);
			
			String publishPriceValue = dnpricing.publishPrice().getText();
			System.out.println("futurepriceValue:"+publishPriceValue);
			double publishPriceValueNumeric = Integer.parseInt(publishPriceValue);
			
			String currentPriceValue = dnpricing.currentPrice().getText();
			System.out.println("currentPriceValue:"+currentPriceValue);
			double currentPriceValueNumeric = Integer.parseInt(currentPriceValue);
			
			String globalImpactValue = dnpricing.globalImpact().getText();
			System.out.println("currentPriceValue:"+globalImpactValue);
			double globalImpactValueNumeric = Integer.parseInt(globalImpactValue);
			
			String globalTotalImpact = dnpricing.globalTotalImpact().getText();
			System.out.println("currentPriceValue:"+globalTotalImpact);
			double globalTotalImpactNumeric = Integer.parseInt(globalTotalImpact);
			
			
			Thread.sleep(10000);
			partentity.enterEntityname();
			xPricingAdminOwner.searchEntity();
			explorerCommonElements.selectElement();
			
			String cpmLeadThresholdValue = xPricingAdminOwner.cpmLeadThreshold().getText();
			System.out.println("cpmLeadThresholdValue:"+cpmLeadThresholdValue);
			double cpmLeadThresholdValueNumeric = Integer.parseInt(cpmLeadThresholdValue);
			
			String dirOfPM1Threshold = xPricingAdminOwner.dirOfPM1Threshold().getText();
			System.out.println("dirOfPM1Threshold:"+dirOfPM1Threshold);
			double dirOfPM1ThresholdNumeric = Integer.parseInt(dirOfPM1Threshold);
		
			String dirOfPM2Threshold = xPricingAdminOwner.dirOfPM2Threshold().getText();
			System.out.println("cpmLeadThresholdValue:"+dirOfPM2Threshold);
			double dirOfPM2ThresholdNumeric = Integer.parseInt(dirOfPM2Threshold);
			
			String execDirectorThreshold = xPricingAdminOwner.execDirectorThreshold().getText();
			System.out.println("execDirectorThreshold:"+execDirectorThreshold);
			double execDirectorThresholdNumeric = Integer.parseInt(execDirectorThreshold);
			
			if(!futurepriceValue.isEmpty() && !futureEffectiveDateValue.isEmpty() && !swapp.equalsIgnoreCase("swapp") ) {
				
				//Pricing Mgr Approval

				if(pricingActionValue.equals("Emergency") || pricingActionValue.equals("Reprice") ) { //validate whether pricing action value = Ready for review
					
					String pricingManagerApproval = dnpricing.pricingManagerApproval().getText();
					System.out.println("brandValue:"+pricingManagerApproval);
					
					if(pricingManagerApproval.equals("Ready for Review")) {
					result ="Pass";
					System.out.println("Validation pass");
					}
					else {
						
						result ="Fail";	
					}
						
				}
				
				else if(changeReasonValue.equals("Swapp entry") || changeReasonValue.equals("Swapp exit") ) {
					
					String pricingManagerApproval = dnpricing.pricingManagerApproval().getText();
					if(pricingManagerApproval.equals("Auto")) {
						result ="Pass";
						System.out.println("Validation pass");
						}
						else {
							
							result ="Fail";	
						}
				}else if(pricingActionValue.equals("none") && !publishPriceValue.isEmpty()) {
					
					String pricingManagerApproval = dnpricing.pricingManagerApproval().getText();
					if(pricingManagerApproval.isEmpty()) {
						result ="Pass";
						System.out.println("Validation pass");
						}
						else {
							
							result ="Fail";	
						}

					
					
				}else if(pricingActionValue.equals("none") && !currentPriceValue.isEmpty()) {
					
					String pricingManagerApproval = dnpricing.pricingManagerApproval().getText();
					if(pricingManagerApproval.isEmpty()) {
						result ="Pass";
						System.out.println("Validation pass");
						}
						else {
							
							result ="Fail";	
						}
				}else {
					
					String pricingManagerApproval = dnpricing.pricingManagerApproval().getText();
					if(pricingManagerApproval.equals("Auto")) {
						result ="Pass";
						System.out.println("Validation pass");
						}
						else {
							
							result ="Fail";	
						}
					
				}
				
				//CPM Lead Approval 
				//If Change Reason in DN PRicing is either ‘SWAPP Entry' or 'SWAPP Exit’, then Auto
				
				if(changeReasonValue.equals("SWAPP Entry") || (changeReasonValue.equals("SWAPP Exit"))){
					
					String cpmLeadApproval = dnpricing.cpmLeadApprovalField().getText();
					if(cpmLeadApproval.equals("Auto")) {
						result ="Pass";
						System.out.println("Validation pass");
						}
						else {
							
							result ="Fail";	
						}
					
					
				}
				
				//If Pricing Action in DN PRicing is equal to 'Reprice’, then Auto
				if(pricingActionValue.equals("Reprice")){
					
					String cpmLeadApproval = dnpricing.cpmLeadApprovalField().getText();
					if(cpmLeadApproval.equals("Ready For Review")) {
						result ="Pass";
						System.out.println("Validation pass");
						}
						else {
							
							result ="Fail";	
						}
					
				}
				//If Pricing Action = None and Publish Price/Current Price is NULL and 
				//Global Impact >=CPM Lead Threshold (from xPRicing Admin Owner Entity) Then Ready for Review.
				
				else if(pricingActionValue.equals("None") && !publishPriceValue.isEmpty() && globalImpactValueNumeric >= cpmLeadThresholdValueNumeric) {
					
					String cpmLeadApproval = dnpricing.cpmLeadApprovalField().getText();
					if(cpmLeadApproval.equals("Ready For Review")) {
						result ="Pass";
						System.out.println("Validation pass");
						}
						else {
							
							result ="Fail";	
						}
					
				}
				
				else if(pricingActionValue.equals("None") && !currentPriceValue.isEmpty() && globalImpactValueNumeric >= cpmLeadThresholdValueNumeric) {
					
					String cpmLeadApproval = dnpricing.cpmLeadApprovalField().getText();
					if(cpmLeadApproval.equals("Ready For Review")) {
						result ="Pass";
						System.out.println("Validation pass");
						}
						else {
							
							result ="Fail";	
						}
				}


				//If Pricing Action = Emergency, then Ready for Review.
				
				else if(pricingActionValue.equals("Emergency")) {
					
					String cpmLeadApproval = dnpricing.cpmLeadApprovalField().getText();
					if(cpmLeadApproval.equals("Ready For Review")) {
						result ="Pass";
						System.out.println("Validation pass");
						}
						else {
							
							result ="Fail";	
						}
				}

				//If Pricing Action in DN PRicing is equal to None and Publish Price/Current Price is not Null, then Null
				
				else if(pricingActionValue.equals("None") && !publishPriceValue.isEmpty()) {
					
					String cpmLeadApproval = dnpricing.cpmLeadApprovalField().getText();
					if(cpmLeadApproval.isEmpty()) {
						result ="Pass";
						System.out.println("Validation pass");
						}
						else {
							
							result ="Fail";	
						}
				}
				
				//If Pricing Action is not equal to None and Global Impact >=CPM Lead Threshold (from xPRicing Admin Owner Entity), then Ready for Review.

				else if(!pricingActionValue.equals("None") && globalImpactValueNumeric >= cpmLeadThresholdValueNumeric) {
					
					String cpmLeadApproval = dnpricing.cpmLeadApprovalField().getText();
					if(cpmLeadApproval.equals("Ready For Review")) {
						result ="Pass";
						System.out.println("Validation pass");
						}
						else {
							
							result ="Fail";	
						}
				}
				else{

					String cpmLeadApproval = dnpricing.cpmLeadApprovalField().getText();
					if(cpmLeadApproval.equals("Auto")) {
						result ="Pass";
						System.out.println("Validation pass");
						}
						else {
							
							result ="Fail";	
						}
					
				}
				
				
				//Dir of PM1 Approval

				//If Change Reason in DN PRicing is either ‘SWAPP Entry' or 'SWAPP Exit’, then Auto
				
				if(changeReasonValue.equals("Swapp entry") || changeReasonValue.equals("Swapp exit") ) {
					
					String dirOfPM1Approval = dnpricing.dirOfPM1Approval().getText();
					if(dirOfPM1Approval.equals("Auto")) {
						result ="Pass";
						System.out.println("Validation pass");
						}
						else {
							
							result ="Fail";	
						}
				}

				//If Pricing Action in DN PRicing is equal to 'Reprice’, then Auto
				
				else if(pricingActionValue.equals("Reprice")){
					
					String dirOfPM1Approval = dnpricing.dirOfPM1Approval().getText();
					if(dirOfPM1Approval.equals("Auto")) {
						result ="Pass";
						System.out.println("Validation pass");
						}
						else {
							
							result ="Fail";	
						}
					
				}

				//If Pricing Action = None and Publish Price/Current Price is NULL and 
				//Global Impact >=Dir PM1 Threshold (from xPRicing Admin Owner Entity) Then Ready for Review.
				
				else if(pricingActionValue.equals("None") && !publishPriceValue.isEmpty() && globalImpactValueNumeric >= dirOfPM1ThresholdNumeric) {
					
					String dirOfPM1Approval = dnpricing.dirOfPM1Approval().getText();
					if(dirOfPM1Approval.equals("Ready For Review")) {
						result ="Pass";
						System.out.println("Validation pass");
						}
						else {
							
							result ="Fail";	
						}
				}
				
				else if(pricingActionValue.equals("None") && !currentPriceValue.isEmpty() && globalImpactValueNumeric >= dirOfPM1ThresholdNumeric) {
					
					String dirOfPM1Approval = dnpricing.dirOfPM1Approval().getText();
					if(dirOfPM1Approval.equals("Ready For Review")) {
						result ="Pass";
						System.out.println("Validation pass");
						}
						else {
							
							result ="Fail";	
						}
				}

				//If Pricing Action = Emergency, then Ready for Review.
				
				else if(pricingActionValue.equals("Emergency")) {
					
					String dirOfPM1Approval = dnpricing.dirOfPM1Approval().getText();
					if(dirOfPM1Approval.equals("Ready For Review")) {
						result ="Pass";
						System.out.println("Validation pass");
						}
						else {
							
							result ="Fail";	
						}
				}

				//If Pricing Action in DN PRicing is equal to None and Publish Price/Current Price is not Null, then Null
				
				else if(pricingActionValue.equals("None") && !publishPriceValue.isEmpty()) {
					
					String dirOfPM1Approval = dnpricing.dirOfPM1Approval().getText();
					if(dirOfPM1Approval.isEmpty()) {
						result ="Pass";
						System.out.println("Validation pass");
						}
						else {
							
							result ="Fail";	
						}
				}
				
				else if(pricingActionValue.equals("None") && !currentPriceValue.isEmpty()) {
					
					String dirOfPM1Approval = dnpricing.dirOfPM1Approval().getText();
					if(dirOfPM1Approval.isEmpty()) {
						result ="Pass";
						System.out.println("Validation pass");
						}
						else {
							
							result ="Fail";	
						}
				}

				//If Pricing Action is not equal to None and Global Impact >=Dir PM1 Threshold (from xPRicing Admin Owner Entity), then Ready for Review.

				else if(pricingActionValue.equals("None") && globalImpactValueNumeric >= dirOfPM1ThresholdNumeric) {
					
					String dirOfPM1Approval = dnpricing.dirOfPM1Approval().getText();
					if(dirOfPM1Approval.equals("Ready For Review")) {
						result ="Pass";
						System.out.println("Validation pass");
						}
						else {
							
							result ="Fail";	
						}
				}
				//ELSE Auto.
				else {
					
					String dirOfPM1Approval = dnpricing.dirOfPM1Approval().getText();
					if(dirOfPM1Approval.equals("Auto")) {
						result ="Pass";
						System.out.println("Validation pass");
						}
						else {
							
							result ="Fail";	
						}
					
				}
				
				//Dir of PM2 Approval

				//If Change Reason in DN PRicing is either ‘SWAPP Entry' or 'SWAPP Exit’, then Auto
				if(changeReasonValue.equals("Swapp entry") || changeReasonValue.equals("Swapp exit") ) {
					
					String dirOfPM2Approval = dnpricing.dirOfPM2Approval().getText();
					if(dirOfPM2Approval.equals("Auto")) {
						result ="Pass";
						System.out.println("Validation pass");
						}
						else {
							
							result ="Fail";	
						}
					
				}

				//If Pricing Action in DN PRicing is equal to 'Reprice’, then Auto
				else if(pricingActionValue.equals("Reprice")) {
					
					String dirOfPM2Approval = dnpricing.dirOfPM2Approval().getText();
					if(dirOfPM2Approval.equals("Auto")) {
						result ="Pass";
						System.out.println("Validation pass");
						}
						else {
							
							result ="Fail";	
						}
					
				}

				//If Pricing Action in DN PRicing is equal to None and Publish Price/Current Price is not Null, then Null
				
				else if(pricingActionValue.equals("None") && !publishPriceValue.isEmpty()) {
					
					String dirOfPM2Approval = dnpricing.dirOfPM2Approval().getText();
					if(dirOfPM2Approval.isEmpty()) {
						result ="Pass";
						System.out.println("Validation pass");
						}
						else {
							
							result ="Fail";	
						}
				}
				
				else if(pricingActionValue.equals("None") && !currentPriceValue.isEmpty()) {
					
					String dirOfPM2Approval = dnpricing.dirOfPM2Approval().getText();
					if(dirOfPM2Approval.isEmpty()) {
						result ="Pass";
						System.out.println("Validation pass");
						}
						else {
							
							result ="Fail";	
						}
				}

				//IF GlobalImpact> Dir PM2 Threshold (from xPRicing Admin Owner Entity), then Ready for Review.
				
				else if(globalImpactValueNumeric > dirOfPM2ThresholdNumeric) {
					
					String dirOfPM2Approval = dnpricing.dirOfPM2Approval().getText();
					if(dirOfPM2Approval.equals("Ready For Review")) {
						result ="Pass";
						System.out.println("Validation pass");
						}
						else {
							
							result ="Fail";	
						}

					
				}

				//ELSE Auto
				else {
					String dirOfPM2Approval = dnpricing.dirOfPM2Approval().getText();
					if(dirOfPM2Approval.equals("Auto")) {
						result ="Pass";
						System.out.println("Validation pass");
						}
						else {
							
							result ="Fail";	
						}
				}
				
				//Exec Director Approval

				//If Change Reason in DN PRicing is either ‘SWAPP Entry' or 'SWAPP Exit’, then Auto
				
				if(changeReasonValue.equals("Swapp entry") || changeReasonValue.equals("Swapp exit") ) {
					
					String execDirApproval = dnpricing.execDirApproval().getText();
					if(execDirApproval.equals("Auto")) {
						result ="Pass";
						System.out.println("Validation pass");
						}
						else {
							
							result ="Fail";	
						}
				}

				//If Pricing Action in DN PRicing is equal to 'Reprice’, then Auto
				else if(pricingActionValue.equals("Reprice")) {
					
					String execDirApproval = dnpricing.execDirApproval().getText();
					if(execDirApproval.equals("Auto")) {
						result ="Pass";
						System.out.println("Validation pass");
						}
						else {
							
							result ="Fail";	
						}
					
				}

				//If Pricing Action in DN PRicing is equal to None and Publish Price/Current Price is not Null, then Null
				
				else if(pricingActionValue.equals("None") && !publishPriceValue.isEmpty()) {
					
					String execDirApproval = dnpricing.execDirApproval().getText();
					if(!execDirApproval.isEmpty()) {
						result ="Pass";
						System.out.println("Validation pass");
						}
						else {
							
							result ="Fail";	
						}
				}
				
				else if(pricingActionValue.equals("None") && !currentPriceValue.isEmpty()) {
					
					String execDirApproval = dnpricing.execDirApproval().getText();
					if(!execDirApproval.isEmpty()) {
						result ="Pass";
						System.out.println("Validation pass");
						}
						else {
							
							result ="Fail";	
						}
				}

				//IF Global Impact> Exec Director Threshold (from xPRicing Admin Owner Entity), then Ready for Review.
				
				else if(globalImpactValueNumeric > execDirectorThresholdNumeric) {
					
					String execDirApproval = dnpricing.execDirApproval().getText();
					if(execDirApproval.equals("Ready For Review")) {
						result ="Pass";
						System.out.println("Validation pass");
						}
						else {
							
							result ="Fail";	
						}
				}

				else {
					
					String execDirApproval = dnpricing.execDirApproval().getText();
					if(execDirApproval.equals("Auto")) {
						result ="Pass";
						System.out.println("Validation pass");
						}
						else {
							
							result ="Fail";	
						}
				}
				
				
				//Core Mgr Approval

				//If Brand = ‘Core’ and Part Owner is not equal to ‘India Local’, then Ready for Review
				
				if(brandValue.equals("Core") && !partOwner.equals("India Local")) {
					
					String coreManagerApproval = dnpricing.coreManagerApproval().getText();
					if(coreManagerApproval.equals("Ready for Review")) {
						result ="Pass";
						System.out.println("Validation pass");
						}
						else {
							
							result ="Fail";	
						}
					
				}

				//Approval Reason -

				//If Swapp = Swapp, then Auto
				
				else if(swapp.equalsIgnoreCase("Swapp")) {
					
					String coreManagerApproval = dnpricing.coreManagerApproval().getText();
					if(coreManagerApproval.equals("Auto")) {
						result ="Pass";
						System.out.println("Validation pass");
						}
						else {
							
							result ="Fail";	
						}
					
				}
				
				

				//If Pricing Action = Emergency, then Emergency
				
				else if(pricingActionValue.equals("Emergency")) {
					
					String coreManagerApproval = dnpricing.coreManagerApproval().getText();
					if(coreManagerApproval.equals("Emergency")) {
						result ="Pass";
						System.out.println("Validation pass");
						}
						else {
							
							result ="Fail";	
						}
				}

				//If Pricing Action = Reprice, then 'Reprice Prior to Saleability
				else if(pricingActionValue.equals("Reprice")) {
					
					
				}


				//If GlobalImpact> CPM Lead Threshold, then Exceeded Threshold
				
				if(globalImpactValueNumeric > cpmLeadThresholdValueNumeric) {
					
					System.out.println("Exceeded Threshold");
				}
				else {
					
					String coreManagerApproval = dnpricing.coreManagerApproval().getText();
					if(coreManagerApproval.isEmpty()) {
						result ="Pass";
						System.out.println("Validation pass");
						}
						else {
							
							result ="Fail";	
						}
				}
				
				double substractionOfFuturePriceAndPublishPrice = futurepriceValueNumeric - publishPriceValueNumeric;
				double substractionOfFuturePriceAndCurrenthPrice = futurepriceValueNumeric - currentPriceValueNumeric;
				double substractionOfFuturePriceAndPreviousPartPrice = futurepriceValueNumeric - previousPartPriceNumeric;
				//Global Impact = Annual Volume * Absolute (Future Price - Publish Price/Current Price/Previous Part Price)
				
				globalImpactValueNumeric = annualVolumeNumeric * substractionOfFuturePriceAndPublishPrice ;
				globalImpactValueNumeric = annualVolumeNumeric * substractionOfFuturePriceAndCurrenthPrice;
				globalImpactValueNumeric = annualVolumeNumeric * substractionOfFuturePriceAndPreviousPartPrice;

				//Global Total Impact = Annual Volume * (Future Price - Publish Price/Current Price/Previous Part Price)

				globalTotalImpactNumeric = annualVolumeNumeric* substractionOfFuturePriceAndPublishPrice;
				globalTotalImpactNumeric = annualVolumeNumeric* substractionOfFuturePriceAndCurrenthPrice;
				globalTotalImpactNumeric = annualVolumeNumeric * substractionOfFuturePriceAndPreviousPartPrice;
			}
			
		
			
}
}