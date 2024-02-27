package org.baseclass;

import java.awt.AWTException;
import java.awt.Dimension;
import java.awt.Robot;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;
import java.util.Set;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.TargetLocator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.pageobjects.ExplorerPageDefaultPricingRegion;
import org.pageobjects.ExplorerPage_010_part;
import org.pageobjects.LoginPage;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.utils.GetTestData;
import org.utils.GetTextBoxValue;
import org.utils.ScrollByVisibleElement;
import org.utils.writeBack;

import com.github.dockerjava.api.model.Driver;

import org.openqa.selenium.TakesScreenshot;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	public static WebDriver driver;
	public static File f;
	public static FileInputStream fin;
	public static FileOutputStream fout;
	public static Workbook w;
	public static Sheet s;
	public static Row r;
	public static Cell c;
	
	LoginPage login;
	WebDriverWait wait;

	public void launchBrowser() throws EncryptedDocumentException, InterruptedException, IOException {
		String browserName = BaseClass.getproperties("browser");
		if (browserName.equals("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();

		}

		else if (browserName.equals("Firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();

		} else if (browserName.equals("Edge")) {
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
		}
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(100));
		driver.get(
				"https://auth.dev.simadvisory.com/auth/realms/D_SPRICED/protocol/openid-connect/auth?client_id=D_SPRICED_Client&redirect_uri=https%3A%2F%2Fspriced.dev.simadvisory.com%2F&state=45925128-7bf1-4d26-898d-311ea0a4dee1&response_mode=fragment&response_type=code&scope=openid&nonce=3fe7691c-c9e6-49b6-859b-466bcfa5ec00");
		driver.manage().window().maximize();
		//driver.manage().deleteAllCookies();
		
		
		
	}

	
	/*public void allElements() {

       
		
		List<WebElement> elements =driver.findElements(By.xpath("//div[@role='listbox']/mat-option"));
		for(WebElement ele : elements ) 
		{
			
			String currentElement = ele.getText();
			System.out.println("Elements :" +currentElement);
			if(currentElement.equals("Part")){
				
				wait = new WebDriverWait(driver, Duration.ofSeconds(50));
				wait.until(ExpectedConditions.elementToBeClickable(ele));

				ele.click();
				break;
				
			
			
			}


		}
		
		
	}*/
	

	
	public WebDriver getWebDriver() {
		return driver;
	}
	
	public void allpartnumber() {

    
	
	List<WebElement> partNumberList =driver.findElements(By.xpath("//div[@class='datatable-row-center datatable-row-group ng-star-inserted']"));
	for(WebElement ele : partNumberList ) 
	{
		
		String currentElement = ele.getText();
		System.out.println("currentElement :" +currentElement);

		
		
		}


	}
	
	public void clickSegmentOnFilterPopup() {
		
		
		WebElement segment = driver.findElement(By.xpath("(//span[@class='mdc-list-item__primary-text'])[15]"));
		Actions act = new Actions(driver);
		act.moveToElement(segment).build().perform();
		segment.click();
		
		
	}
	
	
public void removeSegmentAllGrid() {
	
	GetTextBoxValue textbox = new GetTextBoxValue();
		
	ExplorerPage_010_part partentity = new ExplorerPage_010_part();
	ScrollByVisibleElement scroll = new ScrollByVisibleElement();
	List<WebElement> segmentAllGrid =driver.findElements(By.xpath("//div[@class='datatable-row-center datatable-row-group ng-star-inserted']"));
	for(WebElement grid : segmentAllGrid ) 
	{
		
		grid.click();
		
		WebElement partnumber = partentity.partNumberValue();
		String partNumberValueUI = textbox.getvalue_textbox(partnumber);
		System.out.println("Value of part number from UI is:" + partNumberValueUI);
		
		//scroll.ByVisibleElement(partentity.segmentValue());
		//partentity.segmentValue().clear();
		//partentity.saveOption();
		
		
		}
		
		
	}
	
public void moveToReadyForSegmentation() {
	
		WebElement RFS = driver.findElement(By.xpath("/html/body/sp-root/div/div/sp-body/div/sp-app/sp-entity-data/sp-two-col-three-forth/div/div[2]/div/mat-accordion/mat-expansion-panel[1]/div/div/div/sp-dynamic-form-container/div/sp-dynamic-form/form/div/div/sp-lookup-select[49]/div/div/div[2]/mat-form-field/div[1]/div/div[2]/mat-select"));
		Actions actions = new Actions(driver);
		 
		 actions.moveToElement(RFS).build().perform();
}
	
	
	
public void allElements() throws InterruptedException {

	       WebElement ele1;
			
			List<WebElement> elements =driver.findElements(By.xpath("//div[@role='listbox']/mat-option"));
			
			System.out.println("Number of elements:"+elements.size());
			for(int i=0; i<elements.size(); i++) 
			{
				
				
				if(elements.get(i).getText().equals("Part")){
					
					Actions actions = new Actions(driver);
					wait = new WebDriverWait(driver, Duration.ofSeconds(50));
					wait.until(ExpectedConditions.elementToBeClickable(elements.get(i)));
					actions.moveToElement(elements.get(i)).click().build().perform();
					wait = new WebDriverWait(driver, Duration.ofSeconds(50));
					System.out.println("Inside Loop: "+elements.get(i).getText());
					
					
					elements.get(i).click();
					break;	
				
				}


			}
			
			
		}
	
	
 public void regionAttribute() throws IOException {
	 
	 
	 ExplorerPageDefaultPricingRegion defaultPricingRegion = new ExplorerPageDefaultPricingRegion();
	 ArrayList<String> listOfregion =new ArrayList<String>();
	 List<WebElement> gridrow =driver.findElements(By.xpath("//datatable-body-row[@role='row']"));
	 writeBack writeResult = new writeBack();

 	for(WebElement ele : gridrow ) {
	
	ele.click();
	String region = defaultPricingRegion.region().getText();
	System.out.println("region:" +region);
	listOfregion.add(region);
	
	String listOfRegionAttribute = "";
	for (String s : listOfregion) {
		listOfRegionAttribute += s + ", \t";
	}
	int row1=1;
	writeResult.writeToExcelRegion(row1, listOfRegionAttribute);
	row1++;

	} 
 }
	public static void click(WebElement e) {

		e.click();

	}

	public static void implicitWait(long sec) {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

	}

	public static void quit() {
		driver.quit();
	}

	public static String getCurrentUrl() {
		String currentUrl = driver.getCurrentUrl();
		return currentUrl;
	}

	public static String gettitle(WebElement e) {
		String title = driver.getTitle();
		return title;

	}

	public static void sendKeys(WebElement e, String value) {
		e.sendKeys(value);
	}

	public static void ImplicitlyWait(int a) {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	}

	public static void clear(WebElement e) {
		e.clear();

	}

	public static String getAttribute(WebElement e, String value) {
		String attribute = e.getAttribute(value);
		return attribute;

	}

	public static String gettext(WebElement e) {

		String text = e.getText();
		return text;
	}

	public static String gettexts(List<WebElement> e) {
		String r = "";
		for (WebElement x : e) {
			String text = x.getText();
			r = r + "\n" + text;
		}
		return r;
	}

	public static boolean isDisplayed(WebElement e) {
		boolean displayed = e.isDisplayed();
		return displayed;
	}

	public static boolean isSelected(WebElement e) {
		boolean selected = e.isSelected();
		return selected;

	}

	public static void aclick(WebElement e) {
		Actions a = new Actions(driver);
		a.click(e).perform();
	}

	public static void contextclick() {
		Actions a = new Actions(driver);
		a.contextClick().perform();
	}

	public static void econtextclick(WebElement e) {
		Actions a = new Actions(driver);
		a.contextClick(e).perform();
	}

	public static void mcontextclick(WebElement e) {
		Actions a = new Actions(driver);
		a.contextClick(e).contextClick().perform();
	}

	public static void eclickandhold(WebElement e) {
		Actions a = new Actions(driver);
		a.clickAndHold(e).perform();

	}

	public static void clickandhold() {
		Actions a = new Actions(driver);
		a.clickAndHold().perform();
	}

	public static void doubleClick(WebElement e) {
		Actions a = new Actions(driver);
		a.doubleClick(e).perform();
	}

	public static void edoubleClick(WebElement e) {
		Actions a = new Actions(driver);
		a.doubleClick(e).perform();
	}

	public static void rightClick(WebElement e) {
		Actions a = new Actions(driver);
		a.contextClick(e).build().perform();
	}

	public static void dragAndDrop(WebElement src, WebElement target) {
		Actions a = new Actions(driver);
		a.dragAndDrop(src, target).perform();
	}

	public static boolean equals(WebElement e) {
		Actions a = new Actions(driver);
		boolean equals = a.equals(e);
		return equals;
	}

	public static void moveToElement(WebElement target) {
		Actions a = new Actions(driver);
		a.moveToElement(target).click().perform();

	}

	public static void rmoveToElement(WebElement target) {
		Actions a = new Actions(driver);
		a.moveToElement(target).click().release().perform();

	}

	public static void asendKeys(WebElement e, String keys) {
		Actions a = new Actions(driver);
		a.sendKeys(e, keys).perform();

	}

	public static void pause(Duration duration) {
		Actions a = new Actions(driver);
		a.pause(Duration.ofSeconds(10)).perform();
	}

	public static void wait(Duration duration) throws InterruptedException {
		Actions a = new Actions(driver);
		a.wait();

	}

	public static void keyPress(int Keyevent) throws AWTException {
		Robot r = new Robot();
		r.keyPress(Keyevent);

	}

	public static void keyRelease(int Keyevent) throws AWTException {
		Robot r = new Robot();
		r.keyRelease(Keyevent);

	}

	public static File TakesScreenshot() {
		TakesScreenshot tk = (TakesScreenshot) driver;
		File file = tk.getScreenshotAs(OutputType.FILE);
		return file;
	}

	public static void Javascript(String arg, WebElement e) {
		JavascriptExecutor je = (JavascriptExecutor) driver;
		je.executeScript(arg, e);
	}

	public static Object jgetAttribute(String arg, WebElement e) {
		JavascriptExecutor je = (JavascriptExecutor) driver;
		Object executeScript = je.executeScript(arg, e);
		String string = executeScript.toString();
		return string;
	}

	public static String getWindowHandle() {
		String parentid = driver.getWindowHandle();
		return parentid;
	}

	public static void deselectAll(WebElement e) {
		Select s = new Select(e);
		s.deselectAll();
	}

	public static void deselectByIndex(WebElement e, int index) {
		Select s = new Select(e);
		s.deselectByIndex(index);
	}

	public static void deselectByValue(WebElement e, String arg) {
		Select s = new Select(e);
		s.deselectByValue(arg);
	}

	public static void deselectByVisibleText(WebElement e, String arg) {
		Select s = new Select(e);
		s.deselectByVisibleText(arg);
	}

	public static boolean equals(WebElement e, Object obj) {
		Select s = new Select(e);
		boolean equals = s.equals(obj);
		return equals;
	}

	public static void selectByIndex(WebElement list, int index) {
		Select s = new Select(list);
		s.selectByIndex(index);
	}

	public static void ListselectByIndex(WebElement list, int index) {
		Select s = new Select(list);
		s.selectByIndex(index);
	}

	public static void selectByValue(WebElement e, String arg) {
		Select s = new Select(e);
		s.selectByValue(arg);
	}

	public static void selectByVisibleText(WebElement e, String arg) {
		Select s = new Select(e);
		s.selectByVisibleText(arg);
	}

	public static String toString(WebElement e) {
		Select s = new Select(e);
		String string = s.toString();
		return string;
	}

	public static List<WebElement> getAllSelectedOptions(WebElement e) {
		Select s = new Select(e);
		List<WebElement> allSelectedOptions = s.getAllSelectedOptions();
		return allSelectedOptions;
	}

	public static WebElement getFirstSelectedOption(WebElement e) {
		Select s = new Select(e);

		WebElement firstSelectedOption = s.getFirstSelectedOption();
		return firstSelectedOption;
	}

	public static List<WebElement> getOptions(WebElement e) {
		Select s = new Select(e);
		List<WebElement> options = s.getOptions();
		return options;
	}

	public static WebElement wrappedElement(WebElement e) {
		Select s = new Select(e);
		WebElement wrappedElement = s.getWrappedElement();
		return wrappedElement;
	}

	public static List<WebElement> Findelements(String xpath) {
		List<WebElement> findElement = driver.findElements(By.xpath(xpath));

		return findElement;

	}

	public static Set<String> getwindowshandles() {
		Set<String> windowshandles = driver.getWindowHandles();
		return windowshandles;

	}

	public static void switchto(String eachid) {
		TargetLocator switchTo = driver.switchTo();
		switchTo.window(eachid);
	}

	public static void acceptalert() {
		driver.switchTo().alert().accept();

	}

	public static void dismissalert() {
		driver.switchTo().alert().dismiss();

	}

	public static void switchtoframe(WebElement frame) {
		driver.switchTo().frame(frame);

	}

	// method to create a new row in the existing excel sheet

	public static String getData(int newRowNumber, int newcColumnNumber, String fileName, String sheetName) {

		// creating file object
		f = new File(
				"C:\\Users\\nirmala.j_simadvisor\\Documents\\project\\Spriced_NRP_Testng\\Test data\\BookDetails.xlsx");
		// to read file we need fileInputStream object (object creation)
		try {
			fin = new FileInputStream(f);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			// e.printStackTrace();
		}
		// workbook instantiating
		try {
			w = new XSSFWorkbook(fin);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			// e.printStackTrace();
		}
		// to get a particular sheet from the excel
		s = w.getSheet(sheetName);
		// create new row
		r = s.createRow(newRowNumber);
		// create new cell
		Cell c = r.createCell(newcColumnNumber);
		// to enter value (set value) into cell
		String value = "";
		c.setCellValue(value);

		// to write into excel
		try {
			fout = new FileOutputStream(f);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			w.write(fout);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return value;

	}

	public static void moveToElementoffset(WebElement target, int xOffset, int yOffset) {
		Actions a = new Actions(driver);
		a.click(target).moveByOffset(xOffset, yOffset).click().release().perform();

	}

	public static void contextmoveToElementoffset(WebElement target, int xOffset, int yOffset) {
		Actions a = new Actions(driver);
		a.click(target).moveByOffset(xOffset, yOffset).doubleClick().contextClick(target).perform();

	}

	public static void doublemoveToElementoffset(WebElement target, int xOffset, int yOffset) {
		Actions a = new Actions(driver);
		a.click(target).moveByOffset(xOffset, yOffset).click().release().doubleClick().perform();

	}

	public static void screenshot() throws IOException {

		try {

		} catch (AssertionError e) {

			TakesScreenshot ts = (TakesScreenshot) driver;
			File srcFile = ts.getScreenshotAs(OutputType.FILE);
			File destFile = new File("screenshots/failure.png");
			FileUtils.copyFile(srcFile, destFile);

			System.out.println("Test case failed, screenshot saved at " + destFile.getAbsolutePath());
		}

	}

	public static void takesScreenshot(String imagename) {
		TakesScreenshot tk = (TakesScreenshot) driver;
		File file = tk.getScreenshotAs(OutputType.FILE);
		File f = new File(
				System.getProperty("user.dir") + "\\src\\test\\resources\\Screenshots\\" + imagename + ".png");
		try {
			FileUtils.copyFile(file, f);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static String getPropertyData(String key) {
		Properties p = new Properties();
		try {
			p.load(new FileReader(
					System.getProperty("user.dir") + "\\src\\test\\resources\\Config\\Spriced.properties"));
		} catch (IOException e) {
			e.printStackTrace();
		}
		return p.get(key).toString();
	}

	public static String getproperties(String key1) {
		Properties p1 = new Properties();
		try {
			p1.load(new FileReader(
					System.getProperty("user.dir") + "\\src\\test\\resources\\Config\\Spriced.properties"));

		} catch (IOException e) {
			e.printStackTrace();

		}
		return p1.get(key1).toString();

	}

	public void closeBrowser() {
		driver.quit();
	}

	public static void actionsmoveToElementoffset(WebElement target, int xOffset, int yOffset) {
		Actions a = new Actions(driver);
		a.moveToElement(target, xOffset, yOffset).clickAndHold().moveByOffset(xOffset, yOffset)
				.moveByOffset(xOffset, yOffset).moveByOffset(xOffset, yOffset).release().build().perform();

	}

	public static void clickmoveToElementoffset(WebElement target, int xOffset, int yOffset) {
		Actions a = new Actions(driver);
		// a.click(target).moveByOffset(xOffset,
		// yOffset).click().release().contextClick().perform();

		a.click(target).moveToElement(target, xOffset, yOffset).clickAndHold(target).moveByOffset(xOffset, yOffset)
				.moveByOffset(xOffset, yOffset).moveByOffset(xOffset, yOffset).release(target).build();
		a.perform();

	}
	
	
/*	public void loginToSpriced() throws InterruptedException, EncryptedDocumentException, IOException {
		
		exceldata =new GetTestData();
		login = new LoginPage();
		String username= exceldata.getTestData(0, 0);
		sendKeys(login.getUserName(), username);
		String password= exceldata.getTestData(1, 1);
		sendKeys(login.getPassword(), password);
		click(login.getLoginBtn());
		Thread.sleep(3000);

	}*/

}
