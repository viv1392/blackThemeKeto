package webPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.UtilitiesClass;

public class LifestylePreferences extends UtilitiesClass {
	WebDriver driver;
	public DoesAnyOfTheFollowingApplyForYou apply;

	public LifestylePreferences(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
	@FindBy(xpath="//h3[text()='None of the above']")
	WebElement eleNon;
	@FindBy(xpath="//span[text()='Next']")
	WebElement eleN;
	
	public DoesAnyOfTheFollowingApplyForYou nonePref() {
		scroll(driver,0,600);
		eleNon.click();
		eleN.click();
		apply=new DoesAnyOfTheFollowingApplyForYou(driver);
		return apply;
	}

}
