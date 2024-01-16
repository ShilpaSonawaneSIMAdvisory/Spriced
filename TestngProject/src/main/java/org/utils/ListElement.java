package org.utils;

import java.util.List;

import org.openqa.selenium.support.FindBy;

public class ListElement {

	
	
	 @FindBy(xpath = "//div[@role='listbox']/mat-option")
	 private List allElements;
			 
}
