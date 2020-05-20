package pages.locator;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class AmazonPostCodePageLocators {
		
	@FindBy(how = How.XPATH, using = "//*[@id=\"lsPostalCode\"]")
	public WebElement postCode;
	
	@FindBy(how = How.XPATH, using = "//*[@id=\"a-autoid-1\"]/span/input")
	public WebElement shopNow;
	
	@FindBy(how = How.XPATH, using = "//div[@class=\"index__tile-inner__J0K8_\"]")
	public WebElement amazon;
	
	@FindBy(how = How.XPATH, using = "//div[@id='nawMessageBox']/div[contains(.,'Delivery available')]")
	public WebElement deliveryBanner;

	
}
