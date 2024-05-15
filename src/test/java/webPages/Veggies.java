package webPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.UtilitiesClass;

public class Veggies extends UtilitiesClass {
	WebDriver driver;
	public OtherFoodItems otherFood;

	public Veggies(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//h3[text()='I eat all']")
	WebElement eleAllveggies;
	
	@FindBy(xpath="//h3[text()='Broccoli']")
	WebElement eleB;
	@FindBy(xpath="//h3[text()='Zucchini']")
	WebElement eleZ;
	@FindBy(xpath="//h3[text()='Avocado']")
	WebElement eleA;
	@FindBy(xpath="//h3[text()='Bok-Choy']")
	WebElement eleBC;
	@FindBy(xpath="//span[text()='Next']")
	WebElement eleN;
	
	public OtherFoodItems allVeggies() {
		scriptExecutor(driver,eleAllveggies);
		//eleAllveggies.click();
		//scroll(driver,0,1000);
		scriptExecutor(driver,eleN);
		//eleN.click();
		otherFood=new OtherFoodItems(driver);
		return otherFood;
	}
	public OtherFoodItems customVeggies() {
		scriptExecutor(driver,eleB);
		//eleB.click();
		scriptExecutor(driver,eleZ);
		//eleZ.click();
		//scroll(driver,0,1000);
		scriptExecutor(driver,eleA);
		//eleA.click();
		scriptExecutor(driver,eleBC);
		//eleBC.click();
		scriptExecutor(driver,eleN);
		//eleN.click();
		otherFood=new OtherFoodItems(driver);
		return otherFood;
	}

}
