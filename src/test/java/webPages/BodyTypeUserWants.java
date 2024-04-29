package webPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BodyTypeUserWants {
	public WebDriver driver;
	public WhatDoYouWantToAchieve achieve;

	public BodyTypeUserWants(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//h3[text()='Fit']")
	WebElement elef;
	@FindBy(xpath="//h3[text()='Cut']")
	WebElement eleC;
	@FindBy(xpath="//h3[text()='Bulk']")
	WebElement eleB;
	
	public WhatDoYouWantToAchieve fit() {
		elef.click();
		achieve=new WhatDoYouWantToAchieve(driver);
		return achieve;
	}
	public WhatDoYouWantToAchieve Cut() {
		eleC.click();
		achieve=new WhatDoYouWantToAchieve(driver);
		return achieve;
	}
	public WhatDoYouWantToAchieve bulk() {
		eleB.click();
		achieve=new WhatDoYouWantToAchieve(driver);
		return achieve;
	}

}
