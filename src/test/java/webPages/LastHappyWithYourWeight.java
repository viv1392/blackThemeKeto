package webPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LastHappyWithYourWeight {
	WebDriver driver;
	public MealPreparationTime mealTime;

	public LastHappyWithYourWeight(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	
	}
	@FindBy(xpath="//h3[text()='Less than a year ago']")
	WebElement eleOne;
	@FindBy(xpath="//h3[text()='1 to 2 years ago']")
	WebElement eleTwo;
	@FindBy(xpath="//h3[text()='More than 4 years ago']")
	WebElement eleFour;
	@FindBy(xpath="//h3[text()='Never']")
	WebElement eleN;
	
	public MealPreparationTime lessThanAYear() {
		eleOne.click();
		mealTime=new MealPreparationTime (driver);
		return mealTime;
	}
	public MealPreparationTime lessThanTwoYear() {
		eleTwo.click();
		mealTime=new MealPreparationTime (driver);
		return mealTime;
	}
	public MealPreparationTime moreThanFour() {
		eleFour.click();
		mealTime=new MealPreparationTime (driver);
		return mealTime;
		
	}
	public MealPreparationTime never() {
		eleN.click();
		mealTime=new MealPreparationTime (driver);
		return mealTime;
	}

}
