package org.TestBase;
import java.util.Date;
import static org.testng.Assert.assertEquals;
import java.io.IOException;
import java.text.DateFormat;
import org.apache.poi.EncryptedDocumentException;
import org.baseclass.BaseClass;
import org.openqa.selenium.WebElement;
import org.pageobjects.DerivedHierarchyAddEditPage;
import org.pageobjects.ExplorerPageBasePrice;
import org.pageobjects.ExplorerPageProductPanning;
import org.pageobjects.ExplorerPageSanityCreateRecord;
import org.pageobjects.ExplorerPage_010_part;
import org.pageobjects.ExplorerPage_020_Segment;
import org.pageobjects.ExplorerPage_030_Dn_Pricing;
import org.pageobjects.ExplorerPage_110_ECC_Minor;
import org.pageobjects.HomePage;
import org.pageobjects.SystemAdministrator;
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
public class DerivedHierarchyAddEditPageTest extends BaseClass {
	
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
			SystemAdministrator systemadmin;
			DerivedHierarchyAddEditPage derivedhierarchy;
			
			
	
	@Test
	public void updatePart() throws InterruptedException, IOException {
		
		
		HomePage hp = new HomePage();
		hp.EnterSystemAdministrator();
		systemadmin = new SystemAdministrator();
		systemadmin.clickDerivedHierarchy();
		derivedhierarchy= new DerivedHierarchyAddEditPage();
		derivedhierarchy.clickAddEditBtn();
		
		derivedhierarchy.selectModel();
		derivedhierarchy.searchModel();
		derivedhierarchy.clickModel();
		
		derivedhierarchy.selectEntity();
		derivedhierarchy.searchEntity();
		derivedhierarchy.clickEntity();
		String name ="Base Price Owner";
		Date d = new Date();
        System.out.println(d.toString());
        DateFormat dFormat = DateFormat.getDateInstance(DateFormat.SHORT);
        String derivedhierarchyName =name += dFormat.format(d);
        String result= derivedhierarchyName.replaceAll("\\W", "");
      
		
		derivedhierarchy.addName().sendKeys(result);
		
		derivedhierarchy.addDescription().sendKeys("Base Price Owner");
		Thread.sleep(5000);
		derivedhierarchy.AddBtnPartOwner();
		
		derivedhierarchy.saveBtn();
		
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