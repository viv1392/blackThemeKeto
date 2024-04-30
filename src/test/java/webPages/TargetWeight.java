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
	@FindBy(xpath="//span[text()='Next']")
	WebElement eleN;
	
	public Age targetWlb(String lb) {
		eleWlb.sendKeys("180");
		eleN.click();
		age =new Age(driver);
		return age;
	}

}
