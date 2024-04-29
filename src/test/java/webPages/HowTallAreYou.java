package webPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HowTallAreYou {
	WebDriver driver;

	public HowTallAreYou(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(id="height_cm_id")
	WebElement eleH;
	@FindBy(xpath="//span[text()='Next']")
	WebElement eleN;
	
	public void heightINCm(String Cm) {
		eleH.sendKeys(Cm);
		eleN.click();
	}
}
