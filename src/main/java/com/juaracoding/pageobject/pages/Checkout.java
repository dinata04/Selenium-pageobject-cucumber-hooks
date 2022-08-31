package com.juaracoding.pageobject.pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.juaracoding.pageobject.drivers.DriverSingleton;

public class Checkout {
	private WebDriver driver;

	public Checkout() {
		this.driver = DriverSingleton.getDriver();
		PageFactory.initElements(driver, this);
	}

//	 Checkout & Place Order
	@FindBy(xpath = "//a[@class='checkout-button button alt wc-forward']")
	private WebElement btnCheckout;

	@FindBy(xpath = "//input[@id='billing_first_name']")
	private WebElement firstName;

	@FindBy(xpath = "//input[@id='billing_last_name']")
	private WebElement lastName;

	@FindBy(xpath = "//span[@id='select2-billing_country-container']")
	private WebElement selectRegion;

	@FindBy(xpath = "//input[@role='combobox']")
	private WebElement inputDropdown;

	@FindBy(xpath = "//input[@id='billing_address_1']")
	private WebElement streetAdress;

	@FindBy(xpath = "//input[@id='billing_city']")
	private WebElement City;

	@FindBy(xpath = "//span[@id='select2-billing_state-container']")
	private WebElement selectProvince;

	@FindBy(xpath = "//input[@id='billing_postcode']")
	private WebElement postCode;

	@FindBy(xpath = "//input[@id='billing_phone']")
	private WebElement phone;

	@FindBy(xpath = "//input[@id='billing_email']")
	private WebElement emailAddress;

	@FindBy(xpath = "//*[@id=\"terms\"]")
	private WebElement ceklis;

	@FindBy(xpath = "//button[@id='place_order']")
	private WebElement btnPlaceOrder;
	
	@FindBy(xpath = "//h1[@class='page-title']")
	private WebElement txtSucessCheckout;
	

//		Checkout & Place Order
	public void clickBtnCheckout() {
		btnCheckout.click();
	}

	public void inputFirstName() {
		firstName.sendKeys("hendi");
	}

	public void inputLastName() {
		lastName.sendKeys("hadinata");
	}

	public void selectRegion() {
		selectRegion.click();
		inputDropdown.sendKeys("Indonesia", Keys.ENTER);
	}

	public void inputStreetAddress() {
		streetAdress.sendKeys("Jln Jakarta 2");
	}
	
	public void inputCity() {
		City.sendKeys("Jakarta");
	}
	
	public void selectProvince() {
		selectProvince.click();
		inputDropdown.sendKeys("Jakarta", Keys.ENTER);
	}
	
	public void inputPostcode() {
		postCode.sendKeys("400123");
	}
	
	public void inputPhone() {
		phone.sendKeys("0878765457");
	}
	
	public void inputEmailAdress() {
		emailAddress.sendKeys("hendi@gmail.com");
	}
	
	public void ceklist() {
		ceklis.click();
	}
	
	public void clickBtnPlaceOrder() {
		btnPlaceOrder.click();
	}
	
	public String getTxtSuccesCheckou() {
		return txtSucessCheckout.getText();
	}
	

}
