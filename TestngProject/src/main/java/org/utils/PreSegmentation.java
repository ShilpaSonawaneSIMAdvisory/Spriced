package org.utils;

import static org.testng.Assert.assertEquals;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.baseclass.BaseClass;
import org.pageobjects.ExplorerPage_010_part;
import org.pageobjects.ExplorerPage_100_ECC;
import org.pageobjects.ExplorerPage_110_ECC_Minor;

public class PreSegmentation extends BaseClass
	
	{
	ExplorerPage_100_ECC ecc;
	ExplorerPage_110_ECC_Minor eccminor;
	ExplorerPage_010_part partentity;
	
	 public void resultPartSegmentType(String segmentTypeEcc, String segmentTypeEccMinor) {
		 System.out.println("Value of segment type from ECC is " +segmentTypeEcc);
		 System.out.println("Value of segment type from ECC Minor is "+segmentTypeEccMinor);
		
			assertEquals(segmentTypeEccMinor, segmentTypeEccMinor, "Ecc and Ecc minor segment type are equal");
		 
				
	}
	 
	 public boolean comparePartNumber(String partNumberValue) throws EncryptedDocumentException, IOException {
		
		boolean result;
		GetTestData exceldata= new GetTestData();
		String partnumberfromexcel =exceldata.getTestData(4, 0);
		System.out.println("Print the part number from excel :"+partnumberfromexcel);
		
		
	//	assertEquals(partNumberValue, partnumberfromexcel, "partnumber from UI and partnumber from excel are equal");
		
		if(partNumberValue.equals(partnumberfromexcel)) {
			result=true;
			return result;
			
		}
			
			else
				result=false;
				return result;
			
			
			 }
	
	}
	
	


