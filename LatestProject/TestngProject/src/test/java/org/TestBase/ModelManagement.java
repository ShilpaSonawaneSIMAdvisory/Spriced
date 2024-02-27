package org.TestBase;

import static org.testng.Assert.assertEquals;

import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.poi.EncryptedDocumentException;
import org.baseclass.BaseClass;
import org.openqa.selenium.WebElement;
import org.pageobjects.HomePage;
import org.pageobjects.ModelManagementPage;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import org.utils.GetTestData;
import org.utils.GetTextBoxValue;
import org.utils.Screenshots;
import org.utils.ScrollByVisibleElement;

import com.Report.TestListener;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

@Listeners(TestListener.class)
public class ModelManagement extends BaseClass{
	ScrollByVisibleElement scroll;
	GetTextBoxValue textbox;
	GetTestData exceldata;
	Login_TC login = new Login_TC();
	ModelManagementPage model=new ModelManagementPage();
	ExtentReports extent = new ExtentReports();
	ExtentSparkReporter spark = new ExtentSparkReporter("Extentreport.html");
	String modelDisplayName;
	
	@Test(priority=0)
	
	public void modelCreation() throws EncryptedDocumentException, IOException, InterruptedException {
		
		ExtentTest test=extent.createTest("Model creation");
		test.log(Status.PASS, "Model creation method executed");
		model=new ModelManagementPage();
		HomePage hp = new HomePage();
		textbox = new GetTextBoxValue();
		hp.EnterSystemAdministrator();
		exceldata = new GetTestData();
		model.modelCreation();
		
		//Model creation		
		
		String modelNameFromExcel=exceldata.getTestDataModel(2,0);
		System.out.println("Model name :"+modelNameFromExcel);
		Date d = new Date();
        System.out.println(d.toString());
        DateFormat dFormat = DateFormat.getDateInstance(DateFormat.SHORT);
        String modelDate=modelNameFromExcel += dFormat.format(d);
        String modelName= modelDate.replaceAll("\\W", "");
        System.out.println("modelName  "+modelName);
		model.modelName().sendKeys(modelName);
		
		String modelDisplayNameFromExcel=exceldata.getTestDataModel(2,1);
		System.out.println("Model display name :"+modelDisplayNameFromExcel);
		Date d1 = new Date();
        System.out.println(d1.toString());
        DateFormat dFormat1 = DateFormat.getDateInstance(DateFormat.SHORT);
        String modelDisplayDate=modelDisplayNameFromExcel += dFormat1.format(d1);
        modelDisplayName= modelDisplayDate.replaceAll("\\W", "");
        System.out.println("modelDisplayName  "+modelDisplayName);
		model.modelDisplayName().sendKeys(modelDisplayName);	
	    
		String descriptionFromExcel=exceldata.getTestDataModel(2,2);
		System.out.println("Model Description name :"+descriptionFromExcel);
		model.description().sendKeys(descriptionFromExcel);
				
		Thread.sleep(3000);
		model.save();
		
		
		String message=model.createdMessage().getText();
		if(message.equals("Model Successfully Created."))
			test.pass("Model Created successfully "+message);
	   	else {
			test.fail("Model creation failed "+message);
		}
			
		assertEquals(message,"Model Successfully Created.", "Model created successfully");
	}
		@Test(priority=1)
		
		public void editModel() throws EncryptedDocumentException, IOException, InterruptedException {
		scroll = new ScrollByVisibleElement();
		ExtentTest test=extent.createTest("Model Edited");
		test.log(Status.PASS, "editModel menthod is executed");
			
		model=new ModelManagementPage();
		HomePage hp = new HomePage();
		textbox = new GetTextBoxValue();
		hp.EnterSystemAdministrator();
		exceldata = new GetTestData();
		
		
		//Editing model
		scroll.ByVisibleElement(model.clickGrid());
		model.clickGrid().click();
		model.edit();
		model.modelDisplayName().clear();
		String changeModelDisplayNameFromExcel=exceldata.getTestDataModel(2,3);
		System.out.println("Changed Model display name"+changeModelDisplayNameFromExcel);
		model.modelDisplayName().sendKeys(changeModelDisplayNameFromExcel);	
		
		Thread.sleep(3000);
		model.save();
		/*model.cancel();
		Screenshots.ScreenCapture();
		model.no();*/
		
		}
		
