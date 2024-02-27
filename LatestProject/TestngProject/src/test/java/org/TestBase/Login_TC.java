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
    String username= exceldata.getTestData(20, 1);
    System.out.println("Username:"+username);
    
    
    String password= exceldata.getTestData(20, 2);
    System.out.println("Password"+password);
    
  
  //  click(login.getLoginBtn());
            
    Thread.sleep(3000);
    
    
    
}


}