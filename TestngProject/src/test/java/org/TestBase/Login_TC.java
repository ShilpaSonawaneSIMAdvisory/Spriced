package org.TestBase;

import java.io.IOException;
import org.apache.poi.EncryptedDocumentException;
import org.baseclass.BaseClass;
import org.pageobjects.LoginPage;
import org.testng.annotations.Test;
import org.utils.GetTestData;


public class Login_TC extends BaseClass {
    
    
    GetTestData exceldata;
    
@Test
public void loginToSpriced() throws InterruptedException, EncryptedDocumentException, IOException {
    
    exceldata =new GetTestData();
    LoginPage login = new LoginPage();
    //String username= exceldata.getTestData(20, 1);
    
    sendKeys(login.getUserName(), "nirmala");
    //String password= exceldata.getTestData(20, 2);
    
    sendKeys(login.getPassword(), "SIM28Eight#");
    click(login.getLoginBtn());
            
    Thread.sleep(3000);
    
}
}