package org.TestBase;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;

import org.apache.poi.EncryptedDocumentException;
import org.baseclass.BaseClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.pageobjects.ExplorerPageCommonElements;
import org.pageobjects.ExplorerPageCostRangeMultiplier;
import org.pageobjects.ExplorerPage_010_part;
import org.pageobjects.ExplorerPage_020_Segment;
import org.pageobjects.ExplorerPage_030_Dn_Pricing;
import org.pageobjects.ExplorerPage_110_ECC_Minor;
import org.pageobjects.ExplorerPagelocalxRefMultiplier;
import org.pageobjects.HomePage;
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

public class DnPricingCalcualtePrice extends BaseClass {
	
	
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
	ExplorerPage_030_Dn_Pricing dnpricing;
	ExplorerPageCommonElements explorerCommonElements;
	ExplorerPagelocalxRefMultiplier localxRefMultiplier;
	ExplorerPageCostRangeMultiplier costRangeMultiplier;
	
	
	
	@Test
	public void DnPricingCalcualtePrice() throws EncryptedDocumentException, IOException, InterruptedException, ParseException {
		
		costRangeMultiplier = new ExplorerPageCostRangeMultiplier();
		partentity = new ExplorerPage_010_part();
		segmententity = new ExplorerPage_020_Segment();
		scroll = new ScrollByVisibleElement();
		HomePage hp = new HomePage();
		textbox = new GetTextBoxValue();
		hp.EnterDataExplorer();
		exceldata = new GetTestData();
		segmentation = new Segmentation();
		dnpricing = new ExplorerPage_030_Dn_Pricing();
		explorerCommonElements = new ExplorerPageCommonElements();
		localxRefMultiplier = new ExplorerPagelocalxRefMultiplier();

		hp.EnterDataExplorer();
		dnpricing.enterModelname();
		dnpricing.searcModelname();
		dnpricing.clickModelname();
		
		//Select DN pricing entity
		dnpricing.enterEntityname();
		dnpricing.searchEntityname();
		dnpricing.clickEntityname();
		
		String partNumberFromExcel=exceldata.getTestDataDnPricingAction(1, 0);  //need to add excel file code
		dnpricing.filterBtn();
		dnpricing.ruleFilter();
		dnpricing.clickDropdown();
		dnpricing.filterDropDownSearch();
		dnpricing.partNumberFilter();
		dnpricing.filterTextBox().sendKeys(partNumberFromExcel);
		dnpricing.FilterApply();
		
		Thread.sleep(10000);
		
		WebElement currentPrice = dnpricing.currentPrice();  // current price from DN pricing entity
		scroll.ByVisibleElement(currentPrice);
		String currentPriceValue = gettext(currentPrice);
		System.out.println("Value of partOwner from UI is:" + currentPriceValue);
		double currentPriceValueNumeric = Integer.parseInt(currentPriceValue);
		
		WebElement publishPrice = dnpricing.publishPrice();  // publish price from DN pricing entity
		scroll.ByVisibleElement(publishPrice);
		String publishPriceValue = gettext(publishPrice);
		System.out.println("Value of partOwner from UI is:" + publishPriceValue);
		double publishPriceValueNumeric = Integer.parseInt(publishPriceValue);
		
		WebElement futurePrice = dnpricing.futurePrice();  // future price from DN pricing entity
		scroll.ByVisibleElement(futurePrice);
		String futurePriceValue = gettext(futurePrice);
		System.out.println("Value of partOwner from UI is:" + futurePriceValue);
		double futurePriceValueNumeric = Integer.parseInt(futurePriceValue);
		
		WebElement calculatedPrice = dnpricing.calculatedPrice();  // calculated price from DN pricing entity
		scroll.ByVisibleElement(futurePrice);
		String calculatedPriceValue = gettext(calculatedPrice);
		double calculatedPriceNumeric = Integer.parseInt(calculatedPriceValue);
		System.out.println("Value of partOwner from UI is:" + calculatedPriceValue);
		
		WebElement swapp = dnpricing.swappValue();   // Swapp from DN pricing entity
		String swappValue = gettext(swapp);
		System.out.println("Value of partOwner from UI is:" + swappValue);
		
		WebElement futureEffective = dnpricing.futureEffectiveDateValue();  //Future effective date from DN pricing entity
		String futureEffectiveDateValue = gettext(futureEffective);
		System.out.println("Value of partOwner from UI is:" + futureEffectiveDateValue);
		
		
		dnpricing.enterEntityname();
		costRangeMultiplier.searchCostRangeMultiplier();
		explorerCommonElements.selectElement();
		
		WebElement code = costRangeMultiplier.code();  //Future effective date from DN pricing entity
		String codeValue = gettext(code);
		System.out.println("Value of partOwner from UI is:" + codeValue);
		double codeValueNumeric = Integer.parseInt(codeValue);
		
		WebElement multiplier = costRangeMultiplier.multiplier();  //Future effective date from DN pricing entity
		String multiplierValue = gettext(multiplier);
		System.out.println("Value of partOwner from UI is:" + multiplierValue);
		double multiplierValueNumeric = Integer.parseInt(multiplierValue);
		
		
		SimpleDateFormat df = new SimpleDateFormat("MM/dd/yyyy"); 
		Date futureEffectiveDate = df.parse(futureEffectiveDateValue);
		
		
		
		Date today = new Date();                      
		System.out.println("Today Date is"+today);
		  
		   if(today.compareTo(futureEffectiveDate)>0) {
			   
			   if(!currentPriceValue.isEmpty()) {
				   
				   segmententity.enterEntityname();
				   segmententity.searchEntityname();
				   segmententity.clickEntityname();
				   
				   	WebElement pricingActionMethod = segmententity.pricingActionMethodValue();	//pricing action method from segment entity
				   	String pricingActionMethodValue =  pricingActionMethod.getText();
					pricingActionMethod.click();
					explorerCommonElements.search().sendKeys("1.0");            
					String pricingActionMethod1 = explorerCommonElements.getElement().getText();  //pricing action method 1.0 value from segment entity
					
					WebElement pricingActionValueElement = segmententity.pricingActionValue();	//pricing action method from segment entity
				   	String pricingActionValue =  pricingActionValueElement.getText();
				   	double pricingActionValueNumeric = Integer.parseInt(pricingActionValue);
				   	
				   	WebElement pricingActionIncreaselimit = segmententity.pricingActionIncreaselimit();	//pricing action increase limit from segment entity
				   	String pricingActionIncreaselimitValue =  pricingActionIncreaselimit.getText();
				   	double pricingActionIncreaselimitNumeric = Integer.parseInt(pricingActionIncreaselimitValue);
				   	
				  	WebElement pricingActionDecreaselimit = segmententity.pricingActionIncreaselimit();	//pricing action decrease limit from segment entity
				   	String pricingActionDecreaselimitValue =  pricingActionDecreaselimit.getText();
				   	double pricingActionDecreaselimitValueNumeric = Integer.parseInt(pricingActionDecreaselimitValue);
				   	
					explorerCommonElements.search().clear();
					explorerCommonElements.search().sendKeys("2.0");
					String pricingActionMethod2 = explorerCommonElements.getElement().getText();  //pricing action method 2.0 value from segment entity
					
					explorerCommonElements.search().clear();
					explorerCommonElements.search().sendKeys("3.0");
					String pricingActionMethod3 = explorerCommonElements.getElement().getText();  //pricing action method 3.0 value from segment entity
					
					explorerCommonElements.search().clear();
					explorerCommonElements.search().sendKeys("4.0");
					String pricingActionMethod4 = explorerCommonElements.getElement().getText();  //pricing action method 4.0 value from segment entity
					
					
					partentity.enterEntityname();
					localxRefMultiplier.searchEntity();
					explorerCommonElements.selectElement();
					
					WebElement xRefJV = localxRefMultiplier.xRefJV();
				   	String xRefJVValue =  xRefJV.getText();
				   	double xRefJVValueNumeric = Integer.parseInt(xRefJVValue);
				   	
				   	WebElement xRefMultiplier = localxRefMultiplier.xRefMultiplier();
				   	String xRefMultiplierValue =  xRefMultiplier.getText();
				   	double xRefMultiplierValueNumeric = Integer.parseInt(xRefMultiplierValue);
					
				   	//Select part entity
					partentity.enterEntityname();
					partentity.searchEntityname();
					partentity.clickEntityname();

					WebElement resultingCost = partentity.resultingCost();  // resulting cost from part entity
					String resultingCostValue = gettext(resultingCost);
					double resultingCostValueNumeric = Integer.parseInt(calculatedPriceValue);
					System.out.println("Value of partOwner from UI is:" + resultingCostValue);
					
					double mulOfCurrentPriceAndPricingActionIncreaseLimit = currentPriceValueNumeric* pricingActionIncreaselimitNumeric;
					double mulOfCurrentPriceAndPricingActionDecreaseLimit = currentPriceValueNumeric* pricingActionDecreaselimitValueNumeric;
					
					//double pricingActionDecreaselimitNumeric;
					if(swappValue.equals("SWAPP") && resultingCostValue.isEmpty() ) {
						
						calculatedPriceNumeric = 0;
					}
					else if(swappValue.equals("SWAPP") && !resultingCostValue.isEmpty() ) {
						
						
						double resultingCostNumeric = Integer.parseInt(resultingCostValue);
						calculatedPriceNumeric = resultingCostNumeric*1.11;
						
					}
					else if(pricingActionMethodValue.equals(pricingActionMethod1) && !pricingActionValue.isEmpty() ) {  

						calculatedPriceNumeric = resultingCostValueNumeric* pricingActionValueNumeric;

					}
					else if(pricingActionMethodValue.equals(pricingActionMethod2) && !pricingActionValue.isEmpty()) {  
						
						calculatedPriceNumeric = currentPriceValueNumeric * pricingActionValueNumeric;


					}else if(pricingActionMethodValue.equals(pricingActionMethod3) && !pricingActionValue.isEmpty() && pricingActionValueNumeric > mulOfCurrentPriceAndPricingActionIncreaseLimit) { //need to change
						
						calculatedPriceNumeric = currentPriceValueNumeric * pricingActionIncreaselimitNumeric;


					}else if(pricingActionMethodValue.equals(pricingActionMethod3) && !pricingActionValue.isEmpty() && pricingActionValueNumeric < mulOfCurrentPriceAndPricingActionDecreaseLimit ) {  // need to check condition

						
						calculatedPriceNumeric = currentPriceValueNumeric * pricingActionDecreaselimitValueNumeric;

					}else if(pricingActionMethodValue.equals(pricingActionMethod4) && !futurePriceValue.equals("Null") ) {  

						 //( ldn.future price  OR ldn.publish price  OR ldn.current price) * (xref.Multipler OR xref_JV.Multiper)
						calculatedPriceNumeric =futurePriceValueNumeric * xRefMultiplierValueNumeric;

					}else if (pricingActionMethodValue.equals(pricingActionMethod4) && !publishPriceValue.equals("Null") ) {
						
						calculatedPriceNumeric = publishPriceValueNumeric * xRefMultiplierValueNumeric;
						
					}else if (pricingActionMethodValue.equals(pricingActionMethod4) && !currentPriceValue.equals("Null") ) {
						
						calculatedPriceNumeric = currentPriceValueNumeric * xRefMultiplierValueNumeric;
					}else if(!codeValue.isEmpty()){
						
						calculatedPriceNumeric = resultingCostValueNumeric * multiplierValueNumeric;
					}
					
					
				   
				   
				   
			   }else {
				   
				   System.out.println("Program ends");
			   }
			   
			   
			   
			   
			
		}else {
			
			System.out.println("Program ends");
		}
				
		
			
		}
	
