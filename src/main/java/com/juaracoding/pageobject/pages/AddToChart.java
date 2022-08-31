package com.juaracoding.pageobject.pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.juaracoding.pageobject.drivers.DriverSingleton;

import okhttp3.Address;

public class AddToChart {
private WebDriver driver;
	
	 public AddToChart() {
		this.driver = DriverSingleton.getDriver();
		PageFactory.initElements(driver, this);
	}
	 
//	 Add TO Chart
	 @FindBy(xpath = "//a[normalize-space()='white bandage cut out bodycon mini dress']")
	 private WebElement clickProduct;
	 
	 @FindBy(xpath = "//a[normalize-space()='black lux graphic t-shirt']")
	 private WebElement clickProductTwo;
	 
	 @FindBy(xpath = "//*[@id=\"pa_color\"]")
	 private WebElement selectColor;
	 
	 @FindBy(xpath = "//select[@id='pa_size']")
	 private WebElement selectSize;
	 
	 @FindBy(xpath = "//button[normalize-space()='Add to cart']")
	 private WebElement btnAddChart;
	 
	 @FindBy(xpath = "//h1[@class='page-title']")
	 private WebElement txtProductOne;
	 
	 @FindBy(xpath = "//h1[@class='page-title']")
	 private WebElement txtProductTwo;
	 
	 @FindBy(xpath = "//a[@class='button wc-forward']")
	 private WebElement btnViewChart;
	 
	 @FindBy(xpath = "//a[@class='continue']")
	 private WebElement btnContinueShopping;
	 
	 

	 
//	 Product One
	 public void productOne() {
		 clickProduct.click();
	 }
	 
	 public void selectColor() {
		 Select select = new Select(selectColor);
		 select.selectByValue("white");
		 selectColor.click();
	 }
	 
	 public void selectSize() {
		 Select select = new Select(selectSize);
		 select.selectByValue("medium");
		 selectColor.click();
	 }
	 
	 public void clickButtonAddToChart() {
		 btnAddChart.click();
	 }
	 
	 public String getTxtProductOne() {
		 return txtProductOne.getText();
	 }
	 
	 public void clickButtonVViewChart() {
		 btnViewChart.click();
	 }
	 
	 public void clickButtonContinueShopping() {
		 btnContinueShopping.click();
	 }
	 
//	 Product Two
	 
	 public void producTwo() {
		 clickProductTwo.click();
	 }
	 
	 public void selectColorTwo() {
		 Select select = new Select(selectColor);
		 select.selectByValue("black");
		 selectColor.click();
	 }
	 
	 public void selectSizeTwo() {
		 Select select = new Select(selectSize);
		 select.selectByValue("32");
		 selectColor.click();
	 }
	 
	 public void clickButtonAddToChartTwo() {
		 btnAddChart.click();
	 }
	 
	 public String getTxtProductTwo() {
		 return txtProductTwo.getText();
	 }
	 
	 public void clickButtonVViewChartTwo() {
		 btnViewChart.click();
	 }
	 

}
