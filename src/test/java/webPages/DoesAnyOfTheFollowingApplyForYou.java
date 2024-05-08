package webPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.UtilitiesClass;

public class DoesAnyOfTheFollowingApplyForYou extends UtilitiesClass {
	WebDriver driver;
	public HowTallAreYou tall;

	public DoesAnyOfTheFollowingApplyForYou(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//h3[text()='None of the above']")
	WebElement eleNone;
	@FindBy(xpath="//h3[text()='Diabetes']")
	WebElement eleD;
	@FindBy(xpath="//h3[text()='High cholesterol']")
	WebElement eleHC;
	@FindBy(xpath="//h3[text()='Thyroid issues']")
	WebElement eleTi;
	@FindBy(xpath="//span[text()='Next']")
	WebElement eleN;
	
	public HowTallAreYou diseaseApplicable() {
		scroll(driver,0,800);
		eleNone.click();
		eleN.click();
		tall=new HowTallAreYou(driver);
		return tall;
	
	}
	public HowTallAreYou diseseas() {
		eleD.click();
		eleHC.click();
		scroll(driver,0,800);
		eleTi.click();
		eleN.click();
		tall=new HowTallAreYou(driver);
		return tall;
	}

}
