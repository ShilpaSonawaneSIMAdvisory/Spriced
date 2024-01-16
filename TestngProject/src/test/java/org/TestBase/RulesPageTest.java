package org.TestBase;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.baseclass.BaseClass;
import org.pageobjects.ExplorerPageBasePrice;
import org.pageobjects.ExplorerPageProductPanning;
import org.pageobjects.ExplorerPageSanityCreateRecord;
import org.pageobjects.ExplorerPage_010_part;
import org.pageobjects.ExplorerPage_020_Segment;
import org.pageobjects.ExplorerPage_030_Dn_Pricing;
import org.pageobjects.ExplorerPage_110_ECC_Minor;
import org.pageobjects.HomePage;
import org.pageobjects.RulesPage;
import org.pageobjects.SystemAdministrator;
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

public class RulesPageTest extends BaseClass {
	
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
	RulesPage rulespage;
	SystemAdministrator systemAdmin;
	
	 @Test
	 public void createSimpleRule() {
		 
		 
			partentity = new ExplorerPage_010_part();
			segmententity = new ExplorerPage_020_Segment();
			scroll = new ScrollByVisibleElement();
			HomePage hp = new HomePage();
			textbox = new GetTextBoxValue();
			exceldata = new GetTestData();
			segmentation = new Segmentation();
			preSegmentation = new PreSegmentation();
			rulespage = new RulesPage();
			systemAdmin = new SystemAdministrator();
			hp.EnterSystemAdministrator();
			systemAdmin.EnterRules();
			
		    
		 
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
