package webPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HowYouSpendYourDay {
	WebDriver driver;
	public LifestylePreferences prefernces;

	public HowYouSpendYourDay(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//h3[text()='At workplace']")
	WebElement eleWorkPlace;
	
	public LifestylePreferences atWorkPlac() {
		eleWorkPlace.click();
		prefernces=new LifestylePreferences (driver);
		return prefernces;
		
	}

}
