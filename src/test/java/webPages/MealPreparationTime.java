package webPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MealPreparationTime {
	WebDriver driver;
	public Meat meat;

	public MealPreparationTime(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//h3[text()='Up to 30 minutes']")
	WebElement eleThirty;
	@FindBy(xpath="//h3[text()='Up to 1 hour']")
	WebElement eleOne;
	@FindBy(xpath="//h3[text()='More than 1 hour']")
	WebElement eleMoreThan;
	
	public Meat upTO30Mint() {
		eleThirty.click();
		meat=new Meat(driver);
		return meat;
	}
	public Meat upTOOne() {
		eleOne.click();
		meat=new Meat(driver);
		return meat;
	}
	public Meat moreThanOne() {
		eleMoreThan.click();
		meat=new Meat(driver);
		return meat;
	}

}