	@Test(enabled=false)
	public void DnPricingCalcualtePriceNewPartPricingAction() throws EncryptedDocumentException, IOException, InterruptedException, ParseException {
		
		costRangeMultiplier = new ExplorerPageCostRangeMultiplier();
		partentity = new ExplorerPage_010_part();
		segmententity = new ExplorerPage_020_Segment();
		scroll = new ScrollByVisibleElement();
		HomePage hp = new HomePage();
		textbox = new GetTextBoxValue();
		hp.EnterDataExplorer();
		exceldata = new GetTestData();
		segmentation = new Segmentation();
		dnpricing = new ExplorerPage_030_Dn_Pricing();
		explorerCommonElements = new ExplorerPageCommonElements();
		localxRefMultiplier = new ExplorerPagelocalxRefMultiplier();

		hp.EnterDataExplorer();
		dnpricing.enterModelname();
		dnpricing.searcModelname();
		dnpricing.clickModelname();
		
		//Select DN pricing entity
		dnpricing.enterEntityname();
		dnpricing.searchEntityname();
		dnpricing.clickEntityname();
		
		String partNumberFromExcel=exceldata.getTestDataDnPricingAction(1, 0);  //need to add excel file code
		dnpricing.filterBtn();
		dnpricing.ruleFilter();
		dnpricing.clickDropdown();
		dnpricing.filterDropDownSearch();
		dnpricing.partNumberFilter();
		dnpricing.filterTextBox().sendKeys(partNumberFromExcel);
		dnpricing.FilterApply();
		
		Thread.sleep(10000);
		
		WebElement currentPrice = dnpricing.currentPrice();  // current price from DN pricing entity
		String currentPriceValue = gettext(currentPrice);
		System.out.println("Value of partOwner from UI is:" + currentPriceValue);
		double currentPriceValueNumeric = Integer.parseInt(currentPriceValue);
		
		WebElement publishPrice = dnpricing.futurePrice();  // future price from DN pricing entity
		String publishPriceValue = gettext(publishPrice);
		System.out.println("Value of partOwner from UI is:" + publishPriceValue);
		double publishPriceValueNumeric = Integer.parseInt(publishPriceValue);
		
		WebElement futurePrice = dnpricing.futurePrice();  // future price from DN pricing entity
		String futurePriceValue = gettext(futurePrice);
		System.out.println("Value of partOwner from UI is:" + futurePriceValue);
		double futurePriceValueNumeric = Integer.parseInt(futurePriceValue);
		
		WebElement calculatedPrice = dnpricing.calculatedPrice();  // calculated price from DN pricing entity
		String calculatedPriceValue = gettext(calculatedPrice);
		double calculatedPriceNumeric = Integer.parseInt(calculatedPriceValue);
		System.out.println("Value of partOwner from UI is:" + calculatedPriceValue);
		
		WebElement swapp = dnpricing.swappValue();   // Swapp from DN pricing entity
		String swappValue = gettext(swapp);
		System.out.println("Value of partOwner from UI is:" + swappValue);
		
		WebElement futureEffective = dnpricing.futureEffectiveDateValue();  //Future effective date from DN pricing entity
		String futureEffectiveDateValue = gettext(futureEffective);
		System.out.println("Value of partOwner from UI is:" + futureEffectiveDateValue);
		
		
		dnpricing.enterEntityname();
		costRangeMultiplier.searchCostRangeMultiplier();
		explorerCommonElements.selectElement();
		
		WebElement code = costRangeMultiplier.code();  //Future effective date from DN pricing entity
		String codeValue = gettext(code);
		System.out.println("Value of partOwner from UI is:" + codeValue);
		double codeValueNumeric = Integer.parseInt(codeValue);
		
		WebElement multiplier = costRangeMultiplier.multiplier();  //Future effective date from DN pricing entity
		String multiplierValue = gettext(multiplier);
		System.out.println("Value of partOwner from UI is:" + multiplierValue);
		double multiplierValueNumeric = Integer.parseInt(multiplierValue);
		
		SimpleDateFormat df = new SimpleDateFormat("MM/dd/yyyy"); 
		Date futureEffectiveDate = df.parse(futureEffectiveDateValue);
		
		
		Date today = new Date();                      
		System.out.println("Today Date is"+today);
		  
		   if(today.compareTo(futureEffectiveDate)>0) {
			   
			   if(!currentPriceValue.isEmpty()) {
				   
				   segmententity.enterEntityname();
				   segmententity.searchEntityname();
				   segmententity.clickEntityname();
				   
				   	WebElement newPricingActionMethod = segmententity.newPartPricingMethod();//pricing action method from segment entity
				   	String newPricingActionMethodValue =  newPricingActionMethod.getText();
				   	newPricingActionMethod.click();
					explorerCommonElements.search().sendKeys("1.0");  
					explorerCommonElements.saveBtn();
					String newPricingActionMethod1 = newPricingActionMethod.getText();  //pricing action method 1.0 value from segment entity
					
					explorerCommonElements.search().clear();
					explorerCommonElements.search().sendKeys("2.0");
					explorerCommonElements.saveBtn();
					String newPricingActionMethod2 = newPricingActionMethod.getText();  //pricing action method 2.0 value from segment entity
					
					explorerCommonElements.search().clear();
					explorerCommonElements.search().sendKeys("3.0");
					explorerCommonElements.saveBtn();
					String newPricingActionMethod3 = newPricingActionMethod.getText();  //pricing action method 3.0 value from segment entity
					
					explorerCommonElements.search().clear();
					explorerCommonElements.search().sendKeys("4.0");
					explorerCommonElements.saveBtn();
					String newPricingActionMethod4 = newPricingActionMethod.getText();  //pricing action method 4.0 value from segment entity
					
					
					WebElement newPricingActionValueElement = segmententity.newPartPricingValue();	//pricing action method from segment entity
				   	String newPricingActionValue =  newPricingActionValueElement.getText();
				   	double newPricingActionValueNumeric = Integer.parseInt(newPricingActionValue);
				   	
				   	WebElement pricingActionIncreaselimit = segmententity.pricingActionIncreaselimit();	//pricing action increase limit from segment entity
				   	String pricingActionIncreaselimitValue =  pricingActionIncreaselimit.getText();
				   	double pricingActionIncreaselimitNumeric = Integer.parseInt(pricingActionIncreaselimitValue);
				   	
				  	WebElement pricingActionDecreaselimit = segmententity.pricingActionDecreaselimit();	//pricing action decrease limit from segment entity
				   	String pricingActionDecreaselimitValue =  pricingActionDecreaselimit.getText();
				   	double pricingActionDecreaselimitValueNumeric = Integer.parseInt(pricingActionDecreaselimitValue);
				   	

					double mulOfCurrentPriceAndPricingActionIncreaseLimit = currentPriceValueNumeric* pricingActionIncreaselimitNumeric;
					double mulOfCurrentPriceAndPricingActionDecreaseLimit = currentPriceValueNumeric* pricingActionDecreaselimitValueNumeric;
				   	
					explorerCommonElements.search().clear();
					explorerCommonElements.search().sendKeys("2.0");
					String pricingActionMethod2 = explorerCommonElements.getElement().getText();  //pricing action method 2.0 value from segment entity
					
					explorerCommonElements.search().clear();
					explorerCommonElements.search().sendKeys("3.0");
					String pricingActionMethod3 = explorerCommonElements.getElement().getText();  //pricing action method 3.0 value from segment entity
					
					explorerCommonElements.search().clear();
					explorerCommonElements.search().sendKeys("4.0");
					String pricingActionMethod4 = explorerCommonElements.getElement().getText();  //pricing action method 4.0 value from segment entity
					
					
					partentity.enterEntityname();
					localxRefMultiplier.searchEntity();
					explorerCommonElements.selectElement();
					
					WebElement xRefJV = localxRefMultiplier.xRefJV();
				   	String xRefJVValue =  xRefJV.getText();
				   	double xRefJVValueNumeric = Integer.parseInt(xRefJVValue);
				   	
				   	WebElement xRefMultiplier = localxRefMultiplier.xRefMultiplier();
				   	String xRefMultiplierValue =  xRefMultiplier.getText();
				   	double xRefMultiplierValueNumeric = Integer.parseInt(xRefMultiplierValue);
					
				   	//Select part entity
					partentity.enterEntityname();
					partentity.searchEntityname();
					partentity.clickEntityname();

					WebElement resultingCost = partentity.resultingCost();  // resulting cost from part entity
					String resultingCostValue = gettext(resultingCost);
					double resultingCostValueNumeric = Integer.parseInt(calculatedPriceValue);
					System.out.println("Value of partOwner from UI is:" + resultingCostValue);
					
					double pricingActionDecreaselimitNumeric;
					if(swappValue.equals("SWAPP") && resultingCostValue.isEmpty() ) {
						
						calculatedPriceNumeric = 0;
					}
					else if(swappValue.equals("SWAPP") && !resultingCostValue.isEmpty() ) {
						
						
						double resultingCostNumeric = Integer.parseInt(resultingCostValue);
						calculatedPriceNumeric = resultingCostNumeric*1.11;
						
					}
					else if(newPricingActionMethodValue.equals(newPricingActionMethod1) && !newPricingActionValue.isEmpty() ) {  

						calculatedPriceNumeric = resultingCostValueNumeric* newPricingActionValueNumeric;

					}
					else if(newPricingActionMethodValue.equals(pricingActionMethod2) && !newPricingActionValue.isEmpty()) {  
						
						calculatedPriceNumeric = currentPriceValueNumeric * newPricingActionValueNumeric;
						
				

					}
					// Need to confirm
					else if(newPricingActionMethodValue.equals(pricingActionMethod3) && !newPricingActionValue.isEmpty()) { 
						
						calculatedPriceNumeric = currentPriceValueNumeric * pricingActionIncreaselimitNumeric;


					}
					// Need to confirm
					else if(newPricingActionMethodValue.equals(pricingActionMethod3)) {  

						
						calculatedPriceNumeric = currentPriceValueNumeric * pricingActionDecreaselimitValueNumeric;

					}else if(newPricingActionMethodValue.equals(pricingActionMethod4) && !futurePriceValue.equals("Null") ) {  

						 //( ldn.future price  OR ldn.publish price  OR ldn.current price) * (xref.Multipler OR xref_JV.Multiper)
						calculatedPriceNumeric =futurePriceValueNumeric * xRefMultiplierValueNumeric;

					}else if (newPricingActionMethodValue.equals(pricingActionMethod4) && !publishPriceValue.equals("Null") ) {
						
						calculatedPriceNumeric = publishPriceValueNumeric * xRefMultiplierValueNumeric;
						
					}else if (newPricingActionMethodValue.equals(pricingActionMethod4) && !currentPriceValue.equals("Null") ) {
						
						calculatedPriceNumeric = currentPriceValueNumeric * xRefMultiplierValueNumeric;
					}else if(!codeValue.isEmpty()){
						
						calculatedPriceNumeric = resultingCostValueNumeric * xRefMultiplierValueNumeric;
					}
					
					
				   
				   
				   
			   }else {
				   
				   System.out.println("Program ends");
			   }
			   
			   
			   
			   
			
		}else {
			
			System.out.println("Program ends");
		}
				
		
			
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
