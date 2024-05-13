package webPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.UtilitiesClass;

public class CurrentWeight extends UtilitiesClass {
	WebDriver driver;
	public TargetWeight trrWlb;

	public CurrentWeight(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//label[@for='weight_lb']")
	WebElement eleWlb;
	@FindBy(xpath="(//div[text()='kg'])[1]")
	WebElement elekg;
	@FindBy(xpath="//label[@for='weight_kg']")
	WebElement elekgI;
	@FindBy(xpath="//span[text()='Next']")
	WebElement eleN;
	
	public TargetWeight currentWeightLb(String lb) {
		scroll(driver,0,400);
		eleWlb.sendKeys(lb);
		eleN.click();
		trrWlb=new TargetWeight(driver);
		return trrWlb;
	}
	public TargetWeight currentWeightkg(String kg) {
		scroll(driver,0,400);
		elekg.click();
		elekgI.sendKeys(kg);
		eleN.click();
		trrWlb=new TargetWeight(driver);
		return trrWlb;
	}
}
