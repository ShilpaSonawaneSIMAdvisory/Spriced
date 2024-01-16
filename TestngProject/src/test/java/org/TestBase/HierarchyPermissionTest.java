package org.TestBase;

import static org.testng.Assert.assertEquals;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.baseclass.BaseClass;
import org.pageobjects.HierarchyPermissionPage;
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

public class HierarchyPermissionTest extends BaseClass {
    
    
    Login_TC login = new Login_TC();
    HomePage hp;
    SystemAdministrator sp;
    HierarchyPermissionPage hierarchypermission;
    
    @Test
    public void updateModelPermission() throws InterruptedException, IOException {
    
        hp=new HomePage();
        hp.EnterSystemAdministrator();
        sp= new SystemAdministrator();
        hierarchypermission=new HierarchyPermissionPage();
        sp. clickHierarchyPermission();
        hierarchypermission.clickModelDropDown();
        hierarchypermission.modelSearchBox();
        hierarchypermission.clickModel2112();
        hierarchypermission.clickEntityDropDown();
        hierarchypermission.entitySearchBox();
        hierarchypermission.clickShilpaTest12();
        
        hierarchypermission.clickHierarchyDropDown();
        hierarchypermission.hierarchyBasePriceOwner();
        hierarchypermission.clickRoleDrop();
        hierarchypermission.johnUser();
        
        hierarchypermission.root();
        Thread.sleep(5000);
        hierarchypermission.brazilLocal();
        hierarchypermission.readonly();
        
        System.out.println("Hierarchy Permission Updated");
        
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