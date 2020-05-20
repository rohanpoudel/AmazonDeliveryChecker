package stepDefinations;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.actions.postcodeSearchActions;
import utilities.SeleniumDriver;

public class validateDeliverySteps {
		
	postcodeSearchActions postcodeActions = new postcodeSearchActions();
	
	@Given("^I am on the home page of amazon prime now \"([^\"]*)\"$")
	public void i_am_on_the_home_page_of_amazon_prime_now(String URL) throws Exception {
		SeleniumDriver.openPage(URL);
		
	}

	@When("^I type in the post code - \"([^\"]*)\" and search$")
	public void i_type_in_the_post_code_and_search(String postcode) throws Exception{
		postcodeActions.typePostCode(postcode);
	}


	@And("^I select amazon as the provider$")
	public void i_select_amazon_as_the_provider() throws Throwable {
		postcodeActions.selectAmazon();
	}

	@Then("^I am validate the delivery availability banner$")
	public void i_am_validate_the_delivery_availability_banner() throws Throwable {
		postcodeActions.checkAvailability();
	}
}
