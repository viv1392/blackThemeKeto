package webPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.UtilitiesClass;

public class Meat extends UtilitiesClass {
	WebDriver driver;
	public  Veggies veggies;

	public Meat(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//h3[text()='I am Vegan']")
	WebElement eleVeg;
	@FindBy(xpath="//h3[text()='I am Vegetarian']")
	WebElement eleVeget;
	@FindBy(xpath="//h3[text()='I eat all']")
	WebElement eleAllMeat;
	@FindBy(xpath="//span[text()='Next ']")
	WebElement eleN;
	
	public Veggies meat(){
		//scroll(driver,0,800);
		scriptExecutor(driver,eleAllMeat);
		//eleAllMeat.click();
		scriptExecutor(driver,eleN);
		//eleN.click();
		veggies=new  Veggies(driver);
		return veggies;
	}
	public Veggies vegetarian() {
		scriptExecutor(driver,eleVeget);
		//eleVeget.click();
		//scroll(driver,0,800);
		scriptExecutor(driver,eleN);
		//eleN.click();
		veggies=new  Veggies(driver);
		return veggies;
	}
	public Veggies vegan() {
		scriptExecutor(driver,eleVeg);
		//eleVeg.click();
		//scroll(driver,0,800);
		scriptExecutor(driver,eleN);
		//eleN.click();
		veggies=new  Veggies(driver);
		return veggies;
	}

}
