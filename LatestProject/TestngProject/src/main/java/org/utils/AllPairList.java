package org.utils;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;

public class AllPairList {
	
	GetTestData getData=new GetTestData();
	
	public void allPairValueExcelData() throws EncryptedDocumentException, IOException {
		int row1=2;
		int col1=0;
		int row2=2;
		int col2=1;
		int row3=2;
		int col3=2;
		
		
		String partOwnerFromExcel=getData.getTestData(row1, col1);
		String saleableFromExcel=getData.getTestData(row2, col2);
		String informationFromExcel=getData.getTestData(row3, col3);
		
		row1++;
		row2++;
		row3++;
		
		
		
		 
		
		
		
		
		
	}
	
	

}
