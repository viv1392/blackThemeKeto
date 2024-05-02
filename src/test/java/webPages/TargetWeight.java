package webPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TargetWeight {
	WebDriver driver;
	public Age age;

	public TargetWeight(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(id="target_lb")
	WebElement eleWlb;
	@FindBy(id="target_kg")
	WebElement elekg;
	@FindBy(xpath="//span[text()='Next']")
	WebElement eleN;
	
	public Age targetWlb(String lb) {
		eleWlb.sendKeys(lb);
		eleN.click();
		age =new Age(driver);
		return age;
	}
	public Age targetkg(String kg) {
		elekg.sendKeys(kg);
		eleN.click();
		age =new Age(driver);
		return age;
	}

}
