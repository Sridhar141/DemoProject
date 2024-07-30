package com.stepdef;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

import com.base.Base;

import com.manager.ObjectManager;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class FirstPageStep extends Base {

	ObjectManager manager = new ObjectManager();

	@Given("User launch flipkart application")
	public void user_launch_flipkart_application() {
		laucnchBrowser();
	}

	@When("User can get text from Flipkart page")
	public void user_can_get_text_from_flipkart_page() {
        manager.getFp().get();
	}

	@When("user should verify the text by assertion")
	public void user_should_verify_the_text_by_assertion() {
	}

	@Then("user can close the webpage")
	public void user_can_close_the_webpage() {

	}

	@When("User search {string}")
	public void user_search(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}
	@When("User select the Product from search results")
	public void user_select_the_product_from_search_results() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}
	@Then("User Moves to new window and click add to cart on the selected product")
	public void user_moves_to_new_window_and_click_add_to_cart_on_the_selected_product() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}
	@When("User switch in to search result page and select another product")
	public void user_switch_in_to_search_result_page_and_select_another_product() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}
	@Then("User Moves to new window and click add to cart on the second selected product")
	public void user_moves_to_new_window_and_click_add_to_cart_on_the_second_selected_product() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}
	@When("User switch in to search result page and Click Cart Option")
	public void user_switch_in_to_search_result_page_and_click_cart_option() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}
	@Then("User get Screenshot on this page")
	public void user_get_screenshot_on_this_page() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

}
