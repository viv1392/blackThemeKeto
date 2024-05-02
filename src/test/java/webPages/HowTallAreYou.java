package webPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HowTallAreYou {
	WebDriver driver;
	CurrentWeight currWl;

	public HowTallAreYou(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(id="height_cm_id")
	WebElement eleH;
	@FindBy(xpath="//div[text()='Ft']")
	WebElement eleFt;
	@FindBy(id="height_feet_id")
	WebElement eleft;
	@FindBy(id="height_inch_id")
	WebElement elein;
	@FindBy(xpath="//span[text()='Next']")
	WebElement eleN;
	
	public CurrentWeight heightINCm(String Cm) {
		eleH.sendKeys(Cm);
		eleN.click();
		currWl=new CurrentWeight(driver);
		return currWl;
	}
	public CurrentWeight heightINFt() {
		eleFt.click();
		eleft.sendKeys("5");
		elein.sendKeys("09");
		eleN.click();
		currWl=new CurrentWeight(driver);
		return currWl;
	}
}
