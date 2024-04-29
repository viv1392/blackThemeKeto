package webPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.UtilitiesClass;

public class OtherFoodItems extends UtilitiesClass {
	WebDriver driver;
	public HowActiveAreYou active;

	public OtherFoodItems(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//h3[text()='I eat all']")
	WebElement eleAllOther;
	@FindBy(xpath="//span[text()='Next']")
	WebElement eleN;
	
	public HowActiveAreYou allOtherItems() {
		scroll(driver,0,1000);
		eleAllOther.click();
		eleN.click();
		active=new HowActiveAreYou(driver);
		return active;
	}

}
