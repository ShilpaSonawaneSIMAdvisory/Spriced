package org.utils;

import org.baseclass.BaseClass;
import org.openqa.selenium.WebElement;
import org.pageobjects.ExplorerPage_010_part;

public class GetTextBoxValue extends BaseClass {

	ExplorerPage_010_part ep;

	public String getvalue_textbox(WebElement e) {

		String value = e.getAttribute("value");
		return value;

		
	}

}