		@Test(priority=2)
		
		public void deleteModel() throws EncryptedDocumentException, IOException, InterruptedException {
		//ExtentTest test=extent.createTest("deleteModel");
		//test.log(Status.PASS, "deleteModel menthod is executed");
		scroll = new ScrollByVisibleElement();
		model=new ModelManagementPage();
		HomePage hp = new HomePage();
		textbox = new GetTextBoxValue();
		hp.EnterSystemAdministrator();
		exceldata = new GetTestData();
			
		
		//delete model
		scroll.ByVisibleElement(model.clickGrid());
		model.clickGrid().click();
		model.delete();
		Screenshots.ScreenCapture();
		model.confirmdDeleteYes();
		Screenshots.ScreenCapture();
		String message=model.deletedMessage().getText();
		/*if(message.equals("Succesfully Deleted"))
			test.pass("Succesfully Deleted "+message);
	   	else {
			test.fail("Model deletion failed "+message);
		}*/
		
		assertEquals(message,"Succesfully Deleted", "Model Succesfully Deleted");
		
			
	}
        
        @Test(priority=3,enabled=false)
    	
    	public void modelCreationForEntity() throws EncryptedDocumentException, IOException, InterruptedException {
        	//ExtentTest test=extent.createTest("ModelCreationForEntity");
    		//test.log(Status.PASS, "Model created for entity method is executed");
    		model=new ModelManagementPage();
    		HomePage hp = new HomePage();
    		textbox = new GetTextBoxValue();
    		hp.EnterSystemAdministrator();
    		exceldata = new GetTestData();
    		model.modelCreation();
    		
    		//Model creation		
    		
    	    String modelNameFromExcel=exceldata.getTestDataModel(2,0);
    		System.out.println("Model name :"+modelNameFromExcel);
    		Date d = new Date();
            System.out.println(d.toString());
            DateFormat dFormat = DateFormat.getDateInstance(DateFormat.SHORT);
            String modelDate=modelNameFromExcel += dFormat.format(d);
            String result= modelDate.replaceAll("\\W", "");
            System.out.println("modelDate  "+result);
    		model.modelName().sendKeys(result);
    		
    		
    		String modelDisplayNameFromExcel=exceldata.getTestDataModel(2,1);
    		System.out.println("Model display name :"+modelDisplayNameFromExcel);
    		model.modelDisplayName().sendKeys(modelDisplayNameFromExcel);	
    	    
    		String descriptionFromExcel=exceldata.getTestDataModel(2,2);
    		System.out.println("Model Description name :"+descriptionFromExcel);
    		model.description().sendKeys(descriptionFromExcel);
    				
    		Thread.sleep(3000);
    		model.save();
    		String message=model.createdMessage().getText();
    		/*if(message.equals("Model Successfully Created."))
    			test.pass("Model Created successfully "+message);
    	   	else {
    			test.fail("Model creation failed "+message);
    		}*/
    		assertEquals(message,"Model Successfully Created.", "Model created successfully");
    	}    
        
        @BeforeTest
        
        public void beforeTest() {
        	//extent.attachReporter(spark);
        }
        
        @AfterTest
        public void afterTest() {
        	//extent.flush();
        }
        
	
	@BeforeMethod
	public void loginSpriced() throws EncryptedDocumentException, InterruptedException, IOException {
		launchBrowser();
		login.loginToSpriced();
		System.out.println("Test case execution started successfully");
		//extent.attachReporter(spark);


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
