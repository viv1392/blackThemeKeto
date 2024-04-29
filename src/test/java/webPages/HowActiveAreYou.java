package webPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HowActiveAreYou {
	WebDriver driver;
	public HowYouSpendYourDay day;

	public HowActiveAreYou(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//h3[text()='I exercise 1-2 times a week']")
	WebElement eleExe12;
	public HowYouSpendYourDay exerciseOneTwoWeek() {
		eleExe12.click();
		day=new HowYouSpendYourDay(driver);
		return day;
	}

}
