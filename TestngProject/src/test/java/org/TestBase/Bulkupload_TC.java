package org.TestBase;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.baseclass.BaseClass;
import org.pageobjects.Bulkupload;
import org.pageobjects.HomePage;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import org.utils.GetTestData;


import com.Report.TestListener;
@Listeners(TestListener.class)
public class Bulkupload_TC extends BaseClass {
	

	Login_TC login = new Login_TC();
	HomePage hp;
	Bulkupload bulkupload;
	GetTestData exceldata;

	@Test(priority = 0)
	public void bulkupload() throws InterruptedException, EncryptedDocumentException, IOException {

		hp = new HomePage();
		hp.EnterDataExplorer();
		bulkupload = new Bulkupload();
		exceldata = new GetTestData();
		
		Thread.sleep(3000);

		// Select Model
		bulkupload.enterModelname();
		bulkupload.searcModelname().click();
		String ModelNameFromExcel = exceldata.getTestDataBulkUpload(1, 0);
		System.out.println("Model name :" + ModelNameFromExcel);
		bulkupload.searcModelname().sendKeys(ModelNameFromExcel);
		bulkupload.clickModelname();

		// Select Entity
		bulkupload.enterEntityname();
		bulkupload.searchEntityname();
		bulkupload.searcModelname().click();
		String EntityNameFromExcel = exceldata.getTestDataBulkUpload(1, 1);
		System.out.println("Entity name :" + EntityNameFromExcel);
		bulkupload.searchEntityname().sendKeys(EntityNameFromExcel);
		bulkupload.clickEntityname();

		Thread.sleep(3000);
		bulkupload.bulkUploadButton();

		// Upload excel file

		Thread.sleep(3000);
		String bulkuploadFromExcel = exceldata.getTestDataBulkUpload(2, 0);
		System.out.println("Bulk upload" + bulkuploadFromExcel);
		bulkupload.chooseFile().sendKeys(bulkuploadFromExcel);

		Thread.sleep(3000);
		bulkupload.uploadFile();
		
		System.out.println("File is uploaded successfully");

	}

	@Test(priority = 1)

	public void bulkuploaddownload() throws InterruptedException, EncryptedDocumentException, IOException {

		hp = new HomePage();
		hp.EnterDataExplorer();
		bulkupload = new Bulkupload();
		exceldata = new GetTestData();

		Thread.sleep(3000);
		// Select Model
		bulkupload.enterModelname();
		bulkupload.searcModelname().click();
		String ModelNameFromExcel = exceldata.getTestDataBulkUpload(1, 0);
		System.out.println("Model name :" + ModelNameFromExcel);
		bulkupload.searcModelname().sendKeys(ModelNameFromExcel);
		bulkupload.clickModelname();

		// Select Entity
		bulkupload.enterEntityname();
		bulkupload.searchEntityname();
		bulkupload.searcModelname().click();
		String EntityNameFromExcel = exceldata.getTestDataBulkUpload(1, 1);
		System.out.println("Entity name :" + EntityNameFromExcel);
		bulkupload.searchEntityname().sendKeys(EntityNameFromExcel);
		bulkupload.clickEntityname();
		
		Thread.sleep(3000);

		// Download Excel File
		bulkupload.clickDownload();
		bulkupload.clickDownloadExcelFile();
		Thread.sleep(3000);
		bulkupload.clickConfirmationYes();
		
		System.out.println("File is downloaded successfully");
		

	}

	@Test(priority = 2)

	public void statusView() throws InterruptedException, EncryptedDocumentException, IOException {

		hp = new HomePage();
		hp.EnterDataExplorer();
		bulkupload = new Bulkupload();
		exceldata = new GetTestData();
		
		Thread.sleep(3000);

		// Select Model
		bulkupload.enterModelname();
		bulkupload.searcModelname().click();
		String ModelNameFromExcel = exceldata.getTestDataBulkUpload(1, 0);
		System.out.println("Model name :" + ModelNameFromExcel);
		bulkupload.searcModelname().sendKeys(ModelNameFromExcel);
		bulkupload.clickModelname();

		// Select Entity
		bulkupload.enterEntityname();
		bulkupload.searchEntityname();
		bulkupload.searcModelname().click();
		String EntityNameFromExcel = exceldata.getTestDataBulkUpload(1, 1);
		System.out.println("Model name :" + EntityNameFromExcel);
		bulkupload.searchEntityname().sendKeys(EntityNameFromExcel);
		bulkupload.clickEntityname();

		// click status view
		bulkupload.clickStatus();
		Thread.sleep(3000);
		bulkupload.clickDownloadExcelFromStatus();
		
		System.out.println("File is downloaded successfully from upload status grid");

	}

	@BeforeMethod
	public void loginSpriced() throws EncryptedDocumentException, InterruptedException, IOException {
		launchBrowser();
		login.loginToSpriced();
		// Screenshots.ScreenCapture();

		System.out.println("Test case execution started successfully");

	}

	@BeforeClass
	public void openBrowser() throws EncryptedDocumentException, InterruptedException, IOException {

	}

	@AfterMethod
	/*
	 * public void takeScreenshot(ITestResult result) throws IOException { if
	 * (result.getStatus() == ITestResult.FAILURE) { Screenshots.ScreenCapture();
	 * 
	 * 
	 * 
	 * } }
	 */

	@AfterClass
	public void closeBrowser() {
//		quit();

	}

}