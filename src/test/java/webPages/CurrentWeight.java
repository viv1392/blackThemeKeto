package webPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CurrentWeight {
	WebDriver driver;
	public TargetWeight trrWlb;

	public CurrentWeight(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(id="weight_lb")
	WebElement eleWlb;
	@FindBy(xpath="//span[text()='Next']")
	WebElement eleN;
	
	public TargetWeight currentWeightLb(String lb) {
		eleWlb.sendKeys(lb);
		eleN.click();
		trrWlb=new TargetWeight(driver);
		return trrWlb;
	}
}
