package org.TestBase;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.baseclass.BaseClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
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

public class GlobalSegmentationAllValuePairList extends BaseClass {

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
	
	 @DataProvider(name="DataProvider")
	    public Object[][] getDataFromDataprovider(){
	    return new Object[][] 
	    	{
	            { "328243000", "Part Owner " ,"Information" , "Ready for segmentation", "future sales status code" , "Saleable"},
	            { "432687300RX" , "Part Owner " ,"Information" , "Ready for segmentation", "future sales status code" , "Saleable" },
	           
	        };

	    }
	
	
	 	@Test
	 	public void globalSegmentation() throws InterruptedException {
	 		
	 		
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
			
			partentity.filterBtnOption();
			partentity.ruleFilter();
			partentity.filterDropDown();
			partentity.filterCode();
			//partentity.filterTextBox().click();
			partentity.filterTextBox().sendKeys("Part Number");
			partentity.FilterApply();
			Thread.sleep(10000);
	
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
