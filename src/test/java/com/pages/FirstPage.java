package com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.w3c.dom.Text;

import com.base.Base;

public class FirstPage extends Base {

	public FirstPage() {

		PageFactory.initElements(driver, this);

	}

	@FindBy(xpath = "//span[@class='pCGSTE']")
	private WebElement btmText;
	
	@FindBy(xpath = "//div[@class='_3sdu8W emupdz']")
	private WebElement products;
	

	public WebElement getBtmText() {
		return btmText;
	}
	
	public WebElement getProducts() {
		return products;
	}

	public void get() {
		
		String txt = getTxt(btmText);
		 display(txt);
		 String txt1 = getTxt(products);
		 display(txt1);
	}

	
	
	

}
