package org.utils;

import static org.testng.Assert.assertEquals;

public class Segmentation {
	
	    String result;
	
		public void resultGlobalSegmentation(String readyForSegmentation ,String partowner,String information, String saleable,String futureSalesStatusCode,String ecc,String brand,String engineType) {
		//if ready for segmentation is YES and partOwner is Global{Global} and information not equal to OEM Unique and saleable is Yes or Futuresalesstatuscode is Yes	
			if(readyForSegmentation.equalsIgnoreCase("1 {Yes}") && partowner.equalsIgnoreCase("{Global}")&& !information.equals("OEM Unique") && saleable.equalsIgnoreCase("Y")||futureSalesStatusCode.equalsIgnoreCase("Y")&& !ecc.isEmpty()&& !brand.isEmpty()&& !engineType.isEmpty())
				
			{
				
			System.out.println("Eligible for segmentation");
			result="Pass";
				
			
			}
			else {
				System.out.println("Not Eligible for segmentation");
				result="Fail";
			}
			assertEquals(result, "Pass", "Result is Pass");				
			
		}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
