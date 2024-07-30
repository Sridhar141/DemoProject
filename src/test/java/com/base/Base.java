package com.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base {

	public static WebDriver driver;

	public void laucnchBrowser() {

		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");

	}

	public void inputKeys(WebElement e, String data) {

		e.sendKeys(data);

	}

	public void clickBtn(WebElement e) {
		e.click();
	}

	public String getTxt(WebElement e) {
		String text = e.getText();
		return text;
	}

	public void display(String data) {
		System.out.println(data);

	}
	
	
}

