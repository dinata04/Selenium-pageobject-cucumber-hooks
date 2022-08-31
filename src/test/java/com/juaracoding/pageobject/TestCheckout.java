package com.juaracoding.pageobject;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

import com.juaracoding.pageobject.drivers.DriverSingleton;
import com.juaracoding.pageobject.pages.AddToChart;
import com.juaracoding.pageobject.pages.Checkout;
import com.juaracoding.pageobject.pages.SearchProduct;
import com.juaracoding.pageobject.utils.Constants;

import io.cucumber.java.After;
import io.cucumber.java.AfterAll;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TestCheckout {
	public static WebDriver driver;
	private SearchProduct searchProduct = new SearchProduct();
	private AddToChart addToChart = new AddToChart();
	private Checkout checkout = new Checkout();

	public TestCheckout() {
		driver = Hooks.driver;
	}

	@When("User go to web shop")
	public void user_go_to_web_shop() {
		driver = DriverSingleton.getDriver();
		driver.get(Constants.URL);
	}

	@And("User click button search")
	public void user_click_button_search() {
		searchProduct.clickBtnSrach();
	}

	@And("User enter product")
	public void user_enter_product() {
		Hooks.scroll(700);
		searchProduct.inputSearch();
	}

//	Product One

	@When("User click product one")
	public void user_click_product_one() {
		Hooks.delay(3);
		addToChart.productOne();
	}

	@And("User select color")
	public void user_select_color() {
		Hooks.scroll(700);
		addToChart.selectColor();
	}

	@And("User select size")
	public void user_select_size() {
		addToChart.selectSize();
	}

	@And("User click button add to chart")
	public void user_click_button_add_to_chart() {
		addToChart.clickButtonAddToChart();
	}

	@Then("User success add product one")
	public void User_success_add_product_one() {
		assertEquals(addToChart.getTxtProductOne(), "WHITE BANDAGE CUT OUT BODYCON MINI DRESS");
		System.out.println("Success Add Prodct One");
	}

	@And("User click view chart")
	public void user_click_view_chart() {
		addToChart.clickButtonVViewChart();
	}

	@And("User click button continue shopping")
	public void user_click_button_continue_shopping() {
		addToChart.clickButtonContinueShopping();
	}

//	Product Two

	@When("User click product two")
	public void user_click_product_twoe() {
		Hooks.scroll(300);
		Hooks.delay(3);
		addToChart.producTwo();
	}

	@And("User select color two")
	public void user_select_color_two() {
		Hooks.scroll(700);
		addToChart.selectColorTwo();
	}

	@And("User select size two")
	public void user_select_size_two() {
		addToChart.selectSizeTwo();
	}

	@And("User click button add to chart two")
	public void user_click_button_add_to_chart_two() {
		addToChart.clickButtonAddToChartTwo();
	}

	@Then("User success add product two")
	public void User_success_add_product_two() {
		assertEquals(addToChart.getTxtProductTwo(), "BLACK LUX GRAPHIC T-SHIRT");
		System.out.println("Success Add Prodct two");
	}

	@And("User click view chart two")
	public void user_click_view_chart_two() {
		addToChart.clickButtonVViewChart();
	}

//	Checkout & Place Order

	@When("User click button checkout")
	public void user_click_button_checkout() {
		Hooks.delay(1);
		checkout.clickBtnCheckout();
	}

	@And("User enter first name")
	public void user_enter_first_name() {
		Hooks.delay(1);
		checkout.inputFirstName();
	}

	@And("User enter last name")
	public void user_enter_last_name() {
		Hooks.delay(1);
		checkout.inputLastName();
	}

	@And("User select region")
	public void user_select_region() {
		Hooks.delay(1);
		checkout.selectRegion();
	}

	@And("User input address")
	public void user_input_address() {
		Hooks.delay(1);
		checkout.inputStreetAddress();
	}

	@And("User select city")
	public void user_select_city() {
		Hooks.delay(1);
		checkout.inputCity();
	}

	@And("User select province")
	public void user_select_province() {
		Hooks.delay(1);
		checkout.selectProvince();
	}

	@And("User input postcode")
	public void user_input_postcode() {
		Hooks.delay(1);
		checkout.inputPostcode();
	}

	@And("User input phone")
	public void user_input_phone() {
		Hooks.delay(1);
		checkout.inputPhone();
	}

	@And("User input email")
	public void user_input_email() {
		Hooks.delay(1);
		checkout.inputEmailAdress();

		Hooks.scroll(-200);
	}

	@And("User ceklist term condition")
	public void user_ceklist_term_condition() {
		Hooks.delay(1);
		;
		checkout.ceklist();
	}

	@And("User click button place order")
	public void user_click_button_place_order() {
		Hooks.delay(1);
		checkout.clickBtnPlaceOrder();
	}

	@Then("User success checkout")
	public void user_success_checkout() {
		Hooks.delay(3);
		checkout.getTxtSuccesCheckou();
		assertEquals(checkout.getTxtSuccesCheckou(), "CHECKOUT");
		System.out.println("Checkout Succsess");
	}

}
