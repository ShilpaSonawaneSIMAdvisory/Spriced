package org.TestBase;

import static org.testng.Assert.assertEquals;

import java.io.IOException;
import java.text.DateFormat;
import java.util.Date;

import org.apache.poi.EncryptedDocumentException;
import org.baseclass.BaseClass;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.pageobjects.EntityManagementPage;
import org.pageobjects.HomePage;
import org.pageobjects.ModelManagementPage;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import org.utils.GetTestData;
import org.utils.GetTextBoxValue;
import org.utils.Screenshots;

import com.Report.TestListener;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
@Listeners(TestListener.class)
public class EntityManagement extends BaseClass {
	GetTextBoxValue textbox;
	GetTestData exceldata;
	Login_TC login = new Login_TC();
	EntityManagementPage entity = new EntityManagementPage();
	ModelManagement modelMangement=new ModelManagement();

	@Test(priority = 0)

	public void modelCreation() throws EncryptedDocumentException, IOException, InterruptedException {
		entity = new EntityManagementPage();
		HomePage hp = new HomePage();
		textbox = new GetTextBoxValue();
		hp.EnterSystemAdministrator();
		hp.EntityManagement();
		exceldata = new GetTestData();

		entity.clickModel();
		entity.searchModel();
			
		
		entity.selectModel();

		entity.addEntity();
		
		
		String entityNameFromExcel = exceldata.getTestDataEntity(2, 0);
		System.out.println("Entity name :" + entityNameFromExcel);
		Date d1 = new Date();
        System.out.println(d1.toString());
        DateFormat dFormat1 = DateFormat.getDateInstance(DateFormat.SHORT);
        String entityDate=entityNameFromExcel += dFormat1.format(d1);
        String entityName= entityDate.replaceAll("\\W", "");
        System.out.println("EntityDate  "+entityDate);
		entity.entityName().sendKeys(entityName);

		String entityDisplayNameFromExcel = exceldata.getTestDataEntity(2, 1);
		System.out.println("Entity display name :" + entityDisplayNameFromExcel);
		entity.entityDisplayName().sendKeys(entityDisplayNameFromExcel);

		String entityDescriptionFromExcel = exceldata.getTestDataEntity(2, 2);
		System.out.println("Entity display name :" + entityDescriptionFromExcel);
		entity.entityDescription().sendKeys(entityDescriptionFromExcel);

		// Fixed string datatype

		String attributeNameFromExcel = exceldata.getTestDataEntity(2, 5);
		System.out.println("Attribute name of fixed string datatype :" + attributeNameFromExcel);
		entity.attributeName().clear();
		entity.attributeName().sendKeys(attributeNameFromExcel);

		String attributeDisplayNameFromExcel = exceldata.getTestDataEntity(2, 6);
		System.out.println("Attribute Display name of fixed string datatype :" + attributeDisplayNameFromExcel);
		entity.attributeDisplayName().clear();
		entity.attributeDisplayName().sendKeys(attributeDisplayNameFromExcel);

		String attributeDescriptionFromExcel = exceldata.getTestDataEntity(2, 7);
		entity.attributeDescription().clear();
		System.out.println("Attribute description  of fixed string datatype :" + attributeDescriptionFromExcel);
		entity.attributeDescription().sendKeys(attributeDescriptionFromExcel);
		
        entity.length().click();
		String lengthFromExcel = exceldata.getTestDataEntity(2, 4);
		System.out.println("Attribute length of of fixed string datatype :" + lengthFromExcel);
		entity.length().sendKeys(lengthFromExcel);

		entity.addAttributeOption();

		// Text datatype
		String attributeNameFromExcel1 = exceldata.getTestDataEntity(3, 5);
		System.out.println("Attribute name of Text datatype:" + attributeNameFromExcel1);
		entity.attributeName().clear();
		entity.attributeName().sendKeys(attributeNameFromExcel1);

		String attributeDisplayNameFromExcel1 = exceldata.getTestDataEntity(3, 6);
		System.out.println("Attribute display name of Text datatype:" + attributeDisplayNameFromExcel1);
		entity.attributeDisplayName().clear();
		entity.attributeDisplayName().sendKeys(attributeDisplayNameFromExcel1);

		String attributeDescriptionFromExcel1 = exceldata.getTestDataEntity(3, 7);
		System.out.println("Attribute description  of of Text datatype:" + attributeDescriptionFromExcel1);
		entity.attributeDescription().clear();
		entity.attributeDescription().sendKeys(attributeDescriptionFromExcel1);

		entity.clickDatatype();
		entity.chooseTextDatetype();

		entity.addAttributeOption();

		// Number datatype
		String attributeNameFromExcel2 = exceldata.getTestDataEntity(4, 5);
		System.out.println("Attribute name of Number datatype:" + attributeNameFromExcel2);
		entity.attributeName().clear();
		entity.attributeName().sendKeys(attributeNameFromExcel2);

		String attributeDisplayNameFromExcel2 = exceldata.getTestDataEntity(4, 6);
		System.out.println("Attribute display name of Number datatype:" + attributeDisplayNameFromExcel2);
		entity.attributeDisplayName().clear();
		entity.attributeDisplayName().sendKeys(attributeDisplayNameFromExcel2);

		String attributeDescriptionFromExcel2 = exceldata.getTestDataEntity(4, 7);
		System.out.println("Attribute description  of of Number datatype:" + attributeDescriptionFromExcel2);
		entity.attributeDescription().clear();
		entity.attributeDescription().sendKeys(attributeDescriptionFromExcel2);

		entity.clickDatatype();
		entity.chooseNumberDatatype();
		Thread.sleep(3000);
		entity.clickDecimal().click();
		entity.clickDecimal().clear();
		String attributeDecimalFromExcel2 = exceldata.getTestDataEntity(4, 4);
		System.out.println("Attribute decimal:" + attributeDecimalFromExcel2);
		entity.clickDecimal().sendKeys(attributeDecimalFromExcel2);

		entity.addAttributeOption();

		// Link datatype

		String attributeNameFromExcel3 = exceldata.getTestDataEntity(5, 5);
		System.out.println("Attribute name of Text datatype:" + attributeNameFromExcel3);
		entity.attributeName().clear();
		entity.attributeName().sendKeys(attributeNameFromExcel3);

		String attributeDisplayNameFromExcel3 = exceldata.getTestDataEntity(5, 6);
		System.out.println("Attribute display name of Text datatype:" + attributeDisplayNameFromExcel3);
		entity.attributeDisplayName().clear();
		entity.attributeDisplayName().sendKeys(attributeDisplayNameFromExcel3);

		String attributeDescriptionFromExcel3 = exceldata.getTestDataEntity(5, 7);
		System.out.println("Attribute description  of of Text datatype:" + attributeDescriptionFromExcel3);
		entity.attributeDescription().clear();
		entity.attributeDescription().sendKeys(attributeDescriptionFromExcel3);

		entity.clickDatatype();
		entity.chooseLinkDatatype();

		entity.addAttributeOption();

		// Date Datatype

		String attributeNameFromExcel4 = exceldata.getTestDataEntity(6, 5);
		System.out.println("Attribute name of Text datatype:" + attributeNameFromExcel4);
		entity.attributeName().clear();
		entity.attributeName().sendKeys(attributeNameFromExcel4);

		String attributeDisplayNameFromExcel4 = exceldata.getTestDataEntity(6, 6);
		System.out.println("Attribute display name of Text datatype:" + attributeDisplayNameFromExcel4);
		entity.attributeDisplayName().clear();
		entity.attributeDisplayName().sendKeys(attributeDisplayNameFromExcel4);

		String attributeDescriptionFromExcel4 = exceldata.getTestDataEntity(6, 7);
		System.out.println("Attribute description  of of Text datatype:" + attributeDescriptionFromExcel4);
		entity.attributeDescription().clear();
		entity.attributeDescription().sendKeys(attributeDescriptionFromExcel4);

		entity.clickDatatype();
		entity.chooseTextDatetype();

		entity.addAttributeOption();

		// Boolean Datatype

		String attributeNameFromExcel5 = exceldata.getTestDataEntity(7, 5);
		System.out.println("Attribute name of Text datatype:" + attributeNameFromExcel5);
		entity.attributeName().clear();
		entity.attributeName().sendKeys(attributeNameFromExcel5);

		String attributeDisplayNameFromExcel5 = exceldata.getTestDataEntity(7, 6);
		System.out.println("Attribute display name of Text datatype:" + attributeDisplayNameFromExcel5);
		entity.attributeDisplayName().clear();
		entity.attributeDisplayName().sendKeys(attributeDisplayNameFromExcel5);

		String attributeDescriptionFromExcel5 = exceldata.getTestDataEntity(7, 7);
		System.out.println("Attribute description  of of Text datatype:" + attributeDescriptionFromExcel5);
		entity.attributeDescription().clear();
		entity.attributeDescription().sendKeys(attributeDescriptionFromExcel5);

		entity.clickDatatype();
		entity.chooseBooleanDatatype();

		entity.addAttributeOption();
		
		entity.saveOption();
		
		String message=entity.sucessfullyAddedMessage().getText();
		
		assertEquals(message,"Succesfully Added", "Entity created successfully");
		
		

	}
	@Test(priority=1)
	
