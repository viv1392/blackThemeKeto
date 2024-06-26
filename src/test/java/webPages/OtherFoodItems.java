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
	@FindBy(xpath="//h3[text()='Egg']")
	WebElement eleE;
	@FindBy(xpath="//h3[text()='Nuts']")
	WebElement eleNU;
	@FindBy(xpath="//h3[text()='Cheese']")
	WebElement eleC;
	@FindBy(xpath="//h3[text()='Coconut']")
	WebElement eleCo;
	@FindBy(xpath="//h3[text()='Olives']")
	WebElement eleO;
	@FindBy(xpath="//span[text()='Next']")
	WebElement eleN;
	
	public HowActiveAreYou allOtherItems() {
		//scroll(driver,0,1000);
		scriptExecutor(driver,eleAllOther);
		//eleAllOther.click();
		scriptExecutor(driver,eleN);
		//eleN.click();
		active=new HowActiveAreYou(driver);
		return active;
	}
	public HowActiveAreYou customOtherFood() {
		//scroll(driver,0,1000);
		scriptExecutor(driver,eleE);
		//eleE.click();
		scriptExecutor(driver,eleNU);
		//eleNU.click();
		scriptExecutor(driver,eleC);
		//eleC.click();
		scriptExecutor(driver,eleN);
		//eleN.click();
		active=new HowActiveAreYou(driver);
		return active;
		
	}
	public HowActiveAreYou veganCustom() {
		scroll(driver,0,1000);
		 eleNU.click();
		 eleCo.click();
		 eleO.click();
		 eleN.click();
		 active=new HowActiveAreYou(driver);
		 return active;
		
	}

}
