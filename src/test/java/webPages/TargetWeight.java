package webPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.UtilitiesClass;

public class TargetWeight extends UtilitiesClass {
	WebDriver driver;
	public Age age;

	public TargetWeight(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//label[@for='target_lb']")
	WebElement eleWlb;
	@FindBy(xpath="//label[@for='target_kg']")
	WebElement elekg;
	@FindBy(xpath="//span[text()='Next']")
	WebElement eleN;
	
	public Age targetWlb(String lb) {
		//scroll(driver,0,100);
		eleWlb.sendKeys(lb);
		scriptExecutor(driver,eleN);
		//eleN.click();
		age =new Age(driver);
		return age;
	}
	public Age targetkg(String kg) {
		//scroll(driver,0,100);
		elekg.sendKeys(kg);
		scriptExecutor(driver,eleN);
		//eleN.click();
		age =new Age(driver);
		return age;
	}

}