	public void editEntity() throws EncryptedDocumentException, IOException, InterruptedException {
					
		entity = new EntityManagementPage();
		HomePage hp = new HomePage();
		textbox = new GetTextBoxValue();
		hp.EnterSystemAdministrator();
		hp.EntityManagement();
		exceldata = new GetTestData();
		
		entity.clickModel();
		entity.searchModel();
		entity.selectModel();
		
		entity.clickGrid();
		
		entity.clickEditOption();
		entity.innerGridClear();
		String attributeNameFromExcel1 = exceldata.getTestDataEntity(8, 5);
		System.out.println("Attribute name of Text datatype:" + attributeNameFromExcel1);
		entity.attributeName().clear();
		entity.attributeName().sendKeys(attributeNameFromExcel1);

		String attributeDisplayNameFromExcel1 = exceldata.getTestDataEntity(8, 6);
		System.out.println("Attribute display name of Text datatype:" + attributeDisplayNameFromExcel1);
		entity.attributeDisplayName().clear();
		entity.attributeDisplayName().sendKeys(attributeDisplayNameFromExcel1);

		String attributeDescriptionFromExcel1 = exceldata.getTestDataEntity(8, 7);
		System.out.println("Attribute description  of of Text datatype:" + attributeDescriptionFromExcel1);
		entity.attributeDescription().clear();
		entity.attributeDescription().sendKeys(attributeDescriptionFromExcel1);
		
		entity.clickDatatype();
		entity.chooseTextDatetype();
		entity.addAttributeOption();
		
		entity.selectInnerGrid();
		entity.clickInnerGridEditOption();
		
		String attributeNameFromExcel2 = exceldata.getTestDataEntity(9, 5);
		System.out.println("Changed Attribute name of Text datatype:" + attributeNameFromExcel2);
		entity.attributeDisplayName().clear();
		entity.attributeDisplayName().sendKeys(attributeNameFromExcel2);
		

		entity.addAttributeOption();
		entity.saveOption();
		
        String message=entity.updatedSucessfullyMessage().getText();
		
		assertEquals(message,"Succesfully Updated", "Entity Updated successfully");
		
	}	
	
	@Test(priority=2)
	
	public void deleteEntity() throws EncryptedDocumentException, IOException, InterruptedException {
		
		entity = new EntityManagementPage();
		HomePage hp = new HomePage();
		textbox = new GetTextBoxValue();
		hp.EnterSystemAdministrator();
		hp.EntityManagement();
		exceldata = new GetTestData();
		entity.clickModel();
		entity.searchModel();
		entity.selectModel();

		entity.clickGrid();
		entity.deleteOption();
		entity.confirmYes();
		
		 String message=entity.deletedSucessfullyMessage().getText();
			
			assertEquals(message,"Succesfully Deleted", "Entity Deleted successfully");
		
		
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
