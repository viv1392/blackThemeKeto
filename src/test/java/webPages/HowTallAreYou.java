package webPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.UtilitiesClass;

public class HowTallAreYou extends UtilitiesClass {
	WebDriver driver;
	CurrentWeight currWl;

	public HowTallAreYou(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//label[@for='height_cm_id']")
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
		//scroll(driver,0,100);
		eleH.sendKeys(Cm);
		scriptExecutor(driver,eleN);
		//eleN.click();
		currWl=new CurrentWeight(driver);
		return currWl;
	}
	public CurrentWeight heightINFt(String feet,String inch) {
		eleFt.click();
		eleft.sendKeys(feet);
		elein.sendKeys(inch);
		eleN.click();
		currWl=new CurrentWeight(driver);
		return currWl;
	}
}
