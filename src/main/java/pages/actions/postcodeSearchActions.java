package pages.actions;

import org.openqa.selenium.support.PageFactory;

import pages.locator.AmazonPostCodePageLocators;
import utilities.SeleniumDriver;

public class postcodeSearchActions {

	AmazonPostCodePageLocators AmazonPostCodePageLocators = null;
	
	public postcodeSearchActions() {
		
		this.AmazonPostCodePageLocators = new AmazonPostCodePageLocators();
		PageFactory.initElements(SeleniumDriver.getDriver(), AmazonPostCodePageLocators);
	}
	
	public void typePostCode(String postcode) {
		AmazonPostCodePageLocators.postCode.sendKeys(postcode);
		AmazonPostCodePageLocators.shopNow.click();
	}
	
	public void selectAmazon() throws Exception {
		Thread.sleep(9000);
		AmazonPostCodePageLocators.amazon.click();
	}
	
	public void checkAvailability() {

		if(AmazonPostCodePageLocators.deliveryBanner.isDisplayed()) {
			System.out.println("Delivery Options Available");
		}else {
			System.out.println("Delivery Currently Unvailable");
		}
	}
}
