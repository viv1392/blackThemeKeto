package webPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TargetZones {
	WebDriver driver;
	public LastHappyWithYourWeight lastHappy;

	public TargetZones(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//h3[text()='Belly']")
	WebElement eleB;
	@FindBy(xpath="//h3[text()='Butt']")
	WebElement eleBU;
	@FindBy(xpath="//h3[text()='Legs']")
	WebElement eleL;
	@FindBy(xpath="//span[text()='Next']")
	WebElement eleN;
	
	public LastHappyWithYourWeight targetZone() {
		eleB.click();
		eleBU.click();
		eleL.click();
		eleN.click();
		lastHappy=new LastHappyWithYourWeight (driver);
				return lastHappy;
	}

}
