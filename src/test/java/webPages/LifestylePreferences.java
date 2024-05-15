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
	@FindBy(xpath="//h3[text()='I do not get quality sleep']")
	WebElement eleS;
	@FindBy(xpath="//h3[text()='I eat late at night']")
	WebElement eleEL;
	@FindBy(xpath="//h3[text()='I like soft drinks']")
	WebElement eleSD;
	@FindBy(xpath="//span[text()='Next']")
	WebElement eleN;
	
	public DoesAnyOfTheFollowingApplyForYou nonePref() {
		//scroll(driver,0,600);
		scriptExecutor(driver,eleNon);
		//eleNon.click();
		scriptExecutor(driver,eleN);
		//eleN.click();
		apply=new DoesAnyOfTheFollowingApplyForYou(driver);
		return apply;
	}
	public DoesAnyOfTheFollowingApplyForYou lifePref() {
		scriptExecutor(driver,eleS);
		//eleS.click();
		scriptExecutor(driver,eleEL);
		//eleEL.click();
		//scroll(driver,0,600);
		scriptExecutor(driver,eleSD);
		//eleSD.click();
		scriptExecutor(driver,eleN);
		eleN.click();
		apply=new DoesAnyOfTheFollowingApplyForYou(driver);
		return apply;
	}

}
