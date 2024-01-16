package org.TestBase;

import static org.testng.Assert.assertEquals;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.baseclass.BaseClass;
import org.openqa.selenium.WebElement;
import org.pageobjects.HomePage;
import org.pageobjects.ModelPermissionPage;
import org.pageobjects.SystemAdministrator;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.utils.Screenshots;


public class ModelPermissionTest extends BaseClass {

    
    Login_TC login = new Login_TC();
    HomePage hp;
    SystemAdministrator sp;
    ModelPermissionPage modelpermission;
    
    @Test
    public void updateModelPermission() throws InterruptedException, IOException {
    
        hp=new HomePage();
        hp.EnterSystemAdministrator();
        sp= new SystemAdministrator();
        modelpermission=new ModelPermissionPage();
        sp.clickModelPermission();
        modelpermission.userRoleDropDown();
        modelpermission.clickJohnRole();
        
        modelpermission.modelDropDown();
        modelpermission.clickJohnRole();
        modelpermission.modelDropDown();
        modelpermission.modelSearchBox();
        modelpermission.clickModel2112();
        
        modelpermission.clickModelDisplayName();
        modelpermission.clickPermissionDropDown();
        modelpermission.clickReadPermission();
        modelpermission.savePermission();
        String message = modelpermission.validationMessageSucessfullySaved().getText();
        
        assertEquals(message, "Succesfully Saved");
        System.out.println("Permission Updated");
        }
    
    @BeforeMethod
    public void loginSpriced() throws EncryptedDocumentException, InterruptedException, IOException {
        
    //    extent.attachReporter(spark);
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